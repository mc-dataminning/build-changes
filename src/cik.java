import com.mojang.serialization.Codec;

public record cik(ald n) {
   public static final Codec<js<cik>> a = ala.a(me.l);
   public static final yt<wg, js<cik>> b = yr.b(me.l);
   public static final alc<cik> c = a("tabby");
   public static final alc<cik> d = a("black");
   public static final alc<cik> e = a("red");
   public static final alc<cik> f = a("siamese");
   public static final alc<cik> g = a("british_shorthair");
   public static final alc<cik> h = a("calico");
   public static final alc<cik> i = a("persian");
   public static final alc<cik> j = a("ragdoll");
   public static final alc<cik> k = a("white");
   public static final alc<cik> l = a("jellie");
   public static final alc<cik> m = a("all_black");

   private static alc<cik> a(String $$0) {
      return alc.a(me.l, ald.b($$0));
   }

   public static cik a(kf<cik> $$0) {
      a($$0, c, "textures/entity/cat/tabby.png");
      a($$0, d, "textures/entity/cat/black.png");
      a($$0, e, "textures/entity/cat/red.png");
      a($$0, f, "textures/entity/cat/siamese.png");
      a($$0, g, "textures/entity/cat/british_shorthair.png");
      a($$0, h, "textures/entity/cat/calico.png");
      a($$0, i, "textures/entity/cat/persian.png");
      a($$0, j, "textures/entity/cat/ragdoll.png");
      a($$0, k, "textures/entity/cat/white.png");
      a($$0, l, "textures/entity/cat/jellie.png");
      return a($$0, m, "textures/entity/cat/all_black.png");
   }

   private static cik a(kf<cik> $$0, alc<cik> $$1, String $$2) {
      return kf.a($$0, $$1, new cik(ald.b($$2)));
   }

   public ald a() {
      return this.n;
   }
}
