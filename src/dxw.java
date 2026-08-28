import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dxw(int ak) {
   public static final jm.c<dxw> a = a("block_activate");
   public static final jm.c<dxw> b = a("block_attach");
   public static final jm.c<dxw> c = a("block_change");
   public static final jm.c<dxw> d = a("block_close");
   public static final jm.c<dxw> e = a("block_deactivate");
   public static final jm.c<dxw> f = a("block_destroy");
   public static final jm.c<dxw> g = a("block_detach");
   public static final jm.c<dxw> h = a("block_open");
   public static final jm.c<dxw> i = a("block_place");
   public static final jm.c<dxw> j = a("container_close");
   public static final jm.c<dxw> k = a("container_open");
   public static final jm.c<dxw> l = a("drink");
   public static final jm.c<dxw> m = a("eat");
   public static final jm.c<dxw> n = a("elytra_glide");
   public static final jm.c<dxw> o = a("entity_damage");
   public static final jm.c<dxw> p = a("entity_die");
   public static final jm.c<dxw> q = a("entity_dismount");
   public static final jm.c<dxw> r = a("entity_interact");
   public static final jm.c<dxw> s = a("entity_mount");
   public static final jm.c<dxw> t = a("entity_place");
   public static final jm.c<dxw> u = a("entity_action");
   public static final jm.c<dxw> v = a("equip");
   public static final jm.c<dxw> w = a("explode");
   public static final jm.c<dxw> x = a("flap");
   public static final jm.c<dxw> y = a("fluid_pickup");
   public static final jm.c<dxw> z = a("fluid_place");
   public static final jm.c<dxw> A = a("hit_ground");
   public static final jm.c<dxw> B = a("instrument_play");
   public static final jm.c<dxw> C = a("item_interact_finish");
   public static final jm.c<dxw> D = a("item_interact_start");
   public static final jm.c<dxw> E = a("jukebox_play", 10);
   public static final jm.c<dxw> F = a("jukebox_stop_play", 10);
   public static final jm.c<dxw> G = a("lightning_strike");
   public static final jm.c<dxw> H = a("note_block_play");
   public static final jm.c<dxw> I = a("prime_fuse");
   public static final jm.c<dxw> J = a("projectile_land");
   public static final jm.c<dxw> K = a("projectile_shoot");
   public static final jm.c<dxw> L = a("sculk_sensor_tendrils_clicking");
   public static final jm.c<dxw> M = a("shear");
   public static final jm.c<dxw> N = a("shriek", 32);
   public static final jm.c<dxw> O = a("splash");
   public static final jm.c<dxw> P = a("step");
   public static final jm.c<dxw> Q = a("swim");
   public static final jm.c<dxw> R = a("teleport");
   public static final jm.c<dxw> S = a("unequip");
   public static final jm.c<dxw> T = a("resonate_1");
   public static final jm.c<dxw> U = a("resonate_2");
   public static final jm.c<dxw> V = a("resonate_3");
   public static final jm.c<dxw> W = a("resonate_4");
   public static final jm.c<dxw> X = a("resonate_5");
   public static final jm.c<dxw> Y = a("resonate_6");
   public static final jm.c<dxw> Z = a("resonate_7");
   public static final jm.c<dxw> aa = a("resonate_8");
   public static final jm.c<dxw> ab = a("resonate_9");
   public static final jm.c<dxw> ac = a("resonate_10");
   public static final jm.c<dxw> ad = a("resonate_11");
   public static final jm.c<dxw> ae = a("resonate_12");
   public static final jm.c<dxw> af = a("resonate_13");
   public static final jm.c<dxw> ag = a("resonate_14");
   public static final jm.c<dxw> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jm<dxw>> aj = akn.a(lu.G);

   public static jm<dxw> a(jz<dxw> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jm.c<dxw> a(String $$0) {
      return a($$0, 16);
   }

   private static jm.c<dxw> a(String $$0, int $$1) {
      return jz.b(lt.a, akq.b($$0), new dxw($$1));
   }

   public static record a(@Nullable bsq a, @Nullable dta b) {
      public static dxw.a a(@Nullable bsq $$0) {
         return new dxw.a($$0, null);
      }

      public static dxw.a a(@Nullable dta $$0) {
         return new dxw.a(null, $$0);
      }

      public static dxw.a a(@Nullable bsq $$0, @Nullable dta $$1) {
         return new dxw.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxw.b> {
      private final jm<dxw> a;
      private final eww b;
      private final dxw.a c;
      private final dxy d;
      private final double e;

      public b(jm<dxw> $$0, eww $$1, dxw.a $$2, dxy $$3, eww $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxw.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jm<dxw> a() {
         return this.a;
      }

      public eww b() {
         return this.b;
      }

      public dxw.a c() {
         return this.c;
      }

      public dxy d() {
         return this.d;
      }
   }
}
