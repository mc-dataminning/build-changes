import javax.annotation.Nullable;

public class cog extends cnk implements cnq, cqm {
   private static final akj<Boolean> a = akn.a(cog.class, akl.k);
   private static final int b = 5;
   private static final int bG = 300;
   private final buk bH = new buk(5);

   public cog(bwo<? extends cog> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cdh<>(this, cpi.class, 8.0F, 1.0, 1.2));
      this.bD.a(2, new cst.a(this, 10.0F));
      this.bD.a(3, new cfb<>(this, 1.0, 8.0F));
      this.bD.a(8, new cex(this, 0.6));
      this.bD.a(9, new cei(this, crc.class, 15.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 15.0F));
      this.bE.a(1, new cfs(this, cst.class).a());
      this.bE.a(2, new cft<>(this, crc.class, true));
      this.bE.a(3, new cft<>(this, cqj.class, false));
      this.bE.a(3, new cft<>(this, cjk.class, true));
   }

   public static byj.a m() {
      return cod.gu().a(byk.v, 0.35F).a(byk.s, 24.0).a(byk.c, 5.0).a(byk.m, 32.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(czy $$0) {
      return $$0 == czh.xg;
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
   public axr<cyz> Y() {
      return axk.bW;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public cnk.a j() {
      if (this.q()) {
         return cnk.a.f;
      } else if (this.b(czh.xg)) {
         return cnk.a.e;
      } else {
         return this.gi() ? cnk.a.b : cnk.a.h;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(iu $$0, djd $$1) {
      return 0.0F;
   }

   @Override
   public int ai() {
      return 1;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      this.a(bwp.a, new czd(czh.xg));
   }

   @Override
   protected void b(djr $$0, azv $$1, bub $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         czd $$3 = this.fb();
         if ($$3.a(czh.xg)) {
            dfs.a($$3, $$0.F_(), dhe.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awm u() {
      return awn.uJ;
   }

   @Override
   protected awm l_() {
      return awn.uL;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.uM;
   }

   @Override
   public void a(bxe $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public buk n() {
      return this.bH;
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      czd $$2 = $$1.f();
      if ($$2.h() instanceof cxj) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         czd $$3 = this.bH.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(czd $$0) {
      return this.gF() && $$0.a(czh.wa);
   }

   @Override
   public bxv a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bH.b() ? bxv.a(this.bH, $$1) : super.a_($$0);
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      css $$3 = this.gC();
      boolean $$4 = this.ae.i() <= $$3.s();
      if ($$4) {
         czd $$5 = new czd(czh.xg);
         alf<dgy> $$6;
         if ($$1 > $$3.a(bua.c)) {
            $$6 = dhe.d;
         } else if ($$1 > $$3.a(bua.b)) {
            $$6 = dhe.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dfs.a($$5, $$0.F_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(bwp.a, $$5);
         }
      }
   }

   @Override
   public awm ae_() {
      return awn.uK;
   }
}
