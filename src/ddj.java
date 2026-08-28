import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddj {
   Codec<ddj> d = ma.az.q().dispatch(ddj::a, ddj.a::a);
   zt<xg, ddj> e = zr.a(mb.aF).b(ddj::a, ddj.a::b);

   ddp d();

   ddp e();

   ddj.a<? extends ddj> a();

   default boolean a(cst $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends ddj>(MapCodec<T> a, zt<xg, T> b) {
   }
}
