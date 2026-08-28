import javax.annotation.Nullable;

public class csw extends cul implements cth {
   private final env a;

   public csw(env $$0, cul.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      evo $$4 = a($$0, $$1, this.a == enx.a ? dbi.b.b : dbi.b.a);
      if ($$4.c() == evq.a.a) {
         return bqw.c($$3);
      } else if ($$4.c() != evq.a.b) {
         return bqw.c($$3);
      } else {
         iz $$5 = $$4.a();
         je $$6 = $$4.b();
         iz $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqw.d($$3);
         } else if (this.a == enx.a) {
            dsd $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dfh $$9) {
               cuq $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(awk.c.b(this));
                  $$9.ar_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dww.y, $$5);
                  cuq $$11 = cus.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((arg)$$1, $$10);
                  }

                  return bqw.a($$11, $$0.x_());
               }
            }

            return bqw.d($$3);
         } else {
            dsd $$12 = $$0.a_($$5);
            iz $$13 = $$12.b() instanceof djr && this.a == enx.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arg) {
                  am.z.a((arg)$$1, $$13, $$3);
               }

               $$1.b(awk.c.b(this));
               return bqw.a(a($$3, $$1), $$0.x_());
            } else {
               return bqw.d($$3);
            }
         }
      }
   }

   public static cuq a(cuq $$0, cmy $$1) {
      return !$$1.fP() ? new cuq(cut.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmy $$0, dbz $$1, cuq $$2, iz $$3) {
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbz $$1, iz $$2, @Nullable evo $$3) {
      if (!(this.a instanceof enu $$4)) {
         return false;
      } else {
         dfa $$7;
         boolean $$8;
         dsd $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof djr $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(awv.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awa.iU, awb.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(li.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof djr $$15 && this.a == enx.c) {
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

   protected void a(@Nullable cmy $$0, dca $$1, iz $$2) {
      avz $$3 = this.a.a(awv.b) ? awa.df : awa.dc;
      $$1.a($$0, $$2, $$3, awb.e, 1.0F, 1.0F);
      $$1.a($$0, dww.z, $$2);
   }
}
