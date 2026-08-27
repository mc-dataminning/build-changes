import javax.annotation.Nullable;

public class dkl {
   public static final dkl a = a("block_activate");
   public static final dkl b = a("block_attach");
   public static final dkl c = a("block_change");
   public static final dkl d = a("block_close");
   public static final dkl e = a("block_deactivate");
   public static final dkl f = a("block_destroy");
   public static final dkl g = a("block_detach");
   public static final dkl h = a("block_open");
   public static final dkl i = a("block_place");
   public static final dkl j = a("container_close");
   public static final dkl k = a("container_open");
   public static final dkl l = a("drink");
   public static final dkl m = a("eat");
   public static final dkl n = a("elytra_glide");
   public static final dkl o = a("entity_damage");
   public static final dkl p = a("entity_die");
   public static final dkl q = a("entity_dismount");
   public static final dkl r = a("entity_interact");
   public static final dkl s = a("entity_mount");
   public static final dkl t = a("entity_place");
   public static final dkl u = a("entity_action");
   public static final dkl v = a("equip");
   public static final dkl w = a("explode");
   public static final dkl x = a("flap");
   public static final dkl y = a("fluid_pickup");
   public static final dkl z = a("fluid_place");
   public static final dkl A = a("hit_ground");
   public static final dkl B = a("instrument_play");
   public static final dkl C = a("item_interact_finish");
   public static final dkl D = a("item_interact_start");
   public static final dkl E = a("jukebox_play", 10);
   public static final dkl F = a("jukebox_stop_play", 10);
   public static final dkl G = a("lightning_strike");
   public static final dkl H = a("note_block_play");
   public static final dkl I = a("prime_fuse");
   public static final dkl J = a("projectile_land");
   public static final dkl K = a("projectile_shoot");
   public static final dkl L = a("sculk_sensor_tendrils_clicking");
   public static final dkl M = a("shear");
   public static final dkl N = a("shriek", 32);
   public static final dkl O = a("splash");
   public static final dkl P = a("step");
   public static final dkl Q = a("swim");
   public static final dkl R = a("teleport");
   public static final dkl S = a("unequip");
   public static final dkl T = a("resonate_1");
   public static final dkl U = a("resonate_2");
   public static final dkl V = a("resonate_3");
   public static final dkl W = a("resonate_4");
   public static final dkl X = a("resonate_5");
   public static final dkl Y = a("resonate_6");
   public static final dkl Z = a("resonate_7");
   public static final dkl aa = a("resonate_8");
   public static final dkl ab = a("resonate_9");
   public static final dkl ac = a("resonate_10");
   public static final dkl ad = a("resonate_11");
   public static final dkl ae = a("resonate_12");
   public static final dkl af = a("resonate_13");
   public static final dkl ag = a("resonate_14");
   public static final dkl ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ib.c<dkl> ak = jy.b.f(this);

   public dkl(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dkl a(String $$0) {
      return a($$0, 16);
   }

   private static dkl a(String $$0, int $$1) {
      return io.a(jy.b, $$0, new dkl($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ib.c<dkl> b() {
      return this.ak;
   }

   public boolean a(arh<dkl> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bjt a, @Nullable dgb b) {
      public static dkl.a a(@Nullable bjt $$0) {
         return new dkl.a($$0, null);
      }

      public static dkl.a a(@Nullable dgb $$0) {
         return new dkl.a(null, $$0);
      }

      public static dkl.a a(@Nullable bjt $$0, @Nullable dgb $$1) {
         return new dkl.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dkl.b> {
      private final dkl a;
      private final eif b;
      private final dkl.a c;
      private final dkn d;
      private final double e;

      public b(dkl $$0, eif $$1, dkl.a $$2, dkn $$3, eif $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dkl.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dkl a() {
         return this.a;
      }

      public eif b() {
         return this.b;
      }

      public dkl.a c() {
         return this.c;
      }

      public dkn d() {
         return this.d;
      }
   }
}
