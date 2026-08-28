import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clz extends ckb implements dyf {
   private static final Logger cc = LogUtils.getLogger();
   private static final int cd = 40;
   private static final int ce = 200;
   private static final int cf = 500;
   private static final float cg = 0.3F;
   private static final float ch = 1.0F;
   private static final float ci = 1.5F;
   private static final int cj = 30;
   private static final ajv<Integer> ck = ajz.a(clz.class, ajx.b);
   private static final int cl = 200;
   private static final int cm = 260;
   private static final int cn = 20;
   private static final int co = 120;
   private static final int cp = 20;
   private static final int cq = 35;
   private static final int cr = 10;
   private static final int cs = 20;
   private static final int ct = 100;
   private static final int cu = 20;
   private static final int cv = 30;
   private static final float cw = 4.5F;
   private static final float cx = 0.7F;
   private static final int cy = 30;
   private int cz;
   private int cB;
   private int cC;
   private int cD;
   public bsl b = new bsl();
   public bsl c = new bsl();
   public bsl d = new bsl();
   public bsl e = new bsl();
   public bsl ca = new bsl();
   public bsl cb = new bsl();
   private final dxt<dyf.b> cE;
   private final dyf.d cF;
   private dyf.a cG;
   cly cH = new cly(this::b, Collections.emptyList());

   public clz(bsw<? extends ckb> $$0, dcu $$1) {
      super($$0, $$1);
      this.cF = new clz.a();
      this.cG = new dyf.a();
      this.cE = new dxt<>(new dyf.b(this));
      this.bP = 5;
      this.J().a(true);
      this.a(epp.m, 0.0F);
      this.a(epp.q, 8.0F);
      this.a(epp.f, 8.0F);
      this.a(epp.i, 8.0F);
      this.a(epp.o, 0.0F);
      this.a(epp.n, 0.0F);
   }

   @Override
   public zf<abt> dm() {
      return new abu(this, this.c(bty.n) ? 1 : 0);
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bty.n);
      }
   }

   @Override
   public boolean a(dcx $$0) {
      return super.a($$0) && $$0.a(this, this.am().n().a(this.do()));
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brj $$0) {
      return this.gq() && !$$0.a(awf.d) ? true : super.b($$0);
   }

   boolean gq() {
      return this.c(bty.o) || this.c(bty.n);
   }

   @Override
   protected boolean o(bsq $$0) {
      return false;
   }

   @Override
   public boolean fL() {
      return true;
   }

   @Override
   protected float aP() {
      return this.aa + 0.55F;
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 500.0).a(buu.v, 0.3F).a(buu.p, 1.0).a(buu.d, 1.5).a(buu.c, 30.0);
   }

   @Override
   public boolean bd() {
      return true;
   }

   @Override
   protected float fb() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avn v() {
      return !this.c(bty.l) && !this.gq() ? this.x().b() : null;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.BO;
   }

   @Override
   protected avn n_() {
      return avo.BK;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.BY, 10.0F, 1.0F);
   }

   @Override
   public boolean D(bsq $$0) {
      this.dQ().a(this, (byte)4);
      this.a(avo.BJ, 10.0F, this.fc());
      bzf.a(this, 40);
      return super.D($$0);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int t() {
      return this.ao.a(ck);
   }

   private void gt() {
      this.ao.a(ck, this.gw());
   }

   @Override
   public void l() {
      if (this.dQ() instanceof aqt $$0) {
         dyf.c.a($$0, this.cG, this.cF);
         if (this.fR() || this.W()) {
            cma.a((btl)this);
         }
      }

      super.l();
      if (this.dQ().x_()) {
         if (this.ai % this.gu() == 0) {
            this.cC = 10;
            if (!this.aX()) {
               this.dQ().a(this.dv(), this.dx(), this.dB(), avo.BN, this.df(), 5.0F, this.fc(), false);
            }
         }

         this.cB = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
         }

         switch (this.at()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void Z() {
      aqt $$0 = (aqt)this.dQ();
      $$0.ag().a("wardenBrain");
      this.dU().a($$0, this);
      this.dQ().ag().c();
      super.Z();
      if ((this.ai + this.an()) % 120 == 0) {
         a($$0, this.do(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gt();
      }

      cma.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.ca.a(this.ai);
      } else if ($$0 == 61) {
         this.cz = 10;
      } else if ($$0 == 62) {
         this.cb.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gu() {
      float $$0 = (float)this.t() / (float)clx.c.a();
      return 40 - ayn.d(ayn.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float H(float $$0) {
      return ayn.i($$0, (float)this.cB, (float)this.cz) / 10.0F;
   }

   public float I(float $$0) {
      return ayn.i($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bsl $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayv $$1 = this.dT();
         dta $$2 = this.bq();
         if ($$2.l() != dmd.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dv() + (double)ayn.b($$1, -0.7F, 0.7F);
               double $$5 = this.dx();
               double $$6 = this.dB() + (double)ayn.b($$1, -0.7F, 0.7F);
               this.dQ().a(new le(lm.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajv<?> $$0) {
      if (at.equals($$0)) {
         switch (this.at()) {
            case n:
               this.d.a(this.ai);
               break;
            case o:
               this.e.a(this.ai);
               break;
            case l:
               this.b.a(this.ai);
               break;
            case m:
               this.c.a(this.ai);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dcm $$0) {
      return this.gq();
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cma.a(this, $$0);
   }

   @Override
   public buo<clz> dU() {
      return (buo<clz>)super.dU();
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public void a(BiConsumer<dxt<?>, aqt> $$0) {
      if (this.dQ() instanceof aqt $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsq $$0) {
      if ($$0 instanceof btl $$1
         && this.dQ() == $$0.dQ()
         && bsv.e.test($$0)
         && !this.s($$0)
         && $$1.am() != bsw.d
         && $$1.am() != bsw.bm
         && !$$1.cv()
         && !$$1.ey()
         && this.dQ().C_().a($$1.cL())) {
         return true;
      }

      return false;
   }

   public static void a(aqt $$0, eww $$1, @Nullable bsq $$2, int $$3) {
      bry $$4 = new bry(bsa.G, 260, 0, false, false);
      brz.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cly.a(this::b).encodeStart(uo.a, this.cH).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dyf.a.a.encodeStart(uo.a, this.cG).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cly.a(this::b).parse(new Dynamic(uo.a, $$0.c("anger"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cH = $$0x);
         this.gt();
      }

      if ($$0.b("listener", 10)) {
         dyf.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gv() {
      if (!this.c(bty.l)) {
         this.a(this.x().c(), 10.0F, this.fc());
      }
   }

   public clx x() {
      return clx.a(this.gw());
   }

   private int gw() {
      return this.cH.b(this.p());
   }

   public void c(bsq $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bsq $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsq $$0, int $$1, boolean $$2) {
      if (!this.gb() && this.b($$0)) {
         cma.a((btl)this);
         boolean $$3 = !(this.p() instanceof cmv);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cmv && $$3 && clx.a($$4).d()) {
            this.dU().b(ccq.o);
         }

         if ($$2) {
            this.gv();
         }
      }
   }

   public Optional<btl> gm() {
      return this.x().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.dU().a(ccq.aE, azr.a, 1200L);
      if ($$2 == btp.k) {
         this.b(bty.n);
         this.dU().a(ccq.aC, azr.a, (long)cma.a);
         this.a(avo.BG, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dQ().B && !this.gb() && !this.gq()) {
         bsq $$3 = $$0.d();
         this.a($$3, clx.c.a() + 20, false);
         if (this.bF.c(ccq.o).isEmpty() && $$3 instanceof btl $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btl $$0) {
      this.dU().b(ccq.ay);
      this.dU().a(ccq.o, $$0);
      this.dU().b(ccq.E);
      bzf.a(this, 200);
   }

   @Override
   public bst e(bty $$0) {
      bst $$1 = super.e($$0);
      return this.gq() ? bst.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bB() {
      return !this.gq() && super.bB();
   }

   @Override
   protected void E(bsq $$0) {
      if (!this.gb() && !this.dU().a(ccq.aH)) {
         this.dU().a(ccq.aH, azr.a, 20L);
         this.d($$0);
         cma.a(this, $$0.dq());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public cly gn() {
      return this.cH;
   }

   @Override
   protected ccy b(dcu $$0) {
      return new ccx(this, $$0) {
         @Override
         protected epo a(int $$0) {
            this.o = new epu();
            this.o.a(true);
            return new epo(this.o, $$0) {
               @Override
               protected float a(epk $$0, epk $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dyf.a go() {
      return this.cG;
   }

   @Override
   public dyf.d gp() {
      return this.cF;
   }

   class a implements dyf.d {
      private static final int b = 16;
      private final dya c = new dxu(clz.this, clz.this.cM());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dya b() {
         return this.c;
      }

      @Override
      public awt<dxw> c() {
         return awk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqt $$0, jd $$1, jm<dxw> $$2, dxw.a $$3) {
         if (!clz.this.gb() && !clz.this.ey() && !clz.this.dU().a(ccq.aI) && !clz.this.gq() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btl $$4 && !clz.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable bsq $$3, @Nullable bsq $$4, float $$5) {
         if (!clz.this.ey()) {
            clz.this.bF.a(ccq.aI, azr.a, 40L);
            $$0.a(clz.this, (byte)61);
            clz.this.a(avo.BZ, 5.0F, clz.this.fc());
            jd $$6 = $$1;
            if ($$4 != null) {
               if (clz.this.a($$4, 30.0)) {
                  if (clz.this.dU().a(ccq.aA)) {
                     if (clz.this.b($$4)) {
                        $$6 = $$4.dq();
                     }

                     clz.this.d($$4);
                  } else {
                     clz.this.a($$4, 10, true);
                  }
               }

               clz.this.dU().a(ccq.aA, azr.a, 100L);
            } else {
               clz.this.d($$3);
            }

            if (!clz.this.x().d()) {
               Optional<btl> $$7 = clz.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cma.a(clz.this, $$6);
               }
            }
         }
      }
   }
}
