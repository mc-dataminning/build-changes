import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cok extends coj implements cmj, cpg {
   private static final alc<Boolean> ca = alg.a(cok.class, ale.k);
   private static final alc<Boolean> cb = alg.a(cok.class, ale.k);
   private static final alc<Boolean> cc = alg.a(cok.class, ale.k);
   private static final alz cd = alz.b("baby");
   private static final bxl ce = new bxl(cd, 0.2F, bxl.a.b);
   private static final int cf = 16;
   private static final float cg = 0.35F;
   private static final int ch = 5;
   private static final float ci = 0.1F;
   private static final int cj = 3;
   private static final float ck = 0.2F;
   private static final bvm cl = bvq.aS.n().a(0.5F).b(0.97F);
   private static final double cm = 0.5;
   private final btp cn = new btp(8);
   private boolean co;
   protected static final ImmutableList<cgq<? extends cgp<? super cok>>> d = ImmutableList.of(cgq.c, cgq.d, cgq.b, cgq.f, cgq.l);
   protected static final ImmutableList<cfj<?>> bZ = ImmutableList.of(
      cfj.n,
      cfj.v,
      cfj.g,
      cfj.h,
      cfj.k,
      cfj.l,
      cfj.ao,
      cfj.an,
      cfj.L,
      cfj.aP,
      cfj.x,
      cfj.y,
      new cfj[]{
         cfj.m,
         cfj.E,
         cfj.o,
         cfj.p,
         cfj.q,
         cfj.t,
         cfj.ab,
         cfj.ac,
         cfj.z,
         cfj.ad,
         cfj.ae,
         cfj.ag,
         cfj.af,
         cfj.ai,
         cfj.aj,
         cfj.ah,
         cfj.al,
         cfj.M,
         cfj.ar,
         cfj.s,
         cfj.as,
         cfj.at,
         cfj.ak,
         cfj.am,
         cfj.au,
         cfj.av,
         cfj.aw
      }
   );

   public cok(bvq<? extends coj> $$0, dhh $$1) {
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
   public btp t() {
      return this.cn;
   }

   @Override
   protected void a(ash $$0, btz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmi $$4 && $$4.gn()) {
         cxo $$5 = new cxo(cxs.vh);
         $$4.go();
         this.a($$0, $$5);
      }

      this.cn.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cxo i(cxo $$0) {
      return this.cn.b($$0);
   }

   protected boolean j(cxo $$0) {
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

   public static bxm.a gs() {
      return cmw.gr().a(bxn.s, 16.0).a(bxn.v, 0.35F).a(bxn.c, 5.0);
   }

   public static boolean b(bvq<cok> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return !$$1.a_($$3.e()).a(dkn.lf);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      if ($$2 != bvp.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gm()) {
            this.a(bvr.a, this.gu());
         }
      }

      col.a(this, $$0.H_());
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
   protected void a(bam $$0, btg $$1) {
      if (this.gm()) {
         this.a(bvr.f, new cxo(cxs.qk), $$0);
         this.a(bvr.e, new cxo(cxs.ql), $$0);
         this.a(bvr.d, new cxo(cxs.qm), $$0);
         this.a(bvr.c, new cxo(cxs.qn), $$0);
      }
   }

   private void a(bvr $$0, cxo $$1, bam $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bxh.b<cok> ec() {
      return bxh.a(bZ, d);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return col.a(this, this.ec().a($$0));
   }

   @Override
   public bxh<cok> eb() {
      return (bxh<cok>)super.eb();
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      bti $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ash $$3) {
         return col.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = col.b(this, $$0.b($$1)) && this.gn() != com.d;
         return (bti)($$4 ? bti.a : bti.e);
      }
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? cl : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ca, $$0);
      if (!this.dV().C) {
         bxj $$1 = this.g(bxn.v);
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
      bps $$1 = bpr.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      col.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ash $$0) {
      return this.bO;
   }

   @Override
   protected void g(ash $$0) {
      col.a($$0, this);
      this.cn.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cxo gu() {
      return (double)this.ae.i() < 0.5 ? new cxo(cxs.wL) : new cxo(cxs.ps);
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
   public com gn() {
      if (this.gt()) {
         return com.e;
      } else if (col.a(this.eY())) {
         return com.d;
      } else if (this.gb() && this.go()) {
         return com.a;
      } else if (this.gv()) {
         return com.c;
      } else {
         return this.b(cxs.wL) && cwf.g(this.dZ()) ? com.b : com.f;
      }
   }

   public boolean gt() {
      return this.al.a(cc);
   }

   public void y(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwf $$4) {
         col.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bwf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cyk $$0) {
      return $$0 == cxs.wL;
   }

   protected void k(cxo $$0) {
      this.b(bvr.a, $$0);
   }

   protected void l(cxo $$0) {
      if ($$0.a(col.c)) {
         this.a(bvr.b, $$0);
         this.g(bvr.b);
      } else {
         this.b(bvr.b, $$0);
      }
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      return $$0.N().b(dhd.c) && this.fL() && col.a(this, $$1);
   }

   protected boolean m(cxo $$0) {
      bvr $$1 = this.f($$0);
      cxo $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cxo $$0, cxo $$1, bvr $$2) {
      if (dea.a($$1, ddz.E)) {
         return false;
      } else {
         boolean $$3 = col.a($$0) || $$0.a(cxs.wL);
         boolean $$4 = col.a($$1) || $$1.a(cxs.wL);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gm() && !$$0.a(cxs.wL) && $$1.a(cxs.wL) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      this.a($$1);
      col.a($$0, this, $$1);
   }

   @Override
   public boolean a(bvj $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bvq.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bvj b(bvj $$0, int $$1) {
      List<bvj> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected axe u() {
      return this.dV().C ? null : col.b(this).orElse(null);
   }

   @Override
   protected axe e(btz $$0) {
      return axf.uf;
   }

   @Override
   protected axe o_() {
      return axf.ud;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.uh, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.b(axf.ui);
   }
}
