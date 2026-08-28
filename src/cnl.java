import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnl extends cnk implements clk, cog {
   private static final ajx<Boolean> bZ = akb.a(cnl.class, ajz.k);
   private static final ajx<Boolean> ca = akb.a(cnl.class, ajz.k);
   private static final ajx<Boolean> cb = akb.a(cnl.class, ajz.k);
   private static final aku cc = aku.b("baby");
   private static final bwm cd = new bwm(cc, 0.2F, bwm.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bun ck = bur.aS.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsq cm = new bsq(8);
   private boolean cn;
   protected static final ImmutableList<cfr<? extends cfq<? super cnl>>> d = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.f, cfr.l);
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

   public cnl(bur<? extends cnk> $$0, dgi $$1) {
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

      this.b($$0, this.dY());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.z($$0.q("CannotHunt"));
      this.a($$0, this.dY());
   }

   @bag
   @Override
   public bsq t() {
      return this.cm;
   }

   @Override
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clj $$4 && $$4.gq()) {
         cwp $$5 = new cwp(cwt.vq);
         $$4.gr();
         this.a($$0, $$5);
      }

      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cwp i(cwp $$0) {
      return this.cm.b($$0);
   }

   protected boolean j(cwp $$0) {
      return this.cm.c($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         this.m_();
      }
   }

   public static bwn.a gv() {
      return clx.gu().a(bwo.s, 16.0).a(bwo.v, 0.35F).a(bwo.c, 5.0);
   }

   public static boolean b(bur<cnl> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djo.lm);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      if ($$2 != buq.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gp()) {
            this.a(bus.a, this.gx());
         }
      }

      cnm.a(this, $$0.H_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean Y() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.ak();
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      if (this.gp()) {
         this.a(bus.f, new cwp(cwt.qt), $$0);
         this.a(bus.e, new cwp(cwt.qu), $$0);
         this.a(bus.d, new cwp(cwt.qv), $$0);
         this.a(bus.c, new cwp(cwt.qw), $$0);
      }
   }

   private void a(bus $$0, cwp $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwi.b<cnl> ed() {
      return bwi.a(bY, d);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cnm.a(this, this.ed().a($$0));
   }

   @Override
   public bwi<cnl> ec() {
      return (bwi<cnl>)super.ec();
   }

   @Override
   public bsj b(cox $$0, bsi $$1) {
      bsj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dW() instanceof arc $$3) {
         return cnm.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnm.b(this, $$0.b($$1)) && this.gq() != cnn.d;
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
      if (!this.dW().C) {
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
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("piglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cnm.a(this);
      super.a($$0);
   }

   @Override
   protected int e(arc $$0) {
      return this.bN;
   }

   @Override
   protected void g(arc $$0) {
      cnm.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwp gx() {
      return (double)this.ae.i() < 0.5 ? new cwp(cwt.wV) : new cwp(cwt.pB);
   }

   @Override
   public axf<cwl> W() {
      return awy.bU;
   }

   private boolean gy() {
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
   public cnn gq() {
      if (this.gw()) {
         return cnn.e;
      } else if (cnm.a(this.fa())) {
         return cnn.d;
      } else if (this.ge() && this.gr()) {
         return cnn.a;
      } else if (this.gy()) {
         return cnn.c;
      } else {
         return this.b(cwt.wV) && cvg.g(this.ea()) ? cnn.b : cnn.f;
      }
   }

   public boolean gw() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvg $$4) {
         cnm.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.wV;
   }

   protected void k(cwp $$0) {
      this.b(bus.a, $$0);
   }

   protected void l(cwp $$0) {
      if ($$0.a(cnm.c)) {
         this.a(bus.b, $$0);
         this.g(bus.b);
      } else {
         this.b(bus.b, $$0);
      }
   }

   @Override
   public boolean c(arc $$0, cwp $$1) {
      return $$0.O().b(dge.c) && this.fN() && cnm.a(this, $$1);
   }

   protected boolean m(cwp $$0) {
      bus $$1 = this.f($$0);
      cwp $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwp $$0, cwp $$1, bus $$2) {
      if (ddb.a($$1, dda.E)) {
         return false;
      } else {
         boolean $$3 = cnm.a($$0) || $$0.a(cwt.wV);
         boolean $$4 = cnm.a($$1) || $$1.a(cwt.wV);
         if ($$3 && !$$4) {
            return true;
         } else if (!$$3 && $$4) {
            return false;
         } else {
            return this.gp() && !$$0.a(cwt.wV) && $$1.a(cwt.wV) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      this.a($$1);
      cnm.a($$0, this, $$1);
   }

   @Override
   public boolean a(buk $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bur.ak) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private buk b(buk $$0, int $$1) {
      List<buk> $$2 = $$0.cZ();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz u() {
      return this.dW().C ? null : cnm.b(this).orElse(null);
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
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.un, 0.15F, 1.0F);
   }

   @Override
   protected void gs() {
      this.b(awa.uo);
   }
}
