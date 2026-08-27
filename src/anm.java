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

public class anm implements anp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private anf b;
   private final List<anj> c = Lists.newArrayList();
   private final ame d;

   public anm(ame $$0) {
      this.d = $$0;
      this.b = new ani($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(anj $$0) {
      this.c.add($$0);
   }

   public anl a(Executor $$0, Executor $$1, CompletableFuture<ass> $$2, List<amd> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(amd::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new ani(this.d, $$3);
      return anv.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ann> getResource(aeu $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ann> a(aeu $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aeu, ann> b(String $$0, Predicate<aeu> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aeu, List<ann>> c(String $$0, Predicate<aeu> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<amd> b() {
      return this.b.b();
   }
}
