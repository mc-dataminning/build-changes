import javax.annotation.Nullable;

public class coo extends cqf implements coz {
   private final eim a;

   public coo(eim $$0, cqf.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      epn $$4 = a($$0, $$1, this.a == eio.a ? cwi.b.b : cwi.b.a);
      if ($$4.c() == epp.a.a) {
         return bnd.c($$3);
      } else if ($$4.c() != epp.a.b) {
         return bnd.c($$3);
      } else {
         ib $$5 = $$4.a();
         ih $$6 = $$4.b();
         ib $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bnd.d($$3);
         } else if (this.a == eio.a) {
            dmz $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dah $$9) {
               cqk $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(aui.c.b(this));
                  $$9.av_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, drn.y, $$5);
                  cqk $$11 = cqm.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((apg)$$1, $$10);
                  }

                  return bnd.a($$11, $$0.x_());
               }
            }

            return bnd.d($$3);
         } else {
            dmz $$12 = $$0.a_($$5);
            ib $$13 = $$12.b() instanceof deq && this.a == eio.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof apg) {
                  am.z.a((apg)$$1, $$13, $$3);
               }

               $$1.b(aui.c.b(this));
               return bnd.a(a($$3, $$1), $$0.x_());
            } else {
               return bnd.d($$3);
            }
         }
      }
   }

   public static cqk a(cqk $$0, cis $$1) {
      return !$$1.fM() ? new cqk(cqn.qx) : $$0;
   }

   @Override
   public void a(@Nullable cis $$0, cwz $$1, cqk $$2, ib $$3) {
   }

   @Override
   public boolean a(@Nullable cis $$0, cwz $$1, ib $$2, @Nullable epn $$3) {
      if (!(this.a instanceof eil $$4)) {
         return false;
      } else {
         daa $$7;
         boolean $$8;
         dmz $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof deq $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
            $$1.a($$0, $$2, aty.iJ, atz.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kc.V, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof deq $$15 && this.a == eio.c) {
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

   protected void a(@Nullable cis $$0, cxa $$1, ib $$2) {
      atx $$3 = this.a.a(aus.b) ? aty.da : aty.cX;
      $$1.a($$0, $$2, $$3, atz.e, 1.0F, 1.0F);
      $$1.a($$0, drn.z, $$2);
   }
}
