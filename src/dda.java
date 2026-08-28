import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dda {
   Codec<dda> d = ma.az.q().dispatch(dda::a, dda.a::a);
   zi<wv, dda> e = zg.a(mb.aF).b(dda::a, dda.a::b);

   ddg d();

   ddg e();

   dda.a<? extends dda> a();

   default boolean a(csk $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dda>(MapCodec<T> a, zi<wv, T> b) {
   }
}
