import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cla extends ckz implements cjd, clv {
   private static final ajp<Boolean> cb = ajt.a(cla.class, ajr.k);
   private static final ajp<Boolean> cc = ajt.a(cla.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(cla.class, ajr.k);
   private static final UUID ce = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final buh cf = new buh(ce, "Baby speed boost", 0.2F, buh.a.b);
   private static final int cg = 16;
   private static final float ch = 0.35F;
   private static final int ci = 5;
   private static final float cj = 0.1F;
   private static final int ck = 3;
   private static final float cl = 0.2F;
   private static final bsj cm = bsm.aA.n().a(0.5F).b(0.97F);
   private static final double cn = 0.5;
   private final bqp co = new bqp(8);
   private boolean cp;
   protected static final ImmutableList<cdm<? extends cdl<? super cla>>> e = ImmutableList.of(cdm.c, cdm.d, cdm.b, cdm.f, cdm.l);
   protected static final ImmutableList<ccf<?>> ca = ImmutableList.of(
      ccf.n,
      ccf.v,
      ccf.g,
      ccf.h,
      ccf.k,
      ccf.l,
      ccf.ao,
      ccf.an,
      ccf.L,
      ccf.aP,
      ccf.x,
      ccf.y,
      new ccf[]{
         ccf.m,
         ccf.E,
         ccf.o,
         ccf.p,
         ccf.q,
         ccf.t,
         ccf.ab,
         ccf.ac,
         ccf.z,
         ccf.ad,
         ccf.ae,
         ccf.ag,
         ccf.af,
         ccf.ai,
         ccf.aj,
         ccf.ah,
         ccf.al,
         ccf.M,
         ccf.ar,
         ccf.s,
         ccf.as,
         ccf.at,
         ccf.ak,
         ccf.am,
         ccf.au,
         ccf.av,
         ccf.aw
      }
   );

   public cla(bsm<? extends ckz> $$0, dcf $$1) {
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

      this.b($$0, this.dS());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dS());
   }

   @azl
   @Override
   public bqp y() {
      return this.co;
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof cjc $$3 && $$3.gp()) {
         cuc $$4 = new cuc(cuf.ur);
         $$3.gq();
         this.b($$4);
      }

      this.co.f().forEach(this::b);
   }

   protected cuc n(cuc $$0) {
      return this.co.b($$0);
   }

   protected boolean o(cuc $$0) {
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

   public static bui.a gv() {
      return cjq.gu().a(buj.s, 16.0).a(buj.v, 0.35F).a(buj.c, 5.0);
   }

   public static boolean b(bsm<cla> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return !$$1.a_($$3.d()).a(dfj.kK);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      if ($$2 != btf.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gp()) {
            this.a(bsn.a, this.gx());
         }
      }

      clb.a(this, $$0.E_());
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
      return !this.fT();
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      if (this.gp()) {
         this.a(bsn.f, new cuc(cuf.pO), $$0);
         this.a(bsn.e, new cuc(cuf.pP), $$0);
         this.a(bsn.d, new cuc(cuf.pQ), $$0);
         this.a(bsn.c, new cuc(cuf.pR), $$0);
      }
   }

   private void a(bsn $$0, cuc $$1, ayo $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bud.b<cla> dV() {
      return bud.a(ca, e);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return clb.a(this, this.dV().a($$0));
   }

   @Override
   public bud<cla> dU() {
      return (bud<cla>)super.dU();
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      bqg $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dQ().B) {
         return clb.a(this, $$0, $$1);
      } else {
         boolean $$3 = clb.b(this, $$0.b($$1)) && this.gq() != clc.d;
         return $$3 ? bqg.a : bqg.e;
      }
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cm : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.aq().a(cb, $$0);
      if (!this.dQ().B) {
         buf $$1 = this.f(buj.v);
         $$1.b(cf.b());
         if ($$0) {
            $$1.c(cf);
         }
      }
   }

   @Override
   public boolean p_() {
      return this.aq().a(cb);
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
      this.dQ().ag().a("piglinBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      clb.a(this);
      super.Z();
   }

   @Override
   protected int eh() {
      return this.bP;
   }

   @Override
   protected void c(aqm $$0) {
      clb.b(this);
      this.co.f().forEach(this::b);
      super.c($$0);
   }

   private cuc gx() {
      return (double)this.ah.i() < 0.5 ? new cuc(cuf.vW) : new cuc(cuf.oW);
   }

   private boolean gy() {
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
   public clc gq() {
      if (this.gw()) {
         return clc.e;
      } else if (clb.a(this.eV())) {
         return clc.d;
      } else if (this.gf() && this.gr()) {
         return clc.a;
      } else if (this.gy()) {
         return clc.c;
      } else {
         return this.gf() && this.b(cuf.vW) ? clc.b : clc.f;
      }
   }

   public boolean gw() {
      return this.ao.a(cd);
   }

   public void x(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btb) {
            clb.a(this, (btb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cuv $$0) {
      return $$0 == cuf.vW;
   }

   protected void p(cuc $$0) {
      this.b(bsn.a, $$0);
   }

   protected void q(cuc $$0) {
      if ($$0.a(clb.c)) {
         this.a(bsn.b, $$0);
         this.f(bsn.b);
      } else {
         this.b(bsn.b, $$0);
      }
   }

   @Override
   public boolean k(cuc $$0) {
      return this.dQ().ab().b(dcb.c) && this.fS() && clb.a(this, $$0);
   }

   protected boolean r(cuc $$0) {
      bsn $$1 = btd.h($$0);
      cuc $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cuc $$0, cuc $$1) {
      if (czn.a($$1, czm.E)) {
         return false;
      } else {
         boolean $$2 = clb.a($$0) || $$0.a(cuf.vW);
         boolean $$3 = clb.a($$1) || $$1.a(cuf.vW);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.gp() && !$$0.a(cuf.vW) && $$1.a(cuf.vW) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(ciu $$0) {
      this.a($$0);
      clb.a(this, $$0);
   }

   @Override
   public boolean a(bsg $$0, boolean $$1) {
      if (this.p_() && $$0.al() == bsm.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsg b(bsg $$0, int $$1) {
      List<bsg> $$2 = $$0.cT();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avg v() {
      return this.dQ().B ? null : clb.c(this).orElse(null);
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.tL;
   }

   @Override
   protected avg o_() {
      return avh.tJ;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.tN, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(avh.tO);
   }
}
