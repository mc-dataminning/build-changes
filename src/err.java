import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record err<T>(akq<jz<T>> d, Codec<T> e, err.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final err<eva> a = new err<>(lu.be, eva.e, e());
   public static final err<etd> b = new err<>(lu.bd, etf.c, e());
   public static final err<eru> c = new err<>(lu.bc, eru.d, f());

   public void a(erv $$0, akq<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akr $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<err<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends erq> err.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static err.a<eru> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akq<jz<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public err.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(erv var1, akq<T> var2, T var3);
   }
}
