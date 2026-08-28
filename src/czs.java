import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface czs {
   Codec<czs> a = lq.av.r().dispatch(czs::a, $$0 -> $$0);
   Codec<czs> b = Codec.either(czs.b.c, a)
      .xmap($$0 -> (czs)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof czs.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends czs> a(jw<MapCodec<? extends czs>> $$0) {
      jw.a($$0, "clamped", czs.a.c);
      jw.a($$0, "fraction", czs.c.c);
      jw.a($$0, "levels_squared", czs.d.c);
      return jw.a($$0, "linear", czs.e.c);
   }

   static czs.b a(float $$0) {
      return new czs.b($$0);
   }

   static czs.e a(float $$0, float $$1) {
      return new czs.e($$0, $$1);
   }

   static czs.e b(float $$0) {
      return a($$0, $$0);
   }

   float a(int var1);

   MapCodec<? extends czs> a();

   public static record a(czs d, float e, float f) implements czs {
      public static final MapCodec<czs.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     czs.b.fieldOf("value").forGetter(czs.a::b), Codec.FLOAT.fieldOf("min").forGetter(czs.a::c), Codec.FLOAT.fieldOf("max").forGetter(czs.a::d)
                  )
                  .apply($$0, czs.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayg.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<czs.a> a() {
         return c;
      }

      public czs b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements czs {
      public static final Codec<czs.b> c = Codec.FLOAT.xmap(czs.b::new, czs.b::b);
      public static final MapCodec<czs.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(czs.b::b)).apply($$0, czs.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<czs.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(czs d, czs e) implements czs {
      public static final MapCodec<czs.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(czs.b.fieldOf("numerator").forGetter(czs.c::b), czs.b.fieldOf("denominator").forGetter(czs.c::c)).apply($$0, czs.c::new)
      );

      @Override
      public float a(int $$0) {
         return this.d.a($$0) / this.e.a($$0);
      }

      @Override
      public MapCodec<czs.c> a() {
         return c;
      }

      public czs b() {
         return this.d;
      }

      public czs c() {
         return this.e;
      }
   }

   public static record d(float d) implements czs {
      public static final MapCodec<czs.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(czs.d::b)).apply($$0, czs.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayg.h($$0) + this.d;
      }

      @Override
      public MapCodec<czs.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements czs {
      public static final MapCodec<czs.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(czs.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(czs.e::c))
               .apply($$0, czs.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<czs.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }
}
