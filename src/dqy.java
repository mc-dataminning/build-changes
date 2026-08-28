import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqy extends dlu implements dtb {
   public static final MapCodec<dqy> b = b(dqy::new);
   public static final eaf c = eae.I;
   private static final Map<ja, eaf> a = drm.h;
   protected static final ja[] d = ja.values();
   private final Function<dzo, feq> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dqy> a() {
      return b;
   }

   public dqy(dzn.d $$0) {
      super($$0);
      this.l(a(this.B));
      this.e = this.q();
      this.f = ja.c.a.a().allMatch(this::a);
      this.g = ja.c.a.a().filter(ja.a.a).filter(this::a).count() % 2L == 0L;
      this.h = ja.c.a.a().filter(ja.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<dzo, feq> q() {
      Map<ja, feq> $$0 = fen.d(dlu.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         feq $$2 = fen.a();

         for (ja $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fen.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fen.b() : $$2;
      }, new ear[]{c});
   }

   public static Set<ja> o(dzo $$0) {
      if (!($$0.b() instanceof dqy)) {
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
   protected void a(dzp.a<dlu, dzo> $$0) {
      for (ja $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      if (!q($$0)) {
         return dlw.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(c) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
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
   protected boolean a(dzo $$0, dcl $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzo $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dhv $$0, dzo $$1, iu $$2, ja $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iu $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dzo c(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dzo $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(evw.c)) {
            $$4 = this.m().b(eae.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      if ($$1 == dqv.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dqv.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dzo a(dzo $$0, Function<ja, ja> $$1) {
      dzo $$2 = $$0;

      for (ja $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dzo $$0, ja $$1) {
      eaf $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dhv $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      dzo $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dhv $$0, ja $$1, iu $$2, dzo $$3) {
      return dlu.a($$3.h($$0, $$2), $$1.g()) || dlu.a($$3.g($$0, $$2), $$1.g());
   }

   private static dzo a(dzo $$0, eaf $$1) {
      dzo $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dlw.a.m();
   }

   public static eaf b(ja $$0) {
      return a.get($$0);
   }

   private static dzo a(dzp<dlu, dzo> $$0) {
      dzo $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (eaf $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(dzo $$0) {
      for (ja $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(dzo $$0) {
      for (ja $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
