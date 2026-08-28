import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class coz extends cmw implements ecz {
   private static final Logger cb = LogUtils.getLogger();
   private static final int cc = 40;
   private static final int cd = 200;
   private static final int ce = 500;
   private static final float cf = 0.3F;
   private static final float cg = 1.0F;
   private static final float ch = 1.5F;
   private static final int ci = 30;
   private static final int cj = 24;
   private static final alc<Integer> ck = alg.a(coz.class, ale.b);
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
   public bvb a = new bvb();
   public bvb b = new bvb();
   public bvb c = new bvb();
   public bvb d = new bvb();
   public bvb bZ = new bvb();
   public bvb ca = new bvb();
   private final ecn<ecz.b> cF;
   private final ecz.d cG;
   private ecz.a cH;
   coy cI = new coy(this::b, Collections.emptyList());

   public coz(bvq<? extends cmw> $$0, dhh $$1) {
      super($$0, $$1);
      this.cG = new coz.a();
      this.cH = new ecz.a();
      this.cF = new ecn<>(new ecz.b(this));
      this.bO = 5;
      this.L().a(true);
      this.a(eun.m, 0.0F);
      this.a(eun.q, 8.0F);
      this.a(eun.f, 8.0F);
      this.a(eun.i, 8.0F);
      this.a(eun.o, 0.0F);
      this.a(eun.n, 0.0F);
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, $$0, this.c(bwr.n) ? 1 : 0);
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bwr.n);
      }
   }

   @Override
   public boolean a(dhk $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.du()));
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ash $$0, btz $$1) {
      return this.gr() && !$$1.a(axw.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bwr.o) || this.c(bwr.n);
   }

   @Override
   protected boolean o(bvj $$0) {
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

   public static bxm.a m() {
      return cmw.gt().a(bxn.s, 500.0).a(bxn.v, 0.3F).a(bxn.p, 1.0).a(bxn.d, 1.5).a(bxn.c, 30.0).a(bxn.m, 24.0);
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
      return !this.c(bwr.l) && !this.gr() ? this.t().b() : null;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.Cn;
   }

   @Override
   protected axe o_() {
      return axf.Cj;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.Cx, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      $$0.a(this, (byte)4);
      this.a(axf.Ci, 10.0F, this.fh());
      cby.a(this, 40);
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
         ecz.c.a($$0, this.cH, this.cG);
         if (this.aj() || this.W()) {
            cpa.a((bwf)this);
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
      bps $$1 = bpr.a();
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

      cpa.a(this);
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
      float $$0 = (float)this.p() / (float)cox.c.a();
      return 40 - bae.d(bae.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return bae.h($$0, (float)this.cC, (float)this.cz) / 10.0F;
   }

   public float K(float $$0) {
      return bae.h($$0, (float)this.cE, (float)this.cD) / 10.0F;
   }

   private void a(bvb $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         bam $$1 = this.dZ();
         dxu $$2 = this.bu();
         if ($$2.o() != dqu.a) {
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
   public boolean a(dgz $$0) {
      return this.gr();
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cpa.a(this, $$0);
   }

   @Override
   public bxh<coz> ec() {
      return (bxh<coz>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a(BiConsumer<ecn<?>, ash> $$0) {
      if (this.dW() instanceof ash $$1) {
         $$0.accept(this.cF, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bvj $$0) {
      if ($$0 instanceof bwf $$1
         && this.dW() == $$0.dW()
         && bvo.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bvq.f
         && $$1.aq() != bvq.bG
         && !$$1.cC()
         && !$$1.eF()
         && this.dW().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ash $$0, fbx $$1, @Nullable bvj $$2, int $$3) {
      buo $$4 = new buo(buq.G, 260, 0, false, false);
      bup.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      alx<vu> $$1 = this.dY().a(vl.a);
      coy.a(this::b)
         .encodeStart($$1, this.cI)
         .resultOrPartial($$0x -> cb.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ecz.a.a
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> cb.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      alx<vu> $$1 = this.dY().a(vl.a);
      if ($$0.e("anger")) {
         coy.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> cb.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cI = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         ecz.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> cb.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bwr.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public cox t() {
      return cox.a(this.gx());
   }

   private int gx() {
      return this.cI.b(this.O_());
   }

   @Override
   public void c(bvj $$0) {
      this.cI.a($$0);
   }

   public void d(@Nullable bvj $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bvj $$0, int $$1, boolean $$2) {
      if (!this.gb() && this.b($$0)) {
         cpa.a((bwf)this);
         boolean $$3 = !(this.O_() instanceof cpw);
         int $$4 = this.cI.a($$0, $$1);
         if ($$0 instanceof cpw && $$3 && cox.a($$4).d()) {
            this.ec().b(cfj.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bwf> x() {
      return this.t().d() ? this.cI.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.ec().a(cfj.aE, bbk.a, 1200L);
      if ($$2 == bvp.k) {
         this.b(bwr.n);
         this.ec().a(cfj.aC, bbk.a, (long)cpa.a);
         this.a(axf.Cf, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gb() && !this.gr()) {
         bvj $$4 = $$1.d();
         this.a($$4, cox.c.a() + 20, false);
         if (this.bF.c(cfj.o).isEmpty() && $$4 instanceof bwf $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bwf $$0) {
      this.ec().b(cfj.ay);
      this.ec().a(cfj.o, $$0);
      this.ec().b(cfj.E);
      cby.a(this, 200);
   }

   @Override
   public bvm e(bwr $$0) {
      bvm $$1 = super.e($$0);
      return this.gr() ? bvm.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gr() && super.bI();
   }

   @Override
   protected void D(bvj $$0) {
      if (!this.gb() && !this.ec().a(cfj.aH)) {
         this.ec().a(cfj.aH, bbk.a, 20L);
         this.d($$0);
         cpa.a(this, $$0.dw());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public coy go() {
      return this.cI;
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cfq(this, $$0) {
         @Override
         protected eum a(int $$0) {
            this.o = new eus();
            this.o.a(true);
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
   public ecz.a gp() {
      return this.cH;
   }

   @Override
   public ecz.d gq() {
      return this.cG;
   }

   class a implements ecz.d {
      private static final int b = 16;
      private final ecu c = new eco(coz.this, coz.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ecu b() {
         return this.c;
      }

      @Override
      public ayk<ecq> c() {
         return ayb.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecq> $$2, ecq.a $$3) {
         if (!coz.this.gb() && !coz.this.eF() && !coz.this.ec().a(cfj.aI) && !coz.this.gr() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bwf $$4 && !coz.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecq> $$2, @Nullable bvj $$3, @Nullable bvj $$4, float $$5) {
         if (!coz.this.eF()) {
            coz.this.bF.a(cfj.aI, bbk.a, 40L);
            $$0.a(coz.this, (byte)61);
            coz.this.a(axf.Cy, 5.0F, coz.this.fh());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (coz.this.a($$4, 30.0)) {
                  if (coz.this.ec().a(cfj.aA)) {
                     if (coz.this.b($$4)) {
                        $$6 = $$4.dw();
                     }

                     coz.this.d($$4);
                  } else {
                     coz.this.a($$4, 10, true);
                  }
               }

               coz.this.ec().a(cfj.aA, bbk.a, 100L);
            } else {
               coz.this.d($$3);
            }

            if (!coz.this.t().d()) {
               Optional<bwf> $$7 = coz.this.cI.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cpa.a(coz.this, $$6);
               }
            }
         }
      }
   }
}
