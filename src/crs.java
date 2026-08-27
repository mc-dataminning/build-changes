import javax.annotation.Nullable;

public abstract class crs extends csk {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.r;

   protected crs(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         this.a($$1, $$2, $$3);
         return bha.b;
      }
   }

   protected abstract void a(cpx var1, gw var2, cbw var3);

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dcm) {
            ((dcm)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof dcm) {
            if ($$1 instanceof aks) {
               bgw.a($$1, $$2, (dcm)$$5);
               ((dcm)$$5).a((aks)$$1, ehp.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
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
   public czc b_(dfl $$0) {
      return czc.c;
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

   @Nullable
   protected static <T extends dcx> dcy<T> a(cpx $$0, dcz<T> $$1, dcz<? extends dcm> $$2) {
      return $$0.B ? null : a($$1, $$2, dcm::a);
   }
}
