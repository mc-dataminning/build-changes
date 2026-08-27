import javax.annotation.Nullable;

public class cnt extends cpl implements coe {
   private final ehq a;

   public cnt(ehq $$0, cpl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      eor $$4 = a($$0, $$1, this.a == ehs.a ? cvn.b.b : cvn.b.a);
      if ($$4.c() == eot.a.a) {
         return bmm.c($$3);
      } else if ($$4.c() != eot.a.b) {
         return bmm.c($$3);
      } else {
         ib $$5 = $$4.a();
         ih $$6 = $$4.b();
         ib $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bmm.d($$3);
         } else if (this.a == ehs.a) {
            dme $$8 = $$0.a_($$5);
            if ($$8.b() instanceof czm $$9) {
               cpq $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(atz.c.b(this));
                  $$9.aw_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dqr.y, $$5);
                  cpq $$11 = cps.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((apb)$$1, $$10);
                  }

                  return bmm.a($$11, $$0.y_());
               }
            }

            return bmm.d($$3);
         } else {
            dme $$12 = $$0.a_($$5);
            ib $$13 = $$12.b() instanceof ddv && this.a == ehs.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof apb) {
                  am.z.a((apb)$$1, $$13, $$3);
               }

               $$1.b(atz.c.b(this));
               return bmm.a(a($$3, $$1), $$0.y_());
            } else {
               return bmm.d($$3);
            }
         }
      }
   }

   public static cpq a(cpq $$0, cia $$1) {
      return !$$1.fW().d ? new cpq(cpt.qx) : $$0;
   }

   @Override
   public void a(@Nullable cia $$0, cwe $$1, cpq $$2, ib $$3) {
   }

   @Override
   public boolean a(@Nullable cia $$0, cwe $$1, ib $$2, @Nullable eor $$3) {
      if (!(this.a instanceof ehp $$4)) {
         return false;
      } else {
         czf $$7;
         boolean $$8;
         dme $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof ddv $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(auj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, atp.iG, atq.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kb.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof ddv $$15 && this.a == ehs.c) {
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

   protected void a(@Nullable cia $$0, cwf $$1, ib $$2) {
      ato $$3 = this.a.a(auj.b) ? atp.cX : atp.cU;
      $$1.a($$0, $$2, $$3, atq.e, 1.0F, 1.0F);
      $$1.a($$0, dqr.z, $$2);
   }
}
