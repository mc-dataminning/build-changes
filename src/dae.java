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

public abstract class dae extends cvf {
   private static final float a = 1.0F;
   private static final eks c = cvf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks d = cvf.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eks e = cvf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eks f = cvf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks g = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eks h = cvf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ib, die> i = das.h;
   private static final Map<ib, eks> j = ac.a(Maps.newEnumMap(ib.class), $$0 -> {
      $$0.put(ib.c, g);
      $$0.put(ib.f, f);
      $$0.put(ib.d, h);
      $$0.put(ib.e, e);
      $$0.put(ib.b, c);
      $$0.put(ib.a, d);
   });
   protected static final ib[] b = ib.values();
   private final ImmutableMap<dhn, eks> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dae(dhm.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dae::o);
      this.l = ib.c.a.a().allMatch(this::a);
      this.m = ib.c.a.a().filter(ib.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ib.c.a.a().filter(ib.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dae> a();

   public static Set<ib> h(dhn $$0) {
      if (!($$0.b() instanceof dae)) {
         return Set.of();
      } else {
         Set<ib> $$1 = EnumSet.noneOf(ib.class);

         for (ib $$2 : ib.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ib> a(byte $$0) {
      Set<ib> $$1 = EnumSet.noneOf(ib.class);

      for (ib $$2 : ib.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ib> $$0) {
      byte $$1 = 0;

      for (ib $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ib $$0) {
      return true;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      for (ib $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!n($$0)) {
         return cvh.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return (eks)this.k.get($$0);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      boolean $$3 = false;

      for (ib $$4 : b) {
         if (a($$0, $$4)) {
            hx $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      csf $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(crl $$0, dhn $$1, hx $$2, ib $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         hx $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dhn c(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dhn $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ecy.c)) {
            $$4 = this.o().a(did.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      if ($$1 == dab.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dab.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dhn a(dhn $$0, Function<ib, ib> $$1) {
      dhn $$2 = $$0;

      for (ib $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dhn $$0, ib $$1) {
      die $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(crl $$0, ib $$1, hx $$2, dhn $$3) {
      return cvf.a($$3.l($$0, $$2), $$1.g()) || cvf.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(did.C);
   }

   private static dhn a(dhn $$0, die $$1) {
      dhn $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cvh.a.o();
   }

   public static die b(ib $$0) {
      return i.get($$0);
   }

   private static dhn a(dho<cvf, dhn> $$0) {
      dhn $$1 = $$0.b();

      for (die $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eks o(dhn $$0) {
      eks $$1 = ekp.a();

      for (ib $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ekp.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ekp.b() : $$1;
   }

   protected static boolean n(dhn $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dhn $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract daf c();
}
