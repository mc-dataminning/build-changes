import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eeo(int ak) {
   public static final je.c<eeo> a = a("block_activate");
   public static final je.c<eeo> b = a("block_attach");
   public static final je.c<eeo> c = a("block_change");
   public static final je.c<eeo> d = a("block_close");
   public static final je.c<eeo> e = a("block_deactivate");
   public static final je.c<eeo> f = a("block_destroy");
   public static final je.c<eeo> g = a("block_detach");
   public static final je.c<eeo> h = a("block_open");
   public static final je.c<eeo> i = a("block_place");
   public static final je.c<eeo> j = a("container_close");
   public static final je.c<eeo> k = a("container_open");
   public static final je.c<eeo> l = a("drink");
   public static final je.c<eeo> m = a("eat");
   public static final je.c<eeo> n = a("elytra_glide");
   public static final je.c<eeo> o = a("entity_damage");
   public static final je.c<eeo> p = a("entity_die");
   public static final je.c<eeo> q = a("entity_dismount");
   public static final je.c<eeo> r = a("entity_interact");
   public static final je.c<eeo> s = a("entity_mount");
   public static final je.c<eeo> t = a("entity_place");
   public static final je.c<eeo> u = a("entity_action");
   public static final je.c<eeo> v = a("equip");
   public static final je.c<eeo> w = a("explode");
   public static final je.c<eeo> x = a("flap");
   public static final je.c<eeo> y = a("fluid_pickup");
   public static final je.c<eeo> z = a("fluid_place");
   public static final je.c<eeo> A = a("hit_ground");
   public static final je.c<eeo> B = a("instrument_play");
   public static final je.c<eeo> C = a("item_interact_finish");
   public static final je.c<eeo> D = a("item_interact_start");
   public static final je.c<eeo> E = a("jukebox_play", 10);
   public static final je.c<eeo> F = a("jukebox_stop_play", 10);
   public static final je.c<eeo> G = a("lightning_strike");
   public static final je.c<eeo> H = a("note_block_play");
   public static final je.c<eeo> I = a("prime_fuse");
   public static final je.c<eeo> J = a("projectile_land");
   public static final je.c<eeo> K = a("projectile_shoot");
   public static final je.c<eeo> L = a("sculk_sensor_tendrils_clicking");
   public static final je.c<eeo> M = a("shear");
   public static final je.c<eeo> N = a("shriek", 32);
   public static final je.c<eeo> O = a("splash");
   public static final je.c<eeo> P = a("step");
   public static final je.c<eeo> Q = a("swim");
   public static final je.c<eeo> R = a("teleport");
   public static final je.c<eeo> S = a("unequip");
   public static final je.c<eeo> T = a("resonate_1");
   public static final je.c<eeo> U = a("resonate_2");
   public static final je.c<eeo> V = a("resonate_3");
   public static final je.c<eeo> W = a("resonate_4");
   public static final je.c<eeo> X = a("resonate_5");
   public static final je.c<eeo> Y = a("resonate_6");
   public static final je.c<eeo> Z = a("resonate_7");
   public static final je.c<eeo> aa = a("resonate_8");
   public static final je.c<eeo> ab = a("resonate_9");
   public static final je.c<eeo> ac = a("resonate_10");
   public static final je.c<eeo> ad = a("resonate_11");
   public static final je.c<eeo> ae = a("resonate_12");
   public static final je.c<eeo> af = a("resonate_13");
   public static final je.c<eeo> ag = a("resonate_14");
   public static final je.c<eeo> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<je<eeo>> aj = alb.a(mg.H);

   public static je<eeo> a(jr<eeo> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static je.c<eeo> a(String $$0) {
      return a($$0, 16);
   }

   private static je.c<eeo> a(String $$0, int $$1) {
      return jr.b(mf.a, ale.b($$0), new eeo($$1));
   }

   public static record a(@Nullable bwa a, @Nullable dzo b) {
      public static eeo.a a(@Nullable bwa $$0) {
         return new eeo.a($$0, null);
      }

      public static eeo.a a(@Nullable dzo $$0) {
         return new eeo.a(null, $$0);
      }

      public static eeo.a a(@Nullable bwa $$0, @Nullable dzo $$1) {
         return new eeo.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eeo.b> {
      private final je<eeo> a;
      private final fdw b;
      private final eeo.a c;
      private final eeq d;
      private final double e;

      public b(je<eeo> $$0, fdw $$1, eeo.a $$2, eeq $$3, fdw $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eeo.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public je<eeo> a() {
         return this.a;
      }

      public fdw b() {
         return this.b;
      }

      public eeo.a c() {
         return this.c;
      }

      public eeq d() {
         return this.d;
      }
   }
}
