import javax.annotation.Nullable;

public record dqr(int aj) {
   public static final il.c<dqr> a = a("block_activate");
   public static final il.c<dqr> b = a("block_attach");
   public static final il.c<dqr> c = a("block_change");
   public static final il.c<dqr> d = a("block_close");
   public static final il.c<dqr> e = a("block_deactivate");
   public static final il.c<dqr> f = a("block_destroy");
   public static final il.c<dqr> g = a("block_detach");
   public static final il.c<dqr> h = a("block_open");
   public static final il.c<dqr> i = a("block_place");
   public static final il.c<dqr> j = a("container_close");
   public static final il.c<dqr> k = a("container_open");
   public static final il.c<dqr> l = a("drink");
   public static final il.c<dqr> m = a("eat");
   public static final il.c<dqr> n = a("elytra_glide");
   public static final il.c<dqr> o = a("entity_damage");
   public static final il.c<dqr> p = a("entity_die");
   public static final il.c<dqr> q = a("entity_dismount");
   public static final il.c<dqr> r = a("entity_interact");
   public static final il.c<dqr> s = a("entity_mount");
   public static final il.c<dqr> t = a("entity_place");
   public static final il.c<dqr> u = a("entity_action");
   public static final il.c<dqr> v = a("equip");
   public static final il.c<dqr> w = a("explode");
   public static final il.c<dqr> x = a("flap");
   public static final il.c<dqr> y = a("fluid_pickup");
   public static final il.c<dqr> z = a("fluid_place");
   public static final il.c<dqr> A = a("hit_ground");
   public static final il.c<dqr> B = a("instrument_play");
   public static final il.c<dqr> C = a("item_interact_finish");
   public static final il.c<dqr> D = a("item_interact_start");
   public static final il.c<dqr> E = a("jukebox_play", 10);
   public static final il.c<dqr> F = a("jukebox_stop_play", 10);
   public static final il.c<dqr> G = a("lightning_strike");
   public static final il.c<dqr> H = a("note_block_play");
   public static final il.c<dqr> I = a("prime_fuse");
   public static final il.c<dqr> J = a("projectile_land");
   public static final il.c<dqr> K = a("projectile_shoot");
   public static final il.c<dqr> L = a("sculk_sensor_tendrils_clicking");
   public static final il.c<dqr> M = a("shear");
   public static final il.c<dqr> N = a("shriek", 32);
   public static final il.c<dqr> O = a("splash");
   public static final il.c<dqr> P = a("step");
   public static final il.c<dqr> Q = a("swim");
   public static final il.c<dqr> R = a("teleport");
   public static final il.c<dqr> S = a("unequip");
   public static final il.c<dqr> T = a("resonate_1");
   public static final il.c<dqr> U = a("resonate_2");
   public static final il.c<dqr> V = a("resonate_3");
   public static final il.c<dqr> W = a("resonate_4");
   public static final il.c<dqr> X = a("resonate_5");
   public static final il.c<dqr> Y = a("resonate_6");
   public static final il.c<dqr> Z = a("resonate_7");
   public static final il.c<dqr> aa = a("resonate_8");
   public static final il.c<dqr> ab = a("resonate_9");
   public static final il.c<dqr> ac = a("resonate_10");
   public static final il.c<dqr> ad = a("resonate_11");
   public static final il.c<dqr> ae = a("resonate_12");
   public static final il.c<dqr> af = a("resonate_13");
   public static final il.c<dqr> ag = a("resonate_14");
   public static final il.c<dqr> ah = a("resonate_15");
   public static final int ai = 16;

   public static il<dqr> a(ix<dqr> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static il.c<dqr> a(String $$0) {
      return a($$0, 16);
   }

   private static il.c<dqr> a(String $$0, int $$1) {
      return ix.b(kh.a, new ajc($$0), new dqr($$1));
   }

   public static record a(@Nullable bof a, @Nullable dme b) {
      public static dqr.a a(@Nullable bof $$0) {
         return new dqr.a($$0, null);
      }

      public static dqr.a a(@Nullable dme $$0) {
         return new dqr.a(null, $$0);
      }

      public static dqr.a a(@Nullable bof $$0, @Nullable dme $$1) {
         return new dqr.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dqr.b> {
      private final il<dqr> a;
      private final eov b;
      private final dqr.a c;
      private final dqt d;
      private final double e;

      public b(il<dqr> $$0, eov $$1, dqr.a $$2, dqt $$3, eov $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dqr.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public il<dqr> a() {
         return this.a;
      }

      public eov b() {
         return this.b;
      }

      public dqr.a c() {
         return this.c;
      }

      public dqt d() {
         return this.d;
      }
   }
}
