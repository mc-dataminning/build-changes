import javax.annotation.Nullable;

public record dub(int aj) {
   public static final in.c<dub> a = a("block_activate");
   public static final in.c<dub> b = a("block_attach");
   public static final in.c<dub> c = a("block_change");
   public static final in.c<dub> d = a("block_close");
   public static final in.c<dub> e = a("block_deactivate");
   public static final in.c<dub> f = a("block_destroy");
   public static final in.c<dub> g = a("block_detach");
   public static final in.c<dub> h = a("block_open");
   public static final in.c<dub> i = a("block_place");
   public static final in.c<dub> j = a("container_close");
   public static final in.c<dub> k = a("container_open");
   public static final in.c<dub> l = a("drink");
   public static final in.c<dub> m = a("eat");
   public static final in.c<dub> n = a("elytra_glide");
   public static final in.c<dub> o = a("entity_damage");
   public static final in.c<dub> p = a("entity_die");
   public static final in.c<dub> q = a("entity_dismount");
   public static final in.c<dub> r = a("entity_interact");
   public static final in.c<dub> s = a("entity_mount");
   public static final in.c<dub> t = a("entity_place");
   public static final in.c<dub> u = a("entity_action");
   public static final in.c<dub> v = a("equip");
   public static final in.c<dub> w = a("explode");
   public static final in.c<dub> x = a("flap");
   public static final in.c<dub> y = a("fluid_pickup");
   public static final in.c<dub> z = a("fluid_place");
   public static final in.c<dub> A = a("hit_ground");
   public static final in.c<dub> B = a("instrument_play");
   public static final in.c<dub> C = a("item_interact_finish");
   public static final in.c<dub> D = a("item_interact_start");
   public static final in.c<dub> E = a("jukebox_play", 10);
   public static final in.c<dub> F = a("jukebox_stop_play", 10);
   public static final in.c<dub> G = a("lightning_strike");
   public static final in.c<dub> H = a("note_block_play");
   public static final in.c<dub> I = a("prime_fuse");
   public static final in.c<dub> J = a("projectile_land");
   public static final in.c<dub> K = a("projectile_shoot");
   public static final in.c<dub> L = a("sculk_sensor_tendrils_clicking");
   public static final in.c<dub> M = a("shear");
   public static final in.c<dub> N = a("shriek", 32);
   public static final in.c<dub> O = a("splash");
   public static final in.c<dub> P = a("step");
   public static final in.c<dub> Q = a("swim");
   public static final in.c<dub> R = a("teleport");
   public static final in.c<dub> S = a("unequip");
   public static final in.c<dub> T = a("resonate_1");
   public static final in.c<dub> U = a("resonate_2");
   public static final in.c<dub> V = a("resonate_3");
   public static final in.c<dub> W = a("resonate_4");
   public static final in.c<dub> X = a("resonate_5");
   public static final in.c<dub> Y = a("resonate_6");
   public static final in.c<dub> Z = a("resonate_7");
   public static final in.c<dub> aa = a("resonate_8");
   public static final in.c<dub> ab = a("resonate_9");
   public static final in.c<dub> ac = a("resonate_10");
   public static final in.c<dub> ad = a("resonate_11");
   public static final in.c<dub> ae = a("resonate_12");
   public static final in.c<dub> af = a("resonate_13");
   public static final in.c<dub> ag = a("resonate_14");
   public static final in.c<dub> ah = a("resonate_15");
   public static final int ai = 16;

   public static in<dub> a(ja<dub> $$0) {
      return a;
   }

   public int a() {
      return this.aj;
   }

   private static in.c<dub> a(String $$0) {
      return a($$0, 16);
   }

   private static in.c<dub> a(String $$0, int $$1) {
      return ja.b(kt.a, new ajv($$0), new dub($$1));
   }

   public static record a(@Nullable bqa a, @Nullable dpi b) {
      public static dub.a a(@Nullable bqa $$0) {
         return new dub.a($$0, null);
      }

      public static dub.a a(@Nullable dpi $$0) {
         return new dub.a(null, $$0);
      }

      public static dub.a a(@Nullable bqa $$0, @Nullable dpi $$1) {
         return new dub.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dub.b> {
      private final in<dub> a;
      private final esj b;
      private final dub.a c;
      private final dud d;
      private final double e;

      public b(in<dub> $$0, esj $$1, dub.a $$2, dud $$3, esj $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dub.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public in<dub> a() {
         return this.a;
      }

      public esj b() {
         return this.b;
      }

      public dub.a c() {
         return this.c;
      }

      public dud d() {
         return this.d;
      }
   }
}
