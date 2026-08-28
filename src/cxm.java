import javax.annotation.Nullable;

public class cxm extends cyu implements cxu {
   private final ewf a;

   public cxm(ewf $$0, cyu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      fee $$4 = a($$0, $$1, this.a == ewh.a ? die.b.b : die.b.a);
      if ($$4.d() == feg.a.a) {
         return bub.e;
      } else if ($$4.d() != feg.a.b) {
         return bub.e;
      } else {
         iu $$5 = $$4.b();
         ja $$6 = $$4.c();
         iu $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bub.d;
         } else if (this.a == ewh.a) {
            dzz $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dmi $$9) {
               cyy $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awx.c.b(this));
                  $$9.ao_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eez.y, $$5);
                  cyy $$11 = czb.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((arr)$$1, $$10);
                  }

                  return bub.a.a($$11);
               }
            }

            return bub.d;
         } else {
            dzz $$12 = $$0.a_($$5);
            iu $$13 = $$12.b() instanceof dqw && this.a == ewh.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arr) {
                  ap.z.a((arr)$$1, $$13, $$3);
               }

               $$1.b(awx.c.b(this));
               cyy $$14 = czb.a($$3, $$1, b($$3, $$1));
               return bub.a.a($$14);
            } else {
               return bub.d;
            }
         }
      }
   }

   public static cyy b(cyy $$0, cqy $$1) {
      return !$$1.fU() ? new cyy(czc.rl) : $$0;
   }

   @Override
   public void a(@Nullable bxc $$0, div $$1, cyy $$2, iu $$3) {
   }

   @Override
   public boolean a(@Nullable bxc $$0, div $$1, iu $$2, @Nullable fee $$3) {
      if (!(this.a instanceof ewe $$4)) {
         return false;
      } else {
         dma $$7;
         boolean $$8;
         dzz $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dqw $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.B_().i() && this.a.a(axh.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awn.jv, awo.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lx.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dqw $$15 && this.a == ewh.c) {
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

   protected void a(@Nullable bxc $$0, diw $$1, iu $$2) {
      awm $$3 = this.a.a(axh.b) ? awn.dg : awn.dd;
      $$1.a($$0, $$2, $$3, awo.e, 1.0F, 1.0F);
      $$1.a($$0, eez.z, $$2);
   }
}
