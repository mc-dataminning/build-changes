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

public class anq implements ant, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private anj b;
   private final List<ann> c = Lists.newArrayList();
   private final ami d;

   public anq(ami $$0) {
      this.d = $$0;
      this.b = new anm($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(ann $$0) {
      this.c.add($$0);
   }

   public anp a(Executor $$0, Executor $$1, CompletableFuture<asx> $$2, List<amh> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(amh::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new anm(this.d, $$3);
      return anz.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<anr> getResource(aew $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<anr> a(aew $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aew, anr> b(String $$0, Predicate<aew> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aew, List<anr>> c(String $$0, Predicate<aew> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<amh> b() {
      return this.b.b();
   }
}
