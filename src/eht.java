import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eht {
   private static final Codec<Either<dzp, eht>> a = Codec.either(dzp.a, lt.L.r().dispatch(eht::a, ehu::codec));
   public static final Codec<eht> c = a.xmap(
      $$0 -> (eht)$$0.map(ehs::a, $$0x -> $$0x), $$0 -> $$0.a() == ehu.a ? Either.left(((ehs)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayv var1, dzs var2);

   public abstract ehu<?> a();
}
