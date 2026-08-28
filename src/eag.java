import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eag(int ak) {
   public static final jq.c<eag> a = a("block_activate");
   public static final jq.c<eag> b = a("block_attach");
   public static final jq.c<eag> c = a("block_change");
   public static final jq.c<eag> d = a("block_close");
   public static final jq.c<eag> e = a("block_deactivate");
   public static final jq.c<eag> f = a("block_destroy");
   public static final jq.c<eag> g = a("block_detach");
   public static final jq.c<eag> h = a("block_open");
   public static final jq.c<eag> i = a("block_place");
   public static final jq.c<eag> j = a("container_close");
   public static final jq.c<eag> k = a("container_open");
   public static final jq.c<eag> l = a("drink");
   public static final jq.c<eag> m = a("eat");
   public static final jq.c<eag> n = a("elytra_glide");
   public static final jq.c<eag> o = a("entity_damage");
   public static final jq.c<eag> p = a("entity_die");
   public static final jq.c<eag> q = a("entity_dismount");
   public static final jq.c<eag> r = a("entity_interact");
   public static final jq.c<eag> s = a("entity_mount");
   public static final jq.c<eag> t = a("entity_place");
   public static final jq.c<eag> u = a("entity_action");
   public static final jq.c<eag> v = a("equip");
   public static final jq.c<eag> w = a("explode");
   public static final jq.c<eag> x = a("flap");
   public static final jq.c<eag> y = a("fluid_pickup");
   public static final jq.c<eag> z = a("fluid_place");
   public static final jq.c<eag> A = a("hit_ground");
   public static final jq.c<eag> B = a("instrument_play");
   public static final jq.c<eag> C = a("item_interact_finish");
   public static final jq.c<eag> D = a("item_interact_start");
   public static final jq.c<eag> E = a("jukebox_play", 10);
   public static final jq.c<eag> F = a("jukebox_stop_play", 10);
   public static final jq.c<eag> G = a("lightning_strike");
   public static final jq.c<eag> H = a("note_block_play");
   public static final jq.c<eag> I = a("prime_fuse");
   public static final jq.c<eag> J = a("projectile_land");
   public static final jq.c<eag> K = a("projectile_shoot");
   public static final jq.c<eag> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<eag> M = a("shear");
   public static final jq.c<eag> N = a("shriek", 32);
   public static final jq.c<eag> O = a("splash");
   public static final jq.c<eag> P = a("step");
   public static final jq.c<eag> Q = a("swim");
   public static final jq.c<eag> R = a("teleport");
   public static final jq.c<eag> S = a("unequip");
   public static final jq.c<eag> T = a("resonate_1");
   public static final jq.c<eag> U = a("resonate_2");
   public static final jq.c<eag> V = a("resonate_3");
   public static final jq.c<eag> W = a("resonate_4");
   public static final jq.c<eag> X = a("resonate_5");
   public static final jq.c<eag> Y = a("resonate_6");
   public static final jq.c<eag> Z = a("resonate_7");
   public static final jq.c<eag> aa = a("resonate_8");
   public static final jq.c<eag> ab = a("resonate_9");
   public static final jq.c<eag> ac = a("resonate_10");
   public static final jq.c<eag> ad = a("resonate_11");
   public static final jq.c<eag> ae = a("resonate_12");
   public static final jq.c<eag> af = a("resonate_13");
   public static final jq.c<eag> ag = a("resonate_14");
   public static final jq.c<eag> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<eag>> aj = alf.a(lz.G);

   public static jq<eag> a(kd<eag> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<eag> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<eag> a(String $$0, int $$1) {
      return kd.b(ly.a, ali.b($$0), new eag($$1));
   }

   public static record a(@Nullable bue a, @Nullable dvj b) {
      public static eag.a a(@Nullable bue $$0) {
         return new eag.a($$0, null);
      }

      public static eag.a a(@Nullable dvj $$0) {
         return new eag.a(null, $$0);
      }

      public static eag.a a(@Nullable bue $$0, @Nullable dvj $$1) {
         return new eag.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eag.b> {
      private final jq<eag> a;
      private final ezn b;
      private final eag.a c;
      private final eai d;
      private final double e;

      public b(jq<eag> $$0, ezn $$1, eag.a $$2, eai $$3, ezn $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eag.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<eag> a() {
         return this.a;
      }

      public ezn b() {
         return this.b;
      }

      public eag.a c() {
         return this.c;
      }

      public eai d() {
         return this.d;
      }
   }
}
