import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cyo<T>(Either<jf<T>, alf<T>> a) {
   public cyo(jf<T> $$0) {
      this(Either.left($$0));
   }

   public cyo(alf<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<cyo<T>> a(alf<js<T>> $$0, Codec<jf<T>> $$1) {
      return Codec.either($$1, alf.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cyo::new, cyo::b);
   }

   public static <T> yw<wj, cyo<T>> a(alf<js<T>> $$0, yw<wj, jf<T>> $$1) {
      return yw.a(yu.a($$1, alf.b($$0)), cyo::b, cyo::new);
   }

   public Optional<T> a(js<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<jf<T>> a(jh.a $$0) {
      return (Optional<jf<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<alf<T>> a() {
      return (Optional<alf<T>>)this.a.map(jf::e, Optional::of);
   }

   public Either<jf<T>, alf<T>> b() {
      return this.a;
   }
}
