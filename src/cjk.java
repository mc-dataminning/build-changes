import javax.annotation.Nullable;

public class cjk extends cle implements cjv {
   private final ecr a;

   public cjk(ecr $$0, cle.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      ejq $$4 = a($$0, $$1, this.a == ect.a ? crj.b.b : crj.b.a);
      if ($$4.c() == ejs.a.a) {
         return biy.c($$3);
      } else if ($$4.c() != ejs.a.b) {
         return biy.c($$3);
      } else {
         ht $$5 = $$4.a();
         hx $$6 = $$4.b();
         ht $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return biy.d($$3);
         } else if (this.a == ect.a) {
            dhi $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cvh $$9) {
               clj $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(arb.c.b(this));
                  $$9.at_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, dls.y, $$5);
                  clj $$11 = cll.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((amf)$$1, $$10);
                  }

                  return biy.a($$11, $$0.x_());
               }
            }

            return biy.d($$3);
         } else {
            dhi $$12 = $$0.a_($$5);
            ht $$13 = $$12.b() instanceof czq && this.a == ect.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof amf) {
                  al.y.a((amf)$$1, $$13, $$3);
               }

               $$1.b(arb.c.b(this));
               return biy.a(a($$3, $$1), $$0.x_());
            } else {
               return biy.d($$3);
            }
         }
      }
   }

   public static clj a(clj $$0, cdu $$1) {
      return !$$1.fU().d ? new clj(clm.qv) : $$0;
   }

   @Override
   public void a(@Nullable cdu $$0, csa $$1, clj $$2, ht $$3) {
   }

   @Override
   public boolean a(@Nullable cdu $$0, csa $$1, ht $$2, @Nullable ejq $$3) {
      if (!(this.a instanceof ecq $$4)) {
         return false;
      } else {
         cva $$7;
         boolean $$8;
         dhi $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof czq $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.D_().i() && this.a.a(arl.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, aqr.ih, aqs.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(js.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof czq $$15 && this.a == ect.c) {
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

   protected void a(@Nullable cdu $$0, csb $$1, ht $$2) {
      aqq $$3 = this.a.a(arl.b) ? aqr.cy : aqr.cv;
      $$1.a($$0, $$2, $$3, aqs.e, 1.0F, 1.0F);
      $$1.a($$0, dls.z, $$2);
   }
}
