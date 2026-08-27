public class dgn extends dhy {
   private iq<cmx> e = iq.a(27, cmx.f);
   private final dhh f = new dhh() {
      @Override
      protected void a(cto $$0, hx $$1, djg $$2) {
         dgn.this.a($$2, arr.bk);
         dgn.this.a($$2, true);
      }

      @Override
      protected void b(cto $$0, hx $$1, djg $$2) {
         dgn.this.a($$2, arr.bj);
         dgn.this.a($$2, false);
      }

      @Override
      protected void a(cto $$0, hx $$1, djg $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cfh $$0) {
         if ($$0.bS instanceof cih) {
            bjt $$1 = ((cih)$$0.bS).l();
            return $$1 == dgn.this;
         } else {
            return false;
         }
      }
   };

   public dgn(hx $$0, djg $$1) {
      super(dgw.A, $$0, $$1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         bju.a($$0, this.e);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.e = iq.a(this.b(), cmx.f);
      if (!this.c_($$0)) {
         bju.b($$0, this.e);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected iq<cmx> k() {
      return this.e;
   }

   @Override
   protected void a(iq<cmx> $$0) {
      this.e = $$0;
   }

   @Override
   protected vf l() {
      return vf.c("container.barrel");
   }

   @Override
   protected cia a(int $$0, cfg $$1) {
      return cih.a($$0, $$1, this);
   }

   @Override
   public void d_(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.a($$0, this.i(), this.aB_(), this.r());
      }
   }

   @Override
   public void c(cfh $$0) {
      if (!this.q && !$$0.P_()) {
         this.f.b($$0, this.i(), this.aB_(), this.r());
      }
   }

   public void m() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.r());
      }
   }

   void a(djg $$0, boolean $$1) {
      this.o.a(this.aB_(), $$0.a(cvv.c, Boolean.valueOf($$1)), 3);
   }

   void a(djg $$0, arq $$1) {
      jb $$2 = $$0.c(cvv.b).q();
      double $$3 = (double)this.p.u() + 0.5 + (double)$$2.u() / 2.0;
      double $$4 = (double)this.p.v() + 0.5 + (double)$$2.v() / 2.0;
      double $$5 = (double)this.p.w() + 0.5 + (double)$$2.w() / 2.0;
      this.o.a(null, $$3, $$4, $$5, $$1, ars.e, 0.5F, this.o.z.i() * 0.1F + 0.9F);
   }
}
