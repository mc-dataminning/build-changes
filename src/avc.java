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

public class avc implements avf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private auu c;
   private final List<auz> d = Lists.newArrayList();
   private final att e;

   public avc(att $$0) {
      this.e = $$0;
      this.c = new auy($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(auz $$0) {
      this.d.add($$0);
   }

   public avb a(Executor $$0, Executor $$1, CompletableFuture<baw> $$2, List<atr> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(atr::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new auy(this.e, $$3);
      return avl.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avd> getResource(ali $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avd> a(ali $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ali, avd> b(String $$0, Predicate<ali> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ali, List<avd>> c(String $$0, Predicate<ali> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<atr> b() {
      return this.c.b();
   }
}
