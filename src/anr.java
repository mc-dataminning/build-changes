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

public class anr implements anu, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ank b;
   private final List<ano> c = Lists.newArrayList();
   private final amj d;

   public anr(amj $$0) {
      this.d = $$0;
      this.b = new ann($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(ano $$0) {
      this.c.add($$0);
   }

   public anq a(Executor $$0, Executor $$1, CompletableFuture<asx> $$2, List<ami> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ami::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new ann(this.d, $$3);
      return aoa.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ans> getResource(aex $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<ans> a(aex $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<aex, ans> b(String $$0, Predicate<aex> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<aex, List<ans>> c(String $$0, Predicate<aex> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<ami> b() {
      return this.b.b();
   }
}
