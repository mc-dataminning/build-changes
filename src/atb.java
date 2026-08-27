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

public class atb implements ate, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private asu c;
   private final List<asy> d = Lists.newArrayList();
   private final ars e;

   public atb(ars $$0) {
      this.e = $$0;
      this.c = new asx($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(asy $$0) {
      this.d.add($$0);
   }

   public ata a(Executor $$0, Executor $$1, CompletableFuture<ayo> $$2, List<arq> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(arq::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new asx(this.e, $$3);
      return atk.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<atc> getResource(ajv $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<atc> a(ajv $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<ajv, atc> b(String $$0, Predicate<ajv> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<ajv, List<atc>> c(String $$0, Predicate<ajv> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<arq> b() {
      return this.c.b();
   }
}
