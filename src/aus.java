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

public class aus implements auv, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aul c;
   private final List<aup> d = Lists.newArrayList();
   private final atj e;

   public aus(atj $$0) {
      this.e = $$0;
      this.c = new auo($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aup $$0) {
      this.d.add($$0);
   }

   public aur a(Executor $$0, Executor $$1, CompletableFuture<bak> $$2, List<ath> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ath::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new auo(this.e, $$3);
      return avc.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aut> getResource(ale $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<aut> a(ale $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ale, aut> b(String $$0, Predicate<ale> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ale, List<aut>> c(String $$0, Predicate<ale> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<ath> b() {
      return this.c.b();
   }
}
