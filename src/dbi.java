import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dbi {
   public static final Codec<dbi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               dbi.b.d.optionalFieldOf("grass_color_modifier", dbi.b.a).forGetter($$0x -> $$0x.h),
               dbb.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               avb.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               dba.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               daz.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               auz.a.optionalFieldOf("music").forGetter($$0x -> $$0x.m)
            )
            .apply($$0, dbi::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final dbi.b h;
   private final Optional<dbb> i;
   private final Optional<iw<avb>> j;
   private final Optional<dba> k;
   private final Optional<daz> l;
   private final Optional<auz> m;

   dbi(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      dbi.b $$6,
      Optional<dbb> $$7,
      Optional<iw<avb>> $$8,
      Optional<dba> $$9,
      Optional<daz> $$10,
      Optional<auz> $$11
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

   public dbi.b g() {
      return this.h;
   }

   public Optional<dbb> h() {
      return this.i;
   }

   public Optional<iw<avb>> i() {
      return this.j;
   }

   public Optional<dba> j() {
      return this.k;
   }

   public Optional<daz> k() {
      return this.l;
   }

   public Optional<auz> l() {
      return this.m;
   }

   public static class a {
      private OptionalInt a = OptionalInt.empty();
      private OptionalInt b = OptionalInt.empty();
      private OptionalInt c = OptionalInt.empty();
      private OptionalInt d = OptionalInt.empty();
      private Optional<Integer> e = Optional.empty();
      private Optional<Integer> f = Optional.empty();
      private dbi.b g = dbi.b.a;
      private Optional<dbb> h = Optional.empty();
      private Optional<iw<avb>> i = Optional.empty();
      private Optional<dba> j = Optional.empty();
      private Optional<daz> k = Optional.empty();
      private Optional<auz> l = Optional.empty();

      public dbi.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dbi.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dbi.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dbi.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dbi.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dbi.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dbi.a a(dbi.b $$0) {
         this.g = $$0;
         return this;
      }

      public dbi.a a(dbb $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public dbi.a a(iw<avb> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dbi.a a(dba $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dbi.a a(daz $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dbi.a a(@Nullable auz $$0) {
         this.l = Optional.ofNullable($$0);
         return this;
      }

      public dbi a() {
         return new dbi(
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

   public static enum b implements ayt {
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
            double $$3 = dbc.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dbi.b> d = ayt.a(dbi.b::values);

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
