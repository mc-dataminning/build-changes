import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class elr {
   private static final Codec<Either<edk, elr>> a = Codec.either(edk.a, mb.L.q().dispatch(elr::a, els::codec));
   public static final Codec<elr> c = a.xmap(
      $$0 -> (elr)$$0.map(elq::a, $$0x -> $$0x), $$0 -> $$0.a() == els.a ? Either.left(((elq)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azg var1, edn var2);

   public abstract els<?> a();
}
