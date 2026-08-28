import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cwg<T>(Optional<jq<T>> a, alo<T> b) {
   public cwg(jq<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cwg(alo<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cwg<T>> a(alo<kd<T>> $$0, Codec<jq<T>> $$1) {
      return Codec.either($$1, alo.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cwg::a, cwg::a);
   }

   public static <T> zi<wv, cwg<T>> a(alo<kd<T>> $$0, zi<wv, jq<T>> $$1) {
      return zi.a(zg.a($$1, alo.b($$0)), cwg::a, cwg::a);
   }

   public Either<jq<T>, alo<T>> a() {
      return this.a.<Either<jq<T>, alo<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cwg<T> a(Either<jq<T>, alo<T>> $$0) {
      return (cwg<T>)$$0.map(cwg::new, cwg::new);
   }

   public Optional<T> a(kd<T> $$0) {
      return this.a.<T>map(jq::a).or(() -> $$0.f(this.b));
   }

   public Optional<jq<T>> a(js.a $$0) {
      return this.a.or(() -> $$0.d(this.b.c()).a(this.b));
   }

   public Optional<jq<T>> b() {
      return this.a;
   }

   public alo<T> c() {
      return this.b;
   }
}
