import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dxh(int ak) {
   public static final jj.c<dxh> a = a("block_activate");
   public static final jj.c<dxh> b = a("block_attach");
   public static final jj.c<dxh> c = a("block_change");
   public static final jj.c<dxh> d = a("block_close");
   public static final jj.c<dxh> e = a("block_deactivate");
   public static final jj.c<dxh> f = a("block_destroy");
   public static final jj.c<dxh> g = a("block_detach");
   public static final jj.c<dxh> h = a("block_open");
   public static final jj.c<dxh> i = a("block_place");
   public static final jj.c<dxh> j = a("container_close");
   public static final jj.c<dxh> k = a("container_open");
   public static final jj.c<dxh> l = a("drink");
   public static final jj.c<dxh> m = a("eat");
   public static final jj.c<dxh> n = a("elytra_glide");
   public static final jj.c<dxh> o = a("entity_damage");
   public static final jj.c<dxh> p = a("entity_die");
   public static final jj.c<dxh> q = a("entity_dismount");
   public static final jj.c<dxh> r = a("entity_interact");
   public static final jj.c<dxh> s = a("entity_mount");
   public static final jj.c<dxh> t = a("entity_place");
   public static final jj.c<dxh> u = a("entity_action");
   public static final jj.c<dxh> v = a("equip");
   public static final jj.c<dxh> w = a("explode");
   public static final jj.c<dxh> x = a("flap");
   public static final jj.c<dxh> y = a("fluid_pickup");
   public static final jj.c<dxh> z = a("fluid_place");
   public static final jj.c<dxh> A = a("hit_ground");
   public static final jj.c<dxh> B = a("instrument_play");
   public static final jj.c<dxh> C = a("item_interact_finish");
   public static final jj.c<dxh> D = a("item_interact_start");
   public static final jj.c<dxh> E = a("jukebox_play", 10);
   public static final jj.c<dxh> F = a("jukebox_stop_play", 10);
   public static final jj.c<dxh> G = a("lightning_strike");
   public static final jj.c<dxh> H = a("note_block_play");
   public static final jj.c<dxh> I = a("prime_fuse");
   public static final jj.c<dxh> J = a("projectile_land");
   public static final jj.c<dxh> K = a("projectile_shoot");
   public static final jj.c<dxh> L = a("sculk_sensor_tendrils_clicking");
   public static final jj.c<dxh> M = a("shear");
   public static final jj.c<dxh> N = a("shriek", 32);
   public static final jj.c<dxh> O = a("splash");
   public static final jj.c<dxh> P = a("step");
   public static final jj.c<dxh> Q = a("swim");
   public static final jj.c<dxh> R = a("teleport");
   public static final jj.c<dxh> S = a("unequip");
   public static final jj.c<dxh> T = a("resonate_1");
   public static final jj.c<dxh> U = a("resonate_2");
   public static final jj.c<dxh> V = a("resonate_3");
   public static final jj.c<dxh> W = a("resonate_4");
   public static final jj.c<dxh> X = a("resonate_5");
   public static final jj.c<dxh> Y = a("resonate_6");
   public static final jj.c<dxh> Z = a("resonate_7");
   public static final jj.c<dxh> aa = a("resonate_8");
   public static final jj.c<dxh> ab = a("resonate_9");
   public static final jj.c<dxh> ac = a("resonate_10");
   public static final jj.c<dxh> ad = a("resonate_11");
   public static final jj.c<dxh> ae = a("resonate_12");
   public static final jj.c<dxh> af = a("resonate_13");
   public static final jj.c<dxh> ag = a("resonate_14");
   public static final jj.c<dxh> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jj<dxh>> aj = akh.a(lr.G);

   public static jj<dxh> a(jw<dxh> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jj.c<dxh> a(String $$0) {
      return a($$0, 16);
   }

   private static jj.c<dxh> a(String $$0, int $$1) {
      return jw.b(lq.a, new akk($$0), new dxh($$1));
   }

   public static record a(@Nullable bsh a, @Nullable dsl b) {
      public static dxh.a a(@Nullable bsh $$0) {
         return new dxh.a($$0, null);
      }

      public static dxh.a a(@Nullable dsl $$0) {
         return new dxh.a(null, $$0);
      }

      public static dxh.a a(@Nullable bsh $$0, @Nullable dsl $$1) {
         return new dxh.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxh.b> {
      private final jj<dxh> a;
      private final ewh b;
      private final dxh.a c;
      private final dxj d;
      private final double e;

      public b(jj<dxh> $$0, ewh $$1, dxh.a $$2, dxj $$3, ewh $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxh.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jj<dxh> a() {
         return this.a;
      }

      public ewh b() {
         return this.b;
      }

      public dxh.a c() {
         return this.c;
      }

      public dxj d() {
         return this.d;
      }
   }
}
