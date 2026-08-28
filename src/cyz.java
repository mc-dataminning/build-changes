import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cyz<T>(Either<jf<T>, alh<T>> a) {
   public cyz(jf<T> $$0) {
      this(Either.left($$0));
   }

   public cyz(alh<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<cyz<T>> a(alh<js<T>> $$0, Codec<jf<T>> $$1) {
      return Codec.either($$1, alh.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cyz::new, cyz::b);
   }

   public static <T> yy<wl, cyz<T>> a(alh<js<T>> $$0, yy<wl, jf<T>> $$1) {
      return yy.a(yw.a($$1, alh.b($$0)), cyz::b, cyz::new);
   }

   public Optional<T> a(js<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<jf<T>> a(jh.a $$0) {
      return (Optional<jf<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<alh<T>> a() {
      return (Optional<alh<T>>)this.a.map(jf::e, Optional::of);
   }

   public Either<jf<T>, alh<T>> b() {
      return this.a;
   }
}
