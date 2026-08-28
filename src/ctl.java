import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record ctl<T>(Optional<jm<T>> a, akq<T> b) {
   public ctl(jm<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public ctl(akq<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<ctl<T>> a(akq<jz<T>> $$0, Codec<jm<T>> $$1) {
      return Codec.either($$1, akq.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(ctl::a, ctl::a);
   }

   public static <T> yx<wk, ctl<T>> a(akq<jz<T>> $$0, yx<wk, jm<T>> $$1) {
      return yx.a(yv.a($$1, akq.b($$0)), ctl::a, ctl::a);
   }

   public Either<jm<T>, akq<T>> a() {
      return this.a.<Either<jm<T>, akq<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> ctl<T> a(Either<jm<T>, akq<T>> $$0) {
      return (ctl<T>)$$0.map(ctl::new, ctl::new);
   }

   public Optional<T> a(jz<T> $$0) {
      return this.a.<T>map(jm::a).or(() -> $$0.e(this.b));
   }

   public Optional<jm<T>> a(jo.a $$0) {
      return this.a.or(() -> $$0.b(this.b.c()).a(this.b));
   }

   public Optional<jm<T>> b() {
      return this.a;
   }

   public akq<T> c() {
      return this.b;
   }
}
