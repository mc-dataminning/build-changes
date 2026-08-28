import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtv(int d, float e, float f, float g, float h, int i, bqc<dfc> j, bqc<ald<etq>> k, ald<etq> l) {
   public static final dtv a = b().a();
   public static final Codec<dtv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dtv::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dtv::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dtv::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dtv::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dtv::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dtv::h),
               dfc.c.optionalFieldOf("spawn_potentials", bqc.b()).forGetter(dtv::i),
               bqc.a(ald.a(lw.be)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dtv::j),
               ald.a(lw.be).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dtv::k)
            )
            .apply($$0, dtv::new)
   );
   public static final Codec<jo<dtv>> c = ala.a(lw.aG, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dtv.a b() {
      return new dtv.a();
   }

   public int c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public int h() {
      return this.i;
   }

   public bqc<dfc> i() {
      return this.j;
   }

   public bqc<ald<etq>> j() {
      return this.k;
   }

   public ald<etq> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqc<dfc> g = bqc.b();
      private bqc<ald<etq>> h = bqc.<ald<etq>>a().a(eth.aI).a(eth.aH).a();
      private ald<etq> i = eth.aL;

      public dtv.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dtv.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dtv.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dtv.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dtv.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dtv.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dtv.a a(bqc<dfc> $$0) {
         this.g = $$0;
         return this;
      }

      public dtv.a b(bqc<ald<etq>> $$0) {
         this.h = $$0;
         return this;
      }

      public dtv.a a(ald<etq> $$0) {
         this.i = $$0;
         return this;
      }

      public dtv a() {
         return new dtv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
