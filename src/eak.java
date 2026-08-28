import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eak(int ak) {
   public static final jq.c<eak> a = a("block_activate");
   public static final jq.c<eak> b = a("block_attach");
   public static final jq.c<eak> c = a("block_change");
   public static final jq.c<eak> d = a("block_close");
   public static final jq.c<eak> e = a("block_deactivate");
   public static final jq.c<eak> f = a("block_destroy");
   public static final jq.c<eak> g = a("block_detach");
   public static final jq.c<eak> h = a("block_open");
   public static final jq.c<eak> i = a("block_place");
   public static final jq.c<eak> j = a("container_close");
   public static final jq.c<eak> k = a("container_open");
   public static final jq.c<eak> l = a("drink");
   public static final jq.c<eak> m = a("eat");
   public static final jq.c<eak> n = a("elytra_glide");
   public static final jq.c<eak> o = a("entity_damage");
   public static final jq.c<eak> p = a("entity_die");
   public static final jq.c<eak> q = a("entity_dismount");
   public static final jq.c<eak> r = a("entity_interact");
   public static final jq.c<eak> s = a("entity_mount");
   public static final jq.c<eak> t = a("entity_place");
   public static final jq.c<eak> u = a("entity_action");
   public static final jq.c<eak> v = a("equip");
   public static final jq.c<eak> w = a("explode");
   public static final jq.c<eak> x = a("flap");
   public static final jq.c<eak> y = a("fluid_pickup");
   public static final jq.c<eak> z = a("fluid_place");
   public static final jq.c<eak> A = a("hit_ground");
   public static final jq.c<eak> B = a("instrument_play");
   public static final jq.c<eak> C = a("item_interact_finish");
   public static final jq.c<eak> D = a("item_interact_start");
   public static final jq.c<eak> E = a("jukebox_play", 10);
   public static final jq.c<eak> F = a("jukebox_stop_play", 10);
   public static final jq.c<eak> G = a("lightning_strike");
   public static final jq.c<eak> H = a("note_block_play");
   public static final jq.c<eak> I = a("prime_fuse");
   public static final jq.c<eak> J = a("projectile_land");
   public static final jq.c<eak> K = a("projectile_shoot");
   public static final jq.c<eak> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<eak> M = a("shear");
   public static final jq.c<eak> N = a("shriek", 32);
   public static final jq.c<eak> O = a("splash");
   public static final jq.c<eak> P = a("step");
   public static final jq.c<eak> Q = a("swim");
   public static final jq.c<eak> R = a("teleport");
   public static final jq.c<eak> S = a("unequip");
   public static final jq.c<eak> T = a("resonate_1");
   public static final jq.c<eak> U = a("resonate_2");
   public static final jq.c<eak> V = a("resonate_3");
   public static final jq.c<eak> W = a("resonate_4");
   public static final jq.c<eak> X = a("resonate_5");
   public static final jq.c<eak> Y = a("resonate_6");
   public static final jq.c<eak> Z = a("resonate_7");
   public static final jq.c<eak> aa = a("resonate_8");
   public static final jq.c<eak> ab = a("resonate_9");
   public static final jq.c<eak> ac = a("resonate_10");
   public static final jq.c<eak> ad = a("resonate_11");
   public static final jq.c<eak> ae = a("resonate_12");
   public static final jq.c<eak> af = a("resonate_13");
   public static final jq.c<eak> ag = a("resonate_14");
   public static final jq.c<eak> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<eak>> aj = ali.a(ma.G);

   public static jq<eak> a(kd<eak> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<eak> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<eak> a(String $$0, int $$1) {
      return kd.b(lz.a, all.b($$0), new eak($$1));
   }

   public static record a(@Nullable bui a, @Nullable dvo b) {
      public static eak.a a(@Nullable bui $$0) {
         return new eak.a($$0, null);
      }

      public static eak.a a(@Nullable dvo $$0) {
         return new eak.a(null, $$0);
      }

      public static eak.a a(@Nullable bui $$0, @Nullable dvo $$1) {
         return new eak.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eak.b> {
      private final jq<eak> a;
      private final ezr b;
      private final eak.a c;
      private final eam d;
      private final double e;

      public b(jq<eak> $$0, ezr $$1, eak.a $$2, eam $$3, ezr $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eak.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<eak> a() {
         return this.a;
      }

      public ezr b() {
         return this.b;
      }

      public eak.a c() {
         return this.c;
      }

      public eam d() {
         return this.d;
      }
   }
}
