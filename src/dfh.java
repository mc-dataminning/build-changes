import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfh {
   Codec<dfh> d = mg.ax.q().dispatch(dfh::a, dfh.a::a);
   yw<wj, dfh> e = yu.a(mh.ag).b(dfh::a, dfh.a::b);

   dfn d();

   dfn e();

   dfh.a<? extends dfh> a();

   default boolean a(cut $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dfh>(MapCodec<T> a, yw<wj, T> b) {
   }
}
