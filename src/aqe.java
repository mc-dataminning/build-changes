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

public class aqe implements aqh, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private apx b;
   private final List<aqb> c = Lists.newArrayList();
   private final aow d;

   public aqe(aow $$0) {
      this.d = $$0;
      this.b = new aqa($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(aqb $$0) {
      this.c.add($$0);
   }

   public aqd a(Executor $$0, Executor $$1, CompletableFuture<avr> $$2, List<aov> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aov::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aqa(this.d, $$3);
      return aqn.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aqf> getResource(ahg $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<aqf> a(ahg $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<ahg, aqf> b(String $$0, Predicate<ahg> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<ahg, List<aqf>> c(String $$0, Predicate<ahg> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aov> b() {
      return this.b.b();
   }
}
