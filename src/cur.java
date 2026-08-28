import javax.annotation.Nullable;

public class cur extends cwb implements cva {
   private final ern a;

   public cur(ern $$0, cwb.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      ezn $$4 = a($$0, $$1, this.a == erp.a ? den.b.b : den.b.a);
      if ($$4.d() == ezp.a.a) {
         return bsh.e;
      } else if ($$4.d() != ezp.a.b) {
         return bsh.e;
      } else {
         jh $$5 = $$4.b();
         jm $$6 = $$4.c();
         jh $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bsh.d;
         } else if (this.a == erp.a) {
            dvo $$8 = $$0.a_($$5);
            if ($$8.b() instanceof diq $$9) {
               cwf $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awy.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eak.y, $$5);
                  cwf $$11 = cwi.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ao.k.a((arr)$$1, $$10);
                  }

                  return bsh.a.a($$11);
               }
            }

            return bsh.d;
         } else {
            dvo $$12 = $$0.a_($$5);
            jh $$13 = $$12.b() instanceof dmz && this.a == erp.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arr) {
                  ao.z.a((arr)$$1, $$13, $$3);
               }

               $$1.b(awy.c.b(this));
               cwf $$14 = cwi.a($$3, $$1, a($$3, $$1));
               return bsh.a.a($$14);
            } else {
               return bsh.d;
            }
         }
      }
   }

   public static cwf a(cwf $$0, cor $$1) {
      return !$$1.fY() ? new cwf(cwj.qz) : $$0;
   }

   @Override
   public void a(@Nullable cor $$0, dff $$1, cwf $$2, jh $$3) {
   }

   @Override
   public boolean a(@Nullable cor $$0, dff $$1, jh $$2, @Nullable ezn $$3) {
      if (!(this.a instanceof erm $$4)) {
         return false;
      } else {
         dij $$7;
         boolean $$8;
         dvo $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dmz $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(axj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awo.iV, awp.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ls.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dmz $$15 && this.a == erp.c) {
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

   protected void a(@Nullable cor $$0, dfg $$1, jh $$2) {
      awn $$3 = this.a.a(axj.b) ? awo.df : awo.dc;
      $$1.a($$0, $$2, $$3, awp.e, 1.0F, 1.0F);
      $$1.a($$0, eak.z, $$2);
   }
}
