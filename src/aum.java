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

public class aum implements aup, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private auf c;
   private final List<auj> d = Lists.newArrayList();
   private final ate e;

   public aum(ate $$0) {
      this.e = $$0;
      this.c = new aui($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auj $$0) {
      this.d.add($$0);
   }

   public aul a(Executor $$0, Executor $$1, CompletableFuture<baf> $$2, List<atc> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atc::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aui(this.e, $$3);
      return auv.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aun> getResource(aku $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<aun> a(aku $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<aku, aun> b(String $$0, Predicate<aku> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<aku, List<aun>> c(String $$0, Predicate<aku> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atc> b() {
      return this.c.b();
   }
}
