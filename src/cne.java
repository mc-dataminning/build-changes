import javax.annotation.Nullable;

public class cne extends coy implements cnp {
   private final egv a;

   public cne(egv $$0, coy.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      env $$4 = a($$0, $$1, this.a == egx.a ? cva.b.b : cva.b.a);
      if ($$4.c() == enx.a.a) {
         return blx.c($$3);
      } else if ($$4.c() != enx.a.b) {
         return blx.c($$3);
      } else {
         hz $$5 = $$4.a();
         ie $$6 = $$4.b();
         hz $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return blx.d($$3);
         } else if (this.a == egx.a) {
            dlj $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cyz $$9) {
               cpd $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(atv.c.b(this));
                  $$9.ax_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dpw.y, $$5);
                  cpd $$11 = cpf.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aox)$$1, $$10);
                  }

                  return blx.a($$11, $$0.y_());
               }
            }

            return blx.d($$3);
         } else {
            dlj $$12 = $$0.a_($$5);
            hz $$13 = $$12.b() instanceof ddi && this.a == egx.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aox) {
                  am.z.a((aox)$$1, $$13, $$3);
               }

               $$1.b(atv.c.b(this));
               return blx.a(a($$3, $$1), $$0.y_());
            } else {
               return blx.d($$3);
            }
         }
      }
   }

   public static cpd a(cpd $$0, chl $$1) {
      return !$$1.fU().d ? new cpd(cpg.qx) : $$0;
   }

   @Override
   public void a(@Nullable chl $$0, cvr $$1, cpd $$2, hz $$3) {
   }

   @Override
   public boolean a(@Nullable chl $$0, cvr $$1, hz $$2, @Nullable env $$3) {
      if (!(this.a instanceof egu $$4)) {
         return false;
      } else {
         cys $$7;
         boolean $$8;
         dlj $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof ddi $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(auf.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, atl.iG, atm.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(jz.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof ddi $$15 && this.a == egx.c) {
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

   protected void a(@Nullable chl $$0, cvs $$1, hz $$2) {
      atk $$3 = this.a.a(auf.b) ? atl.cX : atl.cU;
      $$1.a($$0, $$2, $$3, atm.e, 1.0F, 1.0F);
      $$1.a($$0, dpw.z, $$2);
   }
}
