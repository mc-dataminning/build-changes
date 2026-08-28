import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record ern<T>(akp<jz<T>> d, Codec<T> e, ern.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final ern<euw> a = new ern<>(lu.be, euw.e, e());
   public static final ern<esz> b = new ern<>(lu.bd, etb.c, e());
   public static final ern<erq> c = new ern<>(lu.bc, erq.d, f());

   public void a(err $$0, akp<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akq $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<ern<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends erm> ern.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ern.a<erq> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akp<jz<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ern.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(err var1, akp<T> var2, T var3);
   }
}
