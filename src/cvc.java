import javax.annotation.Nullable;

public class cvc extends cwm implements cvl {
   private final esz a;

   public cvc(esz $$0, cwm.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      fax $$4 = a($$0, $$1, this.a == etb.a ? dfr.b.b : dfr.b.a);
      if ($$4.d() == faz.a.a) {
         return bsl.e;
      } else if ($$4.d() != faz.a.b) {
         return bsl.e;
      } else {
         ji $$5 = $$4.b();
         jn $$6 = $$4.c();
         ji $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bsl.d;
         } else if (this.a == etb.a) {
            dwy $$8 = $$0.a_($$5);
            if ($$8.b() instanceof djv $$9) {
               cwq $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awk.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ebu.y, $$5);
                  cwq $$11 = cwt.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((are)$$1, $$10);
                  }

                  return bsl.a.a($$11);
               }
            }

            return bsl.d;
         } else {
            dwy $$12 = $$0.a_($$5);
            ji $$13 = $$12.b() instanceof dog && this.a == etb.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof are) {
                  ap.z.a((are)$$1, $$13, $$3);
               }

               $$1.b(awk.c.b(this));
               cwq $$14 = cwt.a($$3, $$1, b($$3, $$1));
               return bsl.a.a($$14);
            } else {
               return bsl.d;
            }
         }
      }
   }

   public static cwq b(cwq $$0, coy $$1) {
      return !$$1.fV() ? new cwq(cwu.rf) : $$0;
   }

   @Override
   public void a(@Nullable coy $$0, dgj $$1, cwq $$2, ji $$3) {
   }

   @Override
   public boolean a(@Nullable coy $$0, dgj $$1, ji $$2, @Nullable fax $$3) {
      if (!(this.a instanceof esy $$4)) {
         return false;
      } else {
         djn $$7;
         boolean $$8;
         dwy $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dog $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.G_().i() && this.a.a(awv.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awa.ju, awb.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lt.Z, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dog $$15 && this.a == etb.c) {
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

   protected void a(@Nullable coy $$0, dgk $$1, ji $$2) {
      avz $$3 = this.a.a(awv.b) ? awa.dg : awa.dd;
      $$1.a($$0, $$2, $$3, awb.e, 1.0F, 1.0F);
      $$1.a($$0, ebu.z, $$2);
   }
}
