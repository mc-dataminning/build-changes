import java.util.Collection;

public class czt extends cxv implements czn, czy {
   private static final dgc b = dgb.C;
   private final cxw c = new cxw(new czt.a(cxw.a));
   private final cxw d = new cxw(new czt.a(cxw.e.a));

   public czt(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cxw b() {
      return this.c;
   }

   public cxw g() {
      return this.d;
   }

   public static boolean a(cpy $$0, gw $$1, dfl $$2, Collection<hc> $$3) {
      boolean $$4 = false;
      dfl $$5 = csy.qG.n();

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
   public void a(cpy $$0, dfl $$1, gw $$2, ase $$3) {
      if ($$1.a(this)) {
         for (hc $$4 : a) {
            dgc $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(csy.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eao $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? csy.a : csy.G).n();
         }

         $$0.a($$2, $$1, 3);
         czn.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czs.a $$0, cpy $$1, gw $$2, ase $$3, czs $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ary.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czs $$0, cpy $$1, gw $$2, ase $$3) {
      dfl $$4 = $$1.a_($$2);
      aqj<csx> $$5 = $$0.c();

      for (hc $$6 : hc.a($$3)) {
         if (a($$4, $$6)) {
            gw $$7 = $$2.a($$6);
            dfl $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dfl $$9 = csy.qF.n();
               $$1.a($$7, $$9, 3);
               csx.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, apf.ug, apg.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               hc $$10 = $$6.g();

               for (hc $$11 : a) {
                  if ($$11 != $$10) {
                     gw $$12 = $$7.a($$11);
                     dfl $$13 = $$1.a_($$12);
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

   public static boolean a(cpy $$0, dfl $$1, gw $$2) {
      if (!$$1.a(csy.qG)) {
         return false;
      } else {
         for (hc $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apu.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return !$$1.n().a(cjk.fM) || super.a($$0, $$1);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   class a extends cxw.a {
      private final cxw.e[] c;

      public a(cxw.e... $$0) {
         super(czt.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cpd $$0, gw $$1, gw $$2, hc $$3, dfl $$4) {
         dfl $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(csy.qF) && !$$5.a(csy.qH) && !$$5.a(csy.bQ)) {
            if ($$1.k($$2) == 2) {
               gw $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eao $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eap.c)) {
               return false;
            } else {
               return $$4.a(apu.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cxw.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dfl $$0) {
         return !$$0.a(csy.qG);
      }
   }
}
