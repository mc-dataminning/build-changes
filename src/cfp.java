import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cfp extends cdp {
   public static final brk bY = brk.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cck<? extends ccj<? super cfp>>> bZ = ImmutableList.of(cck.c, cck.d, cck.b, cck.o, cck.f, cck.r);
   protected static final ImmutableList<cbd<?>> cb = ImmutableList.of(
      cbd.n, cbd.h, cbd.m, cbd.E, cbd.t, cbd.av, cbd.r, cbd.S, cbd.T, cbd.O, cbd.K, cbd.P, new cbd[]{cbd.R, cbd.V, cbd.W, cbd.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajm<Boolean> ch = ajq.a(cfp.class, ajo.k);
   private static final ajm<Boolean> ci = ajq.a(cfp.class, ajo.k);
   private static final ajm<Boolean> cj = ajq.a(cfp.class, ajo.k);
   private boolean ck;
   private int cl;

   public cfp(brn<? extends cfp> $$0, dad $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(emr.f, -1.0F);
      this.a(emr.g, -1.0F);
   }

   public csz r() {
      ayg $$0 = ayg.a((long)this.cx().hashCode());
      awg<csr> $$1 = this.gz() ? avy.b : avy.a;
      ja<csr> $$2 = ld.am.a($$1);
      return css.a(ctc.we, $$2.a($$0).get());
   }

   @Override
   protected btb.b<cfp> dR() {
      return btb.a(cb, bZ);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cfq.a(this.dR().a($$0));
   }

   public static btg.a u() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 0.2F).a(bth.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bth.c).a(1.0);
         this.gy();
      } else {
         this.f(bth.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avb v() {
      return this.gz() ? avc.kP : avc.kF;
   }

   @Override
   protected avb d(bqf $$0) {
      return this.gz() ? avc.kS : avc.kI;
   }

   @Override
   protected avb o_() {
      return this.gz() ? avc.kQ : avc.kG;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.kY, 0.15F, 1.0F);
   }

   protected avb y() {
      return this.gz() ? avc.kU : avc.kK;
   }

   @Nullable
   public cfp b(aqh $$0, brb $$1) {
      cfp $$2 = brn.X.a((dad)$$0);
      if ($$2 != null) {
         cfq.a($$2, $$0.E_());
         brb $$3 = (brb)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cfp $$4 && $$4.gz() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public btb<cfp> dQ() {
      return (btb<cfp>)super.dQ();
   }

   @Override
   protected void Y() {
      this.dN().af().a("goatBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("goatActivityUpdate");
      cfq.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = axz.c(this.aZ, $$0);
      float $$3 = axz.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aZ + $$3);
   }

   @Override
   public avb d(csz $$0) {
      return this.gz() ? avc.kR : avc.kH;
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ab);
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         csz $$3 = ctb.a($$2, $$0, ctc.qE.v());
         $$0.a($$1, $$3);
         return bpm.a(this.dN().B);
      } else {
         bpm $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dN().a(null, this, this.d($$2), avd.g, 1.0F, axz.b(this.dN().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      cfq.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ajm<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public brk e(bsl $$0) {
      return $$0 == bsl.g ? bY.a(this.eb()) : super.e($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gz());
      $$0.a("HasLeftHorn", this.gp());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ci, $$0.q("HasLeftHorn"));
      this.ao.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = axz.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gp() {
      return this.ao.a(ci);
   }

   public boolean gv() {
      return this.ao.a(cj);
   }

   public boolean gw() {
      boolean $$0 = this.gp();
      boolean $$1 = this.gv();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajm<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         etp $$5 = this.dl();
         csz $$6 = this.r();
         double $$7 = (double)axz.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)axz.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)axz.b(this.ah, -0.2F, 0.2F);
         chr $$10 = new chr(this.dN(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dN().b($$10);
         return true;
      }
   }

   public void gx() {
      this.ao.a(ci, true);
      this.ao.a(cj, true);
   }

   public void gy() {
      this.ao.a(ci, false);
      this.ao.a(cj, false);
   }

   public boolean gz() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public float gA() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(brn<? extends cdp> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.bZ) && a($$1, $$3);
   }
}
