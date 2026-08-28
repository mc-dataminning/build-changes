import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class doj extends dmm implements dod, doo {
   public static final MapCodec<doj> c = b(doj::new);
   private static final dvj d = dvi.C;
   private final dmn e = new dmn(new doj.a(dmn.a));
   private final dmn f = new dmn(new doj.a(dmn.e.a));

   @Override
   public MapCodec<doj> a() {
      return c;
   }

   public doj(dur.d $$0) {
      super($$0);
      this.l(this.n().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dmn c() {
      return this.e;
   }

   public dmn l() {
      return this.f;
   }

   public static boolean a(dek $$0, jf $$1, dus $$2, Collection<jk> $$3) {
      boolean $$4 = false;
      dus $$5 = dho.qT.n();

      for (jk $$6 : $$3) {
         jf $$7 = $$1.a($$6);
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
   public void a(dek $$0, dus $$1, jf $$2, azn $$3) {
      if ($$1.a(this)) {
         for (jk $$4 : b) {
            dvj $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dho.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eqt $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dho.a : dho.G).n();
         }

         $$0.a($$2, $$1, 3);
         dod.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(doi.a $$0, dek $$1, jf $$2, azn $$3, doi $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azf.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(doi $$0, dek $$1, jf $$2, azn $$3) {
      dus $$4 = $$1.a_($$2);
      axl<dhm> $$5 = $$0.c();

      for (jk $$6 : jk.a($$3)) {
         if (a($$4, $$6)) {
            jf $$7 = $$2.a($$6);
            dus $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dus $$9 = dho.qS.n();
               $$1.a($$7, $$9, 3);
               dhm.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awg.vU, awh.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jk $$10 = $$6.g();

               for (jk $$11 : b) {
                  if ($$11 != $$10) {
                     jf $$12 = $$7.a($$11);
                     dus $$13 = $$1.a_($$12);
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

   public static boolean a(dek $$0, dus $$1, jf $$2) {
      if (!$$1.a(dho.qT)) {
         return false;
      } else {
         for (jk $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awv.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return !$$1.n().a(cvw.gi) || super.a($$0, $$1);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   class a extends dmn.a {
      private final dmn.e[] b;

      public a(final dmn.e... $$0) {
         super(doj.this);
         this.b = $$0;
      }

      @Override
      public boolean a(ddo $$0, jf $$1, jf $$2, jk $$3, dus $$4) {
         dus $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dho.qS) && !$$5.a(dho.qU) && !$$5.a(dho.bQ)) {
            if ($$1.k($$2) == 2) {
               jf $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eqt $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(equ.c)) {
               return false;
            } else {
               return $$4.a(awv.aL) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dmn.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dus $$0) {
         return !$$0.a(dho.qT);
      }
   }
}
