import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dab {
   Codec<dab> d = mb.ay.q().dispatch(dab::a, dab.a::a);
   ym<vz, dab> e = yk.a(mc.aE).b(dab::a, dab.a::b);

   dab.a<? extends dab> a();

   boolean a(dgi var1, cwp var2, bvg var3);

   public static record a<T extends dab>(MapCodec<T> f, ym<vz, T> g) {
      public static final dab.a<czz> a = a("apply_effects", czz.a, czz.b);
      public static final dab.a<dad> b = a("remove_effects", dad.a, dad.b);
      public static final dab.a<daa> c = a("clear_all_effects", daa.b, daa.c);
      public static final dab.a<dae> d = a("teleport_randomly", dae.a, dae.b);
      public static final dab.a<dac> e = a("play_sound", dac.a, dac.b);

      private static <T extends dab> dab.a<T> a(String $$0, MapCodec<T> $$1, ym<vz, T> $$2) {
         return ke.a(mb.ay, $$0, new dab.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public ym<vz, T> b() {
         return this.g;
      }
   }
}
