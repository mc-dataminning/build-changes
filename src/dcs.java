import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dcs {
   public static final Codec<dcs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcs.b.a.forGetter($$0x -> $$0x.i),
               dcy.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dct.b.forGetter($$0x -> $$0x.j),
               dde.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dcs::new)
   );
   public static final Codec<dcs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcs.b.a.forGetter($$0x -> $$0x.i), dcy.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dcs($$0x, $$1, dct.a, dde.b))
   );
   public static final Codec<ji<dcs>> c = akx.a(lq.az, a);
   public static final Codec<jm<dcs>> d = jx.a(lq.az, a);
   private static final emv f = new emv(new dyo(new dxq(1234L)), ImmutableList.of(0));
   static final emv g = new emv(new dyo(new dxq(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final emv e = new emv(new dyo(new dxq(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dcs.b i;
   private final dct j;
   private final dde k;
   private final dcy l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dcs(dcs.b $$0, dcy $$1, dct $$2, dde $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dde b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dcs.c a(iz $$0) {
      if (!this.c()) {
         return dcs.c.a;
      } else {
         return this.b($$0) ? dcs.c.c : dcs.c.b;
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

   public boolean a(dbw $$0, iz $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dbw $$0, iz $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcc.b, $$1) < 10) {
            drx $$3 = $$0.a_($$1);
            enq $$4 = $$0.b_($$1);
            if ($$4.a() == enr.c && $$3.b() instanceof djk) {
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

   public boolean b(dbw $$0, iz $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.am() && $$0.a(dcc.b, $$1) < 10) {
            drx $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dew.dN)) && dew.dN.n().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dct d() {
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
      double $$0 = (double)ayu.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayu.a(this.i.e, 0.0F, 1.0F);
      return dbr.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)ayu.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayu.a(this.i.e, 0.0F, 1.0F);
      return dbn.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dcy h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dcr> k() {
      return this.l.h();
   }

   public Optional<ji<avv>> l() {
      return this.l.i();
   }

   public Optional<dcq> m() {
      return this.l.j();
   }

   public Optional<dcp> n() {
      return this.l.k();
   }

   public Optional<avt> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dcs.d c = dcs.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dcy e;
      @Nullable
      private dde f;
      @Nullable
      private dct g;

      public dcs.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dcs.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dcs.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dcs.a a(dcy $$0) {
         this.e = $$0;
         return this;
      }

      public dcs.a a(dde $$0) {
         this.f = $$0;
         return this;
      }

      public dcs.a a(dct $$0) {
         this.g = $$0;
         return this;
      }

      public dcs.a a(dcs.d $$0) {
         this.c = $$0;
         return this;
      }

      public dcs a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dcs(new dcs.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dcs.d d, float e) {
      public static final MapCodec<dcs.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dcs.d.c.optionalFieldOf("temperature_modifier", dcs.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dcs.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dcs.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements azp {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dcs.c> d = azp.a(dcs.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements azp {
      a("none") {
         @Override
         public float a(iz $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(iz $$0, float $$1) {
            double $$2 = dcs.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dcs.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dcs.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dcs.d> c = azp.a(dcs.d::values);

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
