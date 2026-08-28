import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cwo<T>(Optional<jq<T>> a, aly<T> b) {
   public cwo(jq<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cwo(aly<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cwo<T>> a(aly<kd<T>> $$0, Codec<jq<T>> $$1) {
      return Codec.either($$1, aly.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cwo::a, cwo::a);
   }

   public static <T> zt<xg, cwo<T>> a(aly<kd<T>> $$0, zt<xg, jq<T>> $$1) {
      return zt.a(zr.a($$1, aly.b($$0)), cwo::a, cwo::a);
   }

   public Either<jq<T>, aly<T>> a() {
      return this.a.<Either<jq<T>, aly<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cwo<T> a(Either<jq<T>, aly<T>> $$0) {
      return (cwo<T>)$$0.map(cwo::new, cwo::new);
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

   public aly<T> c() {
      return this.b;
   }
}
