import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cup<T>(Optional<jo<T>> a, ald<T> b) {
   public cup(jo<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cup(ald<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cup<T>> a(ald<kb<T>> $$0, Codec<jo<T>> $$1) {
      return Codec.either($$1, ald.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cup::a, cup::a);
   }

   public static <T> zc<wp, cup<T>> a(ald<kb<T>> $$0, zc<wp, jo<T>> $$1) {
      return zc.a(za.a($$1, ald.b($$0)), cup::a, cup::a);
   }

   public Either<jo<T>, ald<T>> a() {
      return this.a.<Either<jo<T>, ald<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cup<T> a(Either<jo<T>, ald<T>> $$0) {
      return (cup<T>)$$0.map(cup::new, cup::new);
   }

   public Optional<T> a(kb<T> $$0) {
      return this.a.<T>map(jo::a).or(() -> $$0.f(this.b));
   }

   public Optional<jo<T>> a(jq.a $$0) {
      return this.a.or(() -> $$0.d(this.b.c()).a(this.b));
   }

   public Optional<jo<T>> b() {
      return this.a;
   }

   public ald<T> c() {
      return this.b;
   }
}
