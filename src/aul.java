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

public class aul implements auo, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private aue c;
   private final List<aui> d = Lists.newArrayList();
   private final atc e;

   public aul(atc $$0) {
      this.e = $$0;
      this.c = new auh($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(aui $$0) {
      this.d.add($$0);
   }

   public auk a(Executor $$0, Executor $$1, CompletableFuture<bab> $$2, List<ata> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(ata::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new auh(this.e, $$3);
      return auu.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<aum> getResource(ale $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<aum> a(ale $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ale, aum> b(String $$0, Predicate<ale> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ale, List<aum>> c(String $$0, Predicate<ale> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<ata> b() {
      return this.c.b();
   }
}
