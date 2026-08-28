import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cog extends cof implements cmf, cpc {
   private static final alc<Boolean> ca = alg.a(cog.class, ale.k);
   private static final alc<Boolean> cb = alg.a(cog.class, ale.k);
   private static final alc<Boolean> cc = alg.a(cog.class, ale.k);
   private static final alz cd = alz.b("baby");
   private static final bxh ce = new bxh(cd, 0.2F, bxh.a.b);
   private static final int cf = 16;
   private static final float cg = 0.35F;
   private static final int ch = 5;
   private static final float ci = 0.1F;
   private static final int cj = 3;
   private static final float ck = 0.2F;
   private static final bvi cl = bvm.aS.n().a(0.5F).b(0.97F);
   private static final double cm = 0.5;
   private final btl cn = new btl(8);
   private boolean co;
   protected static final ImmutableList<cgm<? extends cgl<? super cog>>> d = ImmutableList.of(cgm.c, cgm.d, cgm.b, cgm.f, cgm.l);
   protected static final ImmutableList<cff<?>> bZ = ImmutableList.of(
      cff.n,
      cff.v,
      cff.g,
      cff.h,
      cff.k,
      cff.l,
      cff.ao,
      cff.an,
      cff.L,
      cff.aP,
      cff.x,
      cff.y,
      new cff[]{
         cff.m,
         cff.E,
         cff.o,
         cff.p,
         cff.q,
         cff.t,
         cff.ab,
         cff.ac,
         cff.z,
         cff.ad,
         cff.ae,
         cff.ag,
         cff.af,
         cff.ai,
         cff.aj,
         cff.ah,
         cff.al,
         cff.M,
         cff.ar,
         cff.s,
         cff.as,
         cff.at,
         cff.ak,
         cff.am,
         cff.au,
         cff.av,
         cff.aw
      }
   );

   public cog(bvm<? extends cof> $$0, dha $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }

      if (this.co) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bbl
   @Override
   public btl t() {
      return this.cn;
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.gn()) {
         cxk $$5 = new cxk(cxo.vh);
         $$4.go();
         this.a($$0, $$5);
      }

      this.cn.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxk i(cxk $$0) {
      return this.cn.b($$0);
   }

   protected boolean j(cxk $$0) {
      return this.cn.c($$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
      $$0.a(cb, false);
      $$0.a(cc, false);
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (ca.equals($$0)) {
         this.m_();
      }
   }

   public static bxi.a gs() {
      return cms.gr().a(bxj.s, 16.0).a(bxj.v, 0.35F).a(bxj.c, 5.0);
   }

   public static boolean b(bvm<cog> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dkg.lf);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      if ($$2 != bvl.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gm()) {
            this.a(bvn.a, this.gu());
         }
      }

      coh.a(this, $$0.H_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.aj();
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      if (this.gm()) {
         this.a(bvn.f, new cxk(cxo.qk), $$0);
         this.a(bvn.e, new cxk(cxo.ql), $$0);
         this.a(bvn.d, new cxk(cxo.qm), $$0);
         this.a(bvn.c, new cxk(cxo.qn), $$0);
      }
   }

   private void a(bvn $$0, cxk $$1, bam $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxd.b<cog> ec() {
      return bxd.a(bZ, d);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return coh.a(this, this.ec().a($$0));
   }

   @Override
   public bxd<cog> eb() {
      return (bxd<cog>)super.eb();
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      bte $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ash $$3) {
         return coh.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = coh.b(this, $$0.b($$1)) && this.gn() != coi.d;
         return (bte)($$4 ? bte.a : bte.e);
      }
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? cl : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ca, $$0);
      if (!this.dV().C) {
         bxf $$1 = this.g(bxj.v);
         $$1.c(ce.b());
         if ($$0) {
            $$1.b(ce);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(ca);
   }

   private void z(boolean $$0) {
      this.co = $$0;
   }

   @Override
   protected boolean m() {
      return !this.co;
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      coh.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ash $$0) {
      return this.bO;
   }

   @Override
   protected void g(ash $$0) {
      coh.a($$0, this);
      this.cn.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxk gu() {
      return (double)this.ae.i() < 0.5 ? new cxk(cxo.wL) : new cxk(cxo.ps);
   }

   private boolean gv() {
      return this.al.a(cb);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public coi gn() {
      if (this.gt()) {
         return coi.e;
      } else if (coh.a(this.eY())) {
         return coi.d;
      } else if (this.gb() && this.go()) {
         return coi.a;
      } else if (this.gv()) {
         return coi.c;
      } else {
         return this.b(cxo.wL) && cwb.g(this.dZ()) ? coi.b : coi.f;
      }
   }

   public boolean gt() {
      return this.al.a(cc);
   }

   public void y(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwb $$4) {
         coh.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bwb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyg $$0) {
      return $$0 == cxo.wL;
   }

   protected void k(cxk $$0) {
      this.b(bvn.a, $$0);
   }

   protected void l(cxk $$0) {
      if ($$0.a(coh.c)) {
         this.a(bvn.b, $$0);
         this.g(bvn.b);
      } else {
         this.b(bvn.b, $$0);
      }
   }

   @Override
   public boolean c(ash $$0, cxk $$1) {
      return $$0.N().b(dgw.c) && this.fL() && coh.a(this, $$1);
   }

   protected boolean m(cxk $$0) {
      bvn $$1 = this.f($$0);
      cxk $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxk $$0, cxk $$1, bvn $$2) {
      if (ddt.a($$1, dds.E)) {
         return false;
      } else {
         boolean $$3 = coh.a($$0) || $$0.a(cxo.wL);
         boolean $$4 = coh.a($$1) || $$1.a(cxo.wL);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gm() && !$$0.a(cxo.wL) && $$1.a(cxo.wL) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      this.a($$1);
      coh.a($$0, this, $$1);
   }

   @Override
   public boolean a(bvf $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bvm.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bvf b(bvf $$0, int $$1) {
      List<bvf> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected axe u() {
      return this.dV().C ? null : coh.b(this).orElse(null);
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ue;
   }

   @Override
   protected axe o_() {
      return axf.uc;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.ug, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.b(axf.uh);
   }
}
