import javax.annotation.Nullable;

public class dbh extends csx {
   public static final dgc a = dgb.B;

   public dbh(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.w_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpx $$0, gw $$1, cpp $$2) {
      if (!$$0.B) {
         byq $$3 = new byq($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cpx $$0, gw $$1) {
      a($$0, $$1, null);
   }

   private static void a(cpx $$0, gw $$1, @Nullable bji $$2) {
      if (!$$0.B) {
         byq $$3 = new byq($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dq(), $$3.ds(), $$3.dw(), apf.xL, apg.e, 1.0F, 1.0F);
         $$0.a($$2, djv.I, $$1);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      if (!$$6.a(cjk.nE) && !$$6.a(cjk.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, csy.a.n(), 11);
         cjc $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cjk.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(app.c.b($$7));
         return bha.a($$1.B);
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      if (!$$0.B) {
         gw $$4 = $$2.a();
         bis $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bji ? (bji)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cpp $$0) {
      return false;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }
}
