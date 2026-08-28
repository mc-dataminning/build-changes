import javax.annotation.Nullable;

public class cua extends cvn implements cuk {
   private final eqs a;

   public cua(eqs $$0, cvn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      eys $$4 = a($$0, $$1, this.a == equ.a ? ddr.b.b : ddr.b.a);
      if ($$4.d() == eyu.a.a) {
         return brs.e;
      } else if ($$4.d() != eyu.a.b) {
         return brs.e;
      } else {
         jf $$5 = $$4.b();
         jk $$6 = $$4.c();
         jf $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return brs.d;
         } else if (this.a == equ.a) {
            dus $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dht $$9) {
               cvs $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awq.c.b(this));
                  $$9.au_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dzp.y, $$5);
                  cvs $$11 = cvv.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     an.k.a((ark)$$1, $$10);
                  }

                  return brs.a.a($$11);
               }
            }

            return brs.d;
         } else {
            dus $$12 = $$0.a_($$5);
            jf $$13 = $$12.b() instanceof dmd && this.a == equ.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof ark) {
                  an.z.a((ark)$$1, $$13, $$3);
               }

               $$1.b(awq.c.b(this));
               cvs $$14 = cvv.a($$3, $$1, a($$3, $$1));
               return brs.a.a($$14);
            } else {
               return brs.d;
            }
         }
      }
   }

   public static cvs a(cvs $$0, cnx $$1) {
      return !$$1.fR() ? new cvs(cvw.qz) : $$0;
   }

   @Override
   public void a(@Nullable cnx $$0, dej $$1, cvs $$2, jf $$3) {
   }

   @Override
   public boolean a(@Nullable cnx $$0, dej $$1, jf $$2, @Nullable eys $$3) {
      if (!(this.a instanceof eqr $$4)) {
         return false;
      } else {
         dhm $$7;
         boolean $$8;
         dus $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dmd $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.C_().i() && this.a.a(axb.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awg.iV, awh.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lo.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dmd $$15 && this.a == equ.c) {
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

   protected void a(@Nullable cnx $$0, dek $$1, jf $$2) {
      awf $$3 = this.a.a(axb.b) ? awg.df : awg.dc;
      $$1.a($$0, $$2, $$3, awh.e, 1.0F, 1.0F);
      $$1.a($$0, dzp.z, $$2);
   }
}
