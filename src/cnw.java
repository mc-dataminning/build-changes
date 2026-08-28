import javax.annotation.Nullable;

public class cnw extends cna implements cng, cqc {
   private static final akh<Boolean> a = akl.a(cnw.class, akj.k);
   private static final int b = 5;
   private static final int bF = 300;
   private final buf bG = new buf(5);

   public cnw(bwj<? extends cnw> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cdc<>(this, coy.class, 8.0F, 1.0, 1.2));
      this.bC.a(2, new csi.a(this, 10.0F));
      this.bC.a(3, new cew<>(this, 1.0, 8.0F));
      this.bC.a(8, new ces(this, 0.6));
      this.bC.a(9, new ced(this, cqs.class, 15.0F, 1.0F));
      this.bC.a(10, new ced(this, bxb.class, 15.0F));
      this.bD.a(1, new cfn(this, csi.class).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true));
      this.bD.a(3, new cfo<>(this, cpz.class, false));
      this.bD.a(3, new cfo<>(this, cja.class, true));
   }

   public static bye.a m() {
      return cnt.gt().a(byf.v, 0.35F).a(byf.s, 24.0).a(byf.c, 5.0).a(byf.m, 32.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(czn $$0) {
      return $$0 == cyw.wZ;
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
   public axp<cyo> Y() {
      return axi.bV;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cna.a j() {
      if (this.q()) {
         return cna.a.f;
      } else if (this.b(cyw.wZ)) {
         return cna.a.e;
      } else {
         return this.gh() ? cna.a.b : cna.a.h;
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return 0.0F;
   }

   @Override
   public int ai() {
      return 1;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      this.a(bwk.a, new cys(cyw.wZ));
   }

   @Override
   protected void b(djg $$0, azt $$1, btw $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cys $$3 = this.fa();
         if ($$3.a(cyw.wZ)) {
            dfh.a($$3, $$0.F_(), dgt.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awk u() {
      return awl.uF;
   }

   @Override
   protected awk l_() {
      return awl.uH;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.uI;
   }

   @Override
   public void a(bwz $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public buf n() {
      return this.bG;
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      cys $$2 = $$1.f();
      if ($$2.h() instanceof cwy) {
         super.a($$0, $$1);
      } else if (this.j($$2)) {
         this.a($$1);
         cys $$3 = this.bG.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean j(cys $$0) {
      return this.gE() && $$0.a(cyw.vT);
   }

   @Override
   public bxq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bG.b() ? bxq.a(this.bG, $$1) : super.a_($$0);
   }

   @Override
   public void a(aro $$0, int $$1, boolean $$2) {
      csh $$3 = this.gB();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cys $$5 = new cys(cyw.wZ);
         ald<dgn> $$6;
         if ($$1 > $$3.a(btv.c)) {
            $$6 = dgt.d;
         } else if ($$1 > $$3.a(btv.b)) {
            $$6 = dgt.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dfh.a($$5, $$0.F_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bwk.a, $$5);
         }
      }
   }

   @Override
   public awk ad_() {
      return awl.uG;
   }
}
