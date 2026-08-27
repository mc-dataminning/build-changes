import javax.annotation.Nullable;

public class coq extends cqh implements cpb {
   private final eio a;

   public coq(eio $$0, cqh.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      epp $$4 = a($$0, $$1, this.a == eiq.a ? cwk.b.b : cwk.b.a);
      if ($$4.c() == epr.a.a) {
         return bne.c($$3);
      } else if ($$4.c() != epr.a.b) {
         return bne.c($$3);
      } else {
         ib $$5 = $$4.a();
         ih $$6 = $$4.b();
         ib $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bne.d($$3);
         } else if (this.a == eiq.a) {
            dnb $$8 = $$0.a_($$5);
            if ($$8.b() instanceof daj $$9) {
               cqm $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(aui.c.b(this));
                  $$9.av_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, drp.y, $$5);
                  cqm $$11 = cqo.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((apg)$$1, $$10);
                  }

                  return bne.a($$11, $$0.x_());
               }
            }

            return bne.d($$3);
         } else {
            dnb $$12 = $$0.a_($$5);
            ib $$13 = $$12.b() instanceof des && this.a == eiq.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof apg) {
                  am.z.a((apg)$$1, $$13, $$3);
               }

               $$1.b(aui.c.b(this));
               return bne.a(a($$3, $$1), $$0.x_());
            } else {
               return bne.d($$3);
            }
         }
      }
   }

   public static cqm a(cqm $$0, ciu $$1) {
      return !$$1.fM() ? new cqm(cqp.qx) : $$0;
   }

   @Override
   public void a(@Nullable ciu $$0, cxb $$1, cqm $$2, ib $$3) {
   }

   @Override
   public boolean a(@Nullable ciu $$0, cxb $$1, ib $$2, @Nullable epp $$3) {
      if (!(this.a instanceof ein $$4)) {
         return false;
      } else {
         dac $$7;
         boolean $$8;
         dnb $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof des $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(aus.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aty.iN, atz.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kc.V, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof des $$15 && this.a == eiq.c) {
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

   protected void a(@Nullable ciu $$0, cxc $$1, ib $$2) {
      atx $$3 = this.a.a(aus.b) ? aty.de : aty.db;
      $$1.a($$0, $$2, $$3, atz.e, 1.0F, 1.0F);
      $$1.a($$0, drp.z, $$2);
   }
}
