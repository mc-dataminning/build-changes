import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckx extends ckw implements cja, cls {
   private static final ajp<Boolean> cb = ajt.a(ckx.class, ajr.k);
   private static final ajp<Boolean> cc = ajt.a(ckx.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(ckx.class, ajr.k);
   private static final UUID ce = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bue cf = new bue(ce, "Baby speed boost", 0.2F, bue.a.b);
   private static final int cg = 16;
   private static final float ch = 0.35F;
   private static final int ci = 5;
   private static final float cj = 0.1F;
   private static final int ck = 3;
   private static final float cl = 0.2F;
   private static final bsg cm = bsj.aA.n().a(0.5F).b(0.97F);
   private static final double cn = 0.5;
   private final bqm co = new bqm(8);
   private boolean cp;
   protected static final ImmutableList<cdj<? extends cdi<? super ckx>>> e = ImmutableList.of(cdj.c, cdj.d, cdj.b, cdj.f, cdj.l);
   protected static final ImmutableList<ccc<?>> ca = ImmutableList.of(
      ccc.n,
      ccc.v,
      ccc.g,
      ccc.h,
      ccc.k,
      ccc.l,
      ccc.ao,
      ccc.an,
      ccc.L,
      ccc.aP,
      ccc.x,
      ccc.y,
      new ccc[]{
         ccc.m,
         ccc.E,
         ccc.o,
         ccc.p,
         ccc.q,
         ccc.t,
         ccc.ab,
         ccc.ac,
         ccc.z,
         ccc.ad,
         ccc.ae,
         ccc.ag,
         ccc.af,
         ccc.ai,
         ccc.aj,
         ccc.ah,
         ccc.al,
         ccc.M,
         ccc.ar,
         ccc.s,
         ccc.as,
         ccc.at,
         ccc.ak,
         ccc.am,
         ccc.au,
         ccc.av,
         ccc.aw
      }
   );

   public ckx(bsj<? extends ckw> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cp) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dR());
   }

   @azi
   @Override
   public bqm y() {
      return this.co;
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof ciz $$3 && $$3.go()) {
         cua $$4 = new cua(cud.ur);
         $$3.gp();
         this.b($$4);
      }

      this.co.f().forEach(this::b);
   }

   protected cua n(cua $$0) {
      return this.co.b($$0);
   }

   protected boolean o(cua $$0) {
      return this.co.c($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, false);
      $$0.a(cc, false);
      $$0.a(cd, false);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (cb.equals($$0)) {
         this.j_();
      }
   }

   public static buf.a gu() {
      return cjn.gt().a(bug.s, 16.0).a(bug.v, 0.35F).a(bug.c, 5.0);
   }

   public static boolean b(bsj<ckx> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return !$$1.a_($$3.d()).a(dfh.kK);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      if ($$2 != btc.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bsk.a, this.gw());
         }
      }

      cky.a(this, $$0.E_());
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean X() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fS();
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      if (this.go()) {
         this.a(bsk.f, new cua(cud.pO), $$0);
         this.a(bsk.e, new cua(cud.pP), $$0);
         this.a(bsk.d, new cua(cud.pQ), $$0);
         this.a(bsk.c, new cua(cud.pR), $$0);
      }
   }

   private void a(bsk $$0, cua $$1, aym $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bua.b<ckx> dU() {
      return bua.a(ca, e);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cky.a(this, this.dU().a($$0));
   }

   @Override
   public bua<ckx> dT() {
      return (bua<ckx>)super.dT();
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      bqd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dP().B) {
         return cky.a(this, $$0, $$1);
      } else {
         boolean $$3 = cky.b(this, $$0.b($$1)) && this.gp() != ckz.d;
         return $$3 ? bqd.a : bqd.e;
      }
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cm : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(cb, $$0);
      if (!this.dP().B) {
         buc $$1 = this.f(bug.v);
         $$1.b(cf.b());
         if ($$0) {
            $$1.c(cf);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(cb);
   }

   private void y(boolean $$0) {
      this.cp = $$0;
   }

   @Override
   protected boolean s() {
      return !this.cp;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      cky.a(this);
      super.Z();
   }

   @Override
   protected int eg() {
      return this.bP;
   }

   @Override
   protected void c(aqk $$0) {
      cky.b(this);
      this.co.f().forEach(this::b);
      super.c($$0);
   }

   private cua gw() {
      return (double)this.ah.i() < 0.5 ? new cua(cud.vW) : new cua(cud.oV);
   }

   private boolean gx() {
      return this.ao.a(cc);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public ckz gp() {
      if (this.gv()) {
         return ckz.e;
      } else if (cky.a(this.eU())) {
         return ckz.d;
      } else if (this.ge() && this.gq()) {
         return ckz.a;
      } else if (this.gx()) {
         return ckz.c;
      } else {
         return this.ge() && this.b(cud.vW) ? ckz.b : ckz.f;
      }
   }

   public boolean gv() {
      return this.ao.a(cd);
   }

   public void x(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsy) {
            cky.a(this, (bsy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bsy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cut $$0) {
      return $$0 == cud.vW;
   }

   protected void p(cua $$0) {
      this.b(bsk.a, $$0);
   }

   protected void q(cua $$0) {
      if ($$0.a(cky.c)) {
         this.a(bsk.b, $$0);
         this.f(bsk.b);
      } else {
         this.b(bsk.b, $$0);
      }
   }

   @Override
   public boolean k(cua $$0) {
      return this.dP().ab().b(dbz.c) && this.fR() && cky.a(this, $$0);
   }

   protected boolean r(cua $$0) {
      bsk $$1 = bta.h($$0);
      cua $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cua $$0, cua $$1) {
      if (czl.a($$1, czk.F)) {
         return false;
      } else {
         boolean $$2 = cky.a($$0) || $$0.a(cud.vW);
         boolean $$3 = cky.a($$1) || $$1.a(cud.vW);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(cud.vW) && $$1.a(cud.vW) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(cir $$0) {
      this.a($$0);
      cky.a(this, $$0);
   }

   @Override
   public boolean a(bsd $$0, boolean $$1) {
      if (this.p_() && $$0.ak() == bsj.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsd b(bsd $$0, int $$1) {
      List<bsd> $$2 = $$0.cS();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected ave v() {
      return this.dP().B ? null : cky.c(this).orElse(null);
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.tL;
   }

   @Override
   protected ave o_() {
      return avf.tJ;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.tN, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(avf.tO);
   }
}
