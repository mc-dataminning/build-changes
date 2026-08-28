import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record egq(int ak) {
   public static final jg.c<egq> a = a("block_activate");
   public static final jg.c<egq> b = a("block_attach");
   public static final jg.c<egq> c = a("block_change");
   public static final jg.c<egq> d = a("block_close");
   public static final jg.c<egq> e = a("block_deactivate");
   public static final jg.c<egq> f = a("block_destroy");
   public static final jg.c<egq> g = a("block_detach");
   public static final jg.c<egq> h = a("block_open");
   public static final jg.c<egq> i = a("block_place");
   public static final jg.c<egq> j = a("container_close");
   public static final jg.c<egq> k = a("container_open");
   public static final jg.c<egq> l = a("drink");
   public static final jg.c<egq> m = a("eat");
   public static final jg.c<egq> n = a("elytra_glide");
   public static final jg.c<egq> o = a("entity_damage");
   public static final jg.c<egq> p = a("entity_die");
   public static final jg.c<egq> q = a("entity_dismount");
   public static final jg.c<egq> r = a("entity_interact");
   public static final jg.c<egq> s = a("entity_mount");
   public static final jg.c<egq> t = a("entity_place");
   public static final jg.c<egq> u = a("entity_action");
   public static final jg.c<egq> v = a("equip");
   public static final jg.c<egq> w = a("explode");
   public static final jg.c<egq> x = a("flap");
   public static final jg.c<egq> y = a("fluid_pickup");
   public static final jg.c<egq> z = a("fluid_place");
   public static final jg.c<egq> A = a("hit_ground");
   public static final jg.c<egq> B = a("instrument_play");
   public static final jg.c<egq> C = a("item_interact_finish");
   public static final jg.c<egq> D = a("item_interact_start");
   public static final jg.c<egq> E = a("jukebox_play", 10);
   public static final jg.c<egq> F = a("jukebox_stop_play", 10);
   public static final jg.c<egq> G = a("lightning_strike");
   public static final jg.c<egq> H = a("note_block_play");
   public static final jg.c<egq> I = a("prime_fuse");
   public static final jg.c<egq> J = a("projectile_land");
   public static final jg.c<egq> K = a("projectile_shoot");
   public static final jg.c<egq> L = a("sculk_sensor_tendrils_clicking");
   public static final jg.c<egq> M = a("shear");
   public static final jg.c<egq> N = a("shriek", 32);
   public static final jg.c<egq> O = a("splash");
   public static final jg.c<egq> P = a("step");
   public static final jg.c<egq> Q = a("swim");
   public static final jg.c<egq> R = a("teleport");
   public static final jg.c<egq> S = a("unequip");
   public static final jg.c<egq> T = a("resonate_1");
   public static final jg.c<egq> U = a("resonate_2");
   public static final jg.c<egq> V = a("resonate_3");
   public static final jg.c<egq> W = a("resonate_4");
   public static final jg.c<egq> X = a("resonate_5");
   public static final jg.c<egq> Y = a("resonate_6");
   public static final jg.c<egq> Z = a("resonate_7");
   public static final jg.c<egq> aa = a("resonate_8");
   public static final jg.c<egq> ab = a("resonate_9");
   public static final jg.c<egq> ac = a("resonate_10");
   public static final jg.c<egq> ad = a("resonate_11");
   public static final jg.c<egq> ae = a("resonate_12");
   public static final jg.c<egq> af = a("resonate_13");
   public static final jg.c<egq> ag = a("resonate_14");
   public static final jg.c<egq> ah = a("resonate_15");
   public static final int ai = 16;
   public static final Codec<jg<egq>> aj = alo.a(mi.H);

   public static jg<egq> a(jt<egq> $$0) {
      return a;
   }

   public int a() {
      return this.ak;
   }

   private static jg.c<egq> a(String $$0) {
      return a($$0, 16);
   }

   private static jg.c<egq> a(String $$0, int $$1) {
      return jt.b(mh.a, alr.b($$0), new egq($$1));
   }

   public static record a(@Nullable bxe a, @Nullable ebq b) {
      public static egq.a a(@Nullable bxe $$0) {
         return new egq.a($$0, null);
      }

      public static egq.a a(@Nullable ebq $$0) {
         return new egq.a(null, $$0);
      }

      public static egq.a a(@Nullable bxe $$0, @Nullable ebq $$1) {
         return new egq.a($$0, $$1);
      }
   }

   public static final class b implements Comparable<egq.b> {
      private final jg<egq> a;
      private final fgc b;
      private final egq.a c;
      private final egs d;
      private final double e;

      public b(jg<egq> $$0, fgc $$1, egq.a $$2, egs $$3, fgc $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$1.g($$4);
      }

      public int a(egq.b $$0) {
         return Double.compare(this.e, $$0.e);
      }

      public jg<egq> a() {
         return this.a;
      }

      public fgc b() {
         return this.b;
      }

      public egq.a c() {
         return this.c;
      }

      public egs d() {
         return this.d;
      }
   }
}
