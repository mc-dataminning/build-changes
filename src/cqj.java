import javax.annotation.Nullable;

public class cqj extends cry implements cqu {
   private final elq a;

   public cqj(elq $$0, cry.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      etb $$4 = a($$0, $$1, this.a == els.a ? czd.b.b : czd.b.a);
      if ($$4.c() == etd.a.a) {
         return bor.c($$3);
      } else if ($$4.c() != etd.a.b) {
         return bor.c($$3);
      } else {
         im $$5 = $$4.a();
         ir $$6 = $$4.b();
         im $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bor.d($$3);
         } else if (this.a == els.a) {
            dpy $$8 = $$0.a_($$5);
            if ($$8.b() instanceof ddc $$9) {
               csd $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.d()) {
                  $$1.b(avj.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dur.y, $$5);
                  csd $$11 = csf.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((aqf)$$1, $$10);
                  }

                  return bor.a($$11, $$0.x_());
               }
            }

            return bor.d($$3);
         } else {
            dpy $$12 = $$0.a_($$5);
            im $$13 = $$12.b() instanceof dhm && this.a == els.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aqf) {
                  am.z.a((aqf)$$1, $$13, $$3);
               }

               $$1.b(avj.c.b(this));
               return bor.a(a($$3, $$1), $$0.x_());
            } else {
               return bor.d($$3);
            }
         }
      }
   }

   public static csd a(csd $$0, ckl $$1) {
      return !$$1.fN() ? new csd(csg.qy) : $$0;
   }

   @Override
   public void a(@Nullable ckl $$0, czu $$1, csd $$2, im $$3) {
   }

   @Override
   public boolean a(@Nullable ckl $$0, czu $$1, im $$2, @Nullable etb $$3) {
      if (!(this.a instanceof elp $$4)) {
         return false;
      } else {
         dcv $$7;
         boolean $$8;
         dpy $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dhm $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(avt.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, auz.iP, ava.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kw.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dhm $$15 && this.a == els.c) {
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

   protected void a(@Nullable ckl $$0, czv $$1, im $$2) {
      auy $$3 = this.a.a(avt.b) ? auz.df : auz.dc;
      $$1.a($$0, $$2, $$3, ava.e, 1.0F, 1.0F);
      $$1.a($$0, dur.z, $$2);
   }
}
