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

public class avi implements avl, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private avb c;
   private final List<avf> d = Lists.newArrayList();
   private final aty e;

   public avi(aty $$0) {
      this.e = $$0;
      this.c = new ave($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(avf $$0) {
      this.d.add($$0);
   }

   public avh a(Executor $$0, Executor $$1, CompletableFuture<bba> $$2, List<atw> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atw::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new ave(this.e, $$3);
      return avr.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avj> getResource(alp $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avj> a(alp $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alp, avj> b(String $$0, Predicate<alp> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alp, List<avj>> c(String $$0, Predicate<alp> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atw> b() {
      return this.c.b();
   }
}
