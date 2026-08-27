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

public abstract class cxj extends csl {
   private static final float b = 1.0F;
   private static final ehw c = csl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw d = csl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ehw e = csl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehw f = csl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw g = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehw h = csl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ha, dfq> i = cxx.g;
   private static final Map<ha, ehw> j = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, g);
      $$0.put(ha.f, f);
      $$0.put(ha.d, h);
      $$0.put(ha.e, e);
      $$0.put(ha.b, c);
      $$0.put(ha.a, d);
   });
   protected static final ha[] a = ha.values();
   private final ImmutableMap<dez, ehw> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cxj(dey.d $$0) {
      super($$0);
      this.k(a(this.C));
      this.k = this.a(cxj::o);
      this.l = ha.c.a.a().allMatch(this::a);
      this.m = ha.c.a.a().filter(ha.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ha.c.a.a().filter(ha.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<ha> h(dez $$0) {
      if (!($$0.b() instanceof cxj)) {
         return Set.of();
      } else {
         Set<ha> $$1 = EnumSet.noneOf(ha.class);

         for (ha $$2 : ha.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ha> a(byte $$0) {
      Set<ha> $$1 = EnumSet.noneOf(ha.class);

      for (ha $$2 : ha.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ha> $$0) {
      byte $$1 = 0;

      for (ha $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ha $$0) {
      return true;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      for (ha $$1 : a) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!n($$0)) {
         return csm.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return (ehw)this.k.get($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      boolean $$3 = false;

      for (ha $$4 : a) {
         if (a($$0, $$4)) {
            gu $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cor $$0, dez $$1, gu $$2, ha $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gu $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dez c(dez $$0, cor $$1, gu $$2, ha $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dez $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ead.c)) {
            $$4 = this.n().a(dfp.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      if ($$1 == cxg.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cxg.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dez a(dez $$0, Function<ha, ha> $$1) {
      dez $$2 = $$0;

      for (ha $$3 : a) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dez $$0, ha $$1) {
      dfq $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cor $$0, ha $$1, gu $$2, dez $$3) {
      return csl.a($$3.l($$0, $$2), $$1.g()) || csl.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.C.d().contains(dfp.C);
   }

   private static dez a(dez $$0, dfq $$1) {
      dez $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : csm.a.n();
   }

   public static dfq b(ha $$0) {
      return i.get($$0);
   }

   private static dez a(dfa<csl, dez> $$0) {
      dez $$1 = $$0.b();

      for (dfq $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ehw o(dez $$0) {
      ehw $$1 = eht.a();

      for (ha $$2 : a) {
         if (a($$0, $$2)) {
            $$1 = eht.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eht.b() : $$1;
   }

   protected static boolean n(dez $$0) {
      return Arrays.stream(a).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dez $$0) {
      return Arrays.stream(a).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cxk b();
}
