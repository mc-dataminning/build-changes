import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjd extends bwo implements cph, eda {
   private static final Logger bZ = LogUtils.getLogger();
   private static final kl ca = new kl(1, 1, 1);
   private static final int cb = 5;
   private static final float cc = 55.0F;
   private static final float cd = 15.0F;
   private static final int ce = 6000;
   private static final int cf = 3;
   public static final int a = 1024;
   private static final alc<Boolean> cg = alg.a(cjd.class, ale.k);
   private static final alc<Boolean> ch = alg.a(cjd.class, ale.k);
   protected static final ImmutableList<cgr<? extends cgq<? super cjd>>> b = ImmutableList.of(cgr.c, cgr.d, cgr.f, cgr.b);
   protected static final ImmutableList<cfk<?>> c = ImmutableList.of(
      cfk.t, cfk.n, cfk.h, cfk.m, cfk.E, cfk.x, cfk.L, cfk.aM, cfk.aN, cfk.aO, cfk.aP, cfk.Z, new cfk[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eco<eda.b> ci;
   private eda.a cj;
   private final eda.d ck;
   private final eco<cjd.a> cl;
   private final btq cm = new btq(1);
   @Nullable
   private jh cn;
   private long co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;

   public cjd(bvr<? extends cjd> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cce(this, 20, true);
      this.a_(this.fN());
      this.ck = new cjd.b();
      this.cj = new eda.a();
      this.ci = new eco<>(new eda.b(this));
      this.cl = new eco<>(new cjd.a(this.ck.b(), ecr.E.a().a()));
   }

   @Override
   protected bxi.b<cjd> ed() {
      return bxi.a(c, b);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cje.a(this.ed().a($$0));
   }

   @Override
   public bxi<cjd> ec() {
      return (bxi<cjd>)super.ec();
   }

   public static bxn.a m() {
      return bwi.C().a(bxo.s, 20.0).a(bxo.l, 0.1F).a(bxo.v, 0.1F).a(bxo.c, 2.0);
   }

   @Override
   protected cfs b(dhi $$0) {
      cfq $$1 = new cfq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
   }

   @Override
   public void a_(fby $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c(0.5));
         } else {
            this.a(this.fp(), $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if ($$1.d() instanceof cpx $$3) {
         Optional<UUID> $$4 = this.ec().c(cfk.aM);
         if ($$4.isPresent() && $$3.cG().equals($$4.get())) {
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   protected axe u() {
      return this.d(bvs.a) ? axf.a : axf.b;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.d;
   }

   @Override
   protected axe o_() {
      return axf.c;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cje.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.x() && this.gs() && this.af % 20 == 0) {
         this.x(false);
         this.cn = null;
      }

      this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         this.cq = this.cp;
         if (this.p()) {
            this.cp = bae.a(this.cp + 1.0F, 0.0F, 5.0F);
         } else {
            this.cp = bae.a(this.cp - 1.0F, 0.0F, 5.0F);
         }

         if (this.x()) {
            this.cr++;
            this.ct = this.cs;
            if (this.go()) {
               this.cs++;
            } else {
               this.cs--;
            }

            this.cs = bae.a(this.cs, 0.0F, 15.0F);
         } else {
            this.cr = 0.0F;
            this.cs = 0.0F;
            this.ct = 0.0F;
         }
      } else {
         eda.c.a(this.dW(), this.cj, this.ck);
         if (this.gl()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gr() && this.p();
   }

   public boolean p() {
      return !this.b(bti.a).f();
   }

   @Override
   protected boolean f(bvs $$0) {
      return false;
   }

   private boolean gr() {
      return this.ec().a(cfk.aP, cfl.a);
   }

   @Override
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      cxp $$3 = this.b(bti.a);
      if (this.x() && $$2.a(ayd.Y) && this.gw()) {
         this.gu();
         this.dW().a(this, (byte)18);
         this.dW().a($$0, this, axf.E, axg.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return btj.a;
      } else if ($$3.f() && !$$2.f()) {
         cxp $$4 = $$2.c(1);
         this.a(bti.a, $$4);
         this.a($$0, $$2);
         this.dW().a($$0, this, axf.e, axg.g, 2.0F, 1.0F);
         this.ec().a(cfk.aM, $$0.cG());
         return btj.a;
      } else if (!$$3.f() && $$1 == bti.a && $$2.f()) {
         this.a(bvs.a, cxp.j);
         this.dW().a($$0, this, axf.f, axg.g, 2.0F, 1.0F);
         this.a(bti.a);

         for (cxp $$5 : this.t().f()) {
            byb.a(this, $$5, this.du());
         }

         this.ec().b(cfk.aM);
         $$0.i($$3);
         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.x()) {
            this.cn = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cn) || this.cn == null) {
         this.cn = null;
         this.x(false);
      }
   }

   @Override
   public btq t() {
      return this.cm;
   }

   @Override
   protected kl V() {
      return ca;
   }

   @Override
   public boolean c(ash $$0, cxp $$1) {
      cxp $$2 = this.b(bti.a);
      return !$$2.f() && $$0.N().b(dhe.c) && this.cm.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cxp $$0, cxp $$1) {
      return cxp.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cxp $$0, cxp $$1) {
      czo $$2 = $$0.a(ku.Q);
      czo $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(ash $$0, cmb $$1) {
      cph.a($$0, this, this, $$1);
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<eco<?>, ash> $$0) {
      if (this.dW() instanceof ash $$1) {
         $$0.accept(this.ci, $$1);
         $$0.accept(this.cl, $$1);
      }
   }

   public boolean x() {
      return this.al.a(cg);
   }

   public void x(boolean $$0) {
      if (!this.dW().C && this.dk() && (!$$0 || !this.gl())) {
         this.al.a(cg, $$0);
      }
   }

   private boolean gs() {
      return this.cn == null || !this.cn.a(this.du(), (double)ecr.E.a().a()) || !this.dW().a_(this.cn).a(dko.eg);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cq, this.cp) / 5.0F;
   }

   public boolean go() {
      float $$0 = this.cr % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return bae.h($$0, this.ct, this.cs) / 15.0F;
   }

   @Override
   public boolean a(cxp $$0, cxp $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      this.cm.f().forEach($$1x -> this.a($$0, $$1x));
      cxp $$1 = this.a(bvs.a);
      if (!$$1.f() && !deb.a($$1, dea.D)) {
         this.a($$0, $$1);
         this.a(bvs.a, cxp.j);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.b($$0, this.dY());
      alx<vu> $$1 = this.dY().a(vl.a);
      eda.a.a
         .encodeStart($$1, this.cj)
         .resultOrPartial($$0x -> bZ.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.co);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      alx<vu> $$1 = this.dY().a(vl.a);
      if ($$0.b("listener", 10)) {
         eda.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bZ.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.cj = $$0x);
      }

      this.co = (long)$$0.h("DuplicationCooldown");
      this.al.a(ch, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gm() {
      return false;
   }

   private void gt() {
      if (this.co > 0L) {
         this.co--;
      }

      if (!this.dW().B_() && this.co == 0L && !this.gw()) {
         this.al.a(ch, true);
      }
   }

   private void gu() {
      cjd $$0 = bvr.c.a(this.dW(), bvq.e);
      if ($$0 != null) {
         $$0.e(this.du());
         $$0.ai();
         $$0.gv();
         this.gv();
         this.dW().b($$0);
      }
   }

   private void gv() {
      this.co = 6000L;
      this.al.a(ch, false);
   }

   private boolean gw() {
      return this.al.a(ch);
   }

   private void a(cpx $$0, cxp $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)this.cS() * 0.6, (double)this.dr() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gx();
         }
      } else {
         super.b($$0);
      }
   }

   private void gx() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dW().a(ls.Q, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public eda.a gp() {
      return this.cj;
   }

   @Override
   public eda.d gq() {
      return this.ck;
   }

   class a implements ect {
      private final ecv b;
      private final int c;

      public a(final ecv $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ecv a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ash $$0, jq<ecr> $$1, ecr.a $$2, fby $$3) {
         if ($$1.a(ecr.E)) {
            cjd.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(ecr.F)) {
            cjd.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements eda.d {
      private static final int b = 16;
      private final ecv c = new ecp(cjd.this, cjd.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ecv b() {
         return this.c;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecr> $$2, ecr.a $$3) {
         if (cjd.this.gb()) {
            return false;
         } else {
            Optional<jp> $$4 = cjd.this.ec().c(cfk.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a($$0.ah(), cjd.this.dw(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable bvk $$3, @Nullable bvk $$4, float $$5) {
         if ($$2.a(ecr.H)) {
            cje.a(cjd.this, new jh($$1));
         }
      }

      @Override
      public ayk<ecr> c() {
         return ayb.e;
      }
   }
}
