import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dch {
   Codec<dch> d = mb.az.q().dispatch(dch::a, dch.a::a);
   ym<vz, dch> e = yk.a(mc.aF).b(dch::a, dch.a::b);

   dcn d();

   dcn e();

   dch.a<? extends dch> a();

   default boolean a(crr $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dch>(MapCodec<T> a, ym<vz, T> b) {
   }
}
