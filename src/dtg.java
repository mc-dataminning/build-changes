import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtg {
   private static final Codec<Either<dld, dtg>> a = Codec.either(dld.a, jb.O.q().dispatch(dtg::a, dth::codec));
   public static final Codec<dtg> c = a.xmap(
      $$0 -> (dtg)$$0.map(dtf::a, $$0x -> $$0x), $$0 -> $$0.a() == dth.a ? Either.left(((dtf)$$0).b()) : Either.right($$0)
   );

   public abstract int a(aru var1, dlg var2);

   public abstract dth<?> a();
}
