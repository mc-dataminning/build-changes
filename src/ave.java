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

public class ave implements avh, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private auw c;
   private final List<avb> d = Lists.newArrayList();
   private final atv e;

   public ave(atv $$0) {
      this.e = $$0;
      this.c = new ava($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(avb $$0) {
      this.d.add($$0);
   }

   public avd a(Executor $$0, Executor $$1, CompletableFuture<bay> $$2, List<att> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(att::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new ava(this.e, $$3);
      return avn.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avf> getResource(alk $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avf> a(alk $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alk, avf> b(String $$0, Predicate<alk> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alk, List<avf>> c(String $$0, Predicate<alk> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<att> b() {
      return this.c.b();
   }
}
