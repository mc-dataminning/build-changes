import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public interface dck {
   Codec<dck> a = lz.at.q().dispatch(dck::a, $$0 -> $$0);
   Codec<dck> b = Codec.either(dck.b.c, a)
      .xmap($$0 -> (dck)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> $$0 instanceof dck.b $$1 ? Either.left($$1) : Either.right($$0));

   static MapCodec<? extends dck> a(kd<MapCodec<? extends dck>> $$0) {
      kd.a($$0, "clamped", dck.a.c);
      kd.a($$0, "fraction", dck.c.c);
      kd.a($$0, "levels_squared", dck.d.c);
      kd.a($$0, "linear", dck.e.c);
      return kd.a($$0, "lookup", dck.f.c);
   }

   static dck.b a(float $$0) {
      return new dck.b($$0);
   }

   static dck.e a(float $$0, float $$1) {
      return new dck.e($$0, $$1);
   }

   static dck.e b(float $$0) {
      return a($$0, $$0);
   }

   static dck.f a(List<Float> $$0, dck $$1) {
      return new dck.f($$0, $$1);
   }

   float a(int var1);

   MapCodec<? extends dck> a();

   public static record a(dck d, float e, float f) implements dck {
      public static final MapCodec<dck.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dck.b.fieldOf("value").forGetter(dck.a::b), Codec.FLOAT.fieldOf("min").forGetter(dck.a::c), Codec.FLOAT.fieldOf("max").forGetter(dck.a::d)
                  )
                  .apply($$0, dck.a::new)
         )
         .validate($$0 -> $$0.f <= $$0.e ? DataResult.error(() -> "Max must be larger than min, min: " + $$0.e + ", max: " + $$0.f) : DataResult.success($$0));

      @Override
      public float a(int $$0) {
         return azm.a(this.d.a($$0), this.e, this.f);
      }

      @Override
      public MapCodec<dck.a> a() {
         return c;
      }

      public dck b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }
   }

   public static record b(float e) implements dck {
      public static final Codec<dck.b> c = Codec.FLOAT.xmap(dck.b::new, dck.b::b);
      public static final MapCodec<dck.b> d = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(dck.b::b)).apply($$0, dck.b::new)
      );

      @Override
      public float a(int $$0) {
         return this.e;
      }

      @Override
      public MapCodec<dck.b> a() {
         return d;
      }

      public float b() {
         return this.e;
      }
   }

   public static record c(dck d, dck e) implements dck {
      public static final MapCodec<dck.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dck.b.fieldOf("numerator").forGetter(dck.c::b), dck.b.fieldOf("denominator").forGetter(dck.c::c)).apply($$0, dck.c::new)
      );

      @Override
      public float a(int $$0) {
         float $$1 = this.e.a($$0);
         return $$1 == 0.0F ? 0.0F : this.d.a($$0) / $$1;
      }

      @Override
      public MapCodec<dck.c> a() {
         return c;
      }

      public dck b() {
         return this.d;
      }

      public dck c() {
         return this.e;
      }
   }

   public static record d(float d) implements dck {
      public static final MapCodec<dck.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("added").forGetter(dck.d::b)).apply($$0, dck.d::new)
      );

      @Override
      public float a(int $$0) {
         return (float)azm.h($$0) + this.d;
      }

      @Override
      public MapCodec<dck.d> a() {
         return c;
      }

      public float b() {
         return this.d;
      }
   }

   public static record e(float d, float e) implements dck {
      public static final MapCodec<dck.e> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("base").forGetter(dck.e::b), Codec.FLOAT.fieldOf("per_level_above_first").forGetter(dck.e::c))
               .apply($$0, dck.e::new)
      );

      @Override
      public float a(int $$0) {
         return this.d + this.e * (float)($$0 - 1);
      }

      @Override
      public MapCodec<dck.e> a() {
         return c;
      }

      public float b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }
   }

   public static record f(List<Float> d, dck e) implements dck {
      public static final MapCodec<dck.f> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.listOf().fieldOf("values").forGetter(dck.f::b), dck.b.fieldOf("fallback").forGetter(dck.f::c)).apply($$0, dck.f::new)
      );

      @Override
      public float a(int $$0) {
         return $$0 <= this.d.size() ? this.d.get($$0 - 1) : this.e.a($$0);
      }

      @Override
      public MapCodec<dck.f> a() {
         return c;
      }

      public List<Float> b() {
         return this.d;
      }

      public dck c() {
         return this.e;
      }
   }
}
