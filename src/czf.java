import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czf {
   Codec<czf> d = lu.az.q().dispatch(czf::a, czf.a::a);
   zb<wo, czf> e = yz.a(lv.aF).b(czf::a, czf.a::b);

   czf.a<? extends czf> a();

   boolean a(deg var1, cvp var2, buk var3);

   public static record a<T extends czf>(MapCodec<T> f, zb<wo, T> g) {
      public static final czf.a<czd> a = a("apply_effects", czd.a, czd.b);
      public static final czf.a<czh> b = a("remove_effects", czh.a, czh.b);
      public static final czf.a<cze> c = a("clear_all_effects", cze.b, cze.c);
      public static final czf.a<czi> d = a("teleport_randomly", czi.a, czi.b);
      public static final czf.a<czg> e = a("play_sound", czg.a, czg.b);

      private static <T extends czf> czf.a<T> a(String $$0, MapCodec<T> $$1, zb<wo, T> $$2) {
         return ka.a(lu.az, $$0, new czf.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zb<wo, T> b() {
         return this.g;
      }
   }
}
