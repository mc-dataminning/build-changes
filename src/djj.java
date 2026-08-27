import javax.annotation.Nullable;

public class djj {
   public static final djj a = a("block_activate");
   public static final djj b = a("block_attach");
   public static final djj c = a("block_change");
   public static final djj d = a("block_close");
   public static final djj e = a("block_deactivate");
   public static final djj f = a("block_destroy");
   public static final djj g = a("block_detach");
   public static final djj h = a("block_open");
   public static final djj i = a("block_place");
   public static final djj j = a("container_close");
   public static final djj k = a("container_open");
   public static final djj l = a("drink");
   public static final djj m = a("eat");
   public static final djj n = a("elytra_glide");
   public static final djj o = a("entity_damage");
   public static final djj p = a("entity_die");
   public static final djj q = a("entity_dismount");
   public static final djj r = a("entity_interact");
   public static final djj s = a("entity_mount");
   public static final djj t = a("entity_place");
   public static final djj u = a("entity_action");
   public static final djj v = a("equip");
   public static final djj w = a("explode");
   public static final djj x = a("flap");
   public static final djj y = a("fluid_pickup");
   public static final djj z = a("fluid_place");
   public static final djj A = a("hit_ground");
   public static final djj B = a("instrument_play");
   public static final djj C = a("item_interact_finish");
   public static final djj D = a("item_interact_start");
   public static final djj E = a("jukebox_play", 10);
   public static final djj F = a("jukebox_stop_play", 10);
   public static final djj G = a("lightning_strike");
   public static final djj H = a("note_block_play");
   public static final djj I = a("prime_fuse");
   public static final djj J = a("projectile_land");
   public static final djj K = a("projectile_shoot");
   public static final djj L = a("sculk_sensor_tendrils_clicking");
   public static final djj M = a("shear");
   public static final djj N = a("shriek", 32);
   public static final djj O = a("splash");
   public static final djj P = a("step");
   public static final djj Q = a("swim");
   public static final djj R = a("teleport");
   public static final djj S = a("unequip");
   public static final djj T = a("resonate_1");
   public static final djj U = a("resonate_2");
   public static final djj V = a("resonate_3");
   public static final djj W = a("resonate_4");
   public static final djj X = a("resonate_5");
   public static final djj Y = a("resonate_6");
   public static final djj Z = a("resonate_7");
   public static final djj aa = a("resonate_8");
   public static final djj ab = a("resonate_9");
   public static final djj ac = a("resonate_10");
   public static final djj ad = a("resonate_11");
   public static final djj ae = a("resonate_12");
   public static final djj af = a("resonate_13");
   public static final djj ag = a("resonate_14");
   public static final djj ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final he.c<djj> ak = jb.b.f(this);

   public djj(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djj a(String $$0) {
      return a($$0, 16);
   }

   private static djj a(String $$0, int $$1) {
      return hr.a(jb.b, $$0, new djj($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public he.c<djj> b() {
      return this.ak;
   }

   public boolean a(aqa<djj> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bii a, @Nullable dez b) {
      public static djj.a a(@Nullable bii $$0) {
         return new djj.a($$0, null);
      }

      public static djj.a a(@Nullable dez $$0) {
         return new djj.a(null, $$0);
      }

      public static djj.a a(@Nullable bii $$0, @Nullable dez $$1) {
         return new djj.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djj.b> {
      private final djj a;
      private final ehd b;
      private final djj.a c;
      private final djl d;
      private final double e;

      public b(djj $$0, ehd $$1, djj.a $$2, djl $$3, ehd $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djj.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djj a() {
         return this.a;
      }

      public ehd b() {
         return this.b;
      }

      public djj.a c() {
         return this.c;
      }

      public djl d() {
         return this.d;
      }
   }
}
