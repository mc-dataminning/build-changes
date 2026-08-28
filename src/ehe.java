import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ehe {
   private static final Codec<Either<dza, ehe>> a = Codec.either(dza.a, lq.L.r().dispatch(ehe::a, ehf::codec));
   public static final Codec<ehe> c = a.xmap(
      $$0 -> (ehe)$$0.map(ehd::a, $$0x -> $$0x), $$0 -> $$0.a() == ehf.a ? Either.left(((ehd)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayo var1, dzd var2);

   public abstract ehf<?> a();
}
