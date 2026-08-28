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

public class avb implements ave, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aut c;
   private final List<auy> d = Lists.newArrayList();
   private final atr e;

   public avb(atr $$0) {
      this.e = $$0;
      this.c = new auw($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auy $$0) {
      this.d.add($$0);
   }

   public ava a(Executor $$0, Executor $$1, CompletableFuture<bat> $$2, List<atp> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atp::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new auw(this.e, $$3);
      return avk.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avc> getResource(all $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avc> a(all $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<all, avc> b(String $$0, Predicate<all> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<all, List<avc>> c(String $$0, Predicate<all> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atp> b() {
      return this.c.b();
   }
}
