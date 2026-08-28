import javax.annotation.Nullable;

public class cyb extends czj implements cyj {
   private final ewz a;

   public cyb(ewz $$0, czj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      fey $$4 = a($$0, $$1, this.a == exb.a ? dit.b.b : dit.b.a);
      if ($$4.d() == ffa.a.a) {
         return bug.e;
      } else if ($$4.d() != ffa.a.b) {
         return bug.e;
      } else {
         iv $$5 = $$4.b();
         jb $$6 = $$4.c();
         iv $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bug.d;
         } else if (this.a == exb.a) {
            eat $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dmz $$9) {
               czn $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awx.c.b(this));
                  $$9.ap_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eft.y, $$5);
                  czn $$11 = czq.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     aq.k.a((arr)$$1, $$10);
                  }

                  return bug.a.a($$11);
               }
            }

            return bug.d;
         } else {
            eat $$12 = $$0.a_($$5);
            iv $$13 = $$12.b() instanceof dro && this.a == exb.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arr) {
                  aq.z.a((arr)$$1, $$13, $$3);
               }

               $$1.b(awx.c.b(this));
               czn $$14 = czq.a($$3, $$1, b($$3, $$1));
               return bug.a.a($$14);
            } else {
               return bug.d;
            }
         }
      }
   }

   public static czn b(czn $$0, crm $$1) {
      return !$$1.fU() ? new czn(czr.ro) : $$0;
   }

   @Override
   public void a(@Nullable bxj $$0, djm $$1, czn $$2, iv $$3) {
   }

   @Override
   public boolean a(@Nullable bxj $$0, djm $$1, iv $$2, @Nullable fey $$3) {
      if (!(this.a instanceof ewy $$4)) {
         return false;
      } else {
         dmr $$7;
         boolean $$8;
         eat $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dro $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
            $$1.a($$0, $$2, awn.jy, awo.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ly.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dro $$15 && this.a == exb.c) {
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

   protected void a(@Nullable bxj $$0, djn $$1, iv $$2) {
      awm $$3 = this.a.a(axh.b) ? awn.dg : awn.dd;
      $$1.a($$0, $$2, $$3, awo.e, 1.0F, 1.0F);
      $$1.a($$0, eft.z, $$2);
   }
}
