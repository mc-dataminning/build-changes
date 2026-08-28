import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record edm(int ak) {
   public static final js.c<edm> a = a("block_activate");
   public static final js.c<edm> b = a("block_attach");
   public static final js.c<edm> c = a("block_change");
   public static final js.c<edm> d = a("block_close");
   public static final js.c<edm> e = a("block_deactivate");
   public static final js.c<edm> f = a("block_destroy");
   public static final js.c<edm> g = a("block_detach");
   public static final js.c<edm> h = a("block_open");
   public static final js.c<edm> i = a("block_place");
   public static final js.c<edm> j = a("container_close");
   public static final js.c<edm> k = a("container_open");
   public static final js.c<edm> l = a("drink");
   public static final js.c<edm> m = a("eat");
   public static final js.c<edm> n = a("elytra_glide");
   public static final js.c<edm> o = a("entity_damage");
   public static final js.c<edm> p = a("entity_die");
   public static final js.c<edm> q = a("entity_dismount");
   public static final js.c<edm> r = a("entity_interact");
   public static final js.c<edm> s = a("entity_mount");
   public static final js.c<edm> t = a("entity_place");
   public static final js.c<edm> u = a("entity_action");
   public static final js.c<edm> v = a("equip");
   public static final js.c<edm> w = a("explode");
   public static final js.c<edm> x = a("flap");
   public static final js.c<edm> y = a("fluid_pickup");
   public static final js.c<edm> z = a("fluid_place");
   public static final js.c<edm> A = a("hit_ground");
   public static final js.c<edm> B = a("instrument_play");
   public static final js.c<edm> C = a("item_interact_finish");
   public static final js.c<edm> D = a("item_interact_start");
   public static final js.c<edm> E = a("jukebox_play", 10);
   public static final js.c<edm> F = a("jukebox_stop_play", 10);
   public static final js.c<edm> G = a("lightning_strike");
   public static final js.c<edm> H = a("note_block_play");
   public static final js.c<edm> I = a("prime_fuse");
   public static final js.c<edm> J = a("projectile_land");
   public static final js.c<edm> K = a("projectile_shoot");
   public static final js.c<edm> L = a("sculk_sensor_tendrils_clicking");
   public static final js.c<edm> M = a("shear");
   public static final js.c<edm> N = a("shriek", 32);
   public static final js.c<edm> O = a("splash");
   public static final js.c<edm> P = a("step");
   public static final js.c<edm> Q = a("swim");
   public static final js.c<edm> R = a("teleport");
   public static final js.c<edm> S = a("unequip");
   public static final js.c<edm> T = a("resonate_1");
   public static final js.c<edm> U = a("resonate_2");
   public static final js.c<edm> V = a("resonate_3");
   public static final js.c<edm> W = a("resonate_4");
   public static final js.c<edm> X = a("resonate_5");
   public static final js.c<edm> Y = a("resonate_6");
   public static final js.c<edm> Z = a("resonate_7");
   public static final js.c<edm> aa = a("resonate_8");
   public static final js.c<edm> ab = a("resonate_9");
   public static final js.c<edm> ac = a("resonate_10");
   public static final js.c<edm> ad = a("resonate_11");
   public static final js.c<edm> ae = a("resonate_12");
   public static final js.c<edm> af = a("resonate_13");
   public static final js.c<edm> ag = a("resonate_14");
   public static final js.c<edm> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<js<edm>> aj = ala.a(me.G);

   public static js<edm> a(kf<edm> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static js.c<edm> a(String $$0) {
      return a($$0, 16);
   }

   private static js.c<edm> a(String $$0, int $$1) {
      return kf.b(md.a, ald.b($$0), new edm($$1));
   }

   public static record a(@Nullable bvs a, @Nullable dym b) {
      public static edm.a a(@Nullable bvs $$0) {
         return new edm.a($$0, null);
      }

      public static edm.a a(@Nullable dym $$0) {
         return new edm.a(null, $$0);
      }

      public static edm.a a(@Nullable bvs $$0, @Nullable dym $$1) {
         return new edm.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<edm.b> {
      private final js<edm> a;
      private final fcu b;
      private final edm.a c;
      private final edo d;
      private final double e;

      public b(js<edm> $$0, fcu $$1, edm.a $$2, edo $$3, fcu $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(edm.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public js<edm> a() {
         return this.a;
      }

      public fcu b() {
         return this.b;
      }

      public edm.a c() {
         return this.c;
      }

      public edo d() {
         return this.d;
      }
   }
}
