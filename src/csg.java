import javax.annotation.Nullable;

public class csg extends crx {
   public static final dfs a = cwd.aC;
   public static final dfw<dfm> b = dfo.V;
   public static final dfp c = dfo.w;
   private static final ehy e = csk.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ehy f = csk.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ehy g = csk.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ehy h = csk.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ehy i = ehv.a(h, g);
   private static final ehy j = ehv.a(i, csk.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ehy k = ehv.a(i, csk.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehy l = ehv.a(i, csk.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ehy m = ehv.a(i, csk.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ehy n = ehv.a(i, csk.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ehy D = ehv.a(i, csk.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ehy E = ehv.a(i, csk.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public csg(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, dfm.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      big $$4 = $$3.v();
      cbl $$5 = $$4 instanceof cbl ? (cbl)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bgo.a($$1.B) : bgo.d;
   }

   public boolean a(cpk $$0, dey $$1, ehb $$2, @Nullable cbl $$3, boolean $$4) {
      hb $$5 = $$2.b();
      gv $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(ape.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dey $$0, hb $$1, double $$2) {
      if ($$1.o() != hb.a.b && !($$2 > 0.8124F)) {
         hb $$3 = $$0.c(a);
         dfm $$4 = $$0.c(b);
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

   public boolean a(cpk $$0, gv $$1, @Nullable hb $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable big $$0, cpk $$1, gv $$2, @Nullable hb $$3) {
      dck $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dci) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dci)$$4).a($$3);
         $$1.a(null, $$2, aou.bK, aov.e, 2.0F, 1.0F);
         $$1.a($$0, dji.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ehy h(dey $$0) {
      hb $$1 = $$0.c(a);
      dfm $$2 = $$0.c(b);
      if ($$2 == dfm.a) {
         return $$1 != hb.c && $$1 != hb.d ? f : e;
      } else if ($$2 == dfm.b) {
         return E;
      } else if ($$2 == dfm.d) {
         return $$1 != hb.c && $$1 != hb.d ? k : j;
      } else if ($$1 == hb.c) {
         return n;
      } else if ($$1 == hb.d) {
         return D;
      } else {
         return $$1 == hb.f ? m : l;
      }
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.h($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.h($$0);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      hb $$1 = $$0.k();
      gv $$2 = $$0.a();
      cpk $$3 = $$0.q();
      hb.a $$4 = $$1.o();
      if ($$4 == hb.a.b) {
         dey $$5 = this.n().a(b, $$1 == hb.a ? dfm.b : dfm.a).a(a, $$0.g());
         if ($$5.a((cpn)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hb.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hb.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hb.e)
            || $$4 == hb.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hb.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hb.c);
         dey $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfm.d : dfm.c);
         if ($$7.a((cpn)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hb.b);
         $$7 = $$7.a(b, $$8 ? dfm.a : dfm.b);
         if ($$7.a((cpn)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      dfm $$6 = $$0.c(b);
      hb $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfm.d) {
         return csl.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfm.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfm.c).a(a, $$1.g());
            }

            if ($$6 == dfm.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfm.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = n($$0).g();
      return $$3 == hb.b ? csk.a($$1, $$2.c(), hb.a) : cva.b($$1, $$2, $$3);
   }

   private static hb n(dey $$0) {
      switch ((dfm)$$0.c(b)) {
         case a:
            return hb.b;
         case b:
            return hb.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dci($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.E, $$0.B ? dci::a : dci::b);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
