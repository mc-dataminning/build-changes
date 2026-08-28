import javax.annotation.Nullable;

public class csv extends cul implements ctg {
   private final epb a;

   public csv(epb $$0, cul.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      eww $$4 = a($$0, $$1, this.a == epd.a ? dcf.b.b : dcf.b.a);
      if ($$4.c() == ewy.a.a) {
         return bqs.c($$3);
      } else if ($$4.c() != ewy.a.b) {
         return bqs.c($$3);
      } else {
         jd $$5 = $$4.a();
         ji $$6 = $$4.b();
         jd $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bqs.d($$3);
         } else if (this.a == epd.a) {
            dtc $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dgf $$9) {
               cuq $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.e()) {
                  $$1.b(avz.c.b(this));
                  $$9.aw_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dxz.y, $$5);
                  cuq $$11 = cus.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     an.k.a((aqv)$$1, $$10);
                  }

                  return bqs.a($$11, $$0.x_());
               }
            }

            return bqs.d($$3);
         } else {
            dtc $$12 = $$0.a_($$5);
            jd $$13 = $$12.b() instanceof dkp && this.a == epd.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqv) {
                  an.z.a((aqv)$$1, $$13, $$3);
               }

               $$1.b(avz.c.b(this));
               cuq $$14 = cus.a($$3, $$1, a($$3, $$1));
               return bqs.a($$14, $$0.x_());
            } else {
               return bqs.d($$3);
            }
         }
      }
   }

   public static cuq a(cuq $$0, cmx $$1) {
      return !$$1.fM() ? new cuq(cut.qy) : $$0;
   }

   @Override
   public void a(@Nullable cmx $$0, dcw $$1, cuq $$2, jd $$3) {
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcw $$1, jd $$2, @Nullable eww $$3) {
      if (!(this.a instanceof epa $$4)) {
         return false;
      } else {
         dfy $$7;
         boolean $$8;
         dtc $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dkp $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
                  break label70;
               }

               var10000 = false;
               break label82;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         if (!$$10) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.D_().i() && this.a.a(awk.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, avp.iU, avq.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(lm.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dkp $$15 && this.a == epd.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.k()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.g().g(), 11) && !$$6.u().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable cmx $$0, dcx $$1, jd $$2) {
      avo $$3 = this.a.a(awk.b) ? avp.df : avp.dc;
      $$1.a($$0, $$2, $$3, avq.e, 1.0F, 1.0F);
      $$1.a($$0, dxz.z, $$2);
   }
}
