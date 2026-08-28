import javax.annotation.Nullable;

public class ckg extends cjk implements cjq, cmi {
   private static final ajw<Boolean> b = aka.a(ckg.class, ajy.k);
   private static final int e = 5;
   private static final int ca = 300;
   private final bra cb = new bra(5);

   public ckg(bsx<? extends ckg> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(0, new cag(this));
      this.bU.a(2, new coj.a(this, 10.0F));
      this.bU.a(3, new cbn<>(this, 1.0, 8.0F));
      this.bU.a(8, new cbj(this, 0.6));
      this.bU.a(9, new cau(this, cmx.class, 15.0F, 1.0F));
      this.bU.a(10, new cau(this, btp.class, 15.0F));
      this.bV.a(1, new cce(this, coj.class).a());
      this.bV.a(2, new ccf<>(this, cmx.class, true));
      this.bV.a(3, new ccf<>(this, cmf.class, false));
      this.bV.a(3, new ccf<>(this, cfq.class, true));
   }

   public static buv.a t() {
      return ckd.gq().a(buw.v, 0.35F).a(buw.s, 24.0).a(buw.c, 5.0).a(buw.m, 32.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvn $$0) {
      return $$0 == cut.vW;
   }

   public boolean gk() {
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
   public void b(ub $$0) {
      super.b($$0);
      this.b($$0, this.dQ());
   }

   @Override
   public cjk.a s() {
      if (this.gk()) {
         return cjk.a.f;
      } else if (this.b(cut.vW)) {
         return cjk.a.e;
      } else {
         return this.gb() ? cjk.a.b : cjk.a.h;
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0, this.dQ());
      this.a_(true);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return 0.0F;
   }

   @Override
   public int fN() {
      return 1;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.vW));
   }

   @Override
   protected void b(ddl $$0, ayw $$1, bqp $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cuq $$3 = this.eT();
         if ($$3.a(cut.vW)) {
            dae.a($$3, $$0.H_(), dbp.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avo v() {
      return avp.tV;
   }

   @Override
   protected avo n_() {
      return avp.tX;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.tY;
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bra x() {
      return this.cb;
   }

   @Override
   protected void b(cjh $$0) {
      cuq $$1 = $$0.p();
      if ($$1.g() instanceof csl) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuq $$2 = this.cb.b($$1);
         if ($$2.e()) {
            $$0.aq();
         } else {
            $$1.e($$2.H());
         }
      }
   }

   private boolean n(cuq $$0) {
      return this.gB() && $$0.a(cut.uP);
   }

   @Override
   public bug a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cb.b() ? bug.a(this.cb, $$1) : super.a_($$0);
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
      coi $$3 = this.gy();
      boolean $$4 = this.ah.i() <= $$3.v();
      if ($$4) {
         cuq $$5 = new cuq(cut.vW);
         akq<dbj> $$6;
         if ($$1 > $$3.a(bqo.c)) {
            $$6 = dbp.d;
         } else if ($$1 > $$3.a(bqo.b)) {
            $$6 = dbp.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dae.a($$5, $$0.H_(), $$6, $$0.d_(this.do()), this.dR());
            this.a(bsy.a, $$5);
         }
      }
   }

   @Override
   public avo ai_() {
      return avp.tW;
   }
}
