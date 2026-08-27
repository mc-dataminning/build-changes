import javax.annotation.Nullable;

public class csk extends cuc implements csw {
   private final epd a;

   public csk(epd $$0, cuc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      ewq $$4 = a($$0, $$1, this.a == epf.a ? dbj.b.b : dbj.b.a);
      if ($$4.c() == ews.a.a) {
         return bqb.c($$3);
      } else if ($$4.c() != ews.a.b) {
         return bqb.c($$3);
      } else {
         ir $$5 = $$4.a();
         iw $$6 = $$4.b();
         ir $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqb.d($$3);
         } else if (this.a == epf.a) {
            dtc $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dfj $$9) {
               cuh $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.d()) {
                  $$1.b(avz.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dxv.y, $$5);
                  cuh $$11 = cuj.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     an.k.a((aqu)$$1, $$10);
                  }

                  return bqb.a($$11, $$0.x_());
               }
            }

            return bqb.d($$3);
         } else {
            dtc $$12 = $$0.a_($$5);
            ir $$13 = $$12.b() instanceof djx && this.a == epf.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqu) {
                  an.z.a((aqu)$$1, $$13, $$3);
               }

               $$1.b(avz.c.b(this));
               return bqb.a(a($$3, $$1), $$0.x_());
            } else {
               return bqb.d($$3);
            }
         }
      }
   }

   public static cuh a(cuh $$0, cly $$1) {
      return !$$1.fY() ? new cuh(cuk.rV) : $$0;
   }

   @Override
   public void a(@Nullable cly $$0, dca $$1, cuh $$2, ir $$3) {
   }

   @Override
   public boolean a(@Nullable cly $$0, dca $$1, ir $$2, @Nullable ewq $$3) {
      if (!(this.a instanceof epc $$4)) {
         return false;
      } else {
         dfc $$7;
         boolean $$8;
         dtc $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djx $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(awj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avo.jh, avq.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lb.V, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djx $$15 && this.a == epf.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.C && $$8 && !$$6.k()) {
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

   protected void a(@Nullable cly $$0, dcb $$1, ir $$2) {
      avn $$3 = this.a.a(awj.b) ? avo.dk : avo.dh;
      $$1.a($$0, $$2, $$3, avq.e, 1.0F, 1.0F);
      $$1.a($$0, dxv.z, $$2);
   }
}
