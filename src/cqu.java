import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cqu {
   public static final Codec<cqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               cqu.b.d.optionalFieldOf("grass_color_modifier", cqu.b.a).forGetter($$0x -> $$0x.h),
               cqn.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               aoy.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               cqm.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               cql.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               aow.a.optionalFieldOf("music").forGetter($$0x -> $$0x.m)
            )
            .apply($$0, cqu::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final cqu.b h;
   private final Optional<cqn> i;
   private final Optional<hg<aoy>> j;
   private final Optional<cqm> k;
   private final Optional<cql> l;
   private final Optional<aow> m;

   cqu(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      cqu.b $$6,
      Optional<cqn> $$7,
      Optional<hg<aoy>> $$8,
      Optional<cqm> $$9,
      Optional<cql> $$10,
      Optional<aow> $$11
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

   public cqu.b g() {
      return this.h;
   }

   public Optional<cqn> h() {
      return this.i;
   }

   public Optional<hg<aoy>> i() {
      return this.j;
   }

   public Optional<cqm> j() {
      return this.k;
   }

   public Optional<cql> k() {
      return this.l;
   }

   public Optional<aow> l() {
      return this.m;
   }

   public static class a {
      private OptionalInt a = OptionalInt.empty();
      private OptionalInt b = OptionalInt.empty();
      private OptionalInt c = OptionalInt.empty();
      private OptionalInt d = OptionalInt.empty();
      private Optional<Integer> e = Optional.empty();
      private Optional<Integer> f = Optional.empty();
      private cqu.b g = cqu.b.a;
      private Optional<cqn> h = Optional.empty();
      private Optional<hg<aoy>> i = Optional.empty();
      private Optional<cqm> j = Optional.empty();
      private Optional<cql> k = Optional.empty();
      private Optional<aow> l = Optional.empty();

      public cqu.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public cqu.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public cqu.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public cqu.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public cqu.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public cqu.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public cqu.a a(cqu.b $$0) {
         this.g = $$0;
         return this;
      }

      public cqu.a a(cqn $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public cqu.a a(hg<aoy> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public cqu.a a(cqm $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public cqu.a a(cql $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public cqu.a a(@Nullable aow $$0) {
         this.l = Optional.ofNullable($$0);
         return this;
      }

      public cqu a() {
         return new cqu(
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

   public static enum b implements ask {
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
            double $$3 = cqo.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<cqu.b> d = ask.a(cqu.b::values);

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
