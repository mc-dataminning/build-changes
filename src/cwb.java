import javax.annotation.Nullable;

public class cwb extends cxl implements cwk {
   private final etw a;

   public cwb(etw $$0, cxl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      fbu $$4 = a($$0, $$1, this.a == ety.a ? dgq.b.b : dgq.b.a);
      if ($$4.d() == fbw.a.a) {
         return btj.e;
      } else if ($$4.d() != fbw.a.b) {
         return btj.e;
      } else {
         jh $$5 = $$4.b();
         jm $$6 = $$4.c();
         jh $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return btj.d;
         } else if (this.a == ety.a) {
            dxv $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dku $$9) {
               cxp $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axp.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ecr.y, $$5);
                  cxp $$11 = cxs.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ao.k.a((asi)$$1, $$10);
                  }

                  return btj.a.a($$11);
               }
            }

            return btj.d;
         } else {
            dxv $$12 = $$0.a_($$5);
            jh $$13 = $$12.b() instanceof dpf && this.a == ety.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof asi) {
                  ao.z.a((asi)$$1, $$13, $$3);
               }

               $$1.b(axp.c.b(this));
               cxp $$14 = cxs.a($$3, $$1, a($$3, $$1));
               return btj.a.a($$14);
            } else {
               return btj.d;
            }
         }
      }
   }

   public static cxp a(cxp $$0, cpx $$1) {
      return !$$1.fV() ? new cxp(cxt.qW) : $$0;
   }

   @Override
   public void a(@Nullable cpx $$0, dhi $$1, cxp $$2, jh $$3) {
   }

   @Override
   public boolean a(@Nullable cpx $$0, dhi $$1, jh $$2, @Nullable fbu $$3) {
      if (!(this.a instanceof etv $$4)) {
         return false;
      } else {
         dkm $$7;
         boolean $$8;
         dxv $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dpf $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.G_().i() && this.a.a(aya.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, axf.jo, axg.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ls.Y, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dpf $$15 && this.a == ety.c) {
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

   protected void a(@Nullable cpx $$0, dhj $$1, jh $$2) {
      axe $$3 = this.a.a(aya.b) ? axf.dg : axf.dd;
      $$1.a($$0, $$2, $$3, axg.e, 1.0F, 1.0F);
      $$1.a($$0, ecr.z, $$2);
   }
}
