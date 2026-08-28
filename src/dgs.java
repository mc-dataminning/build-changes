import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dgs {
   Codec<dgs> a = mg.ar.q().dispatch(dgs::a, $$0 -> $$0);
   Codec<dgs> b = Codec.either(dgs.b.c, a)
      .xmap($$0 -> (dgs)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dgs.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dgs> a(js<MapCodec<? extends dgs>> $$0) {
      js.a($$0, "clamped", dgs.a.c);
      js.a($$0, "fraction", dgs.c.c);
      js.a($$0, "levels_squared", dgs.d.c);
      js.a($$0, "linear", dgs.e.c);
      return js.a($$0, "lookup", dgs.f.c);
   }

   static dgs.b a(float $$0) {
      return new dgs.b($$0);
   }

   static dgs.e a(float $$0, float $$1) {
      return new dgs.e($$0, $$1);
   }

   static dgs.e b(float $$0) {
      return a($$0, $$0);
   }

   static dgs.f a(List<Float> $$0, dgs $$1) {
      return new dgs.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dgs> a();

   public static record a(dgs d, float e, float f) implements dgs {
      public static final MapCodec<dgs.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgs.b.fieldOf("value").forGetter(dgs.a::b), Codec.FLOAT.fieldOf("min").forGetter(dgs.a::c), Codec.FLOAT.fieldOf("max").forGetter(dgs.a::d)
                  )
                  .apply($$0, dgs.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azo.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dgs.a> a() {
         return c;
      }

      public dgs b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dgs {
      public static final Codec<dgs.b> c = Codec.FLOAT.xmap(dgs.b::new, dgs.b::b);
      public static final MapCodec<dgs.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dgs.b::b)).apply($$0, dgs.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dgs.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dgs d, dgs e) implements dgs {
      public static final MapCodec<dgs.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgs.b.fieldOf("numerator").forGetter(dgs.c::b), dgs.b.fieldOf("denominator").forGetter(dgs.c::c)).apply($$0, dgs.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dgs.c> a() {
         return c;
      }

      public dgs b() {
         return this.d;
      }

      public dgs c() {
         return this.e;
      }
   }

   public static record d(float d) implements dgs {
      public static final MapCodec<dgs.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dgs.d::b)).apply($$0, dgs.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azo.h($$0) + this.d;
      }

      @Override
      public MapCodec<dgs.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dgs {
      public static final MapCodec<dgs.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dgs.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dgs.e::c))
               .apply($$0, dgs.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dgs.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dgs e) implements dgs {
      public static final MapCodec<dgs.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dgs.f::b), dgs.b.fieldOf("fallback").forGetter(dgs.f::c)).apply($$0, dgs.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dgs.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dgs c() {
         return this.e;
      }
   }
}
