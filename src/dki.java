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

public abstract class dki extends dfi {
   private static final float a = 1.0F;
   private static final exa c = dfi.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa d = dfi.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exa e = dfi.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exa f = dfi.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa g = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exa h = dfi.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jf, dtc> i = dkw.h;
   private static final Map<jf, exa> j = ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, g);
      $$0.put(jf.f, f);
      $$0.put(jf.d, h);
      $$0.put(jf.e, e);
      $$0.put(jf.b, c);
      $$0.put(jf.a, d);
   });
   protected static final jf[] b = jf.values();
   private final ImmutableMap<dsl, exa> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dki(dsk.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dki::o);
      this.l = jf.c.a.a().allMatch(this::a);
      this.m = jf.c.a.a().filter(jf.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jf.c.a.a().filter(jf.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dki> a();

   public static Set<jf> m(dsl $$0) {
      if (!($$0.b() instanceof dki)) {
         return Set.of();
      } else {
         Set<jf> $$1 = EnumSet.noneOf(jf.class);

         for (jf $$2 : jf.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jf> a(byte $$0) {
      Set<jf> $$1 = EnumSet.noneOf(jf.class);

      for (jf $$2 : jf.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jf> $$0) {
      byte $$1 = 0;

      for (jf $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jf $$0) {
      return true;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      for (jf $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!n($$0)) {
         return dfk.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return (exa)this.k.get($$0);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      boolean $$3 = false;

      for (jf $$4 : b) {
         if (a($$0, $$4)) {
            ja $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsl $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dbm $$0, dsl $$1, ja $$2, jf $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ja $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dsl c(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dsl $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(eok.c)) {
            $$4 = this.o().a(dtb.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      if ($$1 == dkf.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dkf.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dsl a(dsl $$0, Function<jf, jf> $$1) {
      dsl $$2 = $$0;

      for (jf $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dsl $$0, jf $$1) {
      dtc $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dbm $$0, jf $$1, ja $$2, dsl $$3) {
      return dfi.a($$3.l($$0, $$2), $$1.g()) || dfi.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(dtb.C);
   }

   private static dsl a(dsl $$0, dtc $$1) {
      dsl $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfk.a.o();
   }

   public static dtc b(jf $$0) {
      return i.get($$0);
   }

   private static dsl a(dsm<dfi, dsl> $$0) {
      dsl $$1 = $$0.b();

      for (dtc $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static exa o(dsl $$0) {
      exa $$1 = ewx.a();

      for (jf $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ewx.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ewx.b() : $$1;
   }

   protected static boolean n(dsl $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dsl $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dkj c();
}
