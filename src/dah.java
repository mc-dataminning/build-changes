import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface dah {
   Codec<dah> a = lt.av.r().dispatch(dah::a, $$0 -> $$0);
   Codec<dah> b = Codec.either(dah.b.c, a)
      .xmap($$0 -> (dah)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dah.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dah> a(jz<MapCodec<? extends dah>> $$0) {
      jz.a($$0, "clamped", dah.a.c);
      jz.a($$0, "fraction", dah.c.c);
      jz.a($$0, "levels_squared", dah.d.c);
      return jz.a($$0, "linear", dah.e.c);
   }

   static dah.b a(float $$0) {
      return new dah.b($$0);
   }

   static dah.e a(float $$0, float $$1) {
      return new dah.e($$0, $$1);
   }

   static dah.e b(float $$0) {
      return a($$0, $$0);
   }

   float a(int var1);

   MapCodec<? extends dah> a();

   public static record a(dah d, float e, float f) implements dah {
      public static final MapCodec<dah.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dah.b.fieldOf("value").forGetter(dah.a::b), Codec.FLOAT.fieldOf("min").forGetter(dah.a::c), Codec.FLOAT.fieldOf("max").forGetter(dah.a::d)
                  )
                  .apply($$0, dah.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayn.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dah.a> a() {
         return c;
      }

      public dah b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dah {
      public static final Codec<dah.b> c = Codec.FLOAT.xmap(dah.b::new, dah.b::b);
      public static final MapCodec<dah.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dah.b::b)).apply($$0, dah.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dah.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dah d, dah e) implements dah {
      public static final MapCodec<dah.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dah.b.fieldOf("numerator").forGetter(dah.c::b), dah.b.fieldOf("denominator").forGetter(dah.c::c)).apply($$0, dah.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dah.c> a() {
         return c;
      }

      public dah b() {
         return this.d;
      }

      public dah c() {
         return this.e;
      }
   }

   public static record d(float d) implements dah {
      public static final MapCodec<dah.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dah.d::b)).apply($$0, dah.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayn.h($$0) + this.d;
      }

      @Override
      public MapCodec<dah.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dah {
      public static final MapCodec<dah.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dah.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dah.e::c))
               .apply($$0, dah.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dah.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }
}
