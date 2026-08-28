import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cvp<T>(Optional<jr<T>> a, aku<T> b) {
   public cvp(jr<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cvp(aku<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cvp<T>> a(aku<ke<T>> $$0, Codec<jr<T>> $$1) {
      return Codec.either($$1, aku.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cvp::a, cvp::a);
   }

   public static <T> yn<wa, cvp<T>> a(aku<ke<T>> $$0, yn<wa, jr<T>> $$1) {
      return yn.a(yl.a($$1, aku.b($$0)), cvp::a, cvp::a);
   }

   public Either<jr<T>, aku<T>> a() {
      return this.a.<Either<jr<T>, aku<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cvp<T> a(Either<jr<T>, aku<T>> $$0) {
      return (cvp<T>)$$0.map(cvp::new, cvp::new);
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

   public aku<T> c() {
      return this.b;
   }
}
