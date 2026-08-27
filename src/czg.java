import java.util.Collection;

public class czg extends cxi implements cza, czl {
   private static final dfp b = dfo.C;
   private final cxj c = new cxj(new czg.a(cxj.a));
   private final cxj d = new cxj(new czg.a(cxj.e.a));

   public czg(dex.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cxj b() {
      return this.c;
   }

   public cxj g() {
      return this.d;
   }

   public static boolean a(cpl $$0, gv $$1, dey $$2, Collection<hb> $$3) {
      boolean $$4 = false;
      dey $$5 = csl.qG.n();

      for (hb $$6 : $$3) {
         gv $$7 = $$1.a($$6);
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
   public void a(cpl $$0, dey $$1, gv $$2, art $$3) {
      if ($$1.a(this)) {
         for (hb $$4 : a) {
            dfp $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(csl.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eab $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? csl.a : csl.G).n();
         }

         $$0.a($$2, $$1, 3);
         cza.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czf.a $$0, cpl $$1, gv $$2, art $$3, czf $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aro.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czf $$0, cpl $$1, gv $$2, art $$3) {
      dey $$4 = $$1.a_($$2);
      apy<csk> $$5 = $$0.c();

      for (hb $$6 : hb.a($$3)) {
         if (a($$4, $$6)) {
            gv $$7 = $$2.a($$6);
            dey $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dey $$9 = csl.qF.n();
               $$1.a($$7, $$9, 3);
               csk.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aou.ug, aov.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               hb $$10 = $$6.g();

               for (hb $$11 : a) {
                  if ($$11 != $$10) {
                     gv $$12 = $$7.a($$11);
                     dey $$13 = $$1.a_($$12);
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

   public static boolean a(cpl $$0, dey $$1, gv $$2) {
      if (!$$1.a(csl.qG)) {
         return false;
      } else {
         for (hb $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apj.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.n().a(ciz.fM) || super.a($$0, $$1);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   class a extends cxj.a {
      private final cxj.e[] c;

      public a(cxj.e... $$0) {
         super(czg.this);
         this.c = $$0;
      }

      @Override
      public boolean a(coq $$0, gv $$1, gv $$2, hb $$3, dey $$4) {
         dey $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(csl.qF) && !$$5.a(csl.qH) && !$$5.a(csl.bQ)) {
            if ($$1.k($$2) == 2) {
               gv $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eab $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eac.c)) {
               return false;
            } else {
               return $$4.a(apj.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cxj.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dey $$0) {
         return !$$0.a(csl.qG);
      }
   }
}
