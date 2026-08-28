import javax.annotation.Nullable;

public class cwa extends cxk implements cwj {
   private final etv a;

   public cwa(etv $$0, cxk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      fbt $$4 = a($$0, $$1, this.a == etx.a ? dgp.b.b : dgp.b.a);
      if ($$4.d() == fbv.a.a) {
         return bti.e;
      } else if ($$4.d() != fbv.a.b) {
         return bti.e;
      } else {
         jh $$5 = $$4.b();
         jm $$6 = $$4.c();
         jh $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bti.d;
         } else if (this.a == etx.a) {
            dxu $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dkt $$9) {
               cxo $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axp.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ecq.y, $$5);
                  cxo $$11 = cxr.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ao.k.a((asi)$$1, $$10);
                  }

                  return bti.a.a($$11);
               }
            }

            return bti.d;
         } else {
            dxu $$12 = $$0.a_($$5);
            jh $$13 = $$12.b() instanceof dpe && this.a == etx.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof asi) {
                  ao.z.a((asi)$$1, $$13, $$3);
               }

               $$1.b(axp.c.b(this));
               cxo $$14 = cxr.a($$3, $$1, a($$3, $$1));
               return bti.a.a($$14);
            } else {
               return bti.d;
            }
         }
      }
   }

   public static cxo a(cxo $$0, cpw $$1) {
      return !$$1.fV() ? new cxo(cxs.qW) : $$0;
   }

   @Override
   public void a(@Nullable cpw $$0, dhh $$1, cxo $$2, jh $$3) {
   }

   @Override
   public boolean a(@Nullable cpw $$0, dhh $$1, jh $$2, @Nullable fbt $$3) {
      if (!(this.a instanceof etu $$4)) {
         return false;
      } else {
         dkl $$7;
         boolean $$8;
         dxu $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dpe $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
            if ($$7 instanceof dpe $$15 && this.a == etx.c) {
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

   protected void a(@Nullable cpw $$0, dhi $$1, jh $$2) {
      axe $$3 = this.a.a(aya.b) ? axf.dg : axf.dd;
      $$1.a($$0, $$2, $$3, axg.e, 1.0F, 1.0F);
      $$1.a($$0, ecq.z, $$2);
   }
}
