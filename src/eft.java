import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eft(int ak) {
   public static final jf.c<eft> a = a("block_activate");
   public static final jf.c<eft> b = a("block_attach");
   public static final jf.c<eft> c = a("block_change");
   public static final jf.c<eft> d = a("block_close");
   public static final jf.c<eft> e = a("block_deactivate");
   public static final jf.c<eft> f = a("block_destroy");
   public static final jf.c<eft> g = a("block_detach");
   public static final jf.c<eft> h = a("block_open");
   public static final jf.c<eft> i = a("block_place");
   public static final jf.c<eft> j = a("container_close");
   public static final jf.c<eft> k = a("container_open");
   public static final jf.c<eft> l = a("drink");
   public static final jf.c<eft> m = a("eat");
   public static final jf.c<eft> n = a("elytra_glide");
   public static final jf.c<eft> o = a("entity_damage");
   public static final jf.c<eft> p = a("entity_die");
   public static final jf.c<eft> q = a("entity_dismount");
   public static final jf.c<eft> r = a("entity_interact");
   public static final jf.c<eft> s = a("entity_mount");
   public static final jf.c<eft> t = a("entity_place");
   public static final jf.c<eft> u = a("entity_action");
   public static final jf.c<eft> v = a("equip");
   public static final jf.c<eft> w = a("explode");
   public static final jf.c<eft> x = a("flap");
   public static final jf.c<eft> y = a("fluid_pickup");
   public static final jf.c<eft> z = a("fluid_place");
   public static final jf.c<eft> A = a("hit_ground");
   public static final jf.c<eft> B = a("instrument_play");
   public static final jf.c<eft> C = a("item_interact_finish");
   public static final jf.c<eft> D = a("item_interact_start");
   public static final jf.c<eft> E = a("jukebox_play", 10);
   public static final jf.c<eft> F = a("jukebox_stop_play", 10);
   public static final jf.c<eft> G = a("lightning_strike");
   public static final jf.c<eft> H = a("note_block_play");
   public static final jf.c<eft> I = a("prime_fuse");
   public static final jf.c<eft> J = a("projectile_land");
   public static final jf.c<eft> K = a("projectile_shoot");
   public static final jf.c<eft> L = a("sculk_sensor_tendrils_clicking");
   public static final jf.c<eft> M = a("shear");
   public static final jf.c<eft> N = a("shriek", 32);
   public static final jf.c<eft> O = a("splash");
   public static final jf.c<eft> P = a("step");
   public static final jf.c<eft> Q = a("swim");
   public static final jf.c<eft> R = a("teleport");
   public static final jf.c<eft> S = a("unequip");
   public static final jf.c<eft> T = a("resonate_1");
   public static final jf.c<eft> U = a("resonate_2");
   public static final jf.c<eft> V = a("resonate_3");
   public static final jf.c<eft> W = a("resonate_4");
   public static final jf.c<eft> X = a("resonate_5");
   public static final jf.c<eft> Y = a("resonate_6");
   public static final jf.c<eft> Z = a("resonate_7");
   public static final jf.c<eft> aa = a("resonate_8");
   public static final jf.c<eft> ab = a("resonate_9");
   public static final jf.c<eft> ac = a("resonate_10");
   public static final jf.c<eft> ad = a("resonate_11");
   public static final jf.c<eft> ae = a("resonate_12");
   public static final jf.c<eft> af = a("resonate_13");
   public static final jf.c<eft> ag = a("resonate_14");
   public static final jf.c<eft> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jf<eft>> aj = ald.a(mh.H);

   public static jf<eft> a(js<eft> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jf.c<eft> a(String $$0) {
      return a($$0, 16);
   }

   private static jf.c<eft> a(String $$0, int $$1) {
      return js.b(mg.a, alg.b($$0), new eft($$1));
   }

   public static record a(@Nullable bwi a, @Nullable eat b) {
      public static eft.a a(@Nullable bwi $$0) {
         return new eft.a($$0, null);
      }

      public static eft.a a(@Nullable eat $$0) {
         return new eft.a(null, $$0);
      }

      public static eft.a a(@Nullable bwi $$0, @Nullable eat $$1) {
         return new eft.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eft.b> {
      private final jf<eft> a;
      private final ffc b;
      private final eft.a c;
      private final efv d;
      private final double e;

      public b(jf<eft> $$0, ffc $$1, eft.a $$2, efv $$3, ffc $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eft.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jf<eft> a() {
         return this.a;
      }

      public ffc b() {
         return this.b;
      }

      public eft.a c() {
         return this.c;
      }

      public efv d() {
         return this.d;
      }
   }
}
