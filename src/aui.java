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

public class aui implements aul, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aub c;
   private final List<auf> d = Lists.newArrayList();
   private final asz e;

   public aui(asz $$0) {
      this.e = $$0;
      this.c = new aue($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auf $$0) {
      this.d.add($$0);
   }

   public auh a(Executor $$0, Executor $$1, CompletableFuture<azx> $$2, List<asx> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asx::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aue(this.e, $$3);
      return aur.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<auj> getResource(alb $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<auj> a(alb $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alb, auj> b(String $$0, Predicate<alb> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alb, List<auj>> c(String $$0, Predicate<alb> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asx> b() {
      return this.c.b();
   }
}
