import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface ddg {
   Codec<ddg> a = mb.at.q().dispatch(ddg::a, $$0 -> $$0);
   Codec<ddg> b = Codec.either(ddg.b.c, a)
      .xmap($$0 -> (ddg)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof ddg.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends ddg> a(ke<MapCodec<? extends ddg>> $$0) {
      ke.a($$0, "clamped", ddg.a.c);
      ke.a($$0, "fraction", ddg.c.c);
      ke.a($$0, "levels_squared", ddg.d.c);
      ke.a($$0, "linear", ddg.e.c);
      return ke.a($$0, "lookup", ddg.f.c);
   }

   static ddg.b a(float $$0) {
      return new ddg.b($$0);
   }

   static ddg.e a(float $$0, float $$1) {
      return new ddg.e($$0, $$1);
   }

   static ddg.e b(float $$0) {
      return a($$0, $$0);
   }

   static ddg.f a(List<Float> $$0, ddg $$1) {
      return new ddg.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends ddg> a();

   public static record a(ddg d, float e, float f) implements ddg {
      public static final MapCodec<ddg.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddg.b.fieldOf("value").forGetter(ddg.a::b), Codec.FLOAT.fieldOf("min").forGetter(ddg.a::c), Codec.FLOAT.fieldOf("max").forGetter(ddg.a::d)
                  )
                  .apply($$0, ddg.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayz.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<ddg.a> a() {
         return c;
      }

      public ddg b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements ddg {
      public static final Codec<ddg.b> c = Codec.FLOAT.xmap(ddg.b::new, ddg.b::b);
      public static final MapCodec<ddg.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ddg.b::b)).apply($$0, ddg.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<ddg.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(ddg d, ddg e) implements ddg {
      public static final MapCodec<ddg.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddg.b.fieldOf("numerator").forGetter(ddg.c::b), ddg.b.fieldOf("denominator").forGetter(ddg.c::c)).apply($$0, ddg.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<ddg.c> a() {
         return c;
      }

      public ddg b() {
         return this.d;
      }

      public ddg c() {
         return this.e;
      }
   }

   public static record d(float d) implements ddg {
      public static final MapCodec<ddg.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(ddg.d::b)).apply($$0, ddg.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayz.h($$0) + this.d;
      }

      @Override
      public MapCodec<ddg.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements ddg {
      public static final MapCodec<ddg.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(ddg.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(ddg.e::c))
               .apply($$0, ddg.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<ddg.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, ddg e) implements ddg {
      public static final MapCodec<ddg.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(ddg.f::b), ddg.b.fieldOf("fallback").forGetter(ddg.f::c)).apply($$0, ddg.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<ddg.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public ddg c() {
         return this.e;
      }
   }
}
