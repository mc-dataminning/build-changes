import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cdc extends cbe {
   public static final bpa bX = bpa.b(0.9F, 1.3F).a(0.7F);
   private static final int ce = 2;
   private static final int cf = 1;
   protected static final ImmutableList<bzz<? extends bzy<? super cdc>>> bY = ImmutableList.of(bzz.c, bzz.d, bzz.b, bzz.o, bzz.f, bzz.r);
   protected static final ImmutableList<bys<?>> ca = ImmutableList.of(
      bys.n, bys.h, bys.m, bys.E, bys.t, bys.av, bys.r, bys.S, bys.T, bys.O, bys.K, bys.P, new bys[]{bys.R, bys.V, bys.W, bys.Z}
   );
   public static final int cb = 10;
   public static final double cc = 0.02;
   public static final double cd = 0.1F;
   private static final aim<Boolean> cg = aiq.a(cdc.class, aio.k);
   private static final aim<Boolean> ch = aiq.a(cdc.class, aio.k);
   private static final aim<Boolean> ci = aiq.a(cdc.class, aio.k);
   private boolean cj;
   private int ck;

   public cdc(bpd<? extends cdc> $$0, cxb $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(ejg.f, -1.0F);
      this.a(ejg.g, -1.0F);
   }

   public cqm r() {
      axd $$0 = axd.a((long)this.cw().hashCode());
      avd<cqe> $$1 = this.gx() ? auu.b : auu.a;
      ip<cqe> $$2 = ki.an.a($$1);
      return cqf.a(cqp.wa, $$2.a($$0).get());
   }

   @Override
   protected bqq.b<cdc> dQ() {
      return bqq.a(ca, bY);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return cdd.a(this.dQ().a($$0));
   }

   public static bqv.a s() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 0.2F).a(bqw.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(bqw.c).a(1.0);
         this.gw();
      } else {
         this.f(bqw.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected atx v() {
      return this.gx() ? aty.kN : aty.kD;
   }

   @Override
   protected atx d(bnw $$0) {
      return this.gx() ? aty.kQ : aty.kG;
   }

   @Override
   protected atx n_() {
      return this.gx() ? aty.kO : aty.kE;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.kW, 0.15F, 1.0F);
   }

   protected atx y() {
      return this.gx() ? aty.kS : aty.kI;
   }

   @Nullable
   public cdc b(apf $$0, bos $$1) {
      cdc $$2 = bpd.Y.a((cxb)$$0);
      if ($$2 != null) {
         cdd.a($$2, $$0.E_());
         bos $$3 = (bos)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cdc $$4 && $$4.gx() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bqq<cdc> dP() {
      return (bqq<cdc>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().ae().a("goatBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("goatActivityUpdate");
      cdd.a(this);
      this.dM().ae().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = aww.c(this.aX, $$0);
      float $$3 = aww.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aX + $$3);
   }

   @Override
   public atx d(cqm $$0) {
      return this.gx() ? aty.kP : aty.kF;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.qx) && !this.o_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cqm $$3 = cqo.a($$2, $$0, cqp.qD.am_());
         $$0.a($$1, $$3);
         return bnd.a(this.dM().B);
      } else {
         bnd $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dM().a(null, this, this.d($$2), atz.g, 1.0F, aww.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      cdd.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         aim<Boolean> $$5 = $$4.h() ? ch : ci;
         this.an.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public bpa e(bqa $$0) {
      return $$0 == bqa.g ? bX.a(this.ea()) : super.e($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gx());
      $$0.a("HasLeftHorn", this.gn());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.a(ch, $$0.q("HasLeftHorn"));
      this.an.a(ci, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cj = true;
      } else if ($$0 == 59) {
         this.cj = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.cj) {
         this.ck++;
      } else {
         this.ck -= 2;
      }

      this.ck = aww.a(this.ck, 0, 20);
      super.m_();
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
      $$0.a(ci, true);
   }

   public boolean gn() {
      return this.an.a(ch);
   }

   public boolean gt() {
      return this.an.a(ci);
   }

   public boolean gu() {
      boolean $$0 = this.gn();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aim<Boolean> $$2;
         if (!$$0) {
            $$2 = ci;
         } else if (!$$1) {
            $$2 = ch;
         } else {
            $$2 = this.ag.h() ? ch : ci;
         }

         this.an.a($$2, false);
         ept $$5 = this.dk();
         cqm $$6 = this.r();
         double $$7 = (double)aww.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aww.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aww.b(this.ag, -0.2F, 0.2F);
         cfe $$10 = new cfe(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
         return true;
      }
   }

   public void gv() {
      this.an.a(ch, true);
      this.an.a(ci, true);
   }

   public void gw() {
      this.an.a(ch, false);
      this.an.a(ci, false);
   }

   public boolean gx() {
      return this.an.a(cg);
   }

   public void w(boolean $$0) {
      this.an.a(cg, $$0);
   }

   public float gy() {
      return (float)this.ck / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bpd<? extends cbe> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bT) && a($$1, $$3);
   }
}
