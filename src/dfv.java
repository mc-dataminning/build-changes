import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfv {
   Codec<dfv> d = mg.ax.q().dispatch(dfv::a, dfv.a::a);
   yy<wl, dfv> e = yw.a(mh.ag).b(dfv::a, dfv.a::b);

   dgb d();

   dgb e();

   dfv.a<? extends dfv> a();

   default boolean a(cvh $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dfv>(MapCodec<T> a, yy<wl, T> b) {
   }
}
