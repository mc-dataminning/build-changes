import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cqi {
   public static final Codec<cqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cqi.b.a.forGetter($$0x -> $$0x.i),
               cqo.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               cqj.b.forGetter($$0x -> $$0x.j),
               cqu.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cqi::new)
   );
   public static final Codec<cqi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqi.b.a.forGetter($$0x -> $$0x.i), cqo.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cqi($$0x, $$1, cqj.a, cqu.b))
   );
   public static final Codec<hf<cqi>> c = ael.a(jd.ap, a);
   public static final Codec<hj<cqi>> d = hu.a(jd.ap, a);
   private static final dzg f = new dzg(new dlg(new dki(1234L)), ImmutableList.of(0));
   static final dzg g = new dzg(new dlg(new dki(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final dzg e = new dzg(new dlg(new dki(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cqi.b i;
   private final cqj j;
   private final cqu k;
   private final cqo l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   cqi(cqi.b $$0, cqo $$1, cqj $$2, cqu $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cqu b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public cqi.c a(gv $$0) {
      if (!this.c()) {
         return cqi.c.a;
      } else {
         return this.b($$0) ? cqi.c.c : cqi.c.b;
      }
   }

   private float e(gv $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(gv $$0) {
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

   public boolean a(cpn $$0, gv $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cpn $$0, gv $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cpt.b, $$1) < 10) {
            dey $$3 = $$0.a_($$1);
            eab $$4 = $$0.b_($$1);
            if ($$4.a() == eac.c && $$3.b() instanceof cwx) {
               if (!$$2) {
                  return true;
               }

               boolean $$5 = $$0.y($$1.g()) && $$0.y($$1.h()) && $$0.y($$1.e()) && $$0.y($$1.f());
               if (!$$5) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean b(gv $$0) {
      return !this.c($$0);
   }

   public boolean c(gv $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(gv $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(cpn $$0, gv $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cpt.b, $$1) < 10) {
            dey $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(csl.dN)) && csl.dN.n().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cqj d() {
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
      double $$0 = (double)aro.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aro.a(this.i.e, 0.0F, 1.0F);
      return cpi.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)aro.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aro.a(this.i.e, 0.0F, 1.0F);
      return cpe.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public cqo h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<cqh> k() {
      return this.l.h();
   }

   public Optional<hf<aot>> l() {
      return this.l.i();
   }

   public Optional<cqg> m() {
      return this.l.j();
   }

   public Optional<cqf> n() {
      return this.l.k();
   }

   public Optional<aor> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private cqi.d c = cqi.d.a;
      @Nullable
      private Float d;
      @Nullable
      private cqo e;
      @Nullable
      private cqu f;
      @Nullable
      private cqj g;

      public cqi.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public cqi.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cqi.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cqi.a a(cqo $$0) {
         this.e = $$0;
         return this;
      }

      public cqi.a a(cqu $$0) {
         this.f = $$0;
         return this;
      }

      public cqi.a a(cqj $$0) {
         this.g = $$0;
         return this;
      }

      public cqi.a a(cqi.d $$0) {
         this.c = $$0;
         return this;
      }

      public cqi a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cqi(new cqi.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, cqi.d d, float e) {
      public static final MapCodec<cqi.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cqi.d.c.optionalFieldOf("temperature_modifier", cqi.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqi.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cqi.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static enum d implements asf {
      a("none") {
         @Override
         public float a(gv $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(gv $$0, float $$1) {
            double $$2 = cqi.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cqi.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cqi.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cqi.d> c = asf.a(cqi.d::values);

      public abstract float a(gv var1, float var2);

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
