import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ecr(int ak) {
   public static final jq.c<ecr> a = a("block_activate");
   public static final jq.c<ecr> b = a("block_attach");
   public static final jq.c<ecr> c = a("block_change");
   public static final jq.c<ecr> d = a("block_close");
   public static final jq.c<ecr> e = a("block_deactivate");
   public static final jq.c<ecr> f = a("block_destroy");
   public static final jq.c<ecr> g = a("block_detach");
   public static final jq.c<ecr> h = a("block_open");
   public static final jq.c<ecr> i = a("block_place");
   public static final jq.c<ecr> j = a("container_close");
   public static final jq.c<ecr> k = a("container_open");
   public static final jq.c<ecr> l = a("drink");
   public static final jq.c<ecr> m = a("eat");
   public static final jq.c<ecr> n = a("elytra_glide");
   public static final jq.c<ecr> o = a("entity_damage");
   public static final jq.c<ecr> p = a("entity_die");
   public static final jq.c<ecr> q = a("entity_dismount");
   public static final jq.c<ecr> r = a("entity_interact");
   public static final jq.c<ecr> s = a("entity_mount");
   public static final jq.c<ecr> t = a("entity_place");
   public static final jq.c<ecr> u = a("entity_action");
   public static final jq.c<ecr> v = a("equip");
   public static final jq.c<ecr> w = a("explode");
   public static final jq.c<ecr> x = a("flap");
   public static final jq.c<ecr> y = a("fluid_pickup");
   public static final jq.c<ecr> z = a("fluid_place");
   public static final jq.c<ecr> A = a("hit_ground");
   public static final jq.c<ecr> B = a("instrument_play");
   public static final jq.c<ecr> C = a("item_interact_finish");
   public static final jq.c<ecr> D = a("item_interact_start");
   public static final jq.c<ecr> E = a("jukebox_play", 10);
   public static final jq.c<ecr> F = a("jukebox_stop_play", 10);
   public static final jq.c<ecr> G = a("lightning_strike");
   public static final jq.c<ecr> H = a("note_block_play");
   public static final jq.c<ecr> I = a("prime_fuse");
   public static final jq.c<ecr> J = a("projectile_land");
   public static final jq.c<ecr> K = a("projectile_shoot");
   public static final jq.c<ecr> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<ecr> M = a("shear");
   public static final jq.c<ecr> N = a("shriek", 32);
   public static final jq.c<ecr> O = a("splash");
   public static final jq.c<ecr> P = a("step");
   public static final jq.c<ecr> Q = a("swim");
   public static final jq.c<ecr> R = a("teleport");
   public static final jq.c<ecr> S = a("unequip");
   public static final jq.c<ecr> T = a("resonate_1");
   public static final jq.c<ecr> U = a("resonate_2");
   public static final jq.c<ecr> V = a("resonate_3");
   public static final jq.c<ecr> W = a("resonate_4");
   public static final jq.c<ecr> X = a("resonate_5");
   public static final jq.c<ecr> Y = a("resonate_6");
   public static final jq.c<ecr> Z = a("resonate_7");
   public static final jq.c<ecr> aa = a("resonate_8");
   public static final jq.c<ecr> ab = a("resonate_9");
   public static final jq.c<ecr> ac = a("resonate_10");
   public static final jq.c<ecr> ad = a("resonate_11");
   public static final jq.c<ecr> ae = a("resonate_12");
   public static final jq.c<ecr> af = a("resonate_13");
   public static final jq.c<ecr> ag = a("resonate_14");
   public static final jq.c<ecr> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<ecr>> aj = alw.a(mb.G);

   public static jq<ecr> a(kd<ecr> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<ecr> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<ecr> a(String $$0, int $$1) {
      return kd.b(ma.a, alz.b($$0), new ecr($$1));
   }

   public static record a(@Nullable bvk a, @Nullable dxv b) {
      public static ecr.a a(@Nullable bvk $$0) {
         return new ecr.a($$0, null);
      }

      public static ecr.a a(@Nullable dxv $$0) {
         return new ecr.a(null, $$0);
      }

      public static ecr.a a(@Nullable bvk $$0, @Nullable dxv $$1) {
         return new ecr.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ecr.b> {
      private final jq<ecr> a;
      private final fby b;
      private final ecr.a c;
      private final ect d;
      private final double e;

      public b(jq<ecr> $$0, fby $$1, ecr.a $$2, ect $$3, fby $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ecr.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<ecr> a() {
         return this.a;
      }

      public fby b() {
         return this.b;
      }

      public ecr.a c() {
         return this.c;
      }

      public ect d() {
         return this.d;
      }
   }
}
