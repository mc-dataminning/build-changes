import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dfk {
   Codec<dfk> d = mg.ax.q().dispatch(dfk::a, dfk.a::a);
   yw<wj, dfk> e = yu.a(mh.ag).b(dfk::a, dfk.a::b);

   dfq d();

   dfq e();

   dfk.a<? extends dfk> a();

   default boolean a(cuw $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dfk>(MapCodec<T> a, yw<wj, T> b) {
   }
}
