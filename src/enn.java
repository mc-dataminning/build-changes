import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class enn {
   private static final Codec<Either<eff, enn>> a = Codec.either(eff.a, md.L.q().dispatch(enn::a, eno::codec));
   public static final Codec<enn> c = a.xmap(
      $$0 -> (enn)$$0.map(enm::a, $$0x -> $$0x), $$0 -> $$0.a() == eno.a ? Either.left(((enm)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azs var1, efi var2);

   public abstract eno<?> a();
}
