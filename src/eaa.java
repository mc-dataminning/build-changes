import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record eaa(int ak) {
   public static final jp.c<eaa> a = a("block_activate");
   public static final jp.c<eaa> b = a("block_attach");
   public static final jp.c<eaa> c = a("block_change");
   public static final jp.c<eaa> d = a("block_close");
   public static final jp.c<eaa> e = a("block_deactivate");
   public static final jp.c<eaa> f = a("block_destroy");
   public static final jp.c<eaa> g = a("block_detach");
   public static final jp.c<eaa> h = a("block_open");
   public static final jp.c<eaa> i = a("block_place");
   public static final jp.c<eaa> j = a("container_close");
   public static final jp.c<eaa> k = a("container_open");
   public static final jp.c<eaa> l = a("drink");
   public static final jp.c<eaa> m = a("eat");
   public static final jp.c<eaa> n = a("elytra_glide");
   public static final jp.c<eaa> o = a("entity_damage");
   public static final jp.c<eaa> p = a("entity_die");
   public static final jp.c<eaa> q = a("entity_dismount");
   public static final jp.c<eaa> r = a("entity_interact");
   public static final jp.c<eaa> s = a("entity_mount");
   public static final jp.c<eaa> t = a("entity_place");
   public static final jp.c<eaa> u = a("entity_action");
   public static final jp.c<eaa> v = a("equip");
   public static final jp.c<eaa> w = a("explode");
   public static final jp.c<eaa> x = a("flap");
   public static final jp.c<eaa> y = a("fluid_pickup");
   public static final jp.c<eaa> z = a("fluid_place");
   public static final jp.c<eaa> A = a("hit_ground");
   public static final jp.c<eaa> B = a("instrument_play");
   public static final jp.c<eaa> C = a("item_interact_finish");
   public static final jp.c<eaa> D = a("item_interact_start");
   public static final jp.c<eaa> E = a("jukebox_play", 10);
   public static final jp.c<eaa> F = a("jukebox_stop_play", 10);
   public static final jp.c<eaa> G = a("lightning_strike");
   public static final jp.c<eaa> H = a("note_block_play");
   public static final jp.c<eaa> I = a("prime_fuse");
   public static final jp.c<eaa> J = a("projectile_land");
   public static final jp.c<eaa> K = a("projectile_shoot");
   public static final jp.c<eaa> L = a("sculk_sensor_tendrils_clicking");
   public static final jp.c<eaa> M = a("shear");
   public static final jp.c<eaa> N = a("shriek", 32);
   public static final jp.c<eaa> O = a("splash");
   public static final jp.c<eaa> P = a("step");
   public static final jp.c<eaa> Q = a("swim");
   public static final jp.c<eaa> R = a("teleport");
   public static final jp.c<eaa> S = a("unequip");
   public static final jp.c<eaa> T = a("resonate_1");
   public static final jp.c<eaa> U = a("resonate_2");
   public static final jp.c<eaa> V = a("resonate_3");
   public static final jp.c<eaa> W = a("resonate_4");
   public static final jp.c<eaa> X = a("resonate_5");
   public static final jp.c<eaa> Y = a("resonate_6");
   public static final jp.c<eaa> Z = a("resonate_7");
   public static final jp.c<eaa> aa = a("resonate_8");
   public static final jp.c<eaa> ab = a("resonate_9");
   public static final jp.c<eaa> ac = a("resonate_10");
   public static final jp.c<eaa> ad = a("resonate_11");
   public static final jp.c<eaa> ae = a("resonate_12");
   public static final jp.c<eaa> af = a("resonate_13");
   public static final jp.c<eaa> ag = a("resonate_14");
   public static final jp.c<eaa> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jp<eaa>> aj = ale.a(ly.G);

   public static jp<eaa> a(kc<eaa> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jp.c<eaa> a(String $$0) {
      return a($$0, 16);
   }

   private static jp.c<eaa> a(String $$0, int $$1) {
      return kc.b(lx.a, alh.b($$0), new eaa($$1));
   }

   public static record a(@Nullable btz a, @Nullable dvd b) {
      public static eaa.a a(@Nullable btz $$0) {
         return new eaa.a($$0, null);
      }

      public static eaa.a a(@Nullable dvd $$0) {
         return new eaa.a(null, $$0);
      }

      public static eaa.a a(@Nullable btz $$0, @Nullable dvd $$1) {
         return new eaa.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<eaa.b> {
      private final jp<eaa> a;
      private final ezh b;
      private final eaa.a c;
      private final eac d;
      private final double e;

      public b(jp<eaa> $$0, ezh $$1, eaa.a $$2, eac $$3, ezh $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(eaa.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jp<eaa> a() {
         return this.a;
      }

      public ezh b() {
         return this.b;
      }

      public eaa.a c() {
         return this.c;
      }

      public eac d() {
         return this.d;
      }
   }
}
