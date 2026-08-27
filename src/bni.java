import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public abstract class bni implements bnn {
   private static final Codec<Either<Float, bni>> a = Codec.either(Codec.FLOAT, kt.L.q().dispatch(bni::c, bnj::codec));
   public static final Codec<bni> c = a.xmap(
      $$0 -> (bni)$$0.map(bng::a, $$0x -> $$0x), $$0 -> $$0.c() == bnj.a ? Either.left(((bng)$$0).d()) : Either.right($$0)
   );

   public static Codec<bni> a(float $$0, float $$1) {
      return awu.b(c, (Function<bni, DataResult<bni>>)($$2 -> {
         if ($$2.a() < $$0) {
            return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
         } else {
            return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
         }
      }));
   }

   public abstract float a();

   public abstract float b();

   public abstract bnj<?> c();
}
