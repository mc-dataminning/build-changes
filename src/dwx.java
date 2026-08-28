import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwx(int d, float e, float f, float g, float h, int i, brq<dib> j, brq<aly<ewt>> k, aly<ewt> l) {
   public static final dwx a = b().a();
   public static final Codec<dwx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwx::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwx::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwx::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwx::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwx::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwx::h),
               dib.c.optionalFieldOf("spawn_potentials", brq.b()).forGetter(dwx::i),
               brq.a(aly.a(mb.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwx::j),
               aly.a(mb.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwx::k)
            )
            .apply($$0, dwx::new)
   );
   public static final Codec<jq<dwx>> c = alv.a(mb.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwx.a b() {
      return new dwx.a();
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

   public brq<dib> i() {
      return this.j;
   }

   public brq<aly<ewt>> j() {
      return this.k;
   }

   public aly<ewt> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private brq<dib> g = brq.b();
      private brq<aly<ewt>> h = brq.<aly<ewt>>a().a(ewk.aM).a(ewk.aL).a();
      private aly<ewt> i = ewk.aP;

      public dwx.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwx.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwx.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwx.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwx.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwx.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwx.a a(brq<dib> $$0) {
         this.g = $$0;
         return this;
      }

      public dwx.a b(brq<aly<ewt>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwx.a a(aly<ewt> $$0) {
         this.i = $$0;
         return this;
      }

      public dwx a() {
         return new dwx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
