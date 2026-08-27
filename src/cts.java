import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cts extends crk<dcx> implements czr {
   public static final dfy b = cwj.aC;
   public static final dgc<dfw> c = dfu.bc;
   public static final dfv d = dfu.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final eib h = csq.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eib i = csq.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eib j = csq.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eib k = csq.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eib l = csq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cut.b<dcx, Optional<bgm>> m = new cut.b<dcx, Optional<bgm>>() {
      public Optional<bgm> a(dcx $$0, dcx $$1) {
         return Optional.of(new bgl($$0, $$1));
      }

      public Optional<bgm> a(dcx $$0) {
         return Optional.of($$0);
      }

      public Optional<bgm> a() {
         return Optional.empty();
      }
   };
   private static final cut.b<dcx, Optional<bgw>> n = new cut.b<dcx, Optional<bgw>>() {
      public Optional<bgw> a(final dcx $$0, final dcx $$1) {
         final bgm $$2 = new bgl($$0, $$1);
         return Optional.of(new bgw() {
            @Nullable
            @Override
            public ceg createMenu(int $$0x, cbo $$1x, cbp $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cen.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ti H_() {
               if ($$0.ac()) {
                  return $$0.H_();
               } else {
                  return (ti)($$1.ac() ? $$1.H_() : ti.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bgw> a(dcx $$0) {
         return Optional.of($$0);
      }

      public Optional<bgw> a() {
         return Optional.empty();
      }
   };

   protected cts(dfd.d $$0, Supplier<dcs<? extends dcx>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, hc.c).a(c, dfw.a).a(d, Boolean.valueOf(false)));
   }

   public static cut.a g(dfe $$0) {
      dfw $$1 = $$0.c(c);
      if ($$1 == dfw.a) {
         return cut.a.a;
      } else {
         return $$1 == dfw.c ? cut.a.b : cut.a.c;
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.b;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dfw $$6 = $$2.c(c);
         if ($$0.c(c) == dfw.a && $$6 != dfw.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dfw.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(c) == dfw.a) {
         return l;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return h;
            case d:
               return i;
            case e:
               return j;
            case f:
               return k;
         }
      }
   }

   public static hc h(dfe $$0) {
      hc $$1 = $$0.c(b);
      return $$0.c(c) == dfw.b ? $$1.h() : $$1.i();
   }

   @Override
   public dfe a(cli $$0) {
      dfw $$1 = dfw.a;
      hc $$2 = $$0.g().g();
      eah $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hc $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hc $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dfw.c : dfw.b;
         }
      }

      if ($$1 == dfw.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dfw.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dfw.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == eai.c));
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(d) ? eai.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hc a(cli $$0, hc $$1) {
      dfe $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dfw.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dcx) {
            ((dcx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof bgm) {
            bgp.a($$1, $$2, (bgm)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         bgw $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            cag.a($$3, true);
         }

         return bgt.b;
      }
   }

   protected apg<aeu> b() {
      return apj.i.b(apj.ao);
   }

   public dcs<? extends dcx> c() {
      return this.a.get();
   }

   @Nullable
   public static bgm a(cts $$0, dfe $$1, cpq $$2, gw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cut.c<? extends dcx> a(dfe $$0, cpq $$1, gw $$2, boolean $$3) {
      BiPredicate<cpr, gw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cts::a;
      }

      return cut.a(this.a.get(), cts::g, cts::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cut.b<dcx, Float2FloatFunction> a(final dds $$0) {
      return new cut.b<dcx, Float2FloatFunction>() {
         public Float2FloatFunction a(dcx $$0x, dcx $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dcx $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? a($$2, this.c(), dcx::a) : null;
   }

   public static boolean a(cpr $$0, gw $$1) {
      return a((cow)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cow $$0, gw $$1) {
      gw $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpr $$0, gw $$1) {
      List<bup> $$2 = $$0.a(
         bup.class, new ehd((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bup $$3 : $$2) {
            if ($$3.t()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      dcq $$4 = $$1.c_($$2);
      if ($$4 instanceof dcx) {
         ((dcx)$$4).i();
      }
   }
}
