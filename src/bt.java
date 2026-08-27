import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bt(in<bnu<?>> b) {
   public static final Codec<bt> a = Codec.either(auo.b(kg.u), kf.g.r())
      .flatComapMap(
         $$0 -> (bt)$$0.map($$0x -> new bt(kf.g.a($$0x)), $$0x -> new bt(in.a($$0x))),
         $$0 -> {
            in<bnu<?>> $$1 = $$0.a();
            Optional<auo<bnu<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bt a(bnu<?> $$0) {
      return new bt(in.a($$0.r()));
   }

   public static bt a(auo<bnu<?>> $$0) {
      return new bt(kf.g.a($$0));
   }

   public boolean b(bnu<?> $$0) {
      return $$0.a(this.b);
   }

   public in<bnu<?>> a() {
      return this.b;
   }
}
