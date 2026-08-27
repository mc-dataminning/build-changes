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

public abstract class dkh extends dfc {
   private static final float a = 1.0F;
   private static final exn c = dfc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn d = dfc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exn e = dfc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exn f = dfc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn g = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exn h = dfc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<iw, dtt> i = dkw.h;
   private static final Map<iw, exn> j = ad.a(Maps.newEnumMap(iw.class), $$0 -> {
      $$0.put(iw.c, g);
      $$0.put(iw.f, f);
      $$0.put(iw.d, h);
      $$0.put(iw.e, e);
      $$0.put(iw.b, c);
      $$0.put(iw.a, d);
   });
   protected static final iw[] b = iw.values();
   private final ImmutableMap<dtc, exn> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dkh(dtb.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dkh::o);
      this.l = iw.c.a.a().allMatch(this::a);
      this.m = iw.c.a.a().filter(iw.a.a).filter(this::a).count() % 2L == 0L;
      this.n = iw.c.a.a().filter(iw.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dkh> a();

   public static Set<iw> m(dtc $$0) {
      if (!($$0.b() instanceof dkh)) {
         return Set.of();
      } else {
         Set<iw> $$1 = EnumSet.noneOf(iw.class);

         for (iw $$2 : iw.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<iw> a(byte $$0) {
      Set<iw> $$1 = EnumSet.noneOf(iw.class);

      for (iw $$2 : iw.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<iw> $$0) {
      byte $$1 = 0;

      for (iw $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(iw $$0) {
      return true;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      for (iw $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (!n($$0)) {
         return dfe.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return (exn)this.k.get($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      boolean $$3 = false;

      for (iw $$4 : b) {
         if (a($$0, $$4)) {
            ir $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dbg $$0, dtc $$1, ir $$2, iw $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ir $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dtc c(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dtc $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.k() && $$0.u().a(epf.c)) {
            $$4 = this.n().a(dts.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      if ($$1 == dke.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dke.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dtc a(dtc $$0, Function<iw, iw> $$1) {
      dtc $$2 = $$0;

      for (iw $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dtc $$0, iw $$1) {
      dtt $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dbg $$0, iw $$1, ir $$2, dtc $$3) {
      return dfc.a($$3.l($$0, $$2), $$1.g()) || dfc.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean k() {
      return this.E.d().contains(dts.C);
   }

   private static dtc a(dtc $$0, dtt $$1) {
      dtc $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfe.a.n();
   }

   public static dtt b(iw $$0) {
      return i.get($$0);
   }

   private static dtc a(dtd<dfc, dtc> $$0) {
      dtc $$1 = $$0.b();

      for (dtt $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static exn o(dtc $$0) {
      exn $$1 = exk.a();

      for (iw $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = exk.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? exk.b() : $$1;
   }

   protected static boolean n(dtc $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dtc $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dki c();
}
