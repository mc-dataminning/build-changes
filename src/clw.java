import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clw extends cjy implements dwz {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akg<Integer> ci = akk.a(clw.class, aki.b);
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
   public bsk b = new bsk();
   public bsk c = new bsk();
   public bsk d = new bsk();
   public bsk e = new bsk();
   public bsk bY = new bsk();
   public bsk bZ = new bsk();
   private final dwn<dwz.b> cC;
   private final dwz.d cD;
   private dwz.a cE;
   clv cF = new clv(this::b, Collections.emptyList());

   public clw(bsv<? extends cjy> $$0, dbt $$1) {
      super($$0, $$1);
      this.cD = new clw.a();
      this.cE = new dwz.a();
      this.cC = new dwn<>(new dwz.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eoh.m, 0.0F);
      this.a(eoh.q, 8.0F);
      this.a(eoh.f, 8.0F);
      this.a(eoh.i, 8.0F);
      this.a(eoh.o, 0.0F);
      this.a(eoh.n, 0.0F);
   }

   @Override
   public zs<ace> dl() {
      return new acf(this, this.c(btw.n) ? 1 : 0);
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(btw.n);
      }
   }

   @Override
   public boolean a(dbw $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bri $$0) {
      return this.gu() && !$$0.a(awn.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(btw.o) || this.c(btw.n);
   }

   @Override
   protected boolean o(bsp $$0) {
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

   public static bur.a s() {
      return cjy.gw().a(bus.q, 500.0).a(bus.r, 0.3F).a(bus.n, 1.0).a(bus.d, 1.5).a(bus.c, 30.0);
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
   protected avv v() {
      return !this.c(btw.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.BK;
   }

   @Override
   protected avv o_() {
      return avw.BG;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bsp $$0) {
      this.dP().a(this, (byte)4);
      this.a(avw.BF, 10.0F, this.ff());
      bzd.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(akk.a $$0) {
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
      if (this.dP() instanceof arb $$0) {
         dwz.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            clx.a((btk)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gy() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avw.BJ, this.de(), 5.0F, this.ff(), false);
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
      arb $$0 = (arb)this.dP();
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

      clx.a(this);
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
      float $$0 = (float)this.u() / (float)clu.c.a();
      return 40 - ayu.d(ayu.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayu.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayu.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bsk $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azc $$1 = this.el();
         drx $$2 = this.bp();
         if ($$2.l() != dla.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayu.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayu.b($$1, -0.7F, 0.7F);
               this.dP().a(new la(lj.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
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
   public boolean a(dbl $$0) {
      return this.gu();
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return clx.a(this, $$0);
   }

   @Override
   public bum<clw> dS() {
      return (bum<clw>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public void a(BiConsumer<dwn<?>, arb> $$0) {
      if (this.dP() instanceof arb $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsp $$0) {
      if ($$0 instanceof btk $$1
         && this.dP() == $$0.dP()
         && bsu.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsv.d
         && $$1.ak() != bsv.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(arb $$0, evm $$1, @Nullable bsp $$2, int $$3) {
      brx $$4 = new brx(brz.G, 260, 0, false, false);
      bry.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      clv.a(this::b).encodeStart(vf.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dwz.a.a.encodeStart(vf.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clv.a(this::b).parse(new Dynamic(vf.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dwz.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(btw.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public clu y() {
      return clu.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bsp $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bsp $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsp $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         clx.a((btk)this);
         boolean $$3 = !(this.p() instanceof cms);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cms && $$3 && clu.a($$4).d()) {
            this.dS().b(cco.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<btk> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      this.dS().a(cco.aE, azx.a, 1200L);
      if ($$2 == bto.k) {
         this.b(btw.n);
         this.dS().a(cco.aC, azx.a, (long)clx.a);
         this.a(avw.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bsp $$3 = $$0.d();
         this.a($$3, clu.c.a() + 20, false);
         if (this.bD.c(cco.o).isEmpty() && $$3 instanceof btk $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btk $$0) {
      this.dS().b(cco.ay);
      this.dS().a(cco.o, $$0);
      this.dS().b(cco.E);
      bzd.a(this, 200);
   }

   @Override
   public bss e(btw $$0) {
      bss $$1 = super.e($$0);
      return this.gu() ? bss.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bsp $$0) {
      if (!this.gg() && !this.dS().a(cco.aH)) {
         this.dS().a(cco.aH, azx.a, 20L);
         this.d($$0);
         clx.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public clv gr() {
      return this.cF;
   }

   @Override
   protected ccw b(dbt $$0) {
      return new ccv(this, $$0) {
         @Override
         protected eog a(int $$0) {
            this.o = new eom();
            this.o.a(true);
            return new eog(this.o, $$0) {
               @Override
               protected float a(eoc $$0, eoc $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dwz.a gs() {
      return this.cE;
   }

   @Override
   public dwz.d gt() {
      return this.cD;
   }

   class a implements dwz.d {
      private static final int b = 16;
      private final dwu c = new dwo(clw.this, clw.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwu b() {
         return this.c;
      }

      @Override
      public axb<dwq> c() {
         return aws.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arb $$0, iz $$1, ji<dwq> $$2, dwq.a $$3) {
         if (!clw.this.gg() && !clw.this.eB() && !clw.this.dS().a(cco.aI) && !clw.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btk $$4 && !clw.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable bsp $$3, @Nullable bsp $$4, float $$5) {
         if (!clw.this.eB()) {
            clw.this.bD.a(cco.aI, azx.a, 40L);
            $$0.a(clw.this, (byte)61);
            clw.this.a(avw.BV, 5.0F, clw.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (clw.this.a($$4, 30.0)) {
                  if (clw.this.dS().a(cco.aA)) {
                     if (clw.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     clw.this.d($$4);
                  } else {
                     clw.this.a($$4, 10, true);
                  }
               }

               clw.this.dS().a(cco.aA, azx.a, 100L);
            } else {
               clw.this.d($$3);
            }

            if (!clw.this.y().d()) {
               Optional<btk> $$7 = clw.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  clx.a(clw.this, $$6);
               }
            }
         }
      }
   }
}
