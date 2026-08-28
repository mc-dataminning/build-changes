import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duy(int d, float e, float f, float g, float h, int i, bqs<dgg> j, bqs<ali<eus>> k, ali<eus> l) {
   public static final duy a = b().a();
   public static final Codec<duy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(duy::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(duy::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(duy::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(duy::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(duy::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(duy::h),
               dgg.c.optionalFieldOf("spawn_potentials", bqs.b()).forGetter(duy::i),
               bqs.a(ali.a(ma.bd)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(duy::j),
               ali.a(ma.bd).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(duy::k)
            )
            .apply($$0, duy::new)
   );
   public static final Codec<jq<duy>> c = alf.a(ma.aF, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static duy.a b() {
      return new duy.a();
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

   public bqs<dgg> i() {
      return this.j;
   }

   public bqs<ali<eus>> j() {
      return this.k;
   }

   public ali<eus> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqs<dgg> g = bqs.b();
      private bqs<ali<eus>> h = bqs.<ali<eus>>a().a(euj.aM).a(euj.aL).a();
      private ali<eus> i = euj.aP;

      public duy.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public duy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public duy.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public duy.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public duy.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public duy.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public duy.a a(bqs<dgg> $$0) {
         this.g = $$0;
         return this;
      }

      public duy.a b(bqs<ali<eus>> $$0) {
         this.h = $$0;
         return this;
      }

      public duy.a a(ali<eus> $$0) {
         this.i = $$0;
         return this;
      }

      public duy a() {
         return new duy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
