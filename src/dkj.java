import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dkj {
   public static final Codec<dkj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               dkj.b.d.optionalFieldOf("grass_color_modifier", dkj.b.a).forGetter($$0x -> $$0x.h),
               dkc.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               awm.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               dkb.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               dka.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               bso.a(awk.a).optionalFieldOf("music").forGetter($$0x -> $$0x.m),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.n)
            )
            .apply($$0, dkj::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final dkj.b h;
   private final Optional<dkc> i;
   private final Optional<je<awm>> j;
   private final Optional<dkb> k;
   private final Optional<dka> l;
   private final Optional<bso<awk>> m;
   private final float n;

   dkj(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      dkj.b $$6,
      Optional<dkc> $$7,
      Optional<je<awm>> $$8,
      Optional<dkb> $$9,
      Optional<dka> $$10,
      Optional<bso<awk>> $$11,
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

   public dkj.b g() {
      return this.h;
   }

   public Optional<dkc> h() {
      return this.i;
   }

   public Optional<je<awm>> i() {
      return this.j;
   }

   public Optional<dkb> j() {
      return this.k;
   }

   public Optional<dka> k() {
      return this.l;
   }

   public Optional<bso<awk>> l() {
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
      private dkj.b g = dkj.b.a;
      private Optional<dkc> h = Optional.empty();
      private Optional<je<awm>> i = Optional.empty();
      private Optional<dkb> j = Optional.empty();
      private Optional<dka> k = Optional.empty();
      private Optional<bso<awk>> l = Optional.empty();
      private float m = 1.0F;

      public dkj.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public dkj.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public dkj.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public dkj.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public dkj.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public dkj.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public dkj.a a(dkj.b $$0) {
         this.g = $$0;
         return this;
      }

      public dkj.a a(dkc $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public dkj.a a(je<awm> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public dkj.a a(dkb $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public dkj.a a(dka $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public dkj.a a(@Nullable awk $$0) {
         if ($$0 == null) {
            this.l = Optional.empty();
            return this;
         } else {
            this.l = Optional.of(bso.a($$0));
            return this;
         }
      }

      public dkj.a a() {
         return this.a(bso.a()).a(0.0F);
      }

      public dkj.a a(bso<awk> $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public dkj.a a(float $$0) {
         this.m = $$0;
         return this;
      }

      public dkj b() {
         return new dkj(
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
            double $$3 = dkd.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<dkj.b> d = bak.a(dkj.b::values);

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
