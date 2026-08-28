import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface das {
   Codec<das> d = ma.ay.q().dispatch(das::a, das.a::a);
   zi<wv, das> e = zg.a(mb.aE).b(das::a, das.a::b);

   das.a<? extends das> a();

   boolean a(dgz var1, cxg var2, bvx var3);

   public static record a<T extends das>(MapCodec<T> f, zi<wv, T> g) {
      public static final das.a<daq> a = a("apply_effects", daq.a, daq.b);
      public static final das.a<dau> b = a("remove_effects", dau.a, dau.b);
      public static final das.a<dar> c = a("clear_all_effects", dar.b, dar.c);
      public static final das.a<dav> d = a("teleport_randomly", dav.a, dav.b);
      public static final das.a<dat> e = a("play_sound", dat.a, dat.b);

      private static <T extends das> das.a<T> a(String $$0, MapCodec<T> $$1, zi<wv, T> $$2) {
         return kd.a(ma.ay, $$0, new das.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zi<wv, T> b() {
         return this.g;
      }
   }
}
