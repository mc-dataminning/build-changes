import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dba {
   Codec<dba> d = ma.ay.q().dispatch(dba::a, dba.a::a);
   zt<xg, dba> e = zr.a(mb.aE).b(dba::a, dba.a::b);

   dba.a<? extends dba> a();

   boolean a(dhh var1, cxo var2, bwf var3);

   public static record a<T extends dba>(MapCodec<T> f, zt<xg, T> g) {
      public static final dba.a<day> a = a("apply_effects", day.a, day.b);
      public static final dba.a<dbc> b = a("remove_effects", dbc.a, dbc.b);
      public static final dba.a<daz> c = a("clear_all_effects", daz.b, daz.c);
      public static final dba.a<dbd> d = a("teleport_randomly", dbd.a, dbd.b);
      public static final dba.a<dbb> e = a("play_sound", dbb.a, dbb.b);

      private static <T extends dba> dba.a<T> a(String $$0, MapCodec<T> $$1, zt<xg, T> $$2) {
         return kd.a(ma.ay, $$0, new dba.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zt<xg, T> b() {
         return this.g;
      }
   }
}
