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

public abstract class dkh extends dfh {
   private static final float a = 1.0F;
   private static final ewy c = dfh.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy d = dfh.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewy e = dfh.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewy f = dfh.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy g = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewy h = dfh.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jf, dtb> i = dkv.h;
   private static final Map<jf, ewy> j = ac.a(Maps.newEnumMap(jf.class), $$0 -> {
      $$0.put(jf.c, g);
      $$0.put(jf.f, f);
      $$0.put(jf.d, h);
      $$0.put(jf.e, e);
      $$0.put(jf.b, c);
      $$0.put(jf.a, d);
   });
   protected static final jf[] b = jf.values();
   private final ImmutableMap<dsk, ewy> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dkh(dsj.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dkh::o);
      this.l = jf.c.a.a().allMatch(this::a);
      this.m = jf.c.a.a().filter(jf.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jf.c.a.a().filter(jf.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dkh> a();

   public static Set<jf> m(dsk $$0) {
      if (!($$0.b() instanceof dkh)) {
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      for (jf $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!n($$0)) {
         return dfj.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return (ewy)this.k.get($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
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
   protected boolean a(dsk $$0, cxm $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dcf $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dbl $$0, dsk $$1, ja $$2, jf $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ja $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dsk c(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dsk $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(eoi.c)) {
            $$4 = this.o().a(dta.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      if ($$1 == dke.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dke.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dsk a(dsk $$0, Function<jf, jf> $$1) {
      dsk $$2 = $$0;

      for (jf $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dsk $$0, jf $$1) {
      dtb $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dbl $$0, jf $$1, ja $$2, dsk $$3) {
      return dfh.a($$3.l($$0, $$2), $$1.g()) || dfh.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(dta.C);
   }

   private static dsk a(dsk $$0, dtb $$1) {
      dsk $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfj.a.o();
   }

   public static dtb b(jf $$0) {
      return i.get($$0);
   }

   private static dsk a(dsl<dfh, dsk> $$0) {
      dsk $$1 = $$0.b();

      for (dtb $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ewy o(dsk $$0) {
      ewy $$1 = ewv.a();

      for (jf $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ewv.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ewv.b() : $$1;
   }

   protected static boolean n(dsk $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dsk $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dki c();
}
