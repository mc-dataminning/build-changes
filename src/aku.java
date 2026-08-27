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

public class aku implements akx, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private akn b;
   private final List<akr> c = Lists.newArrayList();
   private final ajm d;

   public aku(ajm $$0) {
      this.d = $$0;
      this.b = new akq($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(akr $$0) {
      this.c.add($$0);
   }

   public akt a(Executor $$0, Executor $$1, CompletableFuture<apz> $$2, List<ajl> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ajl::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new akq(this.d, $$3);
      return ald.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<akv> getResource(acq $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<akv> a(acq $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<ajl> b() {
      return this.b.b();
   }
}
