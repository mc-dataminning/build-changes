import javax.annotation.Nullable;

public class dnq {
   public static final dnq a = a("block_activate");
   public static final dnq b = a("block_attach");
   public static final dnq c = a("block_change");
   public static final dnq d = a("block_close");
   public static final dnq e = a("block_deactivate");
   public static final dnq f = a("block_destroy");
   public static final dnq g = a("block_detach");
   public static final dnq h = a("block_open");
   public static final dnq i = a("block_place");
   public static final dnq j = a("container_close");
   public static final dnq k = a("container_open");
   public static final dnq l = a("drink");
   public static final dnq m = a("eat");
   public static final dnq n = a("elytra_glide");
   public static final dnq o = a("entity_damage");
   public static final dnq p = a("entity_die");
   public static final dnq q = a("entity_dismount");
   public static final dnq r = a("entity_interact");
   public static final dnq s = a("entity_mount");
   public static final dnq t = a("entity_place");
   public static final dnq u = a("entity_action");
   public static final dnq v = a("equip");
   public static final dnq w = a("explode");
   public static final dnq x = a("flap");
   public static final dnq y = a("fluid_pickup");
   public static final dnq z = a("fluid_place");
   public static final dnq A = a("hit_ground");
   public static final dnq B = a("instrument_play");
   public static final dnq C = a("item_interact_finish");
   public static final dnq D = a("item_interact_start");
   public static final dnq E = a("jukebox_play", 10);
   public static final dnq F = a("jukebox_stop_play", 10);
   public static final dnq G = a("lightning_strike");
   public static final dnq H = a("note_block_play");
   public static final dnq I = a("prime_fuse");
   public static final dnq J = a("projectile_land");
   public static final dnq K = a("projectile_shoot");
   public static final dnq L = a("sculk_sensor_tendrils_clicking");
   public static final dnq M = a("shear");
   public static final dnq N = a("shriek", 32);
   public static final dnq O = a("splash");
   public static final dnq P = a("step");
   public static final dnq Q = a("swim");
   public static final dnq R = a("teleport");
   public static final dnq S = a("unequip");
   public static final dnq T = a("resonate_1");
   public static final dnq U = a("resonate_2");
   public static final dnq V = a("resonate_3");
   public static final dnq W = a("resonate_4");
   public static final dnq X = a("resonate_5");
   public static final dnq Y = a("resonate_6");
   public static final dnq Z = a("resonate_7");
   public static final dnq aa = a("resonate_8");
   public static final dnq ab = a("resonate_9");
   public static final dnq ac = a("resonate_10");
   public static final dnq ad = a("resonate_11");
   public static final dnq ae = a("resonate_12");
   public static final dnq af = a("resonate_13");
   public static final dnq ag = a("resonate_14");
   public static final dnq ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ih.c<dnq> ak = kd.a.f(this);

   public dnq(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dnq a(String $$0) {
      return a($$0, 16);
   }

   private static dnq a(String $$0, int $$1) {
      return it.a(kd.a, $$0, new dnq($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ih.c<dnq> b() {
      return this.ak;
   }

   public boolean a(asv<dnq> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable blu a, @Nullable djg b) {
      public static dnq.a a(@Nullable blu $$0) {
         return new dnq.a($$0, null);
      }

      public static dnq.a a(@Nullable djg $$0) {
         return new dnq.a(null, $$0);
      }

      public static dnq.a a(@Nullable blu $$0, @Nullable djg $$1) {
         return new dnq.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dnq.b> {
      private final dnq a;
      private final els b;
      private final dnq.a c;
      private final dns d;
      private final double e;

      public b(dnq $$0, els $$1, dnq.a $$2, dns $$3, els $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dnq.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dnq a() {
         return this.a;
      }

      public els b() {
         return this.b;
      }

      public dnq.a c() {
         return this.c;
      }

      public dns d() {
         return this.d;
      }
   }
}
