import javax.annotation.Nullable;

public class clu extends cky implements cle, cnw {
   private static final akl<Boolean> b = akp.a(clu.class, akn.k);
   private static final int c = 5;
   private static final int bY = 300;
   private final bsk bZ = new bsk(5);

   public clu(bul<? extends clu> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(2, new cqb.a(this, 10.0F));
      this.bS.a(3, new ccz<>(this, 1.0, 8.0F));
      this.bS.a(8, new ccv(this, 0.6));
      this.bS.a(9, new ccg(this, com.class, 15.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 15.0F));
      this.bT.a(1, new cdq(this, cqb.class).a());
      this.bT.a(2, new cdr<>(this, com.class, true));
      this.bT.a(3, new cdr<>(this, cnt.class, false));
      this.bT.a(3, new cdr<>(this, chd.class, true));
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.v, 0.35F).a(bwi.s, 24.0).a(bwi.c, 5.0).a(bwi.m, 32.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cwx $$0) {
      return $$0 == cwf.vX;
   }

   public boolean gu() {
      return this.am.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public cky.a q() {
      if (this.gu()) {
         return cky.a.f;
      } else if (this.b(cwf.vX)) {
         return cky.a.e;
      } else {
         return this.gj() ? cky.a.b : cky.a.h;
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0, this.dZ());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return 0.0F;
   }

   @Override
   public int aj() {
      return 1;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      this.a(bum.a, new cwb(cwf.vX));
   }

   @Override
   protected void b(dfr $$0, azs $$1, bsb $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwb $$3 = this.fb();
         if ($$3.a(cwf.vX)) {
            dbu.a($$3, $$0.H_(), ddg.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awk w() {
      return awl.tU;
   }

   @Override
   protected awk o_() {
      return awl.tW;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.tX;
   }

   @Override
   public void a(bva $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsk y() {
      return this.bZ;
   }

   @Override
   protected void b(ckv $$0) {
      cwb $$1 = $$0.m();
      if ($$1.h() instanceof cue) {
         super.b($$0);
      } else if (this.k($$1)) {
         this.a($$0);
         cwb $$2 = this.bZ.b($$1);
         if ($$2.f()) {
            $$0.av();
         } else {
            $$1.e($$2.L());
         }
      }
   }

   private boolean k(cwb $$0) {
      return this.gL() && $$0.a(cwf.uR);
   }

   @Override
   public bvs a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvs.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
      cqa $$3 = this.gI();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cwb $$5 = new cwb(cwf.vX);
         alh<dda> $$6;
         if ($$1 > $$3.a(bsa.c)) {
            $$6 = ddg.d;
         } else if ($$1 > $$3.a(bsa.b)) {
            $$6 = ddg.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dbu.a($$5, $$0.H_(), $$6, $$0.d_(this.dx()), this.ea());
            this.a(bum.a, $$5);
         }
      }
   }

   @Override
   public awk aj_() {
      return awl.tV;
   }
}
