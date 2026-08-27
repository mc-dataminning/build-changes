import javax.annotation.Nullable;

public class dnr {
   public static final dnr a = a("block_activate");
   public static final dnr b = a("block_attach");
   public static final dnr c = a("block_change");
   public static final dnr d = a("block_close");
   public static final dnr e = a("block_deactivate");
   public static final dnr f = a("block_destroy");
   public static final dnr g = a("block_detach");
   public static final dnr h = a("block_open");
   public static final dnr i = a("block_place");
   public static final dnr j = a("container_close");
   public static final dnr k = a("container_open");
   public static final dnr l = a("drink");
   public static final dnr m = a("eat");
   public static final dnr n = a("elytra_glide");
   public static final dnr o = a("entity_damage");
   public static final dnr p = a("entity_die");
   public static final dnr q = a("entity_dismount");
   public static final dnr r = a("entity_interact");
   public static final dnr s = a("entity_mount");
   public static final dnr t = a("entity_place");
   public static final dnr u = a("entity_action");
   public static final dnr v = a("equip");
   public static final dnr w = a("explode");
   public static final dnr x = a("flap");
   public static final dnr y = a("fluid_pickup");
   public static final dnr z = a("fluid_place");
   public static final dnr A = a("hit_ground");
   public static final dnr B = a("instrument_play");
   public static final dnr C = a("item_interact_finish");
   public static final dnr D = a("item_interact_start");
   public static final dnr E = a("jukebox_play", 10);
   public static final dnr F = a("jukebox_stop_play", 10);
   public static final dnr G = a("lightning_strike");
   public static final dnr H = a("note_block_play");
   public static final dnr I = a("prime_fuse");
   public static final dnr J = a("projectile_land");
   public static final dnr K = a("projectile_shoot");
   public static final dnr L = a("sculk_sensor_tendrils_clicking");
   public static final dnr M = a("shear");
   public static final dnr N = a("shriek", 32);
   public static final dnr O = a("splash");
   public static final dnr P = a("step");
   public static final dnr Q = a("swim");
   public static final dnr R = a("teleport");
   public static final dnr S = a("unequip");
   public static final dnr T = a("resonate_1");
   public static final dnr U = a("resonate_2");
   public static final dnr V = a("resonate_3");
   public static final dnr W = a("resonate_4");
   public static final dnr X = a("resonate_5");
   public static final dnr Y = a("resonate_6");
   public static final dnr Z = a("resonate_7");
   public static final dnr aa = a("resonate_8");
   public static final dnr ab = a("resonate_9");
   public static final dnr ac = a("resonate_10");
   public static final dnr ad = a("resonate_11");
   public static final dnr ae = a("resonate_12");
   public static final dnr af = a("resonate_13");
   public static final dnr ag = a("resonate_14");
   public static final dnr ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ih.c<dnr> ak = kd.a.f(this);

   public dnr(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dnr a(String $$0) {
      return a($$0, 16);
   }

   private static dnr a(String $$0, int $$1) {
      return it.a(kd.a, $$0, new dnr($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ih.c<dnr> b() {
      return this.ak;
   }

   public boolean a(asw<dnr> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable blv a, @Nullable djh b) {
      public static dnr.a a(@Nullable blv $$0) {
         return new dnr.a($$0, null);
      }

      public static dnr.a a(@Nullable djh $$0) {
         return new dnr.a(null, $$0);
      }

      public static dnr.a a(@Nullable blv $$0, @Nullable djh $$1) {
         return new dnr.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dnr.b> {
      private final dnr a;
      private final elt b;
      private final dnr.a c;
      private final dnt d;
      private final double e;

      public b(dnr $$0, elt $$1, dnr.a $$2, dnt $$3, elt $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dnr.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dnr a() {
         return this.a;
      }

      public elt b() {
         return this.b;
      }

      public dnr.a c() {
         return this.c;
      }

      public dnt d() {
         return this.d;
      }
   }
}
