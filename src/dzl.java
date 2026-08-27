import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dzl {
   private static final Codec<Either<dri, dzl>> a = Codec.either(dri.a, kf.N.q().dispatch(dzl::a, dzm::codec));
   public static final Codec<dzl> c = a.xmap(
      $$0 -> (dzl)$$0.map(dzk::a, $$0x -> $$0x), $$0 -> $$0.a() == dzm.a ? Either.left(((dzk)$$0).b()) : Either.right($$0)
   );

   public abstract int a(awo var1, drl var2);

   public abstract dzm<?> a();
}
