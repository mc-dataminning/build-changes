import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpy extends dku implements dsb {
   public static final MapCodec<dpy> b = b(dpy::new);
   public static final dzd c = dzc.I;
   private static final Map<jo, dzd> a = dqm.h;
   protected static final jo[] d = jo.values();
   private final Function<dym, fdo> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dpy> a() {
      return b;
   }

   public dpy(dyl.d $$0) {
      super($$0);
      this.l(a(this.B));
      this.e = this.q();
      this.f = jo.c.a.a().allMatch(this::a);
      this.g = jo.c.a.a().filter(jo.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jo.c.a.a().filter(jo.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<dym, fdo> q() {
      Map<jo, fdo> $$0 = fdl.d(dku.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fdo $$2 = fdl.a();

         for (jo $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fdl.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fdl.b() : $$2;
      }, new dzp[]{c});
   }

   public static Set<jo> o(dym $$0) {
      if (!($$0.b() instanceof dpy)) {
         return Set.of();
      } else {
         Set<jo> $$1 = EnumSet.noneOf(jo.class);

         for (jo $$2 : jo.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jo> a(byte $$0) {
      Set<jo> $$1 = EnumSet.noneOf(jo.class);

      for (jo $$2 : jo.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jo> $$0) {
      byte $$1 = 0;

      for (jo $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jo $$0) {
      return true;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      for (jo $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      if (!q($$0)) {
         return dkw.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      boolean $$3 = false;

      for (jo $$4 : d) {
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
   protected boolean a(dym $$0, dbn $$1) {
      return !$$1.n().a(this.i()) || r($$0);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dgv $$0, dym $$1, jj $$2, jo $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jj $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dym c(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dym $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(euu.c)) {
            $$4 = this.m().b(dzc.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      if ($$1 == dpv.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dpv.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dym a(dym $$0, Function<jo, jo> $$1) {
      dym $$2 = $$0;

      for (jo $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dym $$0, jo $$1) {
      dzd $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dgv $$0, jj $$1, jo $$2) {
      jj $$3 = $$1.a($$2);
      dym $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dgv $$0, jo $$1, jj $$2, dym $$3) {
      return dku.a($$3.h($$0, $$2), $$1.g()) || dku.a($$3.g($$0, $$2), $$1.g());
   }

   private static dym a(dym $$0, dzd $$1) {
      dym $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dkw.a.m();
   }

   public static dzd b(jo $$0) {
      return a.get($$0);
   }

   private static dym a(dyn<dku, dym> $$0) {
      dym $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (dzd $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(dym $$0) {
      for (jo $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(dym $$0) {
      for (jo $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
