import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnk extends cnj implements clk, cof {
   private static final ajy<Boolean> bZ = akc.a(cnk.class, aka.k);
   private static final ajy<Boolean> ca = akc.a(cnk.class, aka.k);
   private static final ajy<Boolean> cb = akc.a(cnk.class, aka.k);
   private static final akv cc = akv.b("baby");
   private static final bwm cd = new bwm(cc, 0.2F, bwm.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bun ck = bur.aR.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsq cm = new bsq(8);
   private boolean cn;
   protected static final ImmutableList<cfr<? extends cfq<? super cnk>>> d = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.f, cfr.l);
   protected static final ImmutableList<cek<?>> bY = ImmutableList.of(
      cek.n,
      cek.v,
      cek.g,
      cek.h,
      cek.k,
      cek.l,
      cek.ao,
      cek.an,
      cek.L,
      cek.aP,
      cek.x,
      cek.y,
      new cek[]{
         cek.m,
         cek.E,
         cek.o,
         cek.p,
         cek.q,
         cek.t,
         cek.ab,
         cek.ac,
         cek.z,
         cek.ad,
         cek.ae,
         cek.ag,
         cek.af,
         cek.ai,
         cek.aj,
         cek.ah,
         cek.al,
         cek.M,
         cek.ar,
         cek.s,
         cek.as,
         cek.at,
         cek.ak,
         cek.am,
         cek.au,
         cek.av,
         cek.aw
      }
   );

   public cnk(bur<? extends cnj> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.e_()) {
         $$0.a("IsBaby", true);
      }

      if (this.cn) {
         $$0.a("CannotHunt", true);
      }

      this.b($$0, this.dX());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dX());
   }

   @bag
   @Override
   public bsq t() {
      return this.cm;
   }

   @Override
   protected void a(ard $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clj $$4 && $$4.gt()) {
         cwo $$5 = new cwo(cws.vq);
         $$4.gu();
         this.a($$0, $$5);
      }

      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cwo i(cwo $$0) {
      return this.cm.b($$0);
   }

   protected boolean j(cwo $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.m_();
      }
   }

   public static bwn.a gy() {
      return clx.gx().a(bwo.s, 16.0).a(bwo.v, 0.35F).a(bwo.c, 5.0);
   }

   public static boolean b(bur<cnk> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djn.lm);
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      if ($$2 != buq.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gs()) {
            this.a(bus.a, this.gA());
         }
      }

      cnl.a(this, $$0.H_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean ab() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fZ();
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      if (this.gs()) {
         this.a(bus.f, new cwo(cws.qt), $$0);
         this.a(bus.e, new cwo(cws.qu), $$0);
         this.a(bus.d, new cwo(cws.qv), $$0);
         this.a(bus.c, new cwo(cws.qw), $$0);
      }
   }

   private void a(bus $$0, cwo $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwi.b<cnk> ec() {
      return bwi.a(bY, d);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cnl.a(this, this.ec().a($$0));
   }

   @Override
   public bwi<cnk> eb() {
      return (bwi<cnk>)super.eb();
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      bsj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ard $$3) {
         return cnl.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnl.b(this, $$0.b($$1)) && this.gt() != cnm.d;
         return (bsj)($$4 ? bsj.a : bsj.e);
      }
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C) {
         bwk $$1 = this.g(bwo.v);
         $$1.c(cd.b());
         if ($$0) {
            $$1.b(cd);
         }
      }
   }

   @Override
   public boolean e_() {
      return this.au().a(bZ);
   }

   private void z(boolean $$0) {
      this.cn = $$0;
   }

   @Override
   protected boolean m() {
      return !this.cn;
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnl.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ard $$0) {
      return this.bN;
   }

   @Override
   protected void g(ard $$0) {
      cnl.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwo gA() {
      return (double)this.ae.i() < 0.5 ? new cwo(cws.wV) : new cwo(cws.pB);
   }

   @Override
   public axf<cwk> Z() {
      return this.e_() ? null : awy.bT;
   }

   private boolean gB() {
      return this.al.a(ca);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(ca, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public cnm gt() {
      if (this.gz()) {
         return cnm.e;
      } else if (cnl.a(this.fa())) {
         return cnm.d;
      } else if (this.gh() && this.gu()) {
         return cnm.a;
      } else if (this.gB()) {
         return cnm.c;
      } else {
         return this.b(cws.wV) && cvf.g(this.dZ()) ? cnm.b : cnm.f;
      }
   }

   public boolean gz() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         cnl.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxk $$0) {
      return $$0 == cws.wV;
   }

   protected void k(cwo $$0) {
      this.b(bus.a, $$0);
   }

   protected void l(cwo $$0) {
      if ($$0.a(cnl.c)) {
         this.a(bus.b, $$0);
         this.g(bus.b);
      } else {
         this.b(bus.b, $$0);
      }
   }

   @Override
   public boolean c(ard $$0, cwo $$1) {
      return $$0.O().b(dgd.c) && this.fN() && cnl.a(this, $$1);
   }

   protected boolean m(cwo $$0) {
      bus $$1 = this.f($$0);
      cwo $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwo $$0, cwo $$1, bus $$2) {
      if (dda.a($$1, dcz.E)) {
         return false;
      } else {
         axf<cwk> $$3 = this.Z();
         boolean $$4 = cnl.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cnl.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ard $$0, clb $$1) {
      this.a($$1);
      cnl.a($$0, this, $$1);
   }

   @Override
   public boolean a(buk $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bur.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private buk b(buk $$0, int $$1) {
      List<buk> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz u() {
      return this.dV().C ? null : cnl.b(this).orElse(null);
   }

   @Override
   protected avz e(bta $$0) {
      return awa.ul;
   }

   @Override
   protected avz o_() {
      return awa.uj;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.un, 0.15F, 1.0F);
   }

   @Override
   protected void gv() {
      this.b(awa.uo);
   }
}
