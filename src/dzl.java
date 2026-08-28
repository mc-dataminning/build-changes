import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dzl(int ak) {
   public static final jn.c<dzl> a = a("block_activate");
   public static final jn.c<dzl> b = a("block_attach");
   public static final jn.c<dzl> c = a("block_change");
   public static final jn.c<dzl> d = a("block_close");
   public static final jn.c<dzl> e = a("block_deactivate");
   public static final jn.c<dzl> f = a("block_destroy");
   public static final jn.c<dzl> g = a("block_detach");
   public static final jn.c<dzl> h = a("block_open");
   public static final jn.c<dzl> i = a("block_place");
   public static final jn.c<dzl> j = a("container_close");
   public static final jn.c<dzl> k = a("container_open");
   public static final jn.c<dzl> l = a("drink");
   public static final jn.c<dzl> m = a("eat");
   public static final jn.c<dzl> n = a("elytra_glide");
   public static final jn.c<dzl> o = a("entity_damage");
   public static final jn.c<dzl> p = a("entity_die");
   public static final jn.c<dzl> q = a("entity_dismount");
   public static final jn.c<dzl> r = a("entity_interact");
   public static final jn.c<dzl> s = a("entity_mount");
   public static final jn.c<dzl> t = a("entity_place");
   public static final jn.c<dzl> u = a("entity_action");
   public static final jn.c<dzl> v = a("equip");
   public static final jn.c<dzl> w = a("explode");
   public static final jn.c<dzl> x = a("flap");
   public static final jn.c<dzl> y = a("fluid_pickup");
   public static final jn.c<dzl> z = a("fluid_place");
   public static final jn.c<dzl> A = a("hit_ground");
   public static final jn.c<dzl> B = a("instrument_play");
   public static final jn.c<dzl> C = a("item_interact_finish");
   public static final jn.c<dzl> D = a("item_interact_start");
   public static final jn.c<dzl> E = a("jukebox_play", 10);
   public static final jn.c<dzl> F = a("jukebox_stop_play", 10);
   public static final jn.c<dzl> G = a("lightning_strike");
   public static final jn.c<dzl> H = a("note_block_play");
   public static final jn.c<dzl> I = a("prime_fuse");
   public static final jn.c<dzl> J = a("projectile_land");
   public static final jn.c<dzl> K = a("projectile_shoot");
   public static final jn.c<dzl> L = a("sculk_sensor_tendrils_clicking");
   public static final jn.c<dzl> M = a("shear");
   public static final jn.c<dzl> N = a("shriek", 32);
   public static final jn.c<dzl> O = a("splash");
   public static final jn.c<dzl> P = a("step");
   public static final jn.c<dzl> Q = a("swim");
   public static final jn.c<dzl> R = a("teleport");
   public static final jn.c<dzl> S = a("unequip");
   public static final jn.c<dzl> T = a("resonate_1");
   public static final jn.c<dzl> U = a("resonate_2");
   public static final jn.c<dzl> V = a("resonate_3");
   public static final jn.c<dzl> W = a("resonate_4");
   public static final jn.c<dzl> X = a("resonate_5");
   public static final jn.c<dzl> Y = a("resonate_6");
   public static final jn.c<dzl> Z = a("resonate_7");
   public static final jn.c<dzl> aa = a("resonate_8");
   public static final jn.c<dzl> ab = a("resonate_9");
   public static final jn.c<dzl> ac = a("resonate_10");
   public static final jn.c<dzl> ad = a("resonate_11");
   public static final jn.c<dzl> ae = a("resonate_12");
   public static final jn.c<dzl> af = a("resonate_13");
   public static final jn.c<dzl> ag = a("resonate_14");
   public static final jn.c<dzl> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jn<dzl>> aj = akz.a(lv.G);

   public static jn<dzl> a(ka<dzl> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jn.c<dzl> a(String $$0) {
      return a($$0, 16);
   }

   private static jn.c<dzl> a(String $$0, int $$1) {
      return ka.b(lu.a, alc.b($$0), new dzl($$1));
   }

   public static record a(@Nullable bto a, @Nullable duo b) {
      public static dzl.a a(@Nullable bto $$0) {
         return new dzl.a($$0, null);
      }

      public static dzl.a a(@Nullable duo $$0) {
         return new dzl.a(null, $$0);
      }

      public static dzl.a a(@Nullable bto $$0, @Nullable duo $$1) {
         return new dzl.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dzl.b> {
      private final jn<dzl> a;
      private final eys b;
      private final dzl.a c;
      private final dzn d;
      private final double e;

      public b(jn<dzl> $$0, eys $$1, dzl.a $$2, dzn $$3, eys $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dzl.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jn<dzl> a() {
         return this.a;
      }

      public eys b() {
         return this.b;
      }

      public dzl.a c() {
         return this.c;
      }

      public dzn d() {
         return this.d;
      }
   }
}
