import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ebs(int ak) {
   public static final jr.c<ebs> a = a("block_activate");
   public static final jr.c<ebs> b = a("block_attach");
   public static final jr.c<ebs> c = a("block_change");
   public static final jr.c<ebs> d = a("block_close");
   public static final jr.c<ebs> e = a("block_deactivate");
   public static final jr.c<ebs> f = a("block_destroy");
   public static final jr.c<ebs> g = a("block_detach");
   public static final jr.c<ebs> h = a("block_open");
   public static final jr.c<ebs> i = a("block_place");
   public static final jr.c<ebs> j = a("container_close");
   public static final jr.c<ebs> k = a("container_open");
   public static final jr.c<ebs> l = a("drink");
   public static final jr.c<ebs> m = a("eat");
   public static final jr.c<ebs> n = a("elytra_glide");
   public static final jr.c<ebs> o = a("entity_damage");
   public static final jr.c<ebs> p = a("entity_die");
   public static final jr.c<ebs> q = a("entity_dismount");
   public static final jr.c<ebs> r = a("entity_interact");
   public static final jr.c<ebs> s = a("entity_mount");
   public static final jr.c<ebs> t = a("entity_place");
   public static final jr.c<ebs> u = a("entity_action");
   public static final jr.c<ebs> v = a("equip");
   public static final jr.c<ebs> w = a("explode");
   public static final jr.c<ebs> x = a("flap");
   public static final jr.c<ebs> y = a("fluid_pickup");
   public static final jr.c<ebs> z = a("fluid_place");
   public static final jr.c<ebs> A = a("hit_ground");
   public static final jr.c<ebs> B = a("instrument_play");
   public static final jr.c<ebs> C = a("item_interact_finish");
   public static final jr.c<ebs> D = a("item_interact_start");
   public static final jr.c<ebs> E = a("jukebox_play", 10);
   public static final jr.c<ebs> F = a("jukebox_stop_play", 10);
   public static final jr.c<ebs> G = a("lightning_strike");
   public static final jr.c<ebs> H = a("note_block_play");
   public static final jr.c<ebs> I = a("prime_fuse");
   public static final jr.c<ebs> J = a("projectile_land");
   public static final jr.c<ebs> K = a("projectile_shoot");
   public static final jr.c<ebs> L = a("sculk_sensor_tendrils_clicking");
   public static final jr.c<ebs> M = a("shear");
   public static final jr.c<ebs> N = a("shriek", 32);
   public static final jr.c<ebs> O = a("splash");
   public static final jr.c<ebs> P = a("step");
   public static final jr.c<ebs> Q = a("swim");
   public static final jr.c<ebs> R = a("teleport");
   public static final jr.c<ebs> S = a("unequip");
   public static final jr.c<ebs> T = a("resonate_1");
   public static final jr.c<ebs> U = a("resonate_2");
   public static final jr.c<ebs> V = a("resonate_3");
   public static final jr.c<ebs> W = a("resonate_4");
   public static final jr.c<ebs> X = a("resonate_5");
   public static final jr.c<ebs> Y = a("resonate_6");
   public static final jr.c<ebs> Z = a("resonate_7");
   public static final jr.c<ebs> aa = a("resonate_8");
   public static final jr.c<ebs> ab = a("resonate_9");
   public static final jr.c<ebs> ac = a("resonate_10");
   public static final jr.c<ebs> ad = a("resonate_11");
   public static final jr.c<ebs> ae = a("resonate_12");
   public static final jr.c<ebs> af = a("resonate_13");
   public static final jr.c<ebs> ag = a("resonate_14");
   public static final jr.c<ebs> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jr<ebs>> aj = aks.a(mc.G);

   public static jr<ebs> a(ke<ebs> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jr.c<ebs> a(String $$0) {
      return a($$0, 16);
   }

   private static jr.c<ebs> a(String $$0, int $$1) {
      return ke.b(mb.a, akv.b($$0), new ebs($$1));
   }

   public static record a(@Nullable buk a, @Nullable dww b) {
      public static ebs.a a(@Nullable buk $$0) {
         return new ebs.a($$0, null);
      }

      public static ebs.a a(@Nullable dww $$0) {
         return new ebs.a(null, $$0);
      }

      public static ebs.a a(@Nullable buk $$0, @Nullable dww $$1) {
         return new ebs.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ebs.b> {
      private final jr<ebs> a;
      private final faz b;
      private final ebs.a c;
      private final ebu d;
      private final double e;

      public b(jr<ebs> $$0, faz $$1, ebs.a $$2, ebu $$3, faz $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ebs.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jr<ebs> a() {
         return this.a;
      }

      public faz b() {
         return this.b;
      }

      public ebs.a c() {
         return this.c;
      }

      public ebu d() {
         return this.d;
      }
   }
}
