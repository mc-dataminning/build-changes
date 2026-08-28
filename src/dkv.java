import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dkv {
   public static final Codec<dkv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("dry_foliage_color").forGetter($$0x -> $$0x.g),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.h),
               dkv.b.d.optionalFieldOf("grass_color_modifier", dkv.b.a).forGetter($$0x -> $$0x.i),
               dko.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.j),
               awm.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.k),
               dkn.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.l),
               dkm.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.m),
               bsq.a(awk.a).optionalFieldOf("music").forGetter($$0x -> $$0x.n),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.o)
            )
            .apply($$0, dkv::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final Optional<Integer> h;
   private final dkv.b i;
   private final Optional<dko> j;
   private final Optional<jf<awm>> k;
   private final Optional<dkn> l;
   private final Optional<dkm> m;
   private final Optional<bsq<awk>> n;
   private final float o;

   dkv(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      Optional<Integer> $$6,
      dkv.b $$7,
      Optional<dko> $$8,
      Optional<jf<awm>> $$9,
      Optional<dkn> $$10,
      Optional<dkm> $$11,
      Optional<bsq<awk>> $$12,
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

   public dkv.b h() {
      return this.i;
   }

   public Optional<dko> i() {
      return this.j;
   }

   public Optional<jf<awm>> j() {
      return this.k;
   }

   public Optional<dkn> k() {
      return this.l;
   }

   public Optional<dkm> l() {
      return this.m;
   }

   public Optional<bsq<awk>> m() {
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
      private dkv.b h = dkv.b.a;
      private Optional<dko> i = Optional.empty();
      private Optional<jf<awm>> j = Optional.empty();
      private Optional<dkn> k = Optional.empty();
      private Optional<dkm> l = Optional.empty();
      private Optional<bsq<awk>> m = Optional.empty();
      private float n = 1.0F;

      public dkv.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dkv.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dkv.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dkv.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dkv.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dkv.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dkv.a g(int $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public dkv.a a(dkv.b $$0) {
         this.h = $$0;
         return this;
      }

      public dkv.a a(dko $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dkv.a a(jf<awm> $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dkv.a a(dkn $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dkv.a a(dkm $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public dkv.a a(@Nullable awk $$0) {
         if ($$0 == null) {
            this.m = Optional.empty();
            return this;
         } else {
            this.m = Optional.of(bsq.a($$0));
            return this;
         }
      }

      public dkv.a a() {
         return this.a(bsq.a()).a(0.0F);
      }

      public dkv.a a(bsq<awk> $$0) {
         this.m = Optional.of($$0);
         return this;
      }

      public dkv.a a(float $$0) {
         this.n = $$0;
         return this;
      }

      public dkv b() {
         return new dkv(
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

   public static enum b implements bak {
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
            double $$3 = dkp.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dkv.b> d = bak.a(dkv.b::values);

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
