import javax.annotation.Nullable;

public class dls {
   public static final dls a = a("block_activate");
   public static final dls b = a("block_attach");
   public static final dls c = a("block_change");
   public static final dls d = a("block_close");
   public static final dls e = a("block_deactivate");
   public static final dls f = a("block_destroy");
   public static final dls g = a("block_detach");
   public static final dls h = a("block_open");
   public static final dls i = a("block_place");
   public static final dls j = a("container_close");
   public static final dls k = a("container_open");
   public static final dls l = a("drink");
   public static final dls m = a("eat");
   public static final dls n = a("elytra_glide");
   public static final dls o = a("entity_damage");
   public static final dls p = a("entity_die");
   public static final dls q = a("entity_dismount");
   public static final dls r = a("entity_interact");
   public static final dls s = a("entity_mount");
   public static final dls t = a("entity_place");
   public static final dls u = a("entity_action");
   public static final dls v = a("equip");
   public static final dls w = a("explode");
   public static final dls x = a("flap");
   public static final dls y = a("fluid_pickup");
   public static final dls z = a("fluid_place");
   public static final dls A = a("hit_ground");
   public static final dls B = a("instrument_play");
   public static final dls C = a("item_interact_finish");
   public static final dls D = a("item_interact_start");
   public static final dls E = a("jukebox_play", 10);
   public static final dls F = a("jukebox_stop_play", 10);
   public static final dls G = a("lightning_strike");
   public static final dls H = a("note_block_play");
   public static final dls I = a("prime_fuse");
   public static final dls J = a("projectile_land");
   public static final dls K = a("projectile_shoot");
   public static final dls L = a("sculk_sensor_tendrils_clicking");
   public static final dls M = a("shear");
   public static final dls N = a("shriek", 32);
   public static final dls O = a("splash");
   public static final dls P = a("step");
   public static final dls Q = a("swim");
   public static final dls R = a("teleport");
   public static final dls S = a("unequip");
   public static final dls T = a("resonate_1");
   public static final dls U = a("resonate_2");
   public static final dls V = a("resonate_3");
   public static final dls W = a("resonate_4");
   public static final dls X = a("resonate_5");
   public static final dls Y = a("resonate_6");
   public static final dls Z = a("resonate_7");
   public static final dls aa = a("resonate_8");
   public static final dls ab = a("resonate_9");
   public static final dls ac = a("resonate_10");
   public static final dls ad = a("resonate_11");
   public static final dls ae = a("resonate_12");
   public static final dls af = a("resonate_13");
   public static final dls ag = a("resonate_14");
   public static final dls ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final ib.c<dls> ak = jy.b.f(this);

   public dls(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static dls a(String $$0) {
      return a($$0, 16);
   }

   private static dls a(String $$0, int $$1) {
      return io.a(jy.b, $$0, new dls($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public ib.c<dls> b() {
      return this.ak;
   }

   public boolean a(arv<dls> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable bkq a, @Nullable dhi b) {
      public static dls.a a(@Nullable bkq $$0) {
         return new dls.a($$0, null);
      }

      public static dls.a a(@Nullable dhi $$0) {
         return new dls.a(null, $$0);
      }

      public static dls.a a(@Nullable bkq $$0, @Nullable dhi $$1) {
         return new dls.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dls.b> {
      private final dls a;
      private final eju b;
      private final dls.a c;
      private final dlu d;
      private final double e;

      public b(dls $$0, eju $$1, dls.a $$2, dlu $$3, eju $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dls.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dls a() {
         return this.a;
      }

      public eju b() {
         return this.b;
      }

      public dls.a c() {
         return this.c;
      }

      public dlu d() {
         return this.d;
      }
   }
}
