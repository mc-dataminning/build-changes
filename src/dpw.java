import javax.annotation.Nullable;

public record dpw(int aj) {
   public static final ij.c<dpw> a = a("block_activate");
   public static final ij.c<dpw> b = a("block_attach");
   public static final ij.c<dpw> c = a("block_change");
   public static final ij.c<dpw> d = a("block_close");
   public static final ij.c<dpw> e = a("block_deactivate");
   public static final ij.c<dpw> f = a("block_destroy");
   public static final ij.c<dpw> g = a("block_detach");
   public static final ij.c<dpw> h = a("block_open");
   public static final ij.c<dpw> i = a("block_place");
   public static final ij.c<dpw> j = a("container_close");
   public static final ij.c<dpw> k = a("container_open");
   public static final ij.c<dpw> l = a("drink");
   public static final ij.c<dpw> m = a("eat");
   public static final ij.c<dpw> n = a("elytra_glide");
   public static final ij.c<dpw> o = a("entity_damage");
   public static final ij.c<dpw> p = a("entity_die");
   public static final ij.c<dpw> q = a("entity_dismount");
   public static final ij.c<dpw> r = a("entity_interact");
   public static final ij.c<dpw> s = a("entity_mount");
   public static final ij.c<dpw> t = a("entity_place");
   public static final ij.c<dpw> u = a("entity_action");
   public static final ij.c<dpw> v = a("equip");
   public static final ij.c<dpw> w = a("explode");
   public static final ij.c<dpw> x = a("flap");
   public static final ij.c<dpw> y = a("fluid_pickup");
   public static final ij.c<dpw> z = a("fluid_place");
   public static final ij.c<dpw> A = a("hit_ground");
   public static final ij.c<dpw> B = a("instrument_play");
   public static final ij.c<dpw> C = a("item_interact_finish");
   public static final ij.c<dpw> D = a("item_interact_start");
   public static final ij.c<dpw> E = a("jukebox_play", 10);
   public static final ij.c<dpw> F = a("jukebox_stop_play", 10);
   public static final ij.c<dpw> G = a("lightning_strike");
   public static final ij.c<dpw> H = a("note_block_play");
   public static final ij.c<dpw> I = a("prime_fuse");
   public static final ij.c<dpw> J = a("projectile_land");
   public static final ij.c<dpw> K = a("projectile_shoot");
   public static final ij.c<dpw> L = a("sculk_sensor_tendrils_clicking");
   public static final ij.c<dpw> M = a("shear");
   public static final ij.c<dpw> N = a("shriek", 32);
   public static final ij.c<dpw> O = a("splash");
   public static final ij.c<dpw> P = a("step");
   public static final ij.c<dpw> Q = a("swim");
   public static final ij.c<dpw> R = a("teleport");
   public static final ij.c<dpw> S = a("unequip");
   public static final ij.c<dpw> T = a("resonate_1");
   public static final ij.c<dpw> U = a("resonate_2");
   public static final ij.c<dpw> V = a("resonate_3");
   public static final ij.c<dpw> W = a("resonate_4");
   public static final ij.c<dpw> X = a("resonate_5");
   public static final ij.c<dpw> Y = a("resonate_6");
   public static final ij.c<dpw> Z = a("resonate_7");
   public static final ij.c<dpw> aa = a("resonate_8");
   public static final ij.c<dpw> ab = a("resonate_9");
   public static final ij.c<dpw> ac = a("resonate_10");
   public static final ij.c<dpw> ad = a("resonate_11");
   public static final ij.c<dpw> ae = a("resonate_12");
   public static final ij.c<dpw> af = a("resonate_13");
   public static final ij.c<dpw> ag = a("resonate_14");
   public static final ij.c<dpw> ah = a("resonate_15");
   public static final int ai = 16;

   public static ij<dpw> a(iv<dpw> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ij.c<dpw> a(String $$0) {
      return a($$0, 16);
   }

   private static ij.c<dpw> a(String $$0, int $$1) {
      return iv.b(kf.a, new aiy($$0), new dpw($$1));
   }

   public static record a(@Nullable bnq a, @Nullable dlj b) {
      public static dpw.a a(@Nullable bnq $$0) {
         return new dpw.a($$0, null);
      }

      public static dpw.a a(@Nullable dlj $$0) {
         return new dpw.a(null, $$0);
      }

      public static dpw.a a(@Nullable bnq $$0, @Nullable dlj $$1) {
         return new dpw.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dpw.b> {
      private final ij<dpw> a;
      private final enz b;
      private final dpw.a c;
      private final dpy d;
      private final double e;

      public b(ij<dpw> $$0, enz $$1, dpw.a $$2, dpy $$3, enz $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dpw.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ij<dpw> a() {
         return this.a;
      }

      public enz b() {
         return this.b;
      }

      public dpw.a c() {
         return this.c;
      }

      public dpy d() {
         return this.d;
      }
   }
}
