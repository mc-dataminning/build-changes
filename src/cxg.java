import javax.annotation.Nullable;

public class cxg extends cyo implements cxo {
   private final evu a;

   public cxg(evu $$0, cyo.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      fds $$4 = a($$0, $$1, this.a == evw.a ? dhy.b.b : dhy.b.a);
      if ($$4.d() == fdu.a.a) {
         return bty.e;
      } else if ($$4.d() != fdu.a.b) {
         return bty.e;
      } else {
         iu $$5 = $$4.b();
         ja $$6 = $$4.c();
         iu $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bty.d;
         } else if (this.a == evw.a) {
            dzo $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dmc $$9) {
               cys $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awv.c.b(this));
                  $$9.ao_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, eeo.y, $$5);
                  cys $$11 = cyv.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((arp)$$1, $$10);
                  }

                  return bty.a.a($$11);
               }
            }

            return bty.d;
         } else {
            dzo $$12 = $$0.a_($$5);
            iu $$13 = $$12.b() instanceof dqp && this.a == evw.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arp) {
                  ap.z.a((arp)$$1, $$13, $$3);
               }

               $$1.b(awv.c.b(this));
               cys $$14 = cyv.a($$3, $$1, b($$3, $$1));
               return bty.a.a($$14);
            } else {
               return bty.d;
            }
         }
      }
   }

   public static cys b(cys $$0, cqs $$1) {
      return !$$1.fU() ? new cys(cyw.rj) : $$0;
   }

   @Override
   public void a(@Nullable bwz $$0, dip $$1, cys $$2, iu $$3) {
   }

   @Override
   public boolean a(@Nullable bwz $$0, dip $$1, iu $$2, @Nullable fds $$3) {
      if (!(this.a instanceof evt $$4)) {
         return false;
      } else {
         dlu $$7;
         boolean $$8;
         dzo $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dqp $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
            $$1.a($$0, $$2, awl.ju, awm.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lx.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dqp $$15 && this.a == evw.c) {
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

   protected void a(@Nullable bwz $$0, diq $$1, iu $$2) {
      awk $$3 = this.a.a(axf.b) ? awl.dg : awl.dd;
      $$1.a($$0, $$2, $$3, awm.e, 1.0F, 1.0F);
      $$1.a($$0, eeo.z, $$2);
   }
}
