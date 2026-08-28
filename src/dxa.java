import javax.annotation.Nullable;

public record dxa(int aj) {
   public static final jj.c<dxa> a = a("block_activate");
   public static final jj.c<dxa> b = a("block_attach");
   public static final jj.c<dxa> c = a("block_change");
   public static final jj.c<dxa> d = a("block_close");
   public static final jj.c<dxa> e = a("block_deactivate");
   public static final jj.c<dxa> f = a("block_destroy");
   public static final jj.c<dxa> g = a("block_detach");
   public static final jj.c<dxa> h = a("block_open");
   public static final jj.c<dxa> i = a("block_place");
   public static final jj.c<dxa> j = a("container_close");
   public static final jj.c<dxa> k = a("container_open");
   public static final jj.c<dxa> l = a("drink");
   public static final jj.c<dxa> m = a("eat");
   public static final jj.c<dxa> n = a("elytra_glide");
   public static final jj.c<dxa> o = a("entity_damage");
   public static final jj.c<dxa> p = a("entity_die");
   public static final jj.c<dxa> q = a("entity_dismount");
   public static final jj.c<dxa> r = a("entity_interact");
   public static final jj.c<dxa> s = a("entity_mount");
   public static final jj.c<dxa> t = a("entity_place");
   public static final jj.c<dxa> u = a("entity_action");
   public static final jj.c<dxa> v = a("equip");
   public static final jj.c<dxa> w = a("explode");
   public static final jj.c<dxa> x = a("flap");
   public static final jj.c<dxa> y = a("fluid_pickup");
   public static final jj.c<dxa> z = a("fluid_place");
   public static final jj.c<dxa> A = a("hit_ground");
   public static final jj.c<dxa> B = a("instrument_play");
   public static final jj.c<dxa> C = a("item_interact_finish");
   public static final jj.c<dxa> D = a("item_interact_start");
   public static final jj.c<dxa> E = a("jukebox_play", 10);
   public static final jj.c<dxa> F = a("jukebox_stop_play", 10);
   public static final jj.c<dxa> G = a("lightning_strike");
   public static final jj.c<dxa> H = a("note_block_play");
   public static final jj.c<dxa> I = a("prime_fuse");
   public static final jj.c<dxa> J = a("projectile_land");
   public static final jj.c<dxa> K = a("projectile_shoot");
   public static final jj.c<dxa> L = a("sculk_sensor_tendrils_clicking");
   public static final jj.c<dxa> M = a("shear");
   public static final jj.c<dxa> N = a("shriek", 32);
   public static final jj.c<dxa> O = a("splash");
   public static final jj.c<dxa> P = a("step");
   public static final jj.c<dxa> Q = a("swim");
   public static final jj.c<dxa> R = a("teleport");
   public static final jj.c<dxa> S = a("unequip");
   public static final jj.c<dxa> T = a("resonate_1");
   public static final jj.c<dxa> U = a("resonate_2");
   public static final jj.c<dxa> V = a("resonate_3");
   public static final jj.c<dxa> W = a("resonate_4");
   public static final jj.c<dxa> X = a("resonate_5");
   public static final jj.c<dxa> Y = a("resonate_6");
   public static final jj.c<dxa> Z = a("resonate_7");
   public static final jj.c<dxa> aa = a("resonate_8");
   public static final jj.c<dxa> ab = a("resonate_9");
   public static final jj.c<dxa> ac = a("resonate_10");
   public static final jj.c<dxa> ad = a("resonate_11");
   public static final jj.c<dxa> ae = a("resonate_12");
   public static final jj.c<dxa> af = a("resonate_13");
   public static final jj.c<dxa> ag = a("resonate_14");
   public static final jj.c<dxa> ah = a("resonate_15");
   public static final int ai = 16;

   public static jj<dxa> a(jw<dxa> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static jj.c<dxa> a(String $$0) {
      return a($$0, 16);
   }

   private static jj.c<dxa> a(String $$0, int $$1) {
      return jw.b(lq.a, new akk($$0), new dxa($$1));
   }

   public static record a(@Nullable bsd a, @Nullable dsh b) {
      public static dxa.a a(@Nullable bsd $$0) {
         return new dxa.a($$0, null);
      }

      public static dxa.a a(@Nullable dsh $$0) {
         return new dxa.a(null, $$0);
      }

      public static dxa.a a(@Nullable bsd $$0, @Nullable dsh $$1) {
         return new dxa.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxa.b> {
      private final jj<dxa> a;
      private final evz b;
      private final dxa.a c;
      private final dxc d;
      private final double e;

      public b(jj<dxa> $$0, evz $$1, dxa.a $$2, dxc $$3, evz $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxa.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jj<dxa> a() {
         return this.a;
      }

      public evz b() {
         return this.b;
      }

      public dxa.a c() {
         return this.c;
      }

      public dxc d() {
         return this.d;
      }
   }
}
