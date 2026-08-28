import javax.annotation.Nullable;

public record dwx(int aj) {
   public static final ji.c<dwx> a = a("block_activate");
   public static final ji.c<dwx> b = a("block_attach");
   public static final ji.c<dwx> c = a("block_change");
   public static final ji.c<dwx> d = a("block_close");
   public static final ji.c<dwx> e = a("block_deactivate");
   public static final ji.c<dwx> f = a("block_destroy");
   public static final ji.c<dwx> g = a("block_detach");
   public static final ji.c<dwx> h = a("block_open");
   public static final ji.c<dwx> i = a("block_place");
   public static final ji.c<dwx> j = a("container_close");
   public static final ji.c<dwx> k = a("container_open");
   public static final ji.c<dwx> l = a("drink");
   public static final ji.c<dwx> m = a("eat");
   public static final ji.c<dwx> n = a("elytra_glide");
   public static final ji.c<dwx> o = a("entity_damage");
   public static final ji.c<dwx> p = a("entity_die");
   public static final ji.c<dwx> q = a("entity_dismount");
   public static final ji.c<dwx> r = a("entity_interact");
   public static final ji.c<dwx> s = a("entity_mount");
   public static final ji.c<dwx> t = a("entity_place");
   public static final ji.c<dwx> u = a("entity_action");
   public static final ji.c<dwx> v = a("equip");
   public static final ji.c<dwx> w = a("explode");
   public static final ji.c<dwx> x = a("flap");
   public static final ji.c<dwx> y = a("fluid_pickup");
   public static final ji.c<dwx> z = a("fluid_place");
   public static final ji.c<dwx> A = a("hit_ground");
   public static final ji.c<dwx> B = a("instrument_play");
   public static final ji.c<dwx> C = a("item_interact_finish");
   public static final ji.c<dwx> D = a("item_interact_start");
   public static final ji.c<dwx> E = a("jukebox_play", 10);
   public static final ji.c<dwx> F = a("jukebox_stop_play", 10);
   public static final ji.c<dwx> G = a("lightning_strike");
   public static final ji.c<dwx> H = a("note_block_play");
   public static final ji.c<dwx> I = a("prime_fuse");
   public static final ji.c<dwx> J = a("projectile_land");
   public static final ji.c<dwx> K = a("projectile_shoot");
   public static final ji.c<dwx> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dwx> M = a("shear");
   public static final ji.c<dwx> N = a("shriek", 32);
   public static final ji.c<dwx> O = a("splash");
   public static final ji.c<dwx> P = a("step");
   public static final ji.c<dwx> Q = a("swim");
   public static final ji.c<dwx> R = a("teleport");
   public static final ji.c<dwx> S = a("unequip");
   public static final ji.c<dwx> T = a("resonate_1");
   public static final ji.c<dwx> U = a("resonate_2");
   public static final ji.c<dwx> V = a("resonate_3");
   public static final ji.c<dwx> W = a("resonate_4");
   public static final ji.c<dwx> X = a("resonate_5");
   public static final ji.c<dwx> Y = a("resonate_6");
   public static final ji.c<dwx> Z = a("resonate_7");
   public static final ji.c<dwx> aa = a("resonate_8");
   public static final ji.c<dwx> ab = a("resonate_9");
   public static final ji.c<dwx> ac = a("resonate_10");
   public static final ji.c<dwx> ad = a("resonate_11");
   public static final ji.c<dwx> ae = a("resonate_12");
   public static final ji.c<dwx> af = a("resonate_13");
   public static final ji.c<dwx> ag = a("resonate_14");
   public static final ji.c<dwx> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dwx> a(jv<dwx> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dwx> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dwx> a(String $$0, int $$1) {
      return jv.b(lp.a, new alf($$0), new dwx($$1));
   }

   public static record a(@Nullable bsw a, @Nullable dse b) {
      public static dwx.a a(@Nullable bsw $$0) {
         return new dwx.a($$0, null);
      }

      public static dwx.a a(@Nullable dse $$0) {
         return new dwx.a(null, $$0);
      }

      public static dwx.a a(@Nullable bsw $$0, @Nullable dse $$1) {
         return new dwx.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dwx.b> {
      private final ji<dwx> a;
      private final evt b;
      private final dwx.a c;
      private final dwz d;
      private final double e;

      public b(ji<dwx> $$0, evt $$1, dwx.a $$2, dwz $$3, evt $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dwx.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dwx> a() {
         return this.a;
      }

      public evt b() {
         return this.b;
      }

      public dwx.a c() {
         return this.c;
      }

      public dwz d() {
         return this.d;
      }
   }
}
