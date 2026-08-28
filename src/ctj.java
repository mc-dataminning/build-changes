import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record ctj<T>(Optional<jm<T>> a, akp<T> b) {
   public ctj(jm<T> $$0) {
      this(Optional.of($$0), $$0.e().orElseThrow());
   }

   public ctj(akp<T> $$0) {
      this(Optional.empty(), $$0);
   }

   public static <T> Codec<ctj<T>> a(akp<jz<T>> $$0, Codec<jm<T>> $$1) {
      return Codec.either($$1, akp.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(ctj::a, ctj::a);
   }

   public static <T> yw<wj, ctj<T>> a(akp<jz<T>> $$0, yw<wj, jm<T>> $$1) {
      return yw.a(yu.a($$1, akp.b($$0)), ctj::a, ctj::a);
   }

   public Either<jm<T>, akp<T>> a() {
      return this.a.<Either<jm<T>, akp<T>>>map(Either::left).orElseGet(() -> Either.right(this.b));
   }

   public static <T> ctj<T> a(Either<jm<T>, akp<T>> $$0) {
      return (ctj<T>)$$0.map(ctj::new, ctj::new);
   }

   public Optional<T> a(jz<T> $$0) {
      return this.a.<T>map(jm::a).or(() -> $$0.e(this.b));
   }

   public Optional<jm<T>> a(jo.a $$0) {
      return this.a.or(() -> $$0.b(this.b.c()).a(this.b));
   }

   public Optional<jm<T>> b() {
      return this.a;
   }

   public akp<T> c() {
      return this.b;
   }
}
