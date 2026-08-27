import javax.annotation.Nullable;

public record dur(int aj) {
   public static final iv.c<dur> a = a("block_activate");
   public static final iv.c<dur> b = a("block_attach");
   public static final iv.c<dur> c = a("block_change");
   public static final iv.c<dur> d = a("block_close");
   public static final iv.c<dur> e = a("block_deactivate");
   public static final iv.c<dur> f = a("block_destroy");
   public static final iv.c<dur> g = a("block_detach");
   public static final iv.c<dur> h = a("block_open");
   public static final iv.c<dur> i = a("block_place");
   public static final iv.c<dur> j = a("container_close");
   public static final iv.c<dur> k = a("container_open");
   public static final iv.c<dur> l = a("drink");
   public static final iv.c<dur> m = a("eat");
   public static final iv.c<dur> n = a("elytra_glide");
   public static final iv.c<dur> o = a("entity_damage");
   public static final iv.c<dur> p = a("entity_die");
   public static final iv.c<dur> q = a("entity_dismount");
   public static final iv.c<dur> r = a("entity_interact");
   public static final iv.c<dur> s = a("entity_mount");
   public static final iv.c<dur> t = a("entity_place");
   public static final iv.c<dur> u = a("entity_action");
   public static final iv.c<dur> v = a("equip");
   public static final iv.c<dur> w = a("explode");
   public static final iv.c<dur> x = a("flap");
   public static final iv.c<dur> y = a("fluid_pickup");
   public static final iv.c<dur> z = a("fluid_place");
   public static final iv.c<dur> A = a("hit_ground");
   public static final iv.c<dur> B = a("instrument_play");
   public static final iv.c<dur> C = a("item_interact_finish");
   public static final iv.c<dur> D = a("item_interact_start");
   public static final iv.c<dur> E = a("jukebox_play", 10);
   public static final iv.c<dur> F = a("jukebox_stop_play", 10);
   public static final iv.c<dur> G = a("lightning_strike");
   public static final iv.c<dur> H = a("note_block_play");
   public static final iv.c<dur> I = a("prime_fuse");
   public static final iv.c<dur> J = a("projectile_land");
   public static final iv.c<dur> K = a("projectile_shoot");
   public static final iv.c<dur> L = a("sculk_sensor_tendrils_clicking");
   public static final iv.c<dur> M = a("shear");
   public static final iv.c<dur> N = a("shriek", 32);
   public static final iv.c<dur> O = a("splash");
   public static final iv.c<dur> P = a("step");
   public static final iv.c<dur> Q = a("swim");
   public static final iv.c<dur> R = a("teleport");
   public static final iv.c<dur> S = a("unequip");
   public static final iv.c<dur> T = a("resonate_1");
   public static final iv.c<dur> U = a("resonate_2");
   public static final iv.c<dur> V = a("resonate_3");
   public static final iv.c<dur> W = a("resonate_4");
   public static final iv.c<dur> X = a("resonate_5");
   public static final iv.c<dur> Y = a("resonate_6");
   public static final iv.c<dur> Z = a("resonate_7");
   public static final iv.c<dur> aa = a("resonate_8");
   public static final iv.c<dur> ab = a("resonate_9");
   public static final iv.c<dur> ac = a("resonate_10");
   public static final iv.c<dur> ad = a("resonate_11");
   public static final iv.c<dur> ae = a("resonate_12");
   public static final iv.c<dur> af = a("resonate_13");
   public static final iv.c<dur> ag = a("resonate_14");
   public static final iv.c<dur> ah = a("resonate_15");
   public static final int ai = 16;

   public static iv<dur> a(ji<dur> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static iv.c<dur> a(String $$0) {
      return a($$0, 16);
   }

   private static iv.c<dur> a(String $$0, int $$1) {
      return ji.b(lc.a, new akf($$0), new dur($$1));
   }

   public static record a(@Nullable bql a, @Nullable dpy b) {
      public static dur.a a(@Nullable bql $$0) {
         return new dur.a($$0, null);
      }

      public static dur.a a(@Nullable dpy $$0) {
         return new dur.a(null, $$0);
      }

      public static dur.a a(@Nullable bql $$0, @Nullable dpy $$1) {
         return new dur.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dur.b> {
      private final iv<dur> a;
      private final etf b;
      private final dur.a c;
      private final dut d;
      private final double e;

      public b(iv<dur> $$0, etf $$1, dur.a $$2, dut $$3, etf $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dur.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public iv<dur> a() {
         return this.a;
      }

      public etf b() {
         return this.b;
      }

      public dur.a c() {
         return this.c;
      }

      public dut d() {
         return this.d;
      }
   }
}
