import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dic {
   public static final Codec<dic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dic.b.a.forGetter($$0x -> $$0x.i),
               dii.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               did.b.forGetter($$0x -> $$0x.j),
               dio.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dic::new)
   );
   public static final Codec<dic> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dic.b.a.forGetter($$0x -> $$0x.i), dii.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dic($$0x, $$1, did.a, dio.b))
   );
   public static final Codec<jr<dic>> c = akq.a(mc.aJ, a);
   public static final Codec<jv<dic>> d = kg.a(mc.aJ, a);
   private static final etb f = new etb(new een(new edp(1234L)), ImmutableList.of(0));
   static final etb g = new etb(new een(new edp(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final etb e = new etb(new een(new edp(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dic.b i;
   private final did j;
   private final dio k;
   private final dii l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> af.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dic(dic.b $$0, dii $$1, did $$2, dio $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dio b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dic.c a(ji $$0, int $$1) {
      if (!this.c()) {
         return dic.c.a;
      } else {
         return this.b($$0, $$1) ? dic.c.c : dic.c.b;
      }
   }

   private float e(ji $$0, int $$1) {
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
   private float f(ji $$0, int $$1) {
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

   public boolean a(dhc $$0, ji $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dhc $$0, ji $$1, boolean $$2) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dhi.b, $$1) < 10) {
            dxq $$3 = $$0.a_($$1);
            etw $$4 = $$0.b_($$1);
            if ($$4.a() == etx.c && $$3.b() instanceof doy) {
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

   public boolean b(ji $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(ji $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(ji $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(dhc $$0, ji $$1) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dhi.b, $$1) < 10) {
            dxq $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dkg.ea)) && dkg.ea.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public did d() {
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
      double $$0 = (double)ayz.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayz.a(this.i.e, 0.0F, 1.0F);
      return dgx.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::s);
   }

   private int s() {
      double $$0 = (double)ayz.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)ayz.a(this.i.e, 0.0F, 1.0F);
      return dgu.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dii h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dib> k() {
      return this.l.h();
   }

   public Optional<jr<avz>> l() {
      return this.l.i();
   }

   public Optional<dia> m() {
      return this.l.j();
   }

   public Optional<dhz> n() {
      return this.l.k();
   }

   public Optional<brj<avx>> o() {
      return this.l.l();
   }

   public float p() {
      return this.l.m();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dic.d c = dic.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dii e;
      @Nullable
      private dio f;
      @Nullable
      private did g;

      public dic.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dic.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dic.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dic.a a(dii $$0) {
         this.e = $$0;
         return this;
      }

      public dic.a a(dio $$0) {
         this.f = $$0;
         return this;
      }

      public dic.a a(did $$0) {
         this.g = $$0;
         return this;
      }

      public dic.a a(dic.d $$0) {
         this.c = $$0;
         return this;
      }

      public dic a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dic(new dic.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dic.d d, float e) {
      public static final MapCodec<dic.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dic.d.c.optionalFieldOf("temperature_modifier", dic.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dic.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dic.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements azv {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dic.c> d = azv.a(dic.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements azv {
      a("none") {
         @Override
         public float a(ji $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(ji $$0, float $$1) {
            double $$2 = dic.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dic.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dic.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dic.d> c = azv.a(dic.d::values);

      public abstract float a(ji var1, float var2);

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
