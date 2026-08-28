import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dkd {
   public static final Codec<dkd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkd.b.a.forGetter($$0x -> $$0x.i),
               dkj.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dke.b.forGetter($$0x -> $$0x.j),
               dkp.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dkd::new)
   );
   public static final Codec<dkd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkd.b.a.forGetter($$0x -> $$0x.i), dkj.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dkd($$0x, $$1, dke.a, dkp.b))
   );
   public static final Codec<je<dkd>> c = alc.a(mg.aG, a);
   public static final Codec<ji<dkd>> d = jt.a(mg.aG, a);
   private static final evt f = new evt(new ehf(new egh(1234L)), ImmutableList.of(0));
   static final evt g = new evt(new ehf(new egh(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final evt e = new evt(new ehf(new egh(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dkd.b i;
   private final dke j;
   private final dkp k;
   private final dkj l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> af.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dkd(dkd.b $$0, dkj $$1, dke $$2, dkp $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dkp b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dkd.c a(iu $$0, int $$1) {
      if (!this.c()) {
         return dkd.c.a;
      } else {
         return this.b($$0, $$1) ? dkd.c.c : dkd.c.b;
      }
   }

   private float e(iu $$0, int $$1) {
      float $$2 = this.i.d.a($$0, this.g());
      int $$3 = $$1 + 17;
      if ($$0.v() > $$3) {
         float $$4 = (float)(f.a((double)((float)$$0.u() / 8.0F), (double)((float)$$0.w() / 8.0F), false) * 8.0);
         return $$2 - ($$4 + (float)$$0.v() - (float)$$3) * 0.05F / 40.0F;
      } else {
         return $$2;
      }
   }

   @Deprecated
   private float f(iu $$0, int $$1) {
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

   public boolean a(djd $$0, iu $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(djd $$0, iu $$1, boolean $$2) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(djj.b, $$1) < 10) {
            eah $$3 = $$0.a_($$1);
            ewo $$4 = $$0.b_($$1);
            if ($$4.a() == ewp.c && $$3.b() instanceof drb) {
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

   public boolean b(iu $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(iu $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(iu $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(djd $$0, iu $$1) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(djj.b, $$1) < 10) {
            eah $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dmh.ed)) && dmh.ed.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dke d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.q();
      return this.l.g().a($$0, $$1, $$2);
   }

   private int q() {
      Optional<Integer> $$0 = this.l.f();
      return $$0.isPresent() ? $$0.get() : this.r();
   }

   private int r() {
      double $$0 = (double)azm.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azm.a(this.i.e, 0.0F, 1.0F);
      return diy.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::s);
   }

   private int s() {
      double $$0 = (double)azm.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azm.a(this.i.e, 0.0F, 1.0F);
      return div.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dkj h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dkc> k() {
      return this.l.h();
   }

   public Optional<je<awm>> l() {
      return this.l.i();
   }

   public Optional<dkb> m() {
      return this.l.j();
   }

   public Optional<dka> n() {
      return this.l.k();
   }

   public Optional<bso<awk>> o() {
      return this.l.l();
   }

   public float p() {
      return this.l.m();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dkd.d c = dkd.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dkj e;
      @Nullable
      private dkp f;
      @Nullable
      private dke g;

      public dkd.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dkd.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dkd.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dkd.a a(dkj $$0) {
         this.e = $$0;
         return this;
      }

      public dkd.a a(dkp $$0) {
         this.f = $$0;
         return this;
      }

      public dkd.a a(dke $$0) {
         this.g = $$0;
         return this;
      }

      public dkd.a a(dkd.d $$0) {
         this.c = $$0;
         return this;
      }

      public dkd a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dkd(new dkd.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dkd.d d, float e) {
      public static final MapCodec<dkd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dkd.d.c.optionalFieldOf("temperature_modifier", dkd.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dkd.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dkd.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements bak {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dkd.c> d = bak.a(dkd.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements bak {
      a("none") {
         @Override
         public float a(iu $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(iu $$0, float $$1) {
            double $$2 = dkd.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dkd.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dkd.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dkd.d> c = bak.a(dkd.d::values);

      public abstract float a(iu var1, float var2);

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
