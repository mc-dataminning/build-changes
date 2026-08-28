import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cvb<T>(Optional<jq<T>> a, alh<T> b) {
   public cvb(jq<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cvb(alh<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cvb<T>> a(alh<kd<T>> $$0, Codec<jq<T>> $$1) {
      return Codec.either($$1, alh.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cvb::a, cvb::a);
   }

   public static <T> zg<wt, cvb<T>> a(alh<kd<T>> $$0, zg<wt, jq<T>> $$1) {
      return zg.a(ze.a($$1, alh.b($$0)), cvb::a, cvb::a);
   }

   public Either<jq<T>, alh<T>> a() {
      return this.a.<Either<jq<T>, alh<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cvb<T> a(Either<jq<T>, alh<T>> $$0) {
      return (cvb<T>)$$0.map(cvb::new, cvb::new);
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

   public alh<T> c() {
      return this.b;
   }
}
