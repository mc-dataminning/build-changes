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

public class auq implements aut, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private auj c;
   private final List<aun> d = Lists.newArrayList();
   private final ath e;

   public auq(ath $$0) {
      this.e = $$0;
      this.c = new aum($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aun $$0) {
      this.d.add($$0);
   }

   public aup a(Executor $$0, Executor $$1, CompletableFuture<bai> $$2, List<atf> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atf::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new aum(this.e, $$3);
      return ava.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aur> getResource(alc $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<aur> a(alc $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alc, aur> b(String $$0, Predicate<alc> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alc, List<aur>> c(String $$0, Predicate<alc> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atf> b() {
      return this.c.b();
   }
}
