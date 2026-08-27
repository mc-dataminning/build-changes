import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class cxo extends csq {
   private static final float b = 1.0F;
   private static final eib c = csq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib d = csq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eib e = csq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eib f = csq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib g = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eib h = csq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hc, dfv> i = cyc.g;
   private static final Map<hc, eib> j = ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, g);
      $$0.put(hc.f, f);
      $$0.put(hc.d, h);
      $$0.put(hc.e, e);
      $$0.put(hc.b, c);
      $$0.put(hc.a, d);
   });
   protected static final hc[] a = hc.values();
   private final ImmutableMap<dfe, eib> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cxo(dfd.d $$0) {
      super($$0);
      this.k(a(this.C));
      this.k = this.a(cxo::o);
      this.l = hc.c.a.a().allMatch(this::a);
      this.m = hc.c.a.a().filter(hc.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hc.c.a.a().filter(hc.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<hc> h(dfe $$0) {
      if (!($$0.b() instanceof cxo)) {
         return Set.of();
      } else {
         Set<hc> $$1 = EnumSet.noneOf(hc.class);

         for (hc $$2 : hc.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<hc> a(byte $$0) {
      Set<hc> $$1 = EnumSet.noneOf(hc.class);

      for (hc $$2 : hc.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<hc> $$0) {
      byte $$1 = 0;

      for (hc $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(hc $$0) {
      return true;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      for (hc $$1 : a) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!n($$0)) {
         return csr.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return (eib)this.k.get($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      boolean $$3 = false;

      for (hc $$4 : a) {
         if (a($$0, $$4)) {
            gw $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cow $$0, dfe $$1, gw $$2, hc $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gw $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dfe c(dfe $$0, cow $$1, gw $$2, hc $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dfe $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(eai.c)) {
            $$4 = this.n().a(dfu.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      if ($$1 == cxl.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cxl.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dfe a(dfe $$0, Function<hc, hc> $$1) {
      dfe $$2 = $$0;

      for (hc $$3 : a) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dfe $$0, hc $$1) {
      dfv $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cow $$0, hc $$1, gw $$2, dfe $$3) {
      return csq.a($$3.l($$0, $$2), $$1.g()) || csq.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.C.d().contains(dfu.C);
   }

   private static dfe a(dfe $$0, dfv $$1) {
      dfe $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : csr.a.n();
   }

   public static dfv b(hc $$0) {
      return i.get($$0);
   }

   private static dfe a(dff<csq, dfe> $$0) {
      dfe $$1 = $$0.b();

      for (dfv $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eib o(dfe $$0) {
      eib $$1 = ehy.a();

      for (hc $$2 : a) {
         if (a($$0, $$2)) {
            $$1 = ehy.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ehy.b() : $$1;
   }

   protected static boolean n(dfe $$0) {
      return Arrays.stream(a).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dfe $$0) {
      return Arrays.stream(a).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cxp b();
}
