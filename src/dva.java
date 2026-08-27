import javax.annotation.Nullable;

public record dva(int aj) {
   public static final iw.c<dva> a = a("block_activate");
   public static final iw.c<dva> b = a("block_attach");
   public static final iw.c<dva> c = a("block_change");
   public static final iw.c<dva> d = a("block_close");
   public static final iw.c<dva> e = a("block_deactivate");
   public static final iw.c<dva> f = a("block_destroy");
   public static final iw.c<dva> g = a("block_detach");
   public static final iw.c<dva> h = a("block_open");
   public static final iw.c<dva> i = a("block_place");
   public static final iw.c<dva> j = a("container_close");
   public static final iw.c<dva> k = a("container_open");
   public static final iw.c<dva> l = a("drink");
   public static final iw.c<dva> m = a("eat");
   public static final iw.c<dva> n = a("elytra_glide");
   public static final iw.c<dva> o = a("entity_damage");
   public static final iw.c<dva> p = a("entity_die");
   public static final iw.c<dva> q = a("entity_dismount");
   public static final iw.c<dva> r = a("entity_interact");
   public static final iw.c<dva> s = a("entity_mount");
   public static final iw.c<dva> t = a("entity_place");
   public static final iw.c<dva> u = a("entity_action");
   public static final iw.c<dva> v = a("equip");
   public static final iw.c<dva> w = a("explode");
   public static final iw.c<dva> x = a("flap");
   public static final iw.c<dva> y = a("fluid_pickup");
   public static final iw.c<dva> z = a("fluid_place");
   public static final iw.c<dva> A = a("hit_ground");
   public static final iw.c<dva> B = a("instrument_play");
   public static final iw.c<dva> C = a("item_interact_finish");
   public static final iw.c<dva> D = a("item_interact_start");
   public static final iw.c<dva> E = a("jukebox_play", 10);
   public static final iw.c<dva> F = a("jukebox_stop_play", 10);
   public static final iw.c<dva> G = a("lightning_strike");
   public static final iw.c<dva> H = a("note_block_play");
   public static final iw.c<dva> I = a("prime_fuse");
   public static final iw.c<dva> J = a("projectile_land");
   public static final iw.c<dva> K = a("projectile_shoot");
   public static final iw.c<dva> L = a("sculk_sensor_tendrils_clicking");
   public static final iw.c<dva> M = a("shear");
   public static final iw.c<dva> N = a("shriek", 32);
   public static final iw.c<dva> O = a("splash");
   public static final iw.c<dva> P = a("step");
   public static final iw.c<dva> Q = a("swim");
   public static final iw.c<dva> R = a("teleport");
   public static final iw.c<dva> S = a("unequip");
   public static final iw.c<dva> T = a("resonate_1");
   public static final iw.c<dva> U = a("resonate_2");
   public static final iw.c<dva> V = a("resonate_3");
   public static final iw.c<dva> W = a("resonate_4");
   public static final iw.c<dva> X = a("resonate_5");
   public static final iw.c<dva> Y = a("resonate_6");
   public static final iw.c<dva> Z = a("resonate_7");
   public static final iw.c<dva> aa = a("resonate_8");
   public static final iw.c<dva> ab = a("resonate_9");
   public static final iw.c<dva> ac = a("resonate_10");
   public static final iw.c<dva> ad = a("resonate_11");
   public static final iw.c<dva> ae = a("resonate_12");
   public static final iw.c<dva> af = a("resonate_13");
   public static final iw.c<dva> ag = a("resonate_14");
   public static final iw.c<dva> ah = a("resonate_15");
   public static final int ai = 16;

   public static iw<dva> a(jj<dva> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static iw.c<dva> a(String $$0) {
      return a($$0, 16);
   }

   private static iw.c<dva> a(String $$0, int $$1) {
      return jj.b(ld.a, new akh($$0), new dva($$1));
   }

   public static record a(@Nullable brh a, @Nullable dqh b) {
      public static dva.a a(@Nullable brh $$0) {
         return new dva.a($$0, null);
      }

      public static dva.a a(@Nullable dqh $$0) {
         return new dva.a(null, $$0);
      }

      public static dva.a a(@Nullable brh $$0, @Nullable dqh $$1) {
         return new dva.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dva.b> {
      private final iw<dva> a;
      private final etp b;
      private final dva.a c;
      private final dvc d;
      private final double e;

      public b(iw<dva> $$0, etp $$1, dva.a $$2, dvc $$3, etp $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dva.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public iw<dva> a() {
         return this.a;
      }

      public etp b() {
         return this.b;
      }

      public dva.a c() {
         return this.c;
      }

      public dvc d() {
         return this.d;
      }
   }
}
