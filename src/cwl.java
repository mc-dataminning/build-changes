import javax.annotation.Nullable;

public class cwl extends cxu implements cwt {
   private final eus a;

   public cwl(eus $$0, cxu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      fcq $$4 = a($$0, $$1, this.a == euu.a ? dgy.b.b : dgy.b.a);
      if ($$4.d() == fcs.a.a) {
         return btq.e;
      } else if ($$4.d() != fcs.a.b) {
         return btq.e;
      } else {
         jj $$5 = $$4.b();
         jo $$6 = $$4.c();
         jj $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return btq.d;
         } else if (this.a == euu.a) {
            dym $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dlc $$9) {
               cxy $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awu.c.b(this));
                  $$9.ao_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, edm.y, $$5);
                  cxy $$11 = cyb.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((aro)$$1, $$10);
                  }

                  return btq.a.a($$11);
               }
            }

            return btq.d;
         } else {
            dym $$12 = $$0.a_($$5);
            jj $$13 = $$12.b() instanceof dpp && this.a == euu.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aro) {
                  ap.z.a((aro)$$1, $$13, $$3);
               }

               $$1.b(awu.c.b(this));
               cxy $$14 = cyb.a($$3, $$1, b($$3, $$1));
               return btq.a.a($$14);
            } else {
               return btq.d;
            }
         }
      }
   }

   public static cxy b(cxy $$0, cqi $$1) {
      return !$$1.fU() ? new cxy(cyc.rj) : $$0;
   }

   @Override
   public void a(@Nullable bwr $$0, dhp $$1, cxy $$2, jj $$3) {
   }

   @Override
   public boolean a(@Nullable bwr $$0, dhp $$1, jj $$2, @Nullable fcq $$3) {
      if (!(this.a instanceof eur $$4)) {
         return false;
      } else {
         dku $$7;
         boolean $$8;
         dym $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dpp $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.B_().i() && this.a.a(axf.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awk.ju, awl.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lv.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dpp $$15 && this.a == euu.c) {
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

   protected void a(@Nullable bwr $$0, dhq $$1, jj $$2) {
      awj $$3 = this.a.a(axf.b) ? awk.dg : awk.dd;
      $$1.a($$0, $$2, $$3, awl.e, 1.0F, 1.0F);
      $$1.a($$0, edm.z, $$2);
   }
}
