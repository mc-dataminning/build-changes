import com.mojang.serialization.Codec;

public record cir(ald f) {
   public static final Codec<js<cir>> a = ala.a(me.F);
   public static final yt<wg, js<cir>> b = yr.b(me.F);
   public static final alc<cir> c = a(cji.a.a());
   public static final alc<cir> d = a(cji.b.a());
   public static final alc<cir> e = a(cji.c.a());

   private static alc<cir> a(String $$0) {
      return alc.a(me.F, ald.b($$0));
   }

   public static cir a(kf<cir> $$0) {
      a($$0, c, "textures/entity/frog/temperate_frog.png");
      a($$0, d, "textures/entity/frog/warm_frog.png");
      return a($$0, e, "textures/entity/frog/cold_frog.png");
   }

   private static cir a(kf<cir> $$0, alc<cir> $$1, String $$2) {
      return kf.a($$0, $$1, new cir(ald.b($$2)));
   }

   public ald a() {
      return this.f;
   }
}
