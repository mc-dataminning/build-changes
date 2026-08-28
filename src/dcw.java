import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dcw {
   public static final Codec<dcw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcw.b.a.forGetter($$0x -> $$0x.i),
               ddc.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dcx.b.forGetter($$0x -> $$0x.j),
               ddi.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dcw::new)
   );
   public static final Codec<dcw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcw.b.a.forGetter($$0x -> $$0x.i), ddc.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dcw($$0x, $$1, dcx.a, ddi.b))
   );
   public static final Codec<ji<dcw>> c = ala.a(lq.az, a);
   public static final Codec<jm<dcw>> d = jx.a(lq.az, a);
   private static final emz f = new emz(new dys(new dxu(1234L)), ImmutableList.of(0));
   static final emz g = new emz(new dys(new dxu(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final emz e = new emz(new dys(new dxu(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dcw.b i;
   private final dcx j;
   private final ddi k;
   private final ddc l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dcw(dcw.b $$0, ddc $$1, dcx $$2, ddi $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public ddi b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dcw.c a(iz $$0) {
      if (!this.c()) {
         return dcw.c.a;
      } else {
         return this.b($$0) ? dcw.c.c : dcw.c.b;
      }
   }

   private float e(iz $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(iz $$0) {
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

   public boolean a(dca $$0, iz $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dca $$0, iz $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcg.b, $$1) < 10) {
            dsb $$3 = $$0.a_($$1);
            enu $$4 = $$0.b_($$1);
            if ($$4.a() == env.c && $$3.b() instanceof djo) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.z($$1.g()) && $$0.z($$1.h()) && $$0.z($$1.e()) && $$0.z($$1.f());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean b(iz $$0) {
      return !this.c($$0);
   }

   public boolean c(iz $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(iz $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(dca $$0, iz $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcg.b, $$1) < 10) {
            dsb $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dfa.dN)) && dfa.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dcx d() {
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
      double $$0 = (double)ayy.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayy.a(this.i.e, 0.0F, 1.0F);
      return dbv.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)ayy.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayy.a(this.i.e, 0.0F, 1.0F);
      return dbr.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public ddc h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dcv> k() {
      return this.l.h();
   }

   public Optional<ji<avy>> l() {
      return this.l.i();
   }

   public Optional<dcu> m() {
      return this.l.j();
   }

   public Optional<dct> n() {
      return this.l.k();
   }

   public Optional<avw> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dcw.d c = dcw.d.a;
      @Nullable
      private Float d;
      @Nullable
      private ddc e;
      @Nullable
      private ddi f;
      @Nullable
      private dcx g;

      public dcw.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dcw.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dcw.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dcw.a a(ddc $$0) {
         this.e = $$0;
         return this;
      }

      public dcw.a a(ddi $$0) {
         this.f = $$0;
         return this;
      }

      public dcw.a a(dcx $$0) {
         this.g = $$0;
         return this;
      }

      public dcw.a a(dcw.d $$0) {
         this.c = $$0;
         return this;
      }

      public dcw a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dcw(new dcw.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dcw.d d, float e) {
      public static final MapCodec<dcw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dcw.d.c.optionalFieldOf("temperature_modifier", dcw.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcw.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dcw.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements azt {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dcw.c> d = azt.a(dcw.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements azt {
      a("none") {
         @Override
         public float a(iz $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(iz $$0, float $$1) {
            double $$2 = dcw.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dcw.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dcw.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dcw.d> c = azt.a(dcw.d::values);

      public abstract float a(iz var1, float var2);

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
