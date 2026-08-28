import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cvf<T>(Optional<jq<T>> a, alk<T> b) {
   public cvf(jq<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cvf(alk<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cvf<T>> a(alk<kd<T>> $$0, Codec<jq<T>> $$1) {
      return Codec.either($$1, alk.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cvf::a, cvf::a);
   }

   public static <T> zj<ww, cvf<T>> a(alk<kd<T>> $$0, zj<ww, jq<T>> $$1) {
      return zj.a(zh.a($$1, alk.b($$0)), cvf::a, cvf::a);
   }

   public Either<jq<T>, alk<T>> a() {
      return this.a.<Either<jq<T>, alk<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cvf<T> a(Either<jq<T>, alk<T>> $$0) {
      return (cvf<T>)$$0.map(cvf::new, cvf::new);
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

   public alk<T> c() {
      return this.b;
   }
}
