import javax.annotation.Nullable;

public record dww(int aj) {
   public static final ji.c<dww> a = a("block_activate");
   public static final ji.c<dww> b = a("block_attach");
   public static final ji.c<dww> c = a("block_change");
   public static final ji.c<dww> d = a("block_close");
   public static final ji.c<dww> e = a("block_deactivate");
   public static final ji.c<dww> f = a("block_destroy");
   public static final ji.c<dww> g = a("block_detach");
   public static final ji.c<dww> h = a("block_open");
   public static final ji.c<dww> i = a("block_place");
   public static final ji.c<dww> j = a("container_close");
   public static final ji.c<dww> k = a("container_open");
   public static final ji.c<dww> l = a("drink");
   public static final ji.c<dww> m = a("eat");
   public static final ji.c<dww> n = a("elytra_glide");
   public static final ji.c<dww> o = a("entity_damage");
   public static final ji.c<dww> p = a("entity_die");
   public static final ji.c<dww> q = a("entity_dismount");
   public static final ji.c<dww> r = a("entity_interact");
   public static final ji.c<dww> s = a("entity_mount");
   public static final ji.c<dww> t = a("entity_place");
   public static final ji.c<dww> u = a("entity_action");
   public static final ji.c<dww> v = a("equip");
   public static final ji.c<dww> w = a("explode");
   public static final ji.c<dww> x = a("flap");
   public static final ji.c<dww> y = a("fluid_pickup");
   public static final ji.c<dww> z = a("fluid_place");
   public static final ji.c<dww> A = a("hit_ground");
   public static final ji.c<dww> B = a("instrument_play");
   public static final ji.c<dww> C = a("item_interact_finish");
   public static final ji.c<dww> D = a("item_interact_start");
   public static final ji.c<dww> E = a("jukebox_play", 10);
   public static final ji.c<dww> F = a("jukebox_stop_play", 10);
   public static final ji.c<dww> G = a("lightning_strike");
   public static final ji.c<dww> H = a("note_block_play");
   public static final ji.c<dww> I = a("prime_fuse");
   public static final ji.c<dww> J = a("projectile_land");
   public static final ji.c<dww> K = a("projectile_shoot");
   public static final ji.c<dww> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dww> M = a("shear");
   public static final ji.c<dww> N = a("shriek", 32);
   public static final ji.c<dww> O = a("splash");
   public static final ji.c<dww> P = a("step");
   public static final ji.c<dww> Q = a("swim");
   public static final ji.c<dww> R = a("teleport");
   public static final ji.c<dww> S = a("unequip");
   public static final ji.c<dww> T = a("resonate_1");
   public static final ji.c<dww> U = a("resonate_2");
   public static final ji.c<dww> V = a("resonate_3");
   public static final ji.c<dww> W = a("resonate_4");
   public static final ji.c<dww> X = a("resonate_5");
   public static final ji.c<dww> Y = a("resonate_6");
   public static final ji.c<dww> Z = a("resonate_7");
   public static final ji.c<dww> aa = a("resonate_8");
   public static final ji.c<dww> ab = a("resonate_9");
   public static final ji.c<dww> ac = a("resonate_10");
   public static final ji.c<dww> ad = a("resonate_11");
   public static final ji.c<dww> ae = a("resonate_12");
   public static final ji.c<dww> af = a("resonate_13");
   public static final ji.c<dww> ag = a("resonate_14");
   public static final ji.c<dww> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dww> a(jv<dww> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dww> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dww> a(String $$0, int $$1) {
      return jv.b(lp.a, new alf($$0), new dww($$1));
   }

   public static record a(@Nullable bsv a, @Nullable dsd b) {
      public static dww.a a(@Nullable bsv $$0) {
         return new dww.a($$0, null);
      }

      public static dww.a a(@Nullable dsd $$0) {
         return new dww.a(null, $$0);
      }

      public static dww.a a(@Nullable bsv $$0, @Nullable dsd $$1) {
         return new dww.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dww.b> {
      private final ji<dww> a;
      private final evs b;
      private final dww.a c;
      private final dwy d;
      private final double e;

      public b(ji<dww> $$0, evs $$1, dww.a $$2, dwy $$3, evs $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dww.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dww> a() {
         return this.a;
      }

      public evs b() {
         return this.b;
      }

      public dww.a c() {
         return this.c;
      }

      public dwy d() {
         return this.d;
      }
   }
}
