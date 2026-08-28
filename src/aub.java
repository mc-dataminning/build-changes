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

public class aub implements aue, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private atu c;
   private final List<aty> d = Lists.newArrayList();
   private final ass e;

   public aub(ass $$0) {
      this.e = $$0;
      this.c = new atx($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aty $$0) {
      this.d.add($$0);
   }

   public aua a(Executor $$0, Executor $$1, CompletableFuture<azs> $$2, List<asq> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asq::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atx(this.e, $$3);
      return auk.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<auc> getResource(akr $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<auc> a(akr $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akr, auc> b(String $$0, Predicate<akr> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akr, List<auc>> c(String $$0, Predicate<akr> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asq> b() {
      return this.c.b();
   }
}
