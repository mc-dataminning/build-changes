import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ddy {
   Codec<ddy> d = mh.aw.q().dispatch(ddy::a, ddy.a::a);
   ze<wp, ddy> e = zc.a(mi.n).b(ddy::a, ddy.a::b);

   ddy.a<? extends ddy> a();

   boolean a(dkj var1, dak var2, byf var3);

   public static record a<T extends ddy>(MapCodec<T> f, ze<wp, T> g) {
      public static final ddy.a<ddw> a = a("apply_effects", ddw.a, ddw.b);
      public static final ddy.a<dea> b = a("remove_effects", dea.a, dea.b);
      public static final ddy.a<ddx> c = a("clear_all_effects", ddx.b, ddx.c);
      public static final ddy.a<deb> d = a("teleport_randomly", deb.a, deb.b);
      public static final ddy.a<ddz> e = a("play_sound", ddz.a, ddz.b);

      private static <T extends ddy> ddy.a<T> a(String $$0, MapCodec<T> $$1, ze<wp, T> $$2) {
         return jt.a(mh.aw, $$0, new ddy.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public ze<wp, T> b() {
         return this.g;
      }
   }
}
