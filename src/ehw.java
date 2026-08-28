import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ehw {
   private static final Codec<Either<dzs, ehw>> a = Codec.either(dzs.a, lt.L.r().dispatch(ehw::a, ehx::codec));
   public static final Codec<ehw> c = a.xmap(
      $$0 -> (ehw)$$0.map(ehv::a, $$0x -> $$0x), $$0 -> $$0.a() == ehx.a ? Either.left(((ehv)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayw var1, dzv var2);

   public abstract ehx<?> a();
}
