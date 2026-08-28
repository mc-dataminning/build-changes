public class cwy extends cxc {
   private final cvx a;
   private final crm b;
   private int g;

   public cwy(crm $$0, cvx $$1, btz $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.a = $$1;
   }

   @Override
   public boolean a(czn $$0) {
      return false;
   }

   @Override
   public czn a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().M());
      }

      return super.a($$0);
   }

   @Override
   protected void a(czn $$0, int $$1) {
      this.g += $$1;
      this.c_($$0);
   }

   @Override
   protected void b(int $$0) {
      this.g += $$0;
   }

   @Override
   protected void c_(czn $$0) {
      if (this.g > 0) {
         $$0.a(this.b.dU(), this.b, this.g);
      }

      if (this.c instanceof cww $$1) {
         $$1.a(this.b, this.a.h());
      }

      this.g = 0;
   }

   private static jo<czn> a(dds $$0) {
      jo<czn> $$1 = jo.a($$0.a(), czn.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.set($$2, $$0.a($$2));
      }

      return $$1;
   }

   private jo<czn> a(dds $$0, djm $$1) {
      return $$1 instanceof arq $$2 ? $$2.t().a(dep.a, $$0, $$2).map($$1x -> ((ddt)$$1x.b()).a($$0)).orElseGet(() -> a($$0)) : ddt.b($$0);
   }

   @Override
   public void a(crm $$0, czn $$1) {
      this.c_($$1);
      dds.a $$2 = this.a.az_();
      dds $$3 = $$2.a();
      int $$4 = $$2.b();
      int $$5 = $$2.c();
      jo<czn> $$6 = this.a($$3, $$0.dU());

      for (int $$7 = 0; $$7 < $$3.g(); $$7++) {
         for (int $$8 = 0; $$8 < $$3.f(); $$8++) {
            int $$9 = $$8 + $$4 + ($$7 + $$5) * this.a.av_();
            czn $$10 = this.a.a($$9);
            czn $$11 = $$6.get($$8 + $$7 * $$3.f());
            if (!$$10.f()) {
               this.a.a($$9, 1);
               $$10 = this.a.a($$9);
            }

            if (!$$11.f()) {
               if ($$10.f()) {
                  this.a.a($$9, $$11);
               } else if (czn.c($$10, $$11)) {
                  $$11.g($$10.M());
                  this.a.a($$9, $$11);
               } else if (!this.b.gi().g($$11)) {
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
