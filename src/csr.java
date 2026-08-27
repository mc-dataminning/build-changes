import javax.annotation.Nullable;

public class csr extends csi {
   public static final dgd a = cwo.aC;
   public static final dgh<dfx> b = dfz.V;
   public static final dga c = dfz.w;
   private static final eig e = csv.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eig f = csv.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eig g = csv.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eig h = csv.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eig i = eid.a(h, g);
   private static final eig j = eid.a(i, csv.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eig k = eid.a(i, csv.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eig l = eid.a(i, csv.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eig m = eid.a(i, csv.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eig n = eid.a(i, csv.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eig D = eid.a(i, csv.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eig E = eid.a(i, csv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public csr(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dfx.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      biq $$4 = $$3.v();
      cbu $$5 = $$4 instanceof cbu ? (cbu)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bgy.a($$1.B) : bgy.d;
   }

   public boolean a(cpv $$0, dfj $$1, ehj $$2, @Nullable cbu $$3, boolean $$4) {
      hc $$5 = $$2.b();
      gw $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(apo.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfj $$0, hc $$1, double $$2) {
      if ($$1.o() != hc.a.b && !($$2 > 0.8124F)) {
         hc $$3 = $$0.c(a);
         dfx $$4 = $$0.c(b);
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

   public boolean a(cpv $$0, gw $$1, @Nullable hc $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable biq $$0, cpv $$1, gw $$2, @Nullable hc $$3) {
      dcv $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dct) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dct)$$4).a($$3);
         $$1.a(null, $$2, ape.bK, apf.e, 2.0F, 1.0F);
         $$1.a($$0, djt.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eig h(dfj $$0) {
      hc $$1 = $$0.c(a);
      dfx $$2 = $$0.c(b);
      if ($$2 == dfx.a) {
         return $$1 != hc.c && $$1 != hc.d ? f : e;
      } else if ($$2 == dfx.b) {
         return E;
      } else if ($$2 == dfx.d) {
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
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.h($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.h($$0);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      cpv $$3 = $$0.q();
      hc.a $$4 = $$1.o();
      if ($$4 == hc.a.b) {
         dfj $$5 = this.n().a(b, $$1 == hc.a ? dfx.b : dfx.a).a(a, $$0.g());
         if ($$5.a((cpy)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hc.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hc.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hc.e)
            || $$4 == hc.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hc.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hc.c);
         dfj $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfx.d : dfx.c);
         if ($$7.a((cpy)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hc.b);
         $$7 = $$7.a(b, $$8 ? dfx.a : dfx.b);
         if ($$7.a((cpy)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      dfx $$6 = $$0.c(b);
      hc $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfx.d) {
         return csw.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfx.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfx.c).a(a, $$1.g());
            }

            if ($$6 == dfx.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfx.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      hc $$3 = n($$0).g();
      return $$3 == hc.b ? csv.a($$1, $$2.c(), hc.a) : cvl.b($$1, $$2, $$3);
   }

   private static hc n(dfj $$0) {
      switch ((dfx)$$0.c(b)) {
         case a:
            return hc.b;
         case b:
            return hc.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dct($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.E, $$0.B ? dct::a : dct::b);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
