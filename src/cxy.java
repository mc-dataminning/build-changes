import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class cxy {
   public static final Codec<cxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxy.b.a.forGetter($$0x -> $$0x.i),
               cye.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               cxz.b.forGetter($$0x -> $$0x.j),
               cyk.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, cxy::new)
   );
   public static final Codec<cxy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cxy.b.a.forGetter($$0x -> $$0x.i), cye.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new cxy($$0x, $$1, cxz.a, cyk.b))
   );
   public static final Codec<il<cxy>> c = ajd.a(kj.au, a);
   public static final Codec<ip<cxy>> d = ja.a(kj.au, a);
   private static final ehs f = new ehs(new dtl(new dsn(1234L)), ImmutableList.of(0));
   static final ehs g = new ehs(new dtl(new dsn(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final ehs e = new ehs(new dtl(new dsn(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final cxy.b i;
   private final cxz j;
   private final cyk k;
   private final cye l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   cxy(cxy.b $$0, cye $$1, cxz $$2, cyk $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public cyk b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public cxy.c a(ib $$0) {
      if (!this.c()) {
         return cxy.c.a;
      } else {
         return this.b($$0) ? cxy.c.c : cxy.c.b;
      }
   }

   private float e(ib $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(ib $$0) {
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

   public boolean a(cxc $$0, ib $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cxc $$0, ib $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.ak() && $$0.a(cxi.b, $$1) < 10) {
            dmz $$3 = $$0.a_($$1);
            ein $$4 = $$0.b_($$1);
            if ($$4.a() == eio.c && $$3.b() instanceof dep) {
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

   public boolean b(ib $$0) {
      return !this.c($$0);
   }

   public boolean c(ib $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(ib $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(cxc $$0, ib $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.ak() && $$0.a(cxi.b, $$1) < 10) {
            dmz $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dac.dN)) && dac.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cxz d() {
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
      double $$0 = (double)aww.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aww.a(this.i.e, 0.0F, 1.0F);
      return cwx.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)aww.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aww.a(this.i.e, 0.0F, 1.0F);
      return cwt.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public cye h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<cxx> k() {
      return this.l.h();
   }

   public Optional<il<atx>> l() {
      return this.l.i();
   }

   public Optional<cxw> m() {
      return this.l.j();
   }

   public Optional<cxv> n() {
      return this.l.k();
   }

   public Optional<atv> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private cxy.d c = cxy.d.a;
      @Nullable
      private Float d;
      @Nullable
      private cye e;
      @Nullable
      private cyk f;
      @Nullable
      private cxz g;

      public cxy.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public cxy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cxy.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public cxy.a a(cye $$0) {
         this.e = $$0;
         return this;
      }

      public cxy.a a(cyk $$0) {
         this.f = $$0;
         return this;
      }

      public cxy.a a(cxz $$0) {
         this.g = $$0;
         return this;
      }

      public cxy.a a(cxy.d $$0) {
         this.c = $$0;
         return this;
      }

      public cxy a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new cxy(new cxy.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, cxy.d d, float e) {
      public static final MapCodec<cxy.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  cxy.d.c.optionalFieldOf("temperature_modifier", cxy.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, cxy.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public cxy.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements axq {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<cxy.c> d = axq.a(cxy.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements axq {
      a("none") {
         @Override
         public float a(ib $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(ib $$0, float $$1) {
            double $$2 = cxy.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = cxy.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = cxy.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<cxy.d> c = axq.a(cxy.d::values);

      public abstract float a(ib var1, float var2);

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
