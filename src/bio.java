import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bio implements bit {
   private static final Codec<Either<Float, bio>> a = Codec.either(Codec.FLOAT, kb.L.q().dispatch(bio::c, bip::codec));
   public static final Codec<bio> c = a.xmap(
      $$0 -> (bio)$$0.map(bim::a, $$0x -> $$0x), $$0 -> $$0.c() == bip.a ? Either.left(((bim)$$0).d()) : Either.right($$0)
   );

   public static Codec<bio> a(float $$0, float $$1) {
      return atg.a(c, (Function<bio, DataResult<bio>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bip<?> c();
}
