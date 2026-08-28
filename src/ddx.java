import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface ddx {
   Codec<ddx> a = ma.at.q().dispatch(ddx::a, $$0 -> $$0);
   Codec<ddx> b = Codec.either(ddx.b.c, a)
      .xmap($$0 -> (ddx)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof ddx.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends ddx> a(kd<MapCodec<? extends ddx>> $$0) {
      kd.a($$0, "clamped", ddx.a.c);
      kd.a($$0, "fraction", ddx.c.c);
      kd.a($$0, "levels_squared", ddx.d.c);
      kd.a($$0, "linear", ddx.e.c);
      return kd.a($$0, "lookup", ddx.f.c);
   }

   static ddx.b a(float $$0) {
      return new ddx.b($$0);
   }

   static ddx.e a(float $$0, float $$1) {
      return new ddx.e($$0, $$1);
   }

   static ddx.e b(float $$0) {
      return a($$0, $$0);
   }

   static ddx.f a(List<Float> $$0, ddx $$1) {
      return new ddx.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends ddx> a();

   public static record a(ddx d, float e, float f) implements ddx {
      public static final MapCodec<ddx.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddx.b.fieldOf("value").forGetter(ddx.a::b), Codec.FLOAT.fieldOf("min").forGetter(ddx.a::c), Codec.FLOAT.fieldOf("max").forGetter(ddx.a::d)
                  )
                  .apply($$0, ddx.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azu.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<ddx.a> a() {
         return c;
      }

      public ddx b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements ddx {
      public static final Codec<ddx.b> c = Codec.FLOAT.xmap(ddx.b::new, ddx.b::b);
      public static final MapCodec<ddx.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ddx.b::b)).apply($$0, ddx.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<ddx.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(ddx d, ddx e) implements ddx {
      public static final MapCodec<ddx.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddx.b.fieldOf("numerator").forGetter(ddx.c::b), ddx.b.fieldOf("denominator").forGetter(ddx.c::c)).apply($$0, ddx.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<ddx.c> a() {
         return c;
      }

      public ddx b() {
         return this.d;
      }

      public ddx c() {
         return this.e;
      }
   }

   public static record d(float d) implements ddx {
      public static final MapCodec<ddx.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(ddx.d::b)).apply($$0, ddx.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azu.h($$0) + this.d;
      }

      @Override
      public MapCodec<ddx.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements ddx {
      public static final MapCodec<ddx.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(ddx.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(ddx.e::c))
               .apply($$0, ddx.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<ddx.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, ddx e) implements ddx {
      public static final MapCodec<ddx.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(ddx.f::b), ddx.b.fieldOf("fallback").forGetter(ddx.f::c)).apply($$0, ddx.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<ddx.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public ddx c() {
         return this.e;
      }
   }
}
