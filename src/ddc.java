import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddc {
   Codec<ddc> d = ma.az.q().dispatch(ddc::a, ddc.a::a);
   zt<xg, ddc> e = zr.a(mb.aF).b(ddc::a, ddc.a::b);

   ddi d();

   ddi e();

   ddc.a<? extends ddc> a();

   default boolean a(cso $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends ddc>(MapCodec<T> a, zt<xg, T> b) {
   }
}
