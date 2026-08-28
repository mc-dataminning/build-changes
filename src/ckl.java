import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ckl extends bxr implements cqt, efx {
   private static final ka bG = new ka(1, 1, 1);
   private static final int bH = 5;
   private static final float bI = 55.0F;
   private static final float bJ = 15.0F;
   private static final int bK = 6000;
   private static final int bL = 3;
   public static final int a = 1024;
   private static final akj<Boolean> bM = akn.a(ckl.class, akl.k);
   private static final akj<Boolean> bN = akn.a(ckl.class, akl.k);
   protected static final ImmutableList<chs<? extends chr<? super ckl>>> b = ImmutableList.of(chs.c, chs.d, chs.f, chs.b);
   protected static final ImmutableList<cgl<?>> c = ImmutableList.of(
      cgl.u, cgl.o, cgl.h, cgl.n, cgl.F, cgl.y, cgl.M, cgl.aN, cgl.aO, cgl.aP, cgl.aQ, cgl.aa, new cgl[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final efl<efx.b> bO;
   private efx.a bP;
   private final efx.d bQ;
   private final efl<ckl.a> bR;
   private final bun bS = new bun(1);
   @Nullable
   private iv bT;
   private long bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private float bZ;

   public ckl(bwr<? extends ckl> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new cdf(this, 20, true);
      this.a_(this.fM());
      this.bQ = new ckl.b();
      this.bP = new efx.a();
      this.bO = new efl<>(new efx.b(this));
      this.bR = new efl<>(new ckl.a(this.bQ.b(), efo.E.a().a()));
   }

   @Override
   protected byj.b<ckl> ec() {
      return byj.a(c, b);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return ckm.a(this.ec().a($$0));
   }

   @Override
   public byj<ckl> eb() {
      return (byj<ckl>)super.eb();
   }

   public static byo.a j() {
      return bxl.E().a(byp.s, 20.0).a(byp.l, 0.1F).a(byp.v, 0.1F).a(byp.c, 2.0);
   }

   @Override
   protected cgt b(djh $$0) {
      cgr $$1 = new cgr(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
      $$0.a(bN, true);
   }

   @Override
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(0.02F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.8F));
      } else if (this.bu()) {
         this.a(0.02F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.5));
      } else {
         this.a(this.fn(), $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.91F));
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwi $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwi $$0) {
      if (!($$0 instanceof crj $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eb().c(cgl.aN);
         return $$2.isPresent() && $$1.cF().equals($$2.get());
      }
   }

   @Override
   protected void b(iv $$0, eao $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, eao $$2, iv $$3) {
   }

   @Override
   protected awm u() {
      return this.d(bws.a) ? awn.a : awn.b;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.d;
   }

   @Override
   protected awm l_() {
      return awn.c;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      ckm.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C && this.bI() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gv() && this.af % 20 == 0) {
         this.w(false);
         this.bT = null;
      }

      this.gw();
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         this.bW = this.bV;
         if (this.m()) {
            this.bV = azm.a(this.bV + 1.0F, 0.0F, 5.0F);
         } else {
            this.bV = azm.a(this.bV - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bX++;
            this.bZ = this.bY;
            if (this.t()) {
               this.bY++;
            } else {
               this.bY--;
            }

            this.bY = azm.a(this.bY, 0.0F, 15.0F);
         } else {
            this.bX = 0.0F;
            this.bY = 0.0F;
            this.bZ = 0.0F;
         }
      } else {
         efx.c.a(this.dU(), this.bP, this.bQ);
         if (this.gq()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fM() {
      return !this.gu() && this.m();
   }

   public boolean m() {
      return !this.b(buf.a).f();
   }

   @Override
   protected boolean f(bws $$0) {
      return false;
   }

   private boolean gu() {
      return this.eb().a(cgl.aQ, cgm.a);
   }

   @Override
   protected bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      czk $$3 = this.b(buf.a);
      if (this.q() && $$2.a(axk.W) && this.gz()) {
         this.gx();
         this.dU().a(this, (byte)18);
         this.dU().a($$0, this, awn.E, awo.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bug.a;
      } else if ($$3.f() && !$$2.f()) {
         czk $$4 = $$2.c(1);
         this.a(buf.a, $$4);
         this.a($$0, $$2);
         this.dU().a($$0, this, awn.e, awo.g, 2.0F, 1.0F);
         this.eb().a(cgl.aN, $$0.cF());
         return bug.a;
      } else if (!$$3.f() && $$1 == buf.a && $$2.f()) {
         this.a(bws.a, czk.k);
         this.dU().a($$0, this, awn.f, awo.g, 2.0F, 1.0F);
         this.a(buf.a);

         for (czk $$5 : this.n().f()) {
            bzc.a(this, $$5, this.ds());
         }

         this.eb().b(cgl.aN);
         $$0.h($$3);
         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iv $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bT = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bT) || this.bT == null) {
         this.bT = null;
         this.w(false);
      }
   }

   @Override
   public bun n() {
      return this.bS;
   }

   @Override
   protected ka X() {
      return bG;
   }

   @Override
   public boolean c(arq $$0, czk $$1) {
      czk $$2 = this.b(buf.a);
      return !$$2.f() && $$0.O().c(djd.d) && this.bS.c($$1) && this.c($$2, $$1);
   }

   private boolean c(czk $$0, czk $$1) {
      return czk.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(czk $$0, czk $$1) {
      dbg $$2 = $$0.a(kk.R);
      dbg $$3 = $$1.a(kk.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arq $$0, cno $$1) {
      cqt.a($$0, this, this, $$1);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public boolean aY() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<efl<?>, arq> $$0) {
      if (this.dU() instanceof arq $$1) {
         $$0.accept(this.bO, $$1);
         $$0.accept(this.bR, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      if (!this.dU().C && this.di() && (!$$0 || !this.gq())) {
         this.al.a(bM, $$0);
      }
   }

   private boolean gv() {
      return this.bT == null || !this.bT.a(this.ds(), (double)efo.E.a().a()) || !this.dU().a_(this.bT).a(dmo.ek);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bW, this.bV) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bX % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, this.bZ, this.bY) / 15.0F;
   }

   @Override
   public boolean a(czk $$0, czk $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      this.bS.f().forEach($$1x -> this.a($$0, $$1x));
      czk $$1 = this.a(bws.a);
      if (!$$1.f() && !dfz.a($$1, dfy.D)) {
         this.a($$0, $$1);
         this.a(bws.a, czk.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.b($$0, this.dW());
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("listener", efx.a.a, $$1, this.bP);
      $$0.a("DuplicationCooldown", this.bU);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dW());
      ale<uw> $$1 = this.dW().a(un.a);
      this.bP = $$0.<efx.a>a("listener", efx.a.a, $$1).orElseGet(efx.a::new);
      this.a((long)$$0.f("DuplicationCooldown"));
   }

   @Override
   protected boolean gr() {
      return false;
   }

   private void gw() {
      if (!this.dU().w_() && this.bU > 0L) {
         this.a(this.bU - 1L);
      }
   }

   private void a(long $$0) {
      this.bU = $$0;
      this.al.a(bN, $$0 == 0L);
   }

   private void gx() {
      ckl $$0 = bwr.c.a(this.dU(), bwq.e);
      if ($$0 != null) {
         $$0.f(this.ds());
         $$0.gb();
         $$0.gy();
         this.gy();
         this.dU().b($$0);
      }
   }

   private void gy() {
      this.a(6000L);
   }

   private boolean gz() {
      return this.al.a(bN);
   }

   private void a(crj $$0, czk $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)this.cR() * 0.6, (double)this.dp() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gA();
         }
      } else {
         super.b($$0);
      }
   }

   private void gA() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dU().a(ly.S, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public efx.a x() {
      return this.bP;
   }

   @Override
   public efx.d gt() {
      return this.bQ;
   }

   class a implements efq {
      private final efs b;
      private final int c;

      public a(final efs $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public efs a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, jf<efo> $$1, efo.a $$2, fex $$3) {
         if ($$1.a(efo.E)) {
            ckl.this.b(iv.a((jp)$$3), true);
            return true;
         } else if ($$1.a(efo.F)) {
            ckl.this.b(iv.a((jp)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements efx.d {
      private static final int b = 16;
      private final efs c = new efm(ckl.this, ckl.this.cR());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efs b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<efo> $$2, efo.a $$3) {
         if (ckl.this.gi()) {
            return false;
         } else {
            Optional<je> $$4 = ckl.this.eb().c(cgl.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               je $$5 = $$4.get();
               return $$5.a($$0.aj(), ckl.this.du(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arq $$0, iv $$1, jf<efo> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         if ($$2.a(efo.H)) {
            ckm.a(ckl.this, new iv($$1));
         }
      }

      @Override
      public axr<efo> c() {
         return axi.e;
      }
   }
}
