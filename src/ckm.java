import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckm extends ckl implements cip, clh {
   private static final ajr<Boolean> bZ = ajv.a(ckm.class, ajt.k);
   private static final ajr<Boolean> ca = ajv.a(ckm.class, ajt.k);
   private static final ajr<Boolean> cb = ajv.a(ckm.class, ajt.k);
   private static final UUID cc = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final btu cd = new btu(cc, "Baby speed boost", 0.2F, btu.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final brx ck = bsa.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bqd cm = new bqd(8);
   private boolean cn;
   protected static final ImmutableList<ccz<? extends ccy<? super ckm>>> e = ImmutableList.of(ccz.c, ccz.d, ccz.b, ccz.f, ccz.l);
   protected static final ImmutableList<cbs<?>> bY = ImmutableList.of(
      cbs.n,
      cbs.v,
      cbs.g,
      cbs.h,
      cbs.k,
      cbs.l,
      cbs.ao,
      cbs.an,
      cbs.L,
      cbs.aP,
      cbs.x,
      cbs.y,
      new cbs[]{
         cbs.m,
         cbs.E,
         cbs.o,
         cbs.p,
         cbs.q,
         cbs.t,
         cbs.ab,
         cbs.ac,
         cbs.z,
         cbs.ad,
         cbs.ae,
         cbs.ag,
         cbs.af,
         cbs.ai,
         cbs.aj,
         cbs.ah,
         cbs.al,
         cbs.M,
         cbs.ar,
         cbs.s,
         cbs.as,
         cbs.at,
         cbs.ak,
         cbs.am,
         cbs.au,
         cbs.av,
         cbs.aw
      }
   );

   public ckm(bsa<? extends ckl> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dR());
   }

   @azg
   @Override
   public bqd y() {
      return this.cm;
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cio $$4 && $$4.gq()) {
         cto $$5 = new cto(ctr.ur);
         $$4.gr();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cto n(cto $$0) {
      return this.cm.b($$0);
   }

   protected boolean o(cto $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajr<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static btv.a gw() {
      return cjc.gv().a(btw.q, 16.0).a(btw.r, 0.35F).a(btw.c, 5.0);
   }

   public static boolean b(bsa<ckm> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return !$$1.a_($$3.d()).a(dea.kK);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      if ($$2 != bss.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gq()) {
            this.a(bsb.a, this.gy());
         }
      }

      ckn.a(this, $$0.E_());
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
      return !this.fV();
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      if (this.gq()) {
         this.a(bsb.f, new cto(ctr.pO), $$0);
         this.a(bsb.e, new cto(ctr.pP), $$0);
         this.a(bsb.d, new cto(ctr.pQ), $$0);
         this.a(bsb.c, new cto(ctr.pR), $$0);
      }
   }

   private void a(bsb $$0, cto $$1, ayk $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected btq.b<ckm> dT() {
      return btq.a(bY, e);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return ckn.a(this, this.dT().a($$0));
   }

   @Override
   public btq<ckm> dS() {
      return (btq<ckm>)super.dS();
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      bpu $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return ckn.a(this, $$0, $$1);
      } else {
         boolean $$3 = ckn.b(this, $$0.b($$1)) && this.gr() != cko.d;
         return $$3 ? bpu.a : bpu.d;
      }
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(bZ, $$0);
      if (!this.dP().B) {
         bts $$1 = this.f(btw.r);
         $$1.b(cd.b());
         if ($$0) {
            $$1.c(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(bZ);
   }

   private void y(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cn;
   }

   @Override
   protected void Y() {
      this.dP().af().a("piglinBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      ckn.a(this);
      super.Y();
   }

   @Override
   public int ej() {
      return this.bN;
   }

   @Override
   protected void c(aqm $$0) {
      ckn.b(this);
      this.cm.f().forEach(this::b);
      super.c($$0);
   }

   private cto gy() {
      return (double)this.ah.i() < 0.5 ? new cto(ctr.vT) : new cto(ctr.oV);
   }

   private boolean gz() {
      return this.ao.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public cko gr() {
      if (this.gx()) {
         return cko.e;
      } else if (ckn.a(this.eY())) {
         return cko.d;
      } else if (this.gh() && this.gs()) {
         return cko.a;
      } else if (this.gz()) {
         return cko.c;
      } else {
         return this.gh() && this.b(ctr.vT) ? cko.b : cko.f;
      }
   }

   public boolean gx() {
      return this.ao.a(cb);
   }

   public void x(boolean $$0) {
      this.ao.a(cb, $$0);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            ckn.a(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cuh $$0) {
      return $$0 == ctr.vT;
   }

   protected void p(cto $$0) {
      this.b(bsb.a, $$0);
   }

   protected void q(cto $$0) {
      if ($$0.a(ckn.c)) {
         this.a(bsb.b, $$0);
         this.f(bsb.b);
      } else {
         this.b(bsb.b, $$0);
      }
   }

   @Override
   public boolean k(cto $$0) {
      return this.dP().aa().b(dat.c) && this.fU() && ckn.a(this, $$0);
   }

   protected boolean r(cto $$0) {
      bsb $$1 = bsq.h($$0);
      cto $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cto $$0, cto $$1) {
      if (cza.f($$1)) {
         return false;
      } else {
         boolean $$2 = ckn.a($$0) || $$0.a(ctr.vT);
         boolean $$3 = ckn.a($$1) || $$1.a(ctr.vT);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gq() && !$$0.a(ctr.vT) && $$1.a(ctr.vT) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cig $$0) {
      this.a($$0);
      ckn.a(this, $$0);
   }

   @Override
   public boolean a(bru $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsa.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bru b(bru $$0, int $$1) {
      List<bru> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avg v() {
      return this.dP().B ? null : ckn.c(this).orElse(null);
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.tI;
   }

   @Override
   protected avg o_() {
      return avh.tG;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.tK, 0.15F, 1.0F);
   }

   @Override
   protected void gt() {
      this.b(avh.tL);
   }
}
