import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cpa extends cmx implements eda {
   private static final Logger cb = LogUtils.getLogger();
   private static final int cc = 40;
   private static final int cd = 200;
   private static final int ce = 500;
   private static final float cf = 0.3F;
   private static final float cg = 1.0F;
   private static final float ch = 1.5F;
   private static final int ci = 30;
   private static final int cj = 24;
   private static final alc<Integer> ck = alg.a(cpa.class, ale.b);
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
   private int cC;
   private int cD;
   private int cE;
   public bvc a = new bvc();
   public bvc b = new bvc();
   public bvc c = new bvc();
   public bvc d = new bvc();
   public bvc bZ = new bvc();
   public bvc ca = new bvc();
   private final eco<eda.b> cF;
   private final eda.d cG;
   private eda.a cH;
   coz cI = new coz(this::b, Collections.emptyList());

   public cpa(bvr<? extends cmx> $$0, dhi $$1) {
      super($$0, $$1);
      this.cG = new cpa.a();
      this.cH = new eda.a();
      this.cF = new eco<>(new eda.b(this));
      this.bO = 5;
      this.L().a(true);
      this.a(euo.m, 0.0F);
      this.a(euo.q, 8.0F);
      this.a(euo.f, 8.0F);
      this.a(euo.i, 8.0F);
      this.a(euo.o, 0.0F);
      this.a(euo.n, 0.0F);
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, $$0, this.c(bws.n) ? 1 : 0);
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bws.n);
      }
   }

   @Override
   public boolean a(dhl $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.du()));
   }

   @Override
   public float a(jh $$0, dhl $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ash $$0, bua $$1) {
      return this.gr() && !$$1.a(axw.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bws.o) || this.c(bws.n);
   }

   @Override
   protected boolean o(bvk $$0) {
      return false;
   }

   @Override
   public boolean fU() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 500.0).a(bxo.v, 0.3F).a(bxo.p, 1.0).a(bxo.d, 1.5).a(bxo.c, 30.0).a(bxo.m, 24.0);
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
   protected axe u() {
      return !this.c(bws.l) && !this.gr() ? this.t().b() : null;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.Cn;
   }

   @Override
   protected axe o_() {
      return axf.Cj;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.Cx, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      $$0.a(this, (byte)4);
      this.a(axf.Ci, 10.0F, this.fh());
      cbz.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int p() {
      return this.al.a(ck);
   }

   private void gu() {
      this.al.a(ck, this.gx());
   }

   @Override
   public void h() {
      if (this.dW() instanceof ash $$0) {
         eda.c.a($$0, this.cH, this.cG);
         if (this.aj() || this.W()) {
            cpb.a((bwg)this);
         }
      }

      super.h();
      if (this.dW().B_()) {
         if (this.af % this.gv() == 0) {
            this.cD = 10;
            if (!this.bb()) {
               this.dW().a(this.dB(), this.dD(), this.dH(), axf.Cm, this.dn(), 5.0F, this.fh(), false);
            }
         }

         this.cC = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cE = this.cD;
         if (this.cD > 0) {
            this.cD--;
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
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("wardenBrain");
      this.ec().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.du(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cI.a($$0, this::b);
         this.gu();
      }

      cpb.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bZ.a(this.af);
      } else if ($$0 == 61) {
         this.cz = 10;
      } else if ($$0 == 62) {
         this.ca.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.p() / (float)coy.c.a();
      return 40 - bae.d(bae.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return bae.h($$0, (float)this.cC, (float)this.cz) / 10.0F;
   }

   public float K(float $$0) {
      return bae.h($$0, (float)this.cE, (float)this.cD) / 10.0F;
   }

   private void a(bvc $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         bam $$1 = this.dZ();
         dxv $$2 = this.bu();
         if ($$2.o() != dqv.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dB() + (double)bae.b($$1, -0.7F, 0.7F);
               double $$5 = this.dD();
               double $$6 = this.dH() + (double)bae.b($$1, -0.7F, 0.7F);
               this.dW().a(new lk(ls.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(alc<?> $$0) {
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
   public boolean a(dha $$0) {
      return this.gr();
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cpb.a(this, $$0);
   }

   @Override
   public bxi<cpa> ec() {
      return (bxi<cpa>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a(BiConsumer<eco<?>, ash> $$0) {
      if (this.dW() instanceof ash $$1) {
         $$0.accept(this.cF, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bvk $$0) {
      if ($$0 instanceof bwg $$1
         && this.dW() == $$0.dW()
         && bvp.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bvr.f
         && $$1.aq() != bvr.bG
         && !$$1.cC()
         && !$$1.eF()
         && this.dW().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ash $$0, fby $$1, @Nullable bvk $$2, int $$3) {
      bup $$4 = new bup(bur.G, 260, 0, false, false);
      buq.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      alx<vu> $$1 = this.dY().a(vl.a);
      coz.a(this::b)
         .encodeStart($$1, this.cI)
         .resultOrPartial($$0x -> cb.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eda.a.a
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> cb.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      alx<vu> $$1 = this.dY().a(vl.a);
      if ($$0.e("anger")) {
         coz.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> cb.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cI = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         eda.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> cb.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bws.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public coy t() {
      return coy.a(this.gx());
   }

   private int gx() {
      return this.cI.b(this.O_());
   }

   @Override
   public void c(bvk $$0) {
      this.cI.a($$0);
   }

   public void d(@Nullable bvk $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bvk $$0, int $$1, boolean $$2) {
      if (!this.gb() && this.b($$0)) {
         cpb.a((bwg)this);
         boolean $$3 = !(this.O_() instanceof cpx);
         int $$4 = this.cI.a($$0, $$1);
         if ($$0 instanceof cpx && $$3 && coy.a($$4).d()) {
            this.ec().b(cfk.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bwg> x() {
      return this.t().d() ? this.cI.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.ec().a(cfk.aE, bbk.a, 1200L);
      if ($$2 == bvq.k) {
         this.b(bws.n);
         this.ec().a(cfk.aC, bbk.a, (long)cpb.a);
         this.a(axf.Cf, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gb() && !this.gr()) {
         bvk $$4 = $$1.d();
         this.a($$4, coy.c.a() + 20, false);
         if (this.bF.c(cfk.o).isEmpty() && $$4 instanceof bwg $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bwg $$0) {
      this.ec().b(cfk.ay);
      this.ec().a(cfk.o, $$0);
      this.ec().b(cfk.E);
      cbz.a(this, 200);
   }

   @Override
   public bvn e(bws $$0) {
      bvn $$1 = super.e($$0);
      return this.gr() ? bvn.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gr() && super.bI();
   }

   @Override
   protected void D(bvk $$0) {
      if (!this.gb() && !this.ec().a(cfk.aH)) {
         this.ec().a(cfk.aH, bbk.a, 20L);
         this.d($$0);
         cpb.a(this, $$0.dw());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public coz go() {
      return this.cI;
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cfr(this, $$0) {
         @Override
         protected eun a(int $$0) {
            this.o = new eut();
            this.o.a(true);
            return new eun(this.o, $$0) {
               @Override
               protected float a(euj $$0, euj $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eda.a gp() {
      return this.cH;
   }

   @Override
   public eda.d gq() {
      return this.cG;
   }

   class a implements eda.d {
      private static final int b = 16;
      private final ecv c = new ecp(cpa.this, cpa.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ecv b() {
         return this.c;
      }

      @Override
      public ayk<ecr> c() {
         return ayb.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecr> $$2, ecr.a $$3) {
         if (!cpa.this.gb() && !cpa.this.eF() && !cpa.this.ec().a(cfk.aI) && !cpa.this.gr() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bwg $$4 && !cpa.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable bvk $$3, @Nullable bvk $$4, float $$5) {
         if (!cpa.this.eF()) {
            cpa.this.bF.a(cfk.aI, bbk.a, 40L);
            $$0.a(cpa.this, (byte)61);
            cpa.this.a(axf.Cy, 5.0F, cpa.this.fh());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cpa.this.a($$4, 30.0)) {
                  if (cpa.this.ec().a(cfk.aA)) {
                     if (cpa.this.b($$4)) {
                        $$6 = $$4.dw();
                     }

                     cpa.this.d($$4);
                  } else {
                     cpa.this.a($$4, 10, true);
                  }
               }

               cpa.this.ec().a(cfk.aA, bbk.a, 100L);
            } else {
               cpa.this.d($$3);
            }

            if (!cpa.this.t().d()) {
               Optional<bwg> $$7 = cpa.this.cI.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cpb.a(cpa.this, $$6);
               }
            }
         }
      }
   }
}
