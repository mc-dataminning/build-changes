import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmb extends ckd implements dxe {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akk<Integer> ci = ako.a(cmb.class, akm.b);
   private static final int cj = 200;
   private static final int ck = 260;
   private static final int cl = 20;
   private static final int cm = 120;
   private static final int cn = 20;
   private static final int co = 35;
   private static final int cp = 10;
   private static final int cq = 20;
   private static final int cr = 100;
   private static final int cs = 20;
   private static final int ct = 30;
   private static final float cu = 4.5F;
   private static final float cv = 0.7F;
   private static final int cw = 30;
   private int cx;
   private int cz;
   private int cA;
   private int cB;
   public bsp b = new bsp();
   public bsp c = new bsp();
   public bsp d = new bsp();
   public bsp e = new bsp();
   public bsp bY = new bsp();
   public bsp bZ = new bsp();
   private final dws<dxe.b> cC;
   private final dxe.d cD;
   private dxe.a cE;
   cma cF = new cma(this::b, Collections.emptyList());

   public cmb(bta<? extends ckd> $$0, dby $$1) {
      super($$0, $$1);
      this.cD = new cmb.a();
      this.cE = new dxe.a();
      this.cC = new dws<>(new dxe.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eom.m, 0.0F);
      this.a(eom.q, 8.0F);
      this.a(eom.f, 8.0F);
      this.a(eom.i, 8.0F);
      this.a(eom.o, 0.0F);
      this.a(eom.n, 0.0F);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, this.c(bub.n) ? 1 : 0);
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bub.n);
      }
   }

   @Override
   public boolean a(dcb $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dcb $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brn $$0) {
      return this.gu() && !$$0.a(awr.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(bub.o) || this.c(bub.n);
   }

   @Override
   protected boolean o(bsu $$0) {
      return false;
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   protected float aO() {
      return this.aa + 0.55F;
   }

   public static buw.a s() {
      return ckd.gw().a(bux.q, 500.0).a(bux.r, 0.3F).a(bux.n, 1.0).a(bux.d, 1.5).a(bux.c, 30.0);
   }

   @Override
   public boolean bc() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avz v() {
      return !this.c(bub.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.BK;
   }

   @Override
   protected avz o_() {
      return awa.BG;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bsu $$0) {
      this.dP().a(this, (byte)4);
      this.a(awa.BF, 10.0F, this.ff());
      bzi.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   public int u() {
      return this.ao.a(ci);
   }

   private void gx() {
      this.ao.a(ci, this.gA());
   }

   @Override
   public void l() {
      if (this.dP() instanceof arf $$0) {
         dxe.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            cmc.a((btp)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gy() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), awa.BJ, this.de(), 5.0F, this.ff(), false);
            }
         }

         this.cz = this.cx;
         if (this.cx > 0) {
            this.cx--;
         }

         this.cB = this.cA;
         if (this.cA > 0) {
            this.cA--;
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
   protected void Z() {
      arf $$0 = (arf)this.dP();
      $$0.ag().a("wardenBrain");
      this.dS().a($$0, this);
      this.dP().ag().c();
      super.Z();
      if ((this.ai + this.al()) % 120 == 0) {
         a($$0, this.dn(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cF.a($$0, this::b);
         this.gx();
      }

      cmc.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bY.a(this.ai);
      } else if ($$0 == 61) {
         this.cx = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gy() {
      float $$0 = (float)this.u() / (float)clz.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayz.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayz.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bsp $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azh $$1 = this.el();
         dsc $$2 = this.bp();
         if ($$2.l() != dlf.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayz.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayz.b($$1, -0.7F, 0.7F);
               this.dP().a(new la(li.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akk<?> $$0) {
      if (at.equals($$0)) {
         switch (this.ar()) {
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
   public boolean a(dbq $$0) {
      return this.gu();
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cmc.a(this, $$0);
   }

   @Override
   public bur<cmb> dS() {
      return (bur<cmb>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(BiConsumer<dws<?>, arf> $$0) {
      if (this.dP() instanceof arf $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsu $$0) {
      if ($$0 instanceof btp $$1
         && this.dP() == $$0.dP()
         && bsz.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bta.d
         && $$1.ak() != bta.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(arf $$0, evr $$1, @Nullable bsu $$2, int $$3) {
      bsc $$4 = new bsc(bse.G, 260, 0, false, false);
      bsd.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cma.a(this::b).encodeStart(vg.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxe.a.a.encodeStart(vg.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cma.a(this::b).parse(new Dynamic(vg.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dxe.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(bub.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public clz y() {
      return clz.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bsu $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bsu $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsu $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cmc.a((btp)this);
         boolean $$3 = !(this.p() instanceof cmx);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cmx && $$3 && clz.a($$4).d()) {
            this.dS().b(cct.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<btp> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btp p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      this.dS().a(cct.aE, bac.a, 1200L);
      if ($$2 == btt.k) {
         this.b(bub.n);
         this.dS().a(cct.aC, bac.a, (long)cmc.a);
         this.a(awa.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bsu $$3 = $$0.d();
         this.a($$3, clz.c.a() + 20, false);
         if (this.bD.c(cct.o).isEmpty() && $$3 instanceof btp $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btp $$0) {
      this.dS().b(cct.ay);
      this.dS().a(cct.o, $$0);
      this.dS().b(cct.E);
      bzi.a(this, 200);
   }

   @Override
   public bsx e(bub $$0) {
      bsx $$1 = super.e($$0);
      return this.gu() ? bsx.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bsu $$0) {
      if (!this.gg() && !this.dS().a(cct.aH)) {
         this.dS().a(cct.aH, bac.a, 20L);
         this.d($$0);
         cmc.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cma gr() {
      return this.cF;
   }

   @Override
   protected cdb b(dby $$0) {
      return new cda(this, $$0) {
         @Override
         protected eol a(int $$0) {
            this.o = new eor();
            this.o.a(true);
            return new eol(this.o, $$0) {
               @Override
               protected float a(eoh $$0, eoh $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxe.a gs() {
      return this.cE;
   }

   @Override
   public dxe.d gt() {
      return this.cD;
   }

   class a implements dxe.d {
      private static final int b = 16;
      private final dwz c = new dwt(cmb.this, cmb.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwz b() {
         return this.c;
      }

      @Override
      public axf<dwv> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwv> $$2, dwv.a $$3) {
         if (!cmb.this.gg() && !cmb.this.eB() && !cmb.this.dS().a(cct.aI) && !cmb.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btp $$4 && !cmb.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dwv> $$2, @Nullable bsu $$3, @Nullable bsu $$4, float $$5) {
         if (!cmb.this.eB()) {
            cmb.this.bD.a(cct.aI, bac.a, 40L);
            $$0.a(cmb.this, (byte)61);
            cmb.this.a(awa.BV, 5.0F, cmb.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (cmb.this.a($$4, 30.0)) {
                  if (cmb.this.dS().a(cct.aA)) {
                     if (cmb.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cmb.this.d($$4);
                  } else {
                     cmb.this.a($$4, 10, true);
                  }
               }

               cmb.this.dS().a(cct.aA, bac.a, 100L);
            } else {
               cmb.this.d($$3);
            }

            if (!cmb.this.y().d()) {
               Optional<btp> $$7 = cmb.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmc.a(cmb.this, $$6);
               }
            }
         }
      }
   }
}
