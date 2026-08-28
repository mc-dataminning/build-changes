import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cma extends ckc implements dxd {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akj<Integer> ci = akn.a(cma.class, akl.b);
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
   public bso b = new bso();
   public bso c = new bso();
   public bso d = new bso();
   public bso e = new bso();
   public bso bY = new bso();
   public bso bZ = new bso();
   private final dwr<dxd.b> cC;
   private final dxd.d cD;
   private dxd.a cE;
   clz cF = new clz(this::b, Collections.emptyList());

   public cma(bsz<? extends ckc> $$0, dbx $$1) {
      super($$0, $$1);
      this.cD = new cma.a();
      this.cE = new dxd.a();
      this.cC = new dwr<>(new dxd.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eol.m, 0.0F);
      this.a(eol.q, 8.0F);
      this.a(eol.f, 8.0F);
      this.a(eol.i, 8.0F);
      this.a(eol.o, 0.0F);
      this.a(eol.n, 0.0F);
   }

   @Override
   public zv<ach> dl() {
      return new aci(this, this.c(bua.n) ? 1 : 0);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bua.n);
      }
   }

   @Override
   public boolean a(dca $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dca $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brm $$0) {
      return this.gu() && !$$0.a(awq.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(bua.o) || this.c(bua.n);
   }

   @Override
   protected boolean o(bst $$0) {
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

   public static buv.a s() {
      return ckc.gw().a(buw.q, 500.0).a(buw.r, 0.3F).a(buw.n, 1.0).a(buw.d, 1.5).a(buw.c, 30.0);
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
   protected avy v() {
      return !this.c(bua.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.BK;
   }

   @Override
   protected avy o_() {
      return avz.BG;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bst $$0) {
      this.dP().a(this, (byte)4);
      this.a(avz.BF, 10.0F, this.ff());
      bzh.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(akn.a $$0) {
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
      if (this.dP() instanceof are $$0) {
         dxd.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            cmb.a((bto)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gy() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avz.BJ, this.de(), 5.0F, this.ff(), false);
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
      are $$0 = (are)this.dP();
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

      cmb.a(this);
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
      float $$0 = (float)this.u() / (float)cly.c.a();
      return 40 - ayy.d(ayy.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayy.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayy.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bso $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azg $$1 = this.el();
         dsb $$2 = this.bp();
         if ($$2.l() != dle.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayy.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayy.b($$1, -0.7F, 0.7F);
               this.dP().a(new la(li.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akj<?> $$0) {
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
   public boolean a(dbp $$0) {
      return this.gu();
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cmb.a(this, $$0);
   }

   @Override
   public buq<cma> dS() {
      return (buq<cma>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void a(BiConsumer<dwr<?>, are> $$0) {
      if (this.dP() instanceof are $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bst $$0) {
      if ($$0 instanceof bto $$1
         && this.dP() == $$0.dP()
         && bsy.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsz.d
         && $$1.ak() != bsz.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(are $$0, evq $$1, @Nullable bst $$2, int $$3) {
      bsb $$4 = new bsb(bsd.G, 260, 0, false, false);
      bsc.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      clz.a(this::b).encodeStart(vf.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxd.a.a.encodeStart(vf.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clz.a(this::b).parse(new Dynamic(vf.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dxd.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(bua.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public cly y() {
      return cly.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bst $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bst $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bst $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cmb.a((bto)this);
         boolean $$3 = !(this.p() instanceof cmw);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cmw && $$3 && cly.a($$4).d()) {
            this.dS().b(ccs.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<bto> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bto p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      this.dS().a(ccs.aE, bab.a, 1200L);
      if ($$2 == bts.k) {
         this.b(bua.n);
         this.dS().a(ccs.aC, bab.a, (long)cmb.a);
         this.a(avz.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bst $$3 = $$0.d();
         this.a($$3, cly.c.a() + 20, false);
         if (this.bD.c(ccs.o).isEmpty() && $$3 instanceof bto $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bto $$0) {
      this.dS().b(ccs.ay);
      this.dS().a(ccs.o, $$0);
      this.dS().b(ccs.E);
      bzh.a(this, 200);
   }

   @Override
   public bsw e(bua $$0) {
      bsw $$1 = super.e($$0);
      return this.gu() ? bsw.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bst $$0) {
      if (!this.gg() && !this.dS().a(ccs.aH)) {
         this.dS().a(ccs.aH, bab.a, 20L);
         this.d($$0);
         cmb.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public clz gr() {
      return this.cF;
   }

   @Override
   protected cda b(dbx $$0) {
      return new ccz(this, $$0) {
         @Override
         protected eok a(int $$0) {
            this.o = new eoq();
            this.o.a(true);
            return new eok(this.o, $$0) {
               @Override
               protected float a(eog $$0, eog $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxd.a gs() {
      return this.cE;
   }

   @Override
   public dxd.d gt() {
      return this.cD;
   }

   class a implements dxd.d {
      private static final int b = 16;
      private final dwy c = new dws(cma.this, cma.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwy b() {
         return this.c;
      }

      @Override
      public axe<dwu> c() {
         return awv.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwu> $$2, dwu.a $$3) {
         if (!cma.this.gg() && !cma.this.eB() && !cma.this.dS().a(ccs.aI) && !cma.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bto $$4 && !cma.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwu> $$2, @Nullable bst $$3, @Nullable bst $$4, float $$5) {
         if (!cma.this.eB()) {
            cma.this.bD.a(ccs.aI, bab.a, 40L);
            $$0.a(cma.this, (byte)61);
            cma.this.a(avz.BV, 5.0F, cma.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (cma.this.a($$4, 30.0)) {
                  if (cma.this.dS().a(ccs.aA)) {
                     if (cma.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cma.this.d($$4);
                  } else {
                     cma.this.a($$4, 10, true);
                  }
               }

               cma.this.dS().a(ccs.aA, bab.a, 100L);
            } else {
               cma.this.d($$3);
            }

            if (!cma.this.y().d()) {
               Optional<bto> $$7 = cma.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmb.a(cma.this, $$6);
               }
            }
         }
      }
   }
}
