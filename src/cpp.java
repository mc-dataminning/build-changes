import javax.annotation.Nullable;

public class cpp extends cre implements cqa {
   private final ekr a;

   public cpp(ekr $$0, cre.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      erw $$4 = a($$0, $$1, this.a == ekt.a ? cyg.b.b : cyg.b.a);
      if ($$4.c() == ery.a.a) {
         return bob.c($$3);
      } else if ($$4.c() != ery.a.b) {
         return bob.c($$3);
      } else {
         ib $$5 = $$4.a();
         ih $$6 = $$4.b();
         ib $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bob.d($$3);
         } else if (this.a == ekt.a) {
            doz $$8 = $$0.a_($$5);
            if ($$8.b() instanceof dcf $$9) {
               crj $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.d()) {
                  $$1.b(auw.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dts.y, $$5);
                  crj $$11 = crl.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     am.k.a((apt)$$1, $$10);
                  }

                  return bob.a($$11, $$0.x_());
               }
            }

            return bob.d($$3);
         } else {
            doz $$12 = $$0.a_($$5);
            ib $$13 = $$12.b() instanceof dgo && this.a == ekt.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof apt) {
                  am.z.a((apt)$$1, $$13, $$3);
               }

               $$1.b(auw.c.b(this));
               return bob.a(a($$3, $$1), $$0.x_());
            } else {
               return bob.d($$3);
            }
         }
      }
   }

   public static crj a(crj $$0, cjt $$1) {
      return !$$1.fM() ? new crj(crm.qx) : $$0;
   }

   @Override
   public void a(@Nullable cjt $$0, cyx $$1, crj $$2, ib $$3) {
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyx $$1, ib $$2, @Nullable erw $$3) {
      if (!(this.a instanceof ekq $$4)) {
         return false;
      } else {
         dby $$7;
         boolean $$8;
         doz $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof dgo $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(avh.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aum.iP, aun.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(kl.V, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof dgo $$15 && this.a == ekt.c) {
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

   protected void a(@Nullable cjt $$0, cyy $$1, ib $$2) {
      aul $$3 = this.a.a(avh.b) ? aum.df : aum.dc;
      $$1.a($$0, $$2, $$3, aun.e, 1.0F, 1.0F);
      $$1.a($$0, dts.z, $$2);
   }
}
