import java.util.Collection;

public class cwj extends cul implements cwd, cwo {
   private static final dcs b = dcr.C;
   private final cum c = new cum(new cwj.a(cum.a));
   private final cum d = new cum(new cwj.a(cum.e.a));

   public cwj(dca.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   public cum b() {
      return this.c;
   }

   public cum g() {
      return this.d;
   }

   public static boolean a(cmn $$0, gu $$1, dcb $$2, Collection<ha> $$3) {
      boolean $$4 = false;
      dcb $$5 = cpo.qG.n();

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
   public void a(cmn $$0, dcb $$1, gu $$2, apf $$3) {
      if ($$1.a(this)) {
         for (ha $$4 : a) {
            dcs $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cpo.qF)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            dxe $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cpo.a : cpo.G).n();
         }

         $$0.a($$2, $$1, 3);
         cwd.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(cwi.a $$0, cmn $$1, gu $$2, apf $$3, cwi $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? apa.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(cwi $$0, cmn $$1, gu $$2, apf $$3) {
      dcb $$4 = $$1.a_($$2);
      anl<cpn> $$5 = $$0.c();

      for (ha $$6 : ha.a($$3)) {
         if (a($$4, $$6)) {
            gu $$7 = $$2.a($$6);
            dcb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dcb $$9 = cpo.qF.n();
               $$1.a($$7, $$9, 3);
               cpn.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, amh.ug, ami.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               ha $$10 = $$6.g();

               for (ha $$11 : a) {
                  if ($$11 != $$10) {
                     gu $$12 = $$7.a($$11);
                     dcb $$13 = $$1.a_($$12);
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

   public static boolean a(cmn $$0, dcb $$1, gu $$2) {
      if (!$$1.a(cpo.qG)) {
         return false;
      } else {
         for (ha $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(amw.bJ)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(dcb $$0, cih $$1) {
      return !$$1.n().a(cgc.fM) || super.a($$0, $$1);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(b) ? dxf.c.a(false) : super.c_($$0);
   }

   class a extends cum.a {
      private final cum.e[] c;

      public a(cum.e... $$0) {
         super(cwj.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cls $$0, gu $$1, gu $$2, ha $$3, dcb $$4) {
         dcb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cpo.qF) && !$$5.a(cpo.qH) && !$$5.a(cpo.bQ)) {
            if ($$1.k($$2) == 2) {
               gu $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            dxe $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(dxf.c)) {
               return false;
            } else {
               return $$4.a(amw.aI) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public cum.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dcb $$0) {
         return !$$0.a(cpo.qG);
      }
   }
}
