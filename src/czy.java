import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface czy {
   Codec<czy> d = lz.ay.q().dispatch(czy::a, czy.a::a);
   zh<wu, czy> e = zf.a(ma.aE).b(czy::a, czy.a::b);

   czy.a<? extends czy> a();

   boolean a(dfm var1, cwm var2, bvh var3);

   public static record a<T extends czy>(MapCodec<T> f, zh<wu, T> g) {
      public static final czy.a<czw> a = a("apply_effects", czw.a, czw.b);
      public static final czy.a<daa> b = a("remove_effects", daa.a, daa.b);
      public static final czy.a<czx> c = a("clear_all_effects", czx.b, czx.c);
      public static final czy.a<dab> d = a("teleport_randomly", dab.a, dab.b);
      public static final czy.a<czz> e = a("play_sound", czz.a, czz.b);

      private static <T extends czy> czy.a<T> a(String $$0, MapCodec<T> $$1, zh<wu, T> $$2) {
         return kd.a(lz.ay, $$0, new czy.a<>($$1, $$2));
      }

      public MapCodec<T> a() {
         return this.f;
      }

      public zh<wu, T> b() {
         return this.g;
      }
   }
}
