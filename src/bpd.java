import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bpd implements bpi {
   private static final Codec<Either<Float, bpd>> a = Codec.either(Codec.FLOAT, lh.L.q().dispatch(bpd::c, bpe::codec));
   public static final Codec<bpd> c = a.xmap(
      $$0 -> (bpd)$$0.map(bpb::a, $$0x -> $$0x), $$0 -> $$0.c() == bpe.a ? Either.left(((bpb)$$0).d()) : Either.right($$0)
   );

   public static Codec<bpd> a(float $$0, float $$1) {
      return axu.b(c, (Function<bpd, DataResult<bpd>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bpe<?> c();
}
