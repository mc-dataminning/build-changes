import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class dib {
   public static final Codec<dib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dib.b.a.forGetter($$0x -> $$0x.i),
               dih.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               dic.b.forGetter($$0x -> $$0x.j),
               din.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dib::new)
   );
   public static final Codec<dib> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dib.b.a.forGetter($$0x -> $$0x.i), dih.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new dib($$0x, $$1, dic.a, din.b))
   );
   public static final Codec<jq<dib>> c = all.a(mb.aI, a);
   public static final Codec<ju<dib>> d = kf.a(mb.aI, a);
   private static final esv f = new esv(new eei(new edk(1234L)), ImmutableList.of(0));
   static final esv g = new esv(new eei(new edk(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final esv e = new esv(new eei(new edk(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final dib.b i;
   private final dic j;
   private final din k;
   private final dih l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ae.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   dib(dib.b $$0, dih $$1, dic $$2, din $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public din b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public dib.c a(jh $$0, int $$1) {
      if (!this.c()) {
         return dib.c.a;
      } else {
         return this.b($$0, $$1) ? dib.c.c : dib.c.b;
      }
   }

   private float e(jh $$0, int $$1) {
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
   private float f(jh $$0, int $$1) {
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

   public boolean a(dhc $$0, jh $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(dhc $$0, jh $$1, boolean $$2) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dhi.b, $$1) < 10) {
            dxo $$3 = $$0.a_($$1);
            etq $$4 = $$0.b_($$1);
            if ($$4.a() == etr.c && $$3.b() instanceof dov) {
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

   public boolean b(jh $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(jh $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(jh $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(dhc $$0, jh $$1) {
      if (this.c($$1, $$0.P())) {
         return false;
      } else {
         if ($$0.d($$1.v()) && $$0.a(dhi.b, $$1) < 10) {
            dxo $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dkf.ea)) && dkf.ea.m().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dic d() {
      return this.j;
   }

   public int e() {
      return this.l.a();
   }

   public int a(double $$0, double $$1) {
      int $$2 = this.l.f().orElseGet(this::q);
      return this.l.g().a($$0, $$1, $$2);
   }

   private int q() {
      double $$0 = (double)azu.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azu.a(this.i.e, 0.0F, 1.0F);
      return dgx.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::r);
   }

   private int r() {
      double $$0 = (double)azu.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azu.a(this.i.e, 0.0F, 1.0F);
      return dgt.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dih h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<dia> k() {
      return this.l.h();
   }

   public Optional<jq<awu>> l() {
      return this.l.i();
   }

   public Optional<dhz> m() {
      return this.l.j();
   }

   public Optional<dhy> n() {
      return this.l.k();
   }

   public Optional<bri<aws>> o() {
      return this.l.l();
   }

   public float p() {
      return this.l.m();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private dib.d c = dib.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dih e;
      @Nullable
      private din f;
      @Nullable
      private dic g;

      public dib.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public dib.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public dib.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public dib.a a(dih $$0) {
         this.e = $$0;
         return this;
      }

      public dib.a a(din $$0) {
         this.f = $$0;
         return this;
      }

      public dib.a a(dic $$0) {
         this.g = $$0;
         return this;
      }

      public dib.a a(dib.d $$0) {
         this.c = $$0;
         return this;
      }

      public dib a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new dib(new dib.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, dib.d d, float e) {
      public static final MapCodec<dib.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  dib.d.c.optionalFieldOf("temperature_modifier", dib.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, dib.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public dib.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements baq {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<dib.c> d = baq.a(dib.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements baq {
      a("none") {
         @Override
         public float a(jh $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(jh $$0, float $$1) {
            double $$2 = dib.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = dib.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = dib.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<dib.d> c = baq.a(dib.d::values);

      public abstract float a(jh var1, float var2);

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
