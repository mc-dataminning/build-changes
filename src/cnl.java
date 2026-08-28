import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnl extends cnk implements cll, cog {
   private static final ajy<Boolean> bZ = akc.a(cnl.class, aka.k);
   private static final ajy<Boolean> ca = akc.a(cnl.class, aka.k);
   private static final ajy<Boolean> cb = akc.a(cnl.class, aka.k);
   private static final akv cc = akv.b("baby");
   private static final bwn cd = new bwn(cc, 0.2F, bwn.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final buo ck = bus.aR.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bsr cm = new bsr(8);
   private boolean cn;
   protected static final ImmutableList<cfs<? extends cfr<? super cnl>>> d = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.f, cfs.l);
   protected static final ImmutableList<cel<?>> bY = ImmutableList.of(
      cel.n,
      cel.v,
      cel.g,
      cel.h,
      cel.k,
      cel.l,
      cel.ao,
      cel.an,
      cel.L,
      cel.aP,
      cel.x,
      cel.y,
      new cel[]{
         cel.m,
         cel.E,
         cel.o,
         cel.p,
         cel.q,
         cel.t,
         cel.ab,
         cel.ac,
         cel.z,
         cel.ad,
         cel.ae,
         cel.ag,
         cel.af,
         cel.ai,
         cel.aj,
         cel.ah,
         cel.al,
         cel.M,
         cel.ar,
         cel.s,
         cel.as,
         cel.at,
         cel.ak,
         cel.am,
         cel.au,
         cel.av,
         cel.aw
      }
   );

   public cnl(bus<? extends cnk> $$0, dgi $$1) {
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
   public bsr t() {
      return this.cm;
   }

   @Override
   protected void a(ard $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.gt()) {
         cwp $$5 = new cwp(cwt.vq);
         $$4.gu();
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

   public static bwo.a gy() {
      return cly.gx().a(bwp.s, 16.0).a(bwp.v, 0.35F).a(bwp.c, 5.0);
   }

   public static boolean b(bus<cnl> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djo.lm);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      if ($$2 != bur.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gs()) {
            this.a(but.a, this.gA());
         }
      }

      cnm.a(this, $$0.H_());
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
   protected void a(azh $$0, bsi $$1) {
      if (this.gs()) {
         this.a(but.f, new cwp(cwt.qt), $$0);
         this.a(but.e, new cwp(cwt.qu), $$0);
         this.a(but.d, new cwp(cwt.qv), $$0);
         this.a(but.c, new cwp(cwt.qw), $$0);
      }
   }

   private void a(but $$0, cwp $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwj.b<cnl> ec() {
      return bwj.a(bY, d);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnm.a(this, this.ec().a($$0));
   }

   @Override
   public bwj<cnl> eb() {
      return (bwj<cnl>)super.eb();
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      bsk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ard $$3) {
         return cnm.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnm.b(this, $$0.b($$1)) && this.gt() != cnn.d;
         return (bsk)($$4 ? bsk.a : bsk.e);
      }
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C) {
         bwl $$1 = this.g(bwp.v);
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
      bot $$1 = bos.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnm.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ard $$0) {
      return this.bN;
   }

   @Override
   protected void g(ard $$0) {
      cnm.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwp gA() {
      return (double)this.ae.i() < 0.5 ? new cwp(cwt.wV) : new cwp(cwt.pB);
   }

   @Override
   public axf<cwl> Z() {
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
   public cnn gt() {
      if (this.gz()) {
         return cnn.e;
      } else if (cnm.a(this.fa())) {
         return cnn.d;
      } else if (this.gh() && this.gu()) {
         return cnn.a;
      } else if (this.gB()) {
         return cnn.c;
      } else {
         return this.b(cwt.wV) && cvg.g(this.dZ()) ? cnn.b : cnn.f;
      }
   }

   public boolean gz() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cnm.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxl $$0) {
      return $$0 == cwt.wV;
   }

   protected void k(cwp $$0) {
      this.b(but.a, $$0);
   }

   protected void l(cwp $$0) {
      if ($$0.a(cnm.c)) {
         this.a(but.b, $$0);
         this.g(but.b);
      } else {
         this.b(but.b, $$0);
      }
   }

   @Override
   public boolean c(ard $$0, cwp $$1) {
      return $$0.O().b(dge.c) && this.fN() && cnm.a(this, $$1);
   }

   protected boolean m(cwp $$0) {
      but $$1 = this.f($$0);
      cwp $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwp $$0, cwp $$1, but $$2) {
      if (ddb.a($$1, dda.E)) {
         return false;
      } else {
         axf<cwl> $$3 = this.Z();
         boolean $$4 = cnm.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cnm.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ard $$0, clc $$1) {
      this.a($$1);
      cnm.a($$0, this, $$1);
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == bus.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bul b(bul $$0, int $$1) {
      List<bul> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz u() {
      return this.dV().C ? null : cnm.b(this).orElse(null);
   }

   @Override
   protected avz e(btb $$0) {
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
   protected void gv() {
      this.b(awa.uo);
   }
}
