import javax.annotation.Nullable;

public record drp(int aj) {
   public static final il.c<drp> a = a("block_activate");
   public static final il.c<drp> b = a("block_attach");
   public static final il.c<drp> c = a("block_change");
   public static final il.c<drp> d = a("block_close");
   public static final il.c<drp> e = a("block_deactivate");
   public static final il.c<drp> f = a("block_destroy");
   public static final il.c<drp> g = a("block_detach");
   public static final il.c<drp> h = a("block_open");
   public static final il.c<drp> i = a("block_place");
   public static final il.c<drp> j = a("container_close");
   public static final il.c<drp> k = a("container_open");
   public static final il.c<drp> l = a("drink");
   public static final il.c<drp> m = a("eat");
   public static final il.c<drp> n = a("elytra_glide");
   public static final il.c<drp> o = a("entity_damage");
   public static final il.c<drp> p = a("entity_die");
   public static final il.c<drp> q = a("entity_dismount");
   public static final il.c<drp> r = a("entity_interact");
   public static final il.c<drp> s = a("entity_mount");
   public static final il.c<drp> t = a("entity_place");
   public static final il.c<drp> u = a("entity_action");
   public static final il.c<drp> v = a("equip");
   public static final il.c<drp> w = a("explode");
   public static final il.c<drp> x = a("flap");
   public static final il.c<drp> y = a("fluid_pickup");
   public static final il.c<drp> z = a("fluid_place");
   public static final il.c<drp> A = a("hit_ground");
   public static final il.c<drp> B = a("instrument_play");
   public static final il.c<drp> C = a("item_interact_finish");
   public static final il.c<drp> D = a("item_interact_start");
   public static final il.c<drp> E = a("jukebox_play", 10);
   public static final il.c<drp> F = a("jukebox_stop_play", 10);
   public static final il.c<drp> G = a("lightning_strike");
   public static final il.c<drp> H = a("note_block_play");
   public static final il.c<drp> I = a("prime_fuse");
   public static final il.c<drp> J = a("projectile_land");
   public static final il.c<drp> K = a("projectile_shoot");
   public static final il.c<drp> L = a("sculk_sensor_tendrils_clicking");
   public static final il.c<drp> M = a("shear");
   public static final il.c<drp> N = a("shriek", 32);
   public static final il.c<drp> O = a("splash");
   public static final il.c<drp> P = a("step");
   public static final il.c<drp> Q = a("swim");
   public static final il.c<drp> R = a("teleport");
   public static final il.c<drp> S = a("unequip");
   public static final il.c<drp> T = a("resonate_1");
   public static final il.c<drp> U = a("resonate_2");
   public static final il.c<drp> V = a("resonate_3");
   public static final il.c<drp> W = a("resonate_4");
   public static final il.c<drp> X = a("resonate_5");
   public static final il.c<drp> Y = a("resonate_6");
   public static final il.c<drp> Z = a("resonate_7");
   public static final il.c<drp> aa = a("resonate_8");
   public static final il.c<drp> ab = a("resonate_9");
   public static final il.c<drp> ac = a("resonate_10");
   public static final il.c<drp> ad = a("resonate_11");
   public static final il.c<drp> ae = a("resonate_12");
   public static final il.c<drp> af = a("resonate_13");
   public static final il.c<drp> ag = a("resonate_14");
   public static final il.c<drp> ah = a("resonate_15");
   public static final int ai = 16;

   public static il<drp> a(iy<drp> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static il.c<drp> a(String $$0) {
      return a($$0, 16);
   }

   private static il.c<drp> a(String $$0, int $$1) {
      return iy.b(ki.a, new ajh($$0), new drp($$1));
   }

   public static record a(@Nullable box a, @Nullable dnb b) {
      public static drp.a a(@Nullable box $$0) {
         return new drp.a($$0, null);
      }

      public static drp.a a(@Nullable dnb $$0) {
         return new drp.a(null, $$0);
      }

      public static drp.a a(@Nullable box $$0, @Nullable dnb $$1) {
         return new drp.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<drp.b> {
      private final il<drp> a;
      private final ept b;
      private final drp.a c;
      private final drr d;
      private final double e;

      public b(il<drp> $$0, ept $$1, drp.a $$2, drr $$3, ept $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(drp.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public il<drp> a() {
         return this.a;
      }

      public ept b() {
         return this.b;
      }

      public drp.a c() {
         return this.c;
      }

      public drr d() {
         return this.d;
      }
   }
}
