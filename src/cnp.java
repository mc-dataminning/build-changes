import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnp extends clr implements eap {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final akl<Integer> cj = akp.a(cnp.class, akn.b);
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
   public btw b = new btw();
   public btw c = new btw();
   public btw d = new btw();
   public btw e = new btw();
   public btw bY = new btw();
   public btw bZ = new btw();
   private final ead<eap.b> cD;
   private final eap.d cE;
   private eap.a cF;
   cno cG = new cno(this::c, Collections.emptyList());

   public cnp(bul<? extends clr> $$0, dfb $$1) {
      super($$0, $$1);
      this.cE = new cnp.a();
      this.cF = new eap.a();
      this.cD = new ead<>(new eap.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(esb.m, 0.0F);
      this.a(esb.q, 8.0F);
      this.a(esb.f, 8.0F);
      this.a(esb.i, 8.0F);
      this.a(esb.o, 0.0F);
      this.a(esb.n, 0.0F);
   }

   @Override
   public zp<ace> a(arm $$0) {
      return new acf(this, $$0, this.c(bvm.n) ? 1 : 0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvm.n);
      }
   }

   @Override
   public boolean a(dfe $$0) {
      return super.a($$0) && $$0.a(this, this.ar().n().a(this.dv()));
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsu $$0) {
      return this.gy() && !$$0.a(axc.d) ? true : super.b($$0);
   }

   boolean gy() {
      return this.c(bvm.o) || this.c(bvm.n);
   }

   @Override
   protected boolean o(bue $$0) {
      return false;
   }

   @Override
   public boolean fW() {
      return true;
   }

   @Override
   protected float aV() {
      return this.Y + 0.55F;
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 500.0).a(bwi.v, 0.3F).a(bwi.p, 1.0).a(bwi.d, 1.5).a(bwi.c, 30.0).a(bwi.m, 24.0);
   }

   @Override
   public boolean bi() {
      return true;
   }

   @Override
   protected float fi() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awk w() {
      return !this.c(bvm.l) && !this.gy() ? this.y().b() : null;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.BS;
   }

   @Override
   protected awk o_() {
      return awl.BO;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.Cc, 10.0F, 1.0F);
   }

   @Override
   public boolean E(bue $$0) {
      this.dX().a(this, (byte)4);
      this.a(awl.BN, 10.0F, this.fj());
      cat.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int t() {
      return this.am.a(cj);
   }

   private void gB() {
      this.am.a(cj, this.gE());
   }

   @Override
   public void l() {
      if (this.dX() instanceof arn $$0) {
         eap.c.a($$0, this.cF, this.cE);
         if (this.gb() || this.Z()) {
            cnq.a((bva)this);
         }
      }

      super.l();
      if (this.dX().y_()) {
         if (this.ag % this.gC() == 0) {
            this.cB = 10;
            if (!this.bc()) {
               this.dX().a(this.dC(), this.dE(), this.dI(), awl.BR, this.dn(), 5.0F, this.fj(), false);
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

         switch (this.ay()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void ac() {
      arn $$0 = (arn)this.dX();
      bon $$1 = bom.a();
      $$1.a("wardenBrain");
      this.ed().a($$0, this);
      $$1.c();
      super.ac();
      if ((this.ag + this.as()) % 120 == 0) {
         a($$0, this.dv(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cG.a($$0, this::c);
         this.gB();
      }

      cnq.a(this);
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

   private int gC() {
      float $$0 = (float)this.t() / (float)cnn.c.a();
      return 40 - azk.d(azk.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azk.h($$0, (float)this.cA, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azk.h($$0, (float)this.cC, (float)this.cB) / 10.0F;
   }

   private void a(btw $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azs $$1 = this.ea();
         dvj $$2 = this.bv();
         if ($$2.o() != dok.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dC() + (double)azk.b($$1, -0.7F, 0.7F);
               double $$5 = this.dE();
               double $$6 = this.dI() + (double)azk.b($$1, -0.7F, 0.7F);
               this.dX().a(new lj(lr.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akl<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.ay()) {
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
   public boolean a(det $$0) {
      return this.gy();
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cnq.a(this, $$0);
   }

   @Override
   public bwc<cnp> ed() {
      return (bwc<cnp>)super.ed();
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public void a(BiConsumer<ead<?>, arn> $$0) {
      if (this.dX() instanceof arn $$1) {
         $$0.accept(this.cD, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable bue $$0) {
      if ($$0 instanceof bva $$1
         && this.dX() == $$0.dX()
         && buj.e.test($$0)
         && !this.s($$0)
         && $$1.ar() != bul.d
         && $$1.ar() != bul.bm
         && !$$1.cD()
         && !$$1.eH()
         && this.dX().C_().a($$1.cS())) {
         return true;
      }

      return false;
   }

   public static void a(arn $$0, ezn $$1, @Nullable bue $$2, int $$3) {
      btj $$4 = new btj(btl.G, 260, 0, false, false);
      btk.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      alg<vh> $$1 = this.dZ().a(uy.a);
      cno.a(this::c)
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eap.a.a
         .encodeStart($$1, this.cF)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      alg<vh> $$1 = this.dZ().a(uy.a);
      if ($$0.e("anger")) {
         cno.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
         this.gB();
      }

      if ($$0.b("listener", 10)) {
         eap.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cF = $$0x);
      }
   }

   private void gD() {
      if (!this.c(bvm.l)) {
         this.a(this.y().c(), 10.0F, this.fj());
      }
   }

   public cnn y() {
      return cnn.a(this.gE());
   }

   private int gE() {
      return this.cG.b(this.m());
   }

   @Override
   public void d(bue $$0) {
      this.cG.a($$0);
   }

   public void e(@Nullable bue $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bue $$0, int $$1, boolean $$2) {
      if (!this.gh() && this.c($$0)) {
         cnq.a((bva)this);
         boolean $$3 = !(this.m() instanceof com);
         int $$4 = this.cG.a($$0, $$1);
         if ($$0 instanceof com && $$3 && cnn.a($$4).d()) {
            this.ed().b(cee.o);
         }

         if ($$2) {
            this.gD();
         }
      }
   }

   public Optional<bva> gu() {
      return this.y().d() ? this.cG.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.ed().a(cee.aE, bap.a, 1200L);
      if ($$2 == buk.k) {
         this.b(bvm.n);
         this.ed().a(cee.aC, bap.a, (long)cnq.a);
         this.a(awl.BK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dX().C && !this.gh() && !this.gy()) {
         bue $$3 = $$0.d();
         this.a($$3, cnn.c.a() + 20, false);
         if (this.bF.c(cee.o).isEmpty() && $$3 instanceof bva $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bva $$0) {
      this.ed().b(cee.ay);
      this.ed().a(cee.o, $$0);
      this.ed().b(cee.E);
      cat.a(this, 200);
   }

   @Override
   public buh e(bvm $$0) {
      buh $$1 = super.e($$0);
      return this.gy() ? buh.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bJ() {
      return !this.gy() && super.bJ();
   }

   @Override
   protected void F(bue $$0) {
      if (!this.gh() && !this.ed().a(cee.aH)) {
         this.ed().a(cee.aH, bap.a, 20L);
         this.e($$0);
         cnq.a(this, $$0.dx());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cno gv() {
      return this.cG;
   }

   @Override
   protected cem b(dfb $$0) {
      return new cel(this, $$0) {
         @Override
         protected esa a(int $$0) {
            this.o = new esg();
            this.o.a(true);
            return new esa(this.o, $$0) {
               @Override
               protected float a(erw $$0, erw $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eap.a gw() {
      return this.cF;
   }

   @Override
   public eap.d gx() {
      return this.cE;
   }

   class a implements eap.d {
      private static final int b = 16;
      private final eak c = new eae(cnp.this, cnp.this.cT());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eak b() {
         return this.c;
      }

      @Override
      public axq<eag> c() {
         return axh.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arn $$0, jh $$1, jq<eag> $$2, eag.a $$3) {
         if (!cnp.this.gh() && !cnp.this.eH() && !cnp.this.ed().a(cee.aI) && !cnp.this.gy() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bva $$4 && !cnp.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arn $$0, jh $$1, jq<eag> $$2, @Nullable bue $$3, @Nullable bue $$4, float $$5) {
         if (!cnp.this.eH()) {
            cnp.this.bF.a(cee.aI, bap.a, 40L);
            $$0.a(cnp.this, (byte)61);
            cnp.this.a(awl.Cd, 5.0F, cnp.this.fj());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cnp.this.a($$4, 30.0)) {
                  if (cnp.this.ed().a(cee.aA)) {
                     if (cnp.this.c($$4)) {
                        $$6 = $$4.dx();
                     }

                     cnp.this.e($$4);
                  } else {
                     cnp.this.a($$4, 10, true);
                  }
               }

               cnp.this.ed().a(cee.aA, bap.a, 100L);
            } else {
               cnp.this.e($$3);
            }

            if (!cnp.this.y().d()) {
               Optional<bva> $$7 = cnp.this.cG.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cnq.a(cnp.this, $$6);
               }
            }
         }
      }
   }
}
