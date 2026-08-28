import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cmf extends cme implements cki, cna {
   private static final akg<Boolean> ca = akk.a(cmf.class, aki.k);
   private static final akg<Boolean> cb = akk.a(cmf.class, aki.k);
   private static final akg<Boolean> cc = akk.a(cmf.class, aki.k);
   private static final alb cd = alb.b("baby");
   private static final bvk ce = new bvk(cd, 0.2F, bvk.a.b);
   private static final int cf = 16;
   private static final float cg = 0.35F;
   private static final int ch = 5;
   private static final float ci = 0.1F;
   private static final int cj = 3;
   private static final float ck = 0.2F;
   private static final btm cl = btq.aA.n().a(0.5F).b(0.97F);
   private static final double cm = 0.5;
   private final brr cn = new brr(8);
   private boolean co;
   protected static final ImmutableList<cep<? extends ceo<? super cmf>>> e = ImmutableList.of(cep.c, cep.d, cep.b, cep.f, cep.l);
   protected static final ImmutableList<cdi<?>> bZ = ImmutableList.of(
      cdi.n,
      cdi.v,
      cdi.g,
      cdi.h,
      cdi.k,
      cdi.l,
      cdi.ao,
      cdi.an,
      cdi.L,
      cdi.aP,
      cdi.x,
      cdi.y,
      new cdi[]{
         cdi.m,
         cdi.E,
         cdi.o,
         cdi.p,
         cdi.q,
         cdi.t,
         cdi.ab,
         cdi.ac,
         cdi.z,
         cdi.ad,
         cdi.ae,
         cdi.ag,
         cdi.af,
         cdi.ai,
         cdi.aj,
         cdi.ah,
         cdi.al,
         cdi.M,
         cdi.ar,
         cdi.s,
         cdi.as,
         cdi.at,
         cdi.ak,
         cdi.am,
         cdi.au,
         cdi.av,
         cdi.aw
      }
   );

   public cmf(btq<? extends cme> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.co) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dU());
   }

   @bai
   @Override
   public brr y() {
      return this.cn;
   }

   @Override
   protected void a(arg $$0, bsb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckh $$4 && $$4.gq()) {
         cvl $$5 = new cvl(cvo.ut);
         $$4.gr();
         this.b($$5);
      }

      this.cn.f().forEach(this::b);
   }

   protected cvl o(cvl $$0) {
      return this.cn.b($$0);
   }

   protected boolean p(cvl $$0) {
      return this.cn.c($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (ca.equals($$0)) {
         this.i_();
      }
   }

   public static bvl.a gv() {
      return ckv.gu().a(bvm.s, 16.0).a(bvm.v, 0.35F).a(bvm.c, 5.0);
   }

   public static boolean b(btq<cmf> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return !$$1.a_($$3.e()).a(dgx.kK);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      if ($$2 != btp.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gp()) {
            this.a(btr.a, this.gx());
         }
      }

      cmg.a(this, $$0.C_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean ab() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fX();
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      if (this.gp()) {
         this.a(btr.f, new cvl(cvo.pP), $$0);
         this.a(btr.e, new cvl(cvo.pQ), $$0);
         this.a(btr.d, new cvl(cvo.pR), $$0);
         this.a(btr.c, new cvl(cvo.pS), $$0);
      }
   }

   private void a(btr $$0, cvl $$1, azk $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bvg.b<cmf> dY() {
      return bvg.a(bZ, e);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cmg.a(this, this.dY().a($$0));
   }

   @Override
   public bvg<cmf> dX() {
      return (bvg<cmf>)super.dX();
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      brk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dS().B) {
         return cmg.a(this, $$0, $$1);
      } else {
         boolean $$3 = cmg.b(this, $$0.b($$1)) && this.gq() != cmh.d;
         return (brk)($$3 ? brk.a : brk.e);
      }
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? cl : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(ca, $$0);
      if (!this.dS().B) {
         bvi $$1 = this.g(bvm.v);
         $$1.c(ce.b());
         if ($$0) {
            $$1.b(ce);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.at().a(ca);
   }

   private void z(boolean $$0) {
      this.co = $$0;
   }

   @Override
   protected boolean q() {
      return !this.co;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("piglinBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      cmg.a(this);
      super.ad();
   }

   @Override
   protected int ek() {
      return this.bO;
   }

   @Override
   protected void a(arg $$0) {
      cmg.b(this);
      this.cn.f().forEach(this::b);
      super.a($$0);
   }

   private cvl gx() {
      return (double)this.af.i() < 0.5 ? new cvl(cvo.vX) : new cvl(cvo.oX);
   }

   private boolean gy() {
      return this.am.a(cb);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public cmh gq() {
      if (this.gw()) {
         return cmh.e;
      } else if (cmg.a(this.eX())) {
         return cmh.d;
      } else if (this.gf() && this.gr()) {
         return cmh.a;
      } else if (this.gy()) {
         return cmh.c;
      } else {
         return this.b(cvo.vX) && cty.h(this.dW()) ? cmh.b : cmh.f;
      }
   }

   public boolean gw() {
      return this.am.a(cc);
   }

   public void y(boolean $$0) {
      this.am.a(cc, $$0);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buf) {
            cmg.a(this, (buf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(buf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cwi $$0) {
      return $$0 == cvo.vX;
   }

   protected void q(cvl $$0) {
      this.b(btr.a, $$0);
   }

   protected void r(cvl $$0) {
      if ($$0.a(cmg.c)) {
         this.a(btr.b, $$0);
         this.f(btr.b);
      } else {
         this.b(btr.b, $$0);
      }
   }

   @Override
   public boolean l(cvl $$0) {
      return this.dS().ac().b(ddo.c) && this.fW() && cmg.a(this, $$0);
   }

   protected boolean s(cvl $$0) {
      btr $$1 = this.i($$0);
      cvl $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cvl $$0, cvl $$1) {
      if (day.a($$1, dax.E)) {
         return false;
      } else {
         boolean $$2 = cmg.a($$0) || $$0.a(cvo.vX);
         boolean $$3 = cmg.a($$1) || $$1.a(cvo.vX);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gp() && !$$0.a(cvo.vX) && $$1.a(cvo.vX) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cjz $$0) {
      this.a($$0);
      cmg.a(this, $$0);
   }

   @Override
   public boolean a(btj $$0, boolean $$1) {
      if (this.o_() && $$0.ao() == btq.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private btj b(btj $$0, int $$1) {
      List<btj> $$2 = $$0.cW();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awc w() {
      return this.dS().B ? null : cmg.c(this).orElse(null);
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.tM;
   }

   @Override
   protected awc n_() {
      return awd.tK;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.tO, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(awd.tP);
   }
}
