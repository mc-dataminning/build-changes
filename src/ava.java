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

public class ava implements avd, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aus c;
   private final List<auw> d = Lists.newArrayList();
   private final atr e;

   public ava(atr $$0) {
      this.e = $$0;
      this.c = new auv($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auw $$0) {
      this.d.add($$0);
   }

   public auz a(Executor $$0, Executor $$1, CompletableFuture<bau> $$2, List<atp> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atp::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new auv(this.e, $$3);
      return avj.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avb> getResource(alg $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avb> a(alg $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alg, avb> b(String $$0, Predicate<alg> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alg, List<avb>> c(String $$0, Predicate<alg> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atp> b() {
      return this.c.b();
   }
}
