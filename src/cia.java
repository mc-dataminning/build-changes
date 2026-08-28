import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cia extends cga {
   public static final btr bY = btr.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<ceu<? extends cet<? super cia>>> bZ = ImmutableList.of(ceu.c, ceu.d, ceu.b, ceu.o, ceu.f, ceu.r);
   protected static final ImmutableList<cdn<?>> ca = ImmutableList.of(
      cdn.n, cdn.h, cdn.m, cdn.E, cdn.t, cdn.av, cdn.r, cdn.S, cdn.T, cdn.O, cdn.K, cdn.P, new cdn[]{cdn.R, cdn.V, cdn.W, cdn.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akg<Boolean> ch = akk.a(cia.class, aki.k);
   private static final akg<Boolean> ci = akk.a(cia.class, aki.k);
   private static final akg<Boolean> cj = akk.a(cia.class, aki.k);
   private boolean ck;
   private int cl;

   public cia(btv<? extends cia> $$0, deg $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erg.f, -1.0F);
      this.a(erg.g, -1.0F);
   }

   public cvp q() {
      azl $$0 = azl.a((long)this.cD().hashCode());
      axj<cvh> $$1 = this.gB() ? axb.b : axb.a;
      return this.dS().F_().d(lv.I).a($$1, $$0).map($$0x -> cvi.a(cvt.wk, $$0x)).orElseGet(() -> new cvp(cvt.wk));
   }

   @Override
   protected bvl.b<cia> dY() {
      return bvl.a(ca, bZ);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cib.a(this.dY().a($$0));
   }

   public static bvq.a t() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.v, 0.2F).a(bvr.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.g(bvr.c).a(1.0);
         this.gt();
      } else {
         this.g(bvr.c).a(2.0);
         this.gs();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awd w() {
      return this.gB() ? awe.kV : awe.kL;
   }

   @Override
   protected awd d(bsg $$0) {
      return this.gB() ? awe.kY : awe.kO;
   }

   @Override
   protected awd n_() {
      return this.gB() ? awe.kW : awe.kM;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.le, 0.15F, 1.0F);
   }

   protected awd y() {
      return this.gB() ? awe.la : awe.kQ;
   }

   @Nullable
   public cia b(arh $$0, bth $$1) {
      cia $$2 = btv.X.a($$0, btu.e);
      if ($$2 != null) {
         cib.a($$2, $$0.C_());
         bth $$3 = (bth)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cia $$4 && $$4.gB() || $$0.C_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bvl<cia> dX() {
      return (bvl<cia>)super.dX();
   }

   @Override
   protected void ad() {
      this.dS().ah().a("goatBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("goatActivityUpdate");
      cib.a(this);
      this.dS().ah().c();
      super.ad();
   }

   @Override
   public int ag() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ag();
      float $$2 = azd.c(this.aT, $$0);
      float $$3 = azd.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aT + $$3);
   }

   @Override
   protected void gv() {
      this.dS().a(null, this, this.gB() ? awe.kX : awe.kN, awf.g, 1.0F, azd.b(this.dS().z, 0.8F, 1.2F));
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ab);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.qz) && !this.o_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cvp $$3 = cvs.a($$2, $$0, cvt.qF.v());
         $$0.a($$1, $$3);
         return brp.a;
      } else {
         brp $$4 = super.b($$0, $$1);
         if ($$4.a() && this.n($$2)) {
            this.gv();
         }

         return $$4;
      }
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      cib.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         akg<Boolean> $$5 = $$4.h() ? ci : cj;
         this.am.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public btr e(buw $$0) {
      return $$0 == buw.g ? bY.a(this.ee()) : super.e($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gB());
      $$0.a("HasLeftHorn", this.gp());
      $$0.a("HasRightHorn", this.gq());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.am.a(ci, $$0.q("HasLeftHorn"));
      this.am.a(cj, $$0.q("HasRightHorn"));
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
   public void m_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = azd.a(this.cl, 0, 20);
      super.m_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gp() {
      return this.am.a(ci);
   }

   public boolean gq() {
      return this.am.a(cj);
   }

   public boolean gr() {
      boolean $$0 = this.gp();
      boolean $$1 = this.gq();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akg<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.af.h() ? ci : cj;
         }

         this.am.a($$2, false);
         eys $$5 = this.dq();
         cvp $$6 = this.q();
         double $$7 = (double)azd.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azd.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azd.b(this.af, -0.2F, 0.2F);
         cke $$10 = new cke(this.dS(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dS().b($$10);
         return true;
      }
   }

   public void gs() {
      this.am.a(ci, true);
      this.am.a(cj, true);
   }

   public void gt() {
      this.am.a(ci, false);
      this.am.a(cj, false);
   }

   public boolean gB() {
      return this.am.a(ch);
   }

   public void x(boolean $$0) {
      this.am.a(ch, $$0);
   }

   public float gC() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(btv<? extends cga> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.ca) && a($$1, $$3);
   }
}
