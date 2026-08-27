import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtj {
   private static final Codec<Either<dlg, dtj>> a = Codec.either(dlg.a, jb.O.q().dispatch(dtj::a, dtk::codec));
   public static final Codec<dtj> c = a.xmap(
      $$0 -> (dtj)$$0.map(dti::a, $$0x -> $$0x), $$0 -> $$0.a() == dtk.a ? Either.left(((dti)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ash var1, dlj var2);

   public abstract dtk<?> a();
}
