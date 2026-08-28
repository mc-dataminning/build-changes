import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dkk {
   public static final Codec<dkk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkk.b.a.forGetter($$0x -> $$0x.i),
               dkq.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dkl.b.forGetter($$0x -> $$0x.j),
               dkw.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dkk::new)
   );
   public static final Codec<dkk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkk.b.a.forGetter($$0x -> $$0x.i), dkq.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dkk($$0x, $$1, dkl.a, dkw.b))
   );
   public static final Codec<jf<dkk>> c = alc.a(mh.aG, a);
   public static final Codec<jj<dkk>> d = ju.a(mh.aG, a);
   private static final ewa f = new ewa(new ehm(new ego(1234L)), ImmutableList.of(0));
   static final ewa g = new ewa(new ehm(new ego(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final ewa e = new ewa(new ehm(new ego(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dkk.b i;
   private final dkl j;
   private final dkw k;
   private final dkq l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ag.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dkk(dkk.b $$0, dkq $$1, dkl $$2, dkw $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dkw b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dkk.c a(iv $$0, int $$1) {
      if (!this.c()) {
         return dkk.c.a;
      } else {
         return this.b($$0, $$1) ? dkk.c.c : dkk.c.b;
      }
   }

   private float e(iv $$0, int $$1) {
      float $$2 = this.i.d.a($$0, this.g());
      int $$3 = $$1 + 17;
      if ($$0.v() > $$3) {
         float $$4 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$2 - ($$4 + (float)$$0.v() - (float)$$3) * 0.05F / 40.0F;
      } else {
         return $$2;
      }
   }

   @Deprecated
   private float f(iv $$0, int $$1) {
      long $$2 = $$0.a();
      Long2FloatLinkedOpenHashMap $$3 = this.m.get();
      float $$4 = $$3.get($$2);
      if (!Float.isNaN($$4)) {
         return $$4;
      } else {
         float $$5 = this.e($$0, $$1);
         if ($$3.size() == 1024) {
            $$3.removeFirstFloat();
         }

         $$3.put($$2, $$5);
         return $$5;
      }
   }

   public boolean a(djk $$0, iv $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(djk $$0, iv $$1, boolean $$2) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(djq.b, $$1) < 10) {
            eao $$3 = $$0.a_($$1);
            ewv $$4 = $$0.b_($$1);
            if ($$4.a() == eww.c && $$3.b() instanceof dri) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.A($$1.h()) && $$0.A($$1.i()) && $$0.A($$1.f()) && $$0.A($$1.g());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean b(iv $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(iv $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(iv $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(djk $$0, iv $$1) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(djq.b, $$1) < 10) {
            eao $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dmo.ed)) && dmo.ed.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dkl d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.q();
      return this.l.g().a($$0, $$1, $$2);
   }

   private int q() {
      Optional<Integer> $$0 = this.l.f();
      return $$0.isPresent() ? $$0.get() : this.r();
   }

   private int r() {
      double $$0 = (double)azm.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azm.a(this.i.e, 0.0F, 1.0F);
      return djf.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::s);
   }

   private int s() {
      double $$0 = (double)azm.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azm.a(this.i.e, 0.0F, 1.0F);
      return djc.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dkq h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dkj> k() {
      return this.l.h();
   }

   public Optional<jf<awm>> l() {
      return this.l.i();
   }

   public Optional<dki> m() {
      return this.l.j();
   }

   public Optional<dkh> n() {
      return this.l.k();
   }

   public Optional<bsq<awk>> o() {
      return this.l.l();
   }

   public float p() {
      return this.l.m();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dkk.d c = dkk.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dkq e;
      @Nullable
      private dkw f;
      @Nullable
      private dkl g;

      public dkk.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dkk.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dkk.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dkk.a a(dkq $$0) {
         this.e = $$0;
         return this;
      }

      public dkk.a a(dkw $$0) {
         this.f = $$0;
         return this;
      }

      public dkk.a a(dkl $$0) {
         this.g = $$0;
         return this;
      }

      public dkk.a a(dkk.d $$0) {
         this.c = $$0;
         return this;
      }

      public dkk a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dkk(new dkk.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
         } else {
            throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
         }
      }

      @Override
      public String toString() {
         return "BiomeBuilder{\nhasPrecipitation="
            + this.a
            + ",\ntemperature="
            + this.b
            + ",\ntemperatureModifier="
            + this.c
            + ",\ndownfall="
            + this.d
            + ",\nspecialEffects="
            + this.e
            + ",\nmobSpawnSettings="
            + this.f
            + ",\ngenerationSettings="
            + this.g
            + ",\n}";
      }
   }

   static record b(boolean b, float c, dkk.d d, float e) {
      public static final MapCodec<dkk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dkk.d.c.optionalFieldOf("temperature_modifier", dkk.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dkk.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dkk.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements bak {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dkk.c> d = bak.a(dkk.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("none") {
         @Override
         public float a(iv $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(iv $$0, float $$1) {
            double $$2 = dkk.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dkk.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dkk.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dkk.d> c = bak.a(dkk.d::values);

      public abstract float a(iv var1, float var2);

      d(final String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
