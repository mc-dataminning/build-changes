import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cle extends byn implements crs, egz {
   private static final kb e = new kb(1, 1, 1);
   private static final int bI = 5;
   private static final float bJ = 55.0F;
   private static final float bK = 15.0F;
   private static final int bL = 0;
   private static final int bM = 6000;
   private static final int bN = 3;
   public static final int a = 1024;
   private static final aku<Boolean> bO = aky.a(cle.class, akw.k);
   private static final aku<Boolean> bP = aky.a(cle.class, akw.k);
   protected static final ImmutableList<cio<? extends cin<? super cle>>> b = ImmutableList.of(cio.c, cio.d, cio.f, cio.b);
   protected static final ImmutableList<chh<?>> c = ImmutableList.of(
      chh.u, chh.o, chh.h, chh.n, chh.F, chh.y, chh.M, chh.aN, chh.aO, chh.aP, chh.aQ, chh.aa, new chh[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final egn<egz.b> bQ;
   private egz.a bR;
   private final egz.d bS;
   private final egn<cle.a> bT;
   private final bvj bU = new bvj(1);
   @Nullable
   private iw bV;
   private long bW = 0L;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;

   public cle(bxn<? extends cle> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceb(this, 20, true);
      this.a_(this.fN());
      this.bS = new cle.b();
      this.bR = new egz.a();
      this.bQ = new egn<>(new egz.b(this));
      this.bT = new egn<>(new cle.a(this.bS.b(), egq.E.a().a()));
   }

   @Override
   protected bzf.b<cle> ed() {
      return bzf.a(c, b);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return clf.a(this.ed().a($$0));
   }

   @Override
   public bzf<cle> ec() {
      return (bzf<cle>)super.ec();
   }

   public static bzk.a j() {
      return byh.E().a(bzl.s, 20.0).a(bzl.l, 0.1F).a(bzl.v, 0.1F).a(bzl.c, 2.0);
   }

   @Override
   protected chp b(dkj $$0) {
      chn $$1 = new chn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bO, false);
      $$0.a(bP, true);
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(0.02F, $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fo(), $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bxe $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bxe $$0) {
      if (!($$0 instanceof csi $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ec().c(chh.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
   }

   @Override
   protected awx u() {
      return this.d(bxo.a) ? awy.a : awy.b;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.d;
   }

   @Override
   protected awx l_() {
      return awy.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      clf.a(this);
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
            this.bX = azz.a(this.bX + 1.0F, 0.0F, 5.0F);
         } else {
            this.bX = azz.a(this.bX - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bZ++;
            this.cb = this.ca;
            if (this.t()) {
               this.ca++;
            } else {
               this.ca--;
            }

            this.ca = azz.a(this.ca, 0.0F, 15.0F);
         } else {
            this.bZ = 0.0F;
            this.ca = 0.0F;
            this.cb = 0.0F;
         }
      } else {
         egz.c.a(this.dV(), this.bR, this.bS);
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
      return !this.b(bvb.a).f();
   }

   @Override
   protected boolean f(bxo $$0) {
      return false;
   }

   private boolean gv() {
      return this.ec().a(chh.aQ, chi.a);
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      dak $$3 = this.b(bvb.a);
      if (this.q() && $$2.a(axv.X) && this.gA()) {
         this.gy();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awy.E, awz.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bvc.a;
      } else if ($$3.f() && !$$2.f()) {
         dak $$4 = $$2.c(1);
         this.a(bvb.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awy.e, awz.g, 2.0F, 1.0F);
         this.ec().a(chh.aN, $$0.cG());
         return bvc.a;
      } else if (!$$3.f() && $$1 == bvb.a && $$2.f()) {
         this.a(bxo.a, dak.l);
         this.dV().a($$0, this, awy.f, awz.g, 2.0F, 1.0F);
         this.a(bvb.a);

         for (dak $$5 : this.n().f()) {
            bzy.a(this, $$5, this.dt());
         }

         this.ec().b(chh.aN);
         $$0.h($$3);
         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iw $$0, boolean $$1) {
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
   public bvj n() {
      return this.bU;
   }

   @Override
   protected kb X() {
      return e;
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      dak $$2 = this.b(bvb.a);
      return !$$2.f() && $$0.O().c(dkf.d) && this.bU.c($$1) && this.c($$2, $$1);
   }

   private boolean c(dak $$0, dak $$1) {
      return dak.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(dak $$0, dak $$1) {
      dcg $$2 = $$0.a(kl.R);
      dcg $$3 = $$1.a(kl.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      crs.a($$0, this, this, $$1);
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<egn<?>, asb> $$0) {
      if (this.dV() instanceof asb $$1) {
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
      return this.bV == null || !this.bV.a(this.dt(), (double)egq.E.a().a()) || !this.dV().a_(this.bV).a(dnq.ek);
   }

   public float J(float $$0) {
      return azz.h($$0, this.bY, this.bX) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bZ % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azz.h($$0, this.cb, this.ca) / 15.0F;
   }

   @Override
   public boolean a(dak $$0, dak $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(asb $$0) {
      super.f($$0);
      this.bU.f().forEach($$1x -> this.a($$0, $$1x));
      dak $$1 = this.a(bxo.a);
      if (!$$1.f() && !dgz.a($$1, dgy.D)) {
         this.a($$0, $$1);
         this.a(bxo.a, dak.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("listener", egz.a.a, $$1, this.bR);
      $$0.a("DuplicationCooldown", this.bW);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      alp<va> $$1 = this.dX().a(uo.a);
      this.bR = $$0.<egz.a>a("listener", egz.a.a, $$1).orElseGet(egz.a::new);
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
      cle $$0 = bxn.d.a(this.dV(), bxm.e);
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

   private void a(csi $$0, dak $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
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
      this.dV().a(lz.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public egz.a x() {
      return this.bR;
   }

   @Override
   public egz.d gu() {
      return this.bS;
   }

   class a implements egs {
      private final egu b;
      private final int c;

      public a(final egu $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public egu a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(asb $$0, jg<egq> $$1, egq.a $$2, fgc $$3) {
         if ($$1.a(egq.E)) {
            cle.this.b(iw.a((jq)$$3), true);
            return true;
         } else if ($$1.a(egq.F)) {
            cle.this.b(iw.a((jq)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements egz.d {
      private static final int b = 16;
      private final egu c = new ego(cle.this, cle.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egu b() {
         return this.c;
      }

      @Override
      public boolean a(asb $$0, iw $$1, jg<egq> $$2, egq.a $$3) {
         if (cle.this.gj()) {
            return false;
         } else {
            Optional<jf> $$4 = cle.this.ec().c(chh.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jf $$5 = $$4.get();
               return $$5.a($$0.aj(), cle.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(asb $$0, iw $$1, jg<egq> $$2, @Nullable bxe $$3, @Nullable bxe $$4, float $$5) {
         if ($$2.a(egq.H)) {
            clf.a(cle.this, new iw($$1));
         }
      }

      @Override
      public ayc<egq> c() {
         return axt.e;
      }
   }
}
