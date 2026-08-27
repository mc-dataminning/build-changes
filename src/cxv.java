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

public abstract class cxv extends csx {
   private static final float b = 1.0F;
   private static final eii c = csx.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii d = csx.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eii e = csx.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eii f = csx.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii g = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eii h = csx.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hc, dgc> i = cyj.g;
   private static final Map<hc, eii> j = ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, g);
      $$0.put(hc.f, f);
      $$0.put(hc.d, h);
      $$0.put(hc.e, e);
      $$0.put(hc.b, c);
      $$0.put(hc.a, d);
   });
   protected static final hc[] a = hc.values();
   private final ImmutableMap<dfl, eii> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cxv(dfk.d $$0) {
      super($$0);
      this.k(a(this.C));
      this.k = this.a(cxv::o);
      this.l = hc.c.a.a().allMatch(this::a);
      this.m = hc.c.a.a().filter(hc.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hc.c.a.a().filter(hc.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<hc> h(dfl $$0) {
      if (!($$0.b() instanceof cxv)) {
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
   protected void a(dfm.a<csx, dfl> $$0) {
      for (hc $$1 : a) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!n($$0)) {
         return csy.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return (eii)this.k.get($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
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
   public boolean a(dfl $$0, clp $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cpd $$0, dfl $$1, gw $$2, hc $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gw $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dfl c(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dfl $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(eap.c)) {
            $$4 = this.n().a(dgb.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      if ($$1 == cxs.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cxs.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dfl a(dfl $$0, Function<hc, hc> $$1) {
      dfl $$2 = $$0;

      for (hc $$3 : a) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dfl $$0, hc $$1) {
      dgc $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cpd $$0, hc $$1, gw $$2, dfl $$3) {
      return csx.a($$3.l($$0, $$2), $$1.g()) || csx.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.C.d().contains(dgb.C);
   }

   private static dfl a(dfl $$0, dgc $$1) {
      dfl $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : csy.a.n();
   }

   public static dgc b(hc $$0) {
      return i.get($$0);
   }

   private static dfl a(dfm<csx, dfl> $$0) {
      dfl $$1 = $$0.b();

      for (dgc $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eii o(dfl $$0) {
      eii $$1 = eif.a();

      for (hc $$2 : a) {
         if (a($$0, $$2)) {
            $$1 = eif.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eif.b() : $$1;
   }

   protected static boolean n(dfl $$0) {
      return Arrays.stream(a).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dfl $$0) {
      return Arrays.stream(a).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cxw b();
}
