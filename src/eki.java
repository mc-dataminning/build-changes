import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class eki {
   private static final Codec<Either<ecd, eki>> a = Codec.either(ecd.a, lz.L.q().dispatch(eki::a, ekj::codec));
   public static final Codec<eki> c = a.xmap(
      $$0 -> (eki)$$0.map(ekh::a, $$0x -> $$0x), $$0 -> $$0.a() == ekj.a ? Either.left(((ekh)$$0).b()) : Either.right($$0)
   );

   public abstract int a(azv var1, ecg var2);

   public abstract ekj<?> a();
}
