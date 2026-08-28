import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface daj {
   Codec<daj> a = lt.av.r().dispatch(daj::a, $$0 -> $$0);
   Codec<daj> b = Codec.either(daj.b.c, a)
      .xmap($$0 -> (daj)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof daj.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends daj> a(jz<MapCodec<? extends daj>> $$0) {
      jz.a($$0, "clamped", daj.a.c);
      jz.a($$0, "fraction", daj.c.c);
      jz.a($$0, "levels_squared", daj.d.c);
      jz.a($$0, "linear", daj.e.c);
      return jz.a($$0, "lookup", daj.f.c);
   }

   static daj.b a(float $$0) {
      return new daj.b($$0);
   }

   static daj.e a(float $$0, float $$1) {
      return new daj.e($$0, $$1);
   }

   static daj.e b(float $$0) {
      return a($$0, $$0);
   }

   static daj.f a(List<Float> $$0, daj $$1) {
      return new daj.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends daj> a();

   public static record a(daj d, float e, float f) implements daj {
      public static final MapCodec<daj.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     daj.b.fieldOf("value").forGetter(daj.a::b), Codec.FLOAT.fieldOf("min").forGetter(daj.a::c), Codec.FLOAT.fieldOf("max").forGetter(daj.a::d)
                  )
                  .apply($$0, daj.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayo.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<daj.a> a() {
         return c;
      }

      public daj b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements daj {
      public static final Codec<daj.b> c = Codec.FLOAT.xmap(daj.b::new, daj.b::b);
      public static final MapCodec<daj.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(daj.b::b)).apply($$0, daj.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<daj.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(daj d, daj e) implements daj {
      public static final MapCodec<daj.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(daj.b.fieldOf("numerator").forGetter(daj.c::b), daj.b.fieldOf("denominator").forGetter(daj.c::c)).apply($$0, daj.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<daj.c> a() {
         return c;
      }

      public daj b() {
         return this.d;
      }

      public daj c() {
         return this.e;
      }
   }

   public static record d(float d) implements daj {
      public static final MapCodec<daj.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(daj.d::b)).apply($$0, daj.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayo.h($$0) + this.d;
      }

      @Override
      public MapCodec<daj.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements daj {
      public static final MapCodec<daj.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(daj.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(daj.e::c))
               .apply($$0, daj.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<daj.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, daj e) implements daj {
      public static final MapCodec<daj.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(daj.f::b), daj.b.fieldOf("fallback").forGetter(daj.f::c)).apply($$0, daj.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<daj.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public daj c() {
         return this.e;
      }
   }
}
