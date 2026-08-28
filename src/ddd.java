import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class ddd {
   public static final Codec<ddd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddd.b.a.forGetter($$0x -> $$0x.i),
               ddj.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dde.b.forGetter($$0x -> $$0x.j),
               ddp.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ddd::new)
   );
   public static final Codec<ddd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddd.b.a.forGetter($$0x -> $$0x.i), ddj.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new ddd($$0x, $$1, dde.a, ddp.b))
   );
   public static final Codec<jj<ddd>> c = akg.a(lr.aE, a);
   public static final Codec<jn<ddd>> d = jy.a(lr.aE, a);
   private static final eng f = new eng(new dyy(new dya(1234L)), ImmutableList.of(0));
   static final eng g = new eng(new dyy(new dya(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final eng e = new eng(new dyy(new dya(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final ddd.b i;
   private final dde j;
   private final ddp k;
   private final ddj l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   ddd(ddd.b $$0, ddj $$1, dde $$2, ddp $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public ddp b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public ddd.c a(ja $$0) {
      if (!this.c()) {
         return ddd.c.a;
      } else {
         return this.b($$0) ? ddd.c.c : ddd.c.b;
      }
   }

   private float e(ja $$0) {
      float $$1 = this.i.d.a($$0, this.g());
      if ($$0.v() > 80) {
         float $$2 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$1 - ($$2 + (float)$$0.v() - 80.0F) * 0.05F / 40.0F;
      } else {
         return $$1;
      }
   }

   @Deprecated
   private float f(ja $$0) {
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

   public boolean a(dcg $$0, ja $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dcg $$0, ja $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcm.b, $$1) < 10) {
            dsh $$3 = $$0.a_($$1);
            eob $$4 = $$0.b_($$1);
            if ($$4.a() == eoc.c && $$3.b() instanceof djv) {
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

   public boolean b(ja $$0) {
      return !this.c($$0);
   }

   public boolean c(ja $$0) {
      return this.f($$0) >= 0.15F;
   }

   public boolean d(ja $$0) {
      return this.f($$0) > 0.1F;
   }

   public boolean b(dcg $$0, ja $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcm.b, $$1) < 10) {
            dsh $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dfh.dN)) && dfh.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dde d() {
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
      double $$0 = (double)aye.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aye.a(this.i.e, 0.0F, 1.0F);
      return dcb.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)aye.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)aye.a(this.i.e, 0.0F, 1.0F);
      return dbx.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public ddj h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<ddc> k() {
      return this.l.h();
   }

   public Optional<jj<ave>> l() {
      return this.l.i();
   }

   public Optional<ddb> m() {
      return this.l.j();
   }

   public Optional<dda> n() {
      return this.l.k();
   }

   public Optional<avc> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private ddd.d c = ddd.d.a;
      @Nullable
      private Float d;
      @Nullable
      private ddj e;
      @Nullable
      private ddp f;
      @Nullable
      private dde g;

      public ddd.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ddd.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public ddd.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public ddd.a a(ddj $$0) {
         this.e = $$0;
         return this;
      }

      public ddd.a a(ddp $$0) {
         this.f = $$0;
         return this;
      }

      public ddd.a a(dde $$0) {
         this.g = $$0;
         return this;
      }

      public ddd.a a(ddd.d $$0) {
         this.c = $$0;
         return this;
      }

      public ddd a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new ddd(new ddd.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, ddd.d d, float e) {
      public static final MapCodec<ddd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  ddd.d.c.optionalFieldOf("temperature_modifier", ddd.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, ddd.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public ddd.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements ayz {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<ddd.c> d = ayz.a(ddd.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements ayz {
      a("none") {
         @Override
         public float a(ja $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(ja $$0, float $$1) {
            double $$2 = ddd.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = ddd.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = ddd.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<ddd.d> c = ayz.a(ddd.d::values);

      public abstract float a(ja var1, float var2);

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
