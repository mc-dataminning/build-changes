import javax.annotation.Nullable;

public class ctr extends cvg implements cuc {
   private final eqa a;

   public ctr(eqa $$0, cvg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      eya $$4 = a($$0, $$1, this.a == eqc.a ? dda.b.b : dda.b.a);
      if ($$4.c() == eyc.a.a) {
         return brk.e;
      } else if ($$4.c() != eyc.a.b) {
         return brk.e;
      } else {
         je $$5 = $$4.a();
         jj $$6 = $$4.b();
         je $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return brk.d;
         } else if (this.a == eqc.a) {
            dua $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dhc $$9) {
               cvl $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.f()) {
                  $$1.b(awn.c.b(this));
                  $$9.av_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dyx.y, $$5);
                  cvl $$11 = cvn.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     an.k.a((arh)$$1, $$10);
                  }

                  return brk.a.a($$11);
               }
            }

            return brk.d;
         } else {
            dua $$12 = $$0.a_($$5);
            je $$13 = $$12.b() instanceof dlm && this.a == eqc.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof arh) {
                  an.z.a((arh)$$1, $$13, $$3);
               }

               $$1.b(awn.c.b(this));
               cvl $$14 = cvn.a($$3, $$1, a($$3, $$1));
               return brk.a.a($$14);
            } else {
               return brk.d;
            }
         }
      }
   }

   public static cvl a(cvl $$0, cnp $$1) {
      return !$$1.fP() ? new cvl(cvo.qz) : $$0;
   }

   @Override
   public void a(@Nullable cnp $$0, dds $$1, cvl $$2, je $$3) {
   }

   @Override
   public boolean a(@Nullable cnp $$0, dds $$1, je $$2, @Nullable eya $$3) {
      if (!(this.a instanceof epz $$4)) {
         return false;
      } else {
         dgv $$7;
         boolean $$8;
         dua $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.l() && !$$8) {
               if ($$7 instanceof dlm $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.B_().i() && this.a.a(awy.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, awd.iV, awe.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ln.X, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dlm $$15 && this.a == eqc.c) {
               $$15.a($$1, $$2, $$6, $$4.a(false));
               this.a($$0, $$1, $$2);
               return true;
            }

            if (!$$1.B && $$8 && !$$6.n()) {
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

   protected void a(@Nullable cnp $$0, ddt $$1, je $$2) {
      awc $$3 = this.a.a(awy.b) ? awd.df : awd.dc;
      $$1.a($$0, $$2, $$3, awe.e, 1.0F, 1.0F);
      $$1.a($$0, dyx.z, $$2);
   }
}
