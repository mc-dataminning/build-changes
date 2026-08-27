import javax.annotation.Nullable;

public class dlx {
   public static final dlx a = a("block_activate");
   public static final dlx b = a("block_attach");
   public static final dlx c = a("block_change");
   public static final dlx d = a("block_close");
   public static final dlx e = a("block_deactivate");
   public static final dlx f = a("block_destroy");
   public static final dlx g = a("block_detach");
   public static final dlx h = a("block_open");
   public static final dlx i = a("block_place");
   public static final dlx j = a("container_close");
   public static final dlx k = a("container_open");
   public static final dlx l = a("drink");
   public static final dlx m = a("eat");
   public static final dlx n = a("elytra_glide");
   public static final dlx o = a("entity_damage");
   public static final dlx p = a("entity_die");
   public static final dlx q = a("entity_dismount");
   public static final dlx r = a("entity_interact");
   public static final dlx s = a("entity_mount");
   public static final dlx t = a("entity_place");
   public static final dlx u = a("entity_action");
   public static final dlx v = a("equip");
   public static final dlx w = a("explode");
   public static final dlx x = a("flap");
   public static final dlx y = a("fluid_pickup");
   public static final dlx z = a("fluid_place");
   public static final dlx A = a("hit_ground");
   public static final dlx B = a("instrument_play");
   public static final dlx C = a("item_interact_finish");
   public static final dlx D = a("item_interact_start");
   public static final dlx E = a("jukebox_play", 10);
   public static final dlx F = a("jukebox_stop_play", 10);
   public static final dlx G = a("lightning_strike");
   public static final dlx H = a("note_block_play");
   public static final dlx I = a("prime_fuse");
   public static final dlx J = a("projectile_land");
   public static final dlx K = a("projectile_shoot");
   public static final dlx L = a("sculk_sensor_tendrils_clicking");
   public static final dlx M = a("shear");
   public static final dlx N = a("shriek", 32);
   public static final dlx O = a("splash");
   public static final dlx P = a("step");
   public static final dlx Q = a("swim");
   public static final dlx R = a("teleport");
   public static final dlx S = a("unequip");
   public static final dlx T = a("resonate_1");
   public static final dlx U = a("resonate_2");
   public static final dlx V = a("resonate_3");
   public static final dlx W = a("resonate_4");
   public static final dlx X = a("resonate_5");
   public static final dlx Y = a("resonate_6");
   public static final dlx Z = a("resonate_7");
   public static final dlx aa = a("resonate_8");
   public static final dlx ab = a("resonate_9");
   public static final dlx ac = a("resonate_10");
   public static final dlx ad = a("resonate_11");
   public static final dlx ae = a("resonate_12");
   public static final dlx af = a("resonate_13");
   public static final dlx ag = a("resonate_14");
   public static final dlx ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ig.c<dlx> ak = kc.b.f(this);

   public dlx(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dlx a(String $$0) {
      return a($$0, 16);
   }

   private static dlx a(String $$0, int $$1) {
      return is.a(kc.b, $$0, new dlx($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ig.c<dlx> b() {
      return this.ak;
   }

   public boolean a(arz<dlx> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bkv a, @Nullable dhn b) {
      public static dlx.a a(@Nullable bkv $$0) {
         return new dlx.a($$0, null);
      }

      public static dlx.a a(@Nullable dhn $$0) {
         return new dlx.a(null, $$0);
      }

      public static dlx.a a(@Nullable bkv $$0, @Nullable dhn $$1) {
         return new dlx.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dlx.b> {
      private final dlx a;
      private final ejz b;
      private final dlx.a c;
      private final dlz d;
      private final double e;

      public b(dlx $$0, ejz $$1, dlx.a $$2, dlz $$3, ejz $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dlx.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dlx a() {
         return this.a;
      }

      public ejz b() {
         return this.b;
      }

      public dlx.a c() {
         return this.c;
      }

      public dlz d() {
         return this.d;
      }
   }
}
