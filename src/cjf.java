import javax.annotation.Nullable;

public class cjf extends cij implements cip, clh {
   private static final ajr<Boolean> b = ajv.a(cjf.class, ajt.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final bqd bZ = new bqd(5);

   public cjf(bsa<? extends cjf> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(2, new cni.a(this, 10.0F));
      this.bS.a(3, new can<>(this, 1.0, 8.0F));
      this.bS.a(8, new caj(this, 0.6));
      this.bS.a(9, new bzu(this, clw.class, 15.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 15.0F));
      this.bT.a(1, new cbe(this, cni.class).a());
      this.bT.a(2, new cbf<>(this, clw.class, true));
      this.bT.a(3, new cbf<>(this, cle.class, false));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
   }

   public static btv.a u() {
      return cjc.gv().a(btw.r, 0.35F).a(btw.q, 24.0).a(btw.c, 5.0).a(btw.k, 32.0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cuh $$0) {
      return $$0 == ctr.vT;
   }

   public boolean gp() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public cij.a s() {
      if (this.gp()) {
         return cij.a.f;
      } else if (this.b(ctr.vT)) {
         return cij.a.e;
      } else {
         return this.gh() ? cij.a.b : cij.a.h;
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(io $$0, dba $$1) {
      return 0.0F;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      this.a(bsb.a, new cto(ctr.vT));
   }

   @Override
   protected void a(ayk $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cto $$2 = this.eX();
         if ($$2.a(ctr.vT)) {
            $$2.a(czc.K, 1);
            this.a(bsb.a, $$2);
         }
      }
   }

   @Override
   protected avg v() {
      return avh.tS;
   }

   @Override
   protected avg o_() {
      return avh.tU;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.tV;
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqd y() {
      return this.bZ;
   }

   @Override
   protected void b(cig $$0) {
      cto $$1 = $$0.p();
      if ($$1.g() instanceof crj) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cto $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cto $$0) {
      return this.gG() && $$0.a(ctr.uP);
   }

   @Override
   public btg a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? btg.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cnh $$2 = this.gD();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cto $$4 = new cto(ctr.vT);
         if ($$0 > $$2.a(bpr.c)) {
            $$4.a(czc.J, 2);
         } else if ($$0 > $$2.a(bpr.b)) {
            $$4.a(czc.J, 1);
         }

         $$4.a(czc.I, 1);
         this.a(bsb.a, $$4);
      }
   }

   @Override
   public avg ae_() {
      return avh.tT;
   }
}
