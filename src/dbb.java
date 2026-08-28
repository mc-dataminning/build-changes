import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dbb {
   Codec<dbb> d = ma.ay.q().dispatch(dbb::a, dbb.a::a);
   zt<xg, dbb> e = zr.a(mb.aE).b(dbb::a, dbb.a::b);

   dbb.a<? extends dbb> a();

   boolean a(dhi var1, cxp var2, bwg var3);

   public static record a<T extends dbb>(MapCodec<T> f, zt<xg, T> g) {
      public static final dbb.a<daz> a = a("apply_effects", daz.a, daz.b);
      public static final dbb.a<dbd> b = a("remove_effects", dbd.a, dbd.b);
      public static final dbb.a<dba> c = a("clear_all_effects", dba.b, dba.c);
      public static final dbb.a<dbe> d = a("teleport_randomly", dbe.a, dbe.b);
      public static final dbb.a<dbc> e = a("play_sound", dbc.a, dbc.b);

      private static <T extends dbb> dbb.a<T> a(String $$0, MapCodec<T> $$1, zt<xg, T> $$2) {
         return kd.a(ma.ay, $$0, new dbb.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zt<xg, T> b() {
         return this.g;
      }
   }
}
