import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dca extends dae implements dbu, dcf {
   public static final MapCodec<dca> c = b(dca::new);
   private static final die d = did.C;
   private final daf e = new daf(new dca.a(daf.a));
   private final daf f = new daf(new dca.a(daf.e.a));

   @Override
   public MapCodec<dca> a() {
      return c;
   }

   public dca(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public daf c() {
      return this.e;
   }

   public daf g() {
      return this.f;
   }

   public static boolean a(csg $$0, hx $$1, dhn $$2, Collection<ib> $$3) {
      boolean $$4 = false;
      dhn $$5 = cvh.qT.o();

      for (ib $$6 : $$3) {
         hx $$7 = $$1.a($$6);
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
   public void a(csg $$0, dhn $$1, hx $$2, atw $$3) {
      if ($$1.a(this)) {
         for (ib $$4 : b) {
            die $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cvh.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ecx $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cvh.a : cvh.G).o();
         }

         $$0.a($$2, $$1, 3);
         dbu.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dbz.a $$0, csg $$1, hx $$2, atw $$3, dbz $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? atq.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dbz $$0, csg $$1, hx $$2, atw $$3) {
      dhn $$4 = $$1.a_($$2);
      arz<cvf> $$5 = $$0.c();

      for (ib $$6 : ib.a($$3)) {
         if (a($$4, $$6)) {
            hx $$7 = $$2.a($$6);
            dhn $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dhn $$9 = cvh.qS.o();
               $$1.a($$7, $$9, 3);
               cvf.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aqv.uB, aqw.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ib $$10 = $$6.g();

               for (ib $$11 : b) {
                  if ($$11 != $$10) {
                     hx $$12 = $$7.a($$11);
                     dhn $$13 = $$1.a_($$12);
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

   public static boolean a(csg $$0, dhn $$1, hx $$2) {
      if (!$$1.a(cvh.qT)) {
         return false;
      } else {
         for (ib $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(ark.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.n().a(clr.gh) || super.a($$0, $$1);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   class a extends daf.a {
      private final daf.e[] c;

      public a(daf.e... $$0) {
         super(dca.this);
         this.c = $$0;
      }

      @Override
      public boolean a(crl $$0, hx $$1, hx $$2, ib $$3, dhn $$4) {
         dhn $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cvh.qS) && !$$5.a(cvh.qU) && !$$5.a(cvh.bQ)) {
            if ($$1.k($$2) == 2) {
               hx $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ecx $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ecy.c)) {
               return false;
            } else {
               return $$4.a(ark.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public daf.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dhn $$0) {
         return !$$0.a(cvh.qT);
      }
   }
}
