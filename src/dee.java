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

public abstract class dee extends czf {
   private static final float a = 1.0F;
   private static final epo c = czf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo d = czf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final epo e = czf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final epo f = czf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo g = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final epo h = czf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, dmv> i = des.h;
   private static final Map<ih, epo> j = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, g);
      $$0.put(ih.f, f);
      $$0.put(ih.d, h);
      $$0.put(ih.e, e);
      $$0.put(ih.b, c);
      $$0.put(ih.a, d);
   });
   protected static final ih[] b = ih.values();
   private final ImmutableMap<dme, epo> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dee(dmd.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dee::o);
      this.l = ih.c.a.a().allMatch(this::a);
      this.m = ih.c.a.a().filter(ih.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ih.c.a.a().filter(ih.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dee> a();

   public static Set<ih> m(dme $$0) {
      if (!($$0.b() instanceof dee)) {
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
   protected void a(dmf.a<czf, dme> $$0) {
      for (ih $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!n($$0)) {
         return czh.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return (epo)this.k.get($$0);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
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
   protected boolean a(dme $$0, crx $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      cwe $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cvk $$0, dme $$1, ib $$2, ih $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ib $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dme c(dme $$0, cvk $$1, ib $$2, ih $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dme $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.i() && $$0.u().a(ehs.c)) {
            $$4 = this.o().a(dmu.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      if ($$1 == deb.c && !this.m) {
         return $$0;
      } else {
         return $$1 == deb.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dme a(dme $$0, Function<ih, ih> $$1) {
      dme $$2 = $$0;

      for (ih $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dme $$0, ih $$1) {
      dmv $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cvk $$0, ih $$1, ib $$2, dme $$3) {
      return czf.a($$3.l($$0, $$2), $$1.g()) || czf.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean i() {
      return this.E.d().contains(dmu.C);
   }

   private static dme a(dme $$0, dmv $$1) {
      dme $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : czh.a.o();
   }

   public static dmv b(ih $$0) {
      return i.get($$0);
   }

   private static dme a(dmf<czf, dme> $$0) {
      dme $$1 = $$0.b();

      for (dmv $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static epo o(dme $$0) {
      epo $$1 = epl.a();

      for (ih $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = epl.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? epl.b() : $$1;
   }

   protected static boolean n(dme $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dme $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract def c();
}
