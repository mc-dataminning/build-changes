import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class djy {
   public static final Codec<djy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               djy.b.d.optionalFieldOf("grass_color_modifier", djy.b.a).forGetter($$0x -> $$0x.h),
               djr.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               awk.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               djq.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               djp.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               bsj.a(awi.a).optionalFieldOf("music").forGetter($$0x -> $$0x.m),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.n)
            )
            .apply($$0, djy::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final djy.b h;
   private final Optional<djr> i;
   private final Optional<je<awk>> j;
   private final Optional<djq> k;
   private final Optional<djp> l;
   private final Optional<bsj<awi>> m;
   private final float n;

   djy(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      djy.b $$6,
      Optional<djr> $$7,
      Optional<je<awk>> $$8,
      Optional<djq> $$9,
      Optional<djp> $$10,
      Optional<bsj<awi>> $$11,
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

   public djy.b g() {
      return this.h;
   }

   public Optional<djr> h() {
      return this.i;
   }

   public Optional<je<awk>> i() {
      return this.j;
   }

   public Optional<djq> j() {
      return this.k;
   }

   public Optional<djp> k() {
      return this.l;
   }

   public Optional<bsj<awi>> l() {
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
      private djy.b g = djy.b.a;
      private Optional<djr> h = Optional.empty();
      private Optional<je<awk>> i = Optional.empty();
      private Optional<djq> j = Optional.empty();
      private Optional<djp> k = Optional.empty();
      private Optional<bsj<awi>> l = Optional.empty();
      private float m = 1.0F;

      public djy.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public djy.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public djy.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public djy.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public djy.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public djy.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public djy.a a(djy.b $$0) {
         this.g = $$0;
         return this;
      }

      public djy.a a(djr $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public djy.a a(je<awk> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public djy.a a(djq $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public djy.a a(djp $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public djy.a a(@Nullable awi $$0) {
         if ($$0 == null) {
            this.l = Optional.empty();
            return this;
         } else {
            this.l = Optional.of(bsj.a($$0));
            return this;
         }
      }

      public djy.a a() {
         return this.a(bsj.a()).a(0.0F);
      }

      public djy.a a(bsj<awi> $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public djy.a a(float $$0) {
         this.m = $$0;
         return this;
      }

      public djy b() {
         return new djy(
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

   public static enum b implements bai {
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
            double $$3 = djs.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<djy.b> d = bai.a(djy.b::values);

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
