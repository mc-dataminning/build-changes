import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnk extends clm implements eaj {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final akk<Integer> cj = ako.a(cnk.class, akm.b);
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
   public btr b = new btr();
   public btr c = new btr();
   public btr d = new btr();
   public btr e = new btr();
   public btr bY = new btr();
   public btr bZ = new btr();
   private final dzx<eaj.b> cD;
   private final eaj.d cE;
   private eaj.a cF;
   cnj cG = new cnj(this::c, Collections.emptyList());

   public cnk(bug<? extends clm> $$0, dev $$1) {
      super($$0, $$1);
      this.cE = new cnk.a();
      this.cF = new eaj.a();
      this.cD = new dzx<>(new eaj.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(erv.m, 0.0F);
      this.a(erv.q, 8.0F);
      this.a(erv.f, 8.0F);
      this.a(erv.i, 8.0F);
      this.a(erv.o, 0.0F);
      this.a(erv.n, 0.0F);
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new ace(this, $$0, this.c(bvh.n) ? 1 : 0);
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvh.n);
      }
   }

   @Override
   public boolean a(dey $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dv()));
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsp $$0) {
      return this.gz() && !$$0.a(axb.d) ? true : super.b($$0);
   }

   boolean gz() {
      return this.c(bvh.o) || this.c(bvh.n);
   }

   @Override
   protected boolean o(btz $$0) {
      return false;
   }

   @Override
   public boolean fW() {
      return true;
   }

   @Override
   protected float aU() {
      return this.Y + 0.55F;
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 500.0).a(bwd.v, 0.3F).a(bwd.p, 1.0).a(bwd.d, 1.5).a(bwd.c, 30.0).a(bwd.m, 24.0);
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
   protected awj w() {
      return !this.c(bvh.l) && !this.gz() ? this.y().b() : null;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.BS;
   }

   @Override
   protected awj o_() {
      return awk.BO;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.Cc, 10.0F, 1.0F);
   }

   @Override
   public boolean E(btz $$0) {
      this.dX().a(this, (byte)4);
      this.a(awk.BN, 10.0F, this.fj());
      cao.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int t() {
      return this.am.a(cj);
   }

   private void gC() {
      this.am.a(cj, this.gF());
   }

   @Override
   public void l() {
      if (this.dX() instanceof arm $$0) {
         eaj.c.a($$0, this.cF, this.cE);
         if (this.gc() || this.Z()) {
            cnl.a((buv)this);
         }
      }

      super.l();
      if (this.dX().y_()) {
         if (this.ag % this.gD() == 0) {
            this.cB = 10;
            if (!this.bc()) {
               this.dX().a(this.dC(), this.dE(), this.dI(), awk.BR, this.dn(), 5.0F, this.fj(), false);
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

         switch (this.ax()) {
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
      arm $$0 = (arm)this.dX();
      $$0.ah().a("wardenBrain");
      this.ed().a($$0, this);
      this.dX().ah().c();
      super.ac();
      if ((this.ag + this.ar()) % 120 == 0) {
         a($$0, this.dv(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cG.a($$0, this::c);
         this.gC();
      }

      cnl.a(this);
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

   private int gD() {
      float $$0 = (float)this.t() / (float)cni.c.a();
      return 40 - azj.d(azj.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azj.h($$0, (float)this.cA, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azj.h($$0, (float)this.cC, (float)this.cB) / 10.0F;
   }

   private void a(btr $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azr $$1 = this.ea();
         dvd $$2 = this.bv();
         if ($$2.o() != doe.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dC() + (double)azj.b($$1, -0.7F, 0.7F);
               double $$5 = this.dE();
               double $$6 = this.dI() + (double)azj.b($$1, -0.7F, 0.7F);
               this.dX().a(new li(lq.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.ax()) {
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
   public boolean a(den $$0) {
      return this.gz();
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cnl.a(this, $$0);
   }

   @Override
   public bvx<cnk> ed() {
      return (bvx<cnk>)super.ed();
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public void a(BiConsumer<dzx<?>, arm> $$0) {
      if (this.dX() instanceof arm $$1) {
         $$0.accept(this.cD, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable btz $$0) {
      if ($$0 instanceof buv $$1
         && this.dX() == $$0.dX()
         && bue.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bug.d
         && $$1.aq() != bug.bm
         && !$$1.cD()
         && !$$1.eH()
         && this.dX().C_().a($$1.cS())) {
         return true;
      }

      return false;
   }

   public static void a(arm $$0, ezh $$1, @Nullable btz $$2, int $$3) {
      bte $$4 = new bte(btg.G, 260, 0, false, false);
      btf.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      alf<vg> $$1 = this.dZ().a(ux.a);
      cnj.a(this::c)
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eaj.a.a
         .encodeStart($$1, this.cF)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      alf<vg> $$1 = this.dZ().a(ux.a);
      if ($$0.e("anger")) {
         cnj.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
         this.gC();
      }

      if ($$0.b("listener", 10)) {
         eaj.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cF = $$0x);
      }
   }

   private void gE() {
      if (!this.c(bvh.l)) {
         this.a(this.y().c(), 10.0F, this.fj());
      }
   }

   public cni y() {
      return cni.a(this.gF());
   }

   private int gF() {
      return this.cG.b(this.m());
   }

   @Override
   public void d(btz $$0) {
      this.cG.a($$0);
   }

   public void e(@Nullable btz $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable btz $$0, int $$1, boolean $$2) {
      if (!this.gi() && this.c($$0)) {
         cnl.a((buv)this);
         boolean $$3 = !(this.m() instanceof coh);
         int $$4 = this.cG.a($$0, $$1);
         if ($$0 instanceof coh && $$3 && cni.a($$4).d()) {
            this.ed().b(cdz.o);
         }

         if ($$2) {
            this.gE();
         }
      }
   }

   public Optional<buv> gv() {
      return this.y().d() ? this.cG.a() : Optional.empty();
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.ed().a(cdz.aE, bao.a, 1200L);
      if ($$2 == buf.k) {
         this.b(bvh.n);
         this.ed().a(cdz.aC, bao.a, (long)cnl.a);
         this.a(awk.BK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dX().C && !this.gi() && !this.gz()) {
         btz $$3 = $$0.d();
         this.a($$3, cni.c.a() + 20, false);
         if (this.bC.c(cdz.o).isEmpty() && $$3 instanceof buv $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(buv $$0) {
      this.ed().b(cdz.ay);
      this.ed().a(cdz.o, $$0);
      this.ed().b(cdz.E);
      cao.a(this, 200);
   }

   @Override
   public buc e(bvh $$0) {
      buc $$1 = super.e($$0);
      return this.gz() ? buc.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bJ() {
      return !this.gz() && super.bJ();
   }

   @Override
   protected void F(btz $$0) {
      if (!this.gi() && !this.ed().a(cdz.aH)) {
         this.ed().a(cdz.aH, bao.a, 20L);
         this.e($$0);
         cnl.a(this, $$0.dx());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cnj gw() {
      return this.cG;
   }

   @Override
   protected ceh b(dev $$0) {
      return new ceg(this, $$0) {
         @Override
         protected eru a(int $$0) {
            this.o = new esa();
            this.o.a(true);
            return new eru(this.o, $$0) {
               @Override
               protected float a(erq $$0, erq $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eaj.a gx() {
      return this.cF;
   }

   @Override
   public eaj.d gy() {
      return this.cE;
   }

   class a implements eaj.d {
      private static final int b = 16;
      private final eae c = new dzy(cnk.this, cnk.this.cT());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eae b() {
         return this.c;
      }

      @Override
      public axp<eaa> c() {
         return axg.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arm $$0, jg $$1, jp<eaa> $$2, eaa.a $$3) {
         if (!cnk.this.gi() && !cnk.this.eH() && !cnk.this.ed().a(cdz.aI) && !cnk.this.gz() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof buv $$4 && !cnk.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable btz $$3, @Nullable btz $$4, float $$5) {
         if (!cnk.this.eH()) {
            cnk.this.bC.a(cdz.aI, bao.a, 40L);
            $$0.a(cnk.this, (byte)61);
            cnk.this.a(awk.Cd, 5.0F, cnk.this.fj());
            jg $$6 = $$1;
            if ($$4 != null) {
               if (cnk.this.a($$4, 30.0)) {
                  if (cnk.this.ed().a(cdz.aA)) {
                     if (cnk.this.c($$4)) {
                        $$6 = $$4.dx();
                     }

                     cnk.this.e($$4);
                  } else {
                     cnk.this.a($$4, 10, true);
                  }
               }

               cnk.this.ed().a(cdz.aA, bao.a, 100L);
            } else {
               cnk.this.e($$3);
            }

            if (!cnk.this.y().d()) {
               Optional<buv> $$7 = cnk.this.cG.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cnl.a(cnk.this, $$6);
               }
            }
         }
      }
   }
}
