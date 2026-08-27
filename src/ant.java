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

public class ant implements anw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private anm b;
   private final List<anq> c = Lists.newArrayList();
   private final aml d;

   public ant(aml $$0) {
      this.d = $$0;
      this.b = new anp($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(anq $$0) {
      this.c.add($$0);
   }

   public ans a(Executor $$0, Executor $$1, CompletableFuture<atc> $$2, List<amk> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(amk::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new anp(this.d, $$3);
      return aoc.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<anu> getResource(aez $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<anu> a(aez $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aez, anu> b(String $$0, Predicate<aez> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aez, List<anu>> c(String $$0, Predicate<aez> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<amk> b() {
      return this.b.b();
   }
}
