import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnb extends cna implements cle, cnw {
   private static final akl<Boolean> bZ = akp.a(cnb.class, akn.k);
   private static final akl<Boolean> ca = akp.a(cnb.class, akn.k);
   private static final akl<Boolean> cb = akp.a(cnb.class, akn.k);
   private static final ali cc = ali.b("baby");
   private static final bwg cd = new bwg(cc, 0.2F, bwg.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final buh ck = bul.aA.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsk cm = new bsk(8);
   private boolean cn;
   protected static final ImmutableList<cfl<? extends cfk<? super cnb>>> e = ImmutableList.of(cfl.c, cfl.d, cfl.b, cfl.f, cfl.l);
   protected static final ImmutableList<cee<?>> bY = ImmutableList.of(
      cee.n,
      cee.v,
      cee.g,
      cee.h,
      cee.k,
      cee.l,
      cee.ao,
      cee.an,
      cee.L,
      cee.aP,
      cee.x,
      cee.y,
      new cee[]{
         cee.m,
         cee.E,
         cee.o,
         cee.p,
         cee.q,
         cee.t,
         cee.ab,
         cee.ac,
         cee.z,
         cee.ad,
         cee.ae,
         cee.ag,
         cee.af,
         cee.ai,
         cee.aj,
         cee.ah,
         cee.al,
         cee.M,
         cee.ar,
         cee.s,
         cee.as,
         cee.at,
         cee.ak,
         cee.am,
         cee.au,
         cee.av,
         cee.aw
      }
   );

   public cnb(bul<? extends cna> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dZ());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dZ());
   }

   @baq
   @Override
   public bsk y() {
      return this.cm;
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cld $$4 && $$4.gw()) {
         cwb $$5 = new cwb(cwf.ut);
         $$4.gx();
         this.b($$5);
      }

      this.cm.f().forEach(this::b);
   }

   protected cwb k(cwb $$0) {
      return this.cm.b($$0);
   }

   protected boolean l(cwb $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.j_();
      }
   }

   public static bwh.a gB() {
      return clr.gA().a(bwi.s, 16.0).a(bwi.v, 0.35F).a(bwi.c, 5.0);
   }

   public static boolean b(bul<cnb> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return !$$1.a_($$3.e()).a(dig.kK);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      if ($$2 != buk.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gv()) {
            this.a(bum.a, this.gD());
         }
      }

      cnc.a(this, $$0.E_());
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
      return !this.gb();
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      if (this.gv()) {
         this.a(bum.f, new cwb(cwf.pP), $$0);
         this.a(bum.e, new cwb(cwf.pQ), $$0);
         this.a(bum.d, new cwb(cwf.pR), $$0);
         this.a(bum.c, new cwb(cwf.pS), $$0);
      }
   }

   private void a(bum $$0, cwb $$1, azs $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwc.b<cnb> ee() {
      return bwc.a(bY, e);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cnc.a(this, this.ee().a($$0));
   }

   @Override
   public bwc<cnb> ed() {
      return (bwc<cnb>)super.ed();
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      bsd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (!this.dX().C) {
         return cnc.a(this, $$0, $$1);
      } else {
         boolean $$3 = cnc.b(this, $$0.b($$1)) && this.gw() != cnd.d;
         return (bsd)($$3 ? bsd.a : bsd.e);
      }
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.aw().a(bZ, $$0);
      if (!this.dX().C) {
         bwe $$1 = this.g(bwi.v);
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
      bon $$0 = bom.a();
      $$0.a("piglinBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      cnc.a(this);
      super.ac();
   }

   @Override
   protected int eq() {
      return this.bN;
   }

   @Override
   protected void a(arn $$0) {
      cnc.b(this);
      this.cm.f().forEach(this::b);
      super.a($$0);
   }

   private cwb gD() {
      return (double)this.af.i() < 0.5 ? new cwb(cwf.vX) : new cwb(cwf.oX);
   }

   private boolean gE() {
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
   public cnd gw() {
      if (this.gC()) {
         return cnd.e;
      } else if (cnc.a(this.fc())) {
         return cnd.d;
      } else if (this.gj() && this.gx()) {
         return cnd.a;
      } else if (this.gE()) {
         return cnd.c;
      } else {
         return this.b(cwf.vX) && cus.g(this.eb()) ? cnd.b : cnd.f;
      }
   }

   public boolean gC() {
      return this.am.a(cb);
   }

   public void y(boolean $$0) {
      this.am.a(cb, $$0);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dX().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bva) {
            cnc.a(this, (bva)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   public void a(bva $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cwx $$0) {
      return $$0 == cwf.vX;
   }

   protected void m(cwb $$0) {
      this.b(bum.a, $$0);
   }

   protected void n(cwb $$0) {
      if ($$0.a(cnc.c)) {
         this.a(bum.b, $$0);
         this.g(bum.b);
      } else {
         this.b(bum.b, $$0);
      }
   }

   @Override
   public boolean i(cwb $$0) {
      return this.dX().ac().b(dex.c) && this.fP() && cnc.a(this, $$0);
   }

   protected boolean o(cwb $$0) {
      bum $$1 = this.f($$0);
      cwb $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwb $$0, cwb $$1, bum $$2) {
      if (dbu.a($$1, dbt.E)) {
         return false;
      } else {
         boolean $$3 = cnc.a($$0) || $$0.a(cwf.vX);
         boolean $$4 = cnc.a($$1) || $$1.a(cwf.vX);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gv() && !$$0.a(cwf.vX) && $$1.a(cwf.vX) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ckv $$0) {
      this.a($$0);
      cnc.a(this, $$0);
   }

   @Override
   public boolean a(bue $$0, boolean $$1) {
      if (this.p_() && $$0.ar() == bul.Z) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bue b(bue $$0, int $$1) {
      List<bue> $$2 = $$0.da();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected awk w() {
      return this.dX().C ? null : cnc.c(this).orElse(null);
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.tK;
   }

   @Override
   protected awk o_() {
      return awl.tI;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.tM, 0.15F, 1.0F);
   }

   @Override
   protected void gy() {
      this.b(awl.tN);
   }
}
