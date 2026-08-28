import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dcd {
   Codec<dcd> a = lz.at.q().dispatch(dcd::a, $$0 -> $$0);
   Codec<dcd> b = Codec.either(dcd.b.c, a)
      .xmap($$0 -> (dcd)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dcd.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dcd> a(kd<MapCodec<? extends dcd>> $$0) {
      kd.a($$0, "clamped", dcd.a.c);
      kd.a($$0, "fraction", dcd.c.c);
      kd.a($$0, "levels_squared", dcd.d.c);
      kd.a($$0, "linear", dcd.e.c);
      return kd.a($$0, "lookup", dcd.f.c);
   }

   static dcd.b a(float $$0) {
      return new dcd.b($$0);
   }

   static dcd.e a(float $$0, float $$1) {
      return new dcd.e($$0, $$1);
   }

   static dcd.e b(float $$0) {
      return a($$0, $$0);
   }

   static dcd.f a(List<Float> $$0, dcd $$1) {
      return new dcd.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dcd> a();

   public static record a(dcd d, float e, float f) implements dcd {
      public static final MapCodec<dcd.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dcd.b.fieldOf("value").forGetter(dcd.a::b), Codec.FLOAT.fieldOf("min").forGetter(dcd.a::c), Codec.FLOAT.fieldOf("max").forGetter(dcd.a::d)
                  )
                  .apply($$0, dcd.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azn.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dcd.a> a() {
         return c;
      }

      public dcd b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dcd {
      public static final Codec<dcd.b> c = Codec.FLOAT.xmap(dcd.b::new, dcd.b::b);
      public static final MapCodec<dcd.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dcd.b::b)).apply($$0, dcd.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dcd.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dcd d, dcd e) implements dcd {
      public static final MapCodec<dcd.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcd.b.fieldOf("numerator").forGetter(dcd.c::b), dcd.b.fieldOf("denominator").forGetter(dcd.c::c)).apply($$0, dcd.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dcd.c> a() {
         return c;
      }

      public dcd b() {
         return this.d;
      }

      public dcd c() {
         return this.e;
      }
   }

   public static record d(float d) implements dcd {
      public static final MapCodec<dcd.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dcd.d::b)).apply($$0, dcd.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azn.h($$0) + this.d;
      }

      @Override
      public MapCodec<dcd.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dcd {
      public static final MapCodec<dcd.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dcd.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dcd.e::c))
               .apply($$0, dcd.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dcd.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dcd e) implements dcd {
      public static final MapCodec<dcd.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dcd.f::b), dcd.b.fieldOf("fallback").forGetter(dcd.f::c)).apply($$0, dcd.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dcd.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dcd c() {
         return this.e;
      }
   }
}
