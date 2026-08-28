import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class diy {
   public static final Codec<diy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("fog_color").forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("water_color").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("water_fog_color").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("sky_color").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("foliage_color").forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("grass_color").forGetter($$0x -> $$0x.g),
               diy.b.d.optionalFieldOf("grass_color_modifier", diy.b.a).forGetter($$0x -> $$0x.h),
               dir.a.optionalFieldOf("particle").forGetter($$0x -> $$0x.i),
               awj.b.optionalFieldOf("ambient_sound").forGetter($$0x -> $$0x.j),
               diq.a.optionalFieldOf("mood_sound").forGetter($$0x -> $$0x.k),
               dip.a.optionalFieldOf("additions_sound").forGetter($$0x -> $$0x.l),
               bsb.a(awh.a).optionalFieldOf("music").forGetter($$0x -> $$0x.m),
               Codec.FLOAT.fieldOf("music_volume").orElse(1.0F).forGetter($$0x -> $$0x.n)
            )
            .apply($$0, diy::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final Optional<Integer> f;
   private final Optional<Integer> g;
   private final diy.b h;
   private final Optional<dir> i;
   private final Optional<js<awj>> j;
   private final Optional<diq> k;
   private final Optional<dip> l;
   private final Optional<bsb<awh>> m;
   private final float n;

   diy(
      int $$0,
      int $$1,
      int $$2,
      int $$3,
      Optional<Integer> $$4,
      Optional<Integer> $$5,
      diy.b $$6,
      Optional<dir> $$7,
      Optional<js<awj>> $$8,
      Optional<diq> $$9,
      Optional<dip> $$10,
      Optional<bsb<awh>> $$11,
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

   public diy.b g() {
      return this.h;
   }

   public Optional<dir> h() {
      return this.i;
   }

   public Optional<js<awj>> i() {
      return this.j;
   }

   public Optional<diq> j() {
      return this.k;
   }

   public Optional<dip> k() {
      return this.l;
   }

   public Optional<bsb<awh>> l() {
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
      private diy.b g = diy.b.a;
      private Optional<dir> h = Optional.empty();
      private Optional<js<awj>> i = Optional.empty();
      private Optional<diq> j = Optional.empty();
      private Optional<dip> k = Optional.empty();
      private Optional<bsb<awh>> l = Optional.empty();
      private float m = 1.0F;

      public diy.a a(int $$0) {
         this.a = OptionalInt.of($$0);
         return this;
      }

      public diy.a b(int $$0) {
         this.b = OptionalInt.of($$0);
         return this;
      }

      public diy.a c(int $$0) {
         this.c = OptionalInt.of($$0);
         return this;
      }

      public diy.a d(int $$0) {
         this.d = OptionalInt.of($$0);
         return this;
      }

      public diy.a e(int $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public diy.a f(int $$0) {
         this.f = Optional.of($$0);
         return this;
      }

      public diy.a a(diy.b $$0) {
         this.g = $$0;
         return this;
      }

      public diy.a a(dir $$0) {
         this.h = Optional.of($$0);
         return this;
      }

      public diy.a a(js<awj> $$0) {
         this.i = Optional.of($$0);
         return this;
      }

      public diy.a a(diq $$0) {
         this.j = Optional.of($$0);
         return this;
      }

      public diy.a a(dip $$0) {
         this.k = Optional.of($$0);
         return this;
      }

      public diy.a a(@Nullable awh $$0) {
         if ($$0 == null) {
            this.l = Optional.empty();
            return this;
         } else {
            this.l = Optional.of(bsb.a($$0));
            return this;
         }
      }

      public diy.a a() {
         return this.a(bsb.a()).a(0.0F);
      }

      public diy.a a(bsb<awh> $$0) {
         this.l = Optional.of($$0);
         return this;
      }

      public diy.a a(float $$0) {
         this.m = $$0;
         return this;
      }

      public diy b() {
         return new diy(
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

   public static enum b implements bag {
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
            double $$3 = dis.e.a($$0 * 0.0225, $$1 * 0.0225, false);
            return $$3 < -0.1 ? 5011004 : 6975545;
         }
      };

      private final String e;
      public static final Codec<diy.b> d = bag.a(diy.b::values);

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
