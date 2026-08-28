import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface das {
   Codec<das> d = mb.ay.q().dispatch(das::a, das.a::a);
   yn<wa, das> e = yl.a(mc.aE).b(das::a, das.a::b);

   das.a<? extends das> a();

   boolean a(dgz var1, cxh var2, bvy var3);

   public static record a<T extends das>(MapCodec<T> f, yn<wa, T> g) {
      public static final das.a<daq> a = a("apply_effects", daq.a, daq.b);
      public static final das.a<dau> b = a("remove_effects", dau.a, dau.b);
      public static final das.a<dar> c = a("clear_all_effects", dar.b, dar.c);
      public static final das.a<dav> d = a("teleport_randomly", dav.a, dav.b);
      public static final das.a<dat> e = a("play_sound", dat.a, dat.b);

      private static <T extends das> das.a<T> a(String $$0, MapCodec<T> $$1, yn<wa, T> $$2) {
         return ke.a(mb.ay, $$0, new das.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yn<wa, T> b() {
         return this.g;
      }
   }
}
