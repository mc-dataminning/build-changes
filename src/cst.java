import javax.annotation.Nullable;

public class cst extends cuj implements cte {
   private final eox a;

   public cst(eox $$0, cuj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      ews $$4 = a($$0, $$1, this.a == eoz.a ? dcd.b.b : dcd.b.a);
      if ($$4.c() == ewu.a.a) {
         return bqr.c($$3);
      } else if ($$4.c() != ewu.a.b) {
         return bqr.c($$3);
      } else {
         jd $$5 = $$4.a();
         ji $$6 = $$4.b();
         jd $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqr.d($$3);
         } else if (this.a == eoz.a) {
            dta $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dgd $$9) {
               cuo $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avy.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dxw.y, $$5);
                  cuo $$11 = cuq.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     an.k.a((aqu)$$1, $$10);
                  }

                  return bqr.a($$11, $$0.x_());
               }
            }

            return bqr.d($$3);
         } else {
            dta $$12 = $$0.a_($$5);
            jd $$13 = $$12.b() instanceof dkn && this.a == eoz.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqu) {
                  an.z.a((aqu)$$1, $$13, $$3);
               }

               $$1.b(avy.c.b(this));
               cuo $$14 = cuq.a($$3, $$1, a($$3, $$1));
               return bqr.a($$14, $$0.x_());
            } else {
               return bqr.d($$3);
            }
         }
      }
   }

   public static cuo a(cuo $$0, cmv $$1) {
      return !$$1.fM() ? new cuo(cur.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmv $$0, dcu $$1, cuo $$2, jd $$3) {
   }

   @Override
   public boolean a(@Nullable cmv $$0, dcu $$1, jd $$2, @Nullable ews $$3) {
      if (!(this.a instanceof eow $$4)) {
         return false;
      } else {
         dfw $$7;
         boolean $$8;
         dta $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dkn $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.D_().i() && this.a.a(awj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avo.iU, avp.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lm.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dkn $$15 && this.a == eoz.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.k()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.u().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cmv $$0, dcv $$1, jd $$2) {
      avn $$3 = this.a.a(awj.b) ? avo.df : avo.dc;
      $$1.a($$0, $$2, $$3, avp.e, 1.0F, 1.0F);
      $$1.a($$0, dxw.z, $$2);
   }
}
