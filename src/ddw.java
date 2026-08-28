import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class ddw {
   public static final Codec<ddw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddw.b.a.forGetter($$0x -> $$0x.i),
               dec.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               ddx.b.forGetter($$0x -> $$0x.j),
               dei.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ddw::new)
   );
   public static final Codec<ddw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddw.b.a.forGetter($$0x -> $$0x.i), dec.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new ddw($$0x, $$1, ddx.a, dei.b))
   );
   public static final Codec<jm<ddw>> c = akn.a(lu.aF, a);
   public static final Codec<jq<ddw>> d = kb.a(lu.aF, a);
   private static final eoj f = new eoj(new dzx(new dyz(1234L)), ImmutableList.of(0));
   static final eoj g = new eoj(new dzx(new dyz(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final eoj e = new eoj(new dzx(new dyz(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final ddw.b i;
   private final ddx j;
   private final dei k;
   private final dec l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ad.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   ddw(ddw.b $$0, dec $$1, ddx $$2, dei $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dei b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public ddw.c a(jd $$0) {
      if (!this.c()) {
         return ddw.c.a;
      } else {
         return this.b($$0) ? ddw.c.c : ddw.c.b;
      }
   }

   private float e(jd $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(jd $$0) {
      long $$1 = $$0.a();
      Long2FloatLinkedOpenHashMap $$2 = this.m.get();
      float $$3 = $$2.get($$1);
      if (!Float.isNaN($$3)) {
         return $$3;
      } else {
         float $$4 = this.e($$0);
         if ($$2.size() == 1024) {
            $$2.removeFirstFloat();
         }

         $$2.put($$1, $$4);
         return $$4;
      }
   }

   public boolean a(dcz $$0, jd $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dcz $$0, jd $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(ddf.b, $$1) < 10) {
            dtc $$3 = $$0.a_($$1);
            epe $$4 = $$0.b_($$1);
            if ($$4.a() == epf.c && $$3.b() instanceof dko) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.z($$1.h()) && $$0.z($$1.i()) && $$0.z($$1.f()) && $$0.z($$1.g());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean b(jd $$0) {
      return !this.c($$0);
   }

   public boolean c(jd $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(jd $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(dcz $$0, jd $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(ddf.b, $$1) < 10) {
            dtc $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dga.dN)) && dga.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public ddx d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.l.f().orElseGet(this::p);
      return this.l.g().a($$0, $$1, $$2);
   }

   private int p() {
      double $$0 = (double)ayo.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayo.a(this.i.e, 0.0F, 1.0F);
      return dcu.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)ayo.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayo.a(this.i.e, 0.0F, 1.0F);
      return dcq.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dec h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<ddv> k() {
      return this.l.h();
   }

   public Optional<jm<avo>> l() {
      return this.l.i();
   }

   public Optional<ddu> m() {
      return this.l.j();
   }

   public Optional<ddt> n() {
      return this.l.k();
   }

   public Optional<avm> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private ddw.d c = ddw.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dec e;
      @Nullable
      private dei f;
      @Nullable
      private ddx g;

      public ddw.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ddw.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public ddw.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public ddw.a a(dec $$0) {
         this.e = $$0;
         return this;
      }

      public ddw.a a(dei $$0) {
         this.f = $$0;
         return this;
      }

      public ddw.a a(ddx $$0) {
         this.g = $$0;
         return this;
      }

      public ddw.a a(ddw.d $$0) {
         this.c = $$0;
         return this;
      }

      public ddw a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new ddw(new ddw.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, ddw.d d, float e) {
      public static final MapCodec<ddw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  ddw.d.c.optionalFieldOf("temperature_modifier", ddw.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ddw.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public ddw.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements azk {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<ddw.c> d = azk.a(ddw.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements azk {
      a("none") {
         @Override
         public float a(jd $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(jd $$0, float $$1) {
            double $$2 = ddw.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = ddw.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = ddw.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<ddw.d> c = azk.a(ddw.d::values);

      public abstract float a(jd var1, float var2);

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
