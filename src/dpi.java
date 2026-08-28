import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpi extends dke implements drl {
   public static final MapCodec<dpi> b = b(dpi::new);
   public static final dyh c = dyg.I;
   private static final Map<jn, dyh> a = dpw.h;
   protected static final jn[] d = jn.values();
   private final Function<dxq, fcr> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dpi> a() {
      return b;
   }

   public dpi(dxp.d $$0) {
      super($$0);
      this.l(a(this.B));
      this.e = this.q();
      this.f = jn.c.a.a().allMatch(this::a);
      this.g = jn.c.a.a().filter(jn.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jn.c.a.a().filter(jn.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<dxq, fcr> q() {
      Map<jn, fcr> $$0 = fco.d(dke.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fcr $$2 = fco.a();

         for (jn $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fco.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fco.b() : $$2;
      }, new dyt[]{c});
   }

   public static Set<jn> o(dxq $$0) {
      if (!($$0.b() instanceof dpi)) {
         return Set.of();
      } else {
         Set<jn> $$1 = EnumSet.noneOf(jn.class);

         for (jn $$2 : jn.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jn> a(byte $$0) {
      Set<jn> $$1 = EnumSet.noneOf(jn.class);

      for (jn $$2 : jn.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jn> $$0) {
      byte $$1 = 0;

      for (jn $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jn $$0) {
      return true;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      for (jn $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if (!q($$0)) {
         return dkg.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      boolean $$3 = false;

      for (jn $$4 : d) {
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
   protected boolean a(dxq $$0, dax $$1) {
      return !$$1.n().a(this.i()) || r($$0);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dgf $$0, dxq $$1, ji $$2, jn $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ji $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dxq c(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dxq $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(etx.c)) {
            $$4 = this.m().b(dyg.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      if ($$1 == dpf.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dpf.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dxq a(dxq $$0, Function<jn, jn> $$1) {
      dxq $$2 = $$0;

      for (jn $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dxq $$0, jn $$1) {
      dyh $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dgf $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dxq $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dgf $$0, jn $$1, ji $$2, dxq $$3) {
      return dke.a($$3.h($$0, $$2), $$1.g()) || dke.a($$3.g($$0, $$2), $$1.g());
   }

   private static dxq a(dxq $$0, dyh $$1) {
      dxq $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dkg.a.m();
   }

   public static dyh b(jn $$0) {
      return a.get($$0);
   }

   private static dxq a(dxr<dke, dxq> $$0) {
      dxq $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (dyh $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(dxq $$0) {
      for (jn $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(dxq $$0) {
      for (jn $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
