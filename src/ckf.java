import javax.annotation.Nullable;

public class ckf extends cjj implements cjp, cmh {
   private static final akj<Boolean> b = akn.a(ckf.class, akl.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final brc bZ = new brc(5);

   public ckf(bsz<? extends ckf> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cag(this));
      this.bS.a(2, new coi.a(this, 10.0F));
      this.bS.a(3, new cbn<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbj(this, 0.6));
      this.bS.a(9, new cau(this, cmw.class, 15.0F, 1.0F));
      this.bS.a(10, new cau(this, btq.class, 15.0F));
      this.bT.a(1, new cce(this, coi.class).a());
      this.bT.a(2, new ccf<>(this, cmw.class, true));
      this.bT.a(3, new ccf<>(this, cme.class, false));
      this.bT.a(3, new ccf<>(this, cfq.class, true));
   }

   public static buv.a u() {
      return ckc.gw().a(buw.r, 0.35F).a(buw.q, 24.0).a(buw.c, 5.0).a(buw.k, 32.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvh $$0) {
      return $$0 == cur.vT;
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
   public cjj.a s() {
      if (this.gq()) {
         return cjj.a.f;
      } else if (this.b(cur.vT)) {
         return cjj.a.e;
      } else {
         return this.gi() ? cjj.a.b : cjj.a.h;
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dca $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      this.a(bta.a, new cuo(cur.vT));
   }

   @Override
   protected void a(azg $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cuo $$2 = this.eX();
         if ($$2.a(cur.vT)) {
            $$2.a(dac.K, 1);
            this.a(bta.a, $$2);
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
   protected avy d(brm $$0) {
      return avz.tV;
   }

   @Override
   public void a(bto $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brc y() {
      return this.bZ;
   }

   @Override
   protected void b(cjg $$0) {
      cuo $$1 = $$0.p();
      if ($$1.g() instanceof csj) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuo $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cuo $$0) {
      return this.gH() && $$0.a(cur.uP);
   }

   @Override
   public bug a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bug.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      coh $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cuo $$4 = new cuo(cur.vT);
         if ($$0 > $$2.a(bqq.c)) {
            $$4.a(dac.J, 2);
         } else if ($$0 > $$2.a(bqq.b)) {
            $$4.a(dac.J, 1);
         }

         $$4.a(dac.I, 1);
         this.a(bta.a, $$4);
      }
   }

   @Override
   public avy ae_() {
      return avz.tT;
   }
}
