import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface czq {
   Codec<czq> a = lq.av.r().dispatch(czq::a, $$0 -> $$0);
   Codec<czq> b = Codec.either(czq.b.c, a)
      .xmap($$0 -> (czq)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof czq.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends czq> a(jw<MapCodec<? extends czq>> $$0) {
      jw.a($$0, "clamped", czq.a.c);
      jw.a($$0, "fraction", czq.c.c);
      jw.a($$0, "levels_squared", czq.d.c);
      return jw.a($$0, "linear", czq.e.c);
   }

   static czq.b a(float $$0) {
      return new czq.b($$0);
   }

   static czq.e a(float $$0, float $$1) {
      return new czq.e($$0, $$1);
   }

   static czq.e b(float $$0) {
      return a($$0, $$0);
   }

   float a(int var1);

   MapCodec<? extends czq> a();

   public static record a(czq d, float e, float f) implements czq {
      public static final MapCodec<czq.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     czq.b.fieldOf("value").forGetter(czq.a::b), Codec.FLOAT.fieldOf("min").forGetter(czq.a::c), Codec.FLOAT.fieldOf("max").forGetter(czq.a::d)
                  )
                  .apply($$0, czq.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return aye.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<czq.a> a() {
         return c;
      }

      public czq b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements czq {
      public static final Codec<czq.b> c = Codec.FLOAT.xmap(czq.b::new, czq.b::b);
      public static final MapCodec<czq.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(czq.b::b)).apply($$0, czq.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<czq.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(czq d, czq e) implements czq {
      public static final MapCodec<czq.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(czq.b.fieldOf("numerator").forGetter(czq.c::b), czq.b.fieldOf("denominator").forGetter(czq.c::c)).apply($$0, czq.c::new)
      );

      @Override
      public float a(int $$0) {
         return this.d.a($$0) / this.e.a($$0);
      }

      @Override
      public MapCodec<czq.c> a() {
         return c;
      }

      public czq b() {
         return this.d;
      }

      public czq c() {
         return this.e;
      }
   }

   public static record d(float d) implements czq {
      public static final MapCodec<czq.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(czq.d::b)).apply($$0, czq.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)aye.h($$0) + this.d;
      }

      @Override
      public MapCodec<czq.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements czq {
      public static final MapCodec<czq.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(czq.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(czq.e::c))
               .apply($$0, czq.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<czq.e> a() {
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
