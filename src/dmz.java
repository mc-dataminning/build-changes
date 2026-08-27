import javax.annotation.Nullable;

public class dmz {
   public static final dmz a = a("block_activate");
   public static final dmz b = a("block_attach");
   public static final dmz c = a("block_change");
   public static final dmz d = a("block_close");
   public static final dmz e = a("block_deactivate");
   public static final dmz f = a("block_destroy");
   public static final dmz g = a("block_detach");
   public static final dmz h = a("block_open");
   public static final dmz i = a("block_place");
   public static final dmz j = a("container_close");
   public static final dmz k = a("container_open");
   public static final dmz l = a("drink");
   public static final dmz m = a("eat");
   public static final dmz n = a("elytra_glide");
   public static final dmz o = a("entity_damage");
   public static final dmz p = a("entity_die");
   public static final dmz q = a("entity_dismount");
   public static final dmz r = a("entity_interact");
   public static final dmz s = a("entity_mount");
   public static final dmz t = a("entity_place");
   public static final dmz u = a("entity_action");
   public static final dmz v = a("equip");
   public static final dmz w = a("explode");
   public static final dmz x = a("flap");
   public static final dmz y = a("fluid_pickup");
   public static final dmz z = a("fluid_place");
   public static final dmz A = a("hit_ground");
   public static final dmz B = a("instrument_play");
   public static final dmz C = a("item_interact_finish");
   public static final dmz D = a("item_interact_start");
   public static final dmz E = a("jukebox_play", 10);
   public static final dmz F = a("jukebox_stop_play", 10);
   public static final dmz G = a("lightning_strike");
   public static final dmz H = a("note_block_play");
   public static final dmz I = a("prime_fuse");
   public static final dmz J = a("projectile_land");
   public static final dmz K = a("projectile_shoot");
   public static final dmz L = a("sculk_sensor_tendrils_clicking");
   public static final dmz M = a("shear");
   public static final dmz N = a("shriek", 32);
   public static final dmz O = a("splash");
   public static final dmz P = a("step");
   public static final dmz Q = a("swim");
   public static final dmz R = a("teleport");
   public static final dmz S = a("unequip");
   public static final dmz T = a("resonate_1");
   public static final dmz U = a("resonate_2");
   public static final dmz V = a("resonate_3");
   public static final dmz W = a("resonate_4");
   public static final dmz X = a("resonate_5");
   public static final dmz Y = a("resonate_6");
   public static final dmz Z = a("resonate_7");
   public static final dmz aa = a("resonate_8");
   public static final dmz ab = a("resonate_9");
   public static final dmz ac = a("resonate_10");
   public static final dmz ad = a("resonate_11");
   public static final dmz ae = a("resonate_12");
   public static final dmz af = a("resonate_13");
   public static final dmz ag = a("resonate_14");
   public static final dmz ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ie.c<dmz> ak = kb.a.f(this);

   public dmz(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dmz a(String $$0) {
      return a($$0, 16);
   }

   private static dmz a(String $$0, int $$1) {
      return ir.a(kb.a, $$0, new dmz($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ie.c<dmz> b() {
      return this.ak;
   }

   public boolean a(asg<dmz> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable blf a, @Nullable dip b) {
      public static dmz.a a(@Nullable blf $$0) {
         return new dmz.a($$0, null);
      }

      public static dmz.a a(@Nullable dip $$0) {
         return new dmz.a(null, $$0);
      }

      public static dmz.a a(@Nullable blf $$0, @Nullable dip $$1) {
         return new dmz.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dmz.b> {
      private final dmz a;
      private final elb b;
      private final dmz.a c;
      private final dnb d;
      private final double e;

      public b(dmz $$0, elb $$1, dmz.a $$2, dnb $$3, elb $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dmz.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dmz a() {
         return this.a;
      }

      public elb b() {
         return this.b;
      }

      public dmz.a c() {
         return this.c;
      }

      public dnb d() {
         return this.d;
      }
   }
}
