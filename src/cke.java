import javax.annotation.Nullable;

public class cke extends cji implements cjo, cmg {
   private static final akj<Boolean> b = akn.a(cke.class, akl.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final brb bZ = new brb(5);

   public cke(bsy<? extends cke> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caf(this));
      this.bS.a(2, new coh.a(this, 10.0F));
      this.bS.a(3, new cbm<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbi(this, 0.6));
      this.bS.a(9, new cat(this, cmv.class, 15.0F, 1.0F));
      this.bS.a(10, new cat(this, btp.class, 15.0F));
      this.bT.a(1, new ccd(this, coh.class).a());
      this.bT.a(2, new cce<>(this, cmv.class, true));
      this.bT.a(3, new cce<>(this, cmd.class, false));
      this.bT.a(3, new cce<>(this, cfp.class, true));
   }

   public static buu.a u() {
      return ckb.gw().a(buv.r, 0.35F).a(buv.q, 24.0).a(buv.c, 5.0).a(buv.k, 32.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvg $$0) {
      return $$0 == cuq.vT;
   }

   public boolean gq() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public cji.a s() {
      if (this.gq()) {
         return cji.a.f;
      } else if (this.b(cuq.vT)) {
         return cji.a.e;
      } else {
         return this.gi() ? cji.a.b : cji.a.h;
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      this.a(bsz.a, new cun(cuq.vT));
   }

   @Override
   protected void a(azf $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cun $$2 = this.eX();
         if ($$2.a(cuq.vT)) {
            $$2.a(dab.K, 1);
            this.a(bsz.a, $$2);
         }
      }
   }

   @Override
   protected avy v() {
      return avz.tS;
   }

   @Override
   protected avy o_() {
      return avz.tU;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.tV;
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brb y() {
      return this.bZ;
   }

   @Override
   protected void b(cjf $$0) {
      cun $$1 = $$0.p();
      if ($$1.g() instanceof csi) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cun $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cun $$0) {
      return this.gH() && $$0.a(cuq.uP);
   }

   @Override
   public buf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? buf.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cog $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cun $$4 = new cun(cuq.vT);
         if ($$0 > $$2.a(bqp.c)) {
            $$4.a(dab.J, 2);
         } else if ($$0 > $$2.a(bqp.b)) {
            $$4.a(dab.J, 1);
         }

         $$4.a(dab.I, 1);
         this.a(bsz.a, $$4);
      }
   }

   @Override
   public avy ae_() {
      return avz.tT;
   }
}
