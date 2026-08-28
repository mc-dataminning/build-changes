import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eqi {
   private static final Codec<Either<ehx, eqi>> a = Codec.either(ehx.a, mg.L.q().dispatch(eqi::a, eqj::codec));
   public static final Codec<eqi> c = a.xmap(
      $$0 -> (eqi)$$0.map(eqh::a, $$0x -> $$0x), $$0 -> $$0.a() == eqj.a ? Either.left(((eqh)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azx var1, eia var2);

   public abstract eqj<?> a();
}
