import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface ddy {
   Codec<ddy> a = ma.at.q().dispatch(ddy::a, $$0 -> $$0);
   Codec<ddy> b = Codec.either(ddy.b.c, a)
      .xmap($$0 -> (ddy)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof ddy.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends ddy> a(kd<MapCodec<? extends ddy>> $$0) {
      kd.a($$0, "clamped", ddy.a.c);
      kd.a($$0, "fraction", ddy.c.c);
      kd.a($$0, "levels_squared", ddy.d.c);
      kd.a($$0, "linear", ddy.e.c);
      return kd.a($$0, "lookup", ddy.f.c);
   }

   static ddy.b a(float $$0) {
      return new ddy.b($$0);
   }

   static ddy.e a(float $$0, float $$1) {
      return new ddy.e($$0, $$1);
   }

   static ddy.e b(float $$0) {
      return a($$0, $$0);
   }

   static ddy.f a(List<Float> $$0, ddy $$1) {
      return new ddy.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends ddy> a();

   public static record a(ddy d, float e, float f) implements ddy {
      public static final MapCodec<ddy.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddy.b.fieldOf("value").forGetter(ddy.a::b), Codec.FLOAT.fieldOf("min").forGetter(ddy.a::c), Codec.FLOAT.fieldOf("max").forGetter(ddy.a::d)
                  )
                  .apply($$0, ddy.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return bae.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<ddy.a> a() {
         return c;
      }

      public ddy b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements ddy {
      public static final Codec<ddy.b> c = Codec.FLOAT.xmap(ddy.b::new, ddy.b::b);
      public static final MapCodec<ddy.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(ddy.b::b)).apply($$0, ddy.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<ddy.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(ddy d, ddy e) implements ddy {
      public static final MapCodec<ddy.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddy.b.fieldOf("numerator").forGetter(ddy.c::b), ddy.b.fieldOf("denominator").forGetter(ddy.c::c)).apply($$0, ddy.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<ddy.c> a() {
         return c;
      }

      public ddy b() {
         return this.d;
      }

      public ddy c() {
         return this.e;
      }
   }

   public static record d(float d) implements ddy {
      public static final MapCodec<ddy.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(ddy.d::b)).apply($$0, ddy.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)bae.h($$0) + this.d;
      }

      @Override
      public MapCodec<ddy.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements ddy {
      public static final MapCodec<ddy.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(ddy.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(ddy.e::c))
               .apply($$0, ddy.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<ddy.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, ddy e) implements ddy {
      public static final MapCodec<ddy.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(ddy.f::b), ddy.b.fieldOf("fallback").forGetter(ddy.f::c)).apply($$0, ddy.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<ddy.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public ddy c() {
         return this.e;
      }
   }
}
