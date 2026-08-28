import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cld extends ciu {
   public static final bwi bG = bwi.b(0.9F, 1.3F).a(0.7F);
   private static final int bN = 2;
   private static final int bO = 1;
   protected static final ImmutableList<chn<? extends chm<? super cld>>> bH = ImmutableList.of(chn.c, chn.d, chn.b, chn.o, chn.f, chn.r);
   protected static final ImmutableList<cgg<?>> bI = ImmutableList.of(
      cgg.o, cgg.h, cgg.n, cgg.F, cgg.u, cgg.aw, cgg.s, cgg.T, cgg.U, cgg.P, cgg.L, cgg.Q, new cgg[]{cgg.S, cgg.W, cgg.X, cgg.aa}
   );
   public static final int bK = 10;
   public static final double bL = 0.02;
   public static final double bM = 0.1F;
   private static final akj<Boolean> bP = akn.a(cld.class, akl.k);
   private static final akj<Boolean> bQ = akn.a(cld.class, akl.k);
   private static final akj<Boolean> bR = akn.a(cld.class, akl.k);
   private boolean bS;
   private int bT;

   public cld(bwo<? extends cld> $$0, dja $$1) {
      super($$0, $$1);
      this.O().a(true);
      this.a(exf.f, -1.0F);
      this.a(exf.g, -1.0F);
   }

   public czd q() {
      azv $$0 = azv.a((long)this.cG().hashCode());
      axr<cyw> $$1 = this.gD() ? axj.b : axj.a;
      return this.dV().F_().f(mg.aU).a($$1, $$0).map($$0x -> cyx.a(czh.xt, $$0x)).orElseGet(() -> new czd(czh.xt));
   }

   @Override
   protected bye.b<cld> ed() {
      return bye.a(bI, bH);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cle.a(this.ed().a($$0));
   }

   public static byj.a t() {
      return ciu.gw().a(byk.s, 10.0).a(byk.v, 0.2F).a(byk.c, 2.0);
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.g(byk.c).a(1.0);
         this.gv();
      } else {
         this.g(byk.c).a(2.0);
         this.gu();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected awm u() {
      return this.gD() ? awn.lx : awn.lo;
   }

   @Override
   protected awm e(buu $$0) {
      return this.gD() ? awn.lA : awn.lr;
   }

   @Override
   protected awm l_() {
      return this.gD() ? awn.ly : awn.lp;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.lF, 0.15F, 1.0F);
   }

   protected awm x() {
      return this.gD() ? awn.lC : awn.lt;
   }

   @Nullable
   public cld b(arq $$0, bvv $$1) {
      cld $$2 = bwo.ah.a($$0, bwn.e);
      if ($$2 != null) {
         cle.a($$2, $$0.C_());
         bvv $$3 = (bvv)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cld $$4 && $$4.gD() || $$0.C_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bye<cld> ec() {
      return (bye<cld>)super.ec();
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cle.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int ad() {
      return 15;
   }

   @Override
   public void r(float $$0) {
      int $$1 = this.ad();
      float $$2 = azm.c(this.aV, $$0);
      float $$3 = azm.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.aV + $$3);
   }

   @Override
   protected void gx() {
      this.dV().a(null, this, this.gD() ? awn.lz : awn.lq, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.af);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.ro) && !this.n_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         czd $$3 = czg.a($$2, $$0, czh.ru.m());
         $$0.a($$1, $$3);
         return bud.a;
      } else {
         bud $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gx();
         }

         return $$4;
      }
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      cle.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.j();
      if (!this.n_() && (double)$$4.i() < 0.1F) {
         akj<Boolean> $$5 = $$4.h() ? bQ : bR;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public bwi e(bxq $$0) {
      return $$0 == bxq.g ? bG.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gD());
      $$0.a("HasLeftHorn", this.gr());
      $$0.a("HasRightHorn", this.gs());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.al.a(bQ, $$0.q("HasLeftHorn"));
      this.al.a(bR, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.bS = true;
      } else if ($$0 == 59) {
         this.bS = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void k_() {
      if (this.bS) {
         this.bT++;
      } else {
         this.bT -= 2;
      }

      this.bT = azm.a(this.bT, 0, 20);
      super.k_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bP, false);
      $$0.a(bQ, true);
      $$0.a(bR, true);
   }

   public boolean gr() {
      return this.al.a(bQ);
   }

   public boolean gs() {
      return this.al.a(bR);
   }

   public boolean gt() {
      boolean $$0 = this.gr();
      boolean $$1 = this.gs();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akj<Boolean> $$2;
         if (!$$0) {
            $$2 = bR;
         } else if (!$$1) {
            $$2 = bQ;
         } else {
            $$2 = this.ae.h() ? bQ : bR;
         }

         this.al.a($$2, false);
         feq $$5 = this.dt();
         czd $$6 = this.q();
         double $$7 = (double)azm.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azm.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azm.b(this.ae, -0.2F, 0.2F);
         cnh $$10 = new cnh(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gu() {
      this.al.a(bQ, true);
      this.al.a(bR, true);
   }

   public void gv() {
      this.al.a(bQ, false);
      this.al.a(bR, false);
   }

   public boolean gD() {
      return this.al.a(bP);
   }

   public void w(boolean $$0) {
      this.al.a(bP, $$0);
   }

   public float gE() {
      return (float)this.bT / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bwo<? extends ciu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cd) && a($$1, $$3);
   }
}
