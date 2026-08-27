import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dte {
   private static final Codec<Either<dlb, dte>> a = Codec.either(dlb.a, jc.O.q().dispatch(dte::a, dtf::codec));
   public static final Codec<dte> c = a.xmap(
      $$0 -> (dte)$$0.map(dtd::a, $$0x -> $$0x), $$0 -> $$0.a() == dtf.a ? Either.left(((dtd)$$0).b()) : Either.right($$0)
   );

   public abstract int a(art var1, dle var2);

   public abstract dtf<?> a();
}
