import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record cxz<T>(Either<je<T>, alf<T>> a) {
   public cxz(je<T> $$0) {
      this(Either.left($$0));
   }

   public cxz(alf<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<cxz<T>> a(alf<jr<T>> $$0, Codec<je<T>> $$1) {
      return Codec.either($$1, alf.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(cxz::new, cxz::b);
   }

   public static <T> yw<wj, cxz<T>> a(alf<jr<T>> $$0, yw<wj, je<T>> $$1) {
      return yw.a(yu.a($$1, alf.b($$0)), cxz::b, cxz::new);
   }

   public Optional<T> a(jr<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<je<T>> a(jg.a $$0) {
      return (Optional<je<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<alf<T>> a() {
      return (Optional<alf<T>>)this.a.map(je::e, Optional::of);
   }

   public Either<je<T>, alf<T>> b() {
      return this.a;
   }
}
