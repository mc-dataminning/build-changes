import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dgh {
   Codec<dgh> d = mh.ax.q().dispatch(dgh::a, dgh.a::a);
   ze<wp, dgh> e = zc.a(mi.ag).b(dgh::a, dgh.a::b);

   dgn d();

   dgn e();

   dgh.a<? extends dgh> a();

   default boolean a(cvs $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dgh>(MapCodec<T> a, ze<wp, T> b) {
   }
}
