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

public class avs implements avv, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private avl c;
   private final List<avp> d = Lists.newArrayList();
   private final aui e;

   public avs(aui $$0) {
      this.e = $$0;
      this.c = new avo($$0, List.of());
   }

   @Override
   public void close() {
      this.c.close();
   }

   public void a(avp $$0) {
      this.d.add($$0);
   }

   public avr a(Executor $$0, Executor $$1, CompletableFuture<bbk> $$2, List<aug> $$3) {
      a.info("Reloading ResourceManager: {}", LogUtils.defer(() -> $$3.stream().map(aug::b).collect(Collectors.joining(", "))));
      this.c.close();
      this.c = new avo(this.e, $$3);
      return awb.a(this.c, this.d, $$0, $$1, $$2, a.isDebugEnabled());
   }

   @Override
   public Optional<avt> getResource(alz $$0) {
      return this.c.getResource($$0);
   }

   @Override
   public Set<String> a() {
      return this.c.a();
   }

   @Override
   public List<avt> a(alz $$0) {
      return this.c.a($$0);
   }

   @Override
   public Map<alz, avt> b(String $$0, Predicate<alz> $$1) {
      return this.c.b($$0, $$1);
   }

   @Override
   public Map<alz, List<avt>> c(String $$0, Predicate<alz> $$1) {
      return this.c.c($$0, $$1);
   }

   @Override
   public Stream<aug> b() {
      return this.c.b();
   }
}
