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

public class auy implements avb, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private auq c;
   private final List<auu> d = Lists.newArrayList();
   private final ato e;

   public auy(ato $$0) {
      this.e = $$0;
      this.c = new aut($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auu $$0) {
      this.d.add($$0);
   }

   public auw a(Executor $$0, Executor $$1, CompletableFuture<bap> $$2, List<atm> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atm::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aut(this.e, $$3);
      return avh.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<auz> getResource(ali $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<auz> a(ali $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ali, auz> b(String $$0, Predicate<ali> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ali, List<auz>> c(String $$0, Predicate<ali> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atm> b() {
      return this.c.b();
   }
}
