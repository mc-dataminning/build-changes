import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cum<T>(Optional<jn<T>> a, alb<T> b) {
   public cum(jn<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cum(alb<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cum<T>> a(alb<ka<T>> $$0, Codec<jn<T>> $$1) {
      return Codec.either($$1, alb.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cum::a, cum::a);
   }

   public static <T> zb<wo, cum<T>> a(alb<ka<T>> $$0, zb<wo, jn<T>> $$1) {
      return zb.a(yz.a($$1, alb.b($$0)), cum::a, cum::a);
   }

   public Either<jn<T>, alb<T>> a() {
      return this.a.<Either<jn<T>, alb<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cum<T> a(Either<jn<T>, alb<T>> $$0) {
      return (cum<T>)$$0.map(cum::new, cum::new);
   }

   public Optional<T> a(ka<T> $$0) {
      return this.a.<T>map(jn::a).or(() -> $$0.e(this.b));
   }

   public Optional<jn<T>> a(jp.a $$0) {
      return this.a.or(() -> $$0.b(this.b.c()).a(this.b));
   }

   public Optional<jn<T>> b() {
      return this.a;
   }

   public alb<T> c() {
      return this.b;
   }
}
