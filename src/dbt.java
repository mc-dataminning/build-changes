import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dbt {
   Codec<dbt> a = lx.at.q().dispatch(dbt::a, $$0 -> $$0);
   Codec<dbt> b = Codec.either(dbt.b.c, a)
      .xmap($$0 -> (dbt)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dbt.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dbt> a(kc<MapCodec<? extends dbt>> $$0) {
      kc.a($$0, "clamped", dbt.a.c);
      kc.a($$0, "fraction", dbt.c.c);
      kc.a($$0, "levels_squared", dbt.d.c);
      kc.a($$0, "linear", dbt.e.c);
      return kc.a($$0, "lookup", dbt.f.c);
   }

   static dbt.b a(float $$0) {
      return new dbt.b($$0);
   }

   static dbt.e a(float $$0, float $$1) {
      return new dbt.e($$0, $$1);
   }

   static dbt.e b(float $$0) {
      return a($$0, $$0);
   }

   static dbt.f a(List<Float> $$0, dbt $$1) {
      return new dbt.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dbt> a();

   public static record a(dbt d, float e, float f) implements dbt {
      public static final MapCodec<dbt.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbt.b.fieldOf("value").forGetter(dbt.a::b), Codec.FLOAT.fieldOf("min").forGetter(dbt.a::c), Codec.FLOAT.fieldOf("max").forGetter(dbt.a::d)
                  )
                  .apply($$0, dbt.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azj.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dbt.a> a() {
         return c;
      }

      public dbt b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dbt {
      public static final Codec<dbt.b> c = Codec.FLOAT.xmap(dbt.b::new, dbt.b::b);
      public static final MapCodec<dbt.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dbt.b::b)).apply($$0, dbt.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dbt.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dbt d, dbt e) implements dbt {
      public static final MapCodec<dbt.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dbt.b.fieldOf("numerator").forGetter(dbt.c::b), dbt.b.fieldOf("denominator").forGetter(dbt.c::c)).apply($$0, dbt.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dbt.c> a() {
         return c;
      }

      public dbt b() {
         return this.d;
      }

      public dbt c() {
         return this.e;
      }
   }

   public static record d(float d) implements dbt {
      public static final MapCodec<dbt.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dbt.d::b)).apply($$0, dbt.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azj.h($$0) + this.d;
      }

      @Override
      public MapCodec<dbt.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dbt {
      public static final MapCodec<dbt.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dbt.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dbt.e::c))
               .apply($$0, dbt.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dbt.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dbt e) implements dbt {
      public static final MapCodec<dbt.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dbt.f::b), dbt.b.fieldOf("fallback").forGetter(dbt.f::c)).apply($$0, dbt.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dbt.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dbt c() {
         return this.e;
      }
   }
}
