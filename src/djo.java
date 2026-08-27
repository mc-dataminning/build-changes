import javax.annotation.Nullable;

public class djo {
   public static final djo a = a("block_activate");
   public static final djo b = a("block_attach");
   public static final djo c = a("block_change");
   public static final djo d = a("block_close");
   public static final djo e = a("block_deactivate");
   public static final djo f = a("block_destroy");
   public static final djo g = a("block_detach");
   public static final djo h = a("block_open");
   public static final djo i = a("block_place");
   public static final djo j = a("container_close");
   public static final djo k = a("container_open");
   public static final djo l = a("drink");
   public static final djo m = a("eat");
   public static final djo n = a("elytra_glide");
   public static final djo o = a("entity_damage");
   public static final djo p = a("entity_die");
   public static final djo q = a("entity_dismount");
   public static final djo r = a("entity_interact");
   public static final djo s = a("entity_mount");
   public static final djo t = a("entity_place");
   public static final djo u = a("entity_action");
   public static final djo v = a("equip");
   public static final djo w = a("explode");
   public static final djo x = a("flap");
   public static final djo y = a("fluid_pickup");
   public static final djo z = a("fluid_place");
   public static final djo A = a("hit_ground");
   public static final djo B = a("instrument_play");
   public static final djo C = a("item_interact_finish");
   public static final djo D = a("item_interact_start");
   public static final djo E = a("jukebox_play", 10);
   public static final djo F = a("jukebox_stop_play", 10);
   public static final djo G = a("lightning_strike");
   public static final djo H = a("note_block_play");
   public static final djo I = a("prime_fuse");
   public static final djo J = a("projectile_land");
   public static final djo K = a("projectile_shoot");
   public static final djo L = a("sculk_sensor_tendrils_clicking");
   public static final djo M = a("shear");
   public static final djo N = a("shriek", 32);
   public static final djo O = a("splash");
   public static final djo P = a("step");
   public static final djo Q = a("swim");
   public static final djo R = a("teleport");
   public static final djo S = a("unequip");
   public static final djo T = a("resonate_1");
   public static final djo U = a("resonate_2");
   public static final djo V = a("resonate_3");
   public static final djo W = a("resonate_4");
   public static final djo X = a("resonate_5");
   public static final djo Y = a("resonate_6");
   public static final djo Z = a("resonate_7");
   public static final djo aa = a("resonate_8");
   public static final djo ab = a("resonate_9");
   public static final djo ac = a("resonate_10");
   public static final djo ad = a("resonate_11");
   public static final djo ae = a("resonate_12");
   public static final djo af = a("resonate_13");
   public static final djo ag = a("resonate_14");
   public static final djo ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final hg.c<djo> ak = jd.b.f(this);

   public djo(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djo a(String $$0) {
      return a($$0, 16);
   }

   private static djo a(String $$0, int $$1) {
      return ht.a(jd.b, $$0, new djo($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public hg.c<djo> b() {
      return this.ak;
   }

   public boolean a(aqd<djo> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bil a, @Nullable dfe b) {
      public static djo.a a(@Nullable bil $$0) {
         return new djo.a($$0, null);
      }

      public static djo.a a(@Nullable dfe $$0) {
         return new djo.a(null, $$0);
      }

      public static djo.a a(@Nullable bil $$0, @Nullable dfe $$1) {
         return new djo.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djo.b> {
      private final djo a;
      private final ehi b;
      private final djo.a c;
      private final djq d;
      private final double e;

      public b(djo $$0, ehi $$1, djo.a $$2, djq $$3, ehi $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djo.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djo a() {
         return this.a;
      }

      public ehi b() {
         return this.b;
      }

      public djo.a c() {
         return this.c;
      }

      public djq d() {
         return this.d;
      }
   }
}
