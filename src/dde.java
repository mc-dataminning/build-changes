import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dde {
   Codec<dde> a = mb.at.q().dispatch(dde::a, $$0 -> $$0);
   Codec<dde> b = Codec.either(dde.b.c, a)
      .xmap($$0 -> (dde)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dde.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dde> a(ke<MapCodec<? extends dde>> $$0) {
      ke.a($$0, "clamped", dde.a.c);
      ke.a($$0, "fraction", dde.c.c);
      ke.a($$0, "levels_squared", dde.d.c);
      ke.a($$0, "linear", dde.e.c);
      return ke.a($$0, "lookup", dde.f.c);
   }

   static dde.b a(float $$0) {
      return new dde.b($$0);
   }

   static dde.e a(float $$0, float $$1) {
      return new dde.e($$0, $$1);
   }

   static dde.e b(float $$0) {
      return a($$0, $$0);
   }

   static dde.f a(List<Float> $$0, dde $$1) {
      return new dde.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dde> a();

   public static record a(dde d, float e, float f) implements dde {
      public static final MapCodec<dde.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dde.b.fieldOf("value").forGetter(dde.a::b), Codec.FLOAT.fieldOf("min").forGetter(dde.a::c), Codec.FLOAT.fieldOf("max").forGetter(dde.a::d)
                  )
                  .apply($$0, dde.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayy.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dde.a> a() {
         return c;
      }

      public dde b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dde {
      public static final Codec<dde.b> c = Codec.FLOAT.xmap(dde.b::new, dde.b::b);
      public static final MapCodec<dde.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dde.b::b)).apply($$0, dde.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dde.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dde d, dde e) implements dde {
      public static final MapCodec<dde.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dde.b.fieldOf("numerator").forGetter(dde.c::b), dde.b.fieldOf("denominator").forGetter(dde.c::c)).apply($$0, dde.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dde.c> a() {
         return c;
      }

      public dde b() {
         return this.d;
      }

      public dde c() {
         return this.e;
      }
   }

   public static record d(float d) implements dde {
      public static final MapCodec<dde.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dde.d::b)).apply($$0, dde.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayy.h($$0) + this.d;
      }

      @Override
      public MapCodec<dde.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dde {
      public static final MapCodec<dde.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dde.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dde.e::c))
               .apply($$0, dde.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dde.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dde e) implements dde {
      public static final MapCodec<dde.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dde.f::b), dde.b.fieldOf("fallback").forGetter(dde.f::c)).apply($$0, dde.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dde.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dde c() {
         return this.e;
      }
   }
}
