import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface deo {
   Codec<deo> a = md.at.q().dispatch(deo::a, $$0 -> $$0);
   Codec<deo> b = Codec.either(deo.b.c, a)
      .xmap($$0 -> (deo)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof deo.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends deo> a(kf<MapCodec<? extends deo>> $$0) {
      kf.a($$0, "clamped", deo.a.c);
      kf.a($$0, "fraction", deo.c.c);
      kf.a($$0, "levels_squared", deo.d.c);
      kf.a($$0, "linear", deo.e.c);
      return kf.a($$0, "lookup", deo.f.c);
   }

   static deo.b a(float $$0) {
      return new deo.b($$0);
   }

   static deo.e a(float $$0, float $$1) {
      return new deo.e($$0, $$1);
   }

   static deo.e b(float $$0) {
      return a($$0, $$0);
   }

   static deo.f a(List<Float> $$0, deo $$1) {
      return new deo.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends deo> a();

   public static record a(deo d, float e, float f) implements deo {
      public static final MapCodec<deo.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     deo.b.fieldOf("value").forGetter(deo.a::b), Codec.FLOAT.fieldOf("min").forGetter(deo.a::c), Codec.FLOAT.fieldOf("max").forGetter(deo.a::d)
                  )
                  .apply($$0, deo.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azk.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<deo.a> a() {
         return c;
      }

      public deo b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements deo {
      public static final Codec<deo.b> c = Codec.FLOAT.xmap(deo.b::new, deo.b::b);
      public static final MapCodec<deo.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(deo.b::b)).apply($$0, deo.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<deo.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(deo d, deo e) implements deo {
      public static final MapCodec<deo.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(deo.b.fieldOf("numerator").forGetter(deo.c::b), deo.b.fieldOf("denominator").forGetter(deo.c::c)).apply($$0, deo.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<deo.c> a() {
         return c;
      }

      public deo b() {
         return this.d;
      }

      public deo c() {
         return this.e;
      }
   }

   public static record d(float d) implements deo {
      public static final MapCodec<deo.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(deo.d::b)).apply($$0, deo.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azk.h($$0) + this.d;
      }

      @Override
      public MapCodec<deo.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements deo {
      public static final MapCodec<deo.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(deo.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(deo.e::c))
               .apply($$0, deo.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<deo.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, deo e) implements deo {
      public static final MapCodec<deo.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(deo.f::b), deo.b.fieldOf("fallback").forGetter(deo.f::c)).apply($$0, deo.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<deo.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public deo c() {
         return this.e;
      }
   }
}
