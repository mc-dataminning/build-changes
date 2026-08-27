import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bs(hk<biw<?>> b) {
   public static final Codec<bs> a = Codec.either(aqj.b(je.s), jd.h.r())
      .flatComapMap(
         $$0 -> (bs)$$0.map($$0x -> new bs(jd.h.a($$0x)), $$0x -> new bs(hk.a($$0x))),
         $$0 -> {
            hk<biw<?>> $$1 = $$0.a();
            Optional<aqj<biw<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bs a(biw<?> $$0) {
      return new bs(hk.a($$0.r()));
   }

   public static bs a(aqj<biw<?>> $$0) {
      return new bs(jd.h.a($$0));
   }

   public boolean b(biw<?> $$0) {
      return $$0.a(this.b);
   }

   public hk<biw<?>> a() {
      return this.b;
   }
}
