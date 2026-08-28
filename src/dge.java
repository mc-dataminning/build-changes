import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dge {
   Codec<dge> a = mg.ar.q().dispatch(dge::a, $$0 -> $$0);
   Codec<dge> b = Codec.either(dge.b.c, a)
      .xmap($$0 -> (dge)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dge.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dge> a(js<MapCodec<? extends dge>> $$0) {
      js.a($$0, "clamped", dge.a.c);
      js.a($$0, "fraction", dge.c.c);
      js.a($$0, "levels_squared", dge.d.c);
      js.a($$0, "linear", dge.e.c);
      return js.a($$0, "lookup", dge.f.c);
   }

   static dge.b a(float $$0) {
      return new dge.b($$0);
   }

   static dge.e a(float $$0, float $$1) {
      return new dge.e($$0, $$1);
   }

   static dge.e b(float $$0) {
      return a($$0, $$0);
   }

   static dge.f a(List<Float> $$0, dge $$1) {
      return new dge.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dge> a();

   public static record a(dge d, float e, float f) implements dge {
      public static final MapCodec<dge.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dge.b.fieldOf("value").forGetter(dge.a::b), Codec.FLOAT.fieldOf("min").forGetter(dge.a::c), Codec.FLOAT.fieldOf("max").forGetter(dge.a::d)
                  )
                  .apply($$0, dge.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azm.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dge.a> a() {
         return c;
      }

      public dge b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dge {
      public static final Codec<dge.b> c = Codec.FLOAT.xmap(dge.b::new, dge.b::b);
      public static final MapCodec<dge.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dge.b::b)).apply($$0, dge.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dge.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dge d, dge e) implements dge {
      public static final MapCodec<dge.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dge.b.fieldOf("numerator").forGetter(dge.c::b), dge.b.fieldOf("denominator").forGetter(dge.c::c)).apply($$0, dge.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dge.c> a() {
         return c;
      }

      public dge b() {
         return this.d;
      }

      public dge c() {
         return this.e;
      }
   }

   public static record d(float d) implements dge {
      public static final MapCodec<dge.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dge.d::b)).apply($$0, dge.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azm.h($$0) + this.d;
      }

      @Override
      public MapCodec<dge.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dge {
      public static final MapCodec<dge.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dge.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dge.e::c))
               .apply($$0, dge.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dge.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dge e) implements dge {
      public static final MapCodec<dge.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dge.f::b), dge.b.fieldOf("fallback").forGetter(dge.f::c)).apply($$0, dge.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dge.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dge c() {
         return this.e;
      }
   }
}
