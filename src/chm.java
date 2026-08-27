import javax.annotation.Nullable;

public class chm extends cjg implements chx {
   private final eaf a;

   public chm(eaf $$0, cjg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      ehd $$4 = a($$0, $$1, this.a == eah.a ? cpk.b.b : cpk.b.a);
      if ($$4.c() == ehf.a.a) {
         return bhf.c($$3);
      } else if ($$4.c() != ehf.a.b) {
         return bhf.c($$3);
      } else {
         gw $$5 = $$4.a();
         ha $$6 = $$4.b();
         gw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bhf.d($$3);
         } else if (this.a == eah.a) {
            dfd $$8 = $$0.a_($$5);
            if ($$8.b() instanceof ctj $$9) {
               cjl $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(apq.c.b(this));
                  $$9.aq_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, djn.y, $$5);
                  cjl $$11 = cjn.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((aku)$$1, $$10);
                  }

                  return bhf.a($$11, $$0.w_());
               }
            }

            return bhf.d($$3);
         } else {
            dfd $$12 = $$0.a_($$5);
            gw $$13 = $$12.b() instanceof cxr && this.a == eah.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof aku) {
                  al.y.a((aku)$$1, $$13, $$3);
               }

               $$1.b(apq.c.b(this));
               return bhf.a(a($$3, $$1), $$0.w_());
            } else {
               return bhf.d($$3);
            }
         }
      }
   }

   public static cjl a(cjl $$0, cca $$1) {
      return !$$1.fT().d ? new cjl(cjo.pK) : $$0;
   }

   @Override
   public void a(@Nullable cca $$0, cqb $$1, cjl $$2, gw $$3) {
   }

   @Override
   public boolean a(@Nullable cca $$0, cqb $$1, gw $$2, @Nullable ehd $$3) {
      if (!(this.a instanceof eae $$4)) {
         return false;
      } else {
         ctc $$7;
         boolean $$8;
         dfd $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cxr $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.C_().i() && this.a.a(aqa.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, apg.hN, aph.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(iv.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cxr $$15 && this.a == eah.c) {
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

   protected void a(@Nullable cca $$0, cqc $$1, gw $$2) {
      apf $$3 = this.a.a(aqa.b) ? apg.cy : apg.cv;
      $$1.a($$0, $$2, $$3, aph.e, 1.0F, 1.0F);
      $$1.a($$0, djn.z, $$2);
   }
}
