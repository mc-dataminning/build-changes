import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ebj {
   private static final Codec<Either<dtg, ebj>> a = Codec.either(dtg.a, ki.N.q().dispatch(ebj::a, ebk::codec));
   public static final Codec<ebj> c = a.xmap(
      $$0 -> (ebj)$$0.map(ebi::a, $$0x -> $$0x), $$0 -> $$0.a() == ebk.a ? Either.left(((ebi)$$0).b()) : Either.right($$0)
   );

   public abstract int a(axd var1, dtj var2);

   public abstract ebk<?> a();
}
