import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dep {
   Codec<dep> d = mf.ax.q().dispatch(dep::a, dep.a::a);
   yu<wh, dep> e = ys.a(mg.ag).b(dep::a, dep.a::b);

   dev d();

   dev e();

   dep.a<? extends dep> a();

   default boolean a(cub $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dep>(MapCodec<T> a, yu<wh, T> b) {
   }
}
