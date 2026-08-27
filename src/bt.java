import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bt(ip<bol<?>> b) {
   public static final Codec<bt> a = Codec.either(aut.b(ki.u), kh.g.r())
      .flatComapMap(
         $$0 -> (bt)$$0.map($$0x -> new bt(kh.g.a($$0x)), $$0x -> new bt(ip.a($$0x))),
         $$0 -> {
            ip<bol<?>> $$1 = $$0.a();
            Optional<aut<bol<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bt a(bol<?> $$0) {
      return new bt(ip.a($$0.r()));
   }

   public static bt a(aut<bol<?>> $$0) {
      return new bt(kh.g.a($$0));
   }

   public boolean b(bol<?> $$0) {
      return $$0.a(this.b);
   }

   public ip<bol<?>> a() {
      return this.b;
   }
}
