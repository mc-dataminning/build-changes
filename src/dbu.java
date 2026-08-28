import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dbu {
   Codec<dbu> a = lv.au.q().dispatch(dbu::a, $$0 -> $$0);
   Codec<dbu> b = Codec.either(dbu.b.c, a)
      .xmap($$0 -> (dbu)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dbu.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dbu> a(kb<MapCodec<? extends dbu>> $$0) {
      kb.a($$0, "clamped", dbu.a.c);
      kb.a($$0, "fraction", dbu.c.c);
      kb.a($$0, "levels_squared", dbu.d.c);
      kb.a($$0, "linear", dbu.e.c);
      return kb.a($$0, "lookup", dbu.f.c);
   }

   static dbu.b a(float $$0) {
      return new dbu.b($$0);
   }

   static dbu.e a(float $$0, float $$1) {
      return new dbu.e($$0, $$1);
   }

   static dbu.e b(float $$0) {
      return a($$0, $$0);
   }

   static dbu.f a(List<Float> $$0, dbu $$1) {
      return new dbu.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dbu> a();

   public static record a(dbu d, float e, float f) implements dbu {
      public static final MapCodec<dbu.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbu.b.fieldOf("value").forGetter(dbu.a::b), Codec.FLOAT.fieldOf("min").forGetter(dbu.a::c), Codec.FLOAT.fieldOf("max").forGetter(dbu.a::d)
                  )
                  .apply($$0, dbu.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azf.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dbu.a> a() {
         return c;
      }

      public dbu b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dbu {
      public static final Codec<dbu.b> c = Codec.FLOAT.xmap(dbu.b::new, dbu.b::b);
      public static final MapCodec<dbu.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dbu.b::b)).apply($$0, dbu.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dbu.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dbu d, dbu e) implements dbu {
      public static final MapCodec<dbu.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dbu.b.fieldOf("numerator").forGetter(dbu.c::b), dbu.b.fieldOf("denominator").forGetter(dbu.c::c)).apply($$0, dbu.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dbu.c> a() {
         return c;
      }

      public dbu b() {
         return this.d;
      }

      public dbu c() {
         return this.e;
      }
   }

   public static record d(float d) implements dbu {
      public static final MapCodec<dbu.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dbu.d::b)).apply($$0, dbu.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azf.h($$0) + this.d;
      }

      @Override
      public MapCodec<dbu.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dbu {
      public static final MapCodec<dbu.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dbu.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dbu.e::c))
               .apply($$0, dbu.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dbu.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dbu e) implements dbu {
      public static final MapCodec<dbu.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dbu.f::b), dbu.b.fieldOf("fallback").forGetter(dbu.f::c)).apply($$0, dbu.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dbu.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dbu c() {
         return this.e;
      }
   }
}
