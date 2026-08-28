import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebt(int ak) {
   public static final jr.c<ebt> a = a("block_activate");
   public static final jr.c<ebt> b = a("block_attach");
   public static final jr.c<ebt> c = a("block_change");
   public static final jr.c<ebt> d = a("block_close");
   public static final jr.c<ebt> e = a("block_deactivate");
   public static final jr.c<ebt> f = a("block_destroy");
   public static final jr.c<ebt> g = a("block_detach");
   public static final jr.c<ebt> h = a("block_open");
   public static final jr.c<ebt> i = a("block_place");
   public static final jr.c<ebt> j = a("container_close");
   public static final jr.c<ebt> k = a("container_open");
   public static final jr.c<ebt> l = a("drink");
   public static final jr.c<ebt> m = a("eat");
   public static final jr.c<ebt> n = a("elytra_glide");
   public static final jr.c<ebt> o = a("entity_damage");
   public static final jr.c<ebt> p = a("entity_die");
   public static final jr.c<ebt> q = a("entity_dismount");
   public static final jr.c<ebt> r = a("entity_interact");
   public static final jr.c<ebt> s = a("entity_mount");
   public static final jr.c<ebt> t = a("entity_place");
   public static final jr.c<ebt> u = a("entity_action");
   public static final jr.c<ebt> v = a("equip");
   public static final jr.c<ebt> w = a("explode");
   public static final jr.c<ebt> x = a("flap");
   public static final jr.c<ebt> y = a("fluid_pickup");
   public static final jr.c<ebt> z = a("fluid_place");
   public static final jr.c<ebt> A = a("hit_ground");
   public static final jr.c<ebt> B = a("instrument_play");
   public static final jr.c<ebt> C = a("item_interact_finish");
   public static final jr.c<ebt> D = a("item_interact_start");
   public static final jr.c<ebt> E = a("jukebox_play", 10);
   public static final jr.c<ebt> F = a("jukebox_stop_play", 10);
   public static final jr.c<ebt> G = a("lightning_strike");
   public static final jr.c<ebt> H = a("note_block_play");
   public static final jr.c<ebt> I = a("prime_fuse");
   public static final jr.c<ebt> J = a("projectile_land");
   public static final jr.c<ebt> K = a("projectile_shoot");
   public static final jr.c<ebt> L = a("sculk_sensor_tendrils_clicking");
   public static final jr.c<ebt> M = a("shear");
   public static final jr.c<ebt> N = a("shriek", 32);
   public static final jr.c<ebt> O = a("splash");
   public static final jr.c<ebt> P = a("step");
   public static final jr.c<ebt> Q = a("swim");
   public static final jr.c<ebt> R = a("teleport");
   public static final jr.c<ebt> S = a("unequip");
   public static final jr.c<ebt> T = a("resonate_1");
   public static final jr.c<ebt> U = a("resonate_2");
   public static final jr.c<ebt> V = a("resonate_3");
   public static final jr.c<ebt> W = a("resonate_4");
   public static final jr.c<ebt> X = a("resonate_5");
   public static final jr.c<ebt> Y = a("resonate_6");
   public static final jr.c<ebt> Z = a("resonate_7");
   public static final jr.c<ebt> aa = a("resonate_8");
   public static final jr.c<ebt> ab = a("resonate_9");
   public static final jr.c<ebt> ac = a("resonate_10");
   public static final jr.c<ebt> ad = a("resonate_11");
   public static final jr.c<ebt> ae = a("resonate_12");
   public static final jr.c<ebt> af = a("resonate_13");
   public static final jr.c<ebt> ag = a("resonate_14");
   public static final jr.c<ebt> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jr<ebt>> aj = akr.a(mc.G);

   public static jr<ebt> a(ke<ebt> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jr.c<ebt> a(String $$0) {
      return a($$0, 16);
   }

   private static jr.c<ebt> a(String $$0, int $$1) {
      return ke.b(mb.a, aku.b($$0), new ebt($$1));
   }

   public static record a(@Nullable buk a, @Nullable dwx b) {
      public static ebt.a a(@Nullable buk $$0) {
         return new ebt.a($$0, null);
      }

      public static ebt.a a(@Nullable dwx $$0) {
         return new ebt.a(null, $$0);
      }

      public static ebt.a a(@Nullable buk $$0, @Nullable dwx $$1) {
         return new ebt.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ebt.b> {
      private final jr<ebt> a;
      private final fba b;
      private final ebt.a c;
      private final ebv d;
      private final double e;

      public b(jr<ebt> $$0, fba $$1, ebt.a $$2, ebv $$3, fba $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ebt.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jr<ebt> a() {
         return this.a;
      }

      public fba b() {
         return this.b;
      }

      public ebt.a c() {
         return this.c;
      }

      public ebv d() {
         return this.d;
      }
   }
}
