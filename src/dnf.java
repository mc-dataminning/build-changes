public class dnf extends dor {
   private jf<csz> d = jf.a(27, csz.i);
   private final dnz e = new dnz() {
      @Override
      protected void a(dad $$0, in $$1, dqh $$2) {
         dnf.this.a($$2, avc.bz);
         dnf.this.a($$2, true);
      }

      @Override
      protected void b(dad $$0, in $$1, dqh $$2) {
         dnf.this.a($$2, avc.by);
         dnf.this.a($$2, false);
      }

      @Override
      protected void a(dad $$0, in $$1, dqh $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(clh $$0) {
         if ($$0.cc instanceof cok) {
            bpf $$1 = ((cok)$$0.cc).l();
            return $$1 == dnf.this;
         } else {
            return false;
         }
      }
   };

   public dnf(in $$0, dqh $$1) {
      super(dno.A, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpg.a($$0, this.d, $$1);
      }
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.d = jf.a(this.b(), csz.i);
      if (!this.a_($$0)) {
         bpg.b($$0, this.d, $$1);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected jf<csz> j() {
      return this.d;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.d = $$0;
   }

   @Override
   protected wu k() {
      return wu.c("container.barrel");
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return cok.a($$0, $$1, this);
   }

   @Override
   public void d_(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.e.b($$0, this.i(), this.az_(), this.n());
      }
   }

   public void l() {
      if (!this.p) {
         this.e.c(this.i(), this.az_(), this.n());
      }
   }

   void a(dqh $$0, boolean $$1) {
      this.n.a(this.az_(), $$0.a(dck.c, Boolean.valueOf($$1)), 3);
   }

   void a(dqh $$0, avb $$1) {
      jr $$2 = $$0.c(dck.b).q();
      double $$3 = (double)this.o.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.o.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.o.w() + 0.5 + (double)$$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, avd.e, 0.5F, this.n.z.i() * 0.1F + 0.9F);
   }
}
