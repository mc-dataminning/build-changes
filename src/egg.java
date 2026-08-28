import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record egg(int ak) {
   public static final jg.c<egg> a = a("block_activate");
   public static final jg.c<egg> b = a("block_attach");
   public static final jg.c<egg> c = a("block_change");
   public static final jg.c<egg> d = a("block_close");
   public static final jg.c<egg> e = a("block_deactivate");
   public static final jg.c<egg> f = a("block_destroy");
   public static final jg.c<egg> g = a("block_detach");
   public static final jg.c<egg> h = a("block_open");
   public static final jg.c<egg> i = a("block_place");
   public static final jg.c<egg> j = a("container_close");
   public static final jg.c<egg> k = a("container_open");
   public static final jg.c<egg> l = a("drink");
   public static final jg.c<egg> m = a("eat");
   public static final jg.c<egg> n = a("elytra_glide");
   public static final jg.c<egg> o = a("entity_damage");
   public static final jg.c<egg> p = a("entity_die");
   public static final jg.c<egg> q = a("entity_dismount");
   public static final jg.c<egg> r = a("entity_interact");
   public static final jg.c<egg> s = a("entity_mount");
   public static final jg.c<egg> t = a("entity_place");
   public static final jg.c<egg> u = a("entity_action");
   public static final jg.c<egg> v = a("equip");
   public static final jg.c<egg> w = a("explode");
   public static final jg.c<egg> x = a("flap");
   public static final jg.c<egg> y = a("fluid_pickup");
   public static final jg.c<egg> z = a("fluid_place");
   public static final jg.c<egg> A = a("hit_ground");
   public static final jg.c<egg> B = a("instrument_play");
   public static final jg.c<egg> C = a("item_interact_finish");
   public static final jg.c<egg> D = a("item_interact_start");
   public static final jg.c<egg> E = a("jukebox_play", 10);
   public static final jg.c<egg> F = a("jukebox_stop_play", 10);
   public static final jg.c<egg> G = a("lightning_strike");
   public static final jg.c<egg> H = a("note_block_play");
   public static final jg.c<egg> I = a("prime_fuse");
   public static final jg.c<egg> J = a("projectile_land");
   public static final jg.c<egg> K = a("projectile_shoot");
   public static final jg.c<egg> L = a("sculk_sensor_tendrils_clicking");
   public static final jg.c<egg> M = a("shear");
   public static final jg.c<egg> N = a("shriek", 32);
   public static final jg.c<egg> O = a("splash");
   public static final jg.c<egg> P = a("step");
   public static final jg.c<egg> Q = a("swim");
   public static final jg.c<egg> R = a("teleport");
   public static final jg.c<egg> S = a("unequip");
   public static final jg.c<egg> T = a("resonate_1");
   public static final jg.c<egg> U = a("resonate_2");
   public static final jg.c<egg> V = a("resonate_3");
   public static final jg.c<egg> W = a("resonate_4");
   public static final jg.c<egg> X = a("resonate_5");
   public static final jg.c<egg> Y = a("resonate_6");
   public static final jg.c<egg> Z = a("resonate_7");
   public static final jg.c<egg> aa = a("resonate_8");
   public static final jg.c<egg> ab = a("resonate_9");
   public static final jg.c<egg> ac = a("resonate_10");
   public static final jg.c<egg> ad = a("resonate_11");
   public static final jg.c<egg> ae = a("resonate_12");
   public static final jg.c<egg> af = a("resonate_13");
   public static final jg.c<egg> ag = a("resonate_14");
   public static final jg.c<egg> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jg<egg>> aj = alh.a(mi.H);

   public static jg<egg> a(jt<egg> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jg.c<egg> a(String $$0) {
      return a($$0, 16);
   }

   private static jg.c<egg> a(String $$0, int $$1) {
      return jt.b(mh.a, alk.b($$0), new egg($$1));
   }

   public static record a(@Nullable bwv a, @Nullable ebg b) {
      public static egg.a a(@Nullable bwv $$0) {
         return new egg.a($$0, null);
      }

      public static egg.a a(@Nullable ebg $$0) {
         return new egg.a(null, $$0);
      }

      public static egg.a a(@Nullable bwv $$0, @Nullable ebg $$1) {
         return new egg.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<egg.b> {
      private final jg<egg> a;
      private final ffs b;
      private final egg.a c;
      private final egi d;
      private final double e;

      public b(jg<egg> $$0, ffs $$1, egg.a $$2, egi $$3, ffs $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(egg.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jg<egg> a() {
         return this.a;
      }

      public ffs b() {
         return this.b;
      }

      public egg.a c() {
         return this.c;
      }

      public egi d() {
         return this.d;
      }
   }
}
