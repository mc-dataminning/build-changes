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

public class aup implements aus, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aui c;
   private final List<aum> d = Lists.newArrayList();
   private final atg e;

   public aup(atg $$0) {
      this.e = $$0;
      this.c = new aul($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aum $$0) {
      this.d.add($$0);
   }

   public auo a(Executor $$0, Executor $$1, CompletableFuture<bah> $$2, List<ate> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ate::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aul(this.e, $$3);
      return auz.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<auq> getResource(alb $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<auq> a(alb $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alb, auq> b(String $$0, Predicate<alb> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alb, List<auq>> c(String $$0, Predicate<alb> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<ate> b() {
      return this.c.b();
   }
}
