import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dog extends dmj implements doa, dol {
   public static final MapCodec<dog> c = b(dog::new);
   private static final dvf d = dve.C;
   private final dmk e = new dmk(new dog.a(dmk.a));
   private final dmk f = new dmk(new dog.a(dmk.e.a));

   @Override
   public MapCodec<dog> a() {
      return c;
   }

   public dog(dun.d $$0) {
      super($$0);
      this.l(this.o().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmk c() {
      return this.e;
   }

   public dmk l() {
      return this.f;
   }

   public static boolean a(deh $$0, je $$1, duo $$2, Collection<jj> $$3) {
      boolean $$4 = false;
      duo $$5 = dhl.qT.o();

      for (jj $$6 : $$3) {
         je $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(deh $$0, duo $$1, je $$2, azl $$3) {
      if ($$1.a(this)) {
         for (jj $$4 : b) {
            dvf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dhl.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eqp $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dhl.a : dhl.G).o();
         }

         $$0.a($$2, $$1, 3);
         doa.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dof.a $$0, deh $$1, je $$2, azl $$3, dof $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azd.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dof $$0, deh $$1, je $$2, azl $$3) {
      duo $$4 = $$1.a_($$2);
      axj<dhj> $$5 = $$0.c();

      for (jj $$6 : jj.a($$3)) {
         if (a($$4, $$6)) {
            je $$7 = $$2.a($$6);
            duo $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               duo $$9 = dhl.qS.o();
               $$1.a($$7, $$9, 3);
               dhj.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awe.vU, awf.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jj $$10 = $$6.g();

               for (jj $$11 : b) {
                  if ($$11 != $$10) {
                     je $$12 = $$7.a($$11);
                     duo $$13 = $$1.a_($$12);
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

   public static boolean a(deh $$0, duo $$1, je $$2) {
      if (!$$1.a(dhl.qT)) {
         return false;
      } else {
         for (jj $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awt.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return !$$1.n().a(cvt.gi) || super.a($$0, $$1);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   class a extends dmk.a {
      private final dmk.e[] b;

      public a(final dmk.e... $$0) {
         super(dog.this);
         this.b = $$0;
      }

      @Override
      public boolean a(ddl $$0, je $$1, je $$2, jj $$3, duo $$4) {
         duo $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dhl.qS) && !$$5.a(dhl.qU) && !$$5.a(dhl.bQ)) {
            if ($$1.k($$2) == 2) {
               je $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eqp $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(eqq.c)) {
               return false;
            } else {
               return $$4.a(awt.aL) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dmk.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(duo $$0) {
         return !$$0.a(dhl.qT);
      }
   }
}
