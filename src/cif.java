import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cif extends bvq implements coh, ecd {
   private static final Logger bY = LogUtils.getLogger();
   private static final km bZ = new km(1, 1, 1);
   private static final int ca = 5;
   private static final float cb = 55.0F;
   private static final float cc = 15.0F;
   private static final int cd = 6000;
   private static final int ce = 3;
   public static final int a = 1024;
   private static final ajy<Boolean> cf = akc.a(cif.class, aka.k);
   private static final ajy<Boolean> cg = akc.a(cif.class, aka.k);
   protected static final ImmutableList<cft<? extends cfs<? super cif>>> b = ImmutableList.of(cft.c, cft.d, cft.f, cft.b);
   protected static final ImmutableList<cem<?>> c = ImmutableList.of(
      cem.t, cem.n, cem.h, cem.m, cem.E, cem.x, cem.L, cem.aM, cem.aN, cem.aO, cem.aP, cem.Z, new cem[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final ebr<ecd.b> ch;
   private ecd.a ci;
   private final ecd.d cj;
   private final ebr<cif.a> ck;
   private final bss cl = new bss(1);
   @Nullable
   private ji cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public cif(but<? extends cif> $$0, dgj $$1) {
      super($$0, $$1);
      this.bP = new cbg(this, 20, true);
      this.a_(this.fN());
      this.cj = new cif.b();
      this.ci = new ecd.a();
      this.ch = new ebr<>(new ecd.b(this));
      this.ck = new ebr<>(new cif.a(this.cj.b(), ebu.E.a().a()));
   }

   @Override
   protected bwk.b<cif> ec() {
      return bwk.a(c, b);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cig.a(this.ec().a($$0));
   }

   @Override
   public bwk<cif> eb() {
      return (bwk<cif>)super.eb();
   }

   public static bwp.a m() {
      return bvk.F().a(bwq.s, 20.0).a(bwq.l, 0.1F).a(bwq.v, 0.1F).a(bwq.c, 2.0);
   }

   @Override
   protected ceu b(dgj $$0) {
      ces $$1 = new ces(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cf, false);
      $$0.a(cg, true);
   }

   @Override
   public void a_(fbb $$0) {
      if (this.dh()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bvm.a, this.dy());
            this.i(this.dy().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bvm.a, this.dy());
            this.i(this.dy().c(0.5));
         } else {
            this.a(this.fp(), $$0);
            this.a(bvm.a, this.dy());
            this.i(this.dy().c(0.91F));
         }
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bum $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bum $$0) {
      if (!($$0 instanceof coy $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eb().c(cem.aM);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dwy $$2, ji $$3) {
   }

   @Override
   protected avz u() {
      return this.d(buu.a) ? awa.a : awa.b;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.d;
   }

   @Override
   protected avz o_() {
      return awa.c;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cig.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C && this.bL() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.x() && this.gw() && this.af % 20 == 0) {
         this.x(false);
         this.cm = null;
      }

      this.gx();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.cp = this.co;
         if (this.p()) {
            this.co = ayz.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ayz.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.x()) {
            this.cq++;
            this.cs = this.cr;
            if (this.gs()) {
               this.cr++;
            } else {
               this.cr--;
            }

            this.cr = ayz.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         ecd.c.a(this.dV(), this.ci, this.cj);
         if (this.gp()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gv() && this.p();
   }

   public boolean p() {
      return !this.b(bsk.a).f();
   }

   @Override
   protected boolean f(buu $$0) {
      return false;
   }

   private boolean gv() {
      return this.eb().a(cem.aP, cen.a);
   }

   @Override
   protected bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      cwq $$3 = this.b(bsk.a);
      if (this.x() && $$2.a(awy.W) && this.gA()) {
         this.gy();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awa.E, awb.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bsl.a;
      } else if ($$3.f() && !$$2.f()) {
         cwq $$4 = $$2.c(1);
         this.a(bsk.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awa.e, awb.g, 2.0F, 1.0F);
         this.eb().a(cem.aM, $$0.cG());
         return bsl.a;
      } else if (!$$3.f() && $$1 == bsk.a && $$2.f()) {
         this.a(buu.a, cwq.j);
         this.dV().a($$0, this, awa.f, awb.g, 2.0F, 1.0F);
         this.a(bsk.a);

         for (cwq $$5 : this.t().f()) {
            bxd.a(this, $$5, this.dt());
         }

         this.eb().b(cem.aM);
         $$0.i($$3);
         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(ji $$0, boolean $$1) {
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
   public bss t() {
      return this.cl;
   }

   @Override
   protected km Y() {
      return bZ;
   }

   @Override
   public boolean c(ard $$0, cwq $$1) {
      cwq $$2 = this.b(bsk.a);
      return !$$2.f() && $$0.O().b(dgf.c) && this.cl.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cwq $$0, cwq $$1) {
      return cwq.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cwq $$0, cwq $$1) {
      cyp $$2 = $$0.a(kv.Q);
      cyp $$3 = $$1.a(kv.Q);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      coh.a($$0, this, this, $$1);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<ebr<?>, ard> $$0) {
      if (this.dV() instanceof ard $$1) {
         $$0.accept(this.ch, $$1);
         $$0.accept(this.ck, $$1);
      }
   }

   public boolean x() {
      return this.al.a(cf);
   }

   public void x(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gp())) {
         this.al.a(cf, $$0);
      }
   }

   private boolean gw() {
      return this.cm == null || !this.cm.a(this.dt(), (double)ebu.E.a().a()) || !this.dV().a_(this.cm).a(djp.eg);
   }

   public float J(float $$0) {
      return ayz.h($$0, this.cp, this.co) / 5.0F;
   }

   public boolean gs() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   public boolean a(cwq $$0, cwq $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      this.cl.f().forEach($$1x -> this.a($$0, $$1x));
      cwq $$1 = this.a(buu.a);
      if (!$$1.f() && !ddc.a($$1, ddb.D)) {
         this.a($$0, $$1);
         this.a(buu.a, cwq.j);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      akt<un> $$1 = this.dX().a(ue.a);
      ecd.a.a
         .encodeStart($$1, this.ci)
         .resultOrPartial($$0x -> bY.error("Failed to encode vibration listener for Allay: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.gA());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      akt<un> $$1 = this.dX().a(ue.a);
      if ($$0.b("listener", 10)) {
         ecd.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bY.error("Failed to parse vibration listener for Allay: '{}'", $$0x))
            .ifPresent($$0x -> this.ci = $$0x);
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.al.a(cg, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gq() {
      return false;
   }

   private void gx() {
      if (this.cn > 0L) {
         this.cn--;
      }

      if (!this.dV().B_() && this.cn == 0L && !this.gA()) {
         this.al.a(cg, true);
      }
   }

   private void gy() {
      cif $$0 = but.c.a(this.dV(), bus.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.fY();
         $$0.gz();
         this.gz();
         this.dV().b($$0);
      }
   }

   private void gz() {
      this.cn = 6000L;
      this.al.a(cg, false);
   }

   private boolean gA() {
      return this.al.a(cg);
   }

   private void a(coy $$0, cwq $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gB();
         }
      } else {
         super.b($$0);
      }
   }

   private void gB() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(lt.R, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public ecd.a gt() {
      return this.ci;
   }

   @Override
   public ecd.d gu() {
      return this.cj;
   }

   class a implements ebw {
      private final eby b;
      private final int c;

      public a(final eby $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public eby a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ard $$0, jr<ebu> $$1, ebu.a $$2, fbb $$3) {
         if ($$1.a(ebu.E)) {
            cif.this.b(ji.a((kb)$$3), true);
            return true;
         } else if ($$1.a(ebu.F)) {
            cif.this.b(ji.a((kb)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements ecd.d {
      private static final int b = 16;
      private final eby c = new ebs(cif.this, cif.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eby b() {
         return this.c;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebu> $$2, ebu.a $$3) {
         if (cif.this.gf()) {
            return false;
         } else {
            Optional<jq> $$4 = cif.this.eb().c(cem.aN);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jq $$5 = $$4.get();
               return $$5.a($$0.ai(), cif.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable bum $$3, @Nullable bum $$4, float $$5) {
         if ($$2.a(ebu.H)) {
            cig.a(cif.this, new ji($$1));
         }
      }

      @Override
      public axf<ebu> c() {
         return aww.e;
      }
   }
}
