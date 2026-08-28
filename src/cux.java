import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cux<T>(Optional<jp<T>> a, alg<T> b) {
   public cux(jp<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cux(alg<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cux<T>> a(alg<kc<T>> $$0, Codec<jp<T>> $$1) {
      return Codec.either($$1, alg.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cux::a, cux::a);
   }

   public static <T> zf<ws, cux<T>> a(alg<kc<T>> $$0, zf<ws, jp<T>> $$1) {
      return zf.a(zd.a($$1, alg.b($$0)), cux::a, cux::a);
   }

   public Either<jp<T>, alg<T>> a() {
      return this.a.<Either<jp<T>, alg<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cux<T> a(Either<jp<T>, alg<T>> $$0) {
      return (cux<T>)$$0.map(cux::new, cux::new);
   }

   public Optional<T> a(kc<T> $$0) {
      return this.a.<T>map(jp::a).or(() -> $$0.f(this.b));
   }

   public Optional<jp<T>> a(jr.a $$0) {
      return this.a.or(() -> $$0.d(this.b.c()).a(this.b));
   }

   public Optional<jp<T>> b() {
      return this.a;
   }

   public alg<T> c() {
      return this.b;
   }
}
