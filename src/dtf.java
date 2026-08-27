import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtf {
   private static final Codec<Either<dlc, dtf>> a = Codec.either(dlc.a, jb.O.q().dispatch(dtf::a, dtg::codec));
   public static final Codec<dtf> c = a.xmap(
      $$0 -> (dtf)$$0.map(dte::a, $$0x -> $$0x), $$0 -> $$0.a() == dtg.a ? Either.left(((dte)$$0).b()) : Either.right($$0)
   );

   public abstract int a(aru var1, dlf var2);

   public abstract dtg<?> a();
}
