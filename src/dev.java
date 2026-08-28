import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dev {
   Codec<dev> d = mf.ax.q().dispatch(dev::a, dev.a::a);
   yw<wj, dev> e = yu.a(mg.ag).b(dev::a, dev.a::b);

   dfb d();

   dfb e();

   dev.a<? extends dev> a();

   default boolean a(cuh $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dev>(MapCodec<T> a, yw<wj, T> b) {
   }
}
