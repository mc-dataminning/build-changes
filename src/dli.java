import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dli {
   public static final Codec<dli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("dry_foliage_color").forGetter($$0x -> $$0x.g),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.h),
               dli.b.d.optionalFieldOf("grass_color_modifier", dli.b.a).forGetter($$0x -> $$0x.i),
               dlb.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.j),
               awq.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.k),
               dla.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.l),
               dkz.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.m),
               btd.a(awo.a).optionalFieldOf("music").forGetter($$0x -> $$0x.n),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.o)
            )
            .apply($$0, dli::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final Optional<Integer> h;
   private final dli.b i;
   private final Optional<dlb> j;
   private final Optional<jg<awq>> k;
   private final Optional<dla> l;
   private final Optional<dkz> m;
   private final Optional<btd<awo>> n;
   private final float o;

   dli(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      Optional<Integer> $$6,
      dli.b $$7,
      Optional<dlb> $$8,
      Optional<jg<awq>> $$9,
      Optional<dla> $$10,
      Optional<dkz> $$11,
      Optional<btd<awo>> $$12,
      float $$13
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
      this.o = $$13;
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

   public Optional<Integer> g() {
      return this.h;
   }

   public dli.b h() {
      return this.i;
   }

   public Optional<dlb> i() {
      return this.j;
   }

   public Optional<jg<awq>> j() {
      return this.k;
   }

   public Optional<dla> k() {
      return this.l;
   }

   public Optional<dkz> l() {
      return this.m;
   }

   public Optional<btd<awo>> m() {
      return this.n;
   }

   public float n() {
      return this.o;
   }

   public static class a {
      private OptionalInt a = OptionalInt.empty();
      private OptionalInt b = OptionalInt.empty();
      private OptionalInt c = OptionalInt.empty();
      private OptionalInt d = OptionalInt.empty();
      private Optional<Integer> e = Optional.empty();
      private Optional<Integer> f = Optional.empty();
      private Optional<Integer> g = Optional.empty();
      private dli.b h = dli.b.a;
      private Optional<dlb> i = Optional.empty();
      private Optional<jg<awq>> j = Optional.empty();
      private Optional<dla> k = Optional.empty();
      private Optional<dkz> l = Optional.empty();
      private Optional<btd<awo>> m = Optional.empty();
      private float n = 1.0F;

      public dli.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dli.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dli.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dli.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dli.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dli.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dli.a g(int $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dli.a a(dli.b $$0) {
         this.h = $$0;
         return this;
      }

      public dli.a a(dlb $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dli.a a(jg<awq> $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dli.a a(dla $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dli.a a(dkz $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public dli.a a(@Nullable awo $$0) {
         if ($$0 == null) {
            this.m = Optional.empty();
            return this;
         } else {
            this.m = Optional.of(btd.a($$0));
            return this;
         }
      }

      public dli.a a() {
         return this.a(btd.a()).a(0.0F);
      }

      public dli.a a(btd<awo> $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public dli.a a(float $$0) {
         this.n = $$0;
         return this;
      }

      public dli b() {
         return new dli(
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
            this.m,
            this.n
         );
      }
   }

   public static enum b implements bao {
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
            double $$3 = dlc.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dli.b> d = bao.a(dli.b::values);

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
