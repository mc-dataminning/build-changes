import javax.annotation.Nullable;

public class chi extends cjc implements cht {
   private final ean a;

   public chi(ean $$0, cjc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      ehl $$4 = a($$0, $$1, this.a == eap.a ? cpg.b.b : cpg.b.a);
      if ($$4.c() == ehn.a.a) {
         return bhb.c($$3);
      } else if ($$4.c() != ehn.a.b) {
         return bhb.c($$3);
      } else {
         gw $$5 = $$4.a();
         hc $$6 = $$4.b();
         gw $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bhb.d($$3);
         } else if (this.a == eap.a) {
            dfl $$8 = $$0.a_($$5);
            if ($$8.b() instanceof ctd $$9) {
               cjh $$10 = $$9.a($$1, $$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(app.c.b(this));
                  $$9.aq_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, djv.y, $$5);
                  cjh $$11 = cjj.a($$3, $$1, $$10);
                  if (!$$0.B) {
                     al.j.a((akt)$$1, $$10);
                  }

                  return bhb.a($$11, $$0.w_());
               }
            }

            return bhb.d($$3);
         } else {
            dfl $$12 = $$0.a_($$5);
            gw $$13 = $$12.b() instanceof cxl && this.a == eap.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof akt) {
                  al.y.a((akt)$$1, $$13, $$3);
               }

               $$1.b(app.c.b(this));
               return bhb.a(a($$3, $$1), $$0.w_());
            } else {
               return bhb.d($$3);
            }
         }
      }
   }

   public static cjh a(cjh $$0, cbw $$1) {
      return !$$1.fS().d ? new cjh(cjk.pK) : $$0;
   }

   @Override
   public void a(@Nullable cbw $$0, cpx $$1, cjh $$2, gw $$3) {
   }

   @Override
   public boolean a(@Nullable cbw $$0, cpx $$1, gw $$2, @Nullable ehl $$3) {
      if (!(this.a instanceof eam $$4)) {
         return false;
      } else {
         csx $$7;
         boolean $$8;
         dfl $$6;
         boolean var10000;
         label82: {
            $$6 = $$1.a_($$2);
            $$7 = $$6.b();
            $$8 = $$6.a(this.a);
            label70:
            if (!$$6.i() && !$$8) {
               if ($$7 instanceof cxl $$9 && $$9.a($$0, $$1, $$2, $$6, this.a)) {
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
         } else if ($$1.C_().i() && this.a.a(apz.a)) {
            int $$11 = $$2.u();
            int $$12 = $$2.v();
            int $$13 = $$2.w();
            $$1.a($$0, $$2, apf.hN, apg.e, 0.5F, 2.6F + ($$1.z.i() - $$1.z.i()) * 0.8F);

            for (int $$14 = 0; $$14 < 8; $$14++) {
               $$1.a(ix.S, (double)$$11 + Math.random(), (double)$$12 + Math.random(), (double)$$13 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else {
            if ($$7 instanceof cxl $$15 && this.a == eap.c) {
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

   protected void a(@Nullable cbw $$0, cpy $$1, gw $$2) {
      ape $$3 = this.a.a(apz.b) ? apf.cy : apf.cv;
      $$1.a($$0, $$2, $$3, apg.e, 1.0F, 1.0F);
      $$1.a($$0, djv.z, $$2);
   }
}
