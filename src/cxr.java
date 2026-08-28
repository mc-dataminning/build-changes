import javax.annotation.Nullable;

public class cxr extends cyz implements cxz {
   private final ewn a;

   public cxr(ewn $$0, cyz.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      fem $$4 = a($$0, $$1, this.a == ewp.a ? dij.b.b : dij.b.a);
      if ($$4.d() == feo.a.a) {
         return bud.e;
      } else if ($$4.d() != feo.a.b) {
         return bud.e;
      } else {
         iu $$5 = $$4.b();
         ja $$6 = $$4.c();
         iu $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bud.d;
         } else if (this.a == ewp.a) {
            eah $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dmn $$9) {
               czd $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awx.c.b(this));
                  $$9.ap_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, efh.y, $$5);
                  czd $$11 = czg.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     ap.k.a((arr)$$1, $$10);
                  }

                  return bud.a.a($$11);
               }
            }

            return bud.d;
         } else {
            eah $$12 = $$0.a_($$5);
            iu $$13 = $$12.b() instanceof drc && this.a == ewp.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arr) {
                  ap.z.a((arr)$$1, $$13, $$3);
               }

               $$1.b(awx.c.b(this));
               czd $$14 = czg.a($$3, $$1, b($$3, $$1));
               return bud.a.a($$14);
            } else {
               return bud.d;
            }
         }
      }
   }

   public static czd b(czd $$0, crc $$1) {
      return !$$1.fV() ? new czd(czh.ro) : $$0;
   }

   @Override
   public void a(@Nullable bxe $$0, dja $$1, czd $$2, iu $$3) {
   }

   @Override
   public boolean a(@Nullable bxe $$0, dja $$1, iu $$2, @Nullable fem $$3) {
      if (!(this.a instanceof ewm $$4)) {
         return false;
      } else {
         dmf $$7;
         boolean $$8;
         eah $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof drc $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
               $$1.a(lx.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof drc $$15 && this.a == ewp.c) {
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

   protected void a(@Nullable bxe $$0, djb $$1, iu $$2) {
      awm $$3 = this.a.a(axh.b) ? awn.dg : awn.dd;
      $$1.a($$0, $$2, $$3, awo.e, 1.0F, 1.0F);
      $$1.a($$0, efh.z, $$2);
   }
}
