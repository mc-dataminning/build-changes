import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class chk extends chj implements cfn, cif {
   private static final aim<Boolean> bY = aiq.a(chk.class, aio.k);
   private static final aim<Boolean> bZ = aiq.a(chk.class, aio.k);
   private static final aim<Boolean> ca = aiq.a(chk.class, aio.k);
   private static final UUID cb = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bqu cc = new bqu(cb, "Baby speed boost", 0.2F, bqu.a.b);
   private static final int cd = 16;
   private static final float ce = 0.35F;
   private static final int cf = 5;
   private static final float cg = 1.6F;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bpa ck = bpd.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bnm cm = new bnm(8);
   private boolean cn;
   protected static final ImmutableList<bzz<? extends bzy<? super chk>>> e = ImmutableList.of(bzz.c, bzz.d, bzz.b, bzz.f, bzz.l);
   protected static final ImmutableList<bys<?>> bX = ImmutableList.of(
      bys.n,
      bys.v,
      bys.g,
      bys.h,
      bys.k,
      bys.l,
      bys.ao,
      bys.an,
      bys.L,
      bys.aP,
      bys.x,
      bys.y,
      new bys[]{
         bys.m,
         bys.E,
         bys.o,
         bys.p,
         bys.q,
         bys.t,
         bys.ab,
         bys.ac,
         bys.z,
         bys.ad,
         bys.ae,
         bys.ag,
         bys.af,
         bys.ai,
         bys.aj,
         bys.ah,
         bys.al,
         bys.M,
         bys.ar,
         bys.s,
         bys.as,
         bys.at,
         bys.ak,
         bys.am,
         bys.au,
         bys.av,
         bys.aw
      }
   );

   public chk(bpd<? extends chj> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.a_($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.c($$0);
   }

   @axz
   @Override
   public bnm y() {
      return this.cm;
   }

   @Override
   protected void a(bnw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfm $$4 && $$4.go()) {
         cqm $$5 = new cqm(cqp.up);
         $$4.gp();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cqm n(cqm $$0) {
      return this.cm.a($$0);
   }

   protected boolean o(cqm $$0) {
      return this.cm.b($$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, false);
      $$0.a(ca, false);
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (bY.equals($$0)) {
         this.j_();
      }
   }

   public static bqv.a gu() {
      return cga.gt().a(bqw.q, 16.0).a(bqw.r, 0.35F).a(bqw.c, 5.0);
   }

   public static boolean b(bpd<chk> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return !$$1.a_($$3.d()).a(dae.kK);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      if ($$2 != bpt.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bpe.a, this.gw());
         }
      }

      chl.a(this, $$0.E_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean W() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fU();
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      if (this.go()) {
         this.a(bpe.f, new cqm(cqp.pN), $$0);
         this.a(bpe.e, new cqm(cqp.pO), $$0);
         this.a(bpe.d, new cqm(cqp.pP), $$0);
         this.a(bpe.c, new cqm(cqp.pQ), $$0);
      }
   }

   private void a(bpe $$0, cqm $$1, axd $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bqq.b<chk> dQ() {
      return bqq.a(bX, e);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return chl.a(this, this.dQ().a($$0));
   }

   @Override
   public bqq<chk> dP() {
      return (bqq<chk>)super.dP();
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      bnd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return chl.a(this, $$0, $$1);
      } else {
         boolean $$3 = chl.b(this, $$0.b($$1)) && this.gp() != chm.d;
         return $$3 ? bnd.a : bnd.d;
      }
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bY, $$0);
      if (!this.dM().B) {
         bqs $$1 = this.f(bqw.r);
         $$1.b(cc.a());
         if ($$0) {
            $$1.c(cc);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.an().a(bY);
   }

   private void y(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean r() {
      return !this.cn;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("piglinBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      chl.a(this);
      super.Y();
   }

   @Override
   public int eg() {
      return this.bM;
   }

   @Override
   protected void c(apf $$0) {
      chl.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cqm gw() {
      return (double)this.ag.i() < 0.5 ? new cqm(cqp.vR) : new cqm(cqp.oU);
   }

   private boolean gx() {
      return this.an.a(bZ);
   }

   @Override
   public void b(boolean $$0) {
      this.an.a(bZ, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public chm gp() {
      if (this.gv()) {
         return chm.e;
      } else if (chl.a(this.eV())) {
         return chm.d;
      } else if (this.gf() && this.gq()) {
         return chm.a;
      } else if (this.gx()) {
         return chm.c;
      } else {
         return this.gf() && this.b(cqp.vR) ? chm.b : chm.f;
      }
   }

   public boolean gv() {
      return this.an.a(ca);
   }

   public void x(boolean $$0) {
      this.an.a(ca, $$0);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpp) {
            chl.a(this, (bpp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bpp $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bpp $$0, cqm $$1, cjm $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(crc $$0) {
      return $$0 == cqp.vR;
   }

   protected void p(cqm $$0) {
      this.b(bpe.a, $$0);
   }

   protected void q(cqm $$0) {
      if ($$0.a(chl.c)) {
         this.a(bpe.b, $$0);
         this.f(bpe.b);
      } else {
         this.b(bpe.b, $$0);
      }
   }

   @Override
   public boolean k(cqm $$0) {
      return this.dM().Z().b(cwx.c) && this.fT() && chl.a(this, $$0);
   }

   protected boolean r(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      cqm $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cqm $$0, cqm $$1) {
      if (cux.d($$1)) {
         return false;
      } else {
         boolean $$2 = chl.a($$0) || $$0.a(cqp.vR);
         boolean $$3 = chl.a($$1) || $$1.a(cqp.vR);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(cqp.vR) && $$1.a(cqp.vR) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cfe $$0) {
      this.a($$0);
      chl.a(this, $$0);
   }

   @Override
   public boolean a(box $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bpd.aa) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private box b(box $$0, int $$1) {
      List<box> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected atx v() {
      return this.dM().B ? null : chl.c(this).orElse(null);
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.tm;
   }

   @Override
   protected atx n_() {
      return aty.tk;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.to, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(aty.tp);
   }
}
