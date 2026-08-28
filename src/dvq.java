public class dvq extends dwe {
   public static final int d = 9;
   private jz<cxo> e = jz.a(9, cxo.k);

   protected dvq(duy<?> $$0, jh $$1, dxu $$2) {
      super($$0, $$1, $$2);
   }

   public dvq(jh $$0, dxu $$1) {
      this(duy.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(bam $$0) {
      this.d_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public cxo b(cxo $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cxo $$3 = this.e.get($$2);
         if ($$3.f() || cxo.c($$0, $$3)) {
            int $$4 = Math.min($$0.L(), $$1 - $$3.L());
            if ($$4 > 0) {
               if ($$3.f()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.f()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected xv j() {
      return xv.c("container.dispenser");
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cxo.k);
      if (!this.b_($$0)) {
         btc.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btc.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jz<cxo> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxo> $$0) {
      this.e = $$0;
   }

   @Override
   protected ctb a(int $$0, cpv $$1) {
      return new ctw($$0, $$1, this);
   }
}
