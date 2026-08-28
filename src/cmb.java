import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmb extends ckd implements dyi {
   private static final Logger ce = LogUtils.getLogger();
   private static final int cf = 40;
   private static final int cg = 200;
   private static final int ch = 500;
   private static final float ci = 0.3F;
   private static final float cj = 1.0F;
   private static final float ck = 1.5F;
   private static final int cl = 30;
   private static final ajw<Integer> cm = aka.a(cmb.class, ajy.b);
   private static final int cn = 200;
   private static final int co = 260;
   private static final int cp = 20;
   private static final int cq = 120;
   private static final int cr = 20;
   private static final int cs = 35;
   private static final int ct = 10;
   private static final int cu = 20;
   private static final int cv = 100;
   private static final int cw = 20;
   private static final int cx = 30;
   private static final float cy = 4.5F;
   private static final float cz = 0.7F;
   private static final int cA = 30;
   private int cB;
   private int cD;
   private int cE;
   private int cF;
   public bsm b = new bsm();
   public bsm c = new bsm();
   public bsm d = new bsm();
   public bsm e = new bsm();
   public bsm cc = new bsm();
   public bsm cd = new bsm();
   private final dxw<dyi.b> cG;
   private final dyi.d cH;
   private dyi.a cI;
   cma cJ = new cma(this::c, Collections.emptyList());

   public cmb(bsx<? extends ckd> $$0, dcw $$1) {
      super($$0, $$1);
      this.cH = new cmb.a();
      this.cI = new dyi.a();
      this.cG = new dxw<>(new dyi.b(this));
      this.bR = 5;
      this.N().a(true);
      this.a(epv.m, 0.0F);
      this.a(epv.q, 8.0F);
      this.a(epv.f, 8.0F);
      this.a(epv.i, 8.0F);
      this.a(epv.o, 0.0F);
      this.a(epv.n, 0.0F);
   }

   @Override
   public zg<abu> a(aqt $$0) {
      return new abv(this, $$0, this.c(bua.n) ? 1 : 0);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bua.n);
      }
   }

   @Override
   public boolean a(dcz $$0) {
      return super.a($$0) && $$0.a(this, this.am().n().a(this.dm()));
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brk $$0) {
      return this.go() && !$$0.a(awg.d) ? true : super.b($$0);
   }

   boolean go() {
      return this.c(bua.o) || this.c(bua.n);
   }

   @Override
   protected boolean o(bsr $$0) {
      return false;
   }

   @Override
   public boolean fK() {
      return true;
   }

   @Override
   protected float aP() {
      return this.aa + 0.55F;
   }

   public static buv.a s() {
      return ckd.gq().a(buw.s, 500.0).a(buw.v, 0.3F).a(buw.p, 1.0).a(buw.d, 1.5).a(buw.c, 30.0);
   }

   @Override
   public boolean bd() {
      return true;
   }

   @Override
   protected float fa() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avo v() {
      return !this.c(bua.l) && !this.go() ? this.x().b() : null;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.BO;
   }

   @Override
   protected avo n_() {
      return avp.BK;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.BY, 10.0F, 1.0F);
   }

   @Override
   public boolean D(bsr $$0) {
      this.dO().a(this, (byte)4);
      this.a(avp.BJ, 10.0F, this.fb());
      bzh.a(this, 40);
      return super.D($$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cm, 0);
   }

   public int t() {
      return this.ao.a(cm);
   }

   private void gr() {
      this.ao.a(cm, this.gu());
   }

   @Override
   public void l() {
      if (this.dO() instanceof aqu $$0) {
         dyi.c.a($$0, this.cI, this.cH);
         if (this.fT() || this.Y()) {
            cmc.a((btn)this);
         }
      }

      super.l();
      if (this.dO().x_()) {
         if (this.ai % this.gs() == 0) {
            this.cE = 10;
            if (!this.aX()) {
               this.dO().a(this.dt(), this.dv(), this.dz(), avp.BN, this.de(), 5.0F, this.fb(), false);
            }
         }

         this.cD = this.cB;
         if (this.cB > 0) {
            this.cB--;
         }

         this.cF = this.cE;
         if (this.cE > 0) {
            this.cE--;
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
   protected void ab() {
      aqu $$0 = (aqu)this.dO();
      $$0.ag().a("wardenBrain");
      this.dT().a($$0, this);
      this.dO().ag().c();
      super.ab();
      if ((this.ai + this.an()) % 120 == 0) {
         a($$0, this.dm(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cJ.a($$0, this::c);
         this.gr();
      }

      cmc.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.cc.a(this.ai);
      } else if ($$0 == 61) {
         this.cB = 10;
      } else if ($$0 == 62) {
         this.cd.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gs() {
      float $$0 = (float)this.t() / (float)clz.c.a();
      return 40 - ayo.d(ayo.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float H(float $$0) {
      return ayo.i($$0, (float)this.cD, (float)this.cB) / 10.0F;
   }

   public float I(float $$0) {
      return ayo.i($$0, (float)this.cF, (float)this.cE) / 10.0F;
   }

   private void a(bsm $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayw $$1 = this.dR();
         dtc $$2 = this.bq();
         if ($$2.l() != dmf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dt() + (double)ayo.b($$1, -0.7F, 0.7F);
               double $$5 = this.dv();
               double $$6 = this.dz() + (double)ayo.b($$1, -0.7F, 0.7F);
               this.dO().a(new le(lm.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajw<?> $$0) {
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
   public boolean a(dco $$0) {
      return this.go();
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cmc.a(this, $$0);
   }

   @Override
   public buq<cmb> dT() {
      return (buq<cmb>)super.dT();
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public void a(BiConsumer<dxw<?>, aqu> $$0) {
      if (this.dO() instanceof aqu $$1) {
         $$0.accept(this.cG, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable bsr $$0) {
      if ($$0 instanceof btn $$1
         && this.dO() == $$0.dO()
         && bsw.e.test($$0)
         && !this.s($$0)
         && $$1.am() != bsx.d
         && $$1.am() != bsx.bm
         && !$$1.cv()
         && !$$1.ex()
         && this.dO().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(aqu $$0, exc $$1, @Nullable bsr $$2, int $$3) {
      brz $$4 = new brz(bsb.G, 260, 0, false, false);
      bsa.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      akp<uy> $$1 = this.dQ().a(up.a);
      cma.a(this::c)
         .encodeStart($$1, this.cJ)
         .resultOrPartial($$0x -> ce.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      dyi.a.a
         .encodeStart($$1, this.cI)
         .resultOrPartial($$0x -> ce.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      akp<uy> $$1 = this.dQ().a(up.a);
      if ($$0.e("anger")) {
         cma.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ce.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cJ = $$0x);
         this.gr();
      }

      if ($$0.b("listener", 10)) {
         dyi.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ce.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cI = $$0x);
      }
   }

   private void gt() {
      if (!this.c(bua.l)) {
         this.a(this.x().c(), 10.0F, this.fb());
      }
   }

   public clz x() {
      return clz.a(this.gu());
   }

   private int gu() {
      return this.cJ.b(this.p());
   }

   @Override
   public void d(bsr $$0) {
      this.cJ.a($$0);
   }

   public void e(@Nullable bsr $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsr $$0, int $$1, boolean $$2) {
      if (!this.fZ() && this.c($$0)) {
         cmc.a((btn)this);
         boolean $$3 = !(this.p() instanceof cmx);
         int $$4 = this.cJ.a($$0, $$1);
         if ($$0 instanceof cmx && $$3 && clz.a($$4).d()) {
            this.dT().b(ccs.o);
         }

         if ($$2) {
            this.gt();
         }
      }
   }

   public Optional<btn> gk() {
      return this.x().d() ? this.cJ.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.dT().a(ccs.aE, azs.a, 1200L);
      if ($$2 == btr.k) {
         this.b(bua.n);
         this.dT().a(ccs.aC, azs.a, (long)cmc.a);
         this.a(avp.BG, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dO().B && !this.fZ() && !this.go()) {
         bsr $$3 = $$0.d();
         this.a($$3, clz.c.a() + 20, false);
         if (this.bF.c(ccs.o).isEmpty() && $$3 instanceof btn $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btn $$0) {
      this.dT().b(ccs.ay);
      this.dT().a(ccs.o, $$0);
      this.dT().b(ccs.E);
      bzh.a(this, 200);
   }

   @Override
   public bsu e(bua $$0) {
      bsu $$1 = super.e($$0);
      return this.go() ? bsu.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bB() {
      return !this.go() && super.bB();
   }

   @Override
   protected void E(bsr $$0) {
      if (!this.fZ() && !this.dT().a(ccs.aH)) {
         this.dT().a(ccs.aH, azs.a, 20L);
         this.e($$0);
         cmc.a(this, $$0.do());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public cma gl() {
      return this.cJ;
   }

   @Override
   protected cda b(dcw $$0) {
      return new ccz(this, $$0) {
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
   public dyi.a gm() {
      return this.cI;
   }

   @Override
   public dyi.d gn() {
      return this.cH;
   }

   class a implements dyi.d {
      private static final int b = 16;
      private final dyd c = new dxx(cmb.this, cmb.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dyd b() {
         return this.c;
      }

      @Override
      public awu<dxz> c() {
         return awl.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqu $$0, jd $$1, jm<dxz> $$2, dxz.a $$3) {
         if (!cmb.this.fZ() && !cmb.this.ex() && !cmb.this.dT().a(ccs.aI) && !cmb.this.go() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btn $$4 && !cmb.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable bsr $$3, @Nullable bsr $$4, float $$5) {
         if (!cmb.this.ex()) {
            cmb.this.bF.a(ccs.aI, azs.a, 40L);
            $$0.a(cmb.this, (byte)61);
            cmb.this.a(avp.BZ, 5.0F, cmb.this.fb());
            jd $$6 = $$1;
            if ($$4 != null) {
               if (cmb.this.a($$4, 30.0)) {
                  if (cmb.this.dT().a(ccs.aA)) {
                     if (cmb.this.c($$4)) {
                        $$6 = $$4.do();
                     }

                     cmb.this.e($$4);
                  } else {
                     cmb.this.a($$4, 10, true);
                  }
               }

               cmb.this.dT().a(ccs.aA, azs.a, 100L);
            } else {
               cmb.this.e($$3);
            }

            if (!cmb.this.x().d()) {
               Optional<btn> $$7 = cmb.this.cJ.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmc.a(cmb.this, $$6);
               }
            }
         }
      }
   }
}
