import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class egt {
   private static final Codec<Either<dyq, egt>> a = Codec.either(dyq.a, lp.N.q().dispatch(egt::a, egu::codec));
   public static final Codec<egt> c = a.xmap(
      $$0 -> (egt)$$0.map(egs::a, $$0x -> $$0x), $$0 -> $$0.a() == egu.a ? Either.left(((egs)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azh var1, dyt var2);

   public abstract egu<?> a();
}
