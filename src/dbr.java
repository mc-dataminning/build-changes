import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dbr {
   Codec<dbr> a = lu.au.q().dispatch(dbr::a, $$0 -> $$0);
   Codec<dbr> b = Codec.either(dbr.b.c, a)
      .xmap($$0 -> (dbr)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dbr.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dbr> a(ka<MapCodec<? extends dbr>> $$0) {
      ka.a($$0, "clamped", dbr.a.c);
      ka.a($$0, "fraction", dbr.c.c);
      ka.a($$0, "levels_squared", dbr.d.c);
      ka.a($$0, "linear", dbr.e.c);
      return ka.a($$0, "lookup", dbr.f.c);
   }

   static dbr.b a(float $$0) {
      return new dbr.b($$0);
   }

   static dbr.e a(float $$0, float $$1) {
      return new dbr.e($$0, $$1);
   }

   static dbr.e b(float $$0) {
      return a($$0, $$0);
   }

   static dbr.f a(List<Float> $$0, dbr $$1) {
      return new dbr.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dbr> a();

   public static record a(dbr d, float e, float f) implements dbr {
      public static final MapCodec<dbr.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbr.b.fieldOf("value").forGetter(dbr.a::b), Codec.FLOAT.fieldOf("min").forGetter(dbr.a::c), Codec.FLOAT.fieldOf("max").forGetter(dbr.a::d)
                  )
                  .apply($$0, dbr.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azd.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dbr.a> a() {
         return c;
      }

      public dbr b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dbr {
      public static final Codec<dbr.b> c = Codec.FLOAT.xmap(dbr.b::new, dbr.b::b);
      public static final MapCodec<dbr.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dbr.b::b)).apply($$0, dbr.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dbr.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dbr d, dbr e) implements dbr {
      public static final MapCodec<dbr.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dbr.b.fieldOf("numerator").forGetter(dbr.c::b), dbr.b.fieldOf("denominator").forGetter(dbr.c::c)).apply($$0, dbr.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dbr.c> a() {
         return c;
      }

      public dbr b() {
         return this.d;
      }

      public dbr c() {
         return this.e;
      }
   }

   public static record d(float d) implements dbr {
      public static final MapCodec<dbr.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dbr.d::b)).apply($$0, dbr.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azd.h($$0) + this.d;
      }

      @Override
      public MapCodec<dbr.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dbr {
      public static final MapCodec<dbr.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dbr.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dbr.e::c))
               .apply($$0, dbr.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dbr.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dbr e) implements dbr {
      public static final MapCodec<dbr.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dbr.f::b), dbr.b.fieldOf("fallback").forGetter(dbr.f::c)).apply($$0, dbr.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dbr.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dbr c() {
         return this.e;
      }
   }
}
