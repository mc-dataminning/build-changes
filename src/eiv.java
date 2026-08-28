import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eiv {
   private static final Codec<Either<eaq, eiv>> a = Codec.either(eaq.a, lu.L.q().dispatch(eiv::a, eiw::codec));
   public static final Codec<eiv> c = a.xmap(
      $$0 -> (eiv)$$0.map(eiu::a, $$0x -> $$0x), $$0 -> $$0.a() == eiw.a ? Either.left(((eiu)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azk var1, eat var2);

   public abstract eiw<?> a();
}
