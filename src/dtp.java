import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dtp {
   private static final Codec<Either<dlm, dtp>> a = Codec.either(dlm.a, jd.O.q().dispatch(dtp::a, dtq::codec));
   public static final Codec<dtp> c = a.xmap(
      $$0 -> (dtp)$$0.map(dto::a, $$0x -> $$0x), $$0 -> $$0.a() == dtq.a ? Either.left(((dto)$$0).b()) : Either.right($$0)
   );

   public abstract int a(asc var1, dlp var2);

   public abstract dtq<?> a();
}
