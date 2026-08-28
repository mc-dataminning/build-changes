import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class dmx extends dhy {
   private static final float a = 1.0F;
   private static final fab c = dhy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab d = dhy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fab e = dhy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fab f = dhy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab g = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fab h = dhy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jl, dvu> i = dnl.h;
   private static final Map<jl, fab> j = ad.a(Maps.newEnumMap(jl.class), $$0 -> {
      $$0.put(jl.c, g);
      $$0.put(jl.f, f);
      $$0.put(jl.d, h);
      $$0.put(jl.e, e);
      $$0.put(jl.b, c);
      $$0.put(jl.a, d);
   });
   protected static final jl[] b = jl.values();
   private final ImmutableMap<dvd, fab> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dmx(dvc.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dmx::r);
      this.l = jl.c.a.a().allMatch(this::a);
      this.m = jl.c.a.a().filter(jl.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jl.c.a.a().filter(jl.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dmx> a();

   public static Set<jl> o(dvd $$0) {
      if (!($$0.b() instanceof dmx)) {
         return Set.of();
      } else {
         Set<jl> $$1 = EnumSet.noneOf(jl.class);

         for (jl $$2 : jl.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jl> a(byte $$0) {
      Set<jl> $$1 = EnumSet.noneOf(jl.class);

      for (jl $$2 : jl.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jl> $$0) {
      byte $$1 = 0;

      for (jl $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jl $$0) {
      return true;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      for (jl $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!q($$0)) {
         return dia.a.m();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return (fab)this.k.get($$0);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      boolean $$3 = false;

      for (jl $$4 : b) {
         if (a($$0, $$4)) {
            jg $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dea $$0, dvd $$1, jg $$2, jl $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jg $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dvd c(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dvd $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(erf.c)) {
            $$4 = this.m().b(dvt.C, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      if ($$1 == dmu.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dmu.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dvd a(dvd $$0, Function<jl, jl> $$1) {
      dvd $$2 = $$0;

      for (jl $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dvd $$0, jl $$1) {
      dvu $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dea $$0, jl $$1, jg $$2, dvd $$3) {
      return dhy.a($$3.h($$0, $$2), $$1.g()) || dhy.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dvt.C);
   }

   private static dvd a(dvd $$0, dvu $$1) {
      dvd $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dia.a.m();
   }

   public static dvu b(jl $$0) {
      return i.get($$0);
   }

   private static dvd a(dve<dhy, dvd> $$0) {
      dvd $$1 = $$0.b();

      for (dvu $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fab r(dvd $$0) {
      fab $$1 = ezy.a();

      for (jl $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ezy.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ezy.b() : $$1;
   }

   protected static boolean q(dvd $$0) {
      for (jl $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dvd $$0) {
      for (jl $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dmy c();
}
