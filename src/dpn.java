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

public abstract class dpn extends dkl {
   private static final float a = 1.0F;
   private static final fcr c = dkl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr d = dkl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcr e = dkl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcr f = dkl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr g = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcr h = dkl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dyl> i = dqb.h;
   private static final Map<jm, fcr> j = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, g);
      $$0.put(jm.f, f);
      $$0.put(jm.d, h);
      $$0.put(jm.e, e);
      $$0.put(jm.b, c);
      $$0.put(jm.a, d);
   });
   protected static final jm[] b = jm.values();
   private final ImmutableMap<dxu, fcr> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dpn(dxt.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dpn::r);
      this.l = jm.c.a.a().allMatch(this::a);
      this.m = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dpn> a();

   public static Set<jm> o(dxu $$0) {
      if (!($$0.b() instanceof dpn)) {
         return Set.of();
      } else {
         Set<jm> $$1 = EnumSet.noneOf(jm.class);

         for (jm $$2 : jm.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jm> a(byte $$0) {
      Set<jm> $$1 = EnumSet.noneOf(jm.class);

      for (jm $$2 : jm.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jm> $$0) {
      byte $$1 = 0;

      for (jm $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jm $$0) {
      return true;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      for (jm $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!q($$0)) {
         return dkn.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return (fcr)this.k.get($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      boolean $$3 = false;

      for (jm $$4 : b) {
         if (a($$0, $$4)) {
            jh $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dhh $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxu $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dgm $$0, dxu $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dxu c(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dxu $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(etx.c)) {
            $$4 = this.m().b(dyk.D, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      if ($$1 == dpk.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dpk.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dxu a(dxu $$0, Function<jm, jm> $$1) {
      dxu $$2 = $$0;

      for (jm $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dxu $$0, jm $$1) {
      dyl $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dgm $$0, jm $$1, jh $$2, dxu $$3) {
      return dkl.a($$3.h($$0, $$2), $$1.g()) || dkl.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dyk.D);
   }

   private static dxu a(dxu $$0, dyl $$1) {
      dxu $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dkn.a.m();
   }

   public static dyl b(jm $$0) {
      return i.get($$0);
   }

   private static dxu a(dxv<dkl, dxu> $$0) {
      dxu $$1 = $$0.b();

      for (dyl $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fcr r(dxu $$0) {
      fcr $$1 = fco.a();

      for (jm $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = fco.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? fco.b() : $$1;
   }

   protected static boolean q(dxu $$0) {
      for (jm $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dxu $$0) {
      for (jm $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dpo c();
}
