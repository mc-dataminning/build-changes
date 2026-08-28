import javax.annotation.Nullable;

public class csg extends ctv implements csr {
   private final eoa a;

   public csg(eoa $$0, ctv.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      evv $$4 = a($$0, $$1, this.a == eoc.a ? dbm.b.b : dbm.b.a);
      if ($$4.c() == evx.a.a) {
         return bqe.c($$3);
      } else if ($$4.c() != evx.a.b) {
         return bqe.c($$3);
      } else {
         ja $$5 = $$4.a();
         jf $$6 = $$4.b();
         ja $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqe.d($$3);
         } else if (this.a == eoc.a) {
            dsh $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dfm $$9) {
               cua $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avp.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dxa.y, $$5);
                  cua $$11 = cuc.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aql)$$1, $$10);
                  }

                  return bqe.a($$11, $$0.x_());
               }
            }

            return bqe.d($$3);
         } else {
            dsh $$12 = $$0.a_($$5);
            ja $$13 = $$12.b() instanceof djw && this.a == eoc.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aql) {
                  am.z.a((aql)$$1, $$13, $$3);
               }

               $$1.b(avp.c.b(this));
               return bqe.a(a($$3, $$1), $$0.x_());
            } else {
               return bqe.d($$3);
            }
         }
      }
   }

   public static cua a(cua $$0, cmh $$1) {
      return !$$1.fL() ? new cua(cud.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmh $$0, dcd $$1, cua $$2, ja $$3) {
   }

   @Override
   public boolean a(@Nullable cmh $$0, dcd $$1, ja $$2, @Nullable evv $$3) {
      if (!(this.a instanceof enz $$4)) {
         return false;
      } else {
         dff $$7;
         boolean $$8;
         dsh $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djw $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awa.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avf.iU, avg.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lj.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djw $$15 && this.a == eoc.c) {
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

   protected void a(@Nullable cmh $$0, dce $$1, ja $$2) {
      ave $$3 = this.a.a(awa.b) ? avf.df : avf.dc;
      $$1.a($$0, $$2, $$3, avg.e, 1.0F, 1.0F);
      $$1.a($$0, dxa.z, $$2);
   }
}
