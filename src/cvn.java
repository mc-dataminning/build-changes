import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cvn<T>(Optional<jr<T>> a, akt<T> b) {
   public cvn(jr<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cvn(akt<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cvn<T>> a(akt<ke<T>> $$0, Codec<jr<T>> $$1) {
      return Codec.either($$1, akt.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cvn::a, cvn::a);
   }

   public static <T> ym<vz, cvn<T>> a(akt<ke<T>> $$0, ym<vz, jr<T>> $$1) {
      return ym.a(yk.a($$1, akt.b($$0)), cvn::a, cvn::a);
   }

   public Either<jr<T>, akt<T>> a() {
      return this.a.<Either<jr<T>, akt<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cvn<T> a(Either<jr<T>, akt<T>> $$0) {
      return (cvn<T>)$$0.map(cvn::new, cvn::new);
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
