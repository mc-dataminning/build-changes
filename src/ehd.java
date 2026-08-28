import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class ehd {
   private static final Codec<Either<dyz, ehd>> a = Codec.either(dyz.a, lq.L.r().dispatch(ehd::a, ehe::codec));
   public static final Codec<ehd> c = a.xmap(
      $$0 -> (ehd)$$0.map(ehc::a, $$0x -> $$0x), $$0 -> $$0.a() == ehe.a ? Either.left(((ehc)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ayo var1, dzc var2);

   public abstract ehe<?> a();
}
