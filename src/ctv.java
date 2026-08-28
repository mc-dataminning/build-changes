public class ctv extends ctz {
   private final csu a;
   private final cox b;
   private int g;

   public ctv(cox $$0, csu $$1, bsd $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(cwp $$0) {
      return false;
   }

   @Override
   public cwp a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cwp $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void b_(cwp $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dV(), this.b, this.g);
      }

      if (this.c instanceof ctt $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static ka<cwp> a(das $$0) {
      ka<cwp> $$1 = ka.a($$0.a(), cwp.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private ka<cwp> a(das $$0, dgi $$1) {
      return $$1 instanceof ard $$2 ? $$2.t().a(dbp.a, $$0, $$2).map($$1x -> ((dat)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : dat.b($$0);
   }

   @Override
   public void a(cox $$0, cwp $$1) {
      this.b_($$1);
      das.a $$2 = this.a.aC_();
      das $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      ka<cwp> $$6 = this.a($$3, $$0.dV());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.ay_();
            cwp $$10 = this.a.a($$9);
            cwp $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (cwp.c($$10, $$11)) {
                  $$11.g($$10.M());
                  this.a.a($$9, $$11);
               } else if (!this.b.gi().f($$11)) {
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
