import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ejj {
   private static final Codec<Either<ebe, ejj>> a = Codec.either(ebe.a, lu.L.q().dispatch(ejj::a, ejk::codec));
   public static final Codec<ejj> c = a.xmap(
      $$0 -> (ejj)$$0.map(eji::a, $$0x -> $$0x), $$0 -> $$0.a() == ejk.a ? Either.left(((eji)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azl var1, ebh var2);

   public abstract ejk<?> a();
}
