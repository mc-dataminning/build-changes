import javax.annotation.Nullable;

public record drn(int aj) {
   public static final il.c<drn> a = a("block_activate");
   public static final il.c<drn> b = a("block_attach");
   public static final il.c<drn> c = a("block_change");
   public static final il.c<drn> d = a("block_close");
   public static final il.c<drn> e = a("block_deactivate");
   public static final il.c<drn> f = a("block_destroy");
   public static final il.c<drn> g = a("block_detach");
   public static final il.c<drn> h = a("block_open");
   public static final il.c<drn> i = a("block_place");
   public static final il.c<drn> j = a("container_close");
   public static final il.c<drn> k = a("container_open");
   public static final il.c<drn> l = a("drink");
   public static final il.c<drn> m = a("eat");
   public static final il.c<drn> n = a("elytra_glide");
   public static final il.c<drn> o = a("entity_damage");
   public static final il.c<drn> p = a("entity_die");
   public static final il.c<drn> q = a("entity_dismount");
   public static final il.c<drn> r = a("entity_interact");
   public static final il.c<drn> s = a("entity_mount");
   public static final il.c<drn> t = a("entity_place");
   public static final il.c<drn> u = a("entity_action");
   public static final il.c<drn> v = a("equip");
   public static final il.c<drn> w = a("explode");
   public static final il.c<drn> x = a("flap");
   public static final il.c<drn> y = a("fluid_pickup");
   public static final il.c<drn> z = a("fluid_place");
   public static final il.c<drn> A = a("hit_ground");
   public static final il.c<drn> B = a("instrument_play");
   public static final il.c<drn> C = a("item_interact_finish");
   public static final il.c<drn> D = a("item_interact_start");
   public static final il.c<drn> E = a("jukebox_play", 10);
   public static final il.c<drn> F = a("jukebox_stop_play", 10);
   public static final il.c<drn> G = a("lightning_strike");
   public static final il.c<drn> H = a("note_block_play");
   public static final il.c<drn> I = a("prime_fuse");
   public static final il.c<drn> J = a("projectile_land");
   public static final il.c<drn> K = a("projectile_shoot");
   public static final il.c<drn> L = a("sculk_sensor_tendrils_clicking");
   public static final il.c<drn> M = a("shear");
   public static final il.c<drn> N = a("shriek", 32);
   public static final il.c<drn> O = a("splash");
   public static final il.c<drn> P = a("step");
   public static final il.c<drn> Q = a("swim");
   public static final il.c<drn> R = a("teleport");
   public static final il.c<drn> S = a("unequip");
   public static final il.c<drn> T = a("resonate_1");
   public static final il.c<drn> U = a("resonate_2");
   public static final il.c<drn> V = a("resonate_3");
   public static final il.c<drn> W = a("resonate_4");
   public static final il.c<drn> X = a("resonate_5");
   public static final il.c<drn> Y = a("resonate_6");
   public static final il.c<drn> Z = a("resonate_7");
   public static final il.c<drn> aa = a("resonate_8");
   public static final il.c<drn> ab = a("resonate_9");
   public static final il.c<drn> ac = a("resonate_10");
   public static final il.c<drn> ad = a("resonate_11");
   public static final il.c<drn> ae = a("resonate_12");
   public static final il.c<drn> af = a("resonate_13");
   public static final il.c<drn> ag = a("resonate_14");
   public static final il.c<drn> ah = a("resonate_15");
   public static final int ai = 16;

   public static il<drn> a(iy<drn> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static il.c<drn> a(String $$0) {
      return a($$0, 16);
   }

   private static il.c<drn> a(String $$0, int $$1) {
      return iy.b(ki.a, new ajh($$0), new drn($$1));
   }

   public static record a(@Nullable bow a, @Nullable dmz b) {
      public static drn.a a(@Nullable bow $$0) {
         return new drn.a($$0, null);
      }

      public static drn.a a(@Nullable dmz $$0) {
         return new drn.a(null, $$0);
      }

      public static drn.a a(@Nullable bow $$0, @Nullable dmz $$1) {
         return new drn.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<drn.b> {
      private final il<drn> a;
      private final epr b;
      private final drn.a c;
      private final drp d;
      private final double e;

      public b(il<drn> $$0, epr $$1, drn.a $$2, drp $$3, epr $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(drn.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public il<drn> a() {
         return this.a;
      }

      public epr b() {
         return this.b;
      }

      public drn.a c() {
         return this.c;
      }

      public drp d() {
         return this.d;
      }
   }
}
