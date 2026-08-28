import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dbz {
   Codec<dbz> a = ly.at.q().dispatch(dbz::a, $$0 -> $$0);
   Codec<dbz> b = Codec.either(dbz.b.c, a)
      .xmap($$0 -> (dbz)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dbz.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dbz> a(kd<MapCodec<? extends dbz>> $$0) {
      kd.a($$0, "clamped", dbz.a.c);
      kd.a($$0, "fraction", dbz.c.c);
      kd.a($$0, "levels_squared", dbz.d.c);
      kd.a($$0, "linear", dbz.e.c);
      return kd.a($$0, "lookup", dbz.f.c);
   }

   static dbz.b a(float $$0) {
      return new dbz.b($$0);
   }

   static dbz.e a(float $$0, float $$1) {
      return new dbz.e($$0, $$1);
   }

   static dbz.e b(float $$0) {
      return a($$0, $$0);
   }

   static dbz.f a(List<Float> $$0, dbz $$1) {
      return new dbz.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dbz> a();

   public static record a(dbz d, float e, float f) implements dbz {
      public static final MapCodec<dbz.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbz.b.fieldOf("value").forGetter(dbz.a::b), Codec.FLOAT.fieldOf("min").forGetter(dbz.a::c), Codec.FLOAT.fieldOf("max").forGetter(dbz.a::d)
                  )
                  .apply($$0, dbz.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azk.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dbz.a> a() {
         return c;
      }

      public dbz b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dbz {
      public static final Codec<dbz.b> c = Codec.FLOAT.xmap(dbz.b::new, dbz.b::b);
      public static final MapCodec<dbz.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dbz.b::b)).apply($$0, dbz.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dbz.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dbz d, dbz e) implements dbz {
      public static final MapCodec<dbz.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dbz.b.fieldOf("numerator").forGetter(dbz.c::b), dbz.b.fieldOf("denominator").forGetter(dbz.c::c)).apply($$0, dbz.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dbz.c> a() {
         return c;
      }

      public dbz b() {
         return this.d;
      }

      public dbz c() {
         return this.e;
      }
   }

   public static record d(float d) implements dbz {
      public static final MapCodec<dbz.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dbz.d::b)).apply($$0, dbz.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azk.h($$0) + this.d;
      }

      @Override
      public MapCodec<dbz.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dbz {
      public static final MapCodec<dbz.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dbz.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dbz.e::c))
               .apply($$0, dbz.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dbz.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dbz e) implements dbz {
      public static final MapCodec<dbz.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dbz.f::b), dbz.b.fieldOf("fallback").forGetter(dbz.f::c)).apply($$0, dbz.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dbz.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dbz c() {
         return this.e;
      }
   }
}
