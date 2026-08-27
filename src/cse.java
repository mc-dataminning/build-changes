import javax.annotation.Nullable;

public class cse extends csk {
   public static final dgf a = dgb.P;
   public static final dgc b = dgb.u;

   public cse(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         dcx $$6 = $$1.c_($$2);
         if ($$6 instanceof dcq) {
            $$3.a((dcq)$$6);
            $$3.a(app.ar);
            can.a($$3, true);
         }

         return bha.b;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof bgt) {
            bgw.a($$1, $$2, (bgt)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      dcx $$4 = $$1.c_($$2);
      if ($$4 instanceof dcq) {
         ((dcq)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcq($$0, $$1);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dcq) {
            ((dcq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.a($$1.c_($$2));
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
