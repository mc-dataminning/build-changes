import javax.annotation.Nullable;

public class cym extends czu implements cyu {
   private final exn a;

   public cym(exn $$0, czu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      ffm $$4 = a($$0, $$1, this.a == exp.a ? dje.b.b : dje.b.a);
      if ($$4.d() == ffo.a.a) {
         return bur.e;
      } else if ($$4.d() != ffo.a.b) {
         return bur.e;
      } else {
         iv $$5 = $$4.b();
         jb $$6 = $$4.c();
         iv $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bur.d;
         } else if (this.a == exp.a) {
            ebe $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dnk $$9) {
               czy $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awz.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, ege.y, $$5);
                  czy $$11 = dab.a($$3, $$1, $$10);
                  if (!$$0.C) {
                     aq.k.a((art)$$1, $$10);
                  }

                  return bur.a.a($$11);
               }
            }

            return bur.d;
         } else {
            ebe $$12 = $$0.a_($$5);
            iv $$13 = $$12.b() instanceof drz && this.a == exp.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof art) {
                  aq.z.a((art)$$1, $$13, $$3);
               }

               $$1.b(awz.c.b(this));
               czy $$14 = dab.a($$3, $$1, b($$3, $$1));
               return bur.a.a($$14);
            } else {
               return bur.d;
            }
         }
      }
   }

   public static czy b(czy $$0, crx $$1) {
      return !$$1.fV() ? new czy(dac.ro) : $$0;
   }

   @Override
   public void a(@Nullable bxu $$0, djx $$1, czy $$2, iv $$3) {
   }

   @Override
   public boolean a(@Nullable bxu $$0, djx $$1, iv $$2, @Nullable ffm $$3) {
      if (!(this.a instanceof exm $$4)) {
         return false;
      } else {
         dnc $$7;
         boolean $$8;
         ebe $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof drz $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.F_().i() && this.a.a(axj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awp.jy, awq.e, 0.5F, 2.6F + ($$1.A.i() - $$1.A.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ly.aa, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof drz $$15 && this.a == exp.c) {
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

   protected void a(@Nullable bxu $$0, djy $$1, iv $$2) {
      awo $$3 = this.a.a(axj.b) ? awp.dg : awp.dd;
      $$1.a($$0, $$2, $$3, awq.e, 1.0F, 1.0F);
      $$1.a($$0, ege.z, $$2);
   }
}
