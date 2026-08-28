import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record efh(int ak) {
   public static final je.c<efh> a = a("block_activate");
   public static final je.c<efh> b = a("block_attach");
   public static final je.c<efh> c = a("block_change");
   public static final je.c<efh> d = a("block_close");
   public static final je.c<efh> e = a("block_deactivate");
   public static final je.c<efh> f = a("block_destroy");
   public static final je.c<efh> g = a("block_detach");
   public static final je.c<efh> h = a("block_open");
   public static final je.c<efh> i = a("block_place");
   public static final je.c<efh> j = a("container_close");
   public static final je.c<efh> k = a("container_open");
   public static final je.c<efh> l = a("drink");
   public static final je.c<efh> m = a("eat");
   public static final je.c<efh> n = a("elytra_glide");
   public static final je.c<efh> o = a("entity_damage");
   public static final je.c<efh> p = a("entity_die");
   public static final je.c<efh> q = a("entity_dismount");
   public static final je.c<efh> r = a("entity_interact");
   public static final je.c<efh> s = a("entity_mount");
   public static final je.c<efh> t = a("entity_place");
   public static final je.c<efh> u = a("entity_action");
   public static final je.c<efh> v = a("equip");
   public static final je.c<efh> w = a("explode");
   public static final je.c<efh> x = a("flap");
   public static final je.c<efh> y = a("fluid_pickup");
   public static final je.c<efh> z = a("fluid_place");
   public static final je.c<efh> A = a("hit_ground");
   public static final je.c<efh> B = a("instrument_play");
   public static final je.c<efh> C = a("item_interact_finish");
   public static final je.c<efh> D = a("item_interact_start");
   public static final je.c<efh> E = a("jukebox_play", 10);
   public static final je.c<efh> F = a("jukebox_stop_play", 10);
   public static final je.c<efh> G = a("lightning_strike");
   public static final je.c<efh> H = a("note_block_play");
   public static final je.c<efh> I = a("prime_fuse");
   public static final je.c<efh> J = a("projectile_land");
   public static final je.c<efh> K = a("projectile_shoot");
   public static final je.c<efh> L = a("sculk_sensor_tendrils_clicking");
   public static final je.c<efh> M = a("shear");
   public static final je.c<efh> N = a("shriek", 32);
   public static final je.c<efh> O = a("splash");
   public static final je.c<efh> P = a("step");
   public static final je.c<efh> Q = a("swim");
   public static final je.c<efh> R = a("teleport");
   public static final je.c<efh> S = a("unequip");
   public static final je.c<efh> T = a("resonate_1");
   public static final je.c<efh> U = a("resonate_2");
   public static final je.c<efh> V = a("resonate_3");
   public static final je.c<efh> W = a("resonate_4");
   public static final je.c<efh> X = a("resonate_5");
   public static final je.c<efh> Y = a("resonate_6");
   public static final je.c<efh> Z = a("resonate_7");
   public static final je.c<efh> aa = a("resonate_8");
   public static final je.c<efh> ab = a("resonate_9");
   public static final je.c<efh> ac = a("resonate_10");
   public static final je.c<efh> ad = a("resonate_11");
   public static final je.c<efh> ae = a("resonate_12");
   public static final je.c<efh> af = a("resonate_13");
   public static final je.c<efh> ag = a("resonate_14");
   public static final je.c<efh> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<je<efh>> aj = ald.a(mg.H);

   public static je<efh> a(jr<efh> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static je.c<efh> a(String $$0) {
      return a($$0, 16);
   }

   private static je.c<efh> a(String $$0, int $$1) {
      return jr.b(mf.a, alg.b($$0), new efh($$1));
   }

   public static record a(@Nullable bwf a, @Nullable eah b) {
      public static efh.a a(@Nullable bwf $$0) {
         return new efh.a($$0, null);
      }

      public static efh.a a(@Nullable eah $$0) {
         return new efh.a(null, $$0);
      }

      public static efh.a a(@Nullable bwf $$0, @Nullable eah $$1) {
         return new efh.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<efh.b> {
      private final je<efh> a;
      private final feq b;
      private final efh.a c;
      private final efj d;
      private final double e;

      public b(je<efh> $$0, feq $$1, efh.a $$2, efj $$3, feq $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(efh.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public je<efh> a() {
         return this.a;
      }

      public feq b() {
         return this.b;
      }

      public efh.a c() {
         return this.c;
      }

      public efj d() {
         return this.d;
      }
   }
}
