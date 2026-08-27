import javax.annotation.Nullable;

public record dpp(int aj) {
   public static final ij.c<dpp> a = a("block_activate");
   public static final ij.c<dpp> b = a("block_attach");
   public static final ij.c<dpp> c = a("block_change");
   public static final ij.c<dpp> d = a("block_close");
   public static final ij.c<dpp> e = a("block_deactivate");
   public static final ij.c<dpp> f = a("block_destroy");
   public static final ij.c<dpp> g = a("block_detach");
   public static final ij.c<dpp> h = a("block_open");
   public static final ij.c<dpp> i = a("block_place");
   public static final ij.c<dpp> j = a("container_close");
   public static final ij.c<dpp> k = a("container_open");
   public static final ij.c<dpp> l = a("drink");
   public static final ij.c<dpp> m = a("eat");
   public static final ij.c<dpp> n = a("elytra_glide");
   public static final ij.c<dpp> o = a("entity_damage");
   public static final ij.c<dpp> p = a("entity_die");
   public static final ij.c<dpp> q = a("entity_dismount");
   public static final ij.c<dpp> r = a("entity_interact");
   public static final ij.c<dpp> s = a("entity_mount");
   public static final ij.c<dpp> t = a("entity_place");
   public static final ij.c<dpp> u = a("entity_action");
   public static final ij.c<dpp> v = a("equip");
   public static final ij.c<dpp> w = a("explode");
   public static final ij.c<dpp> x = a("flap");
   public static final ij.c<dpp> y = a("fluid_pickup");
   public static final ij.c<dpp> z = a("fluid_place");
   public static final ij.c<dpp> A = a("hit_ground");
   public static final ij.c<dpp> B = a("instrument_play");
   public static final ij.c<dpp> C = a("item_interact_finish");
   public static final ij.c<dpp> D = a("item_interact_start");
   public static final ij.c<dpp> E = a("jukebox_play", 10);
   public static final ij.c<dpp> F = a("jukebox_stop_play", 10);
   public static final ij.c<dpp> G = a("lightning_strike");
   public static final ij.c<dpp> H = a("note_block_play");
   public static final ij.c<dpp> I = a("prime_fuse");
   public static final ij.c<dpp> J = a("projectile_land");
   public static final ij.c<dpp> K = a("projectile_shoot");
   public static final ij.c<dpp> L = a("sculk_sensor_tendrils_clicking");
   public static final ij.c<dpp> M = a("shear");
   public static final ij.c<dpp> N = a("shriek", 32);
   public static final ij.c<dpp> O = a("splash");
   public static final ij.c<dpp> P = a("step");
   public static final ij.c<dpp> Q = a("swim");
   public static final ij.c<dpp> R = a("teleport");
   public static final ij.c<dpp> S = a("unequip");
   public static final ij.c<dpp> T = a("resonate_1");
   public static final ij.c<dpp> U = a("resonate_2");
   public static final ij.c<dpp> V = a("resonate_3");
   public static final ij.c<dpp> W = a("resonate_4");
   public static final ij.c<dpp> X = a("resonate_5");
   public static final ij.c<dpp> Y = a("resonate_6");
   public static final ij.c<dpp> Z = a("resonate_7");
   public static final ij.c<dpp> aa = a("resonate_8");
   public static final ij.c<dpp> ab = a("resonate_9");
   public static final ij.c<dpp> ac = a("resonate_10");
   public static final ij.c<dpp> ad = a("resonate_11");
   public static final ij.c<dpp> ae = a("resonate_12");
   public static final ij.c<dpp> af = a("resonate_13");
   public static final ij.c<dpp> ag = a("resonate_14");
   public static final ij.c<dpp> ah = a("resonate_15");
   public static final int ai = 16;

   public static ij<dpp> a(iv<dpp> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ij.c<dpp> a(String $$0) {
      return a($$0, 16);
   }

   private static ij.c<dpp> a(String $$0, int $$1) {
      return iv.b(kf.a, new aiy($$0), new dpp($$1));
   }

   public static record a(@Nullable bno a, @Nullable dlf b) {
      public static dpp.a a(@Nullable bno $$0) {
         return new dpp.a($$0, null);
      }

      public static dpp.a a(@Nullable dlf $$0) {
         return new dpp.a(null, $$0);
      }

      public static dpp.a a(@Nullable bno $$0, @Nullable dlf $$1) {
         return new dpp.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dpp.b> {
      private final ij<dpp> a;
      private final ens b;
      private final dpp.a c;
      private final dpr d;
      private final double e;

      public b(ij<dpp> $$0, ens $$1, dpp.a $$2, dpr $$3, ens $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dpp.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ij<dpp> a() {
         return this.a;
      }

      public ens b() {
         return this.b;
      }

      public dpp.a c() {
         return this.c;
      }

      public dpr d() {
         return this.d;
      }
   }
}
