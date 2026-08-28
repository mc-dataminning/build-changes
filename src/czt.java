import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface czt {
   Codec<czt> a = lq.av.r().dispatch(czt::a, $$0 -> $$0);
   Codec<czt> b = Codec.either(czt.b.c, a)
      .xmap($$0 -> (czt)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof czt.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends czt> a(jw<MapCodec<? extends czt>> $$0) {
      jw.a($$0, "clamped", czt.a.c);
      jw.a($$0, "fraction", czt.c.c);
      jw.a($$0, "levels_squared", czt.d.c);
      return jw.a($$0, "linear", czt.e.c);
   }

   static czt.b a(float $$0) {
      return new czt.b($$0);
   }

   static czt.e a(float $$0, float $$1) {
      return new czt.e($$0, $$1);
   }

   static czt.e b(float $$0) {
      return a($$0, $$0);
   }

   float a(int var1);

   MapCodec<? extends czt> a();

   public static record a(czt d, float e, float f) implements czt {
      public static final MapCodec<czt.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     czt.b.fieldOf("value").forGetter(czt.a::b), Codec.FLOAT.fieldOf("min").forGetter(czt.a::c), Codec.FLOAT.fieldOf("max").forGetter(czt.a::d)
                  )
                  .apply($$0, czt.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return ayg.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<czt.a> a() {
         return c;
      }

      public czt b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements czt {
      public static final Codec<czt.b> c = Codec.FLOAT.xmap(czt.b::new, czt.b::b);
      public static final MapCodec<czt.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(czt.b::b)).apply($$0, czt.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<czt.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(czt d, czt e) implements czt {
      public static final MapCodec<czt.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(czt.b.fieldOf("numerator").forGetter(czt.c::b), czt.b.fieldOf("denominator").forGetter(czt.c::c)).apply($$0, czt.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<czt.c> a() {
         return c;
      }

      public czt b() {
         return this.d;
      }

      public czt c() {
         return this.e;
      }
   }

   public static record d(float d) implements czt {
      public static final MapCodec<czt.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(czt.d::b)).apply($$0, czt.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)ayg.h($$0) + this.d;
      }

      @Override
      public MapCodec<czt.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements czt {
      public static final MapCodec<czt.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(czt.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(czt.e::c))
               .apply($$0, czt.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<czt.e> a() {
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
