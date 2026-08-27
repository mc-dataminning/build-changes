import javax.annotation.Nullable;

public record dts(int aj) {
   public static final il.c<dts> a = a("block_activate");
   public static final il.c<dts> b = a("block_attach");
   public static final il.c<dts> c = a("block_change");
   public static final il.c<dts> d = a("block_close");
   public static final il.c<dts> e = a("block_deactivate");
   public static final il.c<dts> f = a("block_destroy");
   public static final il.c<dts> g = a("block_detach");
   public static final il.c<dts> h = a("block_open");
   public static final il.c<dts> i = a("block_place");
   public static final il.c<dts> j = a("container_close");
   public static final il.c<dts> k = a("container_open");
   public static final il.c<dts> l = a("drink");
   public static final il.c<dts> m = a("eat");
   public static final il.c<dts> n = a("elytra_glide");
   public static final il.c<dts> o = a("entity_damage");
   public static final il.c<dts> p = a("entity_die");
   public static final il.c<dts> q = a("entity_dismount");
   public static final il.c<dts> r = a("entity_interact");
   public static final il.c<dts> s = a("entity_mount");
   public static final il.c<dts> t = a("entity_place");
   public static final il.c<dts> u = a("entity_action");
   public static final il.c<dts> v = a("equip");
   public static final il.c<dts> w = a("explode");
   public static final il.c<dts> x = a("flap");
   public static final il.c<dts> y = a("fluid_pickup");
   public static final il.c<dts> z = a("fluid_place");
   public static final il.c<dts> A = a("hit_ground");
   public static final il.c<dts> B = a("instrument_play");
   public static final il.c<dts> C = a("item_interact_finish");
   public static final il.c<dts> D = a("item_interact_start");
   public static final il.c<dts> E = a("jukebox_play", 10);
   public static final il.c<dts> F = a("jukebox_stop_play", 10);
   public static final il.c<dts> G = a("lightning_strike");
   public static final il.c<dts> H = a("note_block_play");
   public static final il.c<dts> I = a("prime_fuse");
   public static final il.c<dts> J = a("projectile_land");
   public static final il.c<dts> K = a("projectile_shoot");
   public static final il.c<dts> L = a("sculk_sensor_tendrils_clicking");
   public static final il.c<dts> M = a("shear");
   public static final il.c<dts> N = a("shriek", 32);
   public static final il.c<dts> O = a("splash");
   public static final il.c<dts> P = a("step");
   public static final il.c<dts> Q = a("swim");
   public static final il.c<dts> R = a("teleport");
   public static final il.c<dts> S = a("unequip");
   public static final il.c<dts> T = a("resonate_1");
   public static final il.c<dts> U = a("resonate_2");
   public static final il.c<dts> V = a("resonate_3");
   public static final il.c<dts> W = a("resonate_4");
   public static final il.c<dts> X = a("resonate_5");
   public static final il.c<dts> Y = a("resonate_6");
   public static final il.c<dts> Z = a("resonate_7");
   public static final il.c<dts> aa = a("resonate_8");
   public static final il.c<dts> ab = a("resonate_9");
   public static final il.c<dts> ac = a("resonate_10");
   public static final il.c<dts> ad = a("resonate_11");
   public static final il.c<dts> ae = a("resonate_12");
   public static final il.c<dts> af = a("resonate_13");
   public static final il.c<dts> ag = a("resonate_14");
   public static final il.c<dts> ah = a("resonate_15");
   public static final int ai = 16;

   public static il<dts> a(iy<dts> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static il.c<dts> a(String $$0) {
      return a($$0, 16);
   }

   private static il.c<dts> a(String $$0, int $$1) {
      return iy.b(kr.a, new ajt($$0), new dts($$1));
   }

   public static record a(@Nullable bpv a, @Nullable doz b) {
      public static dts.a a(@Nullable bpv $$0) {
         return new dts.a($$0, null);
      }

      public static dts.a a(@Nullable doz $$0) {
         return new dts.a(null, $$0);
      }

      public static dts.a a(@Nullable bpv $$0, @Nullable doz $$1) {
         return new dts.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dts.b> {
      private final il<dts> a;
      private final esa b;
      private final dts.a c;
      private final dtu d;
      private final double e;

      public b(il<dts> $$0, esa $$1, dts.a $$2, dtu $$3, esa $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dts.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public il<dts> a() {
         return this.a;
      }

      public esa b() {
         return this.b;
      }

      public dts.a c() {
         return this.c;
      }

      public dtu d() {
         return this.d;
      }
   }
}
