import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cov extends cms implements ecs {
   private static final Logger cb = LogUtils.getLogger();
   private static final int cc = 40;
   private static final int cd = 200;
   private static final int ce = 500;
   private static final float cf = 0.3F;
   private static final float cg = 1.0F;
   private static final float ch = 1.5F;
   private static final int ci = 30;
   private static final int cj = 24;
   private static final alc<Integer> ck = alg.a(cov.class, ale.b);
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
   public bux a = new bux();
   public bux b = new bux();
   public bux c = new bux();
   public bux d = new bux();
   public bux bZ = new bux();
   public bux ca = new bux();
   private final ecg<ecs.b> cF;
   private final ecs.d cG;
   private ecs.a cH;
   cou cI = new cou(this::b, Collections.emptyList());

   public cov(bvm<? extends cms> $$0, dha $$1) {
      super($$0, $$1);
      this.cG = new cov.a();
      this.cH = new ecs.a();
      this.cF = new ecg<>(new ecs.b(this));
      this.bO = 5;
      this.L().a(true);
      this.a(eug.m, 0.0F);
      this.a(eug.q, 8.0F);
      this.a(eug.f, 8.0F);
      this.a(eug.i, 8.0F);
      this.a(eug.o, 0.0F);
      this.a(eug.n, 0.0F);
   }

   @Override
   public aac<acr> a(asf $$0) {
      return new acs(this, $$0, this.c(bwn.n) ? 1 : 0);
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bwn.n);
      }
   }

   @Override
   public boolean a(dhd $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ash $$0, btv $$1) {
      return this.gp() && !$$1.a(axw.d) ? true : super.a($$0, $$1);
   }

   boolean gp() {
      return this.c(bwn.o) || this.c(bwn.n);
   }

   @Override
   protected boolean o(bvf $$0) {
      return false;
   }

   @Override
   public boolean fS() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 500.0).a(bxj.v, 0.3F).a(bxj.p, 1.0).a(bxj.d, 1.5).a(bxj.c, 30.0).a(bxj.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected axe u() {
      return !this.c(bwn.l) && !this.gp() ? this.t().b() : null;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Cm;
   }

   @Override
   protected axe o_() {
      return axf.Ci;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.Cw, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      $$0.a(this, (byte)4);
      this.a(axf.Ch, 10.0F, this.ff());
      cbu.a(this, 40);
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

   private void gs() {
      this.al.a(ck, this.gv());
   }

   @Override
   public void h() {
      if (this.dV() instanceof ash $$0) {
         ecs.c.a($$0, this.cH, this.cG);
         if (this.aj() || this.W()) {
            cow.a((bwb)this);
         }
      }

      super.h();
      if (this.dV().B_()) {
         if (this.af % this.gt() == 0) {
            this.cD = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), axf.Cl, this.dm(), 5.0F, this.ff(), false);
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
      bpo $$1 = bpn.a();
      $$1.a("wardenBrain");
      this.eb().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cI.a($$0, this::b);
         this.gs();
      }

      cow.a(this);
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

   private int gt() {
      float $$0 = (float)this.p() / (float)cot.c.a();
      return 40 - bae.d(bae.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return bae.h($$0, (float)this.cC, (float)this.cz) / 10.0F;
   }

   public float K(float $$0) {
      return bae.h($$0, (float)this.cE, (float)this.cD) / 10.0F;
   }

   private void a(bux $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         bam $$1 = this.dY();
         dxn $$2 = this.bu();
         if ($$2.o() != dqn.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)bae.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)bae.b($$1, -0.7F, 0.7F);
               this.dV().a(new lk(ls.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
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
   public boolean a(dgs $$0) {
      return this.gp();
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cow.a(this, $$0);
   }

   @Override
   public bxd<cov> eb() {
      return (bxd<cov>)super.eb();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a(BiConsumer<ecg<?>, ash> $$0) {
      if (this.dV() instanceof ash $$1) {
         $$0.accept(this.cF, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bvf $$0) {
      if ($$0 instanceof bwb $$1
         && this.dV() == $$0.dV()
         && bvk.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bvm.f
         && $$1.aq() != bvm.bG
         && !$$1.cC()
         && !$$1.eE()
         && this.dV().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ash $$0, fbs $$1, @Nullable bvf $$2, int $$3) {
      buk $$4 = new buk(bum.G, 260, 0, false, false);
      bul.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      alx<vu> $$1 = this.dX().a(vl.a);
      cou.a(this::b)
         .encodeStart($$1, this.cI)
         .resultOrPartial($$0x -> cb.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ecs.a.a
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> cb.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      alx<vu> $$1 = this.dX().a(vl.a);
      if ($$0.e("anger")) {
         cou.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> cb.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cI = $$0x);
         this.gs();
      }

      if ($$0.b("listener", 10)) {
         ecs.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> cb.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
      }
   }

   private void gu() {
      if (!this.c(bwn.l)) {
         this.a(this.t().c(), 10.0F, this.ff());
      }
   }

   public cot t() {
      return cot.a(this.gv());
   }

   private int gv() {
      return this.cI.b(this.O_());
   }

   @Override
   public void c(bvf $$0) {
      this.cI.a($$0);
   }

   public void d(@Nullable bvf $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bvf $$0, int $$1, boolean $$2) {
      if (!this.fZ() && this.b($$0)) {
         cow.a((bwb)this);
         boolean $$3 = !(this.O_() instanceof cps);
         int $$4 = this.cI.a($$0, $$1);
         if ($$0 instanceof cps && $$3 && cot.a($$4).d()) {
            this.eb().b(cff.o);
         }

         if ($$2) {
            this.gu();
         }
      }
   }

   public Optional<bwb> x() {
      return this.t().d() ? this.cI.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.eb().a(cff.aE, bbk.a, 1200L);
      if ($$2 == bvl.k) {
         this.b(bwn.n);
         this.eb().a(cff.aC, bbk.a, (long)cow.a);
         this.a(axf.Ce, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.fZ() && !this.gp()) {
         bvf $$4 = $$1.d();
         this.a($$4, cot.c.a() + 20, false);
         if (this.bF.c(cff.o).isEmpty() && $$4 instanceof bwb $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bwb $$0) {
      this.eb().b(cff.ay);
      this.eb().a(cff.o, $$0);
      this.eb().b(cff.E);
      cbu.a(this, 200);
   }

   @Override
   public bvi e(bwn $$0) {
      bvi $$1 = super.e($$0);
      return this.gp() ? bvi.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gp() && super.bI();
   }

   @Override
   protected void D(bvf $$0) {
      if (!this.fZ() && !this.eb().a(cff.aH)) {
         this.eb().a(cff.aH, bbk.a, 20L);
         this.d($$0);
         cow.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cou gm() {
      return this.cI;
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfm(this, $$0) {
         @Override
         protected euf a(int $$0) {
            this.o = new eul();
            this.o.a(true);
            return new euf(this.o, $$0) {
               @Override
               protected float a(eub $$0, eub $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ecs.a gn() {
      return this.cH;
   }

   @Override
   public ecs.d go() {
      return this.cG;
   }

   class a implements ecs.d {
      private static final int b = 16;
      private final ecn c = new ech(cov.this, cov.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ecn b() {
         return this.c;
      }

      @Override
      public ayk<ecj> c() {
         return ayb.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecj> $$2, ecj.a $$3) {
         if (!cov.this.fZ() && !cov.this.eE() && !cov.this.eb().a(cff.aI) && !cov.this.gp() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bwb $$4 && !cov.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecj> $$2, @Nullable bvf $$3, @Nullable bvf $$4, float $$5) {
         if (!cov.this.eE()) {
            cov.this.bF.a(cff.aI, bbk.a, 40L);
            $$0.a(cov.this, (byte)61);
            cov.this.a(axf.Cx, 5.0F, cov.this.ff());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cov.this.a($$4, 30.0)) {
                  if (cov.this.eb().a(cff.aA)) {
                     if (cov.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cov.this.d($$4);
                  } else {
                     cov.this.a($$4, 10, true);
                  }
               }

               cov.this.eb().a(cff.aA, bbk.a, 100L);
            } else {
               cov.this.d($$3);
            }

            if (!cov.this.t().d()) {
               Optional<bwb> $$7 = cov.this.cI.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cow.a(cov.this, $$6);
               }
            }
         }
      }
   }
}
