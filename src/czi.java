import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czi {
   Codec<czi> d = lv.az.q().dispatch(czi::a, czi.a::a);
   zc<wp, czi> e = za.a(lw.aF).b(czi::a, czi.a::b);

   czi.a<? extends czi> a();

   boolean a(dej var1, cvs var2, bun var3);

   public static record a<T extends czi>(MapCodec<T> f, zc<wp, T> g) {
      public static final czi.a<czg> a = a("apply_effects", czg.a, czg.b);
      public static final czi.a<czk> b = a("remove_effects", czk.a, czk.b);
      public static final czi.a<czh> c = a("clear_all_effects", czh.b, czh.c);
      public static final czi.a<czl> d = a("teleport_randomly", czl.a, czl.b);
      public static final czi.a<czj> e = a("play_sound", czj.a, czj.b);

      private static <T extends czi> czi.a<T> a(String $$0, MapCodec<T> $$1, zc<wp, T> $$2) {
         return kb.a(lv.az, $$0, new czi.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zc<wp, T> b() {
         return this.g;
      }
   }
}
