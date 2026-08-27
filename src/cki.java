import javax.annotation.Nullable;

public class cki extends cmc implements ckt {
   private final edy a;

   public cki(edy $$0, cmc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      ekx $$4 = a($$0, $$1, this.a == eea.a ? csh.b.b : csh.b.a);
      if ($$4.c() == ekz.a.a) {
         return bjm.c($$3);
      } else if ($$4.c() != ekz.a.b) {
         return bjm.c($$3);
      } else {
         hv $$5 = $$4.a();
         ia $$6 = $$4.b();
         hv $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bjm.d($$3);
         } else if (this.a == eea.a) {
            dip $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cwg $$9) {
               cmh $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(arm.c.b(this));
                  $$9.au_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dmz.y, $$5);
                  cmh $$11 = cmj.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((amq)$$1, $$10);
                  }

                  return bjm.a($$11, $$0.y_());
               }
            }

            return bjm.d($$3);
         } else {
            dip $$12 = $$0.a_($$5);
            hv $$13 = $$12.b() instanceof dap && this.a == eea.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof amq) {
                  am.z.a((amq)$$1, $$13, $$3);
               }

               $$1.b(arm.c.b(this));
               return bjm.a(a($$3, $$1), $$0.y_());
            } else {
               return bjm.d($$3);
            }
         }
      }
   }

   public static cmh a(cmh $$0, cer $$1) {
      return !$$1.fT().d ? new cmh(cmk.qv) : $$0;
   }

   @Override
   public void a(@Nullable cer $$0, csy $$1, cmh $$2, hv $$3) {
   }

   @Override
   public boolean a(@Nullable cer $$0, csy $$1, hv $$2, @Nullable ekx $$3) {
      if (!(this.a instanceof edx $$4)) {
         return false;
      } else {
         cvz $$7;
         boolean $$8;
         dip $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dap $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.E_().i() && this.a.a(arw.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, arc.iq, ard.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(jv.U, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dap $$15 && this.a == eea.c) {
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

   protected void a(@Nullable cer $$0, csz $$1, hv $$2) {
      arb $$3 = this.a.a(arw.b) ? arc.cH : arc.cE;
      $$1.a($$0, $$2, $$3, ard.e, 1.0F, 1.0F);
      $$1.a($$0, dmz.z, $$2);
   }
}
