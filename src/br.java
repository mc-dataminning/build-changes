import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record br(il<bly<?>> b) {
   public static final Codec<br> a = Codec.either(asv.b(ke.u), kd.g.r())
      .flatComapMap(
         $$0 -> (br)$$0.map($$0x -> new br(kd.g.a($$0x)), $$0x -> new br(il.a($$0x))),
         $$0 -> {
            il<bly<?>> $$1 = $$0.a();
            Optional<asv<bly<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static br a(bly<?> $$0) {
      return new br(il.a($$0.r()));
   }

   public static br a(asv<bly<?>> $$0) {
      return new br(kd.g.a($$0));
   }

   public boolean b(bly<?> $$0) {
      return $$0.a(this.b);
   }

   public il<bly<?>> a() {
      return this.b;
   }
}
