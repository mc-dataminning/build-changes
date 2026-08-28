import javax.annotation.Nullable;

public record dwv(int aj) {
   public static final ji.c<dwv> a = a("block_activate");
   public static final ji.c<dwv> b = a("block_attach");
   public static final ji.c<dwv> c = a("block_change");
   public static final ji.c<dwv> d = a("block_close");
   public static final ji.c<dwv> e = a("block_deactivate");
   public static final ji.c<dwv> f = a("block_destroy");
   public static final ji.c<dwv> g = a("block_detach");
   public static final ji.c<dwv> h = a("block_open");
   public static final ji.c<dwv> i = a("block_place");
   public static final ji.c<dwv> j = a("container_close");
   public static final ji.c<dwv> k = a("container_open");
   public static final ji.c<dwv> l = a("drink");
   public static final ji.c<dwv> m = a("eat");
   public static final ji.c<dwv> n = a("elytra_glide");
   public static final ji.c<dwv> o = a("entity_damage");
   public static final ji.c<dwv> p = a("entity_die");
   public static final ji.c<dwv> q = a("entity_dismount");
   public static final ji.c<dwv> r = a("entity_interact");
   public static final ji.c<dwv> s = a("entity_mount");
   public static final ji.c<dwv> t = a("entity_place");
   public static final ji.c<dwv> u = a("entity_action");
   public static final ji.c<dwv> v = a("equip");
   public static final ji.c<dwv> w = a("explode");
   public static final ji.c<dwv> x = a("flap");
   public static final ji.c<dwv> y = a("fluid_pickup");
   public static final ji.c<dwv> z = a("fluid_place");
   public static final ji.c<dwv> A = a("hit_ground");
   public static final ji.c<dwv> B = a("instrument_play");
   public static final ji.c<dwv> C = a("item_interact_finish");
   public static final ji.c<dwv> D = a("item_interact_start");
   public static final ji.c<dwv> E = a("jukebox_play", 10);
   public static final ji.c<dwv> F = a("jukebox_stop_play", 10);
   public static final ji.c<dwv> G = a("lightning_strike");
   public static final ji.c<dwv> H = a("note_block_play");
   public static final ji.c<dwv> I = a("prime_fuse");
   public static final ji.c<dwv> J = a("projectile_land");
   public static final ji.c<dwv> K = a("projectile_shoot");
   public static final ji.c<dwv> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dwv> M = a("shear");
   public static final ji.c<dwv> N = a("shriek", 32);
   public static final ji.c<dwv> O = a("splash");
   public static final ji.c<dwv> P = a("step");
   public static final ji.c<dwv> Q = a("swim");
   public static final ji.c<dwv> R = a("teleport");
   public static final ji.c<dwv> S = a("unequip");
   public static final ji.c<dwv> T = a("resonate_1");
   public static final ji.c<dwv> U = a("resonate_2");
   public static final ji.c<dwv> V = a("resonate_3");
   public static final ji.c<dwv> W = a("resonate_4");
   public static final ji.c<dwv> X = a("resonate_5");
   public static final ji.c<dwv> Y = a("resonate_6");
   public static final ji.c<dwv> Z = a("resonate_7");
   public static final ji.c<dwv> aa = a("resonate_8");
   public static final ji.c<dwv> ab = a("resonate_9");
   public static final ji.c<dwv> ac = a("resonate_10");
   public static final ji.c<dwv> ad = a("resonate_11");
   public static final ji.c<dwv> ae = a("resonate_12");
   public static final ji.c<dwv> af = a("resonate_13");
   public static final ji.c<dwv> ag = a("resonate_14");
   public static final ji.c<dwv> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dwv> a(jv<dwv> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dwv> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dwv> a(String $$0, int $$1) {
      return jv.b(lp.a, new alf($$0), new dwv($$1));
   }

   public static record a(@Nullable bsu a, @Nullable dsc b) {
      public static dwv.a a(@Nullable bsu $$0) {
         return new dwv.a($$0, null);
      }

      public static dwv.a a(@Nullable dsc $$0) {
         return new dwv.a(null, $$0);
      }

      public static dwv.a a(@Nullable bsu $$0, @Nullable dsc $$1) {
         return new dwv.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dwv.b> {
      private final ji<dwv> a;
      private final evr b;
      private final dwv.a c;
      private final dwx d;
      private final double e;

      public b(ji<dwv> $$0, evr $$1, dwv.a $$2, dwx $$3, evr $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dwv.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dwv> a() {
         return this.a;
      }

      public evr b() {
         return this.b;
      }

      public dwv.a c() {
         return this.c;
      }

      public dwx d() {
         return this.d;
      }
   }
}
