import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bq(hi<bim<?>> b) {
   public static final Codec<bq> a = Codec.either(aqa.b(jc.s), jb.h.r())
      .flatComapMap(
         $$0 -> (bq)$$0.map($$0x -> new bq(jb.h.a($$0x)), $$0x -> new bq(hi.a($$0x))),
         $$0 -> {
            hi<bim<?>> $$1 = $$0.a();
            Optional<aqa<bim<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bq a(bim<?> $$0) {
      return new bq(hi.a($$0.r()));
   }

   public static bq a(aqa<bim<?>> $$0) {
      return new bq(jb.h.a($$0));
   }

   public boolean b(bim<?> $$0) {
      return $$0.a(this.b);
   }

   public hi<bim<?>> a() {
      return this.b;
   }
}
