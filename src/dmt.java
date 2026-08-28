import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dmt extends dkw implements dmn, dmy {
   public static final MapCodec<dmt> c = b(dmt::new);
   private static final dtr d = dtq.C;
   private final dkx e = new dkx(new dmt.a(dkx.a));
   private final dkx f = new dkx(new dmt.a(dkx.e.a));

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   public dmt(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkx c() {
      return this.e;
   }

   public dkx m() {
      return this.f;
   }

   public static boolean a(dcv $$0, jd $$1, dta $$2, Collection<ji> $$3) {
      boolean $$4 = false;
      dta $$5 = dfy.qT.o();

      for (ji $$6 : $$3) {
         jd $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dcv $$0, dta $$1, jd $$2, ayv $$3) {
      if ($$1.a(this)) {
         for (ji $$4 : b) {
            dtr $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfy.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eoy $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfy.a : dfy.G).o();
         }

         $$0.a($$2, $$1, 3);
         dmn.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dms.a $$0, dcv $$1, jd $$2, ayv $$3, dms $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayn.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dms $$0, dcv $$1, jd $$2, ayv $$3) {
      dta $$4 = $$1.a_($$2);
      awt<dfw> $$5 = $$0.c();

      for (ji $$6 : ji.a($$3)) {
         if (a($$4, $$6)) {
            jd $$7 = $$2.a($$6);
            dta $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dta $$9 = dfy.qS.o();
               $$1.a($$7, $$9, 3);
               dfw.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avo.vT, avp.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ji $$10 = $$6.g();

               for (ji $$11 : b) {
                  if ($$11 != $$10) {
                     jd $$12 = $$7.a($$11);
                     dta $$13 = $$1.a_($$12);
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

   public static boolean a(dcv $$0, dta $$1, jd $$2) {
      if (!$$1.a(dfy.qT)) {
         return false;
      } else {
         for (ji $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awd.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return !$$1.n().a(cur.gi) || super.a($$0, $$1);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   class a extends dkx.a {
      private final dkx.e[] b;

      public a(final dkx.e... $$0) {
         super(dmt.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dca $$0, jd $$1, jd $$2, ji $$3, dta $$4) {
         dta $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfy.qS) && !$$5.a(dfy.qU) && !$$5.a(dfy.bQ)) {
            if ($$1.k($$2) == 2) {
               jd $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eoy $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eoz.c)) {
               return false;
            } else {
               return $$4.a(awd.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkx.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dta $$0) {
         return !$$0.a(dfy.qT);
      }
   }
}
