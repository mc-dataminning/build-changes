import javax.annotation.Nullable;

public record dvu(int aj) {
   public static final ix.c<dvu> a = a("block_activate");
   public static final ix.c<dvu> b = a("block_attach");
   public static final ix.c<dvu> c = a("block_change");
   public static final ix.c<dvu> d = a("block_close");
   public static final ix.c<dvu> e = a("block_deactivate");
   public static final ix.c<dvu> f = a("block_destroy");
   public static final ix.c<dvu> g = a("block_detach");
   public static final ix.c<dvu> h = a("block_open");
   public static final ix.c<dvu> i = a("block_place");
   public static final ix.c<dvu> j = a("container_close");
   public static final ix.c<dvu> k = a("container_open");
   public static final ix.c<dvu> l = a("drink");
   public static final ix.c<dvu> m = a("eat");
   public static final ix.c<dvu> n = a("elytra_glide");
   public static final ix.c<dvu> o = a("entity_damage");
   public static final ix.c<dvu> p = a("entity_die");
   public static final ix.c<dvu> q = a("entity_dismount");
   public static final ix.c<dvu> r = a("entity_interact");
   public static final ix.c<dvu> s = a("entity_mount");
   public static final ix.c<dvu> t = a("entity_place");
   public static final ix.c<dvu> u = a("entity_action");
   public static final ix.c<dvu> v = a("equip");
   public static final ix.c<dvu> w = a("explode");
   public static final ix.c<dvu> x = a("flap");
   public static final ix.c<dvu> y = a("fluid_pickup");
   public static final ix.c<dvu> z = a("fluid_place");
   public static final ix.c<dvu> A = a("hit_ground");
   public static final ix.c<dvu> B = a("instrument_play");
   public static final ix.c<dvu> C = a("item_interact_finish");
   public static final ix.c<dvu> D = a("item_interact_start");
   public static final ix.c<dvu> E = a("jukebox_play", 10);
   public static final ix.c<dvu> F = a("jukebox_stop_play", 10);
   public static final ix.c<dvu> G = a("lightning_strike");
   public static final ix.c<dvu> H = a("note_block_play");
   public static final ix.c<dvu> I = a("prime_fuse");
   public static final ix.c<dvu> J = a("projectile_land");
   public static final ix.c<dvu> K = a("projectile_shoot");
   public static final ix.c<dvu> L = a("sculk_sensor_tendrils_clicking");
   public static final ix.c<dvu> M = a("shear");
   public static final ix.c<dvu> N = a("shriek", 32);
   public static final ix.c<dvu> O = a("splash");
   public static final ix.c<dvu> P = a("step");
   public static final ix.c<dvu> Q = a("swim");
   public static final ix.c<dvu> R = a("teleport");
   public static final ix.c<dvu> S = a("unequip");
   public static final ix.c<dvu> T = a("resonate_1");
   public static final ix.c<dvu> U = a("resonate_2");
   public static final ix.c<dvu> V = a("resonate_3");
   public static final ix.c<dvu> W = a("resonate_4");
   public static final ix.c<dvu> X = a("resonate_5");
   public static final ix.c<dvu> Y = a("resonate_6");
   public static final ix.c<dvu> Z = a("resonate_7");
   public static final ix.c<dvu> aa = a("resonate_8");
   public static final ix.c<dvu> ab = a("resonate_9");
   public static final ix.c<dvu> ac = a("resonate_10");
   public static final ix.c<dvu> ad = a("resonate_11");
   public static final ix.c<dvu> ae = a("resonate_12");
   public static final ix.c<dvu> af = a("resonate_13");
   public static final ix.c<dvu> ag = a("resonate_14");
   public static final ix.c<dvu> ah = a("resonate_15");
   public static final int ai = 16;

   public static ix<dvu> a(jk<dvu> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ix.c<dvu> a(String $$0) {
      return a($$0, 16);
   }

   private static ix.c<dvu> a(String $$0, int $$1) {
      return jk.b(le.a, new akm($$0), new dvu($$1));
   }

   public static record a(@Nullable bru a, @Nullable drb b) {
      public static dvu.a a(@Nullable bru $$0) {
         return new dvu.a($$0, null);
      }

      public static dvu.a a(@Nullable drb $$0) {
         return new dvu.a(null, $$0);
      }

      public static dvu.a a(@Nullable bru $$0, @Nullable drb $$1) {
         return new dvu.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dvu.b> {
      private final ix<dvu> a;
      private final euk b;
      private final dvu.a c;
      private final dvw d;
      private final double e;

      public b(ix<dvu> $$0, euk $$1, dvu.a $$2, dvw $$3, euk $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dvu.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ix<dvu> a() {
         return this.a;
      }

      public euk b() {
         return this.b;
      }

      public dvu.a c() {
         return this.c;
      }

      public dvw d() {
         return this.d;
      }
   }
}
