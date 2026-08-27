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

public class app implements aps, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private api b;
   private final List<apm> c = Lists.newArrayList();
   private final aoh d;

   public app(aoh $$0) {
      this.d = $$0;
      this.b = new apl($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(apm $$0) {
      this.c.add($$0);
   }

   public apo a(Executor $$0, Executor $$1, CompletableFuture<avc> $$2, List<aog> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aog::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new apl(this.d, $$3);
      return apy.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<apq> getResource(agt $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<apq> a(agt $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<agt, apq> b(String $$0, Predicate<agt> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<agt, List<apq>> c(String $$0, Predicate<agt> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aog> b() {
      return this.b.b();
   }
}
