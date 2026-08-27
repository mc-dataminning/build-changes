import javax.annotation.Nullable;

public class cna extends cou implements cnl {
   private final ego a;

   public cna(ego $$0, cou.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      eno $$4 = a($$0, $$1, this.a == egq.a ? cuw.b.b : cuw.b.a);
      if ($$4.c() == enq.a.a) {
         return blv.c($$3);
      } else if ($$4.c() != enq.a.b) {
         return blv.c($$3);
      } else {
         hz $$5 = $$4.a();
         ie $$6 = $$4.b();
         hz $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return blv.d($$3);
         } else if (this.a == egq.a) {
            dlf $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cyv $$9) {
               coz $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(atu.c.b(this));
                  $$9.ax_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dpp.y, $$5);
                  coz $$11 = cpb.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aow)$$1, $$10);
                  }

                  return blv.a($$11, $$0.y_());
               }
            }

            return blv.d($$3);
         } else {
            dlf $$12 = $$0.a_($$5);
            hz $$13 = $$12.b() instanceof dde && this.a == egq.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aow) {
                  am.z.a((aow)$$1, $$13, $$3);
               }

               $$1.b(atu.c.b(this));
               return blv.a(a($$3, $$1), $$0.y_());
            } else {
               return blv.d($$3);
            }
         }
      }
   }

   public static coz a(coz $$0, chh $$1) {
      return !$$1.fU().d ? new coz(cpc.qx) : $$0;
   }

   @Override
   public void a(@Nullable chh $$0, cvn $$1, coz $$2, hz $$3) {
   }

   @Override
   public boolean a(@Nullable chh $$0, cvn $$1, hz $$2, @Nullable eno $$3) {
      if (!(this.a instanceof egn $$4)) {
         return false;
      } else {
         cyo $$7;
         boolean $$8;
         dlf $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dde $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(aue.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, atk.iF, atl.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(jz.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dde $$15 && this.a == egq.c) {
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

   protected void a(@Nullable chh $$0, cvo $$1, hz $$2) {
      atj $$3 = this.a.a(aue.b) ? atk.cW : atk.cT;
      $$1.a($$0, $$2, $$3, atl.e, 1.0F, 1.0F);
      $$1.a($$0, dpp.z, $$2);
   }
}
