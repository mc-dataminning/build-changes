import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ckt extends byc implements crh, egn {
   private static final ka e = new ka(1, 1, 1);
   private static final int bI = 5;
   private static final float bJ = 55.0F;
   private static final float bK = 15.0F;
   private static final int bL = 0;
   private static final int bM = 6000;
   private static final int bN = 3;
   public static final int a = 1024;
   private static final akl<Boolean> bO = akp.a(ckt.class, akn.k);
   private static final akl<Boolean> bP = akp.a(ckt.class, akn.k);
   protected static final ImmutableList<cid<? extends cic<? super ckt>>> b = ImmutableList.of(cid.c, cid.d, cid.f, cid.b);
   protected static final ImmutableList<cgw<?>> c = ImmutableList.of(
      cgw.u, cgw.o, cgw.h, cgw.n, cgw.F, cgw.y, cgw.M, cgw.aN, cgw.aO, cgw.aP, cgw.aQ, cgw.aa, new cgw[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final egb<egn.b> bQ;
   private egn.a bR;
   private final egn.d bS;
   private final egb<ckt.a> bT;
   private final buy bU = new buy(1);
   @Nullable
   private iv bV;
   private long bW = 0L;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;

   public ckt(bxc<? extends ckt> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cdq(this, 20, true);
      this.a_(this.fN());
      this.bS = new ckt.b();
      this.bR = new egn.a();
      this.bQ = new egb<>(new egn.b(this));
      this.bT = new egb<>(new ckt.a(this.bS.b(), ege.E.a().a()));
   }

   @Override
   protected byu.b<ckt> ed() {
      return byu.a(c, b);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cku.a(this.ed().a($$0));
   }

   @Override
   public byu<ckt> ec() {
      return (byu<ckt>)super.ec();
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 20.0).a(bza.l, 0.1F).a(bza.v, 0.1F).a(bza.c, 2.0);
   }

   @Override
   protected che b(djx $$0) {
      chc $$1 = new chc(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bO, false);
      $$0.a(bP, true);
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(0.02F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fo(), $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwt $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwt $$0) {
      if (!($$0 instanceof crx $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ec().c(cgw.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
   }

   @Override
   protected awo u() {
      return this.d(bxd.a) ? awp.a : awp.b;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.d;
   }

   @Override
   protected awo l_() {
      return awp.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cku.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bJ() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gw() && this.af % 20 == 0) {
         this.w(false);
         this.bV = null;
      }

      this.gx();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.bY = this.bX;
         if (this.m()) {
            this.bX = azo.a(this.bX + 1.0F, 0.0F, 5.0F);
         } else {
            this.bX = azo.a(this.bX - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bZ++;
            this.cb = this.ca;
            if (this.t()) {
               this.ca++;
            } else {
               this.ca--;
            }

            this.ca = azo.a(this.ca, 0.0F, 15.0F);
         } else {
            this.bZ = 0.0F;
            this.ca = 0.0F;
            this.cb = 0.0F;
         }
      } else {
         egn.c.a(this.dV(), this.bR, this.bS);
         if (this.gr()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gv() && this.m();
   }

   public boolean m() {
      return !this.b(buq.a).f();
   }

   @Override
   protected boolean f(bxd $$0) {
      return false;
   }

   private boolean gv() {
      return this.ec().a(cgw.aQ, cgx.a);
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      czy $$3 = this.b(buq.a);
      if (this.q() && $$2.a(axm.W) && this.gA()) {
         this.gy();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awp.E, awq.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bur.a;
      } else if ($$3.f() && !$$2.f()) {
         czy $$4 = $$2.c(1);
         this.a(buq.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awp.e, awq.g, 2.0F, 1.0F);
         this.ec().a(cgw.aN, $$0.cG());
         return bur.a;
      } else if (!$$3.f() && $$1 == buq.a && $$2.f()) {
         this.a(bxd.a, czy.k);
         this.dV().a($$0, this, awp.f, awq.g, 2.0F, 1.0F);
         this.a(buq.a);

         for (czy $$5 : this.n().f()) {
            bzn.a(this, $$5, this.dt());
         }

         this.ec().b(cgw.aN);
         $$0.h($$3);
         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iv $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bV = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bV) || this.bV == null) {
         this.bV = null;
         this.w(false);
      }
   }

   @Override
   public buy n() {
      return this.bU;
   }

   @Override
   protected ka X() {
      return e;
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      czy $$2 = this.b(buq.a);
      return !$$2.f() && $$0.O().c(djt.d) && this.bU.c($$1) && this.c($$2, $$1);
   }

   private boolean c(czy $$0, czy $$1) {
      return czy.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(czy $$0, czy $$1) {
      dbu $$2 = $$0.a(kk.R);
      dbu $$3 = $$1.a(kk.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      crh.a($$0, this, this, $$1);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<egb<?>, ars> $$0) {
      if (this.dV() instanceof ars $$1) {
         $$0.accept(this.bQ, $$1);
         $$0.accept(this.bT, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bO);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gr())) {
         this.al.a(bO, $$0);
      }
   }

   private boolean gw() {
      return this.bV == null || !this.bV.a(this.dt(), (double)ege.E.a().a()) || !this.dV().a_(this.bV).a(dne.ek);
   }

   public float J(float $$0) {
      return azo.h($$0, this.bY, this.bX) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bZ % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azo.h($$0, this.cb, this.ca) / 15.0F;
   }

   @Override
   public boolean a(czy $$0, czy $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(ars $$0) {
      super.f($$0);
      this.bU.f().forEach($$1x -> this.a($$0, $$1x));
      czy $$1 = this.a(bxd.a);
      if (!$$1.f() && !dgn.a($$1, dgm.D)) {
         this.a($$0, $$1);
         this.a(bxd.a, czy.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("listener", egn.a.a, $$1, this.bR);
      $$0.a("DuplicationCooldown", this.bW);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alg<uy> $$1 = this.dX().a(un.a);
      this.bR = $$0.<egn.a>a("listener", egn.a.a, $$1).orElseGet(egn.a::new);
      this.a((long)$$0.b("DuplicationCooldown", 0));
   }

   @Override
   protected boolean gs() {
      return false;
   }

   private void gx() {
      if (!this.dV().A_() && this.bW > 0L) {
         this.a(this.bW - 1L);
      }
   }

   private void a(long $$0) {
      this.bW = $$0;
      this.al.a(bP, $$0 == 0L);
   }

   private void gy() {
      ckt $$0 = bxc.d.a(this.dV(), bxb.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.gc();
         $$0.gz();
         this.gz();
         this.dV().b($$0);
      }
   }

   private void gz() {
      this.a(6000L);
   }

   private boolean gA() {
      return this.al.a(bP);
   }

   private void a(crx $$0, czy $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
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
      this.dV().a(ly.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public egn.a x() {
      return this.bR;
   }

   @Override
   public egn.d gu() {
      return this.bS;
   }

   class a implements egg {
      private final egi b;
      private final int c;

      public a(final egi $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public egi a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(ars $$0, jf<ege> $$1, ege.a $$2, ffq $$3) {
         if ($$1.a(ege.E)) {
            ckt.this.b(iv.a((jp)$$3), true);
            return true;
         } else if ($$1.a(ege.F)) {
            ckt.this.b(iv.a((jp)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements egn.d {
      private static final int b = 16;
      private final egi c = new egc(ckt.this, ckt.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egi b() {
         return this.c;
      }

      @Override
      public boolean a(ars $$0, iv $$1, jf<ege> $$2, ege.a $$3) {
         if (ckt.this.gj()) {
            return false;
         } else {
            Optional<je> $$4 = ckt.this.ec().c(cgw.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               je $$5 = $$4.get();
               return $$5.a($$0.aj(), ckt.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(ars $$0, iv $$1, jf<ege> $$2, @Nullable bwt $$3, @Nullable bwt $$4, float $$5) {
         if ($$2.a(ege.H)) {
            cku.a(ckt.this, new iv($$1));
         }
      }

      @Override
      public axt<ege> c() {
         return axk.e;
      }
   }
}
