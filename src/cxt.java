import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cxt<T>(Optional<je<T>> a, ald<T> b) {
   public cxt(je<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cxt(ald<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cxt<T>> a(ald<jr<T>> $$0, Codec<je<T>> $$1) {
      return Codec.either($$1, ald.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cxt::a, cxt::a);
   }

   public static <T> yu<wh, cxt<T>> a(ald<jr<T>> $$0, yu<wh, je<T>> $$1) {
      return yu.a(ys.a($$1, ald.b($$0)), cxt::a, cxt::a);
   }

   public Either<je<T>, ald<T>> a() {
      return this.a.<Either<je<T>, ald<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cxt<T> a(Either<je<T>, ald<T>> $$0) {
      return (cxt<T>)$$0.map(cxt::new, cxt::new);
   }

   public Optional<T> a(jr<T> $$0) {
      return this.a.<T>map(je::a).or(() -> $$0.f(this.b));
   }

   public Optional<je<T>> a(jg.a $$0) {
      return this.a.or(() -> $$0.e(this.b.c()).a(this.b));
   }

   public Optional<je<T>> b() {
      return this.a;
   }

   public ald<T> c() {
      return this.b;
   }
}
