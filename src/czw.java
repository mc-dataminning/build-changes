import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class czw {
   public static final Codec<czw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czw.b.a.forGetter($$0x -> $$0x.i),
               dac.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               czx.b.forGetter($$0x -> $$0x.j),
               dai.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, czw::new)
   );
   public static final Codec<czw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(czw.b.a.forGetter($$0x -> $$0x.i), dac.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new czw($$0x, $$1, czx.a, dai.b))
   );
   public static final Codec<il<czw>> c = ajp.a(ks.av, a);
   public static final Codec<ip<czw>> d = ja.a(ks.av, a);
   private static final ejx f = new ejx(new dvq(new dus(1234L)), ImmutableList.of(0));
   static final ejx g = new ejx(new dvq(new dus(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final ejx e = new ejx(new dvq(new dus(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final czw.b i;
   private final czx j;
   private final dai k;
   private final dac l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ac.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   czw(czw.b $$0, dac $$1, czx $$2, dai $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dai b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public czw.c a(ib $$0) {
      if (!this.c()) {
         return czw.c.a;
      } else {
         return this.b($$0) ? czw.c.c : czw.c.b;
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

   public boolean a(cza $$0, ib $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(cza $$0, ib $$1, boolean $$2) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.al() && $$0.a(czg.b, $$1) < 10) {
            doz $$3 = $$0.a_($$1);
            eks $$4 = $$0.b_($$1);
            if ($$4.a() == ekt.c && $$3.b() instanceof dgn) {
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

   public boolean b(cza $$0, ib $$1) {
      if (this.c($$1)) {
         return false;
      } else {
         if ($$1.v() >= $$0.I_() && $$1.v() < $$0.al() && $$0.a(czg.b, $$1) < 10) {
            doz $$2 = $$0.a_($$1);
            if (($$2.i() || $$2.a(dca.dN)) && dca.dN.n().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public czx d() {
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
      double $$0 = (double)axk.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)axk.a(this.i.e, 0.0F, 1.0F);
      return cyv.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)axk.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)axk.a(this.i.e, 0.0F, 1.0F);
      return cyr.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dac h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<czv> k() {
      return this.l.h();
   }

   public Optional<il<aul>> l() {
      return this.l.i();
   }

   public Optional<czu> m() {
      return this.l.j();
   }

   public Optional<czt> n() {
      return this.l.k();
   }

   public Optional<auj> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private czw.d c = czw.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dac e;
      @Nullable
      private dai f;
      @Nullable
      private czx g;

      public czw.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public czw.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public czw.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public czw.a a(dac $$0) {
         this.e = $$0;
         return this;
      }

      public czw.a a(dai $$0) {
         this.f = $$0;
         return this;
      }

      public czw.a a(czx $$0) {
         this.g = $$0;
         return this;
      }

      public czw.a a(czw.d $$0) {
         this.c = $$0;
         return this;
      }

      public czw a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new czw(new czw.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, czw.d d, float e) {
      public static final MapCodec<czw.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  czw.d.c.optionalFieldOf("temperature_modifier", czw.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, czw.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public czw.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements aye {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<czw.c> d = aye.a(czw.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements aye {
      a("none") {
         @Override
         public float a(ib $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(ib $$0, float $$1) {
            double $$2 = czw.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = czw.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = czw.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<czw.d> c = aye.a(czw.d::values);

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
