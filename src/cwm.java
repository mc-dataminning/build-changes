import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cwm {
   public static final Codec<cwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwm.b.a.forGetter($$0x -> $$0x.i),
               cws.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               cwn.b.forGetter($$0x -> $$0x.j),
               cwy.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cwm::new)
   );
   public static final Codec<cwm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwm.b.a.forGetter($$0x -> $$0x.i), cws.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cwm($$0x, $$1, cwn.a, cwy.b))
   );
   public static final Codec<ij<cwm>> c = aiu.a(kg.at, a);
   public static final Codec<in<cwm>> d = ix.a(kg.at, a);
   private static final efu f = new efu(new drn(new dqp(1234L)), ImmutableList.of(0));
   static final efu g = new efu(new drn(new dqp(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final efu e = new efu(new drn(new dqp(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cwm.b i;
   private final cwn j;
   private final cwy k;
   private final cws l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   cwm(cwm.b $$0, cws $$1, cwn $$2, cwy $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cwy b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public cwm.c a(hz $$0) {
      if (!this.c()) {
         return cwm.c.a;
      } else {
         return this.b($$0) ? cwm.c.c : cwm.c.b;
      }
   }

   private float e(hz $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(hz $$0) {
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

   public boolean a(cvq $$0, hz $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cvq $$0, hz $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.J_() && $$1.v() < $$0.al() && $$0.a(cvw.b, $$1) < 10) {
            dlf $$3 = $$0.a_($$1);
            egp $$4 = $$0.b_($$1);
            if ($$4.a() == egq.c && $$3.b() instanceof ddd) {
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

   public boolean b(hz $$0) {
      return !this.c($$0);
   }

   public boolean c(hz $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(hz $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(cvq $$0, hz $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.J_() && $$1.v() < $$0.al() && $$0.a(cvw.b, $$1) < 10) {
            dlf $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(cyq.dN)) && cyq.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwn d() {
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
      double $$0 = (double)awh.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)awh.a(this.i.e, 0.0F, 1.0F);
      return cvl.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)awh.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)awh.a(this.i.e, 0.0F, 1.0F);
      return cvh.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public cws h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<cwl> k() {
      return this.l.h();
   }

   public Optional<ij<atj>> l() {
      return this.l.i();
   }

   public Optional<cwk> m() {
      return this.l.j();
   }

   public Optional<cwj> n() {
      return this.l.k();
   }

   public Optional<ath> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private cwm.d c = cwm.d.a;
      @Nullable
      private Float d;
      @Nullable
      private cws e;
      @Nullable
      private cwy f;
      @Nullable
      private cwn g;

      public cwm.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public cwm.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cwm.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cwm.a a(cws $$0) {
         this.e = $$0;
         return this;
      }

      public cwm.a a(cwy $$0) {
         this.f = $$0;
         return this;
      }

      public cwm.a a(cwn $$0) {
         this.g = $$0;
         return this;
      }

      public cwm.a a(cwm.d $$0) {
         this.c = $$0;
         return this;
      }

      public cwm a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cwm(new cwm.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, cwm.d d, float e) {
      public static final MapCodec<cwm.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cwm.d.c.optionalFieldOf("temperature_modifier", cwm.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cwm.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cwm.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements axc {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<cwm.c> d = axc.a(cwm.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements axc {
      a("none") {
         @Override
         public float a(hz $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(hz $$0, float $$1) {
            double $$2 = cwm.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cwm.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cwm.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cwm.d> c = axc.a(cwm.d::values);

      public abstract float a(hz var1, float var2);

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
