import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bt(ip<bpc<?>> b) {
   public static final Codec<bt> a = Codec.either(avd.b(kj.u), ki.g.r())
      .flatComapMap(
         $$0 -> (bt)$$0.map($$0x -> new bt(ki.g.a($$0x)), $$0x -> new bt(ip.a($$0x))),
         $$0 -> {
            ip<bpc<?>> $$1 = $$0.a();
            Optional<avd<bpc<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bt a(bpc<?> $$0) {
      return new bt(ip.a($$0.r()));
   }

   public static bt a(avd<bpc<?>> $$0) {
      return new bt(ki.g.a($$0));
   }

   public boolean b(bpc<?> $$0) {
      return $$0.a(this.b);
   }

   public ip<bpc<?>> a() {
      return this.b;
   }
}
