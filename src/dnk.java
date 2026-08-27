import javax.annotation.Nullable;

public class dnk {
   public static final dnk a = a("block_activate");
   public static final dnk b = a("block_attach");
   public static final dnk c = a("block_change");
   public static final dnk d = a("block_close");
   public static final dnk e = a("block_deactivate");
   public static final dnk f = a("block_destroy");
   public static final dnk g = a("block_detach");
   public static final dnk h = a("block_open");
   public static final dnk i = a("block_place");
   public static final dnk j = a("container_close");
   public static final dnk k = a("container_open");
   public static final dnk l = a("drink");
   public static final dnk m = a("eat");
   public static final dnk n = a("elytra_glide");
   public static final dnk o = a("entity_damage");
   public static final dnk p = a("entity_die");
   public static final dnk q = a("entity_dismount");
   public static final dnk r = a("entity_interact");
   public static final dnk s = a("entity_mount");
   public static final dnk t = a("entity_place");
   public static final dnk u = a("entity_action");
   public static final dnk v = a("equip");
   public static final dnk w = a("explode");
   public static final dnk x = a("flap");
   public static final dnk y = a("fluid_pickup");
   public static final dnk z = a("fluid_place");
   public static final dnk A = a("hit_ground");
   public static final dnk B = a("instrument_play");
   public static final dnk C = a("item_interact_finish");
   public static final dnk D = a("item_interact_start");
   public static final dnk E = a("jukebox_play", 10);
   public static final dnk F = a("jukebox_stop_play", 10);
   public static final dnk G = a("lightning_strike");
   public static final dnk H = a("note_block_play");
   public static final dnk I = a("prime_fuse");
   public static final dnk J = a("projectile_land");
   public static final dnk K = a("projectile_shoot");
   public static final dnk L = a("sculk_sensor_tendrils_clicking");
   public static final dnk M = a("shear");
   public static final dnk N = a("shriek", 32);
   public static final dnk O = a("splash");
   public static final dnk P = a("step");
   public static final dnk Q = a("swim");
   public static final dnk R = a("teleport");
   public static final dnk S = a("unequip");
   public static final dnk T = a("resonate_1");
   public static final dnk U = a("resonate_2");
   public static final dnk V = a("resonate_3");
   public static final dnk W = a("resonate_4");
   public static final dnk X = a("resonate_5");
   public static final dnk Y = a("resonate_6");
   public static final dnk Z = a("resonate_7");
   public static final dnk aa = a("resonate_8");
   public static final dnk ab = a("resonate_9");
   public static final dnk ac = a("resonate_10");
   public static final dnk ad = a("resonate_11");
   public static final dnk ae = a("resonate_12");
   public static final dnk af = a("resonate_13");
   public static final dnk ag = a("resonate_14");
   public static final dnk ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ih.c<dnk> ak = kd.a.f(this);

   public dnk(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dnk a(String $$0) {
      return a($$0, 16);
   }

   private static dnk a(String $$0, int $$1) {
      return it.a(kd.a, $$0, new dnk($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ih.c<dnk> b() {
      return this.ak;
   }

   public boolean a(asq<dnk> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable blp a, @Nullable dja b) {
      public static dnk.a a(@Nullable blp $$0) {
         return new dnk.a($$0, null);
      }

      public static dnk.a a(@Nullable dja $$0) {
         return new dnk.a(null, $$0);
      }

      public static dnk.a a(@Nullable blp $$0, @Nullable dja $$1) {
         return new dnk.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dnk.b> {
      private final dnk a;
      private final elm b;
      private final dnk.a c;
      private final dnm d;
      private final double e;

      public b(dnk $$0, elm $$1, dnk.a $$2, dnm $$3, elm $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dnk.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dnk a() {
         return this.a;
      }

      public elm b() {
         return this.b;
      }

      public dnk.a c() {
         return this.c;
      }

      public dnm d() {
         return this.d;
      }
   }
}
