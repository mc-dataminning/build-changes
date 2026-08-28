import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dfm {
   Codec<dfm> a = mf.ar.q().dispatch(dfm::a, $$0 -> $$0);
   Codec<dfm> b = Codec.either(dfm.b.c, a)
      .xmap($$0 -> (dfm)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dfm.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dfm> a(jr<MapCodec<? extends dfm>> $$0) {
      jr.a($$0, "clamped", dfm.a.c);
      jr.a($$0, "fraction", dfm.c.c);
      jr.a($$0, "levels_squared", dfm.d.c);
      jr.a($$0, "linear", dfm.e.c);
      return jr.a($$0, "lookup", dfm.f.c);
   }

   static dfm.b a(float $$0) {
      return new dfm.b($$0);
   }

   static dfm.e a(float $$0, float $$1) {
      return new dfm.e($$0, $$1);
   }

   static dfm.e b(float $$0) {
      return a($$0, $$0);
   }

   static dfm.f a(List<Float> $$0, dfm $$1) {
      return new dfm.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dfm> a();

   public static record a(dfm d, float e, float f) implements dfm {
      public static final MapCodec<dfm.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfm.b.fieldOf("value").forGetter(dfm.a::b), Codec.FLOAT.fieldOf("min").forGetter(dfm.a::c), Codec.FLOAT.fieldOf("max").forGetter(dfm.a::d)
                  )
                  .apply($$0, dfm.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azk.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dfm.a> a() {
         return c;
      }

      public dfm b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dfm {
      public static final Codec<dfm.b> c = Codec.FLOAT.xmap(dfm.b::new, dfm.b::b);
      public static final MapCodec<dfm.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dfm.b::b)).apply($$0, dfm.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dfm.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dfm d, dfm e) implements dfm {
      public static final MapCodec<dfm.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfm.b.fieldOf("numerator").forGetter(dfm.c::b), dfm.b.fieldOf("denominator").forGetter(dfm.c::c)).apply($$0, dfm.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dfm.c> a() {
         return c;
      }

      public dfm b() {
         return this.d;
      }

      public dfm c() {
         return this.e;
      }
   }

   public static record d(float d) implements dfm {
      public static final MapCodec<dfm.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dfm.d::b)).apply($$0, dfm.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azk.h($$0) + this.d;
      }

      @Override
      public MapCodec<dfm.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dfm {
      public static final MapCodec<dfm.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dfm.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dfm.e::c))
               .apply($$0, dfm.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dfm.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dfm e) implements dfm {
      public static final MapCodec<dfm.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dfm.f::b), dfm.b.fieldOf("fallback").forGetter(dfm.f::c)).apply($$0, dfm.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dfm.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dfm c() {
         return this.e;
      }
   }
}
