import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dii {
   public static final Codec<dii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               dii.b.d.optionalFieldOf("grass_color_modifier", dii.b.a).forGetter($$0x -> $$0x.h),
               dib.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               avz.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               dia.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               dhz.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               brj.a(avx.a).optionalFieldOf("music").forGetter($$0x -> $$0x.m),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.n)
            )
            .apply($$0, dii::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final dii.b h;
   private final Optional<dib> i;
   private final Optional<jr<avz>> j;
   private final Optional<dia> k;
   private final Optional<dhz> l;
   private final Optional<brj<avx>> m;
   private final float n;

   dii(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      dii.b $$6,
      Optional<dib> $$7,
      Optional<jr<avz>> $$8,
      Optional<dia> $$9,
      Optional<dhz> $$10,
      Optional<brj<avx>> $$11,
      float $$12
   ) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
      this.l = $$10;
      this.m = $$11;
      this.n = $$12;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public Optional<Integer> e() {
      return this.f;
   }

   public Optional<Integer> f() {
      return this.g;
   }

   public dii.b g() {
      return this.h;
   }

   public Optional<dib> h() {
      return this.i;
   }

   public Optional<jr<avz>> i() {
      return this.j;
   }

   public Optional<dia> j() {
      return this.k;
   }

   public Optional<dhz> k() {
      return this.l;
   }

   public Optional<brj<avx>> l() {
      return this.m;
   }

   public float m() {
      return this.n;
   }

   public static class a {
      private OptionalInt a = OptionalInt.empty();
      private OptionalInt b = OptionalInt.empty();
      private OptionalInt c = OptionalInt.empty();
      private OptionalInt d = OptionalInt.empty();
      private Optional<Integer> e = Optional.empty();
      private Optional<Integer> f = Optional.empty();
      private dii.b g = dii.b.a;
      private Optional<dib> h = Optional.empty();
      private Optional<jr<avz>> i = Optional.empty();
      private Optional<dia> j = Optional.empty();
      private Optional<dhz> k = Optional.empty();
      private Optional<brj<avx>> l = Optional.empty();
      private float m = 1.0F;

      public dii.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dii.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dii.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dii.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dii.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dii.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dii.a a(dii.b $$0) {
         this.g = $$0;
         return this;
      }

      public dii.a a(dib $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public dii.a a(jr<avz> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dii.a a(dia $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dii.a a(dhz $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dii.a a(@Nullable avx $$0) {
         if ($$0 == null) {
            this.l = Optional.empty();
            return this;
         } else {
            this.l = Optional.of(brj.a($$0));
            return this;
         }
      }

      public dii.a a() {
         return this.a(brj.a()).a(0.0F);
      }

      public dii.a a(brj<avx> $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public dii.a a(float $$0) {
         this.m = $$0;
         return this;
      }

      public dii b() {
         return new dii(
            this.a.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
            this.b.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
            this.c.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
            this.d.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
            this.e,
            this.f,
            this.g,
            this.h,
            this.i,
            this.j,
            this.k,
            this.l,
            this.m
         );
      }
   }

   public static enum b implements azv {
      a("none") {
         @Override
         public int a(double $$0, double $$1, int $$2) {
            return $$2;
         }
      },
      b("dark_forest") {
         @Override
         public int a(double $$0, double $$1, int $$2) {
            return ($$2 & 16711422) + 2634762 >> 1;
         }
      },
      c("swamp") {
         @Override
         public int a(double $$0, double $$1, int $$2) {
            double $$3 = dic.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dii.b> d = azv.a(dii.b::values);

      public abstract int a(double var1, double var3, int var5);

      b(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
