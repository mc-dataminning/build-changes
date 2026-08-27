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

public class atu implements atx, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private atn c;
   private final List<atr> d = Lists.newArrayList();
   private final asl e;

   public atu(asl $$0) {
      this.e = $$0;
      this.c = new atq($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(atr $$0) {
      this.d.add($$0);
   }

   public att a(Executor $$0, Executor $$1, CompletableFuture<azh> $$2, List<asj> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asj::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atq(this.e, $$3);
      return aud.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<atv> getResource(akn $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<atv> a(akn $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akn, atv> b(String $$0, Predicate<akn> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akn, List<atv>> c(String $$0, Predicate<akn> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asj> b() {
      return this.c.b();
   }
}
