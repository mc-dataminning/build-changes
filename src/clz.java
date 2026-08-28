import javax.annotation.Nullable;

public class clz extends cld implements clj, coe {
   private static final ajx<Boolean> a = akb.a(clz.class, ajz.k);
   private static final int b = 5;
   private static final int bY = 300;
   private final bsp bZ = new bsp(5);

   public clz(buq<? extends clz> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cbk<>(this, cna.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cqj.a(this, 10.0F));
      this.bS.a(3, new cde<>(this, 1.0, 8.0F));
      this.bS.a(8, new cda(this, 0.6));
      this.bS.a(9, new ccl(this, cov.class, 15.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 15.0F));
      this.bT.a(1, new cdv(this, cqj.class).a());
      this.bT.a(2, new cdw<>(this, cov.class, true));
      this.bT.a(3, new cdw<>(this, cob.class, false));
      this.bT.a(3, new cdw<>(this, chi.class, true));
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.v, 0.35F).a(bwn.s, 24.0).a(bwn.c, 5.0).a(bwn.m, 32.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cxj $$0) {
      return $$0 == cwr.wV;
   }

   public boolean x() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public axe<cwj> W() {
      return awx.bU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dY());
   }

   @Override
   public cld.a m() {
      if (this.x()) {
         return cld.a.f;
      } else if (this.b(cwr.wV)) {
         return cld.a.e;
      } else {
         return this.ge() ? cld.a.b : cld.a.h;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      this.a_(true);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return 0.0F;
   }

   @Override
   public int af() {
      return 1;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      this.a(bur.a, new cwn(cwr.wV));
   }

   @Override
   protected void b(dgx $$0, azg $$1, bsg $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwn $$3 = this.eZ();
         if ($$3.a(cwr.wV)) {
            dcz.a($$3, $$0.K_(), del.b, $$2, $$1);
         }
      }
   }

   @Override
   protected avy u() {
      return avz.uv;
   }

   @Override
   protected avy o_() {
      return avz.ux;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.uy;
   }

   @Override
   public void a(bvf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsp t() {
      return this.bZ;
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      cwn $$2 = $$1.l();
      if ($$2.h() instanceof cuq) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cwn $$3 = this.bZ.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(cwn $$0) {
      return this.gF() && $$0.a(cwr.vP);
   }

   @Override
   public bvx a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvx.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
      cqi $$3 = this.gC();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cwn $$5 = new cwn(cwr.wV);
         akt<def> $$6;
         if ($$1 > $$3.a(bsf.c)) {
            $$6 = del.d;
         } else if ($$1 > $$3.a(bsf.b)) {
            $$6 = del.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dcz.a($$5, $$0.K_(), $$6, $$0.d_(this.dw()), this.dZ());
            this.a(bur.a, $$5);
         }
      }
   }

   @Override
   public avy aj_() {
      return avz.uw;
   }
}
