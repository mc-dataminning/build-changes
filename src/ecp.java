import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ecp(int ak) {
   public static final jr.c<ecp> a = a("block_activate");
   public static final jr.c<ecp> b = a("block_attach");
   public static final jr.c<ecp> c = a("block_change");
   public static final jr.c<ecp> d = a("block_close");
   public static final jr.c<ecp> e = a("block_deactivate");
   public static final jr.c<ecp> f = a("block_destroy");
   public static final jr.c<ecp> g = a("block_detach");
   public static final jr.c<ecp> h = a("block_open");
   public static final jr.c<ecp> i = a("block_place");
   public static final jr.c<ecp> j = a("container_close");
   public static final jr.c<ecp> k = a("container_open");
   public static final jr.c<ecp> l = a("drink");
   public static final jr.c<ecp> m = a("eat");
   public static final jr.c<ecp> n = a("elytra_glide");
   public static final jr.c<ecp> o = a("entity_damage");
   public static final jr.c<ecp> p = a("entity_die");
   public static final jr.c<ecp> q = a("entity_dismount");
   public static final jr.c<ecp> r = a("entity_interact");
   public static final jr.c<ecp> s = a("entity_mount");
   public static final jr.c<ecp> t = a("entity_place");
   public static final jr.c<ecp> u = a("entity_action");
   public static final jr.c<ecp> v = a("equip");
   public static final jr.c<ecp> w = a("explode");
   public static final jr.c<ecp> x = a("flap");
   public static final jr.c<ecp> y = a("fluid_pickup");
   public static final jr.c<ecp> z = a("fluid_place");
   public static final jr.c<ecp> A = a("hit_ground");
   public static final jr.c<ecp> B = a("instrument_play");
   public static final jr.c<ecp> C = a("item_interact_finish");
   public static final jr.c<ecp> D = a("item_interact_start");
   public static final jr.c<ecp> E = a("jukebox_play", 10);
   public static final jr.c<ecp> F = a("jukebox_stop_play", 10);
   public static final jr.c<ecp> G = a("lightning_strike");
   public static final jr.c<ecp> H = a("note_block_play");
   public static final jr.c<ecp> I = a("prime_fuse");
   public static final jr.c<ecp> J = a("projectile_land");
   public static final jr.c<ecp> K = a("projectile_shoot");
   public static final jr.c<ecp> L = a("sculk_sensor_tendrils_clicking");
   public static final jr.c<ecp> M = a("shear");
   public static final jr.c<ecp> N = a("shriek", 32);
   public static final jr.c<ecp> O = a("splash");
   public static final jr.c<ecp> P = a("step");
   public static final jr.c<ecp> Q = a("swim");
   public static final jr.c<ecp> R = a("teleport");
   public static final jr.c<ecp> S = a("unequip");
   public static final jr.c<ecp> T = a("resonate_1");
   public static final jr.c<ecp> U = a("resonate_2");
   public static final jr.c<ecp> V = a("resonate_3");
   public static final jr.c<ecp> W = a("resonate_4");
   public static final jr.c<ecp> X = a("resonate_5");
   public static final jr.c<ecp> Y = a("resonate_6");
   public static final jr.c<ecp> Z = a("resonate_7");
   public static final jr.c<ecp> aa = a("resonate_8");
   public static final jr.c<ecp> ab = a("resonate_9");
   public static final jr.c<ecp> ac = a("resonate_10");
   public static final jr.c<ecp> ad = a("resonate_11");
   public static final jr.c<ecp> ae = a("resonate_12");
   public static final jr.c<ecp> af = a("resonate_13");
   public static final jr.c<ecp> ag = a("resonate_14");
   public static final jr.c<ecp> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jr<ecp>> aj = akr.a(mc.G);

   public static jr<ecp> a(ke<ecp> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jr.c<ecp> a(String $$0) {
      return a($$0, 16);
   }

   private static jr.c<ecp> a(String $$0, int $$1) {
      return ke.b(mb.a, aku.b($$0), new ecp($$1));
   }

   public static record a(@Nullable bva a, @Nullable dxq b) {
      public static ecp.a a(@Nullable bva $$0) {
         return new ecp.a($$0, null);
      }

      public static ecp.a a(@Nullable dxq $$0) {
         return new ecp.a(null, $$0);
      }

      public static ecp.a a(@Nullable bva $$0, @Nullable dxq $$1) {
         return new ecp.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ecp.b> {
      private final jr<ecp> a;
      private final fbx b;
      private final ecp.a c;
      private final ecr d;
      private final double e;

      public b(jr<ecp> $$0, fbx $$1, ecp.a $$2, ecr $$3, fbx $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ecp.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jr<ecp> a() {
         return this.a;
      }

      public fbx b() {
         return this.b;
      }

      public ecp.a c() {
         return this.c;
      }

      public ecr d() {
         return this.d;
      }
   }
}
