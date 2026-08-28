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

public abstract class dkw extends dfw {
   private static final float a = 1.0F;
   private static final exp c = dfw.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp d = dfw.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final exp e = dfw.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exp f = dfw.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp g = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exp h = dfw.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ji, dtr> i = dlk.h;
   private static final Map<ji, exp> j = ad.a(Maps.newEnumMap(ji.class), $$0 -> {
      $$0.put(ji.c, g);
      $$0.put(ji.f, f);
      $$0.put(ji.d, h);
      $$0.put(ji.e, e);
      $$0.put(ji.b, c);
      $$0.put(ji.a, d);
   });
   protected static final ji[] b = ji.values();
   private final ImmutableMap<dta, exp> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dkw(dsz.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dkw::o);
      this.l = ji.c.a.a().allMatch(this::a);
      this.m = ji.c.a.a().filter(ji.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ji.c.a.a().filter(ji.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   public static Set<ji> m(dta $$0) {
      if (!($$0.b() instanceof dkw)) {
         return Set.of();
      } else {
         Set<ji> $$1 = EnumSet.noneOf(ji.class);

         for (ji $$2 : ji.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ji> a(byte $$0) {
      Set<ji> $$1 = EnumSet.noneOf(ji.class);

      for (ji $$2 : ji.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ji> $$0) {
      byte $$1 = 0;

      for (ji $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ji $$0) {
      return true;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      for (ji $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!n($$0)) {
         return dfy.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return (exp)this.k.get($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      boolean $$3 = false;

      for (ji $$4 : b) {
         if (a($$0, $$4)) {
            jd $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dcu $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dca $$0, dta $$1, jd $$2, ji $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jd $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dta c(dta $$0, dca $$1, jd $$2, ji $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dta $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(eoz.c)) {
            $$4 = this.o().a(dtq.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      if ($$1 == dkt.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dkt.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dta a(dta $$0, Function<ji, ji> $$1) {
      dta $$2 = $$0;

      for (ji $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dta $$0, ji $$1) {
      dtr $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dca $$0, ji $$1, jd $$2, dta $$3) {
      return dfw.a($$3.l($$0, $$2), $$1.g()) || dfw.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(dtq.C);
   }

   private static dta a(dta $$0, dtr $$1) {
      dta $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfy.a.o();
   }

   public static dtr b(ji $$0) {
      return i.get($$0);
   }

   private static dta a(dtb<dfw, dta> $$0) {
      dta $$1 = $$0.b();

      for (dtr $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static exp o(dta $$0) {
      exp $$1 = exm.a();

      for (ji $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = exm.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? exm.b() : $$1;
   }

   protected static boolean n(dta $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dta $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dkx c();
}
