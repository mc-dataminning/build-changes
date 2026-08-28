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

public class att implements atw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private atm c;
   private final List<atq> d = Lists.newArrayList();
   private final ask e;

   public att(ask $$0) {
      this.e = $$0;
      this.c = new atp($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(atq $$0) {
      this.d.add($$0);
   }

   public ats a(Executor $$0, Executor $$1, CompletableFuture<azk> $$2, List<asi> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asi::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atp(this.e, $$3);
      return auc.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<atu> getResource(akk $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<atu> a(akk $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akk, atu> b(String $$0, Predicate<akk> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akk, List<atu>> c(String $$0, Predicate<akk> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asi> b() {
      return this.c.b();
   }
}
