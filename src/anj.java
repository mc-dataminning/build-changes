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

public class anj implements anm, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private anc b;
   private final List<ang> c = Lists.newArrayList();
   private final amb d;

   public anj(amb $$0) {
      this.d = $$0;
      this.b = new anf($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(ang $$0) {
      this.c.add($$0);
   }

   public ani a(Executor $$0, Executor $$1, CompletableFuture<asp> $$2, List<ama> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ama::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new anf(this.d, $$3);
      return ans.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ank> getResource(aer $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ank> a(aer $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aer, ank> b(String $$0, Predicate<aer> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aer, List<ank>> c(String $$0, Predicate<aer> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<ama> b() {
      return this.b.b();
   }
}
