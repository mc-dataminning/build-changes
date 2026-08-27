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

public class ary implements asb, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private arr b;
   private final List<arv> c = Lists.newArrayList();
   private final aqq d;

   public ary(aqq $$0) {
      this.d = $$0;
      this.b = new aru($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(arv $$0) {
      this.c.add($$0);
   }

   public arx a(Executor $$0, Executor $$1, CompletableFuture<axk> $$2, List<aqp> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aqp::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aru(this.d, $$3);
      return ash.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<arz> getResource(aiy $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<arz> a(aiy $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aiy, arz> b(String $$0, Predicate<aiy> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aiy, List<arz>> c(String $$0, Predicate<aiy> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aqp> b() {
      return this.b.b();
   }
}
