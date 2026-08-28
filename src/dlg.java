import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dlg {
   public static final Codec<dlg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("dry_foliage_color").forGetter($$0x -> $$0x.g),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.h),
               dlg.b.d.optionalFieldOf("grass_color_modifier", dlg.b.a).forGetter($$0x -> $$0x.i),
               dkz.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.j),
               awo.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.k),
               dky.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.l),
               dkx.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.m),
               btb.a(awm.a).optionalFieldOf("music").forGetter($$0x -> $$0x.n),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.o)
            )
            .apply($$0, dlg::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final Optional<Integer> h;
   private final dlg.b i;
   private final Optional<dkz> j;
   private final Optional<jf<awo>> k;
   private final Optional<dky> l;
   private final Optional<dkx> m;
   private final Optional<btb<awm>> n;
   private final float o;

   dlg(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      Optional<Integer> $$6,
      dlg.b $$7,
      Optional<dkz> $$8,
      Optional<jf<awo>> $$9,
      Optional<dky> $$10,
      Optional<dkx> $$11,
      Optional<btb<awm>> $$12,
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

   public dlg.b h() {
      return this.i;
   }

   public Optional<dkz> i() {
      return this.j;
   }

   public Optional<jf<awo>> j() {
      return this.k;
   }

   public Optional<dky> k() {
      return this.l;
   }

   public Optional<dkx> l() {
      return this.m;
   }

   public Optional<btb<awm>> m() {
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
      private dlg.b h = dlg.b.a;
      private Optional<dkz> i = Optional.empty();
      private Optional<jf<awo>> j = Optional.empty();
      private Optional<dky> k = Optional.empty();
      private Optional<dkx> l = Optional.empty();
      private Optional<btb<awm>> m = Optional.empty();
      private float n = 1.0F;

      public dlg.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dlg.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dlg.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dlg.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dlg.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dlg.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dlg.a g(int $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dlg.a a(dlg.b $$0) {
         this.h = $$0;
         return this;
      }

      public dlg.a a(dkz $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dlg.a a(jf<awo> $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dlg.a a(dky $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dlg.a a(dkx $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public dlg.a a(@Nullable awm $$0) {
         if ($$0 == null) {
            this.m = Optional.empty();
            return this;
         } else {
            this.m = Optional.of(btb.a($$0));
            return this;
         }
      }

      public dlg.a a() {
         return this.a(btb.a()).a(0.0F);
      }

      public dlg.a a(btb<awm> $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public dlg.a a(float $$0) {
         this.n = $$0;
         return this;
      }

      public dlg b() {
         return new dlg(
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

   public static enum b implements bam {
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
            double $$3 = dla.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dlg.b> d = bam.a(dlg.b::values);

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
