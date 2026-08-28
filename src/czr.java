import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czr {
   Codec<czr> d = lz.ay.q().dispatch(czr::a, czr.a::a);
   zj<ww, czr> e = zh.a(ma.aE).b(czr::a, czr.a::b);

   czr.a<? extends czr> a();

   boolean a(dff var1, cwf var2, bve var3);

   public static record a<T extends czr>(MapCodec<T> f, zj<ww, T> g) {
      public static final czr.a<czp> a = a("apply_effects", czp.a, czp.b);
      public static final czr.a<czt> b = a("remove_effects", czt.a, czt.b);
      public static final czr.a<czq> c = a("clear_all_effects", czq.b, czq.c);
      public static final czr.a<czu> d = a("teleport_randomly", czu.a, czu.b);
      public static final czr.a<czs> e = a("play_sound", czs.a, czs.b);

      private static <T extends czr> czr.a<T> a(String $$0, MapCodec<T> $$1, zj<ww, T> $$2) {
         return kd.a(lz.ay, $$0, new czr.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zj<ww, T> b() {
         return this.g;
      }
   }
}
