import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cqp {
   public static final Codec<cqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               cqp.b.d.optionalFieldOf("grass_color_modifier", cqp.b.a).forGetter($$0x -> $$0x.h),
               cqi.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               aov.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               cqh.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               cqg.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               aot.a.optionalFieldOf("music").forGetter($$0x -> $$0x.m)
            )
            .apply($$0, cqp::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final cqp.b h;
   private final Optional<cqi> i;
   private final Optional<he<aov>> j;
   private final Optional<cqh> k;
   private final Optional<cqg> l;
   private final Optional<aot> m;

   cqp(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      cqp.b $$6,
      Optional<cqi> $$7,
      Optional<he<aov>> $$8,
      Optional<cqh> $$9,
      Optional<cqg> $$10,
      Optional<aot> $$11
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

   public cqp.b g() {
      return this.h;
   }

   public Optional<cqi> h() {
      return this.i;
   }

   public Optional<he<aov>> i() {
      return this.j;
   }

   public Optional<cqh> j() {
      return this.k;
   }

   public Optional<cqg> k() {
      return this.l;
   }

   public Optional<aot> l() {
      return this.m;
   }

   public static class a {
      private OptionalInt a = OptionalInt.empty();
      private OptionalInt b = OptionalInt.empty();
      private OptionalInt c = OptionalInt.empty();
      private OptionalInt d = OptionalInt.empty();
      private Optional<Integer> e = Optional.empty();
      private Optional<Integer> f = Optional.empty();
      private cqp.b g = cqp.b.a;
      private Optional<cqi> h = Optional.empty();
      private Optional<he<aov>> i = Optional.empty();
      private Optional<cqh> j = Optional.empty();
      private Optional<cqg> k = Optional.empty();
      private Optional<aot> l = Optional.empty();

      public cqp.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public cqp.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public cqp.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public cqp.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public cqp.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cqp.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cqp.a a(cqp.b $$0) {
         this.g = $$0;
         return this;
      }

      public cqp.a a(cqi $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public cqp.a a(he<aov> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public cqp.a a(cqh $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public cqp.a a(cqg $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public cqp.a a(@Nullable aot $$0) {
         this.l = Optional.ofNullable($$0);
         return this;
      }

      public cqp a() {
         return new cqp(
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
            this.l
         );
      }
   }

   public static enum b implements ash {
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
            double $$3 = cqj.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<cqp.b> d = ash.a(cqp.b::values);

      public abstract int a(double var1, double var3, int var5);

      b(String $$0) {
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
