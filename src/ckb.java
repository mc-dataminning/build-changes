import javax.annotation.Nullable;

public class ckb extends cjf implements cjl, cmd {
   private static final akg<Boolean> b = akk.a(ckb.class, aki.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final bqy bZ = new bqy(5);

   public ckb(bsv<? extends ckb> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(2, new coe.a(this, 10.0F));
      this.bS.a(3, new cbj<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbf(this, 0.6));
      this.bS.a(9, new caq(this, cms.class, 15.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 15.0F));
      this.bT.a(1, new cca(this, coe.class).a());
      this.bT.a(2, new ccb<>(this, cms.class, true));
      this.bT.a(3, new ccb<>(this, cma.class, false));
      this.bT.a(3, new ccb<>(this, cfm.class, true));
   }

   public static bur.a u() {
      return cjy.gw().a(bus.r, 0.35F).a(bus.q, 24.0).a(bus.c, 5.0).a(bus.k, 32.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvd $$0) {
      return $$0 == cun.vT;
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
   public cjf.a s() {
      if (this.gq()) {
         return cjf.a.f;
      } else if (this.b(cun.vT)) {
         return cjf.a.e;
      } else {
         return this.gi() ? cjf.a.b : cjf.a.h;
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      this.a(bsw.a, new cuk(cun.vT));
   }

   @Override
   protected void a(azc $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cuk $$2 = this.eX();
         if ($$2.a(cun.vT)) {
            $$2.a(czy.K, 1);
            this.a(bsw.a, $$2);
         }
      }
   }

   @Override
   protected avv v() {
      return avw.tS;
   }

   @Override
   protected avv o_() {
      return avw.tU;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.tV;
   }

   @Override
   public void a(btk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqy y() {
      return this.bZ;
   }

   @Override
   protected void b(cjc $$0) {
      cuk $$1 = $$0.p();
      if ($$1.g() instanceof csf) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuk $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cuk $$0) {
      return this.gH() && $$0.a(cun.uP);
   }

   @Override
   public buc a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? buc.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cod $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cuk $$4 = new cuk(cun.vT);
         if ($$0 > $$2.a(bqm.c)) {
            $$4.a(czy.J, 2);
         } else if ($$0 > $$2.a(bqm.b)) {
            $$4.a(czy.J, 1);
         }

         $$4.a(czy.I, 1);
         this.a(bsw.a, $$4);
      }
   }

   @Override
   public avv ae_() {
      return avw.tT;
   }
}
