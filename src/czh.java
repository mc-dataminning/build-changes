import java.util.Collection;

public class czh extends cxj implements czb, czm {
   private static final dfq b = dfp.C;
   private final cxk c = new cxk(new czh.a(cxk.a));
   private final cxk d = new cxk(new czh.a(cxk.e.a));

   public czh(dey.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cxk b() {
      return this.c;
   }

   public cxk g() {
      return this.d;
   }

   public static boolean a(cpm $$0, gu $$1, dez $$2, Collection<ha> $$3) {
      boolean $$4 = false;
      dez $$5 = csm.qG.n();

      for (ha $$6 : $$3) {
         gu $$7 = $$1.a($$6);
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
   public void a(cpm $$0, dez $$1, gu $$2, aru $$3) {
      if ($$1.a(this)) {
         for (ha $$4 : a) {
            dfq $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(csm.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eac $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? csm.a : csm.G).n();
         }

         $$0.a($$2, $$1, 3);
         czb.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(czg.a $$0, cpm $$1, gu $$2, aru $$3, czg $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? arp.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(czg $$0, cpm $$1, gu $$2, aru $$3) {
      dez $$4 = $$1.a_($$2);
      aqa<csl> $$5 = $$0.c();

      for (ha $$6 : ha.a($$3)) {
         if (a($$4, $$6)) {
            gu $$7 = $$2.a($$6);
            dez $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dez $$9 = csm.qF.n();
               $$1.a($$7, $$9, 3);
               csl.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aow.ug, aox.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               ha $$10 = $$6.g();

               for (ha $$11 : a) {
                  if ($$11 != $$10) {
                     gu $$12 = $$7.a($$11);
                     dez $$13 = $$1.a_($$12);
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

   public static boolean a(cpm $$0, dez $$1, gu $$2) {
      if (!$$1.a(csm.qG)) {
         return false;
      } else {
         for (ha $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(apl.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return !$$1.n().a(cja.fM) || super.a($$0, $$1);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   class a extends cxk.a {
      private final cxk.e[] c;

      public a(cxk.e... $$0) {
         super(czh.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cor $$0, gu $$1, gu $$2, ha $$3, dez $$4) {
         dez $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(csm.qF) && !$$5.a(csm.qH) && !$$5.a(csm.bQ)) {
            if ($$1.k($$2) == 2) {
               gu $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eac $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ead.c)) {
               return false;
            } else {
               return $$4.a(apl.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cxk.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dez $$0) {
         return !$$0.a(csm.qG);
      }
   }
}
