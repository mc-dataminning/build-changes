import javax.annotation.Nullable;

public class cst extends csk {
   public static final dgf a = cwq.aC;
   public static final dgj<dfz> b = dgb.V;
   public static final dgc c = dgb.w;
   private static final eii e = csx.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eii f = csx.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eii g = csx.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eii h = csx.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eii i = eif.a(h, g);
   private static final eii j = eif.a(i, csx.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eii k = eif.a(i, csx.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eii l = eif.a(i, csx.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eii m = eif.a(i, csx.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eii n = eif.a(i, csx.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eii D = eif.a(i, csx.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eii E = eif.a(i, csx.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public cst(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dfz.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      bis $$4 = $$3.v();
      cbw $$5 = $$4 instanceof cbw ? (cbw)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bha.a($$1.B) : bha.d;
   }

   public boolean a(cpx $$0, dfl $$1, ehl $$2, @Nullable cbw $$3, boolean $$4) {
      hc $$5 = $$2.b();
      gw $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(app.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfl $$0, hc $$1, double $$2) {
      if ($$1.o() != hc.a.b && !($$2 > 0.8124F)) {
         hc $$3 = $$0.c(a);
         dfz $$4 = $$0.c(b);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cpx $$0, gw $$1, @Nullable hc $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bis $$0, cpx $$1, gw $$2, @Nullable hc $$3) {
      dcx $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dcv) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dcv)$$4).a($$3);
         $$1.a(null, $$2, apf.bK, apg.e, 2.0F, 1.0F);
         $$1.a($$0, djv.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eii h(dfl $$0) {
      hc $$1 = $$0.c(a);
      dfz $$2 = $$0.c(b);
      if ($$2 == dfz.a) {
         return $$1 != hc.c && $$1 != hc.d ? f : e;
      } else if ($$2 == dfz.b) {
         return E;
      } else if ($$2 == dfz.d) {
         return $$1 != hc.c && $$1 != hc.d ? k : j;
      } else if ($$1 == hc.c) {
         return n;
      } else if ($$1 == hc.d) {
         return D;
      } else {
         return $$1 == hc.f ? m : l;
      }
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.h($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.h($$0);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      cpx $$3 = $$0.q();
      hc.a $$4 = $$1.o();
      if ($$4 == hc.a.b) {
         dfl $$5 = this.n().a(b, $$1 == hc.a ? dfz.b : dfz.a).a(a, $$0.g());
         if ($$5.a((cqa)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hc.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hc.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hc.e)
            || $$4 == hc.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hc.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hc.c);
         dfl $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfz.d : dfz.c);
         if ($$7.a((cqa)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hc.b);
         $$7 = $$7.a(b, $$8 ? dfz.a : dfz.b);
         if ($$7.a((cqa)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      dfz $$6 = $$0.c(b);
      hc $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfz.d) {
         return csy.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfz.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfz.c).a(a, $$1.g());
            }

            if ($$6 == dfz.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfz.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = n($$0).g();
      return $$3 == hc.b ? csx.a($$1, $$2.c(), hc.a) : cvn.b($$1, $$2, $$3);
   }

   private static hc n(dfl $$0) {
      switch ((dfz)$$0.c(b)) {
         case a:
            return hc.b;
         case b:
            return hc.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.E, $$0.B ? dcv::a : dcv::b);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
