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

public class auw implements ava, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aup c;
   private final List<aut> d = Lists.newArrayList();
   private final ato e;

   public auw(ato $$0) {
      this.e = $$0;
      this.c = new aus($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aut $$0) {
      this.d.add($$0);
   }

   public auv a(Executor $$0, Executor $$1, CompletableFuture<baq> $$2, List<atm> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atm::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aus(this.e, $$3);
      return avg.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<auy> getResource(ald $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<auy> a(ald $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ald, auy> b(String $$0, Predicate<ald> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ald, List<auy>> c(String $$0, Predicate<ald> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atm> b() {
      return this.c.b();
   }
}
