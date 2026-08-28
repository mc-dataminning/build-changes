import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddr {
   Codec<ddr> d = md.az.q().dispatch(ddr::a, ddr.a::a);
   yt<wg, ddr> e = yr.a(me.aF).b(ddr::a, ddr.a::b);

   ddx d();

   ddx e();

   ddr.a<? extends ddr> a();

   default boolean a(cte $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends ddr>(MapCodec<T> a, yt<wg, T> b) {
   }
}
