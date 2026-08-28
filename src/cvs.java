import javax.annotation.Nullable;

public class cvs extends cxc implements cwb {
   private final etp a;

   public cvs(etp $$0, cxc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      fbn $$4 = a($$0, $$1, this.a == etr.a ? dgh.b.b : dgh.b.a);
      if ($$4.d() == fbp.a.a) {
         return bta.e;
      } else if ($$4.d() != fbp.a.b) {
         return bta.e;
      } else {
         jh $$5 = $$4.b();
         jm $$6 = $$4.c();
         jh $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bta.d;
         } else if (this.a == etr.a) {
            dxo $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dkl $$9) {
               cxg $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axf.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eck.y, $$5);
                  cxg $$11 = cxj.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ao.k.a((ary)$$1, $$10);
                  }

                  return bta.a.a($$11);
               }
            }

            return bta.d;
         } else {
            dxo $$12 = $$0.a_($$5);
            jh $$13 = $$12.b() instanceof dow && this.a == etr.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof ary) {
                  ao.z.a((ary)$$1, $$13, $$3);
               }

               $$1.b(axf.c.b(this));
               cxg $$14 = cxj.a($$3, $$1, a($$3, $$1));
               return bta.a.a($$14);
            } else {
               return bta.d;
            }
         }
      }
   }

   public static cxg a(cxg $$0, cpo $$1) {
      return !$$1.fV() ? new cxg(cxk.rf) : $$0;
   }

   @Override
   public void a(@Nullable cpo $$0, dgz $$1, cxg $$2, jh $$3) {
   }

   @Override
   public boolean a(@Nullable cpo $$0, dgz $$1, jh $$2, @Nullable fbn $$3) {
      if (!(this.a instanceof eto $$4)) {
         return false;
      } else {
         dkd $$7;
         boolean $$8;
         dxo $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dow $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.G_().i() && this.a.a(axq.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awv.ju, aww.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ls.Z, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dow $$15 && this.a == etr.c) {
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

   protected void a(@Nullable cpo $$0, dha $$1, jh $$2) {
      awu $$3 = this.a.a(axq.b) ? awv.dg : awv.dd;
      $$1.a($$0, $$2, $$3, aww.e, 1.0F, 1.0F);
      $$1.a($$0, eck.z, $$2);
   }
}
