import javax.annotation.Nullable;

public class cyy extends dag implements czg {
   private final exz a;

   public cyy(exz $$0, dag.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      ffy $$4 = a($$0, $$1, this.a == eyb.a ? djq.b.b : djq.b.a);
      if ($$4.d() == fga.a.a) {
         return bvc.e;
      } else if ($$4.d() != fga.a.b) {
         return bvc.e;
      } else {
         iw $$5 = $$4.b();
         jc $$6 = $$4.c();
         iw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bvc.d;
         } else if (this.a == eyb.a) {
            ebq $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dnw $$9) {
               dak $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(axi.c.b(this));
                  $$9.ap_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, egq.y, $$5);
                  dak $$11 = dan.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     aq.k.a((asc)$$1, $$10);
                  }

                  return bvc.a.a($$11);
               }
            }

            return bvc.d;
         } else {
            ebq $$12 = $$0.a_($$5);
            iw $$13 = $$12.b() instanceof dsl && this.a == eyb.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof asc) {
                  aq.z.a((asc)$$1, $$13, $$3);
               }

               $$1.b(axi.c.b(this));
               dak $$14 = dan.a($$3, $$1, b($$3, $$1));
               return bvc.a.a($$14);
            } else {
               return bvc.d;
            }
         }
      }
   }

   public static dak b(dak $$0, csi $$1) {
      return !$$1.fV() ? new dak(dao.ro) : $$0;
   }

   @Override
   public void a(@Nullable byf $$0, dkj $$1, dak $$2, iw $$3) {
   }

   @Override
   public boolean a(@Nullable byf $$0, dkj $$1, iw $$2, @Nullable ffy $$3) {
      if (!(this.a instanceof exy $$4)) {
         return false;
      } else {
         dno $$7;
         boolean $$8;
         ebq $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dsl $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.F_().i() && this.a.a(axs.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awy.jy, awz.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lz.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dsl $$15 && this.a == eyb.c) {
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

   protected void a(@Nullable byf $$0, dkk $$1, iw $$2) {
      awx $$3 = this.a.a(axs.b) ? awy.dg : awy.dd;
      $$1.a($$0, $$2, $$3, awz.e, 1.0F, 1.0F);
      $$1.a($$0, egq.z, $$2);
   }
}
