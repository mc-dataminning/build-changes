import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class emj {
   private static final Codec<Either<eec, emj>> a = Codec.either(eec.a, ma.L.q().dispatch(emj::a, emk::codec));
   public static final Codec<emj> c = a.xmap(
      $$0 -> (emj)$$0.map(emi::a, $$0x -> $$0x), $$0 -> $$0.a() == emk.a ? Either.left(((emi)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bam var1, eef var2);

   public abstract emk<?> a();
}
