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

public class asl implements aso, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ase c;
   private final List<asi> d = Lists.newArrayList();
   private final arc e;

   public asl(arc $$0) {
      this.e = $$0;
      this.c = new ash($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(asi $$0) {
      this.d.add($$0);
   }

   public ask a(Executor $$0, Executor $$1, CompletableFuture<axy> $$2, List<ara> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ara::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new ash(this.e, $$3);
      return asu.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<asm> getResource(ajh $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<asm> a(ajh $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ajh, asm> b(String $$0, Predicate<ajh> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ajh, List<asm>> c(String $$0, Predicate<ajh> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<ara> b() {
      return this.c.b();
   }
}
