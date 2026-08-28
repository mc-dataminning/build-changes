import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dbd {
   Codec<dbd> a = lu.au.q().dispatch(dbd::a, $$0 -> $$0);
   Codec<dbd> b = Codec.either(dbd.b.c, a)
      .xmap($$0 -> (dbd)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dbd.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dbd> a(ka<MapCodec<? extends dbd>> $$0) {
      ka.a($$0, "clamped", dbd.a.c);
      ka.a($$0, "fraction", dbd.c.c);
      ka.a($$0, "levels_squared", dbd.d.c);
      ka.a($$0, "linear", dbd.e.c);
      return ka.a($$0, "lookup", dbd.f.c);
   }

   static dbd.b a(float $$0) {
      return new dbd.b($$0);
   }

   static dbd.e a(float $$0, float $$1) {
      return new dbd.e($$0, $$1);
   }

   static dbd.e b(float $$0) {
      return a($$0, $$0);
   }

   static dbd.f a(List<Float> $$0, dbd $$1) {
      return new dbd.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dbd> a();

   public static record a(dbd d, float e, float f) implements dbd {
      public static final MapCodec<dbd.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbd.b.fieldOf("value").forGetter(dbd.a::b), Codec.FLOAT.fieldOf("min").forGetter(dbd.a::c), Codec.FLOAT.fieldOf("max").forGetter(dbd.a::d)
                  )
                  .apply($$0, dbd.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azc.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dbd.a> a() {
         return c;
      }

      public dbd b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dbd {
      public static final Codec<dbd.b> c = Codec.FLOAT.xmap(dbd.b::new, dbd.b::b);
      public static final MapCodec<dbd.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dbd.b::b)).apply($$0, dbd.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dbd.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dbd d, dbd e) implements dbd {
      public static final MapCodec<dbd.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dbd.b.fieldOf("numerator").forGetter(dbd.c::b), dbd.b.fieldOf("denominator").forGetter(dbd.c::c)).apply($$0, dbd.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dbd.c> a() {
         return c;
      }

      public dbd b() {
         return this.d;
      }

      public dbd c() {
         return this.e;
      }
   }

   public static record d(float d) implements dbd {
      public static final MapCodec<dbd.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dbd.d::b)).apply($$0, dbd.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azc.h($$0) + this.d;
      }

      @Override
      public MapCodec<dbd.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dbd {
      public static final MapCodec<dbd.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dbd.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dbd.e::c))
               .apply($$0, dbd.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dbd.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dbd e) implements dbd {
      public static final MapCodec<dbd.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dbd.f::b), dbd.b.fieldOf("fallback").forGetter(dbd.f::c)).apply($$0, dbd.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dbd.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dbd c() {
         return this.e;
      }
   }
}
