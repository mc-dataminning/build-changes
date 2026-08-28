import javax.annotation.Nullable;

public class cke extends cji implements cjo, cmg {
   private static final ajv<Boolean> b = ajz.a(cke.class, ajx.k);
   private static final int e = 5;
   private static final int ca = 300;
   private final bqz cb = new bqz(5);

   public cke(bsw<? extends cke> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(2, new coh.a(this, 10.0F));
      this.bU.a(3, new cbl<>(this, 1.0, 8.0F));
      this.bU.a(8, new cbh(this, 0.6));
      this.bU.a(9, new cas(this, cmv.class, 15.0F, 1.0F));
      this.bU.a(10, new cas(this, btn.class, 15.0F));
      this.bV.a(1, new ccc(this, coh.class).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true));
      this.bV.a(3, new ccd<>(this, cmd.class, false));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
   }

   public static but.a t() {
      return ckb.gs().a(buu.v, 0.35F).a(buu.s, 24.0).a(buu.c, 5.0).a(buu.m, 32.0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvl $$0) {
      return $$0 == cur.vW;
   }

   public boolean gm() {
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
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dS());
   }

   @Override
   public cji.a s() {
      if (this.gm()) {
         return cji.a.f;
      } else if (this.b(cur.vW)) {
         return cji.a.e;
      } else {
         return this.gd() ? cji.a.b : cji.a.h;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dS());
      this.a_(true);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return 0.0F;
   }

   @Override
   public int af() {
      return 1;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      this.a(bsx.a, new cuo(cur.vW));
   }

   @Override
   protected void b(ddj $$0, ayv $$1, bqo $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cuo $$3 = this.eU();
         if ($$3.a(cur.vW)) {
            dac.a($$3, $$0.H_(), dbn.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avn v() {
      return avo.tV;
   }

   @Override
   protected avn n_() {
      return avo.tX;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.tY;
   }

   @Override
   public void a(btl $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqz x() {
      return this.cb;
   }

   @Override
   protected void b(cjf $$0) {
      cuo $$1 = $$0.p();
      if ($$1.g() instanceof csj) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuo $$2 = this.cb.b($$1);
         if ($$2.e()) {
            $$0.aq();
         } else {
            $$1.e($$2.H());
         }
      }
   }

   private boolean n(cuo $$0) {
      return this.gD() && $$0.a(cur.uP);
   }

   @Override
   public bue a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? bue.a(this.cb, $$1) : super.a_($$0);
   }

   @Override
   public void a(aqt $$0, int $$1, boolean $$2) {
      cog $$3 = this.gA();
      boolean $$4 = this.ah.i() <= $$3.v();
      if ($$4) {
         cuo $$5 = new cuo(cur.vW);
         akp<dbh> $$6;
         if ($$1 > $$3.a(bqn.c)) {
            $$6 = dbn.d;
         } else if ($$1 > $$3.a(bqn.b)) {
            $$6 = dbn.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dac.a($$5, $$0.H_(), $$6, $$0.d_(this.dq()), this.dT());
            this.a(bsx.a, $$5);
         }
      }
   }

   @Override
   public avn ae_() {
      return avo.tW;
   }
}
