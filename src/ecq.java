import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ecq(int ak) {
   public static final jq.c<ecq> a = a("block_activate");
   public static final jq.c<ecq> b = a("block_attach");
   public static final jq.c<ecq> c = a("block_change");
   public static final jq.c<ecq> d = a("block_close");
   public static final jq.c<ecq> e = a("block_deactivate");
   public static final jq.c<ecq> f = a("block_destroy");
   public static final jq.c<ecq> g = a("block_detach");
   public static final jq.c<ecq> h = a("block_open");
   public static final jq.c<ecq> i = a("block_place");
   public static final jq.c<ecq> j = a("container_close");
   public static final jq.c<ecq> k = a("container_open");
   public static final jq.c<ecq> l = a("drink");
   public static final jq.c<ecq> m = a("eat");
   public static final jq.c<ecq> n = a("elytra_glide");
   public static final jq.c<ecq> o = a("entity_damage");
   public static final jq.c<ecq> p = a("entity_die");
   public static final jq.c<ecq> q = a("entity_dismount");
   public static final jq.c<ecq> r = a("entity_interact");
   public static final jq.c<ecq> s = a("entity_mount");
   public static final jq.c<ecq> t = a("entity_place");
   public static final jq.c<ecq> u = a("entity_action");
   public static final jq.c<ecq> v = a("equip");
   public static final jq.c<ecq> w = a("explode");
   public static final jq.c<ecq> x = a("flap");
   public static final jq.c<ecq> y = a("fluid_pickup");
   public static final jq.c<ecq> z = a("fluid_place");
   public static final jq.c<ecq> A = a("hit_ground");
   public static final jq.c<ecq> B = a("instrument_play");
   public static final jq.c<ecq> C = a("item_interact_finish");
   public static final jq.c<ecq> D = a("item_interact_start");
   public static final jq.c<ecq> E = a("jukebox_play", 10);
   public static final jq.c<ecq> F = a("jukebox_stop_play", 10);
   public static final jq.c<ecq> G = a("lightning_strike");
   public static final jq.c<ecq> H = a("note_block_play");
   public static final jq.c<ecq> I = a("prime_fuse");
   public static final jq.c<ecq> J = a("projectile_land");
   public static final jq.c<ecq> K = a("projectile_shoot");
   public static final jq.c<ecq> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<ecq> M = a("shear");
   public static final jq.c<ecq> N = a("shriek", 32);
   public static final jq.c<ecq> O = a("splash");
   public static final jq.c<ecq> P = a("step");
   public static final jq.c<ecq> Q = a("swim");
   public static final jq.c<ecq> R = a("teleport");
   public static final jq.c<ecq> S = a("unequip");
   public static final jq.c<ecq> T = a("resonate_1");
   public static final jq.c<ecq> U = a("resonate_2");
   public static final jq.c<ecq> V = a("resonate_3");
   public static final jq.c<ecq> W = a("resonate_4");
   public static final jq.c<ecq> X = a("resonate_5");
   public static final jq.c<ecq> Y = a("resonate_6");
   public static final jq.c<ecq> Z = a("resonate_7");
   public static final jq.c<ecq> aa = a("resonate_8");
   public static final jq.c<ecq> ab = a("resonate_9");
   public static final jq.c<ecq> ac = a("resonate_10");
   public static final jq.c<ecq> ad = a("resonate_11");
   public static final jq.c<ecq> ae = a("resonate_12");
   public static final jq.c<ecq> af = a("resonate_13");
   public static final jq.c<ecq> ag = a("resonate_14");
   public static final jq.c<ecq> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<ecq>> aj = alw.a(mb.G);

   public static jq<ecq> a(kd<ecq> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<ecq> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<ecq> a(String $$0, int $$1) {
      return kd.b(ma.a, alz.b($$0), new ecq($$1));
   }

   public static record a(@Nullable bvj a, @Nullable dxu b) {
      public static ecq.a a(@Nullable bvj $$0) {
         return new ecq.a($$0, null);
      }

      public static ecq.a a(@Nullable dxu $$0) {
         return new ecq.a(null, $$0);
      }

      public static ecq.a a(@Nullable bvj $$0, @Nullable dxu $$1) {
         return new ecq.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ecq.b> {
      private final jq<ecq> a;
      private final fbx b;
      private final ecq.a c;
      private final ecs d;
      private final double e;

      public b(jq<ecq> $$0, fbx $$1, ecq.a $$2, ecs $$3, fbx $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ecq.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<ecq> a() {
         return this.a;
      }

      public fbx b() {
         return this.b;
      }

      public ecq.a c() {
         return this.c;
      }

      public ecs d() {
         return this.d;
      }
   }
}
