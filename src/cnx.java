import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnx extends clw implements eca {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final ajx<Integer> cj = akb.a(cnx.class, ajz.b);
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
   private int cz;
   private int cC;
   private int cD;
   public bub a = new bub();
   public bub b = new bub();
   public bub c = new bub();
   public bub d = new bub();
   public bub bY = new bub();
   public bub bZ = new bub();
   private final ebo<eca.b> cE;
   private final eca.d cF;
   private eca.a cG;
   cnw cH = new cnw(this::b, Collections.emptyList());

   public cnx(buq<? extends clw> $$0, dgg $$1) {
      super($$0, $$1);
      this.cF = new cnx.a();
      this.cG = new eca.a();
      this.cE = new ebo<>(new eca.b(this));
      this.bN = 5;
      this.L().a(true);
      this.a(eto.m, 0.0F);
      this.a(eto.q, 8.0F);
      this.a(eto.f, 8.0F);
      this.a(eto.i, 8.0F);
      this.a(eto.o, 0.0F);
      this.a(eto.n, 0.0F);
   }

   @Override
   public yv<abk> a(ara $$0) {
      return new abl(this, $$0, this.c(bvr.n) ? 1 : 0);
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvr.n);
      }
   }

   @Override
   public boolean a(dgj $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.du()));
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arc $$0, bsz $$1) {
      return this.gs() && !$$1.a(awq.d) ? true : super.a($$0, $$1);
   }

   boolean gs() {
      return this.c(bvr.o) || this.c(bvr.n);
   }

   @Override
   protected boolean o(buj $$0) {
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

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 500.0).a(bwn.v, 0.3F).a(bwn.p, 1.0).a(bwn.d, 1.5).a(bwn.c, 30.0).a(bwn.m, 24.0);
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
   protected avy u() {
      return !this.c(bvr.l) && !this.gs() ? this.t().b() : null;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.CC;
   }

   @Override
   protected avy o_() {
      return avz.Cy;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.CM, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      $$0.a(this, (byte)4);
      this.a(avz.Cx, 10.0F, this.fh());
      cay.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int p() {
      return this.al.a(cj);
   }

   private void gv() {
      this.al.a(cj, this.gy());
   }

   @Override
   public void h() {
      if (this.dW() instanceof arc $$0) {
         eca.c.a($$0, this.cG, this.cF);
         if (this.ak() || this.X()) {
            cny.a((bvf)this);
         }
      }

      super.h();
      if (this.dW().B_()) {
         if (this.af % this.gw() == 0) {
            this.cC = 10;
            if (!this.bb()) {
               this.dW().a(this.dB(), this.dD(), this.dH(), avz.CB, this.dn(), 5.0F, this.fh(), false);
            }
         }

         this.cz = this.cy;
         if (this.cy > 0) {
            this.cy--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
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
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("wardenBrain");
      this.ec().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.du(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gv();
      }

      cny.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bY.a(this.af);
      } else if ($$0 == 61) {
         this.cy = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gw() {
      float $$0 = (float)this.p() / (float)cnv.c.a();
      return 40 - ayy.d(ayy.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return ayy.h($$0, (float)this.cz, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return ayy.h($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bub $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azg $$1 = this.dZ();
         dwv $$2 = this.bu();
         if ($$2.o() != dpv.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dB() + (double)ayy.b($$1, -0.7F, 0.7F);
               double $$5 = this.dD();
               double $$6 = this.dH() + (double)ayy.b($$1, -0.7F, 0.7F);
               this.dW().a(new ll(lt.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
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
   public boolean a(dfy $$0) {
      return this.gs();
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cny.a(this, $$0);
   }

   @Override
   public bwh<cnx> ec() {
      return (bwh<cnx>)super.ec();
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void a(BiConsumer<ebo<?>, arc> $$0) {
      if (this.dW() instanceof arc $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable buj $$0) {
      if ($$0 instanceof bvf $$1
         && this.dW() == $$0.dW()
         && buo.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != buq.f
         && $$1.aq() != buq.bF
         && !$$1.cC()
         && !$$1.eF()
         && this.dW().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arc $$0, fay $$1, @Nullable buj $$2, int $$3) {
      bto $$4 = new bto(btq.G, 260, 0, false, false);
      btp.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      aks<un> $$1 = this.dY().a(ue.a);
      cnw.a(this::b)
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eca.a.a
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      aks<un> $$1 = this.dY().a(ue.a);
      if ($$0.e("anger")) {
         cnw.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
         this.gv();
      }

      if ($$0.b("listener", 10)) {
         eca.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gx() {
      if (!this.c(bvr.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public cnv t() {
      return cnv.a(this.gy());
   }

   private int gy() {
      return this.cH.b(this.O_());
   }

   @Override
   public void c(buj $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable buj $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable buj $$0, int $$1, boolean $$2) {
      if (!this.gc() && this.b($$0)) {
         cny.a((bvf)this);
         boolean $$3 = !(this.O_() instanceof cov);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cov && $$3 && cnv.a($$4).d()) {
            this.ec().b(cej.o);
         }

         if ($$2) {
            this.gx();
         }
      }
   }

   public Optional<bvf> x() {
      return this.t().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.ec().a(cej.aE, bae.a, 1200L);
      if ($$2 == bup.k) {
         this.b(bvr.n);
         this.ec().a(cej.aC, bae.a, (long)cny.a);
         this.a(avz.Cu, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gc() && !this.gs()) {
         buj $$4 = $$1.d();
         this.a($$4, cnv.c.a() + 20, false);
         if (this.bE.c(cej.o).isEmpty() && $$4 instanceof bvf $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bvf $$0) {
      this.ec().b(cej.ay);
      this.ec().a(cej.o, $$0);
      this.ec().b(cej.E);
      cay.a(this, 200);
   }

   @Override
   public bum e(bvr $$0) {
      bum $$1 = super.e($$0);
      return this.gs() ? bum.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gs() && super.bI();
   }

   @Override
   protected void D(buj $$0) {
      if (!this.gc() && !this.ec().a(cej.aH)) {
         this.ec().a(cej.aH, bae.a, 20L);
         this.d($$0);
         cny.a(this, $$0.dw());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cnw gp() {
      return this.cH;
   }

   @Override
   protected cer b(dgg $$0) {
      return new ceq(this, $$0) {
         @Override
         protected etn a(int $$0) {
            this.o = new ett();
            return new etn(this.o, $$0) {
               @Override
               protected float a(etj $$0, etj $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eca.a gq() {
      return this.cG;
   }

   @Override
   public eca.d gr() {
      return this.cF;
   }

   class a implements eca.d {
      private static final int b = 16;
      private final ebv c = new ebp(cnx.this, cnx.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ebv b() {
         return this.c;
      }

      @Override
      public axe<ebr> c() {
         return awv.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebr> $$2, ebr.a $$3) {
         if (!cnx.this.gc() && !cnx.this.eF() && !cnx.this.ec().a(cej.aI) && !cnx.this.gs() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bvf $$4 && !cnx.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable buj $$3, @Nullable buj $$4, float $$5) {
         if (!cnx.this.eF()) {
            cnx.this.bE.a(cej.aI, bae.a, 40L);
            $$0.a(cnx.this, (byte)61);
            cnx.this.a(avz.CN, 5.0F, cnx.this.fh());
            ji $$6 = $$1;
            if ($$4 != null) {
               if (cnx.this.a($$4, 30.0)) {
                  if (cnx.this.ec().a(cej.aA)) {
                     if (cnx.this.b($$4)) {
                        $$6 = $$4.dw();
                     }

                     cnx.this.d($$4);
                  } else {
                     cnx.this.a($$4, 10, true);
                  }
               }

               cnx.this.ec().a(cej.aA, bae.a, 100L);
            } else {
               cnx.this.d($$3);
            }

            if (!cnx.this.t().d()) {
               Optional<bvf> $$7 = cnx.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cny.a(cnx.this, $$6);
               }
            }
         }
      }
   }
}
