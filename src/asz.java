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

public class asz implements atc, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ass c;
   private final List<asw> d = Lists.newArrayList();
   private final arq e;

   public asz(arq $$0) {
      this.e = $$0;
      this.c = new asv($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(asw $$0) {
      this.d.add($$0);
   }

   public asy a(Executor $$0, Executor $$1, CompletableFuture<aym> $$2, List<aro> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aro::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new asv(this.e, $$3);
      return ati.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ata> getResource(ajt $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<ata> a(ajt $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ajt, ata> b(String $$0, Predicate<ajt> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ajt, List<ata>> c(String $$0, Predicate<ajt> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<aro> b() {
      return this.c.b();
   }
}
