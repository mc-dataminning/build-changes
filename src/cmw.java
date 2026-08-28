import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cmw extends cmv implements ckz, cnr {
   private static final akk<Boolean> bZ = ako.a(cmw.class, akm.k);
   private static final akk<Boolean> ca = ako.a(cmw.class, akm.k);
   private static final akk<Boolean> cb = ako.a(cmw.class, akm.k);
   private static final alh cc = alh.b("baby");
   private static final bwb cd = new bwb(cc, 0.2F, bwb.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final buc ck = bug.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsf cm = new bsf(8);
   private boolean cn;
   protected static final ImmutableList<cfg<? extends cff<? super cmw>>> e = ImmutableList.of(cfg.c, cfg.d, cfg.b, cfg.f, cfg.l);
   protected static final ImmutableList<cdz<?>> bY = ImmutableList.of(
      cdz.n,
      cdz.v,
      cdz.g,
      cdz.h,
      cdz.k,
      cdz.l,
      cdz.ao,
      cdz.an,
      cdz.L,
      cdz.aP,
      cdz.x,
      cdz.y,
      new cdz[]{
         cdz.m,
         cdz.E,
         cdz.o,
         cdz.p,
         cdz.q,
         cdz.t,
         cdz.ab,
         cdz.ac,
         cdz.z,
         cdz.ad,
         cdz.ae,
         cdz.ag,
         cdz.af,
         cdz.ai,
         cdz.aj,
         cdz.ah,
         cdz.al,
         cdz.M,
         cdz.ar,
         cdz.s,
         cdz.as,
         cdz.at,
         cdz.ak,
         cdz.am,
         cdz.au,
         cdz.av,
         cdz.aw
      }
   );

   public cmw(bug<? extends cmv> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dZ());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dZ());
   }

   @bap
   @Override
   public bsf y() {
      return this.cm;
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cky $$4 && $$4.gx()) {
         cvx $$5 = new cvx(cwb.ut);
         $$4.gy();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cvx k(cvx $$0) {
      return this.cm.b($$0);
   }

   protected boolean l(cvx $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bwc.a gC() {
      return clm.gB().a(bwd.s, 16.0).a(bwd.v, 0.35F).a(bwd.c, 5.0);
   }

   public static boolean b(bug<cmw> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return !$$1.a_($$3.e()).a(dia.kK);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      if ($$2 != buf.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gw()) {
            this.a(buh.a, this.gE());
         }
      }

      cmx.a(this, $$0.E_());
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
      return !this.gc();
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      if (this.gw()) {
         this.a(buh.f, new cvx(cwb.pP), $$0);
         this.a(buh.e, new cvx(cwb.pQ), $$0);
         this.a(buh.d, new cvx(cwb.pR), $$0);
         this.a(buh.c, new cvx(cwb.pS), $$0);
      }
   }

   private void a(buh $$0, cvx $$1, azr $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bvx.b<cmw> ee() {
      return bvx.a(bY, e);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cmx.a(this, this.ee().a($$0));
   }

   @Override
   public bvx<cmw> ed() {
      return (bvx<cmw>)super.ed();
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      bry $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dX().C) {
         return cmx.a(this, $$0, $$1);
      } else {
         boolean $$3 = cmx.b(this, $$0.b($$1)) && this.gx() != cmy.d;
         return (bry)($$3 ? bry.a : bry.e);
      }
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.av().a(bZ, $$0);
      if (!this.dX().C) {
         bvz $$1 = this.g(bwd.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.av().a(bZ);
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
      this.dX().ah().a("piglinBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      cmx.a(this);
      super.ac();
   }

   @Override
   protected int eq() {
      return this.bN;
   }

   @Override
   protected void a(arm $$0) {
      cmx.b(this);
      this.cm.f().forEach(this::b);
      super.a($$0);
   }

   private cvx gE() {
      return (double)this.af.i() < 0.5 ? new cvx(cwb.vX) : new cvx(cwb.oX);
   }

   private boolean gF() {
      return this.am.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public cmy gx() {
      if (this.gD()) {
         return cmy.e;
      } else if (cmx.a(this.fc())) {
         return cmy.d;
      } else if (this.gk() && this.gy()) {
         return cmy.a;
      } else if (this.gF()) {
         return cmy.c;
      } else {
         return this.b(cwb.vX) && cuo.g(this.eb()) ? cmy.b : cmy.f;
      }
   }

   public boolean gD() {
      return this.am.a(cb);
   }

   public void y(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buv) {
            cmx.a(this, (buv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(buv $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cwt $$0) {
      return $$0 == cwb.vX;
   }

   protected void m(cvx $$0) {
      this.b(buh.a, $$0);
   }

   protected void n(cvx $$0) {
      if ($$0.a(cmx.c)) {
         this.a(buh.b, $$0);
         this.g(buh.b);
      } else {
         this.b(buh.b, $$0);
      }
   }

   @Override
   public boolean i(cvx $$0) {
      return this.dX().ac().b(der.c) && this.fP() && cmx.a(this, $$0);
   }

   protected boolean o(cvx $$0) {
      buh $$1 = this.f($$0);
      cvx $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cvx $$0, cvx $$1, buh $$2) {
      if (dbo.a($$1, dbn.E)) {
         return false;
      } else {
         boolean $$3 = cmx.a($$0) || $$0.a(cwb.vX);
         boolean $$4 = cmx.a($$1) || $$1.a(cwb.vX);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gw() && !$$0.a(cwb.vX) && $$1.a(cwb.vX) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ckq $$0) {
      this.a($$0);
      cmx.a(this, $$0);
   }

   @Override
   public boolean a(btz $$0, boolean $$1) {
      if (this.p_() && $$0.aq() == bug.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private btz b(btz $$0, int $$1) {
      List<btz> $$2 = $$0.da();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awj w() {
      return this.dX().C ? null : cmx.c(this).orElse(null);
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.tK;
   }

   @Override
   protected awj o_() {
      return awk.tI;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.tM, 0.15F, 1.0F);
   }

   @Override
   protected void gz() {
      this.b(awk.tN);
   }
}
