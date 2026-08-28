import javax.annotation.Nullable;

public class cki extends cjm implements cjs, cmk {
   private static final akk<Boolean> b = ako.a(cki.class, akm.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final brf bZ = new brf(5);

   public cki(btc<? extends cki> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(2, new col.a(this, 10.0F));
      this.bS.a(3, new cbq<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbm(this, 0.6));
      this.bS.a(9, new cax(this, cmz.class, 15.0F, 1.0F));
      this.bS.a(10, new cax(this, btt.class, 15.0F));
      this.bT.a(1, new cch(this, col.class).a());
      this.bT.a(2, new cci<>(this, cmz.class, true));
      this.bT.a(3, new cci<>(this, cmh.class, false));
      this.bT.a(3, new cci<>(this, cft.class, true));
   }

   public static buy.a u() {
      return ckf.gw().a(buz.r, 0.35F).a(buz.q, 24.0).a(buz.c, 5.0).a(buz.k, 32.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvk $$0) {
      return $$0 == cuu.vT;
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
   public cjm.a s() {
      if (this.gq()) {
         return cjm.a.f;
      } else if (this.b(cuu.vT)) {
         return cjm.a.e;
      } else {
         return this.gi() ? cjm.a.b : cjm.a.h;
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      this.a(btd.a, new cur(cuu.vT));
   }

   @Override
   protected void a(azh $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cur $$2 = this.eX();
         if ($$2.a(cuu.vT)) {
            $$2.a(daf.K, 1);
            this.a(btd.a, $$2);
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
   protected avz d(brp $$0) {
      return awa.tV;
   }

   @Override
   public void a(btr $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public brf y() {
      return this.bZ;
   }

   @Override
   protected void b(cjj $$0) {
      cur $$1 = $$0.p();
      if ($$1.g() instanceof csm) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cur $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cur $$0) {
      return this.gH() && $$0.a(cuu.uP);
   }

   @Override
   public buj a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? buj.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cok $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cur $$4 = new cur(cuu.vT);
         if ($$0 > $$2.a(bqt.c)) {
            $$4.a(daf.J, 2);
         } else if ($$0 > $$2.a(bqt.b)) {
            $$4.a(daf.J, 1);
         }

         $$4.a(daf.I, 1);
         this.a(btd.a, $$4);
      }
   }

   @Override
   public avz ae_() {
      return awa.tT;
   }
}
