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

public class aqg implements aqj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private apz b;
   private final List<aqd> c = Lists.newArrayList();
   private final aoy d;

   public aqg(aoy $$0) {
      this.d = $$0;
      this.b = new aqc($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(aqd $$0) {
      this.c.add($$0);
   }

   public aqf a(Executor $$0, Executor $$1, CompletableFuture<avt> $$2, List<aox> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aox::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aqc(this.d, $$3);
      return aqp.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aqh> getResource(ahh $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<aqh> a(ahh $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<ahh, aqh> b(String $$0, Predicate<ahh> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<ahh, List<aqh>> c(String $$0, Predicate<ahh> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aox> b() {
      return this.b.b();
   }
}
