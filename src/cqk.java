import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cqk {
   public static final Codec<cqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cqk.b.a.forGetter($$0x -> $$0x.i),
               cqq.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               cql.b.forGetter($$0x -> $$0x.j),
               cqw.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cqk::new)
   );
   public static final Codec<cqk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqk.b.a.forGetter($$0x -> $$0x.i), cqq.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cqk($$0x, $$1, cql.a, cqw.b))
   );
   public static final Codec<he<cqk>> c = aen.a(jc.ap, a);
   public static final Codec<hi<cqk>> d = ht.a(jc.ap, a);
   private static final dzi f = new dzi(new dli(new dkk(1234L)), ImmutableList.of(0));
   static final dzi g = new dzi(new dli(new dkk(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final dzi e = new dzi(new dli(new dkk(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cqk.b i;
   private final cql j;
   private final cqw k;
   private final cqq l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   cqk(cqk.b $$0, cqq $$1, cql $$2, cqw $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cqw b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public cqk.c a(gu $$0) {
      if (!this.c()) {
         return cqk.c.a;
      } else {
         return this.b($$0) ? cqk.c.c : cqk.c.b;
      }
   }

   private float e(gu $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(gu $$0) {
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

   public boolean a(cpp $$0, gu $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cpp $$0, gu $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cpv.b, $$1) < 10) {
            dfa $$3 = $$0.a_($$1);
            ead $$4 = $$0.b_($$1);
            if ($$4.a() == eae.c && $$3.b() instanceof cwz) {
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

   public boolean b(gu $$0) {
      return !this.c($$0);
   }

   public boolean c(gu $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(gu $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(cpp $$0, gu $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.C_() && $$1.v() < $$0.aj() && $$0.a(cpv.b, $$1) < 10) {
            dfa $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(csn.dN)) && csn.dN.n().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cql d() {
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
      double $$0 = (double)arp.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)arp.a(this.i.e, 0.0F, 1.0F);
      return cpk.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)arp.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)arp.a(this.i.e, 0.0F, 1.0F);
      return cpg.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public cqq h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<cqj> k() {
      return this.l.h();
   }

   public Optional<he<aov>> l() {
      return this.l.i();
   }

   public Optional<cqi> m() {
      return this.l.j();
   }

   public Optional<cqh> n() {
      return this.l.k();
   }

   public Optional<aot> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private cqk.d c = cqk.d.a;
      @Nullable
      private Float d;
      @Nullable
      private cqq e;
      @Nullable
      private cqw f;
      @Nullable
      private cql g;

      public cqk.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public cqk.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cqk.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cqk.a a(cqq $$0) {
         this.e = $$0;
         return this;
      }

      public cqk.a a(cqw $$0) {
         this.f = $$0;
         return this;
      }

      public cqk.a a(cql $$0) {
         this.g = $$0;
         return this;
      }

      public cqk.a a(cqk.d $$0) {
         this.c = $$0;
         return this;
      }

      public cqk a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cqk(new cqk.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, cqk.d d, float e) {
      public static final MapCodec<cqk.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cqk.d.c.optionalFieldOf("temperature_modifier", cqk.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cqk.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cqk.d c() {
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

   public static enum d implements ash {
      a("none") {
         @Override
         public float a(gu $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(gu $$0, float $$1) {
            double $$2 = cqk.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cqk.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cqk.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cqk.d> c = ash.a(cqk.d::values);

      public abstract float a(gu var1, float var2);

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
