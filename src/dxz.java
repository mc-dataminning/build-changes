import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dxz(int ak) {
   public static final jm.c<dxz> a = a("block_activate");
   public static final jm.c<dxz> b = a("block_attach");
   public static final jm.c<dxz> c = a("block_change");
   public static final jm.c<dxz> d = a("block_close");
   public static final jm.c<dxz> e = a("block_deactivate");
   public static final jm.c<dxz> f = a("block_destroy");
   public static final jm.c<dxz> g = a("block_detach");
   public static final jm.c<dxz> h = a("block_open");
   public static final jm.c<dxz> i = a("block_place");
   public static final jm.c<dxz> j = a("container_close");
   public static final jm.c<dxz> k = a("container_open");
   public static final jm.c<dxz> l = a("drink");
   public static final jm.c<dxz> m = a("eat");
   public static final jm.c<dxz> n = a("elytra_glide");
   public static final jm.c<dxz> o = a("entity_damage");
   public static final jm.c<dxz> p = a("entity_die");
   public static final jm.c<dxz> q = a("entity_dismount");
   public static final jm.c<dxz> r = a("entity_interact");
   public static final jm.c<dxz> s = a("entity_mount");
   public static final jm.c<dxz> t = a("entity_place");
   public static final jm.c<dxz> u = a("entity_action");
   public static final jm.c<dxz> v = a("equip");
   public static final jm.c<dxz> w = a("explode");
   public static final jm.c<dxz> x = a("flap");
   public static final jm.c<dxz> y = a("fluid_pickup");
   public static final jm.c<dxz> z = a("fluid_place");
   public static final jm.c<dxz> A = a("hit_ground");
   public static final jm.c<dxz> B = a("instrument_play");
   public static final jm.c<dxz> C = a("item_interact_finish");
   public static final jm.c<dxz> D = a("item_interact_start");
   public static final jm.c<dxz> E = a("jukebox_play", 10);
   public static final jm.c<dxz> F = a("jukebox_stop_play", 10);
   public static final jm.c<dxz> G = a("lightning_strike");
   public static final jm.c<dxz> H = a("note_block_play");
   public static final jm.c<dxz> I = a("prime_fuse");
   public static final jm.c<dxz> J = a("projectile_land");
   public static final jm.c<dxz> K = a("projectile_shoot");
   public static final jm.c<dxz> L = a("sculk_sensor_tendrils_clicking");
   public static final jm.c<dxz> M = a("shear");
   public static final jm.c<dxz> N = a("shriek", 32);
   public static final jm.c<dxz> O = a("splash");
   public static final jm.c<dxz> P = a("step");
   public static final jm.c<dxz> Q = a("swim");
   public static final jm.c<dxz> R = a("teleport");
   public static final jm.c<dxz> S = a("unequip");
   public static final jm.c<dxz> T = a("resonate_1");
   public static final jm.c<dxz> U = a("resonate_2");
   public static final jm.c<dxz> V = a("resonate_3");
   public static final jm.c<dxz> W = a("resonate_4");
   public static final jm.c<dxz> X = a("resonate_5");
   public static final jm.c<dxz> Y = a("resonate_6");
   public static final jm.c<dxz> Z = a("resonate_7");
   public static final jm.c<dxz> aa = a("resonate_8");
   public static final jm.c<dxz> ab = a("resonate_9");
   public static final jm.c<dxz> ac = a("resonate_10");
   public static final jm.c<dxz> ad = a("resonate_11");
   public static final jm.c<dxz> ae = a("resonate_12");
   public static final jm.c<dxz> af = a("resonate_13");
   public static final jm.c<dxz> ag = a("resonate_14");
   public static final jm.c<dxz> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jm<dxz>> aj = ako.a(lu.G);

   public static jm<dxz> a(jz<dxz> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jm.c<dxz> a(String $$0) {
      return a($$0, 16);
   }

   private static jm.c<dxz> a(String $$0, int $$1) {
      return jz.b(lt.a, akr.b($$0), new dxz($$1));
   }

   public static record a(@Nullable bsr a, @Nullable dtc b) {
      public static dxz.a a(@Nullable bsr $$0) {
         return new dxz.a($$0, null);
      }

      public static dxz.a a(@Nullable dtc $$0) {
         return new dxz.a(null, $$0);
      }

      public static dxz.a a(@Nullable bsr $$0, @Nullable dtc $$1) {
         return new dxz.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxz.b> {
      private final jm<dxz> a;
      private final exa b;
      private final dxz.a c;
      private final dyb d;
      private final double e;

      public b(jm<dxz> $$0, exa $$1, dxz.a $$2, dyb $$3, exa $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxz.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jm<dxz> a() {
         return this.a;
      }

      public exa b() {
         return this.b;
      }

      public dxz.a c() {
         return this.c;
      }

      public dyb d() {
         return this.d;
      }
   }
}
