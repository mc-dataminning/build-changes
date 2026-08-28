import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddi {
   Codec<ddi> d = ma.az.q().dispatch(ddi::a, ddi.a::a);
   zt<xg, ddi> e = zr.a(mb.aF).b(ddi::a, ddi.a::b);

   ddo d();

   ddo e();

   ddi.a<? extends ddi> a();

   default boolean a(css $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends ddi>(MapCodec<T> a, zt<xg, T> b) {
   }
}
