import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class clb extends cla implements cje, clw {
   private static final ajp<Boolean> cb = ajt.a(clb.class, ajr.k);
   private static final ajp<Boolean> cc = ajt.a(clb.class, ajr.k);
   private static final ajp<Boolean> cd = ajt.a(clb.class, ajr.k);
   private static final UUID ce = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
   private static final bui cf = new bui(ce, "Baby speed boost", 0.2F, bui.a.b);
   private static final int cg = 16;
   private static final float ch = 0.35F;
   private static final int ci = 5;
   private static final float cj = 0.1F;
   private static final int ck = 3;
   private static final float cl = 0.2F;
   private static final bsk cm = bsn.aA.n().a(0.5F).b(0.97F);
   private static final double cn = 0.5;
   private final bqq co = new bqq(8);
   private boolean cp;
   protected static final ImmutableList<cdn<? extends cdm<? super clb>>> e = ImmutableList.of(cdn.c, cdn.d, cdn.b, cdn.f, cdn.l);
   protected static final ImmutableList<ccg<?>> ca = ImmutableList.of(
      ccg.n,
      ccg.v,
      ccg.g,
      ccg.h,
      ccg.k,
      ccg.l,
      ccg.ao,
      ccg.an,
      ccg.L,
      ccg.aP,
      ccg.x,
      ccg.y,
      new ccg[]{
         ccg.m,
         ccg.E,
         ccg.o,
         ccg.p,
         ccg.q,
         ccg.t,
         ccg.ab,
         ccg.ac,
         ccg.z,
         ccg.ad,
         ccg.ae,
         ccg.ag,
         ccg.af,
         ccg.ai,
         ccg.aj,
         ccg.ah,
         ccg.al,
         ccg.M,
         ccg.ar,
         ccg.s,
         ccg.as,
         ccg.at,
         ccg.ak,
         ccg.am,
         ccg.au,
         ccg.av,
         ccg.aw
      }
   );

   public clb(bsn<? extends cla> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cp) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dT());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.y($$0.q("CannotHunt"));
      this.a($$0, this.dT());
   }

   @azl
   @Override
   public bqq x() {
      return this.co;
   }

   @Override
   protected void a(aqm $$0, bra $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cjd $$4 && $$4.go()) {
         cud $$5 = new cud(cug.ur);
         $$4.gp();
         this.b($$5);
      }

      this.co.f().forEach(this::b);
   }

   protected cud n(cud $$0) {
      return this.co.b($$0);
   }

   protected boolean o(cud $$0) {
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
         this.i_();
      }
   }

   public static buj.a gu() {
      return cjr.gt().a(buk.s, 16.0).a(buk.v, 0.35F).a(buk.c, 5.0);
   }

   public static boolean b(bsn<clb> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return !$$1.a_($$3.d()).a(dfk.kK);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      if ($$2 != btg.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.go()) {
            this.a(bso.a, this.gw());
         }
      }

      clc.a(this, $$0.E_());
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
      return !this.fS();
   }

   @Override
   protected void a(ayo $$0, bqf $$1) {
      if (this.go()) {
         this.a(bso.f, new cud(cug.pO), $$0);
         this.a(bso.e, new cud(cug.pP), $$0);
         this.a(bso.d, new cud(cug.pQ), $$0);
         this.a(bso.c, new cud(cug.pR), $$0);
      }
   }

   private void a(bso $$0, cud $$1, ayo $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bue.b<clb> dW() {
      return bue.a(ca, e);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return clc.a(this, this.dW().a($$0));
   }

   @Override
   public bue<clb> dV() {
      return (bue<clb>)super.dV();
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      bqh $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dR().B) {
         return clc.a(this, $$0, $$1);
      } else {
         boolean $$3 = clc.b(this, $$0.b($$1)) && this.gp() != cld.d;
         return $$3 ? bqh.a : bqh.e;
      }
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cm : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.ar().a(cb, $$0);
      if (!this.dR().B) {
         bug $$1 = this.f(buk.v);
         $$1.b(cf.b());
         if ($$0) {
            $$1.c(cf);
         }
      }
   }

   @Override
   public boolean o_() {
      return this.ar().a(cb);
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
      this.dR().ag().a("piglinBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      clc.a(this);
      super.Z();
   }

   @Override
   protected int ei() {
      return this.bP;
   }

   @Override
   protected void b(aqm $$0) {
      clc.b(this);
      this.co.f().forEach(this::b);
      super.b($$0);
   }

   private cud gw() {
      return (double)this.ah.i() < 0.5 ? new cud(cug.vW) : new cud(cug.oW);
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
      this.bg = 0;
   }

   @Override
   public cld gp() {
      if (this.gv()) {
         return cld.e;
      } else if (clc.a(this.eW())) {
         return cld.d;
      } else if (this.ge() && this.gq()) {
         return cld.a;
      } else if (this.gx()) {
         return cld.c;
      } else {
         return this.ge() && this.b(cug.vW) ? cld.b : cld.f;
      }
   }

   public boolean gv() {
      return this.ao.a(cd);
   }

   public void x(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dR().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btc) {
            clc.a(this, (btc)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(btc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cuw $$0) {
      return $$0 == cug.vW;
   }

   protected void p(cud $$0) {
      this.b(bso.a, $$0);
   }

   protected void q(cud $$0) {
      if ($$0.a(clc.c)) {
         this.a(bso.b, $$0);
         this.e(bso.b);
      } else {
         this.b(bso.b, $$0);
      }
   }

   @Override
   public boolean k(cud $$0) {
      return this.dR().ab().b(dcc.c) && this.fR() && clc.a(this, $$0);
   }

   protected boolean r(cud $$0) {
      bso $$1 = this.h($$0);
      cud $$2 = this.a($$1);
      return this.b($$0, $$2);
   }

   @Override
   protected boolean b(cud $$0, cud $$1) {
      if (czo.a($$1, czn.E)) {
         return false;
      } else {
         boolean $$2 = clc.a($$0) || $$0.a(cug.vW);
         boolean $$3 = clc.a($$1) || $$1.a(cug.vW);
         if ($$2 && !$$3) {
            return true;
         } else if (!$$2 && $$3) {
            return false;
         } else {
            return this.go() && !$$0.a(cug.vW) && $$1.a(cug.vW) ? false : super.b($$0, $$1);
         }
      }
   }

   @Override
   protected void b(civ $$0) {
      this.a($$0);
      clc.a(this, $$0);
   }

   @Override
   public boolean a(bsh $$0, boolean $$1) {
      if (this.o_() && $$0.am() == bsn.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bsh b(bsh $$0, int $$1) {
      List<bsh> $$2 = $$0.cU();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avg v() {
      return this.dR().B ? null : clc.c(this).orElse(null);
   }

   @Override
   protected avg d(bra $$0) {
      return avh.tL;
   }

   @Override
   protected avg n_() {
      return avh.tJ;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.tN, 0.15F, 1.0F);
   }

   @Override
   protected void gr() {
      this.b(avh.tO);
   }
}
