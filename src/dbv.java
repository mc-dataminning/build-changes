import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dbv extends czz implements dbp, dca {
   public static final MapCodec<dbv> c = b(dbv::new);
   private static final dhz d = dhy.C;
   private final daa e = new daa(new dbv.a(daa.a));
   private final daa f = new daa(new dbv.a(daa.e.a));

   @Override
   public MapCodec<dbv> a() {
      return c;
   }

   public dbv(dhh.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public daa c() {
      return this.e;
   }

   public daa g() {
      return this.f;
   }

   public static boolean a(csb $$0, ht $$1, dhi $$2, Collection<hx> $$3) {
      boolean $$4 = false;
      dhi $$5 = cvc.qT.o();

      for (hx $$6 : $$3) {
         ht $$7 = $$1.a($$6);
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
   public void a(csb $$0, dhi $$1, ht $$2, ats $$3) {
      if ($$1.a(this)) {
         for (hx $$4 : b) {
            dhz $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cvc.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ecs $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cvc.a : cvc.G).o();
         }

         $$0.a($$2, $$1, 3);
         dbp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dbu.a $$0, csb $$1, ht $$2, ats $$3, dbu $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? atm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dbu $$0, csb $$1, ht $$2, ats $$3) {
      dhi $$4 = $$1.a_($$2);
      arv<cva> $$5 = $$0.c();

      for (hx $$6 : hx.a($$3)) {
         if (a($$4, $$6)) {
            ht $$7 = $$2.a($$6);
            dhi $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dhi $$9 = cvc.qS.o();
               $$1.a($$7, $$9, 3);
               cva.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aqr.uB, aqs.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               hx $$10 = $$6.g();

               for (hx $$11 : b) {
                  if ($$11 != $$10) {
                     ht $$12 = $$7.a($$11);
                     dhi $$13 = $$1.a_($$12);
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

   public static boolean a(csb $$0, dhi $$1, ht $$2) {
      if (!$$1.a(cvc.qT)) {
         return false;
      } else {
         for (hx $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(arg.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.n().a(clm.gh) || super.a($$0, $$1);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   class a extends daa.a {
      private final daa.e[] c;

      public a(daa.e... $$0) {
         super(dbv.this);
         this.c = $$0;
      }

      @Override
      public boolean a(crg $$0, ht $$1, ht $$2, hx $$3, dhi $$4) {
         dhi $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cvc.qS) && !$$5.a(cvc.qU) && !$$5.a(cvc.bQ)) {
            if ($$1.k($$2) == 2) {
               ht $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ecs $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ect.c)) {
               return false;
            } else {
               return $$4.a(arg.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public daa.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dhi $$0) {
         return !$$0.a(cvc.qT);
      }
   }
}
