import javax.annotation.Nullable;

public class cpe extends coh implements coo, crj {
   private static final akn<Boolean> a = akr.a(cpe.class, akp.k);
   private static final int b = 5;
   private static final int e = 300;
   private final bva bI = new bva(5);

   public cpe(bxe<? extends cpe> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cdz<>(this, cqf.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new ctq.a(this, 10.0F));
      this.bF.a(3, new cft<>(this, 1.0, 8.0F));
      this.bF.a(8, new cfp(this, 0.6));
      this.bF.a(9, new cfa(this, crz.class, 15.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 15.0F));
      this.bG.a(1, new cgk(this, ctq.class).a());
      this.bG.a(2, new cgl<>(this, crz.class, true));
      this.bG.a(3, new cgl<>(this, crg.class, false));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.v, 0.35F).a(bzc.s, 24.0).a(bzc.c, 5.0).a(bzc.m, 32.0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(dav $$0) {
      return $$0 == dae.xg;
   }

   public boolean q() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.bd = 0;
   }

   @Override
   public axv<czw> Y() {
      return axo.bX;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public coh.a j() {
      if (this.q()) {
         return coh.a.f;
      } else if (this.b(dae.xg)) {
         return coh.a.e;
      } else {
         return this.gl() ? coh.a.b : coh.a.h;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return 0.0F;
   }

   @Override
   public int fX() {
      return 1;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      this.a(bxf.a, new daa(dae.xg));
   }

   @Override
   protected void b(dkq $$0, azz $$1, bur $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         daa $$3 = this.fb();
         if ($$3.a(dae.xg)) {
            dgp.a($$3, $$0.J_(), dib.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awq u() {
      return awr.uJ;
   }

   @Override
   protected awq l_() {
      return awr.uL;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.uM;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bva n() {
      return this.bI;
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      daa $$2 = $$1.f();
      if ($$2.h() instanceof cyg) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         daa $$3 = this.bI.b($$2);
         if ($$3.f()) {
            $$1.aq();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(daa $$0) {
      return this.gI() && $$0.a(dae.wa);
   }

   @Override
   public byn a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bI.b() ? byn.a(this.bI, $$1) : super.a_($$0);
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
      ctp $$3 = this.gF();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         daa $$5 = new daa(dae.xg);
         alj<dhv> $$6;
         if ($$1 > $$3.a(buq.c)) {
            $$6 = dib.d;
         } else if ($$1 > $$3.a(buq.b)) {
            $$6 = dib.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dgp.a($$5, $$0.J_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bxf.a, $$5);
         }
      }
   }

   @Override
   public awq ai_() {
      return awr.uK;
   }
}
