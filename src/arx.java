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

public class arx implements asa, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private arq b;
   private final List<aru> c = Lists.newArrayList();
   private final aqp d;

   public arx(aqp $$0) {
      this.d = $$0;
      this.b = new art($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(aru $$0) {
      this.c.add($$0);
   }

   public arw a(Executor $$0, Executor $$1, CompletableFuture<axk> $$2, List<aqo> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aqo::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new art(this.d, $$3);
      return asg.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ary> getResource(aiy $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ary> a(aiy $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aiy, ary> b(String $$0, Predicate<aiy> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aiy, List<ary>> c(String $$0, Predicate<aiy> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aqo> b() {
      return this.b.b();
   }
}
