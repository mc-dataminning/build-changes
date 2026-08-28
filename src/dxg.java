import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dxg(int ak) {
   public static final jj.c<dxg> a = a("block_activate");
   public static final jj.c<dxg> b = a("block_attach");
   public static final jj.c<dxg> c = a("block_change");
   public static final jj.c<dxg> d = a("block_close");
   public static final jj.c<dxg> e = a("block_deactivate");
   public static final jj.c<dxg> f = a("block_destroy");
   public static final jj.c<dxg> g = a("block_detach");
   public static final jj.c<dxg> h = a("block_open");
   public static final jj.c<dxg> i = a("block_place");
   public static final jj.c<dxg> j = a("container_close");
   public static final jj.c<dxg> k = a("container_open");
   public static final jj.c<dxg> l = a("drink");
   public static final jj.c<dxg> m = a("eat");
   public static final jj.c<dxg> n = a("elytra_glide");
   public static final jj.c<dxg> o = a("entity_damage");
   public static final jj.c<dxg> p = a("entity_die");
   public static final jj.c<dxg> q = a("entity_dismount");
   public static final jj.c<dxg> r = a("entity_interact");
   public static final jj.c<dxg> s = a("entity_mount");
   public static final jj.c<dxg> t = a("entity_place");
   public static final jj.c<dxg> u = a("entity_action");
   public static final jj.c<dxg> v = a("equip");
   public static final jj.c<dxg> w = a("explode");
   public static final jj.c<dxg> x = a("flap");
   public static final jj.c<dxg> y = a("fluid_pickup");
   public static final jj.c<dxg> z = a("fluid_place");
   public static final jj.c<dxg> A = a("hit_ground");
   public static final jj.c<dxg> B = a("instrument_play");
   public static final jj.c<dxg> C = a("item_interact_finish");
   public static final jj.c<dxg> D = a("item_interact_start");
   public static final jj.c<dxg> E = a("jukebox_play", 10);
   public static final jj.c<dxg> F = a("jukebox_stop_play", 10);
   public static final jj.c<dxg> G = a("lightning_strike");
   public static final jj.c<dxg> H = a("note_block_play");
   public static final jj.c<dxg> I = a("prime_fuse");
   public static final jj.c<dxg> J = a("projectile_land");
   public static final jj.c<dxg> K = a("projectile_shoot");
   public static final jj.c<dxg> L = a("sculk_sensor_tendrils_clicking");
   public static final jj.c<dxg> M = a("shear");
   public static final jj.c<dxg> N = a("shriek", 32);
   public static final jj.c<dxg> O = a("splash");
   public static final jj.c<dxg> P = a("step");
   public static final jj.c<dxg> Q = a("swim");
   public static final jj.c<dxg> R = a("teleport");
   public static final jj.c<dxg> S = a("unequip");
   public static final jj.c<dxg> T = a("resonate_1");
   public static final jj.c<dxg> U = a("resonate_2");
   public static final jj.c<dxg> V = a("resonate_3");
   public static final jj.c<dxg> W = a("resonate_4");
   public static final jj.c<dxg> X = a("resonate_5");
   public static final jj.c<dxg> Y = a("resonate_6");
   public static final jj.c<dxg> Z = a("resonate_7");
   public static final jj.c<dxg> aa = a("resonate_8");
   public static final jj.c<dxg> ab = a("resonate_9");
   public static final jj.c<dxg> ac = a("resonate_10");
   public static final jj.c<dxg> ad = a("resonate_11");
   public static final jj.c<dxg> ae = a("resonate_12");
   public static final jj.c<dxg> af = a("resonate_13");
   public static final jj.c<dxg> ag = a("resonate_14");
   public static final jj.c<dxg> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jj<dxg>> aj = akh.a(lr.G);

   public static jj<dxg> a(jw<dxg> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jj.c<dxg> a(String $$0) {
      return a($$0, 16);
   }

   private static jj.c<dxg> a(String $$0, int $$1) {
      return jw.b(lq.a, new akk($$0), new dxg($$1));
   }

   public static record a(@Nullable bsg a, @Nullable dsk b) {
      public static dxg.a a(@Nullable bsg $$0) {
         return new dxg.a($$0, null);
      }

      public static dxg.a a(@Nullable dsk $$0) {
         return new dxg.a(null, $$0);
      }

      public static dxg.a a(@Nullable bsg $$0, @Nullable dsk $$1) {
         return new dxg.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dxg.b> {
      private final jj<dxg> a;
      private final ewf b;
      private final dxg.a c;
      private final dxi d;
      private final double e;

      public b(jj<dxg> $$0, ewf $$1, dxg.a $$2, dxi $$3, ewf $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dxg.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jj<dxg> a() {
         return this.a;
      }

      public ewf b() {
         return this.b;
      }

      public dxg.a c() {
         return this.c;
      }

      public dxi d() {
         return this.d;
      }
   }
}
