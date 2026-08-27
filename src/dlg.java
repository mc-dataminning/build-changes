import javax.annotation.Nullable;

public class dlg {
   public static final dlg a = a("block_activate");
   public static final dlg b = a("block_attach");
   public static final dlg c = a("block_change");
   public static final dlg d = a("block_close");
   public static final dlg e = a("block_deactivate");
   public static final dlg f = a("block_destroy");
   public static final dlg g = a("block_detach");
   public static final dlg h = a("block_open");
   public static final dlg i = a("block_place");
   public static final dlg j = a("container_close");
   public static final dlg k = a("container_open");
   public static final dlg l = a("drink");
   public static final dlg m = a("eat");
   public static final dlg n = a("elytra_glide");
   public static final dlg o = a("entity_damage");
   public static final dlg p = a("entity_die");
   public static final dlg q = a("entity_dismount");
   public static final dlg r = a("entity_interact");
   public static final dlg s = a("entity_mount");
   public static final dlg t = a("entity_place");
   public static final dlg u = a("entity_action");
   public static final dlg v = a("equip");
   public static final dlg w = a("explode");
   public static final dlg x = a("flap");
   public static final dlg y = a("fluid_pickup");
   public static final dlg z = a("fluid_place");
   public static final dlg A = a("hit_ground");
   public static final dlg B = a("instrument_play");
   public static final dlg C = a("item_interact_finish");
   public static final dlg D = a("item_interact_start");
   public static final dlg E = a("jukebox_play", 10);
   public static final dlg F = a("jukebox_stop_play", 10);
   public static final dlg G = a("lightning_strike");
   public static final dlg H = a("note_block_play");
   public static final dlg I = a("prime_fuse");
   public static final dlg J = a("projectile_land");
   public static final dlg K = a("projectile_shoot");
   public static final dlg L = a("sculk_sensor_tendrils_clicking");
   public static final dlg M = a("shear");
   public static final dlg N = a("shriek", 32);
   public static final dlg O = a("splash");
   public static final dlg P = a("step");
   public static final dlg Q = a("swim");
   public static final dlg R = a("teleport");
   public static final dlg S = a("unequip");
   public static final dlg T = a("resonate_1");
   public static final dlg U = a("resonate_2");
   public static final dlg V = a("resonate_3");
   public static final dlg W = a("resonate_4");
   public static final dlg X = a("resonate_5");
   public static final dlg Y = a("resonate_6");
   public static final dlg Z = a("resonate_7");
   public static final dlg aa = a("resonate_8");
   public static final dlg ab = a("resonate_9");
   public static final dlg ac = a("resonate_10");
   public static final dlg ad = a("resonate_11");
   public static final dlg ae = a("resonate_12");
   public static final dlg af = a("resonate_13");
   public static final dlg ag = a("resonate_14");
   public static final dlg ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ib.c<dlg> ak = jy.b.f(this);

   public dlg(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dlg a(String $$0) {
      return a($$0, 16);
   }

   private static dlg a(String $$0, int $$1) {
      return io.a(jy.b, $$0, new dlg($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ib.c<dlg> b() {
      return this.ak;
   }

   public boolean a(arr<dlg> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bki a, @Nullable dgw b) {
      public static dlg.a a(@Nullable bki $$0) {
         return new dlg.a($$0, null);
      }

      public static dlg.a a(@Nullable dgw $$0) {
         return new dlg.a(null, $$0);
      }

      public static dlg.a a(@Nullable bki $$0, @Nullable dgw $$1) {
         return new dlg.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dlg.b> {
      private final dlg a;
      private final eji b;
      private final dlg.a c;
      private final dli d;
      private final double e;

      public b(dlg $$0, eji $$1, dlg.a $$2, dli $$3, eji $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dlg.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dlg a() {
         return this.a;
      }

      public eji b() {
         return this.b;
      }

      public dlg.a c() {
         return this.c;
      }

      public dli d() {
         return this.d;
      }
   }
}
