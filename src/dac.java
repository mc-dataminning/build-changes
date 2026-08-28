import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dac {
   Codec<dac> d = mb.ay.q().dispatch(dac::a, dac.a::a);
   yn<wa, dac> e = yl.a(mc.aE).b(dac::a, dac.a::b);

   dac.a<? extends dac> a();

   boolean a(dgj var1, cwq var2, bvi var3);

   public static record a<T extends dac>(MapCodec<T> f, yn<wa, T> g) {
      public static final dac.a<daa> a = a("apply_effects", daa.a, daa.b);
      public static final dac.a<dae> b = a("remove_effects", dae.a, dae.b);
      public static final dac.a<dab> c = a("clear_all_effects", dab.b, dab.c);
      public static final dac.a<daf> d = a("teleport_randomly", daf.a, daf.b);
      public static final dac.a<dad> e = a("play_sound", dad.a, dad.b);

      private static <T extends dac> dac.a<T> a(String $$0, MapCodec<T> $$1, yn<wa, T> $$2) {
         return ke.a(mb.ay, $$0, new dac.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yn<wa, T> b() {
         return this.g;
      }
   }
}
