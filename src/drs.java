import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drs extends dmm implements dtx {
   public static final MapCodec<drs> b = b(drs::new);
   public static final ebf c = ebe.I;
   private static final Map<jb, ebf> a = dsg.h;
   protected static final jb[] d = jb.values();
   private final Function<eao, ffr> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends drs> a() {
      return b;
   }

   public drs(ean.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jb.c.a.a().allMatch(this::a);
      this.g = jb.c.a.a().filter(jb.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jb.c.a.a().filter(jb.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<eao, ffr> q() {
      Map<jb, ffr> $$0 = ffo.d(dmm.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffr $$2 = ffo.a();

         for (jb $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = ffo.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? ffo.b() : $$2;
      }, new ebr[]{c});
   }

   public static Set<jb> o(eao $$0) {
      if (!($$0.b() instanceof drs)) {
         return Set.of();
      } else {
         Set<jb> $$1 = EnumSet.noneOf(jb.class);

         for (jb $$2 : jb.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jb> a(byte $$0) {
      Set<jb> $$1 = EnumSet.noneOf(jb.class);

      for (jb $$2 : jb.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jb> $$0) {
      byte $$1 = 0;

      for (jb $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jb $$0) {
      return true;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      for (jb $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      if (!q($$0)) {
         return dmo.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      boolean $$3 = false;

      for (jb $$4 : d) {
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
   protected boolean a(eao $$0, ddd $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(din $$0, eao $$1, iv $$2, jb $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iv $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public eao c(eao $$0, din $$1, iv $$2, jb $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         eao $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(eww.c)) {
            $$4 = this.m().b(ebe.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      if ($$1 == drp.c && !this.g) {
         return $$0;
      } else {
         return $$1 == drp.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private eao a(eao $$0, Function<jb, jb> $$1) {
      eao $$2 = $$0;

      for (jb $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(eao $$0, jb $$1) {
      ebf $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(din $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      eao $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(din $$0, jb $$1, iv $$2, eao $$3) {
      return dmm.a($$3.h($$0, $$2), $$1.g()) || dmm.a($$3.g($$0, $$2), $$1.g());
   }

   private static eao a(eao $$0, ebf $$1) {
      eao $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dmo.a.m();
   }

   public static ebf b(jb $$0) {
      return a.get($$0);
   }

   private static eao a(eap<dmm, eao> $$0) {
      eao $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (ebf $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(eao $$0) {
      for (jb $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(eao $$0) {
      for (jb $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
