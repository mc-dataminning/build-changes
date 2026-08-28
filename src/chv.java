import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chv extends cfv {
   public static final btm bZ = btm.b(0.9F, 1.3F).a(0.7F);
   private static final int cg = 2;
   private static final int ch = 1;
   protected static final ImmutableList<cep<? extends ceo<? super chv>>> ca = ImmutableList.of(cep.c, cep.d, cep.b, cep.o, cep.f, cep.r);
   protected static final ImmutableList<cdi<?>> cb = ImmutableList.of(
      cdi.n, cdi.h, cdi.m, cdi.E, cdi.t, cdi.av, cdi.r, cdi.S, cdi.T, cdi.O, cdi.K, cdi.P, new cdi[]{cdi.R, cdi.V, cdi.W, cdi.Z}
   );
   public static final int cd = 10;
   public static final double ce = 0.02;
   public static final double cf = 0.1F;
   private static final akg<Boolean> ci = akk.a(chv.class, aki.k);
   private static final akg<Boolean> cj = akk.a(chv.class, aki.k);
   private static final akg<Boolean> ck = akk.a(chv.class, aki.k);
   private boolean cl;
   private int cm;

   public chv(btq<? extends chv> $$0, dds $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(eqs.f, -1.0F);
      this.a(eqs.g, -1.0F);
   }

   public cvl q() {
      azk $$0 = azk.a((long)this.cD().hashCode());
      axi<cvd> $$1 = this.gA() ? axa.b : axa.a;
      return this.dS().F_().d(lv.I).a($$1, $$0).map($$0x -> cve.a(cvo.wk, $$0x)).orElseGet(() -> new cvl(cvo.wk));
   }

   @Override
   protected bvg.b<chv> dY() {
      return bvg.a(cb, ca);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chw.a(this.dY().a($$0));
   }

   public static bvl.a t() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.v, 0.2F).a(bvm.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.g(bvm.c).a(1.0);
         this.gs();
      } else {
         this.g(bvm.c).a(2.0);
         this.gr();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awc w() {
      return this.gA() ? awd.kV : awd.kL;
   }

   @Override
   protected awc d(bsb $$0) {
      return this.gA() ? awd.kY : awd.kO;
   }

   @Override
   protected awc n_() {
      return this.gA() ? awd.kW : awd.kM;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.le, 0.15F, 1.0F);
   }

   protected awc y() {
      return this.gA() ? awd.la : awd.kQ;
   }

   @Nullable
   public chv b(arg $$0, btc $$1) {
      chv $$2 = btq.X.a($$0, btp.e);
      if ($$2 != null) {
         chw.a($$2, $$0.C_());
         btc $$3 = (btc)($$0.C_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof chv $$4 && $$4.gA() || $$0.C_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bvg<chv> dX() {
      return (bvg<chv>)super.dX();
   }

   @Override
   protected void ad() {
      this.dS().ah().a("goatBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("goatActivityUpdate");
      chw.a(this);
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
      float $$2 = azc.c(this.aU, $$0);
      float $$3 = azc.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aU + $$3);
   }

   @Override
   protected void gu() {
      this.dS().a(null, this, this.gA() ? awd.kX : awd.kN, awe.g, 1.0F, azc.b(this.dS().z, 0.8F, 1.2F));
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ab);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.qz) && !this.o_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cvl $$3 = cvn.a($$2, $$0, cvo.qF.w());
         $$0.a($$1, $$3);
         return brk.a;
      } else {
         brk $$4 = super.b($$0, $$1);
         if ($$4.a() && this.p($$2)) {
            this.gu();
         }

         return $$4;
      }
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      chw.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         akg<Boolean> $$5 = $$4.h() ? cj : ck;
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
   public btm e(bur $$0) {
      return $$0 == bur.g ? bZ.a(this.ee()) : super.e($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.go());
      $$0.a("HasRightHorn", this.gp());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.am.a(cj, $$0.q("HasLeftHorn"));
      this.am.a(ck, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cl = true;
      } else if ($$0 == 59) {
         this.cl = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.cl) {
         this.cm++;
      } else {
         this.cm -= 2;
      }

      this.cm = azc.a(this.cm, 0, 20);
      super.m_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ci, false);
      $$0.a(cj, true);
      $$0.a(ck, true);
   }

   public boolean go() {
      return this.am.a(cj);
   }

   public boolean gp() {
      return this.am.a(ck);
   }

   public boolean gq() {
      boolean $$0 = this.go();
      boolean $$1 = this.gp();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akg<Boolean> $$2;
         if (!$$0) {
            $$2 = ck;
         } else if (!$$1) {
            $$2 = cj;
         } else {
            $$2 = this.af.h() ? cj : ck;
         }

         this.am.a($$2, false);
         eye $$5 = this.dq();
         cvl $$6 = this.q();
         double $$7 = (double)azc.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azc.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azc.b(this.af, -0.2F, 0.2F);
         cjz $$10 = new cjz(this.dS(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dS().b($$10);
         return true;
      }
   }

   public void gr() {
      this.am.a(cj, true);
      this.am.a(ck, true);
   }

   public void gs() {
      this.am.a(cj, false);
      this.am.a(ck, false);
   }

   public boolean gA() {
      return this.am.a(ci);
   }

   public void x(boolean $$0) {
      this.am.a(ci, $$0);
   }

   public float gB() {
      return (float)this.cm / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(btq<? extends cfv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.ca) && a($$1, $$3);
   }
}
