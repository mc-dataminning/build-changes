import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ecj(int ak) {
   public static final jq.c<ecj> a = a("block_activate");
   public static final jq.c<ecj> b = a("block_attach");
   public static final jq.c<ecj> c = a("block_change");
   public static final jq.c<ecj> d = a("block_close");
   public static final jq.c<ecj> e = a("block_deactivate");
   public static final jq.c<ecj> f = a("block_destroy");
   public static final jq.c<ecj> g = a("block_detach");
   public static final jq.c<ecj> h = a("block_open");
   public static final jq.c<ecj> i = a("block_place");
   public static final jq.c<ecj> j = a("container_close");
   public static final jq.c<ecj> k = a("container_open");
   public static final jq.c<ecj> l = a("drink");
   public static final jq.c<ecj> m = a("eat");
   public static final jq.c<ecj> n = a("elytra_glide");
   public static final jq.c<ecj> o = a("entity_damage");
   public static final jq.c<ecj> p = a("entity_die");
   public static final jq.c<ecj> q = a("entity_dismount");
   public static final jq.c<ecj> r = a("entity_interact");
   public static final jq.c<ecj> s = a("entity_mount");
   public static final jq.c<ecj> t = a("entity_place");
   public static final jq.c<ecj> u = a("entity_action");
   public static final jq.c<ecj> v = a("equip");
   public static final jq.c<ecj> w = a("explode");
   public static final jq.c<ecj> x = a("flap");
   public static final jq.c<ecj> y = a("fluid_pickup");
   public static final jq.c<ecj> z = a("fluid_place");
   public static final jq.c<ecj> A = a("hit_ground");
   public static final jq.c<ecj> B = a("instrument_play");
   public static final jq.c<ecj> C = a("item_interact_finish");
   public static final jq.c<ecj> D = a("item_interact_start");
   public static final jq.c<ecj> E = a("jukebox_play", 10);
   public static final jq.c<ecj> F = a("jukebox_stop_play", 10);
   public static final jq.c<ecj> G = a("lightning_strike");
   public static final jq.c<ecj> H = a("note_block_play");
   public static final jq.c<ecj> I = a("prime_fuse");
   public static final jq.c<ecj> J = a("projectile_land");
   public static final jq.c<ecj> K = a("projectile_shoot");
   public static final jq.c<ecj> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<ecj> M = a("shear");
   public static final jq.c<ecj> N = a("shriek", 32);
   public static final jq.c<ecj> O = a("splash");
   public static final jq.c<ecj> P = a("step");
   public static final jq.c<ecj> Q = a("swim");
   public static final jq.c<ecj> R = a("teleport");
   public static final jq.c<ecj> S = a("unequip");
   public static final jq.c<ecj> T = a("resonate_1");
   public static final jq.c<ecj> U = a("resonate_2");
   public static final jq.c<ecj> V = a("resonate_3");
   public static final jq.c<ecj> W = a("resonate_4");
   public static final jq.c<ecj> X = a("resonate_5");
   public static final jq.c<ecj> Y = a("resonate_6");
   public static final jq.c<ecj> Z = a("resonate_7");
   public static final jq.c<ecj> aa = a("resonate_8");
   public static final jq.c<ecj> ab = a("resonate_9");
   public static final jq.c<ecj> ac = a("resonate_10");
   public static final jq.c<ecj> ad = a("resonate_11");
   public static final jq.c<ecj> ae = a("resonate_12");
   public static final jq.c<ecj> af = a("resonate_13");
   public static final jq.c<ecj> ag = a("resonate_14");
   public static final jq.c<ecj> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<ecj>> aj = alw.a(mb.G);

   public static jq<ecj> a(kd<ecj> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<ecj> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<ecj> a(String $$0, int $$1) {
      return kd.b(ma.a, alz.b($$0), new ecj($$1));
   }

   public static record a(@Nullable bvf a, @Nullable dxn b) {
      public static ecj.a a(@Nullable bvf $$0) {
         return new ecj.a($$0, null);
      }

      public static ecj.a a(@Nullable dxn $$0) {
         return new ecj.a(null, $$0);
      }

      public static ecj.a a(@Nullable bvf $$0, @Nullable dxn $$1) {
         return new ecj.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ecj.b> {
      private final jq<ecj> a;
      private final fbs b;
      private final ecj.a c;
      private final ecl d;
      private final double e;

      public b(jq<ecj> $$0, fbs $$1, ecj.a $$2, ecl $$3, fbs $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ecj.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<ecj> a() {
         return this.a;
      }

      public fbs b() {
         return this.b;
      }

      public ecj.a c() {
         return this.c;
      }

      public ecl d() {
         return this.d;
      }
   }
}
