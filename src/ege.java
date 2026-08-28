import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ege(int ak) {
   public static final jf.c<ege> a = a("block_activate");
   public static final jf.c<ege> b = a("block_attach");
   public static final jf.c<ege> c = a("block_change");
   public static final jf.c<ege> d = a("block_close");
   public static final jf.c<ege> e = a("block_deactivate");
   public static final jf.c<ege> f = a("block_destroy");
   public static final jf.c<ege> g = a("block_detach");
   public static final jf.c<ege> h = a("block_open");
   public static final jf.c<ege> i = a("block_place");
   public static final jf.c<ege> j = a("container_close");
   public static final jf.c<ege> k = a("container_open");
   public static final jf.c<ege> l = a("drink");
   public static final jf.c<ege> m = a("eat");
   public static final jf.c<ege> n = a("elytra_glide");
   public static final jf.c<ege> o = a("entity_damage");
   public static final jf.c<ege> p = a("entity_die");
   public static final jf.c<ege> q = a("entity_dismount");
   public static final jf.c<ege> r = a("entity_interact");
   public static final jf.c<ege> s = a("entity_mount");
   public static final jf.c<ege> t = a("entity_place");
   public static final jf.c<ege> u = a("entity_action");
   public static final jf.c<ege> v = a("equip");
   public static final jf.c<ege> w = a("explode");
   public static final jf.c<ege> x = a("flap");
   public static final jf.c<ege> y = a("fluid_pickup");
   public static final jf.c<ege> z = a("fluid_place");
   public static final jf.c<ege> A = a("hit_ground");
   public static final jf.c<ege> B = a("instrument_play");
   public static final jf.c<ege> C = a("item_interact_finish");
   public static final jf.c<ege> D = a("item_interact_start");
   public static final jf.c<ege> E = a("jukebox_play", 10);
   public static final jf.c<ege> F = a("jukebox_stop_play", 10);
   public static final jf.c<ege> G = a("lightning_strike");
   public static final jf.c<ege> H = a("note_block_play");
   public static final jf.c<ege> I = a("prime_fuse");
   public static final jf.c<ege> J = a("projectile_land");
   public static final jf.c<ege> K = a("projectile_shoot");
   public static final jf.c<ege> L = a("sculk_sensor_tendrils_clicking");
   public static final jf.c<ege> M = a("shear");
   public static final jf.c<ege> N = a("shriek", 32);
   public static final jf.c<ege> O = a("splash");
   public static final jf.c<ege> P = a("step");
   public static final jf.c<ege> Q = a("swim");
   public static final jf.c<ege> R = a("teleport");
   public static final jf.c<ege> S = a("unequip");
   public static final jf.c<ege> T = a("resonate_1");
   public static final jf.c<ege> U = a("resonate_2");
   public static final jf.c<ege> V = a("resonate_3");
   public static final jf.c<ege> W = a("resonate_4");
   public static final jf.c<ege> X = a("resonate_5");
   public static final jf.c<ege> Y = a("resonate_6");
   public static final jf.c<ege> Z = a("resonate_7");
   public static final jf.c<ege> aa = a("resonate_8");
   public static final jf.c<ege> ab = a("resonate_9");
   public static final jf.c<ege> ac = a("resonate_10");
   public static final jf.c<ege> ad = a("resonate_11");
   public static final jf.c<ege> ae = a("resonate_12");
   public static final jf.c<ege> af = a("resonate_13");
   public static final jf.c<ege> ag = a("resonate_14");
   public static final jf.c<ege> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jf<ege>> aj = alf.a(mh.H);

   public static jf<ege> a(js<ege> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jf.c<ege> a(String $$0) {
      return a($$0, 16);
   }

   private static jf.c<ege> a(String $$0, int $$1) {
      return js.b(mg.a, ali.b($$0), new ege($$1));
   }

   public static record a(@Nullable bwt a, @Nullable ebe b) {
      public static ege.a a(@Nullable bwt $$0) {
         return new ege.a($$0, null);
      }

      public static ege.a a(@Nullable ebe $$0) {
         return new ege.a(null, $$0);
      }

      public static ege.a a(@Nullable bwt $$0, @Nullable ebe $$1) {
         return new ege.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ege.b> {
      private final jf<ege> a;
      private final ffq b;
      private final ege.a c;
      private final egg d;
      private final double e;

      public b(jf<ege> $$0, ffq $$1, ege.a $$2, egg $$3, ffq $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ege.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jf<ege> a() {
         return this.a;
      }

      public ffq b() {
         return this.b;
      }

      public ege.a c() {
         return this.c;
      }

      public egg d() {
         return this.d;
      }
   }
}
