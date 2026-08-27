public class dqj extends drm implements drh {
   private static final int d = 1;
   private jj<cuh> e = jj.a(27, cuh.i);
   private final dqp f = new dqp() {
      @Override
      protected void a(dca $$0, ir $$1, dtc $$2) {
         dqj.a($$0, $$1, $$2, avo.eV);
      }

      @Override
      protected void b(dca $$0, ir $$1, dtc $$2) {
         dqj.a($$0, $$1, $$2, avo.eT);
      }

      @Override
      protected void a(dca $$0, ir $$1, dtc $$2, int $$3, int $$4) {
         dqj.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cly $$0) {
         if (!($$0.cq instanceof cpn)) {
            return false;
         } else {
            bpt $$1 = ((cpn)$$0.cq).l();
            return $$1 == dqj.this || $$1 instanceof bps && ((bps)$$1).a(dqj.this);
         }
      }
   };
   private final dqk g = new dqk();

   protected dqj(dqe<?> $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   public dqj(ir $$0, dtc $$1) {
      this(dqe.c, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xe k() {
      return xe.c("container.chest");
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.e = jj.a(this.b(), cuh.i);
      if (!this.a_($$0)) {
         bpu.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpu.a($$0, this.e, $$1);
      }
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqj $$3) {
      $$3.g.a();
   }

   static void a(dca $$0, ir $$1, dtc $$2, avn $$3) {
      dtu $$4 = $$2.c(dgf.d);
      if ($$4 != dtu.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dtu.c) {
            iw $$8 = dgf.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avq.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   @Override
   public void d_(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cly $$0) {
      if (!this.p && !$$0.O_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected jj<cuh> j() {
      return this.e;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbg $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dqc $$3 = $$0.c_($$1);
         if ($$3 instanceof dqj) {
            return ((dqj)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dqj $$0, dqj $$1) {
      jj<cuh> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return cpn.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dca $$0, ir $$1, dtc $$2, int $$3, int $$4) {
      dfc $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
