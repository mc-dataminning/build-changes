import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class edx {
   private static final Codec<Either<dvu, edx>> a = Codec.either(dvu.a, kt.N.q().dispatch(edx::a, edy::codec));
   public static final Codec<edx> c = a.xmap(
      $$0 -> (edx)$$0.map(edw::a, $$0x -> $$0x), $$0 -> $$0.a() == edy.a ? Either.left(((edw)$$0).b()) : Either.right($$0)
   );

   public abstract int a(axt var1, dvx var2);

   public abstract edy<?> a();
}
