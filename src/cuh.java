import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cuh {
   public static final Codec<cuh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuh.b.a.forGetter($$0x -> $$0x.i),
               cun.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               cui.b.forGetter($$0x -> $$0x.j),
               cut.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cuh::new)
   );
   public static final Codec<cuh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cuh.b.a.forGetter($$0x -> $$0x.i), cun.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cuh($$0x, $$1, cui.a, cut.b))
   );
   public static final Codec<ih<cuh>> c = agz.a(ke.at, a);
   public static final Codec<il<cuh>> d = iv.a(ke.at, a);
   private static final edp f = new edp(new dpi(new dok(1234L)), ImmutableList.of(0));
   static final edp g = new edp(new dpi(new dok(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final edp e = new edp(new dpi(new dok(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cuh.b i;
   private final cui j;
   private final cut k;
   private final cun l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   cuh(cuh.b $$0, cun $$1, cui $$2, cut $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cut b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public cuh.c a(hx $$0) {
      if (!this.c()) {
         return cuh.c.a;
      } else {
         return this.b($$0) ? cuh.c.c : cuh.c.b;
      }
   }

   private float e(hx $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(hx $$0) {
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

   public boolean a(ctl $$0, hx $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(ctl $$0, hx $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.J_() && $$1.v() < $$0.al() && $$0.a(ctr.b, $$1) < 10) {
            dja $$3 = $$0.a_($$1);
            eek $$4 = $$0.b_($$1);
            if ($$4.a() == eel.c && $$3.b() instanceof day) {
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

   public boolean b(hx $$0) {
      return !this.c($$0);
   }

   public boolean c(hx $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(hx $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(ctl $$0, hx $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.J_() && $$1.v() < $$0.al() && $$0.a(ctr.b, $$1) < 10) {
            dja $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(cwl.dN)) && cwl.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cui d() {
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
      double $$0 = (double)aui.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aui.a(this.i.e, 0.0F, 1.0F);
      return ctg.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)aui.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aui.a(this.i.e, 0.0F, 1.0F);
      return ctc.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public cun h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<cug> k() {
      return this.l.h();
   }

   public Optional<ih<arl>> l() {
      return this.l.i();
   }

   public Optional<cuf> m() {
      return this.l.j();
   }

   public Optional<cue> n() {
      return this.l.k();
   }

   public Optional<arj> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private cuh.d c = cuh.d.a;
      @Nullable
      private Float d;
      @Nullable
      private cun e;
      @Nullable
      private cut f;
      @Nullable
      private cui g;

      public cuh.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public cuh.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cuh.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cuh.a a(cun $$0) {
         this.e = $$0;
         return this;
      }

      public cuh.a a(cut $$0) {
         this.f = $$0;
         return this;
      }

      public cuh.a a(cui $$0) {
         this.g = $$0;
         return this;
      }

      public cuh.a a(cuh.d $$0) {
         this.c = $$0;
         return this;
      }

      public cuh a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cuh(new cuh.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, cuh.d d, float e) {
      public static final MapCodec<cuh.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cuh.d.c.optionalFieldOf("temperature_modifier", cuh.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cuh.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cuh.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements ave {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<cuh.c> d = ave.a(cuh.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements ave {
      a("none") {
         @Override
         public float a(hx $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(hx $$0, float $$1) {
            double $$2 = cuh.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cuh.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cuh.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cuh.d> c = ave.a(cuh.d::values);

      public abstract float a(hx var1, float var2);

      d(String $$0) {
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
