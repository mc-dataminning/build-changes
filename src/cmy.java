import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmy extends cla implements dzu {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final akg<Integer> cj = akk.a(cmy.class, aki.b);
   private static final int ck = 200;
   private static final int cl = 260;
   private static final int cm = 20;
   private static final int cn = 120;
   private static final int co = 20;
   private static final int cp = 35;
   private static final int cq = 10;
   private static final int cr = 20;
   private static final int cs = 100;
   private static final int ct = 20;
   private static final int cu = 30;
   private static final float cv = 4.5F;
   private static final float cw = 0.7F;
   private static final int cx = 30;
   private int cy;
   private int cA;
   private int cB;
   private int cC;
   public bti b = new bti();
   public bti c = new bti();
   public bti d = new bti();
   public bti e = new bti();
   public bti bY = new bti();
   public bti bZ = new bti();
   private final dzi<dzu.b> cD;
   private final dzu.d cE;
   private dzu.a cF;
   cmx cG = new cmx(this::c, Collections.emptyList());

   public cmy(btv<? extends cla> $$0, deg $$1) {
      super($$0, $$1);
      this.cE = new cmy.a();
      this.cF = new dzu.a();
      this.cD = new dzi<>(new dzu.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(erg.m, 0.0F);
      this.a(erg.q, 8.0F);
      this.a(erg.f, 8.0F);
      this.a(erg.i, 8.0F);
      this.a(erg.o, 0.0F);
      this.a(erg.n, 0.0F);
   }

   @Override
   public zk<abz> a(arg $$0) {
      return new aca(this, $$0, this.c(buw.n) ? 1 : 0);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(buw.n);
      }
   }

   @Override
   public boolean a(dej $$0) {
      return super.a($$0) && $$0.a(this, this.ao().n().a(this.dq()));
   }

   @Override
   public float a(je $$0, dej $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsg $$0) {
      return this.gt() && !$$0.a(awv.d) ? true : super.b($$0);
   }

   boolean gt() {
      return this.c(buw.o) || this.c(buw.n);
   }

   @Override
   protected boolean o(bto $$0) {
      return false;
   }

   @Override
   public boolean fP() {
      return true;
   }

   @Override
   protected float aS() {
      return this.Y + 0.55F;
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 500.0).a(bvr.v, 0.3F).a(bvr.p, 1.0).a(bvr.d, 1.5).a(bvr.c, 30.0).a(bvr.m, 24.0);
   }

   @Override
   public boolean bg() {
      return true;
   }

   @Override
   protected float fd() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awd w() {
      return !this.c(buw.l) && !this.gt() ? this.y().b() : null;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.BU;
   }

   @Override
   protected awd n_() {
      return awe.BQ;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.Ce, 10.0F, 1.0F);
   }

   @Override
   public boolean E(bto $$0) {
      this.dS().a(this, (byte)4);
      this.a(awe.BP, 10.0F, this.fe());
      cac.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int t() {
      return this.am.a(cj);
   }

   private void gw() {
      this.am.a(cj, this.gz());
   }

   @Override
   public void l() {
      if (this.dS() instanceof arh $$0) {
         dzu.c.a($$0, this.cF, this.cE);
         if (this.fY() || this.aa()) {
            cmz.a((buk)this);
         }
      }

      super.l();
      if (this.dS().w_()) {
         if (this.ag % this.gx() == 0) {
            this.cB = 10;
            if (!this.ba()) {
               this.dS().a(this.dx(), this.dz(), this.dD(), awe.BT, this.di(), 5.0F, this.fe(), false);
            }
         }

         this.cA = this.cy;
         if (this.cy > 0) {
            this.cy--;
         }

         this.cC = this.cB;
         if (this.cB > 0) {
            this.cB--;
         }

         switch (this.av()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void ad() {
      arh $$0 = (arh)this.dS();
      $$0.ah().a("wardenBrain");
      this.dX().a($$0, this);
      this.dS().ah().c();
      super.ad();
      if ((this.ag + this.ap()) % 120 == 0) {
         a($$0, this.dq(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cG.a($$0, this::c);
         this.gw();
      }

      cmz.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bY.a(this.ag);
      } else if ($$0 == 61) {
         this.cy = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.ag);
      } else {
         super.b($$0);
      }
   }

   private int gx() {
      float $$0 = (float)this.t() / (float)cmw.c.a();
      return 40 - azd.d(azd.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azd.h($$0, (float)this.cA, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azd.h($$0, (float)this.cC, (float)this.cB) / 10.0F;
   }

   private void a(bti $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azl $$1 = this.dV();
         duo $$2 = this.bt();
         if ($$2.o() != dnq.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dx() + (double)azd.b($$1, -0.7F, 0.7F);
               double $$5 = this.dz();
               double $$6 = this.dD() + (double)azd.b($$1, -0.7F, 0.7F);
               this.dS().a(new lf(ln.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.av()) {
            case n:
               this.d.a(this.ag);
               break;
            case o:
               this.e.a(this.ag);
               break;
            case l:
               this.b.a(this.ag);
               break;
            case m:
               this.c.a(this.ag);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(ddy $$0) {
      return this.gt();
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cmz.a(this, $$0);
   }

   @Override
   public bvl<cmy> dX() {
      return (bvl<cmy>)super.dX();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void a(BiConsumer<dzi<?>, arh> $$0) {
      if (this.dS() instanceof arh $$1) {
         $$0.accept(this.cD, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable bto $$0) {
      if ($$0 instanceof buk $$1
         && this.dS() == $$0.dS()
         && btt.e.test($$0)
         && !this.s($$0)
         && $$1.ao() != btv.d
         && $$1.ao() != btv.bm
         && !$$1.cz()
         && !$$1.eB()
         && this.dS().A_().a($$1.cO())) {
         return true;
      }

      return false;
   }

   public static void a(arh $$0, eys $$1, @Nullable bto $$2, int $$3) {
      bsv $$4 = new bsv(bsx.G, 260, 0, false, false);
      bsw.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      ala<vc> $$1 = this.dU().a(ut.a);
      cmx.a(this::c)
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      dzu.a.a
         .encodeStart($$1, this.cF)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      ala<vc> $$1 = this.dU().a(ut.a);
      if ($$0.e("anger")) {
         cmx.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         dzu.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cF = $$0x);
      }
   }

   private void gy() {
      if (!this.c(buw.l)) {
         this.a(this.y().c(), 10.0F, this.fe());
      }
   }

   public cmw y() {
      return cmw.a(this.gz());
   }

   private int gz() {
      return this.cG.b(this.m());
   }

   @Override
   public void d(bto $$0) {
      this.cG.a($$0);
   }

   public void e(@Nullable bto $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bto $$0, int $$1, boolean $$2) {
      if (!this.ge() && this.c($$0)) {
         cmz.a((buk)this);
         boolean $$3 = !(this.m() instanceof cnu);
         int $$4 = this.cG.a($$0, $$1);
         if ($$0 instanceof cnu && $$3 && cmw.a($$4).d()) {
            this.dX().b(cdn.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<buk> gp() {
      return this.y().d() ? this.cG.a() : Optional.empty();
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.dX().a(cdn.aE, bai.a, 1200L);
      if ($$2 == btu.k) {
         this.b(buw.n);
         this.dX().a(cdn.aC, bai.a, (long)cmz.a);
         this.a(awe.BM, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dS().B && !this.ge() && !this.gt()) {
         bto $$3 = $$0.d();
         this.a($$3, cmw.c.a() + 20, false);
         if (this.bB.c(cdn.o).isEmpty() && $$3 instanceof buk $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(buk $$0) {
      this.dX().b(cdn.ay);
      this.dX().a(cdn.o, $$0);
      this.dX().b(cdn.E);
      cac.a(this, 200);
   }

   @Override
   public btr e(buw $$0) {
      btr $$1 = super.e($$0);
      return this.gt() ? btr.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bF() {
      return !this.gt() && super.bF();
   }

   @Override
   protected void F(bto $$0) {
      if (!this.ge() && !this.dX().a(cdn.aH)) {
         this.dX().a(cdn.aH, bai.a, 20L);
         this.e($$0);
         cmz.a(this, $$0.ds());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cmx gq() {
      return this.cG;
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdu(this, $$0) {
         @Override
         protected erf a(int $$0) {
            this.o = new erl();
            this.o.a(true);
            return new erf(this.o, $$0) {
               @Override
               protected float a(erb $$0, erb $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dzu.a gr() {
      return this.cF;
   }

   @Override
   public dzu.d gs() {
      return this.cE;
   }

   class a implements dzu.d {
      private static final int b = 16;
      private final dzp c = new dzj(cmy.this, cmy.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzp b() {
         return this.c;
      }

      @Override
      public axj<dzl> c() {
         return axa.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arh $$0, je $$1, jn<dzl> $$2, dzl.a $$3) {
         if (!cmy.this.ge() && !cmy.this.eB() && !cmy.this.dX().a(cdn.aI) && !cmy.this.gt() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof buk $$4 && !cmy.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arh $$0, je $$1, jn<dzl> $$2, @Nullable bto $$3, @Nullable bto $$4, float $$5) {
         if (!cmy.this.eB()) {
            cmy.this.bB.a(cdn.aI, bai.a, 40L);
            $$0.a(cmy.this, (byte)61);
            cmy.this.a(awe.Cf, 5.0F, cmy.this.fe());
            je $$6 = $$1;
            if ($$4 != null) {
               if (cmy.this.a($$4, 30.0)) {
                  if (cmy.this.dX().a(cdn.aA)) {
                     if (cmy.this.c($$4)) {
                        $$6 = $$4.ds();
                     }

                     cmy.this.e($$4);
                  } else {
                     cmy.this.a($$4, 10, true);
                  }
               }

               cmy.this.dX().a(cdn.aA, bai.a, 100L);
            } else {
               cmy.this.e($$3);
            }

            if (!cmy.this.y().d()) {
               Optional<buk> $$7 = cmy.this.cG.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmz.a(cmy.this, $$6);
               }
            }
         }
      }
   }
}
