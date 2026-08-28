import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dgu {
   Codec<dgu> a = mh.ar.q().dispatch(dgu::a, $$0 -> $$0);
   Codec<dgu> b = Codec.either(dgu.b.c, a)
      .xmap($$0 -> (dgu)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dgu.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dgu> a(jt<MapCodec<? extends dgu>> $$0) {
      jt.a($$0, "clamped", dgu.a.c);
      jt.a($$0, "fraction", dgu.c.c);
      jt.a($$0, "levels_squared", dgu.d.c);
      jt.a($$0, "linear", dgu.e.c);
      return jt.a($$0, "lookup", dgu.f.c);
   }

   static dgu.b a(float $$0) {
      return new dgu.b($$0);
   }

   static dgu.e a(float $$0, float $$1) {
      return new dgu.e($$0, $$1);
   }

   static dgu.e b(float $$0) {
      return a($$0, $$0);
   }

   static dgu.f a(List<Float> $$0, dgu $$1) {
      return new dgu.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dgu> a();

   public static record a(dgu d, float e, float f) implements dgu {
      public static final MapCodec<dgu.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgu.b.fieldOf("value").forGetter(dgu.a::b), Codec.FLOAT.fieldOf("min").forGetter(dgu.a::c), Codec.FLOAT.fieldOf("max").forGetter(dgu.a::d)
                  )
                  .apply($$0, dgu.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azq.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dgu.a> a() {
         return c;
      }

      public dgu b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dgu {
      public static final Codec<dgu.b> c = Codec.FLOAT.xmap(dgu.b::new, dgu.b::b);
      public static final MapCodec<dgu.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dgu.b::b)).apply($$0, dgu.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dgu.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dgu d, dgu e) implements dgu {
      public static final MapCodec<dgu.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgu.b.fieldOf("numerator").forGetter(dgu.c::b), dgu.b.fieldOf("denominator").forGetter(dgu.c::c)).apply($$0, dgu.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dgu.c> a() {
         return c;
      }

      public dgu b() {
         return this.d;
      }

      public dgu c() {
         return this.e;
      }
   }

   public static record d(float d) implements dgu {
      public static final MapCodec<dgu.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dgu.d::b)).apply($$0, dgu.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azq.h($$0) + this.d;
      }

      @Override
      public MapCodec<dgu.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dgu {
      public static final MapCodec<dgu.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dgu.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dgu.e::c))
               .apply($$0, dgu.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dgu.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dgu e) implements dgu {
      public static final MapCodec<dgu.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dgu.f::b), dgu.b.fieldOf("fallback").forGetter(dgu.f::c)).apply($$0, dgu.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dgu.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dgu c() {
         return this.e;
      }
   }
}
