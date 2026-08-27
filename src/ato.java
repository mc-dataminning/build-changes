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

public class ato implements atr, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private ath c;
   private final List<atl> d = Lists.newArrayList();
   private final asf e;

   public ato(asf $$0) {
      this.e = $$0;
      this.c = new atk($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(atl $$0) {
      this.d.add($$0);
   }

   public atn a(Executor $$0, Executor $$1, CompletableFuture<azb> $$2, List<asd> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(asd::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new atk(this.e, $$3);
      return atx.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<atp> getResource(akh $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<atp> a(akh $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<akh, atp> b(String $$0, Predicate<akh> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<akh, List<atp>> c(String $$0, Predicate<akh> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<asd> b() {
      return this.c.b();
   }
}
