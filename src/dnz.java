import javax.annotation.Nullable;

public record dnz(int aj) {
   public static final ih.c<dnz> a = a("block_activate");
   public static final ih.c<dnz> b = a("block_attach");
   public static final ih.c<dnz> c = a("block_change");
   public static final ih.c<dnz> d = a("block_close");
   public static final ih.c<dnz> e = a("block_deactivate");
   public static final ih.c<dnz> f = a("block_destroy");
   public static final ih.c<dnz> g = a("block_detach");
   public static final ih.c<dnz> h = a("block_open");
   public static final ih.c<dnz> i = a("block_place");
   public static final ih.c<dnz> j = a("container_close");
   public static final ih.c<dnz> k = a("container_open");
   public static final ih.c<dnz> l = a("drink");
   public static final ih.c<dnz> m = a("eat");
   public static final ih.c<dnz> n = a("elytra_glide");
   public static final ih.c<dnz> o = a("entity_damage");
   public static final ih.c<dnz> p = a("entity_die");
   public static final ih.c<dnz> q = a("entity_dismount");
   public static final ih.c<dnz> r = a("entity_interact");
   public static final ih.c<dnz> s = a("entity_mount");
   public static final ih.c<dnz> t = a("entity_place");
   public static final ih.c<dnz> u = a("entity_action");
   public static final ih.c<dnz> v = a("equip");
   public static final ih.c<dnz> w = a("explode");
   public static final ih.c<dnz> x = a("flap");
   public static final ih.c<dnz> y = a("fluid_pickup");
   public static final ih.c<dnz> z = a("fluid_place");
   public static final ih.c<dnz> A = a("hit_ground");
   public static final ih.c<dnz> B = a("instrument_play");
   public static final ih.c<dnz> C = a("item_interact_finish");
   public static final ih.c<dnz> D = a("item_interact_start");
   public static final ih.c<dnz> E = a("jukebox_play", 10);
   public static final ih.c<dnz> F = a("jukebox_stop_play", 10);
   public static final ih.c<dnz> G = a("lightning_strike");
   public static final ih.c<dnz> H = a("note_block_play");
   public static final ih.c<dnz> I = a("prime_fuse");
   public static final ih.c<dnz> J = a("projectile_land");
   public static final ih.c<dnz> K = a("projectile_shoot");
   public static final ih.c<dnz> L = a("sculk_sensor_tendrils_clicking");
   public static final ih.c<dnz> M = a("shear");
   public static final ih.c<dnz> N = a("shriek", 32);
   public static final ih.c<dnz> O = a("splash");
   public static final ih.c<dnz> P = a("step");
   public static final ih.c<dnz> Q = a("swim");
   public static final ih.c<dnz> R = a("teleport");
   public static final ih.c<dnz> S = a("unequip");
   public static final ih.c<dnz> T = a("resonate_1");
   public static final ih.c<dnz> U = a("resonate_2");
   public static final ih.c<dnz> V = a("resonate_3");
   public static final ih.c<dnz> W = a("resonate_4");
   public static final ih.c<dnz> X = a("resonate_5");
   public static final ih.c<dnz> Y = a("resonate_6");
   public static final ih.c<dnz> Z = a("resonate_7");
   public static final ih.c<dnz> aa = a("resonate_8");
   public static final ih.c<dnz> ab = a("resonate_9");
   public static final ih.c<dnz> ac = a("resonate_10");
   public static final ih.c<dnz> ad = a("resonate_11");
   public static final ih.c<dnz> ae = a("resonate_12");
   public static final ih.c<dnz> af = a("resonate_13");
   public static final ih.c<dnz> ag = a("resonate_14");
   public static final ih.c<dnz> ah = a("resonate_15");
   public static final int ai = 16;

   public static ih<dnz> a(it<dnz> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ih.c<dnz> a(String $$0) {
      return a($$0, 16);
   }

   private static ih.c<dnz> a(String $$0, int $$1) {
      return it.b(kd.a, new ahh($$0), new dnz($$1));
   }

   public static record a(@Nullable blw a, @Nullable djp b) {
      public static dnz.a a(@Nullable blw $$0) {
         return new dnz.a($$0, null);
      }

      public static dnz.a a(@Nullable djp $$0) {
         return new dnz.a(null, $$0);
      }

      public static dnz.a a(@Nullable blw $$0, @Nullable djp $$1) {
         return new dnz.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dnz.b> {
      private final ih<dnz> a;
      private final emc b;
      private final dnz.a c;
      private final dob d;
      private final double e;

      public b(ih<dnz> $$0, emc $$1, dnz.a $$2, dob $$3, emc $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dnz.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ih<dnz> a() {
         return this.a;
      }

      public emc b() {
         return this.b;
      }

      public dnz.a c() {
         return this.c;
      }

      public dob d() {
         return this.d;
      }
   }
}
