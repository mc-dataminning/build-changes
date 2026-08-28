import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cvm<T>(Optional<jq<T>> a, ali<T> b) {
   public cvm(jq<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public cvm(ali<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<cvm<T>> a(ali<kd<T>> $$0, Codec<jq<T>> $$1) {
      return Codec.either($$1, ali.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cvm::a, cvm::a);
   }

   public static <T> zh<wu, cvm<T>> a(ali<kd<T>> $$0, zh<wu, jq<T>> $$1) {
      return zh.a(zf.a($$1, ali.b($$0)), cvm::a, cvm::a);
   }

   public Either<jq<T>, ali<T>> a() {
      return this.a.<Either<jq<T>, ali<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> cvm<T> a(Either<jq<T>, ali<T>> $$0) {
      return (cvm<T>)$$0.map(cvm::new, cvm::new);
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

   public ali<T> c() {
      return this.b;
   }
}
