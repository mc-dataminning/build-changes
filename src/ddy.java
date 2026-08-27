import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ddy extends dbp<dnk> implements djw {
   public static final MapCodec<ddy> b = b($$0 -> new ddy($$0, () -> dnf.b));
   public static final dqs c = dgr.aE;
   public static final dqw<dqq> d = dqo.bc;
   public static final dqp e = dqo.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ety i = dcv.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ety j = dcv.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ety k = dcv.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ety l = dcv.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ety m = dcv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dfc.b<dnk, Optional<boj>> n = new dfc.b<dnk, Optional<boj>>() {
      public Optional<boj> a(dnk $$0, dnk $$1) {
         return Optional.of(new boi($$0, $$1));
      }

      public Optional<boj> a(dnk $$0) {
         return Optional.of($$0);
      }

      public Optional<boj> a() {
         return Optional.empty();
      }
   };
   private static final dfc.b<dnk, Optional<bou>> o = new dfc.b<dnk, Optional<bou>>() {
      public Optional<bou> a(final dnk $$0, final dnk $$1) {
         final boj $$2 = new boi($$0, $$1);
         return Optional.of(new bou() {
            @Nullable
            @Override
            public cnh createMenu(int $$0x, ckk $$1x, ckl $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cno.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ws O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (ws)($$1.ae() ? $$1.O_() : ws.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bou> a(dnk $$0) {
         return Optional.of($$0);
      }

      public Optional<bou> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends ddy> a() {
      return b;
   }

   protected ddy(dpx.d $$0, Supplier<dnf<? extends dnk>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ir.c).a(d, dqq.a).a(e, Boolean.valueOf(false)));
   }

   public static dfc.a g(dpy $$0) {
      dqq $$1 = $$0.c(d);
      if ($$1 == dqq.a) {
         return dfc.a.a;
      } else {
         return $$1 == dqq.c ? dfc.a.b : dfc.a.c;
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.b;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dqq $$6 = $$2.c(d);
         if ($$0.c(d) == dqq.a && $$6 != dqq.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dqq.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(d) == dqq.a) {
         return m;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return i;
            case d:
               return j;
            case e:
               return k;
            case f:
               return l;
         }
      }
   }

   public static ir h(dpy $$0) {
      ir $$1 = $$0.c(c);
      return $$0.c(d) == dqq.b ? $$1.h() : $$1.i();
   }

   @Override
   public dpy a(cvl $$0) {
      dqq $$1 = dqq.a;
      ir $$2 = $$0.g().g();
      elr $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ir $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ir $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dqq.c : dqq.b;
         }
      }

      if ($$1 == dqq.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dqq.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dqq.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == els.c));
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(e) ? els.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ir a(cvl $$0, ir $$1) {
      dpy $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dqq.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         bou $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cjc.a($$3, true);
         }

         return boq.b;
      }
   }

   protected avg<akf> c() {
      return avj.i.b(avj.ao);
   }

   public dnf<? extends dnk> d() {
      return this.a.get();
   }

   @Nullable
   public static boj a(ddy $$0, dpy $$1, czu $$2, im $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dfc.c<? extends dnk> a(dpy $$0, czu $$1, im $$2, boolean $$3) {
      BiPredicate<czv, im> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ddy::a;
      }

      return dfc.a(this.a.get(), ddy::g, ddy::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dfc.b<dnk, Float2FloatFunction> a(final dog $$0) {
      return new dfc.b<dnk, Float2FloatFunction>() {
         public Float2FloatFunction a(dnk $$0x, dnk $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dnk $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? a($$2, this.d(), dnk::a) : null;
   }

   public static boolean a(czv $$0, im $$1) {
      return a((cza)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cza $$0, im $$1) {
      im $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(czv $$0, im $$1) {
      List<ccw> $$2 = $$0.a(
         ccw.class, new eta((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ccw $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      dnd $$4 = $$1.c_($$2);
      if ($$4 instanceof dnk) {
         ((dnk)$$4).l();
      }
   }
}
