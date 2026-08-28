public class dpu extends dqs implements dqq {
   private static final int d = 1;
   private js<cua> e = js.a(27, cua.l);
   private final dqa f = new dqa() {
      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2) {
         dpu.a($$0, $$1, $$2, avf.eQ);
      }

      @Override
      protected void b(dcd $$0, ja $$1, dsh $$2) {
         dpu.a($$0, $$1, $$2, avf.eO);
      }

      @Override
      protected void a(dcd $$0, ja $$1, dsh $$2, int $$3, int $$4) {
         dpu.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmh $$0) {
         if (!($$0.cd instanceof cpm)) {
            return false;
         } else {
            bpw $$1 = ((cpm)$$0.cd).l();
            return $$1 == dpu.this || $$1 instanceof bpv && ((bpv)$$1).a(dpu.this);
         }
      }
   };
   private final dpv g = new dpv();

   protected dpu(dpp<?> $$0, ja $$1, dsh $$2) {
      super($$0, $$1, $$2);
   }

   public dpu(ja $$0, dsh $$1) {
      this(dpp.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wu k() {
      return wu.c("container.chest");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e = js.a(this.b(), cua.l);
      if (!this.a_($$0)) {
         bpx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpx.a($$0, this.e, $$1);
      }
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dpu $$3) {
      $$3.g.a();
   }

   static void a(dcd $$0, ja $$1, dsh $$2, ave $$3) {
      dsz $$4 = $$2.c(dgi.d);
      if ($$4 != dsz.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dsz.c) {
            jf $$8 = dgi.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avg.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmh $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected js<cua> j() {
      return this.e;
   }

   @Override
   protected void a(js<cua> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbj $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpn $$3 = $$0.c_($$1);
         if ($$3 instanceof dpu) {
            return ((dpu)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpu $$0, dpu $$1) {
      js<cua> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpe a(int $$0, cmg $$1) {
      return cpm.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dcd $$0, ja $$1, dsh $$2, int $$3, int $$4) {
      dff $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
