import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czh {
   Codec<czh> d = lx.ay.q().dispatch(czh::a, czh.a::a);
   zf<ws, czh> e = zd.a(ly.aE).b(czh::a, czh.a::b);

   czh.a<? extends czh> a();

   boolean a(dev var1, cvx var2, buv var3);

   public static record a<T extends czh>(MapCodec<T> f, zf<ws, T> g) {
      public static final czh.a<czf> a = a("apply_effects", czf.a, czf.b);
      public static final czh.a<czj> b = a("remove_effects", czj.a, czj.b);
      public static final czh.a<czg> c = a("clear_all_effects", czg.b, czg.c);
      public static final czh.a<czk> d = a("teleport_randomly", czk.a, czk.b);
      public static final czh.a<czi> e = a("play_sound", czi.a, czi.b);

      private static <T extends czh> czh.a<T> a(String $$0, MapCodec<T> $$1, zf<ws, T> $$2) {
         return kc.a(lx.ay, $$0, new czh.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zf<ws, T> b() {
         return this.g;
      }
   }
}
