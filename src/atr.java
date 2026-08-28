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

public class atr implements atu, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private atk c;
   private final List<ato> d = Lists.newArrayList();
   private final asi e;

   public atr(asi $$0) {
      this.e = $$0;
      this.c = new atn($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(ato $$0) {
      this.d.add($$0);
   }

   public atq a(Executor $$0, Executor $$1, CompletableFuture<azh> $$2, List<asg> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asg::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atn(this.e, $$3);
      return aua.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<ats> getResource(akk $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<ats> a(akk $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akk, ats> b(String $$0, Predicate<akk> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akk, List<ats>> c(String $$0, Predicate<akk> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asg> b() {
      return this.c.b();
   }
}
