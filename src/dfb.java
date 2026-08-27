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

public abstract class dfb extends dac {
   private static final float a = 1.0F;
   private static final eqm c = dac.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm d = dac.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eqm e = dac.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqm f = dac.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm g = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqm h = dac.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, dns> i = dfp.h;
   private static final Map<ih, eqm> j = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, g);
      $$0.put(ih.f, f);
      $$0.put(ih.d, h);
      $$0.put(ih.e, e);
      $$0.put(ih.b, c);
      $$0.put(ih.a, d);
   });
   protected static final ih[] b = ih.values();
   private final ImmutableMap<dnb, eqm> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dfb(dna.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dfb::o);
      this.l = ih.c.a.a().allMatch(this::a);
      this.m = ih.c.a.a().filter(ih.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ih.c.a.a().filter(ih.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dfb> a();

   public static Set<ih> m(dnb $$0) {
      if (!($$0.b() instanceof dfb)) {
         return Set.of();
      } else {
         Set<ih> $$1 = EnumSet.noneOf(ih.class);

         for (ih $$2 : ih.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ih> a(byte $$0) {
      Set<ih> $$1 = EnumSet.noneOf(ih.class);

      for (ih $$2 : ih.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ih> $$0) {
      byte $$1 = 0;

      for (ih $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ih $$0) {
      return true;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      for (ih $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!n($$0)) {
         return dae.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return (eqm)this.k.get($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      boolean $$3 = false;

      for (ih $$4 : b) {
         if (a($$0, $$4)) {
            ib $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      cxb $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cwh $$0, dnb $$1, ib $$2, ih $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ib $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dnb c(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dnb $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.i() && $$0.u().a(eiq.c)) {
            $$4 = this.o().a(dnr.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      if ($$1 == dey.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dey.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dnb a(dnb $$0, Function<ih, ih> $$1) {
      dnb $$2 = $$0;

      for (ih $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dnb $$0, ih $$1) {
      dns $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cwh $$0, ih $$1, ib $$2, dnb $$3) {
      return dac.a($$3.l($$0, $$2), $$1.g()) || dac.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean i() {
      return this.E.d().contains(dnr.C);
   }

   private static dnb a(dnb $$0, dns $$1) {
      dnb $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dae.a.o();
   }

   public static dns b(ih $$0) {
      return i.get($$0);
   }

   private static dnb a(dnc<dac, dnb> $$0) {
      dnb $$1 = $$0.b();

      for (dns $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eqm o(dnb $$0) {
      eqm $$1 = eqj.a();

      for (ih $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eqj.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eqj.b() : $$1;
   }

   protected static boolean n(dnb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dnb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dfc c();
}
