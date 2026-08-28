import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dfs {
   Codec<dfs> a = mf.ar.q().dispatch(dfs::a, $$0 -> $$0);
   Codec<dfs> b = Codec.either(dfs.b.c, a)
      .xmap($$0 -> (dfs)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dfs.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dfs> a(jr<MapCodec<? extends dfs>> $$0) {
      jr.a($$0, "clamped", dfs.a.c);
      jr.a($$0, "fraction", dfs.c.c);
      jr.a($$0, "levels_squared", dfs.d.c);
      jr.a($$0, "linear", dfs.e.c);
      return jr.a($$0, "lookup", dfs.f.c);
   }

   static dfs.b a(float $$0) {
      return new dfs.b($$0);
   }

   static dfs.e a(float $$0, float $$1) {
      return new dfs.e($$0, $$1);
   }

   static dfs.e b(float $$0) {
      return a($$0, $$0);
   }

   static dfs.f a(List<Float> $$0, dfs $$1) {
      return new dfs.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dfs> a();

   public static record a(dfs d, float e, float f) implements dfs {
      public static final MapCodec<dfs.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dfs.b.fieldOf("value").forGetter(dfs.a::b), Codec.FLOAT.fieldOf("min").forGetter(dfs.a::c), Codec.FLOAT.fieldOf("max").forGetter(dfs.a::d)
                  )
                  .apply($$0, dfs.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azm.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dfs.a> a() {
         return c;
      }

      public dfs b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dfs {
      public static final Codec<dfs.b> c = Codec.FLOAT.xmap(dfs.b::new, dfs.b::b);
      public static final MapCodec<dfs.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dfs.b::b)).apply($$0, dfs.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dfs.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dfs d, dfs e) implements dfs {
      public static final MapCodec<dfs.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfs.b.fieldOf("numerator").forGetter(dfs.c::b), dfs.b.fieldOf("denominator").forGetter(dfs.c::c)).apply($$0, dfs.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dfs.c> a() {
         return c;
      }

      public dfs b() {
         return this.d;
      }

      public dfs c() {
         return this.e;
      }
   }

   public static record d(float d) implements dfs {
      public static final MapCodec<dfs.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dfs.d::b)).apply($$0, dfs.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azm.h($$0) + this.d;
      }

      @Override
      public MapCodec<dfs.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dfs {
      public static final MapCodec<dfs.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dfs.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dfs.e::c))
               .apply($$0, dfs.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dfs.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dfs e) implements dfs {
      public static final MapCodec<dfs.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dfs.f::b), dfs.b.fieldOf("fallback").forGetter(dfs.f::c)).apply($$0, dfs.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dfs.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dfs c() {
         return this.e;
      }
   }
}
