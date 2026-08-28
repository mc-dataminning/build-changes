import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface deg {
   Codec<deg> a = ma.at.q().dispatch(deg::a, $$0 -> $$0);
   Codec<deg> b = Codec.either(deg.b.c, a)
      .xmap($$0 -> (deg)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof deg.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends deg> a(kd<MapCodec<? extends deg>> $$0) {
      kd.a($$0, "clamped", deg.a.c);
      kd.a($$0, "fraction", deg.c.c);
      kd.a($$0, "levels_squared", deg.d.c);
      kd.a($$0, "linear", deg.e.c);
      return kd.a($$0, "lookup", deg.f.c);
   }

   static deg.b a(float $$0) {
      return new deg.b($$0);
   }

   static deg.e a(float $$0, float $$1) {
      return new deg.e($$0, $$1);
   }

   static deg.e b(float $$0) {
      return a($$0, $$0);
   }

   static deg.f a(List<Float> $$0, deg $$1) {
      return new deg.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends deg> a();

   public static record a(deg d, float e, float f) implements deg {
      public static final MapCodec<deg.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     deg.b.fieldOf("value").forGetter(deg.a::b), Codec.FLOAT.fieldOf("min").forGetter(deg.a::c), Codec.FLOAT.fieldOf("max").forGetter(deg.a::d)
                  )
                  .apply($$0, deg.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return bae.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<deg.a> a() {
         return c;
      }

      public deg b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements deg {
      public static final Codec<deg.b> c = Codec.FLOAT.xmap(deg.b::new, deg.b::b);
      public static final MapCodec<deg.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(deg.b::b)).apply($$0, deg.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<deg.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(deg d, deg e) implements deg {
      public static final MapCodec<deg.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(deg.b.fieldOf("numerator").forGetter(deg.c::b), deg.b.fieldOf("denominator").forGetter(deg.c::c)).apply($$0, deg.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<deg.c> a() {
         return c;
      }

      public deg b() {
         return this.d;
      }

      public deg c() {
         return this.e;
      }
   }

   public static record d(float d) implements deg {
      public static final MapCodec<deg.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(deg.d::b)).apply($$0, deg.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)bae.h($$0) + this.d;
      }

      @Override
      public MapCodec<deg.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements deg {
      public static final MapCodec<deg.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(deg.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(deg.e::c))
               .apply($$0, deg.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<deg.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, deg e) implements deg {
      public static final MapCodec<deg.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(deg.f::b), deg.b.fieldOf("fallback").forGetter(deg.f::c)).apply($$0, deg.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<deg.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public deg c() {
         return this.e;
      }
   }
}
