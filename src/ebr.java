import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebr(int ak) {
   public static final jr.c<ebr> a = a("block_activate");
   public static final jr.c<ebr> b = a("block_attach");
   public static final jr.c<ebr> c = a("block_change");
   public static final jr.c<ebr> d = a("block_close");
   public static final jr.c<ebr> e = a("block_deactivate");
   public static final jr.c<ebr> f = a("block_destroy");
   public static final jr.c<ebr> g = a("block_detach");
   public static final jr.c<ebr> h = a("block_open");
   public static final jr.c<ebr> i = a("block_place");
   public static final jr.c<ebr> j = a("container_close");
   public static final jr.c<ebr> k = a("container_open");
   public static final jr.c<ebr> l = a("drink");
   public static final jr.c<ebr> m = a("eat");
   public static final jr.c<ebr> n = a("elytra_glide");
   public static final jr.c<ebr> o = a("entity_damage");
   public static final jr.c<ebr> p = a("entity_die");
   public static final jr.c<ebr> q = a("entity_dismount");
   public static final jr.c<ebr> r = a("entity_interact");
   public static final jr.c<ebr> s = a("entity_mount");
   public static final jr.c<ebr> t = a("entity_place");
   public static final jr.c<ebr> u = a("entity_action");
   public static final jr.c<ebr> v = a("equip");
   public static final jr.c<ebr> w = a("explode");
   public static final jr.c<ebr> x = a("flap");
   public static final jr.c<ebr> y = a("fluid_pickup");
   public static final jr.c<ebr> z = a("fluid_place");
   public static final jr.c<ebr> A = a("hit_ground");
   public static final jr.c<ebr> B = a("instrument_play");
   public static final jr.c<ebr> C = a("item_interact_finish");
   public static final jr.c<ebr> D = a("item_interact_start");
   public static final jr.c<ebr> E = a("jukebox_play", 10);
   public static final jr.c<ebr> F = a("jukebox_stop_play", 10);
   public static final jr.c<ebr> G = a("lightning_strike");
   public static final jr.c<ebr> H = a("note_block_play");
   public static final jr.c<ebr> I = a("prime_fuse");
   public static final jr.c<ebr> J = a("projectile_land");
   public static final jr.c<ebr> K = a("projectile_shoot");
   public static final jr.c<ebr> L = a("sculk_sensor_tendrils_clicking");
   public static final jr.c<ebr> M = a("shear");
   public static final jr.c<ebr> N = a("shriek", 32);
   public static final jr.c<ebr> O = a("splash");
   public static final jr.c<ebr> P = a("step");
   public static final jr.c<ebr> Q = a("swim");
   public static final jr.c<ebr> R = a("teleport");
   public static final jr.c<ebr> S = a("unequip");
   public static final jr.c<ebr> T = a("resonate_1");
   public static final jr.c<ebr> U = a("resonate_2");
   public static final jr.c<ebr> V = a("resonate_3");
   public static final jr.c<ebr> W = a("resonate_4");
   public static final jr.c<ebr> X = a("resonate_5");
   public static final jr.c<ebr> Y = a("resonate_6");
   public static final jr.c<ebr> Z = a("resonate_7");
   public static final jr.c<ebr> aa = a("resonate_8");
   public static final jr.c<ebr> ab = a("resonate_9");
   public static final jr.c<ebr> ac = a("resonate_10");
   public static final jr.c<ebr> ad = a("resonate_11");
   public static final jr.c<ebr> ae = a("resonate_12");
   public static final jr.c<ebr> af = a("resonate_13");
   public static final jr.c<ebr> ag = a("resonate_14");
   public static final jr.c<ebr> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jr<ebr>> aj = akr.a(mc.G);

   public static jr<ebr> a(ke<ebr> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jr.c<ebr> a(String $$0) {
      return a($$0, 16);
   }

   private static jr.c<ebr> a(String $$0, int $$1) {
      return ke.b(mb.a, aku.b($$0), new ebr($$1));
   }

   public static record a(@Nullable buj a, @Nullable dwv b) {
      public static ebr.a a(@Nullable buj $$0) {
         return new ebr.a($$0, null);
      }

      public static ebr.a a(@Nullable dwv $$0) {
         return new ebr.a(null, $$0);
      }

      public static ebr.a a(@Nullable buj $$0, @Nullable dwv $$1) {
         return new ebr.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ebr.b> {
      private final jr<ebr> a;
      private final fay b;
      private final ebr.a c;
      private final ebt d;
      private final double e;

      public b(jr<ebr> $$0, fay $$1, ebr.a $$2, ebt $$3, fay $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ebr.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jr<ebr> a() {
         return this.a;
      }

      public fay b() {
         return this.b;
      }

      public ebr.a c() {
         return this.c;
      }

      public ebt d() {
         return this.d;
      }
   }
}
