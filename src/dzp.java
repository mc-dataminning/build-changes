import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record dzp(int ak) {
   public static final jo.c<dzp> a = a("block_activate");
   public static final jo.c<dzp> b = a("block_attach");
   public static final jo.c<dzp> c = a("block_change");
   public static final jo.c<dzp> d = a("block_close");
   public static final jo.c<dzp> e = a("block_deactivate");
   public static final jo.c<dzp> f = a("block_destroy");
   public static final jo.c<dzp> g = a("block_detach");
   public static final jo.c<dzp> h = a("block_open");
   public static final jo.c<dzp> i = a("block_place");
   public static final jo.c<dzp> j = a("container_close");
   public static final jo.c<dzp> k = a("container_open");
   public static final jo.c<dzp> l = a("drink");
   public static final jo.c<dzp> m = a("eat");
   public static final jo.c<dzp> n = a("elytra_glide");
   public static final jo.c<dzp> o = a("entity_damage");
   public static final jo.c<dzp> p = a("entity_die");
   public static final jo.c<dzp> q = a("entity_dismount");
   public static final jo.c<dzp> r = a("entity_interact");
   public static final jo.c<dzp> s = a("entity_mount");
   public static final jo.c<dzp> t = a("entity_place");
   public static final jo.c<dzp> u = a("entity_action");
   public static final jo.c<dzp> v = a("equip");
   public static final jo.c<dzp> w = a("explode");
   public static final jo.c<dzp> x = a("flap");
   public static final jo.c<dzp> y = a("fluid_pickup");
   public static final jo.c<dzp> z = a("fluid_place");
   public static final jo.c<dzp> A = a("hit_ground");
   public static final jo.c<dzp> B = a("instrument_play");
   public static final jo.c<dzp> C = a("item_interact_finish");
   public static final jo.c<dzp> D = a("item_interact_start");
   public static final jo.c<dzp> E = a("jukebox_play", 10);
   public static final jo.c<dzp> F = a("jukebox_stop_play", 10);
   public static final jo.c<dzp> G = a("lightning_strike");
   public static final jo.c<dzp> H = a("note_block_play");
   public static final jo.c<dzp> I = a("prime_fuse");
   public static final jo.c<dzp> J = a("projectile_land");
   public static final jo.c<dzp> K = a("projectile_shoot");
   public static final jo.c<dzp> L = a("sculk_sensor_tendrils_clicking");
   public static final jo.c<dzp> M = a("shear");
   public static final jo.c<dzp> N = a("shriek", 32);
   public static final jo.c<dzp> O = a("splash");
   public static final jo.c<dzp> P = a("step");
   public static final jo.c<dzp> Q = a("swim");
   public static final jo.c<dzp> R = a("teleport");
   public static final jo.c<dzp> S = a("unequip");
   public static final jo.c<dzp> T = a("resonate_1");
   public static final jo.c<dzp> U = a("resonate_2");
   public static final jo.c<dzp> V = a("resonate_3");
   public static final jo.c<dzp> W = a("resonate_4");
   public static final jo.c<dzp> X = a("resonate_5");
   public static final jo.c<dzp> Y = a("resonate_6");
   public static final jo.c<dzp> Z = a("resonate_7");
   public static final jo.c<dzp> aa = a("resonate_8");
   public static final jo.c<dzp> ab = a("resonate_9");
   public static final jo.c<dzp> ac = a("resonate_10");
   public static final jo.c<dzp> ad = a("resonate_11");
   public static final jo.c<dzp> ae = a("resonate_12");
   public static final jo.c<dzp> af = a("resonate_13");
   public static final jo.c<dzp> ag = a("resonate_14");
   public static final jo.c<dzp> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jo<dzp>> aj = alb.a(lw.G);

   public static jo<dzp> a(kb<dzp> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jo.c<dzp> a(String $$0) {
      return a($$0, 16);
   }

   private static jo.c<dzp> a(String $$0, int $$1) {
      return kb.b(lv.a, ale.b($$0), new dzp($$1));
   }

   public static record a(@Nullable btr a, @Nullable dus b) {
      public static dzp.a a(@Nullable btr $$0) {
         return new dzp.a($$0, null);
      }

      public static dzp.a a(@Nullable dus $$0) {
         return new dzp.a(null, $$0);
      }

      public static dzp.a a(@Nullable btr $$0, @Nullable dus $$1) {
         return new dzp.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<dzp.b> {
      private final jo<dzp> a;
      private final eyw b;
      private final dzp.a c;
      private final dzr d;
      private final double e;

      public b(jo<dzp> $$0, eyw $$1, dzp.a $$2, dzr $$3, eyw $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(dzp.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jo<dzp> a() {
         return this.a;
      }

      public eyw b() {
         return this.b;
      }

      public dzp.a c() {
         return this.c;
      }

      public dzr d() {
         return this.d;
      }
   }
}
