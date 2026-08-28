import javax.annotation.Nullable;

public record dwu(int aj) {
   public static final ji.c<dwu> a = a("block_activate");
   public static final ji.c<dwu> b = a("block_attach");
   public static final ji.c<dwu> c = a("block_change");
   public static final ji.c<dwu> d = a("block_close");
   public static final ji.c<dwu> e = a("block_deactivate");
   public static final ji.c<dwu> f = a("block_destroy");
   public static final ji.c<dwu> g = a("block_detach");
   public static final ji.c<dwu> h = a("block_open");
   public static final ji.c<dwu> i = a("block_place");
   public static final ji.c<dwu> j = a("container_close");
   public static final ji.c<dwu> k = a("container_open");
   public static final ji.c<dwu> l = a("drink");
   public static final ji.c<dwu> m = a("eat");
   public static final ji.c<dwu> n = a("elytra_glide");
   public static final ji.c<dwu> o = a("entity_damage");
   public static final ji.c<dwu> p = a("entity_die");
   public static final ji.c<dwu> q = a("entity_dismount");
   public static final ji.c<dwu> r = a("entity_interact");
   public static final ji.c<dwu> s = a("entity_mount");
   public static final ji.c<dwu> t = a("entity_place");
   public static final ji.c<dwu> u = a("entity_action");
   public static final ji.c<dwu> v = a("equip");
   public static final ji.c<dwu> w = a("explode");
   public static final ji.c<dwu> x = a("flap");
   public static final ji.c<dwu> y = a("fluid_pickup");
   public static final ji.c<dwu> z = a("fluid_place");
   public static final ji.c<dwu> A = a("hit_ground");
   public static final ji.c<dwu> B = a("instrument_play");
   public static final ji.c<dwu> C = a("item_interact_finish");
   public static final ji.c<dwu> D = a("item_interact_start");
   public static final ji.c<dwu> E = a("jukebox_play", 10);
   public static final ji.c<dwu> F = a("jukebox_stop_play", 10);
   public static final ji.c<dwu> G = a("lightning_strike");
   public static final ji.c<dwu> H = a("note_block_play");
   public static final ji.c<dwu> I = a("prime_fuse");
   public static final ji.c<dwu> J = a("projectile_land");
   public static final ji.c<dwu> K = a("projectile_shoot");
   public static final ji.c<dwu> L = a("sculk_sensor_tendrils_clicking");
   public static final ji.c<dwu> M = a("shear");
   public static final ji.c<dwu> N = a("shriek", 32);
   public static final ji.c<dwu> O = a("splash");
   public static final ji.c<dwu> P = a("step");
   public static final ji.c<dwu> Q = a("swim");
   public static final ji.c<dwu> R = a("teleport");
   public static final ji.c<dwu> S = a("unequip");
   public static final ji.c<dwu> T = a("resonate_1");
   public static final ji.c<dwu> U = a("resonate_2");
   public static final ji.c<dwu> V = a("resonate_3");
   public static final ji.c<dwu> W = a("resonate_4");
   public static final ji.c<dwu> X = a("resonate_5");
   public static final ji.c<dwu> Y = a("resonate_6");
   public static final ji.c<dwu> Z = a("resonate_7");
   public static final ji.c<dwu> aa = a("resonate_8");
   public static final ji.c<dwu> ab = a("resonate_9");
   public static final ji.c<dwu> ac = a("resonate_10");
   public static final ji.c<dwu> ad = a("resonate_11");
   public static final ji.c<dwu> ae = a("resonate_12");
   public static final ji.c<dwu> af = a("resonate_13");
   public static final ji.c<dwu> ag = a("resonate_14");
   public static final ji.c<dwu> ah = a("resonate_15");
   public static final int ai = 16;

   public static ji<dwu> a(jv<dwu> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ji.c<dwu> a(String $$0) {
      return a($$0, 16);
   }

   private static ji.c<dwu> a(String $$0, int $$1) {
      return jv.b(lp.a, new ale($$0), new dwu($$1));
   }

   public static record a(@Nullable bst a, @Nullable dsb b) {
      public static dwu.a a(@Nullable bst $$0) {
         return new dwu.a($$0, null);
      }

      public static dwu.a a(@Nullable dsb $$0) {
         return new dwu.a(null, $$0);
      }

      public static dwu.a a(@Nullable bst $$0, @Nullable dsb $$1) {
         return new dwu.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dwu.b> {
      private final ji<dwu> a;
      private final evq b;
      private final dwu.a c;
      private final dww d;
      private final double e;

      public b(ji<dwu> $$0, evq $$1, dwu.a $$2, dww $$3, evq $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dwu.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ji<dwu> a() {
         return this.a;
      }

      public evq b() {
         return this.b;
      }

      public dwu.a c() {
         return this.c;
      }

      public dww d() {
         return this.d;
      }
   }
}
