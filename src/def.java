import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface def {
   Codec<def> a = ma.at.q().dispatch(def::a, $$0 -> $$0);
   Codec<def> b = Codec.either(def.b.c, a)
      .xmap($$0 -> (def)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof def.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends def> a(kd<MapCodec<? extends def>> $$0) {
      kd.a($$0, "clamped", def.a.c);
      kd.a($$0, "fraction", def.c.c);
      kd.a($$0, "levels_squared", def.d.c);
      kd.a($$0, "linear", def.e.c);
      return kd.a($$0, "lookup", def.f.c);
   }

   static def.b a(float $$0) {
      return new def.b($$0);
   }

   static def.e a(float $$0, float $$1) {
      return new def.e($$0, $$1);
   }

   static def.e b(float $$0) {
      return a($$0, $$0);
   }

   static def.f a(List<Float> $$0, def $$1) {
      return new def.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends def> a();

   public static record a(def d, float e, float f) implements def {
      public static final MapCodec<def.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     def.b.fieldOf("value").forGetter(def.a::b), Codec.FLOAT.fieldOf("min").forGetter(def.a::c), Codec.FLOAT.fieldOf("max").forGetter(def.a::d)
                  )
                  .apply($$0, def.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return bae.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<def.a> a() {
         return c;
      }

      public def b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements def {
      public static final Codec<def.b> c = Codec.FLOAT.xmap(def.b::new, def.b::b);
      public static final MapCodec<def.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(def.b::b)).apply($$0, def.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<def.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(def d, def e) implements def {
      public static final MapCodec<def.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(def.b.fieldOf("numerator").forGetter(def.c::b), def.b.fieldOf("denominator").forGetter(def.c::c)).apply($$0, def.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<def.c> a() {
         return c;
      }

      public def b() {
         return this.d;
      }

      public def c() {
         return this.e;
      }
   }

   public static record d(float d) implements def {
      public static final MapCodec<def.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(def.d::b)).apply($$0, def.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)bae.h($$0) + this.d;
      }

      @Override
      public MapCodec<def.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements def {
      public static final MapCodec<def.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(def.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(def.e::c))
               .apply($$0, def.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<def.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, def e) implements def {
      public static final MapCodec<def.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(def.f::b), def.b.fieldOf("fallback").forGetter(def.f::c)).apply($$0, def.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<def.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public def c() {
         return this.e;
      }
   }
}
