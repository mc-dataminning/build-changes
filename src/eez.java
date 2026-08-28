import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eez(int ak) {
   public static final je.c<eez> a = a("block_activate");
   public static final je.c<eez> b = a("block_attach");
   public static final je.c<eez> c = a("block_change");
   public static final je.c<eez> d = a("block_close");
   public static final je.c<eez> e = a("block_deactivate");
   public static final je.c<eez> f = a("block_destroy");
   public static final je.c<eez> g = a("block_detach");
   public static final je.c<eez> h = a("block_open");
   public static final je.c<eez> i = a("block_place");
   public static final je.c<eez> j = a("container_close");
   public static final je.c<eez> k = a("container_open");
   public static final je.c<eez> l = a("drink");
   public static final je.c<eez> m = a("eat");
   public static final je.c<eez> n = a("elytra_glide");
   public static final je.c<eez> o = a("entity_damage");
   public static final je.c<eez> p = a("entity_die");
   public static final je.c<eez> q = a("entity_dismount");
   public static final je.c<eez> r = a("entity_interact");
   public static final je.c<eez> s = a("entity_mount");
   public static final je.c<eez> t = a("entity_place");
   public static final je.c<eez> u = a("entity_action");
   public static final je.c<eez> v = a("equip");
   public static final je.c<eez> w = a("explode");
   public static final je.c<eez> x = a("flap");
   public static final je.c<eez> y = a("fluid_pickup");
   public static final je.c<eez> z = a("fluid_place");
   public static final je.c<eez> A = a("hit_ground");
   public static final je.c<eez> B = a("instrument_play");
   public static final je.c<eez> C = a("item_interact_finish");
   public static final je.c<eez> D = a("item_interact_start");
   public static final je.c<eez> E = a("jukebox_play", 10);
   public static final je.c<eez> F = a("jukebox_stop_play", 10);
   public static final je.c<eez> G = a("lightning_strike");
   public static final je.c<eez> H = a("note_block_play");
   public static final je.c<eez> I = a("prime_fuse");
   public static final je.c<eez> J = a("projectile_land");
   public static final je.c<eez> K = a("projectile_shoot");
   public static final je.c<eez> L = a("sculk_sensor_tendrils_clicking");
   public static final je.c<eez> M = a("shear");
   public static final je.c<eez> N = a("shriek", 32);
   public static final je.c<eez> O = a("splash");
   public static final je.c<eez> P = a("step");
   public static final je.c<eez> Q = a("swim");
   public static final je.c<eez> R = a("teleport");
   public static final je.c<eez> S = a("unequip");
   public static final je.c<eez> T = a("resonate_1");
   public static final je.c<eez> U = a("resonate_2");
   public static final je.c<eez> V = a("resonate_3");
   public static final je.c<eez> W = a("resonate_4");
   public static final je.c<eez> X = a("resonate_5");
   public static final je.c<eez> Y = a("resonate_6");
   public static final je.c<eez> Z = a("resonate_7");
   public static final je.c<eez> aa = a("resonate_8");
   public static final je.c<eez> ab = a("resonate_9");
   public static final je.c<eez> ac = a("resonate_10");
   public static final je.c<eez> ad = a("resonate_11");
   public static final je.c<eez> ae = a("resonate_12");
   public static final je.c<eez> af = a("resonate_13");
   public static final je.c<eez> ag = a("resonate_14");
   public static final je.c<eez> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<je<eez>> aj = ald.a(mg.H);

   public static je<eez> a(jr<eez> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static je.c<eez> a(String $$0) {
      return a($$0, 16);
   }

   private static je.c<eez> a(String $$0, int $$1) {
      return jr.b(mf.a, alg.b($$0), new eez($$1));
   }

   public static record a(@Nullable bwd a, @Nullable dzz b) {
      public static eez.a a(@Nullable bwd $$0) {
         return new eez.a($$0, null);
      }

      public static eez.a a(@Nullable dzz $$0) {
         return new eez.a(null, $$0);
      }

      public static eez.a a(@Nullable bwd $$0, @Nullable dzz $$1) {
         return new eez.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eez.b> {
      private final je<eez> a;
      private final fei b;
      private final eez.a c;
      private final efb d;
      private final double e;

      public b(je<eez> $$0, fei $$1, eez.a $$2, efb $$3, fei $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eez.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public je<eez> a() {
         return this.a;
      }

      public fei b() {
         return this.b;
      }

      public eez.a c() {
         return this.c;
      }

      public efb d() {
         return this.d;
      }
   }
}
