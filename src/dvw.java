import javax.annotation.Nullable;

public record dvw(int aj) {
   public static final ix.c<dvw> a = a("block_activate");
   public static final ix.c<dvw> b = a("block_attach");
   public static final ix.c<dvw> c = a("block_change");
   public static final ix.c<dvw> d = a("block_close");
   public static final ix.c<dvw> e = a("block_deactivate");
   public static final ix.c<dvw> f = a("block_destroy");
   public static final ix.c<dvw> g = a("block_detach");
   public static final ix.c<dvw> h = a("block_open");
   public static final ix.c<dvw> i = a("block_place");
   public static final ix.c<dvw> j = a("container_close");
   public static final ix.c<dvw> k = a("container_open");
   public static final ix.c<dvw> l = a("drink");
   public static final ix.c<dvw> m = a("eat");
   public static final ix.c<dvw> n = a("elytra_glide");
   public static final ix.c<dvw> o = a("entity_damage");
   public static final ix.c<dvw> p = a("entity_die");
   public static final ix.c<dvw> q = a("entity_dismount");
   public static final ix.c<dvw> r = a("entity_interact");
   public static final ix.c<dvw> s = a("entity_mount");
   public static final ix.c<dvw> t = a("entity_place");
   public static final ix.c<dvw> u = a("entity_action");
   public static final ix.c<dvw> v = a("equip");
   public static final ix.c<dvw> w = a("explode");
   public static final ix.c<dvw> x = a("flap");
   public static final ix.c<dvw> y = a("fluid_pickup");
   public static final ix.c<dvw> z = a("fluid_place");
   public static final ix.c<dvw> A = a("hit_ground");
   public static final ix.c<dvw> B = a("instrument_play");
   public static final ix.c<dvw> C = a("item_interact_finish");
   public static final ix.c<dvw> D = a("item_interact_start");
   public static final ix.c<dvw> E = a("jukebox_play", 10);
   public static final ix.c<dvw> F = a("jukebox_stop_play", 10);
   public static final ix.c<dvw> G = a("lightning_strike");
   public static final ix.c<dvw> H = a("note_block_play");
   public static final ix.c<dvw> I = a("prime_fuse");
   public static final ix.c<dvw> J = a("projectile_land");
   public static final ix.c<dvw> K = a("projectile_shoot");
   public static final ix.c<dvw> L = a("sculk_sensor_tendrils_clicking");
   public static final ix.c<dvw> M = a("shear");
   public static final ix.c<dvw> N = a("shriek", 32);
   public static final ix.c<dvw> O = a("splash");
   public static final ix.c<dvw> P = a("step");
   public static final ix.c<dvw> Q = a("swim");
   public static final ix.c<dvw> R = a("teleport");
   public static final ix.c<dvw> S = a("unequip");
   public static final ix.c<dvw> T = a("resonate_1");
   public static final ix.c<dvw> U = a("resonate_2");
   public static final ix.c<dvw> V = a("resonate_3");
   public static final ix.c<dvw> W = a("resonate_4");
   public static final ix.c<dvw> X = a("resonate_5");
   public static final ix.c<dvw> Y = a("resonate_6");
   public static final ix.c<dvw> Z = a("resonate_7");
   public static final ix.c<dvw> aa = a("resonate_8");
   public static final ix.c<dvw> ab = a("resonate_9");
   public static final ix.c<dvw> ac = a("resonate_10");
   public static final ix.c<dvw> ad = a("resonate_11");
   public static final ix.c<dvw> ae = a("resonate_12");
   public static final ix.c<dvw> af = a("resonate_13");
   public static final ix.c<dvw> ag = a("resonate_14");
   public static final ix.c<dvw> ah = a("resonate_15");
   public static final int ai = 16;

   public static ix<dvw> a(jk<dvw> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static ix.c<dvw> a(String $$0) {
      return a($$0, 16);
   }

   private static ix.c<dvw> a(String $$0, int $$1) {
      return jk.b(le.a, new akn($$0), new dvw($$1));
   }

   public static record a(@Nullable brw a, @Nullable drd b) {
      public static dvw.a a(@Nullable brw $$0) {
         return new dvw.a($$0, null);
      }

      public static dvw.a a(@Nullable drd $$0) {
         return new dvw.a(null, $$0);
      }

      public static dvw.a a(@Nullable brw $$0, @Nullable drd $$1) {
         return new dvw.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dvw.b> {
      private final ix<dvw> a;
      private final eum b;
      private final dvw.a c;
      private final dvy d;
      private final double e;

      public b(ix<dvw> $$0, eum $$1, dvw.a $$2, dvy $$3, eum $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dvw.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public ix<dvw> a() {
         return this.a;
      }

      public eum b() {
         return this.b;
      }

      public dvw.a c() {
         return this.c;
      }

      public dvy d() {
         return this.d;
      }
   }
}
