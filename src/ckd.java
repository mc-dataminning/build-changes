import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ckd extends bxk implements cqi, efi {
   private static final jz bF = new jz(1, 1, 1);
   private static final int bG = 5;
   private static final float bH = 55.0F;
   private static final float bI = 15.0F;
   private static final int bJ = 6000;
   private static final int bK = 3;
   public static final int a = 1024;
   private static final akj<Boolean> bL = akn.a(ckd.class, akl.k);
   private static final akj<Boolean> bM = akn.a(ckd.class, akl.k);
   protected static final ImmutableList<chl<? extends chk<? super ckd>>> b = ImmutableList.of(chl.c, chl.d, chl.f, chl.b);
   protected static final ImmutableList<cge<?>> c = ImmutableList.of(
      cge.u, cge.o, cge.h, cge.n, cge.F, cge.y, cge.M, cge.aN, cge.aO, cge.aP, cge.aQ, cge.aa, new cge[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eew<efi.b> bN;
   private efi.a bO;
   private final efi.d bP;
   private final eew<ckd.a> bQ;
   private final bui bR = new bui(1);
   @Nullable
   private iu bS;
   private long bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   private float bY;

   public ckd(bwm<? extends ckd> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new ccy(this, 20, true);
      this.a_(this.fM());
      this.bP = new ckd.b();
      this.bO = new efi.a();
      this.bN = new eew<>(new efi.b(this));
      this.bQ = new eew<>(new ckd.a(this.bP.b(), eez.E.a().a()));
   }

   @Override
   protected byc.b<ckd> ec() {
      return byc.a(c, b);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cke.a(this.ec().a($$0));
   }

   @Override
   public byc<ckd> eb() {
      return (byc<ckd>)super.eb();
   }

   public static byh.a j() {
      return bxe.E().a(byi.s, 20.0).a(byi.l, 0.1F).a(byi.v, 0.1F).a(byi.c, 2.0);
   }

   @Override
   protected cgm b(div $$0) {
      cgk $$1 = new cgk(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, true);
   }

   @Override
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bw()) {
         this.a(0.02F, $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fn(), $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwd $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwd $$0) {
      if (!($$0 instanceof cqy $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eb().c(cge.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
   }

   @Override
   protected awm u() {
      return this.d(bwn.a) ? awn.a : awn.b;
   }

   @Override
   protected awm e(bus $$0) {
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
      bqm $$1 = bql.a();
      $$1.a("allayBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cke.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bK() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gs() && this.af % 20 == 0) {
         this.w(false);
         this.bS = null;
      }

      this.gt();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.bV = this.bU;
         if (this.m()) {
            this.bU = azm.a(this.bU + 1.0F, 0.0F, 5.0F);
         } else {
            this.bU = azm.a(this.bU - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bW++;
            this.bY = this.bX;
            if (this.t()) {
               this.bX++;
            } else {
               this.bX--;
            }

            this.bX = azm.a(this.bX, 0.0F, 15.0F);
         } else {
            this.bW = 0.0F;
            this.bX = 0.0F;
            this.bY = 0.0F;
         }
      } else {
         efi.c.a(this.dV(), this.bO, this.bP);
         if (this.gn()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fM() {
      return !this.gr() && this.m();
   }

   public boolean m() {
      return !this.b(bua.a).f();
   }

   @Override
   protected boolean f(bwn $$0) {
      return false;
   }

   private boolean gr() {
      return this.eb().a(cge.aQ, cgf.a);
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      cyy $$3 = this.b(bua.a);
      if (this.q() && $$2.a(axk.W) && this.gw()) {
         this.gu();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awn.E, awo.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bub.a;
      } else if ($$3.f() && !$$2.f()) {
         cyy $$4 = $$2.c(1);
         this.a(bua.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awn.e, awo.g, 2.0F, 1.0F);
         this.eb().a(cge.aN, $$0.cG());
         return bub.a;
      } else if (!$$3.f() && $$1 == bua.a && $$2.f()) {
         this.a(bwn.a, cyy.k);
         this.dV().a($$0, this, awn.f, awo.g, 2.0F, 1.0F);
         this.a(bua.a);

         for (cyy $$5 : this.n().f()) {
            byv.a(this, $$5, this.dt());
         }

         this.eb().b(cge.aN);
         $$0.i($$3);
         return bub.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iu $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bS = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bS) || this.bS == null) {
         this.bS = null;
         this.w(false);
      }
   }

   @Override
   public bui n() {
      return this.bR;
   }

   @Override
   protected jz X() {
      return bF;
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      cyy $$2 = this.b(bua.a);
      return !$$2.f() && $$0.O().c(dir.c) && this.bR.c($$1) && this.c($$2, $$1);
   }

   private boolean c(cyy $$0, cyy $$1) {
      return cyy.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(cyy $$0, cyy $$1) {
      dau $$2 = $$0.a(kj.R);
      dau $$3 = $$1.a(kj.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      cqi.a($$0, this, this, $$1);
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
   public void a(BiConsumer<eew<?>, arq> $$0) {
      if (this.dV() instanceof arq $$1) {
         $$0.accept(this.bN, $$1);
         $$0.accept(this.bQ, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bL);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gn())) {
         this.al.a(bL, $$0);
      }
   }

   private boolean gs() {
      return this.bS == null || !this.bS.a(this.dt(), (double)eez.E.a().a()) || !this.dV().a_(this.bS).a(dmc.eh);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bV, this.bU) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bW % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, this.bY, this.bX) / 15.0F;
   }

   @Override
   public boolean a(cyy $$0, cyy $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(arq $$0) {
      super.f($$0);
      this.bR.f().forEach($$1x -> this.a($$0, $$1x));
      cyy $$1 = this.a(bwn.a);
      if (!$$1.f() && !dfn.a($$1, dfm.D)) {
         this.a($$0, $$1);
         this.a(bwn.a, cyy.k);
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
      $$0.a("listener", efi.a.a, $$1, this.bO);
      $$0.a("DuplicationCooldown", this.bT);
      $$0.a("CanDuplicate", this.gw());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      ale<uw> $$1 = this.dX().a(un.a);
      this.bO = $$0.<efi.a>a("listener", efi.a.a, $$1).orElseGet(efi.a::new);
      this.bT = (long)$$0.h("DuplicationCooldown");
      this.al.a(bM, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean go() {
      return false;
   }

   private void gt() {
      if (this.bT > 0L) {
         this.bT--;
      }

      if (!this.dV().w_() && this.bT == 0L && !this.gw()) {
         this.al.a(bM, true);
      }
   }

   private void gu() {
      ckd $$0 = bwm.c.a(this.dV(), bwl.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.fY();
         $$0.gv();
         this.gv();
         this.dV().b($$0);
      }
   }

   private void gv() {
      this.bT = 6000L;
      this.al.a(bM, false);
   }

   private boolean gw() {
      return this.al.a(bM);
   }

   private void a(cqy $$0, cyy $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
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
      this.dV().a(lx.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public efi.a x() {
      return this.bO;
   }

   @Override
   public efi.d gq() {
      return this.bP;
   }

   class a implements efb {
      private final efd b;
      private final int c;

      public a(final efd $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public efd a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, je<eez> $$1, eez.a $$2, fei $$3) {
         if ($$1.a(eez.E)) {
            ckd.this.b(iu.a((jo)$$3), true);
            return true;
         } else if ($$1.a(eez.F)) {
            ckd.this.b(iu.a((jo)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements efi.d {
      private static final int b = 16;
      private final efd c = new eex(ckd.this, ckd.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public efd b() {
         return this.c;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<eez> $$2, eez.a $$3) {
         if (ckd.this.gf()) {
            return false;
         } else {
            Optional<jd> $$4 = ckd.this.eb().c(cge.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jd $$5 = $$4.get();
               return $$5.a($$0.aj(), ckd.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(arq $$0, iu $$1, je<eez> $$2, @Nullable bwd $$3, @Nullable bwd $$4, float $$5) {
         if ($$2.a(eez.H)) {
            cke.a(ckd.this, new iu($$1));
         }
      }

      @Override
      public axr<eez> c() {
         return axi.e;
      }
   }
}
