import javax.annotation.Nullable;

public record dwq(int aj) {
   public static final ji.c<dwq> a = a("block_activate");
   public static final ji.c<dwq> b = a("block_attach");
   public static final ji.c<dwq> c = a("block_change");
   public static final ji.c<dwq> d = a("block_close");
   public static final ji.c<dwq> e = a("block_deactivate");
   public static final ji.c<dwq> f = a("block_destroy");
   public static final ji.c<dwq> g = a("block_detach");
   public static final ji.c<dwq> h = a("block_open");
   public static final ji.c<dwq> i = a("block_place");
   public static final ji.c<dwq> j = a("container_close");
   public static final ji.c<dwq> k = a("container_open");
   public static final ji.c<dwq> l = a("drink");
   public static final ji.c<dwq> m = a("eat");
   public static final ji.c<dwq> n = a("elytra_glide");
   public static final ji.c<dwq> o = a("entity_damage");
   public static final ji.c<dwq> p = a("entity_die");
   public static final ji.c<dwq> q = a("entity_dismount");
   public static final ji.c<dwq> r = a("entity_interact");
   public static final ji.c<dwq> s = a("entity_mount");
   public static final ji.c<dwq> t = a("entity_place");
   public static final ji.c<dwq> u = a("entity_action");
   public static final ji.c<dwq> v = a("equip");
   public static final ji.c<dwq> w = a("explode");
   public static final ji.c<dwq> x = a("flap");
   public static final ji.c<dwq> y = a("fluid_pickup");
   public static final ji.c<dwq> z = a("fluid_place");
   public static final ji.c<dwq> A = a("hit_ground");
   public static final ji.c<dwq> B = a("instrument_play");
   public static final ji.c<dwq> C = a("item_interact_finish");
   public static final ji.c<dwq> D = a("item_interact_start");
   public static final ji.c<dwq> E = a("jukebox_play", 10);
   public static final ji.c<dwq> F = a("jukebox_stop_play", 10);
   public static final ji.c<dwq> G = a("lightning_strike");
   public static final ji.c<dwq> H = a("note_block_play");
   public static final ji.c<dwq> I = a("prime_fuse");
   public static final ji.c<dwq> J = a("projectile_land");
   public static final ji.c<dwq> K = a("projectile_shoot");
   public static final ji.c<dwq> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dwq> M = a("shear");
   public static final ji.c<dwq> N = a("shriek", 32);
   public static final ji.c<dwq> O = a("splash");
   public static final ji.c<dwq> P = a("step");
   public static final ji.c<dwq> Q = a("swim");
   public static final ji.c<dwq> R = a("teleport");
   public static final ji.c<dwq> S = a("unequip");
   public static final ji.c<dwq> T = a("resonate_1");
   public static final ji.c<dwq> U = a("resonate_2");
   public static final ji.c<dwq> V = a("resonate_3");
   public static final ji.c<dwq> W = a("resonate_4");
   public static final ji.c<dwq> X = a("resonate_5");
   public static final ji.c<dwq> Y = a("resonate_6");
   public static final ji.c<dwq> Z = a("resonate_7");
   public static final ji.c<dwq> aa = a("resonate_8");
   public static final ji.c<dwq> ab = a("resonate_9");
   public static final ji.c<dwq> ac = a("resonate_10");
   public static final ji.c<dwq> ad = a("resonate_11");
   public static final ji.c<dwq> ae = a("resonate_12");
   public static final ji.c<dwq> af = a("resonate_13");
   public static final ji.c<dwq> ag = a("resonate_14");
   public static final ji.c<dwq> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dwq> a(jv<dwq> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dwq> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dwq> a(String $$0, int $$1) {
      return jv.b(lp.a, new alb($$0), new dwq($$1));
   }

   public static record a(@Nullable bsp a, @Nullable drx b) {
      public static dwq.a a(@Nullable bsp $$0) {
         return new dwq.a($$0, null);
      }

      public static dwq.a a(@Nullable drx $$0) {
         return new dwq.a(null, $$0);
      }

      public static dwq.a a(@Nullable bsp $$0, @Nullable drx $$1) {
         return new dwq.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dwq.b> {
      private final ji<dwq> a;
      private final evm b;
      private final dwq.a c;
      private final dws d;
      private final double e;

      public b(ji<dwq> $$0, evm $$1, dwq.a $$2, dws $$3, evm $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dwq.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dwq> a() {
         return this.a;
      }

      public evm b() {
         return this.b;
      }

      public dwq.a c() {
         return this.c;
      }

      public dws d() {
         return this.d;
      }
   }
}
