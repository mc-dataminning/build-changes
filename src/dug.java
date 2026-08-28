import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dug(int d, float e, float f, float g, float h, int i, bqg<dfo> j, bqg<alg<eub>> k, alg<eub> l) {
   public static final dug a = b().a();
   public static final Codec<dug> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 128).optionalFieldOf("spawn_range", a.d).forGetter(dug::c),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", a.e).forGetter(dug::d),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", a.f).forGetter(dug::e),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", a.g).forGetter(dug::f),
               Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", a.h).forGetter(dug::g),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", a.i).forGetter(dug::h),
               dfo.c.optionalFieldOf("spawn_potentials", bqg.b()).forGetter(dug::i),
               bqg.a(alg.a(ly.bd)).optionalFieldOf("loot_tables_to_eject", a.k).forGetter(dug::j),
               alg.a(ly.bd).optionalFieldOf("items_to_drop_when_ominous", a.l).forGetter(dug::k)
            )
            .apply($$0, dug::new)
   );
   public static final Codec<jp<dug>> c = ald.a(ly.aF, b);

   public int a(int $$0) {
      return (int)Math.floor((double)(this.e + this.g * (float)$$0));
   }

   public int b(int $$0) {
      return (int)Math.floor((double)(this.f + this.h * (float)$$0));
   }

   public long a() {
      return 160L;
   }

   public static dug.a b() {
      return new dug.a();
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

   public bqg<dfo> i() {
      return this.j;
   }

   public bqg<alg<eub>> j() {
      return this.k;
   }

   public alg<eub> k() {
      return this.l;
   }

   public static class a {
      private int a = 4;
      private float b = 6.0F;
      private float c = 2.0F;
      private float d = 2.0F;
      private float e = 1.0F;
      private int f = 40;
      private bqg<dfo> g = bqg.b();
      private bqg<alg<eub>> h = bqg.<alg<eub>>a().a(ets.aI).a(ets.aH).a();
      private alg<eub> i = ets.aL;

      public dug.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public dug.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dug.a b(float $$0) {
         this.c = $$0;
         return this;
      }

      public dug.a c(float $$0) {
         this.d = $$0;
         return this;
      }

      public dug.a d(float $$0) {
         this.e = $$0;
         return this;
      }

      public dug.a b(int $$0) {
         this.f = $$0;
         return this;
      }

      public dug.a a(bqg<dfo> $$0) {
         this.g = $$0;
         return this;
      }

      public dug.a b(bqg<alg<eub>> $$0) {
         this.h = $$0;
         return this;
      }

      public dug.a a(alg<eub> $$0) {
         this.i = $$0;
         return this;
      }

      public dug a() {
         return new dug(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
