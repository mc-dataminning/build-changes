import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cwy<T>(Optional<js<T>> a, alc<T> b) {
   public cwy(js<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cwy(alc<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cwy<T>> a(alc<kf<T>> $$0, Codec<js<T>> $$1) {
      return Codec.either($$1, alc.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cwy::a, cwy::a);
   }

   public static <T> yt<wg, cwy<T>> a(alc<kf<T>> $$0, yt<wg, js<T>> $$1) {
      return yt.a(yr.a($$1, alc.b($$0)), cwy::a, cwy::a);
   }

   public Either<js<T>, alc<T>> a() {
      return this.a.<Either<js<T>, alc<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cwy<T> a(Either<js<T>, alc<T>> $$0) {
      return (cwy<T>)$$0.map(cwy::new, cwy::new);
   }

   public Optional<T> a(kf<T> $$0) {
      return this.a.<T>map(js::a).or(() -> $$0.f(this.b));
   }

   public Optional<js<T>> a(ju.a $$0) {
      return this.a.or(() -> $$0.e(this.b.c()).a(this.b));
   }

   public Optional<js<T>> b() {
      return this.a;
   }

   public alc<T> c() {
      return this.b;
   }
}
