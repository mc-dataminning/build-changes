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

public abstract class dhv extends dcv {
   private static final float a = 1.0F;
   private static final ety c = dcv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety d = dcv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ety e = dcv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ety f = dcv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety g = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ety h = dcv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ir, dqp> i = dij.h;
   private static final Map<ir, ety> j = ac.a(Maps.newEnumMap(ir.class), $$0 -> {
      $$0.put(ir.c, g);
      $$0.put(ir.f, f);
      $$0.put(ir.d, h);
      $$0.put(ir.e, e);
      $$0.put(ir.b, c);
      $$0.put(ir.a, d);
   });
   protected static final ir[] b = ir.values();
   private final ImmutableMap<dpy, ety> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dhv(dpx.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dhv::o);
      this.l = ir.c.a.a().allMatch(this::a);
      this.m = ir.c.a.a().filter(ir.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ir.c.a.a().filter(ir.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dhv> a();

   public static Set<ir> m(dpy $$0) {
      if (!($$0.b() instanceof dhv)) {
         return Set.of();
      } else {
         Set<ir> $$1 = EnumSet.noneOf(ir.class);

         for (ir $$2 : ir.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ir> a(byte $$0) {
      Set<ir> $$1 = EnumSet.noneOf(ir.class);

      for (ir $$2 : ir.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ir> $$0) {
      byte $$1 = 0;

      for (ir $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ir $$0) {
      return true;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      for (ir $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!n($$0)) {
         return dcx.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return (ety)this.k.get($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      boolean $$3 = false;

      for (ir $$4 : b) {
         if (a($$0, $$4)) {
            im $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      dpy $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cza $$0, dpy $$1, im $$2, ir $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         im $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dpy c(dpy $$0, cza $$1, im $$2, ir $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dpy $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.k() && $$0.u().a(els.c)) {
            $$4 = this.n().a(dqo.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      if ($$1 == dhs.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dhs.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dpy a(dpy $$0, Function<ir, ir> $$1) {
      dpy $$2 = $$0;

      for (ir $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dpy $$0, ir $$1) {
      dqp $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cza $$0, ir $$1, im $$2, dpy $$3) {
      return dcv.a($$3.l($$0, $$2), $$1.g()) || dcv.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean k() {
      return this.E.d().contains(dqo.C);
   }

   private static dpy a(dpy $$0, dqp $$1) {
      dpy $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dcx.a.n();
   }

   public static dqp b(ir $$0) {
      return i.get($$0);
   }

   private static dpy a(dpz<dcv, dpy> $$0) {
      dpy $$1 = $$0.b();

      for (dqp $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ety o(dpy $$0) {
      ety $$1 = etv.a();

      for (ir $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = etv.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? etv.b() : $$1;
   }

   protected static boolean n(dpy $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dpy $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dhw c();
}
