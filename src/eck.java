import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eck(int ak) {
   public static final jq.c<eck> a = a("block_activate");
   public static final jq.c<eck> b = a("block_attach");
   public static final jq.c<eck> c = a("block_change");
   public static final jq.c<eck> d = a("block_close");
   public static final jq.c<eck> e = a("block_deactivate");
   public static final jq.c<eck> f = a("block_destroy");
   public static final jq.c<eck> g = a("block_detach");
   public static final jq.c<eck> h = a("block_open");
   public static final jq.c<eck> i = a("block_place");
   public static final jq.c<eck> j = a("container_close");
   public static final jq.c<eck> k = a("container_open");
   public static final jq.c<eck> l = a("drink");
   public static final jq.c<eck> m = a("eat");
   public static final jq.c<eck> n = a("elytra_glide");
   public static final jq.c<eck> o = a("entity_damage");
   public static final jq.c<eck> p = a("entity_die");
   public static final jq.c<eck> q = a("entity_dismount");
   public static final jq.c<eck> r = a("entity_interact");
   public static final jq.c<eck> s = a("entity_mount");
   public static final jq.c<eck> t = a("entity_place");
   public static final jq.c<eck> u = a("entity_action");
   public static final jq.c<eck> v = a("equip");
   public static final jq.c<eck> w = a("explode");
   public static final jq.c<eck> x = a("flap");
   public static final jq.c<eck> y = a("fluid_pickup");
   public static final jq.c<eck> z = a("fluid_place");
   public static final jq.c<eck> A = a("hit_ground");
   public static final jq.c<eck> B = a("instrument_play");
   public static final jq.c<eck> C = a("item_interact_finish");
   public static final jq.c<eck> D = a("item_interact_start");
   public static final jq.c<eck> E = a("jukebox_play", 10);
   public static final jq.c<eck> F = a("jukebox_stop_play", 10);
   public static final jq.c<eck> G = a("lightning_strike");
   public static final jq.c<eck> H = a("note_block_play");
   public static final jq.c<eck> I = a("prime_fuse");
   public static final jq.c<eck> J = a("projectile_land");
   public static final jq.c<eck> K = a("projectile_shoot");
   public static final jq.c<eck> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<eck> M = a("shear");
   public static final jq.c<eck> N = a("shriek", 32);
   public static final jq.c<eck> O = a("splash");
   public static final jq.c<eck> P = a("step");
   public static final jq.c<eck> Q = a("swim");
   public static final jq.c<eck> R = a("teleport");
   public static final jq.c<eck> S = a("unequip");
   public static final jq.c<eck> T = a("resonate_1");
   public static final jq.c<eck> U = a("resonate_2");
   public static final jq.c<eck> V = a("resonate_3");
   public static final jq.c<eck> W = a("resonate_4");
   public static final jq.c<eck> X = a("resonate_5");
   public static final jq.c<eck> Y = a("resonate_6");
   public static final jq.c<eck> Z = a("resonate_7");
   public static final jq.c<eck> aa = a("resonate_8");
   public static final jq.c<eck> ab = a("resonate_9");
   public static final jq.c<eck> ac = a("resonate_10");
   public static final jq.c<eck> ad = a("resonate_11");
   public static final jq.c<eck> ae = a("resonate_12");
   public static final jq.c<eck> af = a("resonate_13");
   public static final jq.c<eck> ag = a("resonate_14");
   public static final jq.c<eck> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<eck>> aj = alm.a(mb.G);

   public static jq<eck> a(kd<eck> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<eck> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<eck> a(String $$0, int $$1) {
      return kd.b(ma.a, alp.b($$0), new eck($$1));
   }

   public static record a(@Nullable bvb a, @Nullable dxo b) {
      public static eck.a a(@Nullable bvb $$0) {
         return new eck.a($$0, null);
      }

      public static eck.a a(@Nullable dxo $$0) {
         return new eck.a(null, $$0);
      }

      public static eck.a a(@Nullable bvb $$0, @Nullable dxo $$1) {
         return new eck.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eck.b> {
      private final jq<eck> a;
      private final fbr b;
      private final eck.a c;
      private final ecm d;
      private final double e;

      public b(jq<eck> $$0, fbr $$1, eck.a $$2, ecm $$3, fbr $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eck.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<eck> a() {
         return this.a;
      }

      public fbr b() {
         return this.b;
      }

      public eck.a c() {
         return this.c;
      }

      public ecm d() {
         return this.d;
      }
   }
}
