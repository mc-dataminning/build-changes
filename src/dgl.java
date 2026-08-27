import javax.annotation.Nullable;

public class dgl {
   public static final dgl a = a("block_activate");
   public static final dgl b = a("block_attach");
   public static final dgl c = a("block_change");
   public static final dgl d = a("block_close");
   public static final dgl e = a("block_deactivate");
   public static final dgl f = a("block_destroy");
   public static final dgl g = a("block_detach");
   public static final dgl h = a("block_open");
   public static final dgl i = a("block_place");
   public static final dgl j = a("container_close");
   public static final dgl k = a("container_open");
   public static final dgl l = a("drink");
   public static final dgl m = a("eat");
   public static final dgl n = a("elytra_glide");
   public static final dgl o = a("entity_damage");
   public static final dgl p = a("entity_die");
   public static final dgl q = a("entity_dismount");
   public static final dgl r = a("entity_interact");
   public static final dgl s = a("entity_mount");
   public static final dgl t = a("entity_place");
   public static final dgl u = a("entity_roar");
   public static final dgl v = a("entity_shake");
   public static final dgl w = a("equip");
   public static final dgl x = a("explode");
   public static final dgl y = a("flap");
   public static final dgl z = a("fluid_pickup");
   public static final dgl A = a("fluid_place");
   public static final dgl B = a("hit_ground");
   public static final dgl C = a("instrument_play");
   public static final dgl D = a("item_interact_finish");
   public static final dgl E = a("item_interact_start");
   public static final dgl F = a("jukebox_play", 10);
   public static final dgl G = a("jukebox_stop_play", 10);
   public static final dgl H = a("lightning_strike");
   public static final dgl I = a("note_block_play");
   public static final dgl J = a("prime_fuse");
   public static final dgl K = a("projectile_land");
   public static final dgl L = a("projectile_shoot");
   public static final dgl M = a("sculk_sensor_tendrils_clicking");
   public static final dgl N = a("shear");
   public static final dgl O = a("shriek", 32);
   public static final dgl P = a("splash");
   public static final dgl Q = a("step");
   public static final dgl R = a("swim");
   public static final dgl S = a("teleport");
   public static final dgl T = a("resonate_1");
   public static final dgl U = a("resonate_2");
   public static final dgl V = a("resonate_3");
   public static final dgl W = a("resonate_4");
   public static final dgl X = a("resonate_5");
   public static final dgl Y = a("resonate_6");
   public static final dgl Z = a("resonate_7");
   public static final dgl aa = a("resonate_8");
   public static final dgl ab = a("resonate_9");
   public static final dgl ac = a("resonate_10");
   public static final dgl ad = a("resonate_11");
   public static final dgl ae = a("resonate_12");
   public static final dgl af = a("resonate_13");
   public static final dgl ag = a("resonate_14");
   public static final dgl ah = a("resonate_15");
   public static final int ai = 16;
   private final String aj;
   private final int ak;
   private final he.c<dgl> al = jb.b.f(this);

   public dgl(String $$0, int $$1) {
      this.aj = $$0;
      this.ak = $$1;
   }

   public String a() {
      return this.aj;
   }

   public int b() {
      return this.ak;
   }

   private static dgl a(String $$0) {
      return a($$0, 16);
   }

   private static dgl a(String $$0, int $$1) {
      return hr.a(jb.b, $$0, new dgl($$0, $$1));
   }

   @Override
   public String toString() {
      return "Game Event{ " + this.aj + " , " + this.ak + "}";
   }

   @Deprecated
   public he.c<dgl> c() {
      return this.al;
   }

   public boolean a(anl<dgl> $$0) {
      return this.al.a($$0);
   }

   public static record a(@Nullable bfj a, @Nullable dcb b) {
      public static dgl.a a(@Nullable bfj $$0) {
         return new dgl.a($$0, null);
      }

      public static dgl.a a(@Nullable dcb $$0) {
         return new dgl.a(null, $$0);
      }

      public static dgl.a a(@Nullable bfj $$0, @Nullable dcb $$1) {
         return new dgl.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dgl.b> {
      private final dgl a;
      private final eei b;
      private final dgl.a c;
      private final dgn d;
      private final double e;

      public b(dgl $$0, eei $$1, dgl.a $$2, dgn $$3, eei $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dgl.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public dgl a() {
         return this.a;
      }

      public eei b() {
         return this.b;
      }

      public dgl.a c() {
         return this.c;
      }

      public dgn d() {
         return this.d;
      }
   }
}
