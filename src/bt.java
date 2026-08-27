import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record bt(in<bnw<?>> b) {
   public static final Codec<bt> a = Codec.either(aup.b(kg.u), kf.g.r())
      .flatComapMap(
         $$0 -> (bt)$$0.map($$0x -> new bt(kf.g.a($$0x)), $$0x -> new bt(in.a($$0x))),
         $$0 -> {
            in<bnw<?>> $$1 = $$0.a();
            Optional<aup<bnw<?>>> $$2 = $$1.d();
            if ($$2.isPresent()) {
               return DataResult.success(Either.left($$2.get()));
            } else {
               return $$1.b() == 1
                  ? DataResult.success(Either.right($$1.a(0)))
                  : DataResult.error(() -> "Entity type set must have a single element, but got " + $$1.b());
            }
         }
      );

   public static bt a(bnw<?> $$0) {
      return new bt(in.a($$0.r()));
   }

   public static bt a(aup<bnw<?>> $$0) {
      return new bt(kf.g.a($$0));
   }

   public boolean b(bnw<?> $$0) {
      return $$0.a(this.b);
   }

   public in<bnw<?>> a() {
      return this.b;
   }
}
