import java.util.Collection;

public class czm extends cxo implements czg, czr {
   private static final dfv b = dfu.C;
   private final cxp c = new cxp(new czm.a(cxp.a));
   private final cxp d = new cxp(new czm.a(cxp.e.a));

   public czm(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cxp b() {
      return this.c;
   }

   public cxp g() {
      return this.d;
   }

   public static boolean a(cpr $$0, gw $$1, dfe $$2, Collection<hc> $$3) {
      boolean $$4 = false;
      dfe $$5 = csr.qG.n();

      for (hc $$6 : $$3) {
         gw $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(b, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(cpr $$0, dfe $$1, gw $$2, arx $$3) {
      if ($$1.a(this)) {
         for (hc $$4 : a) {
            dfv $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(csr.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eah $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? csr.a : csr.G).n();
         }

         $$0.a($$2, $$1, 3);
         czg.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czl.a $$0, cpr $$1, gw $$2, arx $$3, czl $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ars.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czl $$0, cpr $$1, gw $$2, arx $$3) {
      dfe $$4 = $$1.a_($$2);
      aqd<csq> $$5 = $$0.c();

      for (hc $$6 : hc.a($$3)) {
         if (a($$4, $$6)) {
            gw $$7 = $$2.a($$6);
            dfe $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dfe $$9 = csr.qF.n();
               $$1.a($$7, $$9, 3);
               csq.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aoz.ug, apa.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               hc $$10 = $$6.g();

               for (hc $$11 : a) {
                  if ($$11 != $$10) {
                     gw $$12 = $$7.a($$11);
                     dfe $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(cpr $$0, dfe $$1, gw $$2) {
      if (!$$1.a(csr.qG)) {
         return false;
      } else {
         for (hc $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apo.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.n().a(cjd.fM) || super.a($$0, $$1);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   class a extends cxp.a {
      private final cxp.e[] c;

      public a(cxp.e... $$0) {
         super(czm.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cow $$0, gw $$1, gw $$2, hc $$3, dfe $$4) {
         dfe $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(csr.qF) && !$$5.a(csr.qH) && !$$5.a(csr.bQ)) {
            if ($$1.k($$2) == 2) {
               gw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eah $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eai.c)) {
               return false;
            } else {
               return $$4.a(apo.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cxp.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dfe $$0) {
         return !$$0.a(csr.qG);
      }
   }
}
