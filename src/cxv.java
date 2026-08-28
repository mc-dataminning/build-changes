public class cxv extends cxz {
   private final cwt a;
   private final csi b;
   private int g;

   public cxv(csi $$0, cwt $$1, buv $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(dak $$0) {
      return false;
   }

   @Override
   public dak a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(dak $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void c_(dak $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dV(), this.b, this.g);
      }

      if (this.c instanceof cxs $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static jp<dak> a(dep $$0) {
      jp<dak> $$1 = jp.a($$0.a(), dak.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private jp<dak> a(dep $$0, dkj $$1) {
      return $$1 instanceof asb $$2 ? $$2.t().a(dfm.a, $$0, $$2).map($$1x -> ((deq)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : deq.b($$0);
   }

   @Override
   public void a(csi $$0, dak $$1) {
      this.c_($$1);
      dep.a $$2 = this.a.aE_();
      dep $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jp<dak> $$6 = this.a($$3, $$0.dV());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.aA_();
            dak $$10 = this.a.a($$9);
            dak $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (dak.c($$10, $$11)) {
                  $$11.g($$10.M());
                  this.a.a($$9, $$11);
               } else if (!this.b.gj().g($$11)) {
                  this.b.a($$11, false);
               }
            }
         }
      }
   }

   @Override
   public boolean f() {
      return true;
   }
}
