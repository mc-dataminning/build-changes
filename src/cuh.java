import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cuh<T>(Optional<jn<T>> a, ala<T> b) {
   public cuh(jn<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cuh(ala<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cuh<T>> a(ala<ka<T>> $$0, Codec<jn<T>> $$1) {
      return Codec.either($$1, ala.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cuh::a, cuh::a);
   }

   public static <T> zb<wo, cuh<T>> a(ala<ka<T>> $$0, zb<wo, jn<T>> $$1) {
      return zb.a(yz.a($$1, ala.b($$0)), cuh::a, cuh::a);
   }

   public Either<jn<T>, ala<T>> a() {
      return this.a.<Either<jn<T>, ala<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cuh<T> a(Either<jn<T>, ala<T>> $$0) {
      return (cuh<T>)$$0.map(cuh::new, cuh::new);
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

   public ala<T> c() {
      return this.b;
   }
}
