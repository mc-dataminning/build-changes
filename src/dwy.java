import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwy(int d, float e, float f, float g, float h, int i, brr<dic> j, brr<aly<ewu>> k, aly<ewu> l) {
   public static final dwy a = b().a();
   public static final Codec<dwy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dwy::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dwy::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dwy::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dwy::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dwy::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dwy::h),
               dic.c.optionalFieldOf("spawn_potentials", brr.b()).forGetter(dwy::i),
               brr.a(aly.a(mb.bg)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dwy::j),
               aly.a(mb.bg).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dwy::k)
            )
            .apply($$0, dwy::new)
   );
   public static final Codec<jq<dwy>> c = alv.a(mb.bd, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dwy.a b() {
      return new dwy.a();
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

   public brr<dic> i() {
      return this.j;
   }

   public brr<aly<ewu>> j() {
      return this.k;
   }

   public aly<ewu> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private brr<dic> g = brr.b();
      private brr<aly<ewu>> h = brr.<aly<ewu>>a().a(ewl.aM).a(ewl.aL).a();
      private aly<ewu> i = ewl.aP;

      public dwy.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dwy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dwy.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dwy.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dwy.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dwy.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dwy.a a(brr<dic> $$0) {
         this.g = $$0;
         return this;
      }

      public dwy.a b(brr<aly<ewu>> $$0) {
         this.h = $$0;
         return this;
      }

      public dwy.a a(aly<ewu> $$0) {
         this.i = $$0;
         return this;
      }

      public dwy a() {
         return new dwy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
