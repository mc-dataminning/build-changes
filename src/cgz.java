import javax.annotation.Nullable;

public class cgz extends cit implements chk {
   private final eac a;

   public cgz(eac $$0, cit.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      eha $$4 = a($$0, $$1, this.a == eae.a ? cov.b.b : cov.b.a);
      if ($$4.c() == ehc.a.a) {
         return bgr.c($$3);
      } else if ($$4.c() != ehc.a.b) {
         return bgr.c($$3);
      } else {
         gu $$5 = $$4.a();
         ha $$6 = $$4.b();
         gu $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bgr.d($$3);
         } else if (this.a == eae.a) {
            dfa $$8 = $$0.a_($$5);
            if ($$8.b() instanceof css $$9) {
               ciy $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(apg.c.b(this));
                  $$9.am_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, djk.y, $$5);
                  ciy $$11 = cja.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     ai.j.a((akl)$$1, $$10);
                  }

                  return bgr.a($$11, $$0.r_());
               }
            }

            return bgr.d($$3);
         } else {
            dfa $$12 = $$0.a_($$5);
            gu $$13 = $$12.b() instanceof cxa && this.a == eae.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof akl) {
                  ai.y.a((akl)$$1, $$13, $$3);
               }

               $$1.b(apg.c.b(this));
               return bgr.a(a($$3, $$1), $$0.r_());
            } else {
               return bgr.d($$3);
            }
         }
      }
   }

   public static ciy a(ciy $$0, cbn $$1) {
      return !$$1.fR().d ? new ciy(cjb.pK) : $$0;
   }

   @Override
   public void a(@Nullable cbn $$0, cpm $$1, ciy $$2, gu $$3) {
   }

   @Override
   public boolean a(@Nullable cbn $$0, cpm $$1, gu $$2, @Nullable eha $$3) {
      if (!(this.a instanceof eab $$4)) {
         return false;
      } else {
         csm $$7;
         boolean $$8;
         dfa $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cxa $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.x_().i() && this.a.a(apq.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aow.hN, aox.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(iv.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cxa $$15 && this.a == eae.c) {
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

   protected void a(@Nullable cbn $$0, cpn $$1, gu $$2) {
      aov $$3 = this.a.a(apq.b) ? aow.cy : aow.cv;
      $$1.a($$0, $$2, $$3, aox.e, 1.0F, 1.0F);
      $$1.a($$0, djk.z, $$2);
   }
}
