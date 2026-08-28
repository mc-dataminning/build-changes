import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dyx(int ak) {
   public static final jn.c<dyx> a = a("block_activate");
   public static final jn.c<dyx> b = a("block_attach");
   public static final jn.c<dyx> c = a("block_change");
   public static final jn.c<dyx> d = a("block_close");
   public static final jn.c<dyx> e = a("block_deactivate");
   public static final jn.c<dyx> f = a("block_destroy");
   public static final jn.c<dyx> g = a("block_detach");
   public static final jn.c<dyx> h = a("block_open");
   public static final jn.c<dyx> i = a("block_place");
   public static final jn.c<dyx> j = a("container_close");
   public static final jn.c<dyx> k = a("container_open");
   public static final jn.c<dyx> l = a("drink");
   public static final jn.c<dyx> m = a("eat");
   public static final jn.c<dyx> n = a("elytra_glide");
   public static final jn.c<dyx> o = a("entity_damage");
   public static final jn.c<dyx> p = a("entity_die");
   public static final jn.c<dyx> q = a("entity_dismount");
   public static final jn.c<dyx> r = a("entity_interact");
   public static final jn.c<dyx> s = a("entity_mount");
   public static final jn.c<dyx> t = a("entity_place");
   public static final jn.c<dyx> u = a("entity_action");
   public static final jn.c<dyx> v = a("equip");
   public static final jn.c<dyx> w = a("explode");
   public static final jn.c<dyx> x = a("flap");
   public static final jn.c<dyx> y = a("fluid_pickup");
   public static final jn.c<dyx> z = a("fluid_place");
   public static final jn.c<dyx> A = a("hit_ground");
   public static final jn.c<dyx> B = a("instrument_play");
   public static final jn.c<dyx> C = a("item_interact_finish");
   public static final jn.c<dyx> D = a("item_interact_start");
   public static final jn.c<dyx> E = a("jukebox_play", 10);
   public static final jn.c<dyx> F = a("jukebox_stop_play", 10);
   public static final jn.c<dyx> G = a("lightning_strike");
   public static final jn.c<dyx> H = a("note_block_play");
   public static final jn.c<dyx> I = a("prime_fuse");
   public static final jn.c<dyx> J = a("projectile_land");
   public static final jn.c<dyx> K = a("projectile_shoot");
   public static final jn.c<dyx> L = a("sculk_sensor_tendrils_clicking");
   public static final jn.c<dyx> M = a("shear");
   public static final jn.c<dyx> N = a("shriek", 32);
   public static final jn.c<dyx> O = a("splash");
   public static final jn.c<dyx> P = a("step");
   public static final jn.c<dyx> Q = a("swim");
   public static final jn.c<dyx> R = a("teleport");
   public static final jn.c<dyx> S = a("unequip");
   public static final jn.c<dyx> T = a("resonate_1");
   public static final jn.c<dyx> U = a("resonate_2");
   public static final jn.c<dyx> V = a("resonate_3");
   public static final jn.c<dyx> W = a("resonate_4");
   public static final jn.c<dyx> X = a("resonate_5");
   public static final jn.c<dyx> Y = a("resonate_6");
   public static final jn.c<dyx> Z = a("resonate_7");
   public static final jn.c<dyx> aa = a("resonate_8");
   public static final jn.c<dyx> ab = a("resonate_9");
   public static final jn.c<dyx> ac = a("resonate_10");
   public static final jn.c<dyx> ad = a("resonate_11");
   public static final jn.c<dyx> ae = a("resonate_12");
   public static final jn.c<dyx> af = a("resonate_13");
   public static final jn.c<dyx> ag = a("resonate_14");
   public static final jn.c<dyx> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jn<dyx>> aj = aky.a(lv.G);

   public static jn<dyx> a(ka<dyx> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jn.c<dyx> a(String $$0) {
      return a($$0, 16);
   }

   private static jn.c<dyx> a(String $$0, int $$1) {
      return ka.b(lu.a, alb.b($$0), new dyx($$1));
   }

   public static record a(@Nullable btj a, @Nullable dua b) {
      public static dyx.a a(@Nullable btj $$0) {
         return new dyx.a($$0, null);
      }

      public static dyx.a a(@Nullable dua $$0) {
         return new dyx.a(null, $$0);
      }

      public static dyx.a a(@Nullable btj $$0, @Nullable dua $$1) {
         return new dyx.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dyx.b> {
      private final jn<dyx> a;
      private final eye b;
      private final dyx.a c;
      private final dyz d;
      private final double e;

      public b(jn<dyx> $$0, eye $$1, dyx.a $$2, dyz $$3, eye $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dyx.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jn<dyx> a() {
         return this.a;
      }

      public eye b() {
         return this.b;
      }

      public dyx.a c() {
         return this.c;
      }

      public dyz d() {
         return this.d;
      }
   }
}
