import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class api implements apl, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private apb b;
   private final List<apf> c = Lists.newArrayList();
   private final aoa d;

   public api(aoa $$0) {
      this.d = $$0;
      this.b = new ape($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(apf $$0) {
      this.c.add($$0);
   }

   public aph a(Executor $$0, Executor $$1, CompletableFuture<aus> $$2, List<anz> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(anz::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new ape(this.d, $$3);
      return apr.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<apj> getResource(agm $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<apj> a(agm $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<agm, apj> b(String $$0, Predicate<agm> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<agm, List<apj>> c(String $$0, Predicate<agm> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<anz> b() {
      return this.b.b();
   }
}
