import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cge extends cee {
   public static final bry ch = bry.b(0.9F, 1.3F).a(0.7F);
   private static final int co = 2;
   private static final int cp = 1;
   protected static final ImmutableList<ccy<? extends ccx<? super cge>>> ci = ImmutableList.of(ccy.c, ccy.d, ccy.b, ccy.o, ccy.f, ccy.r);
   protected static final ImmutableList<cbr<?>> ck = ImmutableList.of(
      cbr.n, cbr.h, cbr.m, cbr.E, cbr.t, cbr.av, cbr.r, cbr.S, cbr.T, cbr.O, cbr.K, cbr.P, new cbr[]{cbr.R, cbr.V, cbr.W, cbr.Z}
   );
   public static final int cl = 10;
   public static final double cm = 0.02;
   public static final double cn = 0.1F;
   private static final ajy<Boolean> cq = akc.a(cge.class, aka.k);
   private static final ajy<Boolean> cr = akc.a(cge.class, aka.k);
   private static final ajy<Boolean> cs = akc.a(cge.class, aka.k);
   private boolean ct;
   private int cu;

   public cge(bsb<? extends cge> $$0, dca $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epv.f, -1.0F);
      this.a(epv.g, -1.0F);
   }

   public cuh r() {
      ayt $$0 = ayt.a((long)this.cE().hashCode());
      awt<ctz> $$1 = this.gI() ? awl.b : awl.a;
      je<ctz> $$2 = lh.am.a($$1);
      return cua.a(cuk.xP, $$2.a($$0).get());
   }

   @Override
   protected btp.b<cge> ea() {
      return btp.a(ck, ci);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cgf.a(this.ea().a($$0));
   }

   public static btu.a t() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 0.2F).a(btv.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(btv.c).a(1.0);
         this.gH();
      } else {
         this.f(btv.c).a(2.0);
         this.gG();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avn u() {
      return this.gI() ? avo.lh : avo.kX;
   }

   @Override
   protected avn d(bqt $$0) {
      return this.gI() ? avo.lk : avo.la;
   }

   @Override
   protected avn n_() {
      return this.gI() ? avo.li : avo.kY;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.lq, 0.15F, 1.0F);
   }

   protected avn x() {
      return this.gI() ? avo.lm : avo.lc;
   }

   @Nullable
   public cge b(aqt $$0, brp $$1) {
      cge $$2 = bsb.Z.a((dca)$$0);
      if ($$2 != null) {
         cgf.a($$2, $$0.F_());
         brp $$3 = (brp)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cge $$4 && $$4.gI() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public btp<cge> dZ() {
      return (btp<cge>)super.dZ();
   }

   @Override
   protected void Y() {
      this.dU().ag().a("goatBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("goatActivityUpdate");
      cgf.a(this);
      this.dU().ag().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = aym.c(this.bj, $$0);
      float $$3 = aym.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.bj + $$3);
   }

   @Override
   public avn d(cuh $$0) {
      return this.gI() ? avo.lj : avo.kZ;
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ab);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.rV) && !this.o_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cuh $$3 = cuj.a($$2, $$0, cuk.sb.v());
         $$0.a($$1, $$3);
         return bqa.a(this.dU().C);
      } else {
         bqa $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dU().a(null, this, this.d($$2), avq.g, 1.0F, aym.b(this.dU().A, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      cgf.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         ajy<Boolean> $$5 = $$4.h() ? cr : cs;
         this.as.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public bry e(bsz $$0) {
      return $$0 == bsz.g ? ch.a(this.el()) : super.e($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gI());
      $$0.a("HasLeftHorn", this.gy());
      $$0.a("HasRightHorn", this.gE());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.as.a(cr, $$0.q("HasLeftHorn"));
      this.as.a(cs, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ct = true;
      } else if ($$0 == 59) {
         this.ct = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.ct) {
         this.cu++;
      } else {
         this.cu -= 2;
      }

      this.cu = aym.a(this.cu, 0, 20);
      super.m_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cq, false);
      $$0.a(cr, true);
      $$0.a(cs, true);
   }

   public boolean gy() {
      return this.as.a(cr);
   }

   public boolean gE() {
      return this.as.a(cs);
   }

   public boolean gF() {
      boolean $$0 = this.gy();
      boolean $$1 = this.gE();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajy<Boolean> $$2;
         if (!$$0) {
            $$2 = cs;
         } else if (!$$1) {
            $$2 = cr;
         } else {
            $$2 = this.al.h() ? cr : cs;
         }

         this.as.a($$2, false);
         ewu $$5 = this.ds();
         cuh $$6 = this.r();
         double $$7 = (double)aym.b(this.al, -0.2F, 0.2F);
         double $$8 = (double)aym.b(this.al, 0.3F, 0.7F);
         double $$9 = (double)aym.b(this.al, -0.2F, 0.2F);
         cig $$10 = new cig(this.dU(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dU().b($$10);
         return true;
      }
   }

   public void gG() {
      this.as.a(cr, true);
      this.as.a(cs, true);
   }

   public void gH() {
      this.as.a(cr, false);
      this.as.a(cs, false);
   }

   public boolean gI() {
      return this.as.a(cq);
   }

   public void w(boolean $$0) {
      this.as.a(cq, $$0);
   }

   public float gJ() {
      return (float)this.cu / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsb<? extends cee> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.cc) && a($$1, $$3);
   }
}
