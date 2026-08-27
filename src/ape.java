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

public class ape implements aph, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aox b;
   private final List<apb> c = Lists.newArrayList();
   private final anw d;

   public ape(anw $$0) {
      this.d = $$0;
      this.b = new apa($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(apb $$0) {
      this.c.add($$0);
   }

   public apd a(Executor $$0, Executor $$1, CompletableFuture<auo> $$2, List<anv> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(anv::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new apa(this.d, $$3);
      return apn.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<apf> getResource(agi $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<apf> a(agi $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<agi, apf> b(String $$0, Predicate<agi> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<agi, List<apf>> c(String $$0, Predicate<agi> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<anv> b() {
      return this.b.b();
   }
}
