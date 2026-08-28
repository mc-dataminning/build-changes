import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjc extends bwn implements cpg, ecz {
   private static final Logger d = LogUtils.getLogger();
   private static final kl bZ = new kl(1, 1, 1);
   private static final int ca = 5;
   private static final float cb = 55.0F;
   private static final float cc = 15.0F;
   private static final int cd = 6000;
   private static final int ce = 3;
   private static final alc<Boolean> cf = alg.a(cjc.class, ale.k);
   private static final alc<Boolean> cg = alg.a(cjc.class, ale.k);
   protected static final ImmutableList<cgq<? extends cgp<? super cjc>>> a = ImmutableList.of(cgq.c, cgq.d, cgq.f, cgq.b);
   protected static final ImmutableList<cfj<?>> b = ImmutableList.of(
      cfj.t, cfj.n, cfj.h, cfj.m, cfj.E, cfj.x, cfj.L, cfj.aM, cfj.aN, cfj.aO, cfj.aP, cfj.Z, new cfj[0]
   );
   public static final ImmutableList<Float> c = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ecn<ecz.b> ch;
   private ecz.a ci;
   private final ecz.d cj;
   private final ecn<cjc.a> ck;
   private final btp cl = new btp(1);
   @Nullable
   private jh cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cjc(bvq<? extends cjc> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new ccd(this, 20, true);
      this.a_(this.fL());
      this.cj = new cjc.b();
      this.ci = new ecz.a();
      this.ch = new ecn<>(new ecz.b(this));
      this.ck = new ecn<>(new cjc.a(this.cj.b(), ecq.E.a().a()));
   }

   @Override
   protected bxh.b<cjc> ec() {
      return bxh.a(b, a);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cjd.a(this.ec().a($$0));
   }

   @Override
   public bxh<cjc> eb() {
      return (bxh<cjc>)super.eb();
   }

   public static bxm.a m() {
      return bwh.C().a(bxn.s, 20.0).a(bxn.l, 0.1F).a(bxn.v, 0.1F).a(bxn.c, 2.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      cfp $$1 = new cfp(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bwj.a, this.dy());
            this.h(this.dy().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bwj.a, this.dy());
            this.h(this.dy().c(0.5));
         } else {
            this.a(this.fn(), $$0);
            this.a(bwj.a, this.dy());
            this.h(this.dy().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if ($$1.d() instanceof cpw $$3) {
         Optional<UUID> $$4 = this.eb().c(cfj.aM);
         if ($$4.isPresent() && $$3.cG().equals($$4.get())) {
            return false;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dxu $$2, jh $$3) {
   }

   @Override
   protected axe u() {
      return this.d(bvr.a) ? axf.a : axf.b;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.d;
   }

   @Override
   protected axe o_() {
      return axf.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cjd.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.x() && this.gq() && this.af % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gr();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.cp = this.co;
         if (this.p()) {
            this.co = bae.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = bae.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.x()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gm()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = bae.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         ecz.c.a(this.dV(), this.ci, this.cj);
         if (this.gj()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fL() {
      return !this.gp() && this.p();
   }

   public boolean p() {
      return !this.b(bth.a).f();
   }

   @Override
   protected boolean f(bvr $$0) {
      return false;
   }

   private boolean gp() {
      return this.eb().a(cfj.aP, cfk.a);
   }

   @Override
   protected bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      cxo $$3 = this.b(bth.a);
      if (this.x() && $$2.a(ayd.Y) && this.gu()) {
         this.gs();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, axf.E, axg.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bti.a;
      } else if ($$3.f() && !$$2.f()) {
         cxo $$4 = $$2.c(1);
         this.a(bth.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, axf.e, axg.g, 2.0F, 1.0F);
         this.eb().a(cfj.aM, $$0.cG());
         return bti.a;
      } else if (!$$3.f() && $$1 == bth.a && $$2.f()) {
         this.a(bvr.a, cxo.k);
         this.dV().a($$0, this, axf.f, axg.g, 2.0F, 1.0F);
         this.a(bth.a);

         for (cxo $$5 : this.t().f()) {
            bya.a(this, $$5, this.dt());
         }

         this.eb().b(cfj.aM);
         $$0.i($$3);
         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jh $$0, boolean $$1) {
      if ($$1) {
         if (!this.x()) {
            this.cm = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.x(false);
      }
   }

   @Override
   public btp t() {
      return this.cl;
   }

   @Override
   protected kl V() {
      return bZ;
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      cxo $$2 = this.b(bth.a);
      return !$$2.f() && $$0.N().b(dhd.c) && this.cl.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cxo $$0, cxo $$1) {
      return cxo.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cxo $$0, cxo $$1) {
      czn $$2 = $$0.a(ku.Q);
      czn $$3 = $$1.a(ku.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      cpg.a($$0, this, this, $$1);
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
   public void a(BiConsumer<ecn<?>, ash> $$0) {
      if (this.dV() instanceof ash $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean x() {
      return this.al.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gj())) {
         this.al.a(cf, $$0);
      }
   }

   private boolean gq() {
      return this.cm == null || !this.cm.a(this.dt(), (double)ecq.E.a().a()) || !this.dV().a_(this.cm).a(dkn.eg);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gm() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return bae.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cxo $$0, cxo $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      this.cl.f().forEach($$1x -> this.a($$0, $$1x));
      cxo $$1 = this.a(bvr.a);
      if (!$$1.f() && !dea.a($$1, ddz.D)) {
         this.a($$0, $$1);
         this.a(bvr.a, cxo.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alx<vu> $$1 = this.dX().a(vl.a);
      ecz.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> d.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gu());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alx<vu> $$1 = this.dX().a(vl.a);
      if ($$0.b("listener", 10)) {
         ecz.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> d.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.al.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gk() {
      return false;
   }

   private void gr() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dV().B_() && this.cn == 0L && !this.gu()) {
         this.al.a(cg, true);
      }
   }

   private void gs() {
      cjc $$0 = bvq.c.a(this.dV(), bvp.e);
      if ($$0 != null) {
         $$0.e(this.dt());
         $$0.ai();
         $$0.gt();
         this.gt();
         this.dV().b($$0);
      }
   }

   private void gt() {
      this.cn = 6000L;
      this.al.a(cg, false);
   }

   private boolean gu() {
      return this.al.a(cg);
   }

   private void a(cpw $$0, cxo $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gv();
         }
      } else {
         super.b($$0);
      }
   }

   private void gv() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public ecz.a gn() {
      return this.ci;
   }

   @Override
   public ecz.d go() {
      return this.cj;
   }

   class a implements ecs {
      private final ecu b;
      private final int c;

      public a(final ecu $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ecu a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ash $$0, jq<ecq> $$1, ecq.a $$2, fbx $$3) {
         if ($$1.a(ecq.E)) {
            cjc.this.b(jh.a((ka)$$3), true);
            return true;
         } else if ($$1.a(ecq.F)) {
            cjc.this.b(jh.a((ka)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements ecz.d {
      private static final int b = 16;
      private final ecu c = new eco(cjc.this, cjc.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ecu b() {
         return this.c;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecq> $$2, ecq.a $$3) {
         if (cjc.this.fZ()) {
            return false;
         } else {
            Optional<jp> $$4 = cjc.this.eb().c(cfj.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jp $$5 = $$4.get();
               return $$5.a().equals($$0.ah()) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecq> $$2, @Nullable bvj $$3, @Nullable bvj $$4, float $$5) {
         if ($$2.a(ecq.H)) {
            cjd.a(cjc.this, new jh($$1));
         }
      }

      @Override
      public ayk<ecq> c() {
         return ayb.e;
      }
   }
}
