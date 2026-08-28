import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cwh<T>(Optional<jr<T>> a, akt<T> b) {
   public cwh(jr<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cwh(akt<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cwh<T>> a(akt<ke<T>> $$0, Codec<jr<T>> $$1) {
      return Codec.either($$1, akt.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cwh::a, cwh::a);
   }

   public static <T> yn<wa, cwh<T>> a(akt<ke<T>> $$0, yn<wa, jr<T>> $$1) {
      return yn.a(yl.a($$1, akt.b($$0)), cwh::a, cwh::a);
   }

   public Either<jr<T>, akt<T>> a() {
      return this.a.<Either<jr<T>, akt<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cwh<T> a(Either<jr<T>, akt<T>> $$0) {
      return (cwh<T>)$$0.map(cwh::new, cwh::new);
   }

   public Optional<T> a(ke<T> $$0) {
      return this.a.<T>map(jr::a).or(() -> $$0.f(this.b));
   }

   public Optional<jr<T>> a(jt.a $$0) {
      return this.a.or(() -> $$0.d(this.b.c()).a(this.b));
   }

   public Optional<jr<T>> b() {
      return this.a;
   }

   public akt<T> c() {
      return this.b;
   }
}
