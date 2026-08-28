public class cxj extends cxn {
   private final cwi a;
   private final crx b;
   private int g;

   public cxj(crx $$0, cwi $$1, buk $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(czy $$0) {
      return false;
   }

   @Override
   public czy a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(czy $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void c_(czy $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dV(), this.b, this.g);
      }

      if (this.c instanceof cxh $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static jo<czy> a(ded $$0) {
      jo<czy> $$1 = jo.a($$0.a(), czy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private jo<czy> a(ded $$0, djx $$1) {
      return $$1 instanceof ars $$2 ? $$2.t().a(dfa.a, $$0, $$2).map($$1x -> ((dee)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : dee.b($$0);
   }

   @Override
   public void a(crx $$0, czy $$1) {
      this.c_($$1);
      ded.a $$2 = this.a.aD_();
      ded $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jo<czy> $$6 = this.a($$3, $$0.dV());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.az_();
            czy $$10 = this.a.a($$9);
            czy $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (czy.c($$10, $$11)) {
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
