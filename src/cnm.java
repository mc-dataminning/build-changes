import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnm extends cnl implements clm, coh {
   private static final ajy<Boolean> bZ = akc.a(cnm.class, aka.k);
   private static final ajy<Boolean> ca = akc.a(cnm.class, aka.k);
   private static final ajy<Boolean> cb = akc.a(cnm.class, aka.k);
   private static final akv cc = akv.b("baby");
   private static final bwo cd = new bwo(cc, 0.2F, bwo.a.b);
   private static final int ce = 16;
   private static final float cf = 0.35F;
   private static final int cg = 5;
   private static final float ch = 0.1F;
   private static final int ci = 3;
   private static final float cj = 0.2F;
   private static final bup ck = but.aR.n().a(0.5F).b(0.97F);
   private static final double cl = 0.5;
   private final bss cm = new bss(8);
   private boolean cn;
   protected static final ImmutableList<cft<? extends cfs<? super cnm>>> d = ImmutableList.of(cft.c, cft.d, cft.b, cft.f, cft.l);
   protected static final ImmutableList<cem<?>> bY = ImmutableList.of(
      cem.n,
      cem.v,
      cem.g,
      cem.h,
      cem.k,
      cem.l,
      cem.ao,
      cem.an,
      cem.L,
      cem.aP,
      cem.x,
      cem.y,
      new cem[]{
         cem.m,
         cem.E,
         cem.o,
         cem.p,
         cem.q,
         cem.t,
         cem.ab,
         cem.ac,
         cem.z,
         cem.ad,
         cem.ae,
         cem.ag,
         cem.af,
         cem.ai,
         cem.aj,
         cem.ah,
         cem.al,
         cem.M,
         cem.ar,
         cem.s,
         cem.as,
         cem.at,
         cem.ak,
         cem.am,
         cem.au,
         cem.av,
         cem.aw
      }
   );

   public cnm(but<? extends cnl> $$0, dgj $$1) {
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
   public bss t() {
      return this.cm;
   }

   @Override
   protected void a(ard $$0, btc $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cll $$4 && $$4.gt()) {
         cwq $$5 = new cwq(cwu.vq);
         $$4.gu();
         this.a($$0, $$5);
      }

      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected cwq i(cwq $$0) {
      return this.cm.b($$0);
   }

   protected boolean j(cwq $$0) {
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

   public static bwp.a gy() {
      return clz.gx().a(bwq.s, 16.0).a(bwq.v, 0.35F).a(bwq.c, 5.0);
   }

   public static boolean b(but<cnm> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return !$$1.a_($$3.e()).a(djp.lm);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      azh $$4 = $$0.H_();
      if ($$2 != bus.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gs()) {
            this.a(buu.a, this.gA());
         }
      }

      cnn.a(this, $$0.H_());
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
   protected void a(azh $$0, bsj $$1) {
      if (this.gs()) {
         this.a(buu.f, new cwq(cwu.qt), $$0);
         this.a(buu.e, new cwq(cwu.qu), $$0);
         this.a(buu.d, new cwq(cwu.qv), $$0);
         this.a(buu.c, new cwq(cwu.qw), $$0);
      }
   }

   private void a(buu $$0, cwq $$1, azh $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected bwk.b<cnm> ec() {
      return bwk.a(bY, d);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cnn.a(this, this.ec().a($$0));
   }

   @Override
   public bwk<cnm> eb() {
      return (bwk<cnm>)super.eb();
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      bsl $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.dV() instanceof ard $$3) {
         return cnn.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = cnn.b(this, $$0.b($$1)) && this.gt() != cno.d;
         return (bsl)($$4 ? bsl.a : bsl.e);
      }
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? ck : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(bZ, $$0);
      if (!this.dV().C) {
         bwm $$1 = this.g(bwq.v);
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
      bou $$1 = bot.a();
      $$1.a("piglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnn.a(this);
      super.a($$0);
   }

   @Override
   protected int e(ard $$0) {
      return this.bN;
   }

   @Override
   protected void g(ard $$0) {
      cnn.a($$0, this);
      this.cm.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private cwq gA() {
      return (double)this.ae.i() < 0.5 ? new cwq(cwu.wV) : new cwq(cwu.pB);
   }

   @Override
   public axf<cwm> Z() {
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
   public cno gt() {
      if (this.gz()) {
         return cno.e;
      } else if (cnn.a(this.fa())) {
         return cno.d;
      } else if (this.gh() && this.gu()) {
         return cno.a;
      } else if (this.gB()) {
         return cno.c;
      } else {
         return this.b(cwu.wV) && cvh.g(this.dZ()) ? cno.b : cno.f;
      }
   }

   public boolean gz() {
      return this.al.a(cb);
   }

   public void y(boolean $$0) {
      this.al.a(cb, $$0);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvi $$4) {
         cnn.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(bvi $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(cxm $$0) {
      return $$0 == cwu.wV;
   }

   protected void k(cwq $$0) {
      this.b(buu.a, $$0);
   }

   protected void l(cwq $$0) {
      if ($$0.a(cnn.c)) {
         this.a(buu.b, $$0);
         this.g(buu.b);
      } else {
         this.b(buu.b, $$0);
      }
   }

   @Override
   public boolean c(ard $$0, cwq $$1) {
      return $$0.O().b(dgf.c) && this.fN() && cnn.a(this, $$1);
   }

   protected boolean m(cwq $$0) {
      buu $$1 = this.f($$0);
      cwq $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(cwq $$0, cwq $$1, buu $$2) {
      if (ddc.a($$1, ddb.E)) {
         return false;
      } else {
         axf<cwm> $$3 = this.Z();
         boolean $$4 = cnn.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = cnn.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      this.a($$1);
      cnn.a($$0, this, $$1);
   }

   @Override
   public boolean a(bum $$0, boolean $$1) {
      if (this.e_() && $$0.aq() == but.aj) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bum b(bum $$0, int $$1) {
      List<bum> $$2 = $$0.cY();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.get(0), $$1 - 1) : $$0;
   }

   @Override
   protected avz u() {
      return this.dV().C ? null : cnn.b(this).orElse(null);
   }

   @Override
   protected avz e(btc $$0) {
      return awa.ul;
   }

   @Override
   protected avz o_() {
      return awa.uj;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.un, 0.15F, 1.0F);
   }

   @Override
   protected void gv() {
      this.b(awa.uo);
   }
}
