public class ffb extends fef implements ffd<cje> {
   private final cje q;
   private final cim r = new cim() {
      @Override
      public void a(cia $$0, int $$1, cmx $$2) {
         ffb.this.K();
      }

      @Override
      public void a(cia $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ffb.this.L();
         }
      }
   };

   public ffb(cje $$0, cfg $$1, vf $$2) {
      this.q = $$0;
   }

   public cje J() {
      return this.q;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.q.a(this.r);
   }

   @Override
   public void aE_() {
      this.f.s.r();
      super.aE_();
   }

   @Override
   public void j() {
      super.j();
      this.q.b(this.r);
   }

   @Override
   protected void n() {
      if (this.f.s.ge()) {
         this.d(exe.a(ve.d, $$0 -> this.aE_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(exe.a(vf.c("lectern.take_book"), $$0 -> this.g(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.n();
      }
   }

   @Override
   protected void E() {
      this.g(1);
   }

   @Override
   protected void H() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.q.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.f.q.a(this.q.j, $$0);
   }

   @Override
   public boolean k() {
      return false;
   }

   void K() {
      cmx $$0 = this.q.l();
      this.a(fef.a.a($$0));
   }

   void L() {
      this.a(this.q.m());
   }

   @Override
   protected void I() {
      this.f.s.r();
   }
}
