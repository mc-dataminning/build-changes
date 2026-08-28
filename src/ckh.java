import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ckh extends bxm implements cqm, efq {
   private static final jz bG = new jz(1, 1, 1);
   private static final int bH = 5;
   private static final float bI = 55.0F;
   private static final float bJ = 15.0F;
   private static final int bK = 6000;
   private static final int bL = 3;
   public static final int a = 1024;
   private static final akj<Boolean> bM = akn.a(ckh.class, akl.k);
   private static final akj<Boolean> bN = akn.a(ckh.class, akl.k);
   protected static final ImmutableList<chn<? extends chm<? super ckh>>> b = ImmutableList.of(chn.c, chn.d, chn.f, chn.b);
   protected static final ImmutableList<cgg<?>> c = ImmutableList.of(
      cgg.u, cgg.o, cgg.h, cgg.n, cgg.F, cgg.y, cgg.M, cgg.aN, cgg.aO, cgg.aP, cgg.aQ, cgg.aa, new cgg[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final efe<efq.b> bO;
   private efq.a bP;
   private final efq.d bQ;
   private final efe<ckh.a> bR;
   private final buk bS = new buk(1);
   @Nullable
   private iu bT;
   private long bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;
   private float bZ;

   public ckh(bwo<? extends ckh> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cda(this, 20, true);
      this.a_(this.fN());
      this.bQ = new ckh.b();
      this.bP = new efq.a();
      this.bO = new efe<>(new efq.b(this));
      this.bR = new efe<>(new ckh.a(this.bQ.b(), efh.E.a().a()));
   }

   @Override
   protected bye.b<ckh> ed() {
      return bye.a(c, b);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cki.a(this.ed().a($$0));
   }

   @Override
   public bye<ckh> ec() {
      return (bye<ckh>)super.ec();
   }

   public static byj.a j() {
      return bxg.E().a(byk.s, 20.0).a(byk.l, 0.1F).a(byk.v, 0.1F).a(byk.c, 2.0);
   }

   @Override
   protected cgo b(dja $$0) {
      cgm $$1 = new cgm(this, $$0);
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
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bw()) {
         this.a(0.02F, $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fo(), $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwf $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwf $$0) {
      if (!($$0 instanceof crc $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ec().c(cgg.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iu $$0, eah $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
   }

   @Override
   protected awm u() {
      return this.d(bwp.a) ? awn.a : awn.b;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.d;
   }

   @Override
   protected awm l_() {
      return awn.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cki.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bK() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gt() && this.af % 20 == 0) {
         this.w(false);
         this.bT = null;
      }

      this.gu();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
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
         efq.c.a(this.dV(), this.bP, this.bQ);
         if (this.go()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gs() && this.m();
   }

   public boolean m() {
      return !this.b(buc.a).f();
   }

   @Override
   protected boolean f(bwp $$0) {
      return false;
   }

   private boolean gs() {
      return this.ec().a(cgg.aQ, cgh.a);
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      czd $$3 = this.b(buc.a);
      if (this.q() && $$2.a(axk.W) && this.gx()) {
         this.gv();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awn.E, awo.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bud.a;
      } else if ($$3.f() && !$$2.f()) {
         czd $$4 = $$2.c(1);
         this.a(buc.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awn.e, awo.g, 2.0F, 1.0F);
         this.ec().a(cgg.aN, $$0.cG());
         return bud.a;
      } else if (!$$3.f() && $$1 == buc.a && $$2.f()) {
         this.a(bwp.a, czd.k);
         this.dV().a($$0, this, awn.f, awo.g, 2.0F, 1.0F);
         this.a(buc.a);

         for (czd $$5 : this.n().f()) {
            byx.a(this, $$5, this.dt());
         }

         this.ec().b(cgg.aN);
         $$0.h($$3);
         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iu $$0, boolean $$1) {
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
   public buk n() {
      return this.bS;
   }

   @Override
   protected jz X() {
      return bG;
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      czd $$2 = this.b(buc.a);
      return !$$2.f() && $$0.O().c(diw.d) && this.bS.c($$1) && this.c($$2, $$1);
   }

   private boolean c(czd $$0, czd $$1) {
      return czd.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(czd $$0, czd $$1) {
      daz $$2 = $$0.a(kj.R);
      daz $$3 = $$1.a(kj.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      cqm.a($$0, this, this, $$1);
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public boolean ba() {
      return !this.aJ();
   }

   @Override
   public void a(BiConsumer<efe<?>, arq> $$0) {
      if (this.dV() instanceof arq $$1) {
         $$0.accept(this.bO, $$1);
         $$0.accept(this.bR, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bM);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.go())) {
         this.al.a(bM, $$0);
      }
   }

   private boolean gt() {
      return this.bT == null || !this.bT.a(this.dt(), (double)efh.E.a().a()) || !this.dV().a_(this.bT).a(dmh.ek);
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
   public boolean a(czd $$0, czd $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      this.bS.f().forEach($$1x -> this.a($$0, $$1x));
      czd $$1 = this.a(bwp.a);
      if (!$$1.f() && !dfs.a($$1, dfr.D)) {
         this.a($$0, $$1);
         this.a(bwp.a, czd.k);
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
      ale<uw> $$1 = this.dX().a(un.a);
      $$0.a("listener", efq.a.a, $$1, this.bP);
      $$0.a("DuplicationCooldown", this.bU);
      $$0.a("CanDuplicate", this.gx());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      ale<uw> $$1 = this.dX().a(un.a);
      this.bP = $$0.<efq.a>a("listener", efq.a.a, $$1).orElseGet(efq.a::new);
      this.bU = (long)$$0.h("DuplicationCooldown");
      this.al.a(bN, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean gp() {
      return false;
   }

   private void gu() {
      if (this.bU > 0L) {
         this.bU--;
      }

      if (!this.dV().w_() && this.bU == 0L && !this.gx()) {
         this.al.a(bN, true);
      }
   }

   private void gv() {
      ckh $$0 = bwo.c.a(this.dV(), bwn.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.fZ();
         $$0.gw();
         this.gw();
         this.dV().b($$0);
      }
   }

   private void gw() {
      this.bU = 6000L;
      this.al.a(bN, false);
   }

   private boolean gx() {
      return this.al.a(bN);
   }

   private void a(crc $$0, czd $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gy();
         }
      } else {
         super.b($$0);
      }
   }

   private void gy() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public efq.a x() {
      return this.bP;
   }

   @Override
   public efq.d gr() {
      return this.bQ;
   }

   class a implements efj {
      private final efl b;
      private final int c;

      public a(final efl $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public efl a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, je<efh> $$1, efh.a $$2, feq $$3) {
         if ($$1.a(efh.E)) {
            ckh.this.b(iu.a((jo)$$3), true);
            return true;
         } else if ($$1.a(efh.F)) {
            ckh.this.b(iu.a((jo)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements efq.d {
      private static final int b = 16;
      private final efl c = new eff(ckh.this, ckh.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efl b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<efh> $$2, efh.a $$3) {
         if (ckh.this.gg()) {
            return false;
         } else {
            Optional<jd> $$4 = ckh.this.ec().c(cgg.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jd $$5 = $$4.get();
               return $$5.a($$0.aj(), ckh.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arq $$0, iu $$1, je<efh> $$2, @Nullable bwf $$3, @Nullable bwf $$4, float $$5) {
         if ($$2.a(efh.H)) {
            cki.a(ckh.this, new iu($$1));
         }
      }

      @Override
      public axr<efh> c() {
         return axi.e;
      }
   }
}
