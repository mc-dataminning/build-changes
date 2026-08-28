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

public class avl implements avo, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ave c;
   private final List<avi> d = Lists.newArrayList();
   private final auc e;

   public avl(auc $$0) {
      this.e = $$0;
      this.c = new avh($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(avi $$0) {
      this.d.add($$0);
   }

   public avk a(Executor $$0, Executor $$1, CompletableFuture<bbh> $$2, List<aua> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aua::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new avh(this.e, $$3);
      return avu.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avm> getResource(alr $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avm> a(alr $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alr, avm> b(String $$0, Predicate<alr> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alr, List<avm>> c(String $$0, Predicate<alr> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<aua> b() {
      return this.c.b();
   }
}
