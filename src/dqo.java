public class dqo extends drn implements drl {
   private static final int d = 1;
   private jv<cuq> e = jv.a(27, cuq.l);
   private final dqu f = new dqu() {
      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2) {
         dqo.a($$0, $$1, $$2, avp.eQ);
      }

      @Override
      protected void b(dcw $$0, jd $$1, dtc $$2) {
         dqo.a($$0, $$1, $$2, avp.eO);
      }

      @Override
      protected void a(dcw $$0, jd $$1, dtc $$2, int $$3, int $$4) {
         dqo.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmx $$0) {
         if (!($$0.cd instanceof cqc)) {
            return false;
         } else {
            bqk $$1 = ((cqc)$$0.cd).l();
            return $$1 == dqo.this || $$1 instanceof bqj && ((bqj)$$1).a(dqo.this);
         }
      }
   };
   private final dqp g = new dqp();

   protected dqo(dqj<?> $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   public dqo(jd $$0, dtc $$1) {
      this(dqj.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wz k() {
      return wz.c("container.chest");
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.e = jv.a(this.b(), cuq.l);
      if (!this.b_($$0)) {
         bql.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bql.a($$0, this.e, $$1);
      }
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dqo $$3) {
      $$3.g.a();
   }

   static void a(dcw $$0, jd $$1, dtc $$2, avo $$3) {
      dtu $$4 = $$2.c(dhb.d);
      if ($$4 != dtu.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dtu.c) {
            ji $$8 = dhb.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avq.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.f.a($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   public void c(cmx $$0) {
      if (!this.p && !$$0.R_()) {
         this.f.b($$0, this.i(), this.aD_(), this.n());
      }
   }

   @Override
   protected jv<cuq> j() {
      return this.e;
   }

   @Override
   protected void a(jv<cuq> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dcc $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dqh $$3 = $$0.c_($$1);
         if ($$3 instanceof dqo) {
            return ((dqo)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dqo $$0, dqo $$1) {
      jv<cuq> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cpu a(int $$0, cmw $$1) {
      return cqc.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.aD_(), this.n());
      }
   }

   protected void a(dcw $$0, jd $$1, dtc $$2, int $$3, int $$4) {
      dfy $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
