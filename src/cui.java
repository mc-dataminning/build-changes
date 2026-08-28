import javax.annotation.Nullable;

public class cui extends cvt implements cus {
   private final erd a;

   public cui(erd $$0, cvt.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      ezd $$4 = a($$0, $$1, this.a == erf.a ? ded.b.b : ded.b.a);
      if ($$4.d() == ezf.a.a) {
         return bry.e;
      } else if ($$4.d() != ezf.a.b) {
         return bry.e;
      } else {
         jg $$5 = $$4.b();
         jl $$6 = $$4.c();
         jg $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bry.d;
         } else if (this.a == erf.a) {
            dvd $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dif $$9) {
               cvx $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awu.c.b(this));
                  $$9.au_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eaa.y, $$5);
                  cvx $$11 = cwa.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     an.k.a((arn)$$1, $$10);
                  }

                  return bry.a.a($$11);
               }
            }

            return bry.d;
         } else {
            dvd $$12 = $$0.a_($$5);
            jg $$13 = $$12.b() instanceof dmo && this.a == erf.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arn) {
                  an.z.a((arn)$$1, $$13, $$3);
               }

               $$1.b(awu.c.b(this));
               cvx $$14 = cwa.a($$3, $$1, a($$3, $$1));
               return bry.a.a($$14);
            } else {
               return bry.d;
            }
         }
      }
   }

   public static cvx a(cvx $$0, coh $$1) {
      return !$$1.fX() ? new cvx(cwb.qz) : $$0;
   }

   @Override
   public void a(@Nullable coh $$0, dev $$1, cvx $$2, jg $$3) {
   }

   @Override
   public boolean a(@Nullable coh $$0, dev $$1, jg $$2, @Nullable ezd $$3) {
      if (!(this.a instanceof erc $$4)) {
         return false;
      } else {
         dhy $$7;
         boolean $$8;
         dvd $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dmo $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(axf.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awk.iV, awl.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lq.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dmo $$15 && this.a == erf.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.C && $$8 && !$$6.n()) {
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

   protected void a(@Nullable coh $$0, dew $$1, jg $$2) {
      awj $$3 = this.a.a(axf.b) ? awk.df : awk.dc;
      $$1.a($$0, $$2, $$3, awl.e, 1.0F, 1.0F);
      $$1.a($$0, eaa.z, $$2);
   }
}
