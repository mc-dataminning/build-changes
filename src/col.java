import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class col extends cok implements cmk, cph {
   private static final alc<Boolean> ca = alg.a(col.class, ale.k);
   private static final alc<Boolean> cb = alg.a(col.class, ale.k);
   private static final alc<Boolean> cc = alg.a(col.class, ale.k);
   private static final alz cd = alz.b("baby");
   private static final bxm ce = new bxm(cd, 0.2F, bxm.a.b);
   private static final int cf = 16;
   private static final float cg = 0.35F;
   private static final int ch = 5;
   private static final float ci = 0.1F;
   private static final int cj = 3;
   private static final float ck = 0.2F;
   private static final bvn cl = bvr.aS.n().a(0.5F).b(0.97F);
   private static final double cm = 0.5;
   private final btq cn = new btq(8);
   private boolean co;
   protected static final ImmutableList<cgr<? extends cgq<? super col>>> d = ImmutableList.of(cgr.c, cgr.d, cgr.b, cgr.f, cgr.l);
   protected static final ImmutableList<cfk<?>> bZ = ImmutableList.of(
      cfk.n,
      cfk.v,
      cfk.g,
      cfk.h,
      cfk.k,
      cfk.l,
      cfk.ao,
      cfk.an,
      cfk.L,
      cfk.aP,
      cfk.x,
      cfk.y,
      new cfk[]{
         cfk.m,
         cfk.E,
         cfk.o,
         cfk.p,
         cfk.q,
         cfk.t,
         cfk.ab,
         cfk.ac,
         cfk.z,
         cfk.ad,
         cfk.ae,
         cfk.ag,
         cfk.af,
         cfk.ai,
         cfk.aj,
         cfk.ah,
         cfk.al,
         cfk.M,
         cfk.ar,
         cfk.s,
         cfk.as,
         cfk.at,
         cfk.ak,
         cfk.am,
         cfk.au,
         cfk.av,
         cfk.aw
      }
   );

   public col(bvr<? extends cok> $$0, dhi $$1) {
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

      this.b($$0, this.dY());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dY());
   }

   @bbl
   @Override
   public btq t() {
      return this.cn;
   }

   @Override
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmj $$4 && $$4.gp()) {
         cxp $$5 = new cxp(cxt.vh);
         $$4.gq();
         this.a($$0, $$5);
      }

      this.cn.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxp i(cxp $$0) {
      return this.cn.b($$0);
   }

   protected boolean j(cxp $$0) {
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

   public static bxn.a gu() {
      return cmx.gt().a(bxo.s, 16.0).a(bxo.v, 0.35F).a(bxo.c, 5.0);
   }

   public static boolean b(bvr<col> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dko.lf);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      if ($$2 != bvq.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bvs.a, this.gw());
         }
      }

      com.a(this, $$0.H_());
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
   protected void a(bam $$0, bth $$1) {
      if (this.go()) {
         this.a(bvs.f, new cxp(cxt.qk), $$0);
         this.a(bvs.e, new cxp(cxt.ql), $$0);
         this.a(bvs.d, new cxp(cxt.qm), $$0);
         this.a(bvs.c, new cxp(cxt.qn), $$0);
      }
   }

   private void a(bvs $$0, cxp $$1, bam $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxi.b<col> ed() {
      return bxi.a(bZ, d);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return com.a(this, this.ed().a($$0));
   }

   @Override
   public bxi<col> ec() {
      return (bxi<col>)super.ec();
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      btj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dW() instanceof ash $$3) {
         return com.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = com.b(this, $$0.b($$1)) && this.gp() != coo.d;
         return (btj)($$4 ? btj.a : btj.e);
      }
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? cl : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ca, $$0);
      if (!this.dW().C) {
         bxk $$1 = this.g(bxo.v);
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
      bpt $$1 = bps.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      com.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ash $$0) {
      return this.bO;
   }

   @Override
   protected void g(ash $$0) {
      com.a($$0, this);
      this.cn.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxp gw() {
      return (double)this.ae.i() < 0.5 ? new cxp(cxt.wL) : new cxp(cxt.ps);
   }

   private boolean gx() {
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
   public coo gp() {
      if (this.gv()) {
         return coo.e;
      } else if (com.a(this.fa())) {
         return coo.d;
      } else if (this.gd() && this.gq()) {
         return coo.a;
      } else if (this.gx()) {
         return coo.c;
      } else {
         return this.b(cxt.wL) && cwg.g(this.ea()) ? coo.b : coo.f;
      }
   }

   public boolean gv() {
      return this.al.a(cc);
   }

   public void y(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwg $$4) {
         com.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bwg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyl $$0) {
      return $$0 == cxt.wL;
   }

   protected void k(cxp $$0) {
      this.b(bvs.a, $$0);
   }

   protected void l(cxp $$0) {
      if ($$0.a(com.c)) {
         this.a(bvs.b, $$0);
         this.g(bvs.b);
      } else {
         this.b(bvs.b, $$0);
      }
   }

   @Override
   public boolean c(ash $$0, cxp $$1) {
      return $$0.N().b(dhe.c) && this.fN() && com.a(this, $$1);
   }

   protected boolean m(cxp $$0) {
      bvs $$1 = this.f($$0);
      cxp $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxp $$0, cxp $$1, bvs $$2) {
      if (deb.a($$1, dea.E)) {
         return false;
      } else {
         boolean $$3 = com.a($$0) || $$0.a(cxt.wL);
         boolean $$4 = com.a($$1) || $$1.a(cxt.wL);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.go() && !$$0.a(cxt.wL) && $$1.a(cxt.wL) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ash $$0, cmb $$1) {
      this.a($$1);
      com.a($$0, this, $$1);
   }

   @Override
   public boolean a(bvk $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bvr.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bvk b(bvk $$0, int $$1) {
      List<bvk> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected axe u() {
      return this.dW().C ? null : com.b(this).orElse(null);
   }

   @Override
   protected axe e(bua $$0) {
      return axf.uf;
   }

   @Override
   protected axe o_() {
      return axf.ud;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.uh, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(axf.ui);
   }
}
