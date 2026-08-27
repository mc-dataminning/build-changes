import javax.annotation.Nullable;

public class djn {
   public static final djn a = a("block_activate");
   public static final djn b = a("block_attach");
   public static final djn c = a("block_change");
   public static final djn d = a("block_close");
   public static final djn e = a("block_deactivate");
   public static final djn f = a("block_destroy");
   public static final djn g = a("block_detach");
   public static final djn h = a("block_open");
   public static final djn i = a("block_place");
   public static final djn j = a("container_close");
   public static final djn k = a("container_open");
   public static final djn l = a("drink");
   public static final djn m = a("eat");
   public static final djn n = a("elytra_glide");
   public static final djn o = a("entity_damage");
   public static final djn p = a("entity_die");
   public static final djn q = a("entity_dismount");
   public static final djn r = a("entity_interact");
   public static final djn s = a("entity_mount");
   public static final djn t = a("entity_place");
   public static final djn u = a("entity_action");
   public static final djn v = a("equip");
   public static final djn w = a("explode");
   public static final djn x = a("flap");
   public static final djn y = a("fluid_pickup");
   public static final djn z = a("fluid_place");
   public static final djn A = a("hit_ground");
   public static final djn B = a("instrument_play");
   public static final djn C = a("item_interact_finish");
   public static final djn D = a("item_interact_start");
   public static final djn E = a("jukebox_play", 10);
   public static final djn F = a("jukebox_stop_play", 10);
   public static final djn G = a("lightning_strike");
   public static final djn H = a("note_block_play");
   public static final djn I = a("prime_fuse");
   public static final djn J = a("projectile_land");
   public static final djn K = a("projectile_shoot");
   public static final djn L = a("sculk_sensor_tendrils_clicking");
   public static final djn M = a("shear");
   public static final djn N = a("shriek", 32);
   public static final djn O = a("splash");
   public static final djn P = a("step");
   public static final djn Q = a("swim");
   public static final djn R = a("teleport");
   public static final djn S = a("unequip");
   public static final djn T = a("resonate_1");
   public static final djn U = a("resonate_2");
   public static final djn V = a("resonate_3");
   public static final djn W = a("resonate_4");
   public static final djn X = a("resonate_5");
   public static final djn Y = a("resonate_6");
   public static final djn Z = a("resonate_7");
   public static final djn aa = a("resonate_8");
   public static final djn ab = a("resonate_9");
   public static final djn ac = a("resonate_10");
   public static final djn ad = a("resonate_11");
   public static final djn ae = a("resonate_12");
   public static final djn af = a("resonate_13");
   public static final djn ag = a("resonate_14");
   public static final djn ah = a("resonate_15");
   public static final int ai = 16;
   private final int aj;
   private final he.c<djn> ak = jb.b.f(this);

   public djn(int $$0) {
      this.aj = $$0;
   }

   public int a() {
      return this.aj;
   }

   private static djn a(String $$0) {
      return a($$0, 16);
   }

   private static djn a(String $$0, int $$1) {
      return hq.a(jb.b, $$0, new djn($$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.b().g().a() + " , " + this.aj + "}";
   }

   @Deprecated
   public he.c<djn> b() {
      return this.ak;
   }

   public boolean a(aqk<djn> $$0) {
      return this.ak.a($$0);
   }

   public static record a(@Nullable biw a, @Nullable dfd b) {
      public static djn.a a(@Nullable biw $$0) {
         return new djn.a($$0, null);
      }

      public static djn.a a(@Nullable dfd $$0) {
         return new djn.a(null, $$0);
      }

      public static djn.a a(@Nullable biw $$0, @Nullable dfd $$1) {
         return new djn.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<djn.b> {
      private final djn a;
      private final ehh b;
      private final djn.a c;
      private final djp d;
      private final double e;

      public b(djn $$0, ehh $$1, djn.a $$2, djp $$3, ehh $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(djn.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public djn a() {
         return this.a;
      }

      public ehh b() {
         return this.b;
      }

      public djn.a c() {
         return this.c;
      }

      public djp d() {
         return this.d;
      }
   }
}
