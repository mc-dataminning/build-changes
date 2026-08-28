import javax.annotation.Nullable;

public record dwt(int aj) {
   public static final ji.c<dwt> a = a("block_activate");
   public static final ji.c<dwt> b = a("block_attach");
   public static final ji.c<dwt> c = a("block_change");
   public static final ji.c<dwt> d = a("block_close");
   public static final ji.c<dwt> e = a("block_deactivate");
   public static final ji.c<dwt> f = a("block_destroy");
   public static final ji.c<dwt> g = a("block_detach");
   public static final ji.c<dwt> h = a("block_open");
   public static final ji.c<dwt> i = a("block_place");
   public static final ji.c<dwt> j = a("container_close");
   public static final ji.c<dwt> k = a("container_open");
   public static final ji.c<dwt> l = a("drink");
   public static final ji.c<dwt> m = a("eat");
   public static final ji.c<dwt> n = a("elytra_glide");
   public static final ji.c<dwt> o = a("entity_damage");
   public static final ji.c<dwt> p = a("entity_die");
   public static final ji.c<dwt> q = a("entity_dismount");
   public static final ji.c<dwt> r = a("entity_interact");
   public static final ji.c<dwt> s = a("entity_mount");
   public static final ji.c<dwt> t = a("entity_place");
   public static final ji.c<dwt> u = a("entity_action");
   public static final ji.c<dwt> v = a("equip");
   public static final ji.c<dwt> w = a("explode");
   public static final ji.c<dwt> x = a("flap");
   public static final ji.c<dwt> y = a("fluid_pickup");
   public static final ji.c<dwt> z = a("fluid_place");
   public static final ji.c<dwt> A = a("hit_ground");
   public static final ji.c<dwt> B = a("instrument_play");
   public static final ji.c<dwt> C = a("item_interact_finish");
   public static final ji.c<dwt> D = a("item_interact_start");
   public static final ji.c<dwt> E = a("jukebox_play", 10);
   public static final ji.c<dwt> F = a("jukebox_stop_play", 10);
   public static final ji.c<dwt> G = a("lightning_strike");
   public static final ji.c<dwt> H = a("note_block_play");
   public static final ji.c<dwt> I = a("prime_fuse");
   public static final ji.c<dwt> J = a("projectile_land");
   public static final ji.c<dwt> K = a("projectile_shoot");
   public static final ji.c<dwt> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dwt> M = a("shear");
   public static final ji.c<dwt> N = a("shriek", 32);
   public static final ji.c<dwt> O = a("splash");
   public static final ji.c<dwt> P = a("step");
   public static final ji.c<dwt> Q = a("swim");
   public static final ji.c<dwt> R = a("teleport");
   public static final ji.c<dwt> S = a("unequip");
   public static final ji.c<dwt> T = a("resonate_1");
   public static final ji.c<dwt> U = a("resonate_2");
   public static final ji.c<dwt> V = a("resonate_3");
   public static final ji.c<dwt> W = a("resonate_4");
   public static final ji.c<dwt> X = a("resonate_5");
   public static final ji.c<dwt> Y = a("resonate_6");
   public static final ji.c<dwt> Z = a("resonate_7");
   public static final ji.c<dwt> aa = a("resonate_8");
   public static final ji.c<dwt> ab = a("resonate_9");
   public static final ji.c<dwt> ac = a("resonate_10");
   public static final ji.c<dwt> ad = a("resonate_11");
   public static final ji.c<dwt> ae = a("resonate_12");
   public static final ji.c<dwt> af = a("resonate_13");
   public static final ji.c<dwt> ag = a("resonate_14");
   public static final ji.c<dwt> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dwt> a(jv<dwt> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dwt> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dwt> a(String $$0, int $$1) {
      return jv.b(lp.a, new ale($$0), new dwt($$1));
   }

   public static record a(@Nullable bss a, @Nullable dsa b) {
      public static dwt.a a(@Nullable bss $$0) {
         return new dwt.a($$0, null);
      }

      public static dwt.a a(@Nullable dsa $$0) {
         return new dwt.a(null, $$0);
      }

      public static dwt.a a(@Nullable bss $$0, @Nullable dsa $$1) {
         return new dwt.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dwt.b> {
      private final ji<dwt> a;
      private final evp b;
      private final dwt.a c;
      private final dwv d;
      private final double e;

      public b(ji<dwt> $$0, evp $$1, dwt.a $$2, dwv $$3, evp $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dwt.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dwt> a() {
         return this.a;
      }

      public evp b() {
         return this.b;
      }

      public dwt.a c() {
         return this.c;
      }

      public dwv d() {
         return this.d;
      }
   }
}
