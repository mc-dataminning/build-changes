import javax.annotation.Nullable;

public class ckg extends cjk implements cjq, cmi {
   private static final akk<Boolean> b = ako.a(ckg.class, akm.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final brd bZ = new brd(5);

   public ckg(bta<? extends ckg> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cah(this));
      this.bS.a(2, new coj.a(this, 10.0F));
      this.bS.a(3, new cbo<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbk(this, 0.6));
      this.bS.a(9, new cav(this, cmx.class, 15.0F, 1.0F));
      this.bS.a(10, new cav(this, btr.class, 15.0F));
      this.bT.a(1, new ccf(this, coj.class).a());
      this.bT.a(2, new ccg<>(this, cmx.class, true));
      this.bT.a(3, new ccg<>(this, cmf.class, false));
      this.bT.a(3, new ccg<>(this, cfr.class, true));
   }

   public static buw.a u() {
      return ckd.gw().a(bux.r, 0.35F).a(bux.q, 24.0).a(bux.c, 5.0).a(bux.k, 32.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cus.vT;
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
   public void b(us $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public cjk.a s() {
      if (this.gq()) {
         return cjk.a.f;
      } else if (this.b(cus.vT)) {
         return cjk.a.e;
      } else {
         return this.gi() ? cjk.a.b : cjk.a.h;
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dcb $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      this.a(btb.a, new cup(cus.vT));
   }

   @Override
   protected void a(azh $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cup $$2 = this.eX();
         if ($$2.a(cus.vT)) {
            $$2.a(dad.K, 1);
            this.a(btb.a, $$2);
         }
      }
   }

   @Override
   protected avz v() {
      return awa.tS;
   }

   @Override
   protected avz o_() {
      return awa.tU;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.tV;
   }

   @Override
   public void a(btp $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brd y() {
      return this.bZ;
   }

   @Override
   protected void b(cjh $$0) {
      cup $$1 = $$0.p();
      if ($$1.g() instanceof csk) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cup $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cup $$0) {
      return this.gH() && $$0.a(cus.uP);
   }

   @Override
   public buh a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? buh.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      coi $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cup $$4 = new cup(cus.vT);
         if ($$0 > $$2.a(bqr.c)) {
            $$4.a(dad.J, 2);
         } else if ($$0 > $$2.a(bqr.b)) {
            $$4.a(dad.J, 1);
         }

         $$4.a(dad.I, 1);
         this.a(btb.a, $$4);
      }
   }

   @Override
   public avz ae_() {
      return awa.tT;
   }
}
