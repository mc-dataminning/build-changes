import javax.annotation.Nullable;

public record dxv(int aj) {
   public static final ja.c<dxv> a = a("block_activate");
   public static final ja.c<dxv> b = a("block_attach");
   public static final ja.c<dxv> c = a("block_change");
   public static final ja.c<dxv> d = a("block_close");
   public static final ja.c<dxv> e = a("block_deactivate");
   public static final ja.c<dxv> f = a("block_destroy");
   public static final ja.c<dxv> g = a("block_detach");
   public static final ja.c<dxv> h = a("block_open");
   public static final ja.c<dxv> i = a("block_place");
   public static final ja.c<dxv> j = a("container_close");
   public static final ja.c<dxv> k = a("container_open");
   public static final ja.c<dxv> l = a("drink");
   public static final ja.c<dxv> m = a("eat");
   public static final ja.c<dxv> n = a("elytra_glide");
   public static final ja.c<dxv> o = a("entity_damage");
   public static final ja.c<dxv> p = a("entity_die");
   public static final ja.c<dxv> q = a("entity_dismount");
   public static final ja.c<dxv> r = a("entity_interact");
   public static final ja.c<dxv> s = a("entity_mount");
   public static final ja.c<dxv> t = a("entity_place");
   public static final ja.c<dxv> u = a("entity_action");
   public static final ja.c<dxv> v = a("equip");
   public static final ja.c<dxv> w = a("explode");
   public static final ja.c<dxv> x = a("flap");
   public static final ja.c<dxv> y = a("fluid_pickup");
   public static final ja.c<dxv> z = a("fluid_place");
   public static final ja.c<dxv> A = a("hit_ground");
   public static final ja.c<dxv> B = a("instrument_play");
   public static final ja.c<dxv> C = a("item_interact_finish");
   public static final ja.c<dxv> D = a("item_interact_start");
   public static final ja.c<dxv> E = a("jukebox_play", 10);
   public static final ja.c<dxv> F = a("jukebox_stop_play", 10);
   public static final ja.c<dxv> G = a("lightning_strike");
   public static final ja.c<dxv> H = a("note_block_play");
   public static final ja.c<dxv> I = a("prime_fuse");
   public static final ja.c<dxv> J = a("projectile_land");
   public static final ja.c<dxv> K = a("projectile_shoot");
   public static final ja.c<dxv> L = a("sculk_sensor_tendrils_clicking");
   public static final ja.c<dxv> M = a("shear");
   public static final ja.c<dxv> N = a("shriek", 32);
   public static final ja.c<dxv> O = a("splash");
   public static final ja.c<dxv> P = a("step");
   public static final ja.c<dxv> Q = a("swim");
   public static final ja.c<dxv> R = a("teleport");
   public static final ja.c<dxv> S = a("unequip");
   public static final ja.c<dxv> T = a("resonate_1");
   public static final ja.c<dxv> U = a("resonate_2");
   public static final ja.c<dxv> V = a("resonate_3");
   public static final ja.c<dxv> W = a("resonate_4");
   public static final ja.c<dxv> X = a("resonate_5");
   public static final ja.c<dxv> Y = a("resonate_6");
   public static final ja.c<dxv> Z = a("resonate_7");
   public static final ja.c<dxv> aa = a("resonate_8");
   public static final ja.c<dxv> ab = a("resonate_9");
   public static final ja.c<dxv> ac = a("resonate_10");
   public static final ja.c<dxv> ad = a("resonate_11");
   public static final ja.c<dxv> ae = a("resonate_12");
   public static final ja.c<dxv> af = a("resonate_13");
   public static final ja.c<dxv> ag = a("resonate_14");
   public static final ja.c<dxv> ah = a("resonate_15");
   public static final int ai = 16;

   public static ja<dxv> a(jn<dxv> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ja.c<dxv> a(String $$0) {
      return a($$0, 16);
   }

   private static ja.c<dxv> a(String $$0, int $$1) {
      return jn.b(lh.a, new akt($$0), new dxv($$1));
   }

   public static record a(@Nullable brv a, @Nullable dtc b) {
      public static dxv.a a(@Nullable brv $$0) {
         return new dxv.a($$0, null);
      }

      public static dxv.a a(@Nullable dtc $$0) {
         return new dxv.a(null, $$0);
      }

      public static dxv.a a(@Nullable brv $$0, @Nullable dtc $$1) {
         return new dxv.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxv.b> {
      private final ja<dxv> a;
      private final ewu b;
      private final dxv.a c;
      private final dxx d;
      private final double e;

      public b(ja<dxv> $$0, ewu $$1, dxv.a $$2, dxx $$3, ewu $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxv.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ja<dxv> a() {
         return this.a;
      }

      public ewu b() {
         return this.b;
      }

      public dxv.a c() {
         return this.c;
      }

      public dxx d() {
         return this.d;
      }
   }
}
