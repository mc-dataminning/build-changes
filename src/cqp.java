import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqp extends cog<czu> implements cwo {
   public static final dcv b = ctg.aC;
   public static final dcz<dct> c = dcr.bc;
   public static final dcs d = dcr.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final efb h = cpn.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final efb i = cpn.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final efb j = cpn.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final efb k = cpn.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final efb l = cpn.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final crq.b<czu, Optional<bdq>> m = new crq.b<czu, Optional<bdq>>() {
      public Optional<bdq> a(czu $$0, czu $$1) {
         return Optional.of(new bdp($$0, $$1));
      }

      public Optional<bdq> a(czu $$0) {
         return Optional.of($$0);
      }

      public Optional<bdq> a() {
         return Optional.empty();
      }
   };
   private static final crq.b<czu, Optional<bea>> n = new crq.b<czu, Optional<bea>>() {
      public Optional<bea> a(final czu $$0, final czu $$1) {
         final bdq $$2 = new bdp($$0, $$1);
         return Optional.of(new bea() {
            @Nullable
            @Override
            public cbf createMenu(int $$0x, byn $$1x, byo $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cbm.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public sw H_() {
               if ($$0.aa()) {
                  return $$0.H_();
               } else {
                  return (sw)($$1.aa() ? $$1.H_() : sw.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bea> a(czu $$0) {
         return Optional.of($$0);
      }

      public Optional<bea> a() {
         return Optional.empty();
      }
   };

   protected cqp(dca.d $$0, Supplier<czp<? extends czu>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, ha.c).a(c, dct.a).a(d, Boolean.valueOf(false)));
   }

   public static crq.a g(dcb $$0) {
      dct $$1 = $$0.c(c);
      if ($$1 == dct.a) {
         return crq.a.a;
      } else {
         return $$1 == dct.c ? crq.a.b : crq.a.c;
      }
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.b;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dct $$6 = $$2.c(c);
         if ($$0.c(c) == dct.a && $$6 != dct.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dct.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      if ($$0.c(c) == dct.a) {
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

   public static ha h(dcb $$0) {
      ha $$1 = $$0.c(b);
      return $$0.c(c) == dct.b ? $$1.h() : $$1.i();
   }

   @Override
   public dcb a(cih $$0) {
      dct $$1 = dct.a;
      ha $$2 = $$0.g().g();
      dxe $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ha $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ha $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dct.c : dct.b;
         }
      }

      if ($$1 == dct.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dct.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dct.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == dxf.c));
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(d) ? dxf.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ha a(cih $$0, ha $$1) {
      dcb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dct.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czu) {
            ((czu)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof bdq) {
            bdt.a($$1, $$2, (bdq)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         bea $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            bxf.a($$3, true);
         }

         return bdx.b;
      }
   }

   protected amo<acq> b() {
      return amr.i.b(amr.ao);
   }

   public czp<? extends czu> c() {
      return this.a.get();
   }

   @Nullable
   public static bdq a(cqp $$0, dcb $$1, cmm $$2, gu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public crq.c<? extends czu> a(dcb $$0, cmm $$1, gu $$2, boolean $$3) {
      BiPredicate<cmn, gu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cqp::a;
      }

      return crq.a(this.a.get(), cqp::g, cqp::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bea b(dcb $$0, cmm $$1, gu $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static crq.b<czu, Float2FloatFunction> a(final dap $$0) {
      return new crq.b<czu, Float2FloatFunction>() {
         public Float2FloatFunction a(czu $$0x, czu $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(czu $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$0.B ? a($$2, this.c(), czu::a) : null;
   }

   public static boolean a(cmn $$0, gu $$1) {
      return a((cls)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cls $$0, gu $$1) {
      gu $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cmn $$0, gu $$1) {
      List<bro> $$2 = $$0.a(
         bro.class, new eed((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bro $$3 : $$2) {
            if ($$3.w()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cbf.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      czn $$4 = $$1.c_($$2);
      if ($$4 instanceof czu) {
         ((czu)$$4).i();
      }
   }
}
