import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dcj {
   Codec<dcj> d = mb.az.q().dispatch(dcj::a, dcj.a::a);
   ym<vz, dcj> e = yk.a(mc.aF).b(dcj::a, dcj.a::b);

   dcp d();

   dcp e();

   dcj.a<? extends dcj> a();

   default boolean a(crt $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public static record a<T extends dcj>(MapCodec<T> a, ym<vz, T> b) {
   }
}
