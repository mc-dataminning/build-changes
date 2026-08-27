public class ddq extends dfa {
   private il<ckj> c = il.a(27, ckj.b);
   private final dek f = new dek() {
      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2) {
         ddq.this.a($$2, aqd.bk);
         ddq.this.a($$2, true);
      }

      @Override
      protected void b(cqz $$0, ht $$1, dgb $$2) {
         ddq.this.a($$2, aqd.bj);
         ddq.this.a($$2, false);
      }

      @Override
      protected void a(cqz $$0, ht $$1, dgb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(ccx $$0) {
         if ($$0.bS instanceof cfw) {
            bhu $$1 = ((cfw)$$0.bS).l();
            return $$1 == ddq.this;
         } else {
            return false;
         }
      }
   };

   public ddq(ht $$0, dgb $$1) {
      super(ddz.A, $$0, $$1);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bhv.a($$0, this.c);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c = il.a(this.b(), ckj.b);
      if (!this.d($$0)) {
         bhv.b($$0, this.c);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected il<ckj> f() {
      return this.c;
   }

   @Override
   protected void a(il<ckj> $$0) {
      this.c = $$0;
   }

   @Override
   protected ui g() {
      return ui.c("container.barrel");
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return cfw.a($$0, $$1, this);
   }

   @Override
   public void d_(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }
   }

   @Override
   public void c(ccx $$0) {
      if (!this.q && !$$0.N_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }
   }

   public void i() {
      if (!this.q) {
         this.f.c(this.k(), this.p(), this.q());
      }
   }

   void a(dgb $$0, boolean $$1) {
      this.o.a(this.p(), $$0.a(ctg.c, Boolean.valueOf($$1)), 3);
   }

   void a(dgb $$0, aqc $$1) {
      iw $$2 = $$0.c(ctg.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, aqe.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
