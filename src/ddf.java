import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface ddf {
   Codec<ddf> a = mb.at.q().dispatch(ddf::a, $$0 -> $$0);
   Codec<ddf> b = Codec.either(ddf.b.c, a)
      .xmap($$0 -> (ddf)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof ddf.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends ddf> a(ke<MapCodec<? extends ddf>> $$0) {
      ke.a($$0, "clamped", ddf.a.c);
      ke.a($$0, "fraction", ddf.c.c);
      ke.a($$0, "levels_squared", ddf.d.c);
      ke.a($$0, "linear", ddf.e.c);
      return ke.a($$0, "lookup", ddf.f.c);
   }

   static ddf.b a(float $$0) {
      return new ddf.b($$0);
   }

   static ddf.e a(float $$0, float $$1) {
      return new ddf.e($$0, $$1);
   }

   static ddf.e b(float $$0) {
      return a($$0, $$0);
   }

   static ddf.f a(List<Float> $$0, ddf $$1) {
      return new ddf.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends ddf> a();

   public static record a(ddf d, float e, float f) implements ddf {
      public static final MapCodec<ddf.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddf.b.fieldOf("value").forGetter(ddf.a::b), Codec.FLOAT.fieldOf("min").forGetter(ddf.a::c), Codec.FLOAT.fieldOf("max").forGetter(ddf.a::d)
                  )
                  .apply($$0, ddf.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayz.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<ddf.a> a() {
         return c;
      }

      public ddf b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements ddf {
      public static final Codec<ddf.b> c = Codec.FLOAT.xmap(ddf.b::new, ddf.b::b);
      public static final MapCodec<ddf.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ddf.b::b)).apply($$0, ddf.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<ddf.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(ddf d, ddf e) implements ddf {
      public static final MapCodec<ddf.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddf.b.fieldOf("numerator").forGetter(ddf.c::b), ddf.b.fieldOf("denominator").forGetter(ddf.c::c)).apply($$0, ddf.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<ddf.c> a() {
         return c;
      }

      public ddf b() {
         return this.d;
      }

      public ddf c() {
         return this.e;
      }
   }

   public static record d(float d) implements ddf {
      public static final MapCodec<ddf.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(ddf.d::b)).apply($$0, ddf.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayz.h($$0) + this.d;
      }

      @Override
      public MapCodec<ddf.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements ddf {
      public static final MapCodec<ddf.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(ddf.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(ddf.e::c))
               .apply($$0, ddf.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<ddf.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, ddf e) implements ddf {
      public static final MapCodec<ddf.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(ddf.f::b), ddf.b.fieldOf("fallback").forGetter(ddf.f::c)).apply($$0, ddf.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<ddf.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public ddf c() {
         return this.e;
      }
   }
}
