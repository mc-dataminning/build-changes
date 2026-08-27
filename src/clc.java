import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clc extends cjd implements dye {
   private static final Logger cj = LogUtils.getLogger();
   private static final int ck = 40;
   private static final int cl = 200;
   private static final int cm = 500;
   private static final float cn = 0.3F;
   private static final float co = 1.0F;
   private static final float cp = 1.5F;
   private static final int cq = 30;
   private static final ajy<Integer> cr = akc.a(clc.class, aka.b);
   private static final int cs = 200;
   private static final int ct = 260;
   private static final int cu = 20;
   private static final int cv = 120;
   private static final int cw = 20;
   private static final int cx = 35;
   private static final int cy = 10;
   private static final int cz = 20;
   private static final int cA = 100;
   private static final int cB = 20;
   private static final int cC = 30;
   private static final float cD = 4.5F;
   private static final float cE = 0.7F;
   private static final int cF = 30;
   private int cG;
   private int cH;
   private int cI;
   private int cJ;
   public brq b = new brq();
   public brq c = new brq();
   public brq d = new brq();
   public brq e = new brq();
   public brq ch = new brq();
   public brq ci = new brq();
   private final dxs<dye.b> cK;
   private final dye.d cL;
   private dye.a cM;
   clb cN = new clb(this::b, Collections.emptyList());

   public clc(bsb<? extends cjd> $$0, dca $$1) {
      super($$0, $$1);
      this.cL = new clc.a();
      this.cM = new dye.a();
      this.cK = new dxs<>(new dye.b(this));
      this.bW = 5;
      this.J().a(true);
      this.a(epv.m, 0.0F);
      this.a(epv.q, 8.0F);
      this.a(epv.f, 8.0F);
      this.a(epv.i, 8.0F);
      this.a(epv.o, 0.0F);
      this.a(epv.n, 0.0F);
   }

   @Override
   public zl<abw> dq() {
      return new abx(this, this.c(bsz.n) ? 1 : 0);
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bsz.n);
      }
   }

   @Override
   public boolean a(dcd $$0) {
      return super.a($$0) && $$0.b(this, this.ak().n().a(this.ds()));
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqt $$0) {
      return this.gC() && !$$0.a(awg.e) ? true : super.b($$0);
   }

   boolean gC() {
      return this.c(bsz.o) || this.c(bsz.n);
   }

   @Override
   protected boolean o(brv $$0) {
      return false;
   }

   @Override
   public boolean fX() {
      return true;
   }

   @Override
   protected float aS() {
      return this.ab + 0.55F;
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 500.0).a(btv.r, 0.3F).a(btv.n, 1.0).a(btv.d, 1.5).a(btv.c, 30.0);
   }

   @Override
   public boolean bg() {
      return true;
   }

   @Override
   protected float fn() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avn u() {
      return !this.c(bsz.l) && !this.gC() ? this.x().b() : null;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Ci;
   }

   @Override
   protected avn n_() {
      return avo.Ce;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.Cs, 10.0F, 1.0F);
   }

   @Override
   public boolean C(brv $$0) {
      this.dU().a(this, (byte)4);
      this.a(avo.Cd, 10.0F, this.fo());
      byg.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cr, 0);
   }

   public int t() {
      return this.as.a(cr);
   }

   private void gD() {
      this.as.a(cr, this.gI());
   }

   @Override
   public void l() {
      if (this.dU() instanceof aqt $$0) {
         dye.c.a($$0, this.cM, this.cL);
         if (this.ge() || this.V()) {
            cld.a((bso)this);
         }
      }

      super.l();
      if (this.dU().x_()) {
         if (this.am % this.gE() == 0) {
            this.cI = 10;
            if (!this.ba()) {
               this.dU().a(this.dz(), this.dB(), this.dF(), avo.Ch, this.dj(), 5.0F, this.fo(), false);
            }
         }

         this.cH = this.cG;
         if (this.cG > 0) {
            this.cG--;
         }

         this.cJ = this.cI;
         if (this.cI > 0) {
            this.cI--;
         }

         switch (this.ar()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void Y() {
      aqt $$0 = (aqt)this.dU();
      $$0.ag().a("wardenBrain");
      this.dZ().a($$0, this);
      this.dU().ag().c();
      super.Y();
      if ((this.am + this.al()) % 120 == 0) {
         a($$0, this.ds(), this, 20);
      }

      if (this.am % 20 == 0) {
         this.cN.a($$0, this::b);
         this.gD();
      }

      cld.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.ch.a(this.am);
      } else if ($$0 == 61) {
         this.cG = 10;
      } else if ($$0 == 62) {
         this.ci.a(this.am);
      } else {
         super.b($$0);
      }
   }

   private int gE() {
      float $$0 = (float)this.t() / (float)cla.c.a();
      return 40 - aym.d(aym.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return aym.i($$0, (float)this.cH, (float)this.cG) / 10.0F;
   }

   public float H(float $$0) {
      return aym.i($$0, (float)this.cJ, (float)this.cI) / 10.0F;
   }

   private void a(brq $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayt $$1 = this.et();
         dtc $$2 = this.bt();
         if ($$2.l() != dlw.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dz() + (double)aym.b($$1, -0.7F, 0.7F);
               double $$5 = this.dB();
               double $$6 = this.dF() + (double)aym.b($$1, -0.7F, 0.7F);
               this.dU().a(new ks(lb.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ax.equals($$0)) {
         switch (this.ar()) {
            case n:
               this.d.a(this.am);
               break;
            case o:
               this.e.a(this.am);
               break;
            case l:
               this.b.a(this.am);
               break;
            case m:
               this.c.a(this.am);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dbs $$0) {
      return this.gC();
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cld.a(this, $$0);
   }

   @Override
   public btp<clc> dZ() {
      return (btp<clc>)super.dZ();
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public void a(BiConsumer<dxs<?>, aqt> $$0) {
      if (this.dU() instanceof aqt $$1) {
         $$0.accept(this.cK, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable brv $$0) {
      if ($$0 instanceof bso $$1
         && this.dU() == $$0.dU()
         && bsa.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsb.d
         && $$1.ak() != bsb.bq
         && !$$1.cz()
         && !$$1.eJ()
         && this.dU().D_().a($$1.cP())) {
         return true;
      }

      return false;
   }

   public static void a(aqt $$0, ewu $$1, @Nullable brv $$2, int $$3) {
      brh $$4 = new brh(brj.G, 260, 0, false, false);
      bri.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      clb.a(this::b).encodeStart(uy.a, this.cN).resultOrPartial(cj::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dye.a.a.encodeStart(uy.a, this.cM).resultOrPartial(cj::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clb.a(this::b).parse(new Dynamic(uy.a, $$0.c("anger"))).resultOrPartial(cj::error).ifPresent($$0x -> this.cN = $$0x);
         this.gD();
      }

      if ($$0.b("listener", 10)) {
         dye.a.a.parse(new Dynamic(uy.a, $$0.p("listener"))).resultOrPartial(cj::error).ifPresent($$0x -> this.cM = $$0x);
      }
   }

   private void gH() {
      if (!this.c(bsz.l)) {
         this.a(this.x().c(), 10.0F, this.fo());
      }
   }

   public cla x() {
      return cla.a(this.gI());
   }

   private int gI() {
      return this.cN.b(this.p());
   }

   public void c(brv $$0) {
      this.cN.a($$0);
   }

   public void d(@Nullable brv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable brv $$0, int $$1, boolean $$2) {
      if (!this.go() && this.b($$0)) {
         cld.a((bso)this);
         boolean $$3 = !(this.dZ().c(cbr.o).orElse(null) instanceof cly);
         int $$4 = this.cN.a($$0, $$1);
         if ($$0 instanceof cly && $$3 && cla.a($$4).d()) {
            this.dZ().b(cbr.o);
         }

         if ($$2) {
            this.gH();
         }
      }
   }

   public Optional<bso> gy() {
      return this.x().d() ? this.cN.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bso p() {
      return this.dZ().c(cbr.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.dZ().a(cbr.aE, azo.a, 1200L);
      if ($$2 == bss.k) {
         this.b(bsz.n);
         this.dZ().a(cbr.aC, azo.a, (long)cld.a);
         this.a(avo.Ca, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dU().C && !this.go() && !this.gC()) {
         brv $$3 = $$0.d();
         this.a($$3, cla.c.a() + 20, false);
         if (this.bO.c(cbr.o).isEmpty() && $$3 instanceof bso $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bso $$0) {
      this.dZ().b(cbr.ay);
      this.dZ().a(cbr.o, $$0);
      this.dZ().b(cbr.E);
      byg.a(this, 200);
   }

   @Override
   public bry e(bsz $$0) {
      bry $$1 = super.e($$0);
      return this.gC() ? bry.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bF() {
      return !this.gC() && super.bF();
   }

   @Override
   protected void D(brv $$0) {
      if (!this.go() && !this.dZ().a(cbr.aH)) {
         this.dZ().a(cbr.aH, azo.a, 20L);
         this.d($$0);
         cld.a(this, $$0.du());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public clb gz() {
      return this.cN;
   }

   @Override
   protected cbz b(dca $$0) {
      return new cby(this, $$0) {
         @Override
         protected epu a(int $$0) {
            this.o = new eqa();
            this.o.a(true);
            return new epu(this.o, $$0) {
               @Override
               protected float a(epq $$0, epq $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dye.a gA() {
      return this.cM;
   }

   @Override
   public dye.d gB() {
      return this.cL;
   }

   class a implements dye.d {
      private static final int b = 16;
      private final dxz c = new dxt(clc.this, clc.this.cQ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxz b() {
         return this.c;
      }

      @Override
      public awt<dxv> c() {
         return awk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqt $$0, ir $$1, ja<dxv> $$2, dxv.a $$3) {
         if (!clc.this.go() && !clc.this.eJ() && !clc.this.dZ().a(cbr.aI) && !clc.this.gC() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bso $$4 && !clc.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable brv $$3, @Nullable brv $$4, float $$5) {
         if (!clc.this.eJ()) {
            clc.this.bO.a(cbr.aI, azo.a, 40L);
            $$0.a(clc.this, (byte)61);
            clc.this.a(avo.Ct, 5.0F, clc.this.fo());
            ir $$6 = $$1;
            if ($$4 != null) {
               if (clc.this.a($$4, 30.0)) {
                  if (clc.this.dZ().a(cbr.aA)) {
                     if (clc.this.b($$4)) {
                        $$6 = $$4.du();
                     }

                     clc.this.d($$4);
                  } else {
                     clc.this.a($$4, 10, true);
                  }
               }

               clc.this.dZ().a(cbr.aA, azo.a, 100L);
            } else {
               clc.this.d($$3);
            }

            if (!clc.this.x().d()) {
               Optional<bso> $$7 = clc.this.cN.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cld.a(clc.this, $$6);
               }
            }
         }
      }
   }
}
