import javax.annotation.Nullable;

public class ctx extends cvk implements cuh {
   private final eqo a;

   public ctx(eqo $$0, cvk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      eyo $$4 = a($$0, $$1, this.a == eqq.a ? ddo.b.b : ddo.b.a);
      if ($$4.d() == eyq.a.a) {
         return brp.e;
      } else if ($$4.d() != eyq.a.b) {
         return brp.e;
      } else {
         je $$5 = $$4.b();
         jj $$6 = $$4.c();
         je $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return brp.d;
         } else if (this.a == eqq.a) {
            duo $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dhq $$9) {
               cvp $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awo.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dzl.y, $$5);
                  cvp $$11 = cvs.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     an.k.a((ari)$$1, $$10);
                  }

                  return brp.a.a($$11);
               }
            }

            return brp.d;
         } else {
            duo $$12 = $$0.a_($$5);
            je $$13 = $$12.b() instanceof dma && this.a == eqq.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof ari) {
                  an.z.a((ari)$$1, $$13, $$3);
               }

               $$1.b(awo.c.b(this));
               cvp $$14 = cvs.a($$3, $$1, a($$3, $$1));
               return brp.a.a($$14);
            } else {
               return brp.d;
            }
         }
      }
   }

   public static cvp a(cvp $$0, cnu $$1) {
      return !$$1.fQ() ? new cvp(cvt.qz) : $$0;
   }

   @Override
   public void a(@Nullable cnu $$0, deg $$1, cvp $$2, je $$3) {
   }

   @Override
   public boolean a(@Nullable cnu $$0, deg $$1, je $$2, @Nullable eyo $$3) {
      if (!(this.a instanceof eqn $$4)) {
         return false;
      } else {
         dhj $$7;
         boolean $$8;
         duo $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dma $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.b().a($$3.c()), null);
         } else if ($$1.B_().i() && this.a.a(awz.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awe.iV, awf.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ln.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dma $$15 && this.a == eqq.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.n()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.y().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cnu $$0, deh $$1, je $$2) {
      awd $$3 = this.a.a(awz.b) ? awe.df : awe.dc;
      $$1.a($$0, $$2, $$3, awf.e, 1.0F, 1.0F);
      $$1.a($$0, dzl.z, $$2);
   }
}
