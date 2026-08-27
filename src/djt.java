import javax.annotation.Nullable;

public class djt {
   public static final djt a = a("block_activate");
   public static final djt b = a("block_attach");
   public static final djt c = a("block_change");
   public static final djt d = a("block_close");
   public static final djt e = a("block_deactivate");
   public static final djt f = a("block_destroy");
   public static final djt g = a("block_detach");
   public static final djt h = a("block_open");
   public static final djt i = a("block_place");
   public static final djt j = a("container_close");
   public static final djt k = a("container_open");
   public static final djt l = a("drink");
   public static final djt m = a("eat");
   public static final djt n = a("elytra_glide");
   public static final djt o = a("entity_damage");
   public static final djt p = a("entity_die");
   public static final djt q = a("entity_dismount");
   public static final djt r = a("entity_interact");
   public static final djt s = a("entity_mount");
   public static final djt t = a("entity_place");
   public static final djt u = a("entity_action");
   public static final djt v = a("equip");
   public static final djt w = a("explode");
   public static final djt x = a("flap");
   public static final djt y = a("fluid_pickup");
   public static final djt z = a("fluid_place");
   public static final djt A = a("hit_ground");
   public static final djt B = a("instrument_play");
   public static final djt C = a("item_interact_finish");
   public static final djt D = a("item_interact_start");
   public static final djt E = a("jukebox_play", 10);
   public static final djt F = a("jukebox_stop_play", 10);
   public static final djt G = a("lightning_strike");
   public static final djt H = a("note_block_play");
   public static final djt I = a("prime_fuse");
   public static final djt J = a("projectile_land");
   public static final djt K = a("projectile_shoot");
   public static final djt L = a("sculk_sensor_tendrils_clicking");
   public static final djt M = a("shear");
   public static final djt N = a("shriek", 32);
   public static final djt O = a("splash");
   public static final djt P = a("step");
   public static final djt Q = a("swim");
   public static final djt R = a("teleport");
   public static final djt S = a("unequip");
   public static final djt T = a("resonate_1");
   public static final djt U = a("resonate_2");
   public static final djt V = a("resonate_3");
   public static final djt W = a("resonate_4");
   public static final djt X = a("resonate_5");
   public static final djt Y = a("resonate_6");
   public static final djt Z = a("resonate_7");
   public static final djt aa = a("resonate_8");
   public static final djt ab = a("resonate_9");
   public static final djt ac = a("resonate_10");
   public static final djt ad = a("resonate_11");
   public static final djt ae = a("resonate_12");
   public static final djt af = a("resonate_13");
   public static final djt ag = a("resonate_14");
   public static final djt ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final he.c<djt> ak = jb.b.f(this);

   public djt(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djt a(String $$0) {
      return a($$0, 16);
   }

   private static djt a(String $$0, int $$1) {
      return hq.a(jb.b, $$0, new djt($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public he.c<djt> b() {
      return this.ak;
   }

   public boolean a(aqh<djt> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable biq a, @Nullable dfj b) {
      public static djt.a a(@Nullable biq $$0) {
         return new djt.a($$0, null);
      }

      public static djt.a a(@Nullable dfj $$0) {
         return new djt.a(null, $$0);
      }

      public static djt.a a(@Nullable biq $$0, @Nullable dfj $$1) {
         return new djt.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djt.b> {
      private final djt a;
      private final ehn b;
      private final djt.a c;
      private final djv d;
      private final double e;

      public b(djt $$0, ehn $$1, djt.a $$2, djv $$3, ehn $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djt.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djt a() {
         return this.a;
      }

      public ehn b() {
         return this.b;
      }

      public djt.a c() {
         return this.c;
      }

      public djv d() {
         return this.d;
      }
   }
}
