import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record ear(int ak) {
   public static final jq.c<ear> a = a("block_activate");
   public static final jq.c<ear> b = a("block_attach");
   public static final jq.c<ear> c = a("block_change");
   public static final jq.c<ear> d = a("block_close");
   public static final jq.c<ear> e = a("block_deactivate");
   public static final jq.c<ear> f = a("block_destroy");
   public static final jq.c<ear> g = a("block_detach");
   public static final jq.c<ear> h = a("block_open");
   public static final jq.c<ear> i = a("block_place");
   public static final jq.c<ear> j = a("container_close");
   public static final jq.c<ear> k = a("container_open");
   public static final jq.c<ear> l = a("drink");
   public static final jq.c<ear> m = a("eat");
   public static final jq.c<ear> n = a("elytra_glide");
   public static final jq.c<ear> o = a("entity_damage");
   public static final jq.c<ear> p = a("entity_die");
   public static final jq.c<ear> q = a("entity_dismount");
   public static final jq.c<ear> r = a("entity_interact");
   public static final jq.c<ear> s = a("entity_mount");
   public static final jq.c<ear> t = a("entity_place");
   public static final jq.c<ear> u = a("entity_action");
   public static final jq.c<ear> v = a("equip");
   public static final jq.c<ear> w = a("explode");
   public static final jq.c<ear> x = a("flap");
   public static final jq.c<ear> y = a("fluid_pickup");
   public static final jq.c<ear> z = a("fluid_place");
   public static final jq.c<ear> A = a("hit_ground");
   public static final jq.c<ear> B = a("instrument_play");
   public static final jq.c<ear> C = a("item_interact_finish");
   public static final jq.c<ear> D = a("item_interact_start");
   public static final jq.c<ear> E = a("jukebox_play", 10);
   public static final jq.c<ear> F = a("jukebox_stop_play", 10);
   public static final jq.c<ear> G = a("lightning_strike");
   public static final jq.c<ear> H = a("note_block_play");
   public static final jq.c<ear> I = a("prime_fuse");
   public static final jq.c<ear> J = a("projectile_land");
   public static final jq.c<ear> K = a("projectile_shoot");
   public static final jq.c<ear> L = a("sculk_sensor_tendrils_clicking");
   public static final jq.c<ear> M = a("shear");
   public static final jq.c<ear> N = a("shriek", 32);
   public static final jq.c<ear> O = a("splash");
   public static final jq.c<ear> P = a("step");
   public static final jq.c<ear> Q = a("swim");
   public static final jq.c<ear> R = a("teleport");
   public static final jq.c<ear> S = a("unequip");
   public static final jq.c<ear> T = a("resonate_1");
   public static final jq.c<ear> U = a("resonate_2");
   public static final jq.c<ear> V = a("resonate_3");
   public static final jq.c<ear> W = a("resonate_4");
   public static final jq.c<ear> X = a("resonate_5");
   public static final jq.c<ear> Y = a("resonate_6");
   public static final jq.c<ear> Z = a("resonate_7");
   public static final jq.c<ear> aa = a("resonate_8");
   public static final jq.c<ear> ab = a("resonate_9");
   public static final jq.c<ear> ac = a("resonate_10");
   public static final jq.c<ear> ad = a("resonate_11");
   public static final jq.c<ear> ae = a("resonate_12");
   public static final jq.c<ear> af = a("resonate_13");
   public static final jq.c<ear> ag = a("resonate_14");
   public static final jq.c<ear> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jq<ear>> aj = alg.a(ma.G);

   public static jq<ear> a(kd<ear> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jq.c<ear> a(String $$0) {
      return a($$0, 16);
   }

   private static jq.c<ear> a(String $$0, int $$1) {
      return kd.b(lz.a, alj.b($$0), new ear($$1));
   }

   public static record a(@Nullable bul a, @Nullable dvv b) {
      public static ear.a a(@Nullable bul $$0) {
         return new ear.a($$0, null);
      }

      public static ear.a a(@Nullable dvv $$0) {
         return new ear.a(null, $$0);
      }

      public static ear.a a(@Nullable bul $$0, @Nullable dvv $$1) {
         return new ear.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<ear.b> {
      private final jq<ear> a;
      private final ezy b;
      private final ear.a c;
      private final eat d;
      private final double e;

      public b(jq<ear> $$0, ezy $$1, ear.a $$2, eat $$3, ezy $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(ear.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jq<ear> a() {
         return this.a;
      }

      public ezy b() {
         return this.b;
      }

      public ear.a c() {
         return this.c;
      }

      public eat d() {
         return this.d;
      }
   }
}
