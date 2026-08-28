import javax.annotation.Nullable;

public class cpn extends cor implements cox, crs {
   private static final aku<Boolean> a = aky.a(cpn.class, akw.k);
   private static final int b = 5;
   private static final int e = 300;
   private final bvj bI = new bvj(5);

   public cpn(bxn<? extends cpn> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cei<>(this, cqo.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new ctz.a(this, 10.0F));
      this.bF.a(3, new cgc<>(this, 1.0, 8.0F));
      this.bF.a(8, new cfy(this, 0.6));
      this.bF.a(9, new cfj(this, csi.class, 15.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 15.0F));
      this.bG.a(1, new cgt(this, ctz.class).a());
      this.bG.a(2, new cgu<>(this, csi.class, true));
      this.bG.a(3, new cgu<>(this, crp.class, false));
      this.bG.a(3, new cgu<>(this, ckl.class, true));
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.v, 0.35F).a(bzl.s, 24.0).a(bzl.c, 5.0).a(bzl.m, 32.0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(dbf $$0) {
      return $$0 == dao.xg;
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
   public ayc<dag> Y() {
      return axv.bX;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cor.a j() {
      if (this.q()) {
         return cor.a.f;
      } else if (this.b(dao.xg)) {
         return cor.a.e;
      } else {
         return this.gl() ? cor.a.b : cor.a.h;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return 0.0F;
   }

   @Override
   public int fX() {
      return 1;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      this.a(bxo.a, new dak(dao.xg));
   }

   @Override
   protected void b(dla $$0, bai $$1, bva $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         dak $$3 = this.fb();
         if ($$3.a(dao.xg)) {
            dgz.a($$3, $$0.J_(), dil.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awx u() {
      return awy.uJ;
   }

   @Override
   protected awx l_() {
      return awy.uL;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.uM;
   }

   @Override
   public void a(byf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bvj n() {
      return this.bI;
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      dak $$2 = $$1.f();
      if ($$2.h() instanceof cyq) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         dak $$3 = this.bI.b($$2);
         if ($$3.f()) {
            $$1.aq();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(dak $$0) {
      return this.gI() && $$0.a(dao.wa);
   }

   @Override
   public byw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bI.b() ? byw.a(this.bI, $$1) : super.a_($$0);
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
      cty $$3 = this.gF();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         dak $$5 = new dak(dao.xg);
         alq<dif> $$6;
         if ($$1 > $$3.a(buz.c)) {
            $$6 = dil.d;
         } else if ($$1 > $$3.a(buz.b)) {
            $$6 = dil.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dgz.a($$5, $$0.J_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bxo.a, $$5);
         }
      }
   }

   @Override
   public awx aj_() {
      return awy.uK;
   }
}
