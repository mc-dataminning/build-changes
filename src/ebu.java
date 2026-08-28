import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebu(int ak) {
   public static final jr.c<ebu> a = a("block_activate");
   public static final jr.c<ebu> b = a("block_attach");
   public static final jr.c<ebu> c = a("block_change");
   public static final jr.c<ebu> d = a("block_close");
   public static final jr.c<ebu> e = a("block_deactivate");
   public static final jr.c<ebu> f = a("block_destroy");
   public static final jr.c<ebu> g = a("block_detach");
   public static final jr.c<ebu> h = a("block_open");
   public static final jr.c<ebu> i = a("block_place");
   public static final jr.c<ebu> j = a("container_close");
   public static final jr.c<ebu> k = a("container_open");
   public static final jr.c<ebu> l = a("drink");
   public static final jr.c<ebu> m = a("eat");
   public static final jr.c<ebu> n = a("elytra_glide");
   public static final jr.c<ebu> o = a("entity_damage");
   public static final jr.c<ebu> p = a("entity_die");
   public static final jr.c<ebu> q = a("entity_dismount");
   public static final jr.c<ebu> r = a("entity_interact");
   public static final jr.c<ebu> s = a("entity_mount");
   public static final jr.c<ebu> t = a("entity_place");
   public static final jr.c<ebu> u = a("entity_action");
   public static final jr.c<ebu> v = a("equip");
   public static final jr.c<ebu> w = a("explode");
   public static final jr.c<ebu> x = a("flap");
   public static final jr.c<ebu> y = a("fluid_pickup");
   public static final jr.c<ebu> z = a("fluid_place");
   public static final jr.c<ebu> A = a("hit_ground");
   public static final jr.c<ebu> B = a("instrument_play");
   public static final jr.c<ebu> C = a("item_interact_finish");
   public static final jr.c<ebu> D = a("item_interact_start");
   public static final jr.c<ebu> E = a("jukebox_play", 10);
   public static final jr.c<ebu> F = a("jukebox_stop_play", 10);
   public static final jr.c<ebu> G = a("lightning_strike");
   public static final jr.c<ebu> H = a("note_block_play");
   public static final jr.c<ebu> I = a("prime_fuse");
   public static final jr.c<ebu> J = a("projectile_land");
   public static final jr.c<ebu> K = a("projectile_shoot");
   public static final jr.c<ebu> L = a("sculk_sensor_tendrils_clicking");
   public static final jr.c<ebu> M = a("shear");
   public static final jr.c<ebu> N = a("shriek", 32);
   public static final jr.c<ebu> O = a("splash");
   public static final jr.c<ebu> P = a("step");
   public static final jr.c<ebu> Q = a("swim");
   public static final jr.c<ebu> R = a("teleport");
   public static final jr.c<ebu> S = a("unequip");
   public static final jr.c<ebu> T = a("resonate_1");
   public static final jr.c<ebu> U = a("resonate_2");
   public static final jr.c<ebu> V = a("resonate_3");
   public static final jr.c<ebu> W = a("resonate_4");
   public static final jr.c<ebu> X = a("resonate_5");
   public static final jr.c<ebu> Y = a("resonate_6");
   public static final jr.c<ebu> Z = a("resonate_7");
   public static final jr.c<ebu> aa = a("resonate_8");
   public static final jr.c<ebu> ab = a("resonate_9");
   public static final jr.c<ebu> ac = a("resonate_10");
   public static final jr.c<ebu> ad = a("resonate_11");
   public static final jr.c<ebu> ae = a("resonate_12");
   public static final jr.c<ebu> af = a("resonate_13");
   public static final jr.c<ebu> ag = a("resonate_14");
   public static final jr.c<ebu> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jr<ebu>> aj = aks.a(mc.G);

   public static jr<ebu> a(ke<ebu> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jr.c<ebu> a(String $$0) {
      return a($$0, 16);
   }

   private static jr.c<ebu> a(String $$0, int $$1) {
      return ke.b(mb.a, akv.b($$0), new ebu($$1));
   }

   public static record a(@Nullable bum a, @Nullable dwy b) {
      public static ebu.a a(@Nullable bum $$0) {
         return new ebu.a($$0, null);
      }

      public static ebu.a a(@Nullable dwy $$0) {
         return new ebu.a(null, $$0);
      }

      public static ebu.a a(@Nullable bum $$0, @Nullable dwy $$1) {
         return new ebu.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ebu.b> {
      private final jr<ebu> a;
      private final fbb b;
      private final ebu.a c;
      private final ebw d;
      private final double e;

      public b(jr<ebu> $$0, fbb $$1, ebu.a $$2, ebw $$3, fbb $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ebu.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jr<ebu> a() {
         return this.a;
      }

      public fbb b() {
         return this.b;
      }

      public ebu.a c() {
         return this.c;
      }

      public ebw d() {
         return this.d;
      }
   }
}
