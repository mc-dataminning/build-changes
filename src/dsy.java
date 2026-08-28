public class dsy extends dty implements dtw {
   private static final int d = 1;
   private jz<cwf> e = jz.a(27, cwf.k);
   private final dte f = new dte() {
      @Override
      protected void a(dff $$0, jh $$1, dvo $$2) {
         dsy.a($$0, $$1, $$2, awo.eR);
      }

      @Override
      protected void b(dff $$0, jh $$1, dvo $$2) {
         dsy.a($$0, $$1, $$2, awo.eP);
      }

      @Override
      protected void a(dff $$0, jh $$1, dvo $$2, int $$3, int $$4) {
         dsy.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cor $$0) {
         if (!($$0.cd instanceof csb)) {
            return false;
         } else {
            bsa $$1 = ((csb)$$0.cd).l();
            return $$1 == dsy.this || $$1 instanceof brz && ((brz)$$1).a(dsy.this);
         }
      }
   };
   private final dsz g = new dsz();

   protected dsy(dst<?> $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
   }

   public dsy(jh $$0, dvo $$1) {
      this(dst.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xl j() {
      return xl.c("container.chest");
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.e = jz.a(this.b(), cwf.k);
      if (!this.b_($$0)) {
         bsb.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsb.a($$0, this.e, $$1);
      }
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dsy $$3) {
      $$3.g.a();
   }

   static void a(dff $$0, jh $$1, dvo $$2, awn $$3) {
      dwg $$4 = $$2.c(djm.d);
      if ($$4 != dwg.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dwg.c) {
            jm $$8 = djm.i($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, awp.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.a($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   public void c(cor $$0) {
      if (!this.q && !$$0.R_()) {
         this.f.b($$0, this.i(), this.aB_(), this.m());
      }
   }

   @Override
   protected jz<cwf> f() {
      return this.e;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dek $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      if ($$2.x()) {
         dsr $$3 = $$0.c_($$1);
         if ($$3 instanceof dsy) {
            return ((dsy)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dsy $$0, dsy $$1) {
      jz<cwf> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return csb.a($$0, $$1, this);
   }

   public void k() {
      if (!this.q) {
         this.f.c(this.i(), this.aB_(), this.m());
      }
   }

   protected void a(dff $$0, jh $$1, dvo $$2, int $$3, int $$4) {
      dij $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
