import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Optional;
import javax.annotation.Nullable;

public final class det {
   public static final Codec<det> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               det.b.a.forGetter($$0x -> $$0x.i),
               dez.a.fieldOf("effects").forGetter($$0x -> $$0x.l),
               deu.b.forGetter($$0x -> $$0x.j),
               dff.c.forGetter($$0x -> $$0x.k)
            )
            .apply($$0, det::new)
   );
   public static final Codec<det> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(det.b.a.forGetter($$0x -> $$0x.i), dez.a.fieldOf("effects").forGetter($$0x -> $$0x.l))
            .apply($$0, ($$0x, $$1) -> new det($$0x, $$1, deu.a, dff.b))
   );
   public static final Codec<jn<det>> c = akx.a(lv.aF, a);
   public static final Codec<jr<det>> d = kc.a(lv.aF, a);
   private static final epg f = new epg(new eav(new dzx(1234L)), ImmutableList.of(0));
   static final epg g = new epg(new eav(new dzx(3456L)), ImmutableList.of(-2, -1, 0));
   @Deprecated(
      forRemoval = true
   )
   public static final epg e = new epg(new eav(new dzx(2345L)), ImmutableList.of(0));
   private static final int h = 1024;
   private final det.b i;
   private final deu j;
   private final dff k;
   private final dez l;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> ad.a(() -> {
         Long2FloatLinkedOpenHashMap $$0x = new Long2FloatLinkedOpenHashMap(1024, 0.25F) {
            protected void rehash(int $$0) {
            }
         };
         $$0x.defaultReturnValue(Float.NaN);
         return $$0x;
      }));

   det(det.b $$0, dez $$1, deu $$2, dff $$3) {
      this.i = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$1;
   }

   public int a() {
      return this.l.d();
   }

   public dff b() {
      return this.k;
   }

   public boolean c() {
      return this.i.a();
   }

   public det.c a(je $$0, int $$1) {
      if (!this.c()) {
         return det.c.a;
      } else {
         return this.b($$0, $$1) ? det.c.c : det.c.b;
      }
   }

   private float e(je $$0, int $$1) {
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
   private float f(je $$0, int $$1) {
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

   public boolean a(ddv $$0, je $$1) {
      return this.a($$0, $$1, true);
   }

   public boolean a(ddv $$0, je $$1, boolean $$2) {
      if (this.c($$1, $$0.N())) {
         return false;
      } else {
         if ($$1.v() >= $$0.G_() && $$1.v() < $$0.an() && $$0.a(deb.b, $$1) < 10) {
            dua $$3 = $$0.a_($$1);
            eqb $$4 = $$0.b_($$1);
            if ($$4.a() == eqc.c && $$3.b() instanceof dll) {
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

   public boolean b(je $$0, int $$1) {
      return !this.c($$0, $$1);
   }

   public boolean c(je $$0, int $$1) {
      return this.f($$0, $$1) >= 0.15F;
   }

   public boolean d(je $$0, int $$1) {
      return this.f($$0, $$1) > 0.1F;
   }

   public boolean b(ddv $$0, je $$1) {
      if (this.c($$1, $$0.N())) {
         return false;
      } else {
         if ($$1.v() >= $$0.G_() && $$1.v() < $$0.an() && $$0.a(deb.b, $$1) < 10) {
            dua $$2 = $$0.a_($$1);
            if (($$2.l() || $$2.a(dgx.dN)) && dgx.dN.o().a($$0, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public deu d() {
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
      double $$0 = (double)azc.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azc.a(this.i.e, 0.0F, 1.0F);
      return ddq.a($$0, $$1);
   }

   public int f() {
      return this.l.e().orElseGet(this::q);
   }

   private int q() {
      double $$0 = (double)azc.a(this.i.c, 0.0F, 1.0F);
      double $$1 = (double)azc.a(this.i.e, 0.0F, 1.0F);
      return ddm.a($$0, $$1);
   }

   public float g() {
      return this.i.c;
   }

   public dez h() {
      return this.l;
   }

   public int i() {
      return this.l.b();
   }

   public int j() {
      return this.l.c();
   }

   public Optional<des> k() {
      return this.l.h();
   }

   public Optional<jn<awc>> l() {
      return this.l.i();
   }

   public Optional<der> m() {
      return this.l.j();
   }

   public Optional<deq> n() {
      return this.l.k();
   }

   public Optional<awa> o() {
      return this.l.l();
   }

   public static class a {
      private boolean a = true;
      @Nullable
      private Float b;
      private det.d c = det.d.a;
      @Nullable
      private Float d;
      @Nullable
      private dez e;
      @Nullable
      private dff f;
      @Nullable
      private deu g;

      public det.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public det.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public det.a b(float $$0) {
         this.d = $$0;
         return this;
      }

      public det.a a(dez $$0) {
         this.e = $$0;
         return this;
      }

      public det.a a(dff $$0) {
         this.f = $$0;
         return this;
      }

      public det.a a(deu $$0) {
         this.g = $$0;
         return this;
      }

      public det.a a(det.d $$0) {
         this.c = $$0;
         return this;
      }

      public det a() {
         if (this.b != null && this.d != null && this.e != null && this.f != null && this.g != null) {
            return new det(new det.b(this.a, this.b, this.c, this.d), this.e, this.g, this.f);
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

   static record b(boolean b, float c, det.d d, float e) {
      public static final MapCodec<det.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("has_precipitation").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("temperature").forGetter($$0x -> $$0x.c),
                  det.d.c.optionalFieldOf("temperature_modifier", det.d.a).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("downfall").forGetter($$0x -> $$0x.e)
               )
               .apply($$0, det.b::new)
      );

      public boolean a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public det.d c() {
         return this.d;
      }

      public float d() {
         return this.e;
      }
   }

   public static enum c implements azy {
      a("none"),
      b("rain"),
      c("snow");

      public static final Codec<det.c> d = azy.a(det.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static enum d implements azy {
      a("none") {
         @Override
         public float a(je $$0, float $$1) {
            return $$1;
         }
      },
      b("frozen") {
         @Override
         public float a(je $$0, float $$1) {
            double $$2 = det.g.a((double)$$0.u() * 0.05, (double)$$0.w() * 0.05, false) * 7.0;
            double $$3 = det.e.a((double)$$0.u() * 0.2, (double)$$0.w() * 0.2, false);
            double $$4 = $$2 + $$3;
            if ($$4 < 0.3) {
               double $$5 = det.e.a((double)$$0.u() * 0.09, (double)$$0.w() * 0.09, false);
               if ($$5 < 0.8) {
                  return 0.2F;
               }
            }

            return $$1;
         }
      };

      private final String d;
      public static final Codec<det.d> c = azy.a(det.d::values);

      public abstract float a(je var1, float var2);

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
