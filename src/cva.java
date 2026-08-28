import javax.annotation.Nullable;

public class cva extends cwk implements cvj {
   private final esx a;

   public cva(esx $$0, cwk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      fav $$4 = a($$0, $$1, this.a == esz.a ? dfp.b.b : dfp.b.a);
      if ($$4.d() == fax.a.a) {
         return bsj.e;
      } else if ($$4.d() != fax.a.b) {
         return bsj.e;
      } else {
         ji $$5 = $$4.b();
         jn $$6 = $$4.c();
         ji $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bsj.d;
         } else if (this.a == esz.a) {
            dww $$8 = $$0.a_($$5);
            if ($$8.b() instanceof djt $$9) {
               cwo $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awk.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ebs.y, $$5);
                  cwo $$11 = cwr.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((are)$$1, $$10);
                  }

                  return bsj.a.a($$11);
               }
            }

            return bsj.d;
         } else {
            dww $$12 = $$0.a_($$5);
            ji $$13 = $$12.b() instanceof doe && this.a == esz.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof are) {
                  ap.z.a((are)$$1, $$13, $$3);
               }

               $$1.b(awk.c.b(this));
               cwo $$14 = cwr.a($$3, $$1, b($$3, $$1));
               return bsj.a.a($$14);
            } else {
               return bsj.d;
            }
         }
      }
   }

   public static cwo b(cwo $$0, cow $$1) {
      return !$$1.fV() ? new cwo(cws.rf) : $$0;
   }

   @Override
   public void a(@Nullable cow $$0, dgh $$1, cwo $$2, ji $$3) {
   }

   @Override
   public boolean a(@Nullable cow $$0, dgh $$1, ji $$2, @Nullable fav $$3) {
      if (!(this.a instanceof esw $$4)) {
         return false;
      } else {
         djl $$7;
         boolean $$8;
         dww $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof doe $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
            if ($$7 instanceof doe $$15 && this.a == esz.c) {
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

   protected void a(@Nullable cow $$0, dgi $$1, ji $$2) {
      avz $$3 = this.a.a(awv.b) ? awa.dg : awa.dd;
      $$1.a($$0, $$2, $$3, awb.e, 1.0F, 1.0F);
      $$1.a($$0, ebs.z, $$2);
   }
}
