import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class emk {
   private static final Codec<Either<eed, emk>> a = Codec.either(eed.a, ma.L.q().dispatch(emk::a, eml::codec));
   public static final Codec<emk> c = a.xmap(
      $$0 -> (emk)$$0.map(emj::a, $$0x -> $$0x), $$0 -> $$0.a() == eml.a ? Either.left(((emj)$$0).b()) : Either.right($$0)
   );

   public abstract int a(bac var1, eeg var2);

   public abstract eml<?> a();
}
