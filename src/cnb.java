import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnb extends cld implements dzy {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final akh<Integer> cj = akl.a(cnb.class, akj.b);
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
   public btl b = new btl();
   public btl c = new btl();
   public btl d = new btl();
   public btl e = new btl();
   public btl bY = new btl();
   public btl bZ = new btl();
   private final dzm<dzy.b> cD;
   private final dzy.d cE;
   private dzy.a cF;
   cna cG = new cna(this::c, Collections.emptyList());

   public cnb(bty<? extends cld> $$0, dej $$1) {
      super($$0, $$1);
      this.cE = new cnb.a();
      this.cF = new dzy.a();
      this.cD = new dzm<>(new dzy.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(erk.m, 0.0F);
      this.a(erk.q, 8.0F);
      this.a(erk.f, 8.0F);
      this.a(erk.i, 8.0F);
      this.a(erk.o, 0.0F);
      this.a(erk.n, 0.0F);
   }

   @Override
   public zl<aca> a(ari $$0) {
      return new acb(this, $$0, this.c(buz.n) ? 1 : 0);
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(buz.n);
      }
   }

   @Override
   public boolean a(dem $$0) {
      return super.a($$0) && $$0.a(this, this.ao().n().a(this.dq()));
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsj $$0) {
      return this.gs() && !$$0.a(awx.d) ? true : super.b($$0);
   }

   boolean gs() {
      return this.c(buz.o) || this.c(buz.n);
   }

   @Override
   protected boolean o(btr $$0) {
      return false;
   }

   @Override
   public boolean fQ() {
      return true;
   }

   @Override
   protected float aS() {
      return this.Y + 0.55F;
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 500.0).a(bvu.v, 0.3F).a(bvu.p, 1.0).a(bvu.d, 1.5).a(bvu.c, 30.0).a(bvu.m, 24.0);
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
   protected awf w() {
      return !this.c(buz.l) && !this.gs() ? this.y().b() : null;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.BU;
   }

   @Override
   protected awf o_() {
      return awg.BQ;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.Ce, 10.0F, 1.0F);
   }

   @Override
   public boolean E(btr $$0) {
      this.dS().a(this, (byte)4);
      this.a(awg.BP, 10.0F, this.fe());
      caf.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int t() {
      return this.am.a(cj);
   }

   private void gv() {
      this.am.a(cj, this.gy());
   }

   @Override
   public void l() {
      if (this.dS() instanceof arj $$0) {
         dzy.c.a($$0, this.cF, this.cE);
         if (this.fX() || this.Z()) {
            cnc.a((bun)this);
         }
      }

      super.l();
      if (this.dS().x_()) {
         if (this.ag % this.gw() == 0) {
            this.cB = 10;
            if (!this.ba()) {
               this.dS().a(this.dx(), this.dz(), this.dD(), awg.BT, this.di(), 5.0F, this.fe(), false);
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
   protected void ac() {
      arj $$0 = (arj)this.dS();
      $$0.ah().a("wardenBrain");
      this.dY().a($$0, this);
      this.dS().ah().c();
      super.ac();
      if ((this.ag + this.ap()) % 120 == 0) {
         a($$0, this.dq(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cG.a($$0, this::c);
         this.gv();
      }

      cnc.a(this);
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

   private int gw() {
      float $$0 = (float)this.t() / (float)cmz.c.a();
      return 40 - azf.d(azf.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azf.h($$0, (float)this.cA, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azf.h($$0, (float)this.cC, (float)this.cB) / 10.0F;
   }

   private void a(btl $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azn $$1 = this.dV();
         dus $$2 = this.bt();
         if ($$2.o() != dnt.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dx() + (double)azf.b($$1, -0.7F, 0.7F);
               double $$5 = this.dz();
               double $$6 = this.dD() + (double)azf.b($$1, -0.7F, 0.7F);
               this.dS().a(new lg(lo.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
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
   public boolean a(deb $$0) {
      return this.gs();
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cnc.a(this, $$0);
   }

   @Override
   public bvo<cnb> dY() {
      return (bvo<cnb>)super.dY();
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public void a(BiConsumer<dzm<?>, arj> $$0) {
      if (this.dS() instanceof arj $$1) {
         $$0.accept(this.cD, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable btr $$0) {
      if ($$0 instanceof bun $$1
         && this.dS() == $$0.dS()
         && btw.e.test($$0)
         && !this.s($$0)
         && $$1.ao() != bty.d
         && $$1.ao() != bty.bm
         && !$$1.cz()
         && !$$1.eC()
         && this.dS().B_().a($$1.cO())) {
         return true;
      }

      return false;
   }

   public static void a(arj $$0, eyw $$1, @Nullable btr $$2, int $$3) {
      bsy $$4 = new bsy(bta.G, 260, 0, false, false);
      bsz.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      alc<vd> $$1 = this.dU().a(uu.a);
      cna.a(this::c)
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      dzy.a.a
         .encodeStart($$1, this.cF)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      alc<vd> $$1 = this.dU().a(uu.a);
      if ($$0.e("anger")) {
         cna.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
         this.gv();
      }

      if ($$0.b("listener", 10)) {
         dzy.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cF = $$0x);
      }
   }

   private void gx() {
      if (!this.c(buz.l)) {
         this.a(this.y().c(), 10.0F, this.fe());
      }
   }

   public cmz y() {
      return cmz.a(this.gy());
   }

   private int gy() {
      return this.cG.b(this.m());
   }

   @Override
   public void d(btr $$0) {
      this.cG.a($$0);
   }

   public void e(@Nullable btr $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable btr $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.c($$0)) {
         cnc.a((bun)this);
         boolean $$3 = !(this.m() instanceof cnx);
         int $$4 = this.cG.a($$0, $$1);
         if ($$0 instanceof cnx && $$3 && cmz.a($$4).d()) {
            this.dY().b(cdq.o);
         }

         if ($$2) {
            this.gx();
         }
      }
   }

   public Optional<bun> go() {
      return this.y().d() ? this.cG.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.dY().a(cdq.aE, bak.a, 1200L);
      if ($$2 == btx.k) {
         this.b(buz.n);
         this.dY().a(cdq.aC, bak.a, (long)cnc.a);
         this.a(awg.BM, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dS().B && !this.gd() && !this.gs()) {
         btr $$3 = $$0.d();
         this.a($$3, cmz.c.a() + 20, false);
         if (this.bB.c(cdq.o).isEmpty() && $$3 instanceof bun $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bun $$0) {
      this.dY().b(cdq.ay);
      this.dY().a(cdq.o, $$0);
      this.dY().b(cdq.E);
      caf.a(this, 200);
   }

   @Override
   public btu e(buz $$0) {
      btu $$1 = super.e($$0);
      return this.gs() ? btu.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bF() {
      return !this.gs() && super.bF();
   }

   @Override
   protected void F(btr $$0) {
      if (!this.gd() && !this.dY().a(cdq.aH)) {
         this.dY().a(cdq.aH, bak.a, 20L);
         this.e($$0);
         cnc.a(this, $$0.ds());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cna gp() {
      return this.cG;
   }

   @Override
   protected cdy b(dej $$0) {
      return new cdx(this, $$0) {
         @Override
         protected erj a(int $$0) {
            this.o = new erp();
            this.o.a(true);
            return new erj(this.o, $$0) {
               @Override
               protected float a(erf $$0, erf $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dzy.a gq() {
      return this.cF;
   }

   @Override
   public dzy.d gr() {
      return this.cE;
   }

   class a implements dzy.d {
      private static final int b = 16;
      private final dzt c = new dzn(cnb.this, cnb.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzt b() {
         return this.c;
      }

      @Override
      public axl<dzp> c() {
         return axc.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arj $$0, jf $$1, jo<dzp> $$2, dzp.a $$3) {
         if (!cnb.this.gd() && !cnb.this.eC() && !cnb.this.dY().a(cdq.aI) && !cnb.this.gs() && $$0.B_().a($$1)) {
            if ($$3.a() instanceof bun $$4 && !cnb.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable btr $$3, @Nullable btr $$4, float $$5) {
         if (!cnb.this.eC()) {
            cnb.this.bB.a(cdq.aI, bak.a, 40L);
            $$0.a(cnb.this, (byte)61);
            cnb.this.a(awg.Cf, 5.0F, cnb.this.fe());
            jf $$6 = $$1;
            if ($$4 != null) {
               if (cnb.this.a($$4, 30.0)) {
                  if (cnb.this.dY().a(cdq.aA)) {
                     if (cnb.this.c($$4)) {
                        $$6 = $$4.ds();
                     }

                     cnb.this.e($$4);
                  } else {
                     cnb.this.a($$4, 10, true);
                  }
               }

               cnb.this.dY().a(cdq.aA, bak.a, 100L);
            } else {
               cnb.this.e($$3);
            }

            if (!cnb.this.y().d()) {
               Optional<bun> $$7 = cnb.this.cG.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cnc.a(cnb.this, $$6);
               }
            }
         }
      }
   }
}
