import javax.annotation.Nullable;

public class dji {
   public static final dji a = a("block_activate");
   public static final dji b = a("block_attach");
   public static final dji c = a("block_change");
   public static final dji d = a("block_close");
   public static final dji e = a("block_deactivate");
   public static final dji f = a("block_destroy");
   public static final dji g = a("block_detach");
   public static final dji h = a("block_open");
   public static final dji i = a("block_place");
   public static final dji j = a("container_close");
   public static final dji k = a("container_open");
   public static final dji l = a("drink");
   public static final dji m = a("eat");
   public static final dji n = a("elytra_glide");
   public static final dji o = a("entity_damage");
   public static final dji p = a("entity_die");
   public static final dji q = a("entity_dismount");
   public static final dji r = a("entity_interact");
   public static final dji s = a("entity_mount");
   public static final dji t = a("entity_place");
   public static final dji u = a("entity_action");
   public static final dji v = a("equip");
   public static final dji w = a("explode");
   public static final dji x = a("flap");
   public static final dji y = a("fluid_pickup");
   public static final dji z = a("fluid_place");
   public static final dji A = a("hit_ground");
   public static final dji B = a("instrument_play");
   public static final dji C = a("item_interact_finish");
   public static final dji D = a("item_interact_start");
   public static final dji E = a("jukebox_play", 10);
   public static final dji F = a("jukebox_stop_play", 10);
   public static final dji G = a("lightning_strike");
   public static final dji H = a("note_block_play");
   public static final dji I = a("prime_fuse");
   public static final dji J = a("projectile_land");
   public static final dji K = a("projectile_shoot");
   public static final dji L = a("sculk_sensor_tendrils_clicking");
   public static final dji M = a("shear");
   public static final dji N = a("shriek", 32);
   public static final dji O = a("splash");
   public static final dji P = a("step");
   public static final dji Q = a("swim");
   public static final dji R = a("teleport");
   public static final dji S = a("resonate_1");
   public static final dji T = a("resonate_2");
   public static final dji U = a("resonate_3");
   public static final dji V = a("resonate_4");
   public static final dji W = a("resonate_5");
   public static final dji X = a("resonate_6");
   public static final dji Y = a("resonate_7");
   public static final dji Z = a("resonate_8");
   public static final dji aa = a("resonate_9");
   public static final dji ab = a("resonate_10");
   public static final dji ac = a("resonate_11");
   public static final dji ad = a("resonate_12");
   public static final dji ae = a("resonate_13");
   public static final dji af = a("resonate_14");
   public static final dji ag = a("resonate_15");
   public static final int ah = 16;
   private final int ai;
   private final hf.c<dji> aj = jc.b.f(this);

   public dji(int $$0) {
      this.ai = $$0;
   }

   public int a() {
      return this.ai;
   }

   private static dji a(String $$0) {
      return a($$0, 16);
   }

   private static dji a(String $$0, int $$1) {
      return hs.a(jc.b, $$0, new dji($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.ai + "}";
   }

   @Deprecated
   public hf.c<dji> b() {
      return this.aj;
   }

   public boolean a(apy<dji> $$0) {
      return this.aj.a($$0);
   }

   public static record a(@Nullable big a, @Nullable dey b) {
      public static dji.a a(@Nullable big $$0) {
         return new dji.a($$0, null);
      }

      public static dji.a a(@Nullable dey $$0) {
         return new dji.a(null, $$0);
      }

      public static dji.a a(@Nullable big $$0, @Nullable dey $$1) {
         return new dji.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dji.b> {
      private final dji a;
      private final ehf b;
      private final dji.a c;
      private final djk d;
      private final double e;

      public b(dji $$0, ehf $$1, dji.a $$2, djk $$3, ehf $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dji.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dji a() {
         return this.a;
      }

      public ehf b() {
         return this.b;
      }

      public dji.a c() {
         return this.c;
      }

      public djk d() {
         return this.d;
      }
   }
}
