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

public class ans implements anv, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private anl b;
   private final List<anp> c = Lists.newArrayList();
   private final amk d;

   public ans(amk $$0) {
      this.d = $$0;
      this.b = new ano($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(anp $$0) {
      this.c.add($$0);
   }

   public anr a(Executor $$0, Executor $$1, CompletableFuture<asz> $$2, List<amj> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(amj::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new ano(this.d, $$3);
      return aob.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ant> getResource(aey $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ant> a(aey $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aey, ant> b(String $$0, Predicate<aey> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aey, List<ant>> c(String $$0, Predicate<aey> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<amj> b() {
      return this.b.b();
   }
}
