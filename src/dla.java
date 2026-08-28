import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dla {
   public static final Codec<dla> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dla.b.a.forGetter($$0x -> $$0x.i),
               dlg.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dlb.b.forGetter($$0x -> $$0x.j),
               dlm.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dla::new)
   );
   public static final Codec<dla> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dla.b.a.forGetter($$0x -> $$0x.i), dlg.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dla($$0x, $$1, dlb.a, dlm.b))
   );
   public static final Codec<jf<dla>> c = ale.a(mh.aG, a);
   public static final Codec<jj<dla>> d = ju.a(mh.aG, a);
   private static final ewt f = new ewt(new eic(new ehe(1234L)), ImmutableList.of(0));
   static final ewt g = new ewt(new eic(new ehe(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final ewt e = new ewt(new eic(new ehe(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dla.b i;
   private final dlb j;
   private final dlm k;
   private final dlg l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ag.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dla(dla.b $$0, dlg $$1, dlb $$2, dlm $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dlm b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dla.c a(iv $$0, int $$1) {
      if (!this.c()) {
         return dla.c.a;
      } else {
         return this.b($$0, $$1) ? dla.c.c : dla.c.b;
      }
   }

   private float e(iv $$0, int $$1) {
      float $$2 = this.i.d.a($$0, this.h());
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

   public boolean a(dka $$0, iv $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dka $$0, iv $$1, boolean $$2) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dkg.b, $$1) < 10) {
            ebe $$3 = $$0.a_($$1);
            exo $$4 = $$0.b_($$1);
            if ($$4.a() == exp.c && $$3.b() instanceof dry) {
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

   public boolean b(dka $$0, iv $$1) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dkg.b, $$1) < 10) {
            ebe $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dne.ed)) && dne.ed.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dlb d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.r();
      return this.l.h().a($$0, $$1, $$2);
   }

   private int r() {
      Optional<Integer> $$0 = this.l.g();
      return $$0.isPresent() ? $$0.get() : this.s();
   }

   private int s() {
      double $$0 = (double)azo.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azo.a(this.i.e, 0.0F, 1.0F);
      return djv.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::t);
   }

   private int t() {
      double $$0 = (double)azo.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azo.a(this.i.e, 0.0F, 1.0F);
      return djs.a($$0, $$1);
   }

   public int g() {
      return this.l.f().orElseGet(this::u);
   }

   private int u() {
      double $$0 = (double)azo.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azo.a(this.i.e, 0.0F, 1.0F);
      return djl.a($$0, $$1);
   }

   public float h() {
      return this.i.c;
   }

   public dlg i() {
      return this.l;
   }

   public int j() {
      return this.l.b();
   }

   public int k() {
      return this.l.c();
   }

   public Optional<dkz> l() {
      return this.l.i();
   }

   public Optional<jf<awo>> m() {
      return this.l.j();
   }

   public Optional<dky> n() {
      return this.l.k();
   }

   public Optional<dkx> o() {
      return this.l.l();
   }

   public Optional<btb<awm>> p() {
      return this.l.m();
   }

   public float q() {
      return this.l.n();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dla.d c = dla.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dlg e;
      @Nullable
      private dlm f;
      @Nullable
      private dlb g;

      public dla.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dla.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dla.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dla.a a(dlg $$0) {
         this.e = $$0;
         return this;
      }

      public dla.a a(dlm $$0) {
         this.f = $$0;
         return this;
      }

      public dla.a a(dlb $$0) {
         this.g = $$0;
         return this;
      }

      public dla.a a(dla.d $$0) {
         this.c = $$0;
         return this;
      }

      public dla a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dla(new dla.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dla.d d, float e) {
      public static final MapCodec<dla.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dla.d.c.optionalFieldOf("temperature_modifier", dla.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dla.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dla.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements bam {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dla.c> d = bam.a(dla.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements bam {
      a("none") {
         @Override
         public float a(iv $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(iv $$0, float $$1) {
            double $$2 = dla.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dla.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dla.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dla.d> c = bam.a(dla.d::values);

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
