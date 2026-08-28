import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ehx {
   private static final Codec<Either<dzs, ehx>> a = Codec.either(dzs.a, lt.L.r().dispatch(ehx::a, ehy::codec));
   public static final Codec<ehx> c = a.xmap(
      $$0 -> (ehx)$$0.map(ehw::a, $$0x -> $$0x), $$0 -> $$0.a() == ehy.a ? Either.left(((ehw)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayw var1, dzv var2);

   public abstract ehy<?> a();
}
