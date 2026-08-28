import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dck {
   Codec<dck> d = mb.az.q().dispatch(dck::a, dck.a::a);
   yn<wa, dck> e = yl.a(mc.aF).b(dck::a, dck.a::b);

   dcq d();

   dcq e();

   dck.a<? extends dck> a();

   default boolean a(cru $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dck>(MapCodec<T> a, yn<wa, T> b) {
   }
}
