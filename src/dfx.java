import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dfx {
   Codec<dfx> a = mf.ar.q().dispatch(dfx::a, $$0 -> $$0);
   Codec<dfx> b = Codec.either(dfx.b.c, a)
      .xmap($$0 -> (dfx)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dfx.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dfx> a(jr<MapCodec<? extends dfx>> $$0) {
      jr.a($$0, "clamped", dfx.a.c);
      jr.a($$0, "fraction", dfx.c.c);
      jr.a($$0, "levels_squared", dfx.d.c);
      jr.a($$0, "linear", dfx.e.c);
      return jr.a($$0, "lookup", dfx.f.c);
   }

   static dfx.b a(float $$0) {
      return new dfx.b($$0);
   }

   static dfx.e a(float $$0, float $$1) {
      return new dfx.e($$0, $$1);
   }

   static dfx.e b(float $$0) {
      return a($$0, $$0);
   }

   static dfx.f a(List<Float> $$0, dfx $$1) {
      return new dfx.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dfx> a();

   public static record a(dfx d, float e, float f) implements dfx {
      public static final MapCodec<dfx.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfx.b.fieldOf("value").forGetter(dfx.a::b), Codec.FLOAT.fieldOf("min").forGetter(dfx.a::c), Codec.FLOAT.fieldOf("max").forGetter(dfx.a::d)
                  )
                  .apply($$0, dfx.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azm.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dfx.a> a() {
         return c;
      }

      public dfx b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dfx {
      public static final Codec<dfx.b> c = Codec.FLOAT.xmap(dfx.b::new, dfx.b::b);
      public static final MapCodec<dfx.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dfx.b::b)).apply($$0, dfx.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dfx.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dfx d, dfx e) implements dfx {
      public static final MapCodec<dfx.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfx.b.fieldOf("numerator").forGetter(dfx.c::b), dfx.b.fieldOf("denominator").forGetter(dfx.c::c)).apply($$0, dfx.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dfx.c> a() {
         return c;
      }

      public dfx b() {
         return this.d;
      }

      public dfx c() {
         return this.e;
      }
   }

   public static record d(float d) implements dfx {
      public static final MapCodec<dfx.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dfx.d::b)).apply($$0, dfx.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azm.h($$0) + this.d;
      }

      @Override
      public MapCodec<dfx.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dfx {
      public static final MapCodec<dfx.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dfx.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dfx.e::c))
               .apply($$0, dfx.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dfx.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dfx e) implements dfx {
      public static final MapCodec<dfx.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dfx.f::b), dfx.b.fieldOf("fallback").forGetter(dfx.f::c)).apply($$0, dfx.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dfx.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dfx c() {
         return this.e;
      }
   }
}
