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

public class anh implements ank, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ana b;
   private final List<ane> c = Lists.newArrayList();
   private final alz d;

   public anh(alz $$0) {
      this.d = $$0;
      this.b = new and($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(ane $$0) {
      this.c.add($$0);
   }

   public ang a(Executor $$0, Executor $$1, CompletableFuture<asn> $$2, List<aly> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aly::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new and(this.d, $$3);
      return anq.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ani> getResource(aep $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ani> a(aep $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aep, ani> b(String $$0, Predicate<aep> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aep, List<ani>> c(String $$0, Predicate<aep> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aly> b() {
      return this.b.b();
   }
}
