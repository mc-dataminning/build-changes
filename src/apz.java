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

public class apz implements aqc, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aps b;
   private final List<apw> c = Lists.newArrayList();
   private final aor d;

   public apz(aor $$0) {
      this.d = $$0;
      this.b = new apv($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(apw $$0) {
      this.c.add($$0);
   }

   public apy a(Executor $$0, Executor $$1, CompletableFuture<avm> $$2, List<aoq> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aoq::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new apv(this.d, $$3);
      return aqi.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aqa> getResource(ahd $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<aqa> a(ahd $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<ahd, aqa> b(String $$0, Predicate<ahd> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<ahd, List<aqa>> c(String $$0, Predicate<ahd> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aoq> b() {
      return this.b.b();
   }
}
