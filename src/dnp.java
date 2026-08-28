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

public abstract class dnp extends diq {
   private static final float a = 1.0F;
   private static final fas c = diq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas d = diq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fas e = diq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fas f = diq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas g = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fas h = diq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dwm> i = dod.h;
   private static final Map<jm, fas> j = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, g);
      $$0.put(jm.f, f);
      $$0.put(jm.d, h);
      $$0.put(jm.e, e);
      $$0.put(jm.b, c);
      $$0.put(jm.a, d);
   });
   protected static final jm[] b = jm.values();
   private final ImmutableMap<dvv, fas> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dnp(dvu.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dnp::r);
      this.l = jm.c.a.a().allMatch(this::a);
      this.m = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dnp> a();

   public static Set<jm> o(dvv $$0) {
      if (!($$0.b() instanceof dnp)) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      for (jm $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!q($$0)) {
         return dis.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return (fas)this.k.get($$0);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
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
   protected boolean a(dvv $$0, dad $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(der $$0, dvv $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dvv c(dvv $$0, der $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dvv $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(erw.c)) {
            $$4 = this.m().b(dwl.C, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      if ($$1 == dnm.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dnm.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dvv a(dvv $$0, Function<jm, jm> $$1) {
      dvv $$2 = $$0;

      for (jm $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dvv $$0, jm $$1) {
      dwm $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(der $$0, jm $$1, jh $$2, dvv $$3) {
      return diq.a($$3.h($$0, $$2), $$1.g()) || diq.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dwl.C);
   }

   private static dvv a(dvv $$0, dwm $$1) {
      dvv $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dis.a.m();
   }

   public static dwm b(jm $$0) {
      return i.get($$0);
   }

   private static dvv a(dvw<diq, dvv> $$0) {
      dvv $$1 = $$0.b();

      for (dwm $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fas r(dvv $$0) {
      fas $$1 = fap.a();

      for (jm $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = fap.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? fap.b() : $$1;
   }

   protected static boolean q(dvv $$0) {
      for (jm $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dvv $$0) {
      for (jm $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dnq c();
}
