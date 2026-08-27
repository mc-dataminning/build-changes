import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cet extends cct {
   public static final bqo bY = bqo.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cbo<? extends cbn<? super cet>>> bZ = ImmutableList.of(cbo.c, cbo.d, cbo.b, cbo.o, cbo.f, cbo.r);
   protected static final ImmutableList<cah<?>> cb = ImmutableList.of(
      cah.n, cah.h, cah.m, cah.E, cah.t, cah.av, cah.r, cah.S, cah.T, cah.O, cah.K, cah.P, new cah[]{cah.R, cah.V, cah.W, cah.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajk<Boolean> ch = ajo.a(cet.class, ajm.k);
   private static final ajk<Boolean> ci = ajo.a(cet.class, ajm.k);
   private static final ajk<Boolean> cj = ajo.a(cet.class, ajm.k);
   private boolean ck;
   private int cl;

   public cet(bqr<? extends cet> $$0, czu $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(emi.f, -1.0F);
      this.a(emi.g, -1.0F);
   }

   public csd r() {
      ayd $$0 = ayd.a((long)this.cx().hashCode());
      awd<crv> $$1 = this.gz() ? avv.b : avv.a;
      iz<crv> $$2 = lc.am.a($$1);
      return crw.a(csg.we, $$2.a($$0).get());
   }

   @Override
   protected bsf.b<cet> dR() {
      return bsf.a(cb, bZ);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return ceu.a(this.dR().a($$0));
   }

   public static bsk.a u() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 0.2F).a(bsl.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bsl.c).a(1.0);
         this.gy();
      } else {
         this.f(bsl.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected auy v() {
      return this.gz() ? auz.kP : auz.kF;
   }

   @Override
   protected auy d(bpj $$0) {
      return this.gz() ? auz.kS : auz.kI;
   }

   @Override
   protected auy o_() {
      return this.gz() ? auz.kQ : auz.kG;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.kY, 0.15F, 1.0F);
   }

   protected auy y() {
      return this.gz() ? auz.kU : auz.kK;
   }

   @Nullable
   public cet b(aqe $$0, bqf $$1) {
      cet $$2 = bqr.X.a((czu)$$0);
      if ($$2 != null) {
         ceu.a($$2, $$0.E_());
         bqf $$3 = (bqf)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cet $$4 && $$4.gz() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bsf<cet> dQ() {
      return (bsf<cet>)super.dQ();
   }

   @Override
   protected void Y() {
      this.dN().af().a("goatBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("goatActivityUpdate");
      ceu.a(this);
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
      float $$2 = axw.c(this.aZ, $$0);
      float $$3 = axw.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aZ + $$3);
   }

   @Override
   public auy d(csd $$0) {
      return this.gz() ? auz.kR : auz.kH;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         csd $$3 = csf.a($$2, $$0, csg.qE.x());
         $$0.a($$1, $$3);
         return boq.a(this.dN().B);
      } else {
         boq $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dN().a(null, this, this.d($$2), ava.g, 1.0F, axw.b(this.dN().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      ceu.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ajk<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public bqo e(brp $$0) {
      return $$0 == brp.g ? bY.a(this.eb()) : super.e($$0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gz());
      $$0.a("HasLeftHorn", this.gp());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(ty $$0) {
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

      this.cl = axw.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajo.a $$0) {
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
         ajk<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         etf $$5 = this.dl();
         csd $$6 = this.r();
         double $$7 = (double)axw.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)axw.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)axw.b(this.ah, -0.2F, 0.2F);
         cgv $$10 = new cgv(this.dN(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bqr<? extends cct> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bT) && a($$1, $$3);
   }
}
