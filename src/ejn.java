import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ejn {
   private static final Codec<Either<ebi, ejn>> a = Codec.either(ebi.a, lv.L.q().dispatch(ejn::a, ejo::codec));
   public static final Codec<ejn> c = a.xmap(
      $$0 -> (ejn)$$0.map(ejm::a, $$0x -> $$0x), $$0 -> $$0.a() == ejo.a ? Either.left(((ejm)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azn var1, ebl var2);

   public abstract ejo<?> a();
}
