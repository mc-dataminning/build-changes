import javax.annotation.Nullable;

public class cpy extends crn implements cqj {
   private final ela a;

   public cpy(ela $$0, crn.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      esf $$4 = a($$0, $$1, this.a == elc.a ? cyp.b.b : cyp.b.a);
      if ($$4.c() == esh.a.a) {
         return bog.c($$3);
      } else if ($$4.c() != esh.a.b) {
         return bog.c($$3);
      } else {
         id $$5 = $$4.a();
         ij $$6 = $$4.b();
         id $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bog.d($$3);
         } else if (this.a == elc.a) {
            dpi $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dco $$9) {
               crs $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.d()) {
                  $$1.b(auz.c.b(this));
                  $$9.as_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dub.y, $$5);
                  crs $$11 = cru.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((apv)$$1, $$10);
                  }

                  return bog.a($$11, $$0.x_());
               }
            }

            return bog.d($$3);
         } else {
            dpi $$12 = $$0.a_($$5);
            id $$13 = $$12.b() instanceof dgx && this.a == elc.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof apv) {
                  am.z.a((apv)$$1, $$13, $$3);
               }

               $$1.b(auz.c.b(this));
               return bog.a(a($$3, $$1), $$0.x_());
            } else {
               return bog.d($$3);
            }
         }
      }
   }

   public static crs a(crs $$0, cka $$1) {
      return !$$1.fM() ? new crs(crv.qx) : $$0;
   }

   @Override
   public void a(@Nullable cka $$0, czg $$1, crs $$2, id $$3) {
   }

   @Override
   public boolean a(@Nullable cka $$0, czg $$1, id $$2, @Nullable esf $$3) {
      if (!(this.a instanceof ekz $$4)) {
         return false;
      } else {
         dch $$7;
         boolean $$8;
         dpi $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dgx $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(avj.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, auo.iP, aup.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kn.V, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dgx $$15 && this.a == elc.c) {
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

   protected void a(@Nullable cka $$0, czh $$1, id $$2) {
      aun $$3 = this.a.a(avj.b) ? auo.df : auo.dc;
      $$1.a($$0, $$2, $$3, aup.e, 1.0F, 1.0F);
      $$1.a($$0, dub.z, $$2);
   }
}
