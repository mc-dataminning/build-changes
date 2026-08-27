import javax.annotation.Nullable;

public class cjh extends cil implements cir, clj {
   private static final ajs<Boolean> b = ajw.a(cjh.class, aju.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final bqf bZ = new bqf(5);

   public cjh(bsc<? extends cjh> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzi(this));
      this.bS.a(2, new cnk.a(this, 10.0F));
      this.bS.a(3, new cap<>(this, 1.0, 8.0F));
      this.bS.a(8, new cal(this, 0.6));
      this.bS.a(9, new bzw(this, cly.class, 15.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 15.0F));
      this.bT.a(1, new cbg(this, cnk.class).a());
      this.bT.a(2, new cbh<>(this, cly.class, true));
      this.bT.a(3, new cbh<>(this, clg.class, false));
      this.bT.a(3, new cbh<>(this, ces.class, true));
   }

   public static btx.a u() {
      return cje.gv().a(bty.r, 0.35F).a(bty.q, 24.0).a(bty.c, 5.0).a(bty.k, 32.0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cuj $$0) {
      return $$0 == ctt.vT;
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
      this.bf = 0;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public cil.a s() {
      if (this.gp()) {
         return cil.a.f;
      } else if (this.b(ctt.vT)) {
         return cil.a.e;
      } else {
         return this.gh() ? cil.a.b : cil.a.h;
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return 0.0F;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      this.a(bsd.a, new ctq(ctt.vT));
   }

   @Override
   protected void a(aym $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         ctq $$2 = this.eX();
         if ($$2.a(ctt.vT)) {
            $$2.a(cze.K, 1);
            this.a(bsd.a, $$2);
         }
      }
   }

   @Override
   protected avh v() {
      return avi.tS;
   }

   @Override
   protected avh o_() {
      return avi.tU;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.tV;
   }

   @Override
   public void a(bsq $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqf y() {
      return this.bZ;
   }

   @Override
   protected void b(cii $$0) {
      ctq $$1 = $$0.p();
      if ($$1.g() instanceof crl) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         ctq $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(ctq $$0) {
      return this.gG() && $$0.a(ctt.uP);
   }

   @Override
   public bti a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bti.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cnj $$2 = this.gD();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         ctq $$4 = new ctq(ctt.vT);
         if ($$0 > $$2.a(bpt.c)) {
            $$4.a(cze.J, 2);
         } else if ($$0 > $$2.a(bpt.b)) {
            $$4.a(cze.J, 1);
         }

         $$4.a(cze.I, 1);
         this.a(bsd.a, $$4);
      }
   }

   @Override
   public avh ae_() {
      return avi.tT;
   }
}
