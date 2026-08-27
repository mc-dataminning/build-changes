import java.util.Collection;

public class czr extends cxt implements czl, czw {
   private static final dga b = dfz.C;
   private final cxu c = new cxu(new czr.a(cxu.a));
   private final cxu d = new cxu(new czr.a(cxu.e.a));

   public czr(dfi.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cxu b() {
      return this.c;
   }

   public cxu g() {
      return this.d;
   }

   public static boolean a(cpw $$0, gw $$1, dfj $$2, Collection<hc> $$3) {
      boolean $$4 = false;
      dfj $$5 = csw.qG.n();

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
   public void a(cpw $$0, dfj $$1, gw $$2, asc $$3) {
      if ($$1.a(this)) {
         for (hc $$4 : a) {
            dga $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(csw.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eam $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? csw.a : csw.G).n();
         }

         $$0.a($$2, $$1, 3);
         czl.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czq.a $$0, cpw $$1, gw $$2, asc $$3, czq $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? arx.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czq $$0, cpw $$1, gw $$2, asc $$3) {
      dfj $$4 = $$1.a_($$2);
      aqi<csv> $$5 = $$0.c();

      for (hc $$6 : hc.a($$3)) {
         if (a($$4, $$6)) {
            gw $$7 = $$2.a($$6);
            dfj $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dfj $$9 = csw.qF.n();
               $$1.a($$7, $$9, 3);
               csv.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, ape.ug, apf.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               hc $$10 = $$6.g();

               for (hc $$11 : a) {
                  if ($$11 != $$10) {
                     gw $$12 = $$7.a($$11);
                     dfj $$13 = $$1.a_($$12);
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

   public static boolean a(cpw $$0, dfj $$1, gw $$2) {
      if (!$$1.a(csw.qG)) {
         return false;
      } else {
         for (hc $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apt.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return !$$1.n().a(cji.fM) || super.a($$0, $$1);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   class a extends cxu.a {
      private final cxu.e[] c;

      public a(cxu.e... $$0) {
         super(czr.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cpb $$0, gw $$1, gw $$2, hc $$3, dfj $$4) {
         dfj $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(csw.qF) && !$$5.a(csw.qH) && !$$5.a(csw.bQ)) {
            if ($$1.k($$2) == 2) {
               gw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eam $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ean.c)) {
               return false;
            } else {
               return $$4.a(apt.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cxu.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dfj $$0) {
         return !$$0.a(csw.qG);
      }
   }
}
