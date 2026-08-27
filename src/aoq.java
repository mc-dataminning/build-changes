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

public class aoq implements aot, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aoj b;
   private final List<aon> c = Lists.newArrayList();
   private final ani d;

   public aoq(ani $$0) {
      this.d = $$0;
      this.b = new aom($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(aon $$0) {
      this.c.add($$0);
   }

   public aop a(Executor $$0, Executor $$1, CompletableFuture<atz> $$2, List<anh> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(anh::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new aom(this.d, $$3);
      return aoz.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aor> getResource(afw $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<aor> a(afw $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<afw, aor> b(String $$0, Predicate<afw> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<afw, List<aor>> c(String $$0, Predicate<afw> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<anh> b() {
      return this.b.b();
   }
}
