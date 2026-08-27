import javax.annotation.Nullable;

public class csm extends csd {
   public static final dfy a = cwj.aC;
   public static final dgc<dfs> b = dfu.V;
   public static final dfv c = dfu.w;
   private static final eib e = csq.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eib f = csq.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eib g = csq.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eib h = csq.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eib i = ehy.a(h, g);
   private static final eib j = ehy.a(i, csq.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eib k = ehy.a(i, csq.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eib l = ehy.a(i, csq.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eib m = ehy.a(i, csq.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eib n = ehy.a(i, csq.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eib D = ehy.a(i, csq.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eib E = ehy.a(i, csq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public csm(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dfs.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      bil $$4 = $$3.v();
      cbp $$5 = $$4 instanceof cbp ? (cbp)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bgt.a($$1.B) : bgt.d;
   }

   public boolean a(cpq $$0, dfe $$1, ehe $$2, @Nullable cbp $$3, boolean $$4) {
      hc $$5 = $$2.b();
      gw $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(apj.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dfe $$0, hc $$1, double $$2) {
      if ($$1.o() != hc.a.b && !($$2 > 0.8124F)) {
         hc $$3 = $$0.c(a);
         dfs $$4 = $$0.c(b);
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

   public boolean a(cpq $$0, gw $$1, @Nullable hc $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bil $$0, cpq $$1, gw $$2, @Nullable hc $$3) {
      dcq $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dco) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((dco)$$4).a($$3);
         $$1.a(null, $$2, aoz.bK, apa.e, 2.0F, 1.0F);
         $$1.a($$0, djo.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eib h(dfe $$0) {
      hc $$1 = $$0.c(a);
      dfs $$2 = $$0.c(b);
      if ($$2 == dfs.a) {
         return $$1 != hc.c && $$1 != hc.d ? f : e;
      } else if ($$2 == dfs.b) {
         return E;
      } else if ($$2 == dfs.d) {
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
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.h($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.h($$0);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      hc $$1 = $$0.k();
      gw $$2 = $$0.a();
      cpq $$3 = $$0.q();
      hc.a $$4 = $$1.o();
      if ($$4 == hc.a.b) {
         dfe $$5 = this.n().a(b, $$1 == hc.a ? dfs.b : dfs.a).a(a, $$0.g());
         if ($$5.a((cpt)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hc.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hc.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hc.e)
            || $$4 == hc.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hc.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hc.c);
         dfe $$7 = this.n().a(a, $$1.g()).a(b, $$6 ? dfs.d : dfs.c);
         if ($$7.a((cpt)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hc.b);
         $$7 = $$7.a(b, $$8 ? dfs.a : dfs.b);
         if ($$7.a((cpt)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      dfs $$6 = $$0.c(b);
      hc $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dfs.d) {
         return csr.a.n();
      } else {
         if ($$1.o() == $$0.c(a).o()) {
            if ($$6 == dfs.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, dfs.c).a(a, $$1.g());
            }

            if ($$6 == dfs.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, dfs.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = n($$0).g();
      return $$3 == hc.b ? csq.a($$1, $$2.c(), hc.a) : cvg.b($$1, $$2, $$3);
   }

   private static hc n(dfe $$0) {
      switch ((dfs)$$0.c(b)) {
         case a:
            return hc.b;
         case b:
            return hc.a;
         default:
            return $$0.c(a).g();
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dco($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.E, $$0.B ? dco::a : dco::b);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
