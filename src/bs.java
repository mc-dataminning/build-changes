import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bs(ig<bjx<?>> b) {
   public static final Codec<bs> a = Codec.either(arh.b(jz.t), jy.h.r())
      .flatComapMap(
         $$0 -> (bs)$$0.map($$0x -> new bs(jy.h.a($$0x)), $$0x -> new bs(ig.a($$0x))),
         $$0 -> {
            ig<bjx<?>> $$1 = $$0.a();
            Optional<arh<bjx<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bs a(bjx<?> $$0) {
      return new bs(ig.a($$0.r()));
   }

   public static bs a(arh<bjx<?>> $$0) {
      return new bs(jy.h.a($$0));
   }

   public boolean b(bjx<?> $$0) {
      return $$0.a(this.b);
   }

   public ig<bjx<?>> a() {
      return this.b;
   }
}
