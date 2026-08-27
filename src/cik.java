import javax.annotation.Nullable;

public class cik extends cke implements civ {
   private final ebd a;

   public cik(ebd $$0, cke.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      eib $$4 = a($$0, $$1, this.a == ebf.a ? cqi.b.b : cqi.b.a);
      if ($$4.c() == eid.a.a) {
         return bic.c($$3);
      } else if ($$4.c() != eid.a.b) {
         return bic.c($$3);
      } else {
         ht $$5 = $$4.a();
         hx $$6 = $$4.b();
         ht $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bic.d($$3);
         } else if (this.a == ebf.a) {
            dgb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cuh $$9) {
               ckj $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(aqn.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dkl.y, $$5);
                  ckj $$11 = ckl.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((alr)$$1, $$10);
                  }

                  return bic.a($$11, $$0.x_());
               }
            }

            return bic.d($$3);
         } else {
            dgb $$12 = $$0.a_($$5);
            ht $$13 = $$12.b() instanceof cyp && this.a == ebf.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof alr) {
                  al.y.a((alr)$$1, $$13, $$3);
               }

               $$1.b(aqn.c.b(this));
               return bic.a(a($$3, $$1), $$0.x_());
            } else {
               return bic.d($$3);
            }
         }
      }
   }

   public static ckj a(ckj $$0, ccx $$1) {
      return !$$1.fT().d ? new ckj(ckm.pK) : $$0;
   }

   @Override
   public void a(@Nullable ccx $$0, cqz $$1, ckj $$2, ht $$3) {
   }

   @Override
   public boolean a(@Nullable ccx $$0, cqz $$1, ht $$2, @Nullable eib $$3) {
      if (!(this.a instanceof ebc $$4)) {
         return false;
      } else {
         cua $$7;
         boolean $$8;
         dgb $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cyp $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(aqx.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aqd.hP, aqe.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(js.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cyp $$15 && this.a == ebf.c) {
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

   protected void a(@Nullable ccx $$0, cra $$1, ht $$2) {
      aqc $$3 = this.a.a(aqx.b) ? aqd.cy : aqd.cv;
      $$1.a($$0, $$2, $$3, aqe.e, 1.0F, 1.0F);
      $$1.a($$0, dkl.z, $$2);
   }
}
