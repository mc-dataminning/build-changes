import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czz {
   Codec<czz> d = mb.ay.q().dispatch(czz::a, czz.a::a);
   ym<vz, czz> e = yk.a(mc.aE).b(czz::a, czz.a::b);

   czz.a<? extends czz> a();

   boolean a(dgg var1, cwn var2, bvf var3);

   public static record a<T extends czz>(MapCodec<T> f, ym<vz, T> g) {
      public static final czz.a<czx> a = a("apply_effects", czx.a, czx.b);
      public static final czz.a<dab> b = a("remove_effects", dab.a, dab.b);
      public static final czz.a<czy> c = a("clear_all_effects", czy.b, czy.c);
      public static final czz.a<dac> d = a("teleport_randomly", dac.a, dac.b);
      public static final czz.a<daa> e = a("play_sound", daa.a, daa.b);

      private static <T extends czz> czz.a<T> a(String $$0, MapCodec<T> $$1, ym<vz, T> $$2) {
         return ke.a(mb.ay, $$0, new czz.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public ym<vz, T> b() {
         return this.g;
      }
   }
}
