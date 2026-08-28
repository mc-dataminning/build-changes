import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dci {
   Codec<dci> d = mb.az.q().dispatch(dci::a, dci.a::a);
   yn<wa, dci> e = yl.a(mc.aF).b(dci::a, dci.a::b);

   dco d();

   dco e();

   dci.a<? extends dci> a();

   default boolean a(crs $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dci>(MapCodec<T> a, yn<wa, T> b) {
   }
}
