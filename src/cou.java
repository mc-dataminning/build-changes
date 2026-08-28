import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cou extends cms implements ecy {
   private static final Logger bH = LogUtils.getLogger();
   private static final int bI = 40;
   private static final int bJ = 200;
   private static final int bK = 500;
   private static final float bL = 0.3F;
   private static final float bM = 1.0F;
   private static final float bN = 1.5F;
   private static final int bO = 30;
   private static final int bP = 24;
   private static final ajx<Integer> bQ = akb.a(cou.class, ajz.b);
   private static final int bR = 200;
   private static final int bS = 260;
   private static final int bT = 20;
   private static final int bU = 120;
   private static final int bV = 20;
   private static final int bW = 35;
   private static final int bX = 10;
   private static final int bY = 20;
   private static final int bZ = 100;
   private static final int ca = 20;
   private static final int cb = 30;
   private static final float cc = 4.5F;
   private static final float cd = 0.7F;
   private static final int ce = 30;
   private int cf;
   private int cg;
   private int ch;
   private int ci;
   public bur a = new bur();
   public bur b = new bur();
   public bur c = new bur();
   public bur d = new bur();
   public bur bF = new bur();
   public bur bG = new bur();
   private final ecm<ecy.b> cj;
   private final ecy.d ck;
   private ecy.a cl;
   cot cm = new cot(this::b, Collections.emptyList());

   public cou(bvi<? extends cms> $$0, dgz $$1) {
      super($$0, $$1);
      this.ck = new cou.a();
      this.cl = new ecy.a();
      this.cj = new ecm<>(new ecy.b(this));
      this.bx = 5;
      this.O().a(true);
      this.a(eun.m, 0.0F);
      this.a(eun.q, 8.0F);
      this.a(eun.f, 8.0F);
      this.a(eun.i, 8.0F);
      this.a(eun.o, 0.0F);
      this.a(eun.n, 0.0F);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, $$0, this.c(bwk.n) ? 1 : 0);
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bwk.n);
      }
   }

   @Override
   public boolean a(dhc $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.ds()));
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ard $$0, btp $$1) {
      return this.gt() && !$$1.a(awr.d) ? true : super.a($$0, $$1);
   }

   boolean gt() {
      return this.c(bwk.o) || this.c(bwk.n);
   }

   @Override
   protected boolean o(bva $$0) {
      return false;
   }

   @Override
   public boolean fW() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 500.0).a(bxg.v, 0.3F).a(bxg.p, 1.0).a(bxg.d, 1.5).a(bxg.c, 30.0).a(bxg.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fg() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avz u() {
      return !this.c(bwk.l) && !this.gt() ? this.n().b() : null;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.CM;
   }

   @Override
   protected avz l_() {
      return awa.CI;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.CW, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ard $$0, bva $$1) {
      $$0.a(this, (byte)4);
      this.a(awa.CH, 10.0F, this.fh());
      cbr.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   public int m() {
      return this.al.a(bQ);
   }

   private void gw() {
      this.al.a(bQ, this.gz());
   }

   @Override
   public void h() {
      if (this.dU() instanceof ard $$0) {
         ecy.c.a($$0, this.cl, this.ck);
         if (this.gb() || this.Z()) {
            cov.a((bvy)this);
         }
      }

      super.h();
      if (this.dU().w_()) {
         if (this.af % this.gx() == 0) {
            this.ch = 10;
            if (!this.bb()) {
               this.dU().a(this.dz(), this.dB(), this.dF(), awa.CL, this.dl(), 5.0F, this.fh(), false);
            }
         }

         this.cg = this.cf;
         if (this.cf > 0) {
            this.cf--;
         }

         this.ci = this.ch;
         if (this.ch > 0) {
            this.ch--;
         }

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("wardenBrain");
      this.ea().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.ds(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cm.a($$0, this::b);
         this.gw();
      }

      cov.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bF.a(this.af);
      } else if ($$0 == 61) {
         this.cf = 10;
      } else if ($$0 == 62) {
         this.bG.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gx() {
      float $$0 = (float)this.m() / (float)cos.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float K(float $$0) {
      return ayz.h($$0, (float)this.cg, (float)this.cf) / 10.0F;
   }

   public float L(float $$0) {
      return ayz.h($$0, (float)this.ci, (float)this.ch) / 10.0F;
   }

   private void a(bur $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azh $$1 = this.dX();
         dxq $$2 = this.bs();
         if ($$2.o() != dqp.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dz() + (double)ayz.b($$1, -0.7F, 0.7F);
               double $$5 = this.dB();
               double $$6 = this.dF() + (double)ayz.b($$1, -0.7F, 0.7F);
               this.dU().a(new ll(lt.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.aw()) {
            case n:
               this.c.a(this.af);
               break;
            case o:
               this.d.a(this.af);
               break;
            case l:
               this.a.a(this.af);
               break;
            case m:
               this.b.a(this.af);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dgs $$0) {
      return this.gt();
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cov.a(this, $$0);
   }

   @Override
   public bxa<cou> ea() {
      return (bxa<cou>)super.ea();
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public void a(BiConsumer<ecm<?>, ard> $$0) {
      if (this.dU() instanceof ard $$1) {
         $$0.accept(this.cj, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bva $$0) {
      if ($$0 instanceof bvy $$1
         && this.dU() == $$0.dU()
         && bvg.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bvi.f
         && $$1.aq() != bvi.bF
         && !$$1.cB()
         && !$$1.eF()
         && this.dU().A_().a($$1.cQ())) {
         return true;
      }

      return false;
   }

   public static void a(ard $$0, fbx $$1, @Nullable bva $$2, int $$3) {
      bue $$4 = new bue(bug.G, 260, 0, false, false);
      buf.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      aks<un> $$1 = this.dW().a(ue.a);
      cot.a(this::b)
         .encodeStart($$1, this.cm)
         .resultOrPartial($$0x -> bH.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ecy.a.a
         .encodeStart($$1, this.cl)
         .resultOrPartial($$0x -> bH.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      aks<un> $$1 = this.dW().a(ue.a);
      if ($$0.e("anger")) {
         cot.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> bH.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cm = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         ecy.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> bH.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cl = $$0x);
      }
   }

   private void gy() {
      if (!this.c(bwk.l)) {
         this.a(this.n().c(), 10.0F, this.fh());
      }
   }

   public cos n() {
      return cos.a(this.gz());
   }

   private int gz() {
      return this.cm.b(this.f());
   }

   @Override
   public void c(bva $$0) {
      this.cm.a($$0);
   }

   public void d(@Nullable bva $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bva $$0, int $$1, boolean $$2) {
      if (!this.gh() && this.b($$0)) {
         cov.a((bvy)this);
         boolean $$3 = !(this.f() instanceof cpr);
         int $$4 = this.cm.a($$0, $$1);
         if ($$0 instanceof cpr && $$3 && cos.a($$4).d()) {
            this.ea().b(cfc.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<bvy> q() {
      return this.n().d() ? this.cm.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvy f() {
      return this.Q();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.ea().a(cfc.aE, baf.a, 1200L);
      if ($$2 == bvh.k) {
         this.b(bwk.n);
         this.ea().a(cfc.aC, baf.a, (long)cov.a);
         this.a(awa.CE, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gh() && !this.gt()) {
         bva $$4 = $$1.d();
         this.a($$4, cos.c.a() + 20, false);
         if (this.bs.c(cfc.o).isEmpty() && $$4 instanceof bvy $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bvy $$0) {
      this.ea().b(cfc.ay);
      this.ea().a(cfc.o, $$0);
      this.ea().b(cfc.E);
      cbr.a(this, 200);
   }

   @Override
   public bvd e(bwk $$0) {
      bvd $$1 = super.e($$0);
      return this.gt() ? bvd.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bG() {
      return !this.gt() && super.bG();
   }

   @Override
   protected void D(bva $$0) {
      if (!this.gh() && !this.ea().a(cfc.aH)) {
         this.ea().a(cfc.aH, baf.a, 20L);
         this.d($$0);
         cov.a(this, $$0.du());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cot t() {
      return this.cm;
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfj(this, $$0) {
         @Override
         protected eum a(int $$0) {
            this.o = new eus();
            return new eum(this.o, $$0) {
               @Override
               protected float a(eui $$0, eui $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ecy.a x() {
      return this.cl;
   }

   @Override
   public ecy.d gs() {
      return this.ck;
   }

   class a implements ecy.d {
      private static final int b = 16;
      private final ect c = new ecn(cou.this, cou.this.cR());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ect b() {
         return this.c;
      }

      @Override
      public axf<ecp> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ecp> $$2, ecp.a $$3) {
         if (!cou.this.gh() && !cou.this.eF() && !cou.this.ea().a(cfc.aI) && !cou.this.gt() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof bvy $$4 && !cou.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable bva $$3, @Nullable bva $$4, float $$5) {
         if (!cou.this.eF()) {
            cou.this.bs.a(cfc.aI, baf.a, 40L);
            $$0.a(cou.this, (byte)61);
            cou.this.a(awa.CX, 5.0F, cou.this.fh());
            ji $$6 = $$1;
            if ($$4 != null) {
               if (cou.this.a($$4, 30.0)) {
                  if (cou.this.ea().a(cfc.aA)) {
                     if (cou.this.b($$4)) {
                        $$6 = $$4.du();
                     }

                     cou.this.d($$4);
                  } else {
                     cou.this.a($$4, 10, true);
                  }
               }

               cou.this.ea().a(cfc.aA, baf.a, 100L);
            } else {
               cou.this.d($$3);
            }

            if (!cou.this.n().d()) {
               Optional<bvy> $$7 = cou.this.cm.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cov.a(cou.this, $$6);
               }
            }
         }
      }
   }
}
