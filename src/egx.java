import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egx {
   private static final Codec<Either<dyt, egx>> a = Codec.either(dyt.a, lq.L.r().dispatch(egx::a, egy::codec));
   public static final Codec<egx> c = a.xmap(
      $$0 -> (egx)$$0.map(egw::a, $$0x -> $$0x), $$0 -> $$0.a() == egy.a ? Either.left(((egw)$$0).b()) : Either.right($$0)
   );

   public abstract int a(aym var1, dyw var2);

   public abstract egy<?> a();
}
