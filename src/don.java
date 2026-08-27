public class don extends dpl implements dpj {
   private static final int d = 1;
   private jg<cto> e = jg.a(27, cto.i);
   private final dot f = new dot() {
      @Override
      protected void a(dax $$0, io $$1, drb $$2) {
         don.a($$0, $$1, $$2, avh.eQ);
      }

      @Override
      protected void b(dax $$0, io $$1, drb $$2) {
         don.a($$0, $$1, $$2, avh.eO);
      }

      @Override
      protected void a(dax $$0, io $$1, drb $$2, int $$3, int $$4) {
         don.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(clw $$0) {
         if (!($$0.cc instanceof cpa)) {
            return false;
         } else {
            bpn $$1 = ((cpa)$$0.cc).l();
            return $$1 == don.this || $$1 instanceof bpm && ((bpm)$$1).a(don.this);
         }
      }
   };
   private final doo g = new doo();

   protected don(doi<?> $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
   }

   public don(io $$0, drb $$1) {
      this(doi.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wx k() {
      return wx.c("container.chest");
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.e = jg.a(this.b(), cto.i);
      if (!this.a_($$0)) {
         bpo.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpo.a($$0, this.e, $$1);
      }
   }

   public static void a(dax $$0, io $$1, drb $$2, don $$3) {
      $$3.g.a();
   }

   static void a(dax $$0, io $$1, drb $$2, avg $$3) {
      drt $$4 = $$2.c(dfb.d);
      if ($$4 != drt.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == drt.c) {
            it $$8 = dfb.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(clw $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected jg<cto> j() {
      return this.e;
   }

   @Override
   protected void a(jg<cto> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dad $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dog $$3 = $$0.c_($$1);
         if ($$3 instanceof don) {
            return ((don)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(don $$0, don $$1) {
      jg<cto> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cot a(int $$0, clv $$1) {
      return cpa.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dax $$0, io $$1, drb $$2, int $$3, int $$4) {
      ddy $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
