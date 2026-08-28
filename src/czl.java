import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record czl<T>(Either<jg<T>, alq<T>> a) {
   public czl(jg<T> $$0) {
      this(Either.left($$0));
   }

   public czl(alq<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<czl<T>> a(alq<jt<T>> $$0, Codec<jg<T>> $$1) {
      return Codec.either($$1, alq.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(czl::new, czl::b);
   }

   public static <T> ze<wp, czl<T>> a(alq<jt<T>> $$0, ze<wp, jg<T>> $$1) {
      return ze.a(zc.a($$1, alq.b($$0)), czl::b, czl::new);
   }

   public Optional<T> a(jt<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<jg<T>> a(ji.a $$0) {
      return (Optional<jg<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<alq<T>> a() {
      return (Optional<alq<T>>)this.a.map(jg::e, Optional::of);
   }

   public Either<jg<T>, alq<T>> b() {
      return this.a;
   }
}
