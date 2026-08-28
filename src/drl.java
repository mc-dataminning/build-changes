import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drl extends dmf implements dtq {
   public static final MapCodec<drl> b = b(drl::new);
   public static final eay c = eax.I;
   private static final Map<ja, eay> a = drz.h;
   protected static final ja[] d = ja.values();
   private final Function<eah, ffk> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends drl> a() {
      return b;
   }

   public drl(eag.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = ja.c.a.a().allMatch(this::a);
      this.g = ja.c.a.a().filter(ja.a.a).filter(this::a).count() % 2L == 0L;
      this.h = ja.c.a.a().filter(ja.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<eah, ffk> q() {
      Map<ja, ffk> $$0 = ffh.d(dmf.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffk $$2 = ffh.a();

         for (ja $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = ffh.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? ffh.b() : $$2;
      }, new ebk[]{c});
   }

   public static Set<ja> o(eah $$0) {
      if (!($$0.b() instanceof drl)) {
         return Set.of();
      } else {
         Set<ja> $$1 = EnumSet.noneOf(ja.class);

         for (ja $$2 : ja.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ja> a(byte $$0) {
      Set<ja> $$1 = EnumSet.noneOf(ja.class);

      for (ja $$2 : ja.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ja> $$0) {
      byte $$1 = 0;

      for (ja $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ja $$0) {
      return true;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      for (ja $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      if (!q($$0)) {
         return dmh.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      boolean $$3 = false;

      for (ja $$4 : d) {
         if (a($$0, $$4)) {
            if (!a($$1, $$2, $$4)) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dig $$0, eah $$1, iu $$2, ja $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iu $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public eah c(eah $$0, dig $$1, iu $$2, ja $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         eah $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(ewp.c)) {
            $$4 = this.m().b(eax.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      if ($$1 == dri.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dri.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private eah a(eah $$0, Function<ja, ja> $$1) {
      eah $$2 = $$0;

      for (ja $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(eah $$0, ja $$1) {
      eay $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dig $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      eah $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dig $$0, ja $$1, iu $$2, eah $$3) {
      return dmf.a($$3.h($$0, $$2), $$1.g()) || dmf.a($$3.g($$0, $$2), $$1.g());
   }

   private static eah a(eah $$0, eay $$1) {
      eah $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dmh.a.m();
   }

   public static eay b(ja $$0) {
      return a.get($$0);
   }

   private static eah a(eai<dmf, eah> $$0) {
      eah $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (eay $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(eah $$0) {
      for (ja $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(eah $$0) {
      for (ja $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
