import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bs(ig<bkm<?>> b) {
   public static final Codec<bs> a = Codec.either(arr.b(jz.t), jy.h.r())
      .flatComapMap(
         $$0 -> (bs)$$0.map($$0x -> new bs(jy.h.a($$0x)), $$0x -> new bs(ig.a($$0x))),
         $$0 -> {
            ig<bkm<?>> $$1 = $$0.a();
            Optional<arr<bkm<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bs a(bkm<?> $$0) {
      return new bs(ig.a($$0.r()));
   }

   public static bs a(arr<bkm<?>> $$0) {
      return new bs(jy.h.a($$0));
   }

   public boolean b(bkm<?> $$0) {
      return $$0.a(this.b);
   }

   public ig<bkm<?>> a() {
      return this.b;
   }
}
