import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnf extends cne implements cli, coa {
   private static final ako<Boolean> bZ = aks.a(cnf.class, akq.k);
   private static final ako<Boolean> ca = aks.a(cnf.class, akq.k);
   private static final ako<Boolean> cb = aks.a(cnf.class, akq.k);
   private static final all cc = all.b("baby");
   private static final bwk cd = new bwk(cc, 0.2F, bwk.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bul ck = bup.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bso cm = new bso(8);
   private boolean cn;
   protected static final ImmutableList<cfp<? extends cfo<? super cnf>>> e = ImmutableList.of(cfp.c, cfp.d, cfp.b, cfp.f, cfp.l);
   protected static final ImmutableList<cei<?>> bY = ImmutableList.of(
      cei.n,
      cei.v,
      cei.g,
      cei.h,
      cei.k,
      cei.l,
      cei.ao,
      cei.an,
      cei.L,
      cei.aP,
      cei.x,
      cei.y,
      new cei[]{
         cei.m,
         cei.E,
         cei.o,
         cei.p,
         cei.q,
         cei.t,
         cei.ab,
         cei.ac,
         cei.z,
         cei.ad,
         cei.ae,
         cei.ag,
         cei.af,
         cei.ai,
         cei.aj,
         cei.ah,
         cei.al,
         cei.M,
         cei.ar,
         cei.s,
         cei.as,
         cei.at,
         cei.ak,
         cei.am,
         cei.au,
         cei.av,
         cei.aw
      }
   );

   public cnf(bup<? extends cne> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.ea());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.ea());
   }

   @bau
   @Override
   public bso y() {
      return this.cm;
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clh $$4 && $$4.gx()) {
         cwf $$5 = new cwf(cwj.uJ);
         $$4.gy();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cwf k(cwf $$0) {
      return this.cm.b($$0);
   }

   protected boolean l(cwf $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bwl.a gC() {
      return clv.gB().a(bwm.s, 16.0).a(bwm.v, 0.35F).a(bwm.c, 5.0);
   }

   public static boolean b(bup<cnf> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return !$$1.a_($$3.e()).a(dil.kK);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      if ($$2 != buo.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gw()) {
            this.a(buq.a, this.gE());
         }
      }

      cng.a(this, $$0.E_());
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
   protected void a(azv $$0, bsf $$1) {
      if (this.gw()) {
         this.a(buq.f, new cwf(cwj.pP), $$0);
         this.a(buq.e, new cwf(cwj.pQ), $$0);
         this.a(buq.d, new cwf(cwj.pR), $$0);
         this.a(buq.c, new cwf(cwj.pS), $$0);
      }
   }

   private void a(buq $$0, cwf $$1, azv $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwg.b<cnf> ef() {
      return bwg.a(bY, e);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cng.a(this, this.ef().a($$0));
   }

   @Override
   public bwg<cnf> ee() {
      return (bwg<cnf>)super.ee();
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      bsh $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dY().C) {
         return cng.a(this, $$0, $$1);
      } else {
         boolean $$3 = cng.b(this, $$0.b($$1)) && this.gx() != cnh.d;
         return (bsh)($$3 ? bsh.a : bsh.e);
      }
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.aw().a(bZ, $$0);
      if (!this.dY().C) {
         bwi $$1 = this.g(bwm.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.aw().a(bZ);
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
      bor $$0 = boq.a();
      $$0.a("piglinBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      cng.a(this);
      super.ac();
   }

   @Override
   protected int er() {
      return this.bN;
   }

   @Override
   protected void a(arq $$0) {
      cng.b(this);
      this.cm.f().forEach(this::b);
      super.a($$0);
   }

   private cwf gE() {
      return (double)this.af.i() < 0.5 ? new cwf(cwj.wn) : new cwf(cwj.oX);
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
      this.bf = 0;
   }

   @Override
   public cnh gx() {
      if (this.gD()) {
         return cnh.e;
      } else if (cng.a(this.fd())) {
         return cnh.d;
      } else if (this.gk() && this.gy()) {
         return cnh.a;
      } else if (this.gF()) {
         return cnh.c;
      } else {
         return this.b(cwj.wn) && cuw.g(this.ec()) ? cnh.b : cnh.f;
      }
   }

   public boolean gD() {
      return this.am.a(cb);
   }

   public void y(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dY().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bve) {
            cng.a(this, (bve)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bve $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxb $$0) {
      return $$0 == cwj.wn;
   }

   protected void m(cwf $$0) {
      this.b(buq.a, $$0);
   }

   protected void n(cwf $$0) {
      if ($$0.a(cng.c)) {
         this.a(buq.b, $$0);
         this.g(buq.b);
      } else {
         this.b(buq.b, $$0);
      }
   }

   @Override
   public boolean i(cwf $$0) {
      return this.dY().ac().b(dfb.c) && this.fQ() && cng.a(this, $$0);
   }

   protected boolean o(cwf $$0) {
      buq $$1 = this.f($$0);
      cwf $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwf $$0, cwf $$1, buq $$2) {
      if (dby.a($$1, dbx.E)) {
         return false;
      } else {
         boolean $$3 = cng.a($$0) || $$0.a(cwj.wn);
         boolean $$4 = cng.a($$1) || $$1.a(cwj.wn);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gw() && !$$0.a(cwj.wn) && $$1.a(cwj.wn) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ckz $$0) {
      this.a($$0);
      cng.a(this, $$0);
   }

   @Override
   public boolean a(bui $$0, boolean $$1) {
      if (this.p_() && $$0.ar() == bup.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bui b(bui $$0, int $$1) {
      List<bui> $$2 = $$0.db();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awn w() {
      return this.dY().C ? null : cng.c(this).orElse(null);
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.tK;
   }

   @Override
   protected awn o_() {
      return awo.tI;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.tM, 0.15F, 1.0F);
   }

   @Override
   protected void gz() {
      this.b(awo.tN);
   }
}
