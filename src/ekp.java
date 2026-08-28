import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ekp {
   private static final Codec<Either<eck, ekp>> a = Codec.either(eck.a, lz.L.q().dispatch(ekp::a, ekq::codec));
   public static final Codec<ekp> c = a.xmap(
      $$0 -> (ekp)$$0.map(eko::a, $$0x -> $$0x), $$0 -> $$0.a() == ekq.a ? Either.left(((eko)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azu var1, ecn var2);

   public abstract ekq<?> a();
}
