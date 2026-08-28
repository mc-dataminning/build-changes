import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface daa {
   Codec<daa> d = mb.ay.q().dispatch(daa::a, daa.a::a);
   yn<wa, daa> e = yl.a(mc.aE).b(daa::a, daa.a::b);

   daa.a<? extends daa> a();

   boolean a(dgh var1, cwo var2, bvg var3);

   public static record a<T extends daa>(MapCodec<T> f, yn<wa, T> g) {
      public static final daa.a<czy> a = a("apply_effects", czy.a, czy.b);
      public static final daa.a<dac> b = a("remove_effects", dac.a, dac.b);
      public static final daa.a<czz> c = a("clear_all_effects", czz.b, czz.c);
      public static final daa.a<dad> d = a("teleport_randomly", dad.a, dad.b);
      public static final daa.a<dab> e = a("play_sound", dab.a, dab.b);

      private static <T extends daa> daa.a<T> a(String $$0, MapCodec<T> $$1, yn<wa, T> $$2) {
         return ke.a(mb.ay, $$0, new daa.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public yn<wa, T> b() {
         return this.g;
      }
   }
}
