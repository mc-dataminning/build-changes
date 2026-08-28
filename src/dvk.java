public class dvk extends dvy {
   public static final int d = 9;
   private jz<cxg> e = jz.a(9, cxg.j);

   protected dvk(dus<?> $$0, jh $$1, dxo $$2) {
      super($$0, $$1, $$2);
   }

   public dvk(jh $$0, dxo $$1) {
      this(dus.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(bac $$0) {
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

   public cxg b(cxg $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cxg $$3 = this.e.get($$2);
         if ($$3.f() || cxg.c($$0, $$3)) {
            int $$4 = Math.min($$0.M(), $$1 - $$3.M());
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
   protected xk j() {
      return xk.c("container.dispenser");
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cxg.j);
      if (!this.b_($$0)) {
         bsu.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsu.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jz<cxg> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cxg> $$0) {
      this.e = $$0;
   }

   @Override
   protected cst a(int $$0, cpn $$1) {
      return new cto($$0, $$1, this);
   }
}
