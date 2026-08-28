import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface ddh {
   Codec<ddh> a = mb.at.q().dispatch(ddh::a, $$0 -> $$0);
   Codec<ddh> b = Codec.either(ddh.b.c, a)
      .xmap($$0 -> (ddh)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof ddh.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends ddh> a(ke<MapCodec<? extends ddh>> $$0) {
      ke.a($$0, "clamped", ddh.a.c);
      ke.a($$0, "fraction", ddh.c.c);
      ke.a($$0, "levels_squared", ddh.d.c);
      ke.a($$0, "linear", ddh.e.c);
      return ke.a($$0, "lookup", ddh.f.c);
   }

   static ddh.b a(float $$0) {
      return new ddh.b($$0);
   }

   static ddh.e a(float $$0, float $$1) {
      return new ddh.e($$0, $$1);
   }

   static ddh.e b(float $$0) {
      return a($$0, $$0);
   }

   static ddh.f a(List<Float> $$0, ddh $$1) {
      return new ddh.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends ddh> a();

   public static record a(ddh d, float e, float f) implements ddh {
      public static final MapCodec<ddh.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddh.b.fieldOf("value").forGetter(ddh.a::b), Codec.FLOAT.fieldOf("min").forGetter(ddh.a::c), Codec.FLOAT.fieldOf("max").forGetter(ddh.a::d)
                  )
                  .apply($$0, ddh.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayz.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<ddh.a> a() {
         return c;
      }

      public ddh b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements ddh {
      public static final Codec<ddh.b> c = Codec.FLOAT.xmap(ddh.b::new, ddh.b::b);
      public static final MapCodec<ddh.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ddh.b::b)).apply($$0, ddh.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<ddh.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(ddh d, ddh e) implements ddh {
      public static final MapCodec<ddh.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddh.b.fieldOf("numerator").forGetter(ddh.c::b), ddh.b.fieldOf("denominator").forGetter(ddh.c::c)).apply($$0, ddh.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<ddh.c> a() {
         return c;
      }

      public ddh b() {
         return this.d;
      }

      public ddh c() {
         return this.e;
      }
   }

   public static record d(float d) implements ddh {
      public static final MapCodec<ddh.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(ddh.d::b)).apply($$0, ddh.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayz.h($$0) + this.d;
      }

      @Override
      public MapCodec<ddh.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements ddh {
      public static final MapCodec<ddh.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(ddh.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(ddh.e::c))
               .apply($$0, ddh.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<ddh.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, ddh e) implements ddh {
      public static final MapCodec<ddh.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(ddh.f::b), ddh.b.fieldOf("fallback").forGetter(ddh.f::c)).apply($$0, ddh.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<ddh.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public ddh c() {
         return this.e;
      }
   }
}
