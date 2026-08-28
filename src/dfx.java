import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfx {
   Codec<dfx> d = mh.ax.q().dispatch(dfx::a, dfx.a::a);
   za<wn, dfx> e = yy.a(mi.ag).b(dfx::a, dfx.a::b);

   dgd d();

   dgd e();

   dfx.a<? extends dfx> a();

   default boolean a(cvj $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dfx>(MapCodec<T> a, za<wn, T> b) {
   }
}
