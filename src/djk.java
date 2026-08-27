import javax.annotation.Nullable;

public class djk {
   public static final djk a = a("block_activate");
   public static final djk b = a("block_attach");
   public static final djk c = a("block_change");
   public static final djk d = a("block_close");
   public static final djk e = a("block_deactivate");
   public static final djk f = a("block_destroy");
   public static final djk g = a("block_detach");
   public static final djk h = a("block_open");
   public static final djk i = a("block_place");
   public static final djk j = a("container_close");
   public static final djk k = a("container_open");
   public static final djk l = a("drink");
   public static final djk m = a("eat");
   public static final djk n = a("elytra_glide");
   public static final djk o = a("entity_damage");
   public static final djk p = a("entity_die");
   public static final djk q = a("entity_dismount");
   public static final djk r = a("entity_interact");
   public static final djk s = a("entity_mount");
   public static final djk t = a("entity_place");
   public static final djk u = a("entity_action");
   public static final djk v = a("equip");
   public static final djk w = a("explode");
   public static final djk x = a("flap");
   public static final djk y = a("fluid_pickup");
   public static final djk z = a("fluid_place");
   public static final djk A = a("hit_ground");
   public static final djk B = a("instrument_play");
   public static final djk C = a("item_interact_finish");
   public static final djk D = a("item_interact_start");
   public static final djk E = a("jukebox_play", 10);
   public static final djk F = a("jukebox_stop_play", 10);
   public static final djk G = a("lightning_strike");
   public static final djk H = a("note_block_play");
   public static final djk I = a("prime_fuse");
   public static final djk J = a("projectile_land");
   public static final djk K = a("projectile_shoot");
   public static final djk L = a("sculk_sensor_tendrils_clicking");
   public static final djk M = a("shear");
   public static final djk N = a("shriek", 32);
   public static final djk O = a("splash");
   public static final djk P = a("step");
   public static final djk Q = a("swim");
   public static final djk R = a("teleport");
   public static final djk S = a("unequip");
   public static final djk T = a("resonate_1");
   public static final djk U = a("resonate_2");
   public static final djk V = a("resonate_3");
   public static final djk W = a("resonate_4");
   public static final djk X = a("resonate_5");
   public static final djk Y = a("resonate_6");
   public static final djk Z = a("resonate_7");
   public static final djk aa = a("resonate_8");
   public static final djk ab = a("resonate_9");
   public static final djk ac = a("resonate_10");
   public static final djk ad = a("resonate_11");
   public static final djk ae = a("resonate_12");
   public static final djk af = a("resonate_13");
   public static final djk ag = a("resonate_14");
   public static final djk ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final he.c<djk> ak = jb.b.f(this);

   public djk(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djk a(String $$0) {
      return a($$0, 16);
   }

   private static djk a(String $$0, int $$1) {
      return hr.a(jb.b, $$0, new djk($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public he.c<djk> b() {
      return this.ak;
   }

   public boolean a(aqa<djk> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bii a, @Nullable dfa b) {
      public static djk.a a(@Nullable bii $$0) {
         return new djk.a($$0, null);
      }

      public static djk.a a(@Nullable dfa $$0) {
         return new djk.a(null, $$0);
      }

      public static djk.a a(@Nullable bii $$0, @Nullable dfa $$1) {
         return new djk.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djk.b> {
      private final djk a;
      private final ehe b;
      private final djk.a c;
      private final djm d;
      private final double e;

      public b(djk $$0, ehe $$1, djk.a $$2, djm $$3, ehe $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djk.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djk a() {
         return this.a;
      }

      public ehe b() {
         return this.b;
      }

      public djk.a c() {
         return this.c;
      }

      public djm d() {
         return this.d;
      }
   }
}
