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

public abstract class cxi extends csk {
   private static final float b = 1.0F;
   private static final ehy c = csk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy d = csk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ehy e = csk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehy f = csk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy g = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehy h = csk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hb, dfp> i = cxw.g;
   private static final Map<hb, ehy> j = ac.a(Maps.newEnumMap(hb.class), $$0 -> {
      $$0.put(hb.c, g);
      $$0.put(hb.f, f);
      $$0.put(hb.d, h);
      $$0.put(hb.e, e);
      $$0.put(hb.b, c);
      $$0.put(hb.a, d);
   });
   protected static final hb[] a = hb.values();
   private final ImmutableMap<dey, ehy> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cxi(dex.d $$0) {
      super($$0);
      this.k(a(this.C));
      this.k = this.a(cxi::o);
      this.l = hb.c.a.a().allMatch(this::a);
      this.m = hb.c.a.a().filter(hb.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hb.c.a.a().filter(hb.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<hb> h(dey $$0) {
      if (!($$0.b() instanceof cxi)) {
         return Set.of();
      } else {
         Set<hb> $$1 = EnumSet.noneOf(hb.class);

         for (hb $$2 : hb.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<hb> a(byte $$0) {
      Set<hb> $$1 = EnumSet.noneOf(hb.class);

      for (hb $$2 : hb.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<hb> $$0) {
      byte $$1 = 0;

      for (hb $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(hb $$0) {
      return true;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      for (hb $$1 : a) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!n($$0)) {
         return csl.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return (ehy)this.k.get($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      boolean $$3 = false;

      for (hb $$4 : a) {
         if (a($$0, $$4)) {
            gv $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      dey $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(coq $$0, dey $$1, gv $$2, hb $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gv $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dey c(dey $$0, coq $$1, gv $$2, hb $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dey $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(eac.c)) {
            $$4 = this.n().a(dfo.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      if ($$1 == cxf.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cxf.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dey a(dey $$0, Function<hb, hb> $$1) {
      dey $$2 = $$0;

      for (hb $$3 : a) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dey $$0, hb $$1) {
      dfp $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(coq $$0, hb $$1, gv $$2, dey $$3) {
      return csk.a($$3.l($$0, $$2), $$1.g()) || csk.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.C.d().contains(dfo.C);
   }

   private static dey a(dey $$0, dfp $$1) {
      dey $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : csl.a.n();
   }

   public static dfp b(hb $$0) {
      return i.get($$0);
   }

   private static dey a(dez<csk, dey> $$0) {
      dey $$1 = $$0.b();

      for (dfp $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ehy o(dey $$0) {
      ehy $$1 = ehv.a();

      for (hb $$2 : a) {
         if (a($$0, $$2)) {
            $$1 = ehv.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ehv.b() : $$1;
   }

   protected static boolean n(dey $$0) {
      return Arrays.stream(a).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dey $$0) {
      return Arrays.stream(a).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cxj b();
}
