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

public class asc implements asf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private arv b;
   private final List<arz> c = Lists.newArrayList();
   private final aqu d;

   public asc(aqu $$0) {
      this.d = $$0;
      this.b = new ary($$0, List.of());
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void a(arz $$0) {
      this.c.add($$0);
   }

   public asb a(Executor $$0, Executor $$1, CompletableFuture<axo> $$2, List<aqt> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aqt::a).collect(Collectors.joining(", "))));
      this.b.close();
      this.b = new ary(this.d, $$3);
      return asl.a(this.b, this.c, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<asd> getResource(ajc $$0) {
      return this.b.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.b.a();
   }

   @Override
   public List<asd> a(ajc $$0) {
      return this.b.a($$0);
   }

   @Override
   public Map<ajc, asd> b(String $$0, Predicate<ajc> $$1) {
      return this.b.b($$0, $$1);
   }

   @Override
   public Map<ajc, List<asd>> c(String $$0, Predicate<ajc> $$1) {
      return this.b.c($$0, $$1);
   }

   @Override
   public Stream<aqt> b() {
      return this.b.b();
   }
}
