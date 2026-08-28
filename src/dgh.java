import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dgh {
   Codec<dgh> a = mg.ar.q().dispatch(dgh::a, $$0 -> $$0);
   Codec<dgh> b = Codec.either(dgh.b.c, a)
      .xmap($$0 -> (dgh)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dgh.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dgh> a(js<MapCodec<? extends dgh>> $$0) {
      js.a($$0, "clamped", dgh.a.c);
      js.a($$0, "fraction", dgh.c.c);
      js.a($$0, "levels_squared", dgh.d.c);
      js.a($$0, "linear", dgh.e.c);
      return js.a($$0, "lookup", dgh.f.c);
   }

   static dgh.b a(float $$0) {
      return new dgh.b($$0);
   }

   static dgh.e a(float $$0, float $$1) {
      return new dgh.e($$0, $$1);
   }

   static dgh.e b(float $$0) {
      return a($$0, $$0);
   }

   static dgh.f a(List<Float> $$0, dgh $$1) {
      return new dgh.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dgh> a();

   public static record a(dgh d, float e, float f) implements dgh {
      public static final MapCodec<dgh.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgh.b.fieldOf("value").forGetter(dgh.a::b), Codec.FLOAT.fieldOf("min").forGetter(dgh.a::c), Codec.FLOAT.fieldOf("max").forGetter(dgh.a::d)
                  )
                  .apply($$0, dgh.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azm.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dgh.a> a() {
         return c;
      }

      public dgh b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dgh {
      public static final Codec<dgh.b> c = Codec.FLOAT.xmap(dgh.b::new, dgh.b::b);
      public static final MapCodec<dgh.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dgh.b::b)).apply($$0, dgh.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dgh.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dgh d, dgh e) implements dgh {
      public static final MapCodec<dgh.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgh.b.fieldOf("numerator").forGetter(dgh.c::b), dgh.b.fieldOf("denominator").forGetter(dgh.c::c)).apply($$0, dgh.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dgh.c> a() {
         return c;
      }

      public dgh b() {
         return this.d;
      }

      public dgh c() {
         return this.e;
      }
   }

   public static record d(float d) implements dgh {
      public static final MapCodec<dgh.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dgh.d::b)).apply($$0, dgh.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azm.h($$0) + this.d;
      }

      @Override
      public MapCodec<dgh.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dgh {
      public static final MapCodec<dgh.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dgh.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dgh.e::c))
               .apply($$0, dgh.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dgh.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dgh e) implements dgh {
      public static final MapCodec<dgh.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dgh.f::b), dgh.b.fieldOf("fallback").forGetter(dgh.f::c)).apply($$0, dgh.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dgh.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dgh c() {
         return this.e;
      }
   }
}
