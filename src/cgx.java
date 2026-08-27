import javax.annotation.Nullable;

public class cgx extends cir implements chi {
   private final eaa a;

   public cgx(eaa $$0, cir.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      ehb $$4 = a($$0, $$1, this.a == eac.a ? cot.b.b : cot.b.a);
      if ($$4.c() == ehd.a.a) {
         return bgp.c($$3);
      } else if ($$4.c() != ehd.a.b) {
         return bgp.c($$3);
      } else {
         gv $$5 = $$4.a();
         hb $$6 = $$4.b();
         gv $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bgp.d($$3);
         } else if (this.a == eac.a) {
            dey $$8 = $$0.a_($$5);
            if ($$8.b() instanceof csq $$9) {
               ciw $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(ape.c.b(this));
                  $$9.am_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dji.y, $$5);
                  ciw $$11 = ciy.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     ai.j.a((akj)$$1, $$10);
                  }

                  return bgp.a($$11, $$0.r_());
               }
            }

            return bgp.d($$3);
         } else {
            dey $$12 = $$0.a_($$5);
            gv $$13 = $$12.b() instanceof cwy && this.a == eac.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof akj) {
                  ai.y.a((akj)$$1, $$13, $$3);
               }

               $$1.b(ape.c.b(this));
               return bgp.a(a($$3, $$1), $$0.r_());
            } else {
               return bgp.d($$3);
            }
         }
      }
   }

   public static ciw a(ciw $$0, cbl $$1) {
      return !$$1.fR().d ? new ciw(ciz.pK) : $$0;
   }

   @Override
   public void a(@Nullable cbl $$0, cpk $$1, ciw $$2, gv $$3) {
   }

   @Override
   public boolean a(@Nullable cbl $$0, cpk $$1, gv $$2, @Nullable ehb $$3) {
      if (!(this.a instanceof dzz $$4)) {
         return false;
      } else {
         csk $$7;
         boolean $$8;
         dey $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cwy $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.x_().i() && this.a.a(apo.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aou.hN, aov.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(iw.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cwy $$15 && this.a == eac.c) {
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

   protected void a(@Nullable cbl $$0, cpl $$1, gv $$2) {
      aot $$3 = this.a.a(apo.b) ? aou.cy : aou.cv;
      $$1.a($$0, $$2, $$3, aov.e, 1.0F, 1.0F);
      $$1.a($$0, dji.z, $$2);
   }
}
