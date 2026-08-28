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

public class aua implements aud, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private att c;
   private final List<atx> d = Lists.newArrayList();
   private final asr e;

   public aua(asr $$0) {
      this.e = $$0;
      this.c = new atw($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(atx $$0) {
      this.d.add($$0);
   }

   public atz a(Executor $$0, Executor $$1, CompletableFuture<azr> $$2, List<asp> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asp::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atw(this.e, $$3);
      return auj.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aub> getResource(akq $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<aub> a(akq $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akq, aub> b(String $$0, Predicate<akq> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akq, List<aub>> c(String $$0, Predicate<akq> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asp> b() {
      return this.c.b();
   }
}
