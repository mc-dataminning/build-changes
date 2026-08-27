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

public class apa implements apd, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aot b;
   private final List<aox> c = Lists.newArrayList();
   private final ans d;

   public apa(ans $$0) {
      this.d = $$0;
      this.b = new aow($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(aox $$0) {
      this.c.add($$0);
   }

   public aoz a(Executor $$0, Executor $$1, CompletableFuture<auj> $$2, List<anr> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(anr::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aow(this.d, $$3);
      return apj.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<apb> getResource(agg $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<apb> a(agg $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<agg, apb> b(String $$0, Predicate<agg> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<agg, List<apb>> c(String $$0, Predicate<agg> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<anr> b() {
      return this.b.b();
   }
}
