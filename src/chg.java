import javax.annotation.Nullable;

public class chg extends cja implements chr {
   private final eal a;

   public chg(eal $$0, cja.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      ehj $$4 = a($$0, $$1, this.a == ean.a ? cpe.b.b : cpe.b.a);
      if ($$4.c() == ehl.a.a) {
         return bgz.c($$3);
      } else if ($$4.c() != ehl.a.b) {
         return bgz.c($$3);
      } else {
         gw $$5 = $$4.a();
         hc $$6 = $$4.b();
         gw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bgz.d($$3);
         } else if (this.a == ean.a) {
            dfj $$8 = $$0.a_($$5);
            if ($$8.b() instanceof ctb $$9) {
               cjf $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(apo.c.b(this));
                  $$9.aq_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, djt.y, $$5);
                  cjf $$11 = cjh.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((aks)$$1, $$10);
                  }

                  return bgz.a($$11, $$0.w_());
               }
            }

            return bgz.d($$3);
         } else {
            dfj $$12 = $$0.a_($$5);
            gw $$13 = $$12.b() instanceof cxj && this.a == ean.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aks) {
                  al.y.a((aks)$$1, $$13, $$3);
               }

               $$1.b(apo.c.b(this));
               return bgz.a(a($$3, $$1), $$0.w_());
            } else {
               return bgz.d($$3);
            }
         }
      }
   }

   public static cjf a(cjf $$0, cbu $$1) {
      return !$$1.fS().d ? new cjf(cji.pK) : $$0;
   }

   @Override
   public void a(@Nullable cbu $$0, cpv $$1, cjf $$2, gw $$3) {
   }

   @Override
   public boolean a(@Nullable cbu $$0, cpv $$1, gw $$2, @Nullable ehj $$3) {
      if (!(this.a instanceof eak $$4)) {
         return false;
      } else {
         csv $$7;
         boolean $$8;
         dfj $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cxj $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.C_().i() && this.a.a(apy.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, ape.hN, apf.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ix.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cxj $$15 && this.a == ean.c) {
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

   protected void a(@Nullable cbu $$0, cpw $$1, gw $$2) {
      apd $$3 = this.a.a(apy.b) ? ape.cy : ape.cv;
      $$1.a($$0, $$2, $$3, apf.e, 1.0F, 1.0F);
      $$1.a($$0, djt.z, $$2);
   }
}
