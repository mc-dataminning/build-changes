import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dwv {
   private static final Codec<Either<dos, dwv>> a = Codec.either(dos.a, kb.N.q().dispatch(dwv::a, dww::codec));
   public static final Codec<dwv> c = a.xmap(
      $$0 -> (dwv)$$0.map(dwu::a, $$0x -> $$0x), $$0 -> $$0.a() == dww.a ? Either.left(((dwu)$$0).b()) : Either.right($$0)
   );

   public abstract int a(auf var1, dov var2);

   public abstract dww<?> a();
}
