import javax.annotation.Nullable;

public class djv {
   public static final djv a = a("block_activate");
   public static final djv b = a("block_attach");
   public static final djv c = a("block_change");
   public static final djv d = a("block_close");
   public static final djv e = a("block_deactivate");
   public static final djv f = a("block_destroy");
   public static final djv g = a("block_detach");
   public static final djv h = a("block_open");
   public static final djv i = a("block_place");
   public static final djv j = a("container_close");
   public static final djv k = a("container_open");
   public static final djv l = a("drink");
   public static final djv m = a("eat");
   public static final djv n = a("elytra_glide");
   public static final djv o = a("entity_damage");
   public static final djv p = a("entity_die");
   public static final djv q = a("entity_dismount");
   public static final djv r = a("entity_interact");
   public static final djv s = a("entity_mount");
   public static final djv t = a("entity_place");
   public static final djv u = a("entity_action");
   public static final djv v = a("equip");
   public static final djv w = a("explode");
   public static final djv x = a("flap");
   public static final djv y = a("fluid_pickup");
   public static final djv z = a("fluid_place");
   public static final djv A = a("hit_ground");
   public static final djv B = a("instrument_play");
   public static final djv C = a("item_interact_finish");
   public static final djv D = a("item_interact_start");
   public static final djv E = a("jukebox_play", 10);
   public static final djv F = a("jukebox_stop_play", 10);
   public static final djv G = a("lightning_strike");
   public static final djv H = a("note_block_play");
   public static final djv I = a("prime_fuse");
   public static final djv J = a("projectile_land");
   public static final djv K = a("projectile_shoot");
   public static final djv L = a("sculk_sensor_tendrils_clicking");
   public static final djv M = a("shear");
   public static final djv N = a("shriek", 32);
   public static final djv O = a("splash");
   public static final djv P = a("step");
   public static final djv Q = a("swim");
   public static final djv R = a("teleport");
   public static final djv S = a("unequip");
   public static final djv T = a("resonate_1");
   public static final djv U = a("resonate_2");
   public static final djv V = a("resonate_3");
   public static final djv W = a("resonate_4");
   public static final djv X = a("resonate_5");
   public static final djv Y = a("resonate_6");
   public static final djv Z = a("resonate_7");
   public static final djv aa = a("resonate_8");
   public static final djv ab = a("resonate_9");
   public static final djv ac = a("resonate_10");
   public static final djv ad = a("resonate_11");
   public static final djv ae = a("resonate_12");
   public static final djv af = a("resonate_13");
   public static final djv ag = a("resonate_14");
   public static final djv ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final hg.c<djv> ak = jd.b.f(this);

   public djv(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djv a(String $$0) {
      return a($$0, 16);
   }

   private static djv a(String $$0, int $$1) {
      return ht.a(jd.b, $$0, new djv($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public hg.c<djv> b() {
      return this.ak;
   }

   public boolean a(aqj<djv> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bis a, @Nullable dfl b) {
      public static djv.a a(@Nullable bis $$0) {
         return new djv.a($$0, null);
      }

      public static djv.a a(@Nullable dfl $$0) {
         return new djv.a(null, $$0);
      }

      public static djv.a a(@Nullable bis $$0, @Nullable dfl $$1) {
         return new djv.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djv.b> {
      private final djv a;
      private final ehp b;
      private final djv.a c;
      private final djx d;
      private final double e;

      public b(djv $$0, ehp $$1, djv.a $$2, djx $$3, ehp $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djv.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djv a() {
         return this.a;
      }

      public ehp b() {
         return this.b;
      }

      public djv.a c() {
         return this.c;
      }

      public djx d() {
         return this.d;
      }
   }
}
