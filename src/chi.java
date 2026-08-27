import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class chi extends chh implements cfl, cid {
   private static final aim<Boolean> bY = aiq.a(chi.class, aio.k);
   private static final aim<Boolean> bZ = aiq.a(chi.class, aio.k);
   private static final aim<Boolean> ca = aiq.a(chi.class, aio.k);
   private static final UUID cb = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bqt cc = new bqt(cb, "Baby speed boost", 0.2F, bqt.a.b);
   private static final int cd = 16;
   private static final float ce = 0.35F;
   private static final int cf = 5;
   private static final float cg = 1.6F;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final boz ck = bpc.az.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bnl cm = new bnl(8);
   private boolean cn;
   protected static final ImmutableList<bzy<? extends bzx<? super chi>>> e = ImmutableList.of(bzy.c, bzy.d, bzy.b, bzy.f, bzy.l);
   protected static final ImmutableList<byr<?>> bX = ImmutableList.of(
      byr.n,
      byr.v,
      byr.g,
      byr.h,
      byr.k,
      byr.l,
      byr.ao,
      byr.an,
      byr.L,
      byr.aP,
      byr.x,
      byr.y,
      new byr[]{
         byr.m,
         byr.E,
         byr.o,
         byr.p,
         byr.q,
         byr.t,
         byr.ab,
         byr.ac,
         byr.z,
         byr.ad,
         byr.ae,
         byr.ag,
         byr.af,
         byr.ai,
         byr.aj,
         byr.ah,
         byr.al,
         byr.M,
         byr.ar,
         byr.s,
         byr.as,
         byr.at,
         byr.ak,
         byr.am,
         byr.au,
         byr.av,
         byr.aw
      }
   );

   public chi(bpc<? extends chh> $$0, cwz $$1) {
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
   public bnl y() {
      return this.cm;
   }

   @Override
   protected void a(bnv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cfk $$4 && $$4.go()) {
         cqk $$5 = new cqk(cqn.uo);
         $$4.gp();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cqk n(cqk $$0) {
      return this.cm.a($$0);
   }

   protected boolean o(cqk $$0) {
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

   public static bqu.a gu() {
      return cfy.gt().a(bqv.q, 16.0).a(bqv.r, 0.35F).a(bqv.c, 5.0);
   }

   public static boolean b(bpc<chi> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return !$$1.a_($$3.d()).a(dac.kK);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      if ($$2 != bps.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bpd.a, this.gw());
         }
      }

      chj.a(this, $$0.E_());
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
   protected void a(axd $$0, bna $$1) {
      if (this.go()) {
         this.a(bpd.f, new cqk(cqn.pN), $$0);
         this.a(bpd.e, new cqk(cqn.pO), $$0);
         this.a(bpd.d, new cqk(cqn.pP), $$0);
         this.a(bpd.c, new cqk(cqn.pQ), $$0);
      }
   }

   private void a(bpd $$0, cqk $$1, axd $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bqp.b<chi> dQ() {
      return bqp.a(bX, e);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return chj.a(this, this.dQ().a($$0));
   }

   @Override
   public bqp<chi> dP() {
      return (bqp<chi>)super.dP();
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      bnc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dM().B) {
         return chj.a(this, $$0, $$1);
      } else {
         boolean $$3 = chj.b(this, $$0.b($$1)) && this.gp() != chk.d;
         return $$3 ? bnc.a : bnc.d;
      }
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(bY, $$0);
      if (!this.dM().B) {
         bqr $$1 = this.f(bqv.r);
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
      chj.a(this);
      super.Y();
   }

   @Override
   public int eg() {
      return this.bM;
   }

   @Override
   protected void c(apf $$0) {
      chj.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cqk gw() {
      return (double)this.ag.i() < 0.5 ? new cqk(cqn.vQ) : new cqk(cqn.oU);
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
   public chk gp() {
      if (this.gv()) {
         return chk.e;
      } else if (chj.a(this.eV())) {
         return chk.d;
      } else if (this.gf() && this.gq()) {
         return chk.a;
      } else if (this.gx()) {
         return chk.c;
      } else {
         return this.gf() && this.b(cqn.vQ) ? chk.b : chk.f;
      }
   }

   public boolean gv() {
      return this.an.a(ca);
   }

   public void x(boolean $$0) {
      this.an.a(ca, $$0);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpo) {
            chj.a(this, (bpo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bpo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bpo $$0, cqk $$1, cjk $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public boolean a(cra $$0) {
      return $$0 == cqn.vQ;
   }

   protected void p(cqk $$0) {
      this.b(bpd.a, $$0);
   }

   protected void q(cqk $$0) {
      if ($$0.a(chj.c)) {
         this.a(bpd.b, $$0);
         this.f(bpd.b);
      } else {
         this.b(bpd.b, $$0);
      }
   }

   @Override
   public boolean k(cqk $$0) {
      return this.dM().Z().b(cwv.c) && this.fT() && chj.a(this, $$0);
   }

   protected boolean r(cqk $$0) {
      bpd $$1 = bpq.h($$0);
      cqk $$2 = this.d($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cqk $$0, cqk $$1) {
      if (cuv.d($$1)) {
         return false;
      } else {
         boolean $$2 = chj.a($$0) || $$0.a(cqn.vQ);
         boolean $$3 = chj.a($$1) || $$1.a(cqn.vQ);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(cqn.vQ) && $$1.a(cqn.vQ) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cfd $$0) {
      this.a($$0);
      chj.a(this, $$0);
   }

   @Override
   public boolean a(bow $$0, boolean $$1) {
      if (this.o_() && $$0.ai() == bpc.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bow b(bow $$0, int $$1) {
      List<bow> $$2 = $$0.cP();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected atx v() {
      return this.dM().B ? null : chj.c(this).orElse(null);
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.th;
   }

   @Override
   protected atx n_() {
      return aty.tf;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.tj, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(aty.tk);
   }
}
