import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface daw {
   Codec<daw> d = ma.ay.q().dispatch(daw::a, daw.a::a);
   zt<xg, daw> e = zr.a(mb.aE).b(daw::a, daw.a::b);

   daw.a<? extends daw> a();

   boolean a(dha var1, cxk var2, bwb var3);

   public static record a<T extends daw>(MapCodec<T> f, zt<xg, T> g) {
      public static final daw.a<dau> a = a("apply_effects", dau.a, dau.b);
      public static final daw.a<day> b = a("remove_effects", day.a, day.b);
      public static final daw.a<dav> c = a("clear_all_effects", dav.b, dav.c);
      public static final daw.a<daz> d = a("teleport_randomly", daz.a, daz.b);
      public static final daw.a<dax> e = a("play_sound", dax.a, dax.b);

      private static <T extends daw> daw.a<T> a(String $$0, MapCodec<T> $$1, zt<xg, T> $$2) {
         return kd.a(ma.ay, $$0, new daw.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zt<xg, T> b() {
         return this.g;
      }
   }
}
