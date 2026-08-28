import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dhe {
   Codec<dhe> a = mh.ar.q().dispatch(dhe::a, $$0 -> $$0);
   Codec<dhe> b = Codec.either(dhe.b.c, a)
      .xmap($$0 -> (dhe)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dhe.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dhe> a(jt<MapCodec<? extends dhe>> $$0) {
      jt.a($$0, "clamped", dhe.a.c);
      jt.a($$0, "fraction", dhe.c.c);
      jt.a($$0, "levels_squared", dhe.d.c);
      jt.a($$0, "linear", dhe.e.c);
      return jt.a($$0, "lookup", dhe.f.c);
   }

   static dhe.b a(float $$0) {
      return new dhe.b($$0);
   }

   static dhe.e a(float $$0, float $$1) {
      return new dhe.e($$0, $$1);
   }

   static dhe.e b(float $$0) {
      return a($$0, $$0);
   }

   static dhe.f a(List<Float> $$0, dhe $$1) {
      return new dhe.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dhe> a();

   public static record a(dhe d, float e, float f) implements dhe {
      public static final MapCodec<dhe.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dhe.b.fieldOf("value").forGetter(dhe.a::b), Codec.FLOAT.fieldOf("min").forGetter(dhe.a::c), Codec.FLOAT.fieldOf("max").forGetter(dhe.a::d)
                  )
                  .apply($$0, dhe.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azz.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dhe.a> a() {
         return c;
      }

      public dhe b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dhe {
      public static final Codec<dhe.b> c = Codec.FLOAT.xmap(dhe.b::new, dhe.b::b);
      public static final MapCodec<dhe.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dhe.b::b)).apply($$0, dhe.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dhe.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dhe d, dhe e) implements dhe {
      public static final MapCodec<dhe.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dhe.b.fieldOf("numerator").forGetter(dhe.c::b), dhe.b.fieldOf("denominator").forGetter(dhe.c::c)).apply($$0, dhe.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dhe.c> a() {
         return c;
      }

      public dhe b() {
         return this.d;
      }

      public dhe c() {
         return this.e;
      }
   }

   public static record d(float d) implements dhe {
      public static final MapCodec<dhe.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dhe.d::b)).apply($$0, dhe.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azz.h($$0) + this.d;
      }

      @Override
      public MapCodec<dhe.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dhe {
      public static final MapCodec<dhe.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dhe.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dhe.e::c))
               .apply($$0, dhe.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dhe.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dhe e) implements dhe {
      public static final MapCodec<dhe.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dhe.f::b), dhe.b.fieldOf("fallback").forGetter(dhe.f::c)).apply($$0, dhe.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dhe.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dhe c() {
         return this.e;
      }
   }
}
