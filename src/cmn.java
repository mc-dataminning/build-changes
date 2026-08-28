import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cmn extends cmm implements ckq, cni {
   private static final akh<Boolean> bZ = akl.a(cmn.class, akj.k);
   private static final akh<Boolean> ca = akl.a(cmn.class, akj.k);
   private static final akh<Boolean> cb = akl.a(cmn.class, akj.k);
   private static final ale cc = ale.b("baby");
   private static final bvs cd = new bvs(cc, 0.2F, bvs.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final btu ck = bty.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final brz cm = new brz(8);
   private boolean cn;
   protected static final ImmutableList<cex<? extends cew<? super cmn>>> e = ImmutableList.of(cex.c, cex.d, cex.b, cex.f, cex.l);
   protected static final ImmutableList<cdq<?>> bY = ImmutableList.of(
      cdq.n,
      cdq.v,
      cdq.g,
      cdq.h,
      cdq.k,
      cdq.l,
      cdq.ao,
      cdq.an,
      cdq.L,
      cdq.aP,
      cdq.x,
      cdq.y,
      new cdq[]{
         cdq.m,
         cdq.E,
         cdq.o,
         cdq.p,
         cdq.q,
         cdq.t,
         cdq.ab,
         cdq.ac,
         cdq.z,
         cdq.ad,
         cdq.ae,
         cdq.ag,
         cdq.af,
         cdq.ai,
         cdq.aj,
         cdq.ah,
         cdq.al,
         cdq.M,
         cdq.ar,
         cdq.s,
         cdq.as,
         cdq.at,
         cdq.ak,
         cdq.am,
         cdq.au,
         cdq.av,
         cdq.aw
      }
   );

   public cmn(bty<? extends cmm> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dU());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dU());
   }

   @bal
   @Override
   public brz y() {
      return this.cm;
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckp $$4 && $$4.gq()) {
         cvs $$5 = new cvs(cvw.ut);
         $$4.gr();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cvs m(cvs $$0) {
      return this.cm.b($$0);
   }

   protected boolean n(cvs $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bvt.a gv() {
      return cld.gu().a(bvu.s, 16.0).a(bvu.v, 0.35F).a(bvu.c, 5.0);
   }

   public static boolean b(bty<cmn> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return !$$1.a_($$3.e()).a(dho.kK);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      if ($$2 != btx.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gp()) {
            this.a(btz.a, this.gx());
         }
      }

      cmo.a(this, $$0.D_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean aa() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fX();
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      if (this.gp()) {
         this.a(btz.f, new cvs(cvw.pP), $$0);
         this.a(btz.e, new cvs(cvw.pQ), $$0);
         this.a(btz.d, new cvs(cvw.pR), $$0);
         this.a(btz.c, new cvs(cvw.pS), $$0);
      }
   }

   private void a(btz $$0, cvs $$1, azn $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bvo.b<cmn> dZ() {
      return bvo.a(bY, e);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cmo.a(this, this.dZ().a($$0));
   }

   @Override
   public bvo<cmn> dY() {
      return (bvo<cmn>)super.dY();
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      brs $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dS().B) {
         return cmo.a(this, $$0, $$1);
      } else {
         boolean $$3 = cmo.b(this, $$0.b($$1)) && this.gq() != cmp.d;
         return (brs)($$3 ? brs.a : brs.e);
      }
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(bZ, $$0);
      if (!this.dS().B) {
         bvq $$1 = this.g(bvu.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.at().a(bZ);
   }

   private void z(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean q() {
      return !this.cn;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("piglinBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      cmo.a(this);
      super.ac();
   }

   @Override
   protected int el() {
      return this.bN;
   }

   @Override
   protected void a(arj $$0) {
      cmo.b(this);
      this.cm.f().forEach(this::b);
      super.a($$0);
   }

   private cvs gx() {
      return (double)this.af.i() < 0.5 ? new cvs(cvw.vX) : new cvs(cvw.oX);
   }

   private boolean gy() {
      return this.am.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public cmp gq() {
      if (this.gw()) {
         return cmp.e;
      } else if (cmo.a(this.eX())) {
         return cmp.d;
      } else if (this.gf() && this.gr()) {
         return cmp.a;
      } else if (this.gy()) {
         return cmp.c;
      } else {
         return this.b(cvw.vX) && cug.g(this.dW()) ? cmp.b : cmp.f;
      }
   }

   public boolean gw() {
      return this.am.a(cb);
   }

   public void y(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bun) {
            cmo.a(this, (bun)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bun $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cwo $$0) {
      return $$0 == cvw.vX;
   }

   protected void o(cvs $$0) {
      this.b(btz.a, $$0);
   }

   protected void p(cvs $$0) {
      if ($$0.a(cmo.c)) {
         this.a(btz.b, $$0);
         this.f(btz.b);
      } else {
         this.b(btz.b, $$0);
      }
   }

   @Override
   public boolean j(cvs $$0) {
      return this.dS().ac().b(def.c) && this.fJ() && cmo.a(this, $$0);
   }

   protected boolean q(cvs $$0) {
      btz $$1 = this.g($$0);
      cvs $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cvs $$0, cvs $$1) {
      if (dbp.a($$1, dbo.E)) {
         return false;
      } else {
         boolean $$2 = cmo.a($$0) || $$0.a(cvw.vX);
         boolean $$3 = cmo.a($$1) || $$1.a(cvw.vX);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gp() && !$$0.a(cvw.vX) && $$1.a(cvw.vX) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(ckh $$0) {
      this.a($$0);
      cmo.a(this, $$0);
   }

   @Override
   public boolean a(btr $$0, boolean $$1) {
      if (this.p_() && $$0.ao() == bty.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private btr b(btr $$0, int $$1) {
      List<btr> $$2 = $$0.cW();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awf w() {
      return this.dS().B ? null : cmo.c(this).orElse(null);
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.tM;
   }

   @Override
   protected awf o_() {
      return awg.tK;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.tO, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(awg.tP);
   }
}
