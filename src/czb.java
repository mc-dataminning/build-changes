import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record czb<T>(Either<jg<T>, alj<T>> a) {
   public czb(jg<T> $$0) {
      this(Either.left($$0));
   }

   public czb(alj<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<czb<T>> a(alj<jt<T>> $$0, Codec<jg<T>> $$1) {
      return Codec.either($$1, alj.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(czb::new, czb::b);
   }

   public static <T> za<wn, czb<T>> a(alj<jt<T>> $$0, za<wn, jg<T>> $$1) {
      return za.a(yy.a($$1, alj.b($$0)), czb::b, czb::new);
   }

   public Optional<T> a(jt<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<jg<T>> a(ji.a $$0) {
      return (Optional<jg<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<alj<T>> a() {
      return (Optional<alj<T>>)this.a.map(jg::e, Optional::of);
   }

   public Either<jg<T>, alj<T>> b() {
      return this.a;
   }
}
