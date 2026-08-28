import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record efo(int ak) {
   public static final jf.c<efo> a = a("block_activate");
   public static final jf.c<efo> b = a("block_attach");
   public static final jf.c<efo> c = a("block_change");
   public static final jf.c<efo> d = a("block_close");
   public static final jf.c<efo> e = a("block_deactivate");
   public static final jf.c<efo> f = a("block_destroy");
   public static final jf.c<efo> g = a("block_detach");
   public static final jf.c<efo> h = a("block_open");
   public static final jf.c<efo> i = a("block_place");
   public static final jf.c<efo> j = a("container_close");
   public static final jf.c<efo> k = a("container_open");
   public static final jf.c<efo> l = a("drink");
   public static final jf.c<efo> m = a("eat");
   public static final jf.c<efo> n = a("elytra_glide");
   public static final jf.c<efo> o = a("entity_damage");
   public static final jf.c<efo> p = a("entity_die");
   public static final jf.c<efo> q = a("entity_dismount");
   public static final jf.c<efo> r = a("entity_interact");
   public static final jf.c<efo> s = a("entity_mount");
   public static final jf.c<efo> t = a("entity_place");
   public static final jf.c<efo> u = a("entity_action");
   public static final jf.c<efo> v = a("equip");
   public static final jf.c<efo> w = a("explode");
   public static final jf.c<efo> x = a("flap");
   public static final jf.c<efo> y = a("fluid_pickup");
   public static final jf.c<efo> z = a("fluid_place");
   public static final jf.c<efo> A = a("hit_ground");
   public static final jf.c<efo> B = a("instrument_play");
   public static final jf.c<efo> C = a("item_interact_finish");
   public static final jf.c<efo> D = a("item_interact_start");
   public static final jf.c<efo> E = a("jukebox_play", 10);
   public static final jf.c<efo> F = a("jukebox_stop_play", 10);
   public static final jf.c<efo> G = a("lightning_strike");
   public static final jf.c<efo> H = a("note_block_play");
   public static final jf.c<efo> I = a("prime_fuse");
   public static final jf.c<efo> J = a("projectile_land");
   public static final jf.c<efo> K = a("projectile_shoot");
   public static final jf.c<efo> L = a("sculk_sensor_tendrils_clicking");
   public static final jf.c<efo> M = a("shear");
   public static final jf.c<efo> N = a("shriek", 32);
   public static final jf.c<efo> O = a("splash");
   public static final jf.c<efo> P = a("step");
   public static final jf.c<efo> Q = a("swim");
   public static final jf.c<efo> R = a("teleport");
   public static final jf.c<efo> S = a("unequip");
   public static final jf.c<efo> T = a("resonate_1");
   public static final jf.c<efo> U = a("resonate_2");
   public static final jf.c<efo> V = a("resonate_3");
   public static final jf.c<efo> W = a("resonate_4");
   public static final jf.c<efo> X = a("resonate_5");
   public static final jf.c<efo> Y = a("resonate_6");
   public static final jf.c<efo> Z = a("resonate_7");
   public static final jf.c<efo> aa = a("resonate_8");
   public static final jf.c<efo> ab = a("resonate_9");
   public static final jf.c<efo> ac = a("resonate_10");
   public static final jf.c<efo> ad = a("resonate_11");
   public static final jf.c<efo> ae = a("resonate_12");
   public static final jf.c<efo> af = a("resonate_13");
   public static final jf.c<efo> ag = a("resonate_14");
   public static final jf.c<efo> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jf<efo>> aj = ald.a(mh.H);

   public static jf<efo> a(js<efo> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jf.c<efo> a(String $$0) {
      return a($$0, 16);
   }

   private static jf.c<efo> a(String $$0, int $$1) {
      return js.b(mg.a, alg.b($$0), new efo($$1));
   }

   public static record a(@Nullable bwi a, @Nullable eao b) {
      public static efo.a a(@Nullable bwi $$0) {
         return new efo.a($$0, null);
      }

      public static efo.a a(@Nullable eao $$0) {
         return new efo.a(null, $$0);
      }

      public static efo.a a(@Nullable bwi $$0, @Nullable eao $$1) {
         return new efo.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<efo.b> {
      private final jf<efo> a;
      private final fex b;
      private final efo.a c;
      private final efq d;
      private final double e;

      public b(jf<efo> $$0, fex $$1, efo.a $$2, efq $$3, fex $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(efo.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jf<efo> a() {
         return this.a;
      }

      public fex b() {
         return this.b;
      }

      public efo.a c() {
         return this.c;
      }

      public efq d() {
         return this.d;
      }
   }
}
