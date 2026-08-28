import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmd extends ckf implements dxg {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akk<Integer> ci = ako.a(cmd.class, akm.b);
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
   public bsr b = new bsr();
   public bsr c = new bsr();
   public bsr d = new bsr();
   public bsr e = new bsr();
   public bsr bY = new bsr();
   public bsr bZ = new bsr();
   private final dwu<dxg.b> cC;
   private final dxg.d cD;
   private dxg.a cE;
   cmc cF = new cmc(this::b, Collections.emptyList());

   public cmd(btc<? extends ckf> $$0, dca $$1) {
      super($$0, $$1);
      this.cD = new cmd.a();
      this.cE = new dxg.a();
      this.cC = new dwu<>(new dxg.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eoo.m, 0.0F);
      this.a(eoo.q, 8.0F);
      this.a(eoo.f, 8.0F);
      this.a(eoo.i, 8.0F);
      this.a(eoo.o, 0.0F);
      this.a(eoo.n, 0.0F);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, this.c(bud.n) ? 1 : 0);
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bud.n);
      }
   }

   @Override
   public boolean a(dcd $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(brp $$0) {
      return this.gu() && !$$0.a(awr.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(bud.o) || this.c(bud.n);
   }

   @Override
   protected boolean o(bsw $$0) {
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

   public static buy.a s() {
      return ckf.gw().a(buz.q, 500.0).a(buz.r, 0.3F).a(buz.n, 1.0).a(buz.d, 1.5).a(buz.c, 30.0);
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
      return !this.c(bud.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.BK;
   }

   @Override
   protected avz o_() {
      return awa.BG;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bsw $$0) {
      this.dP().a(this, (byte)4);
      this.a(awa.BF, 10.0F, this.ff());
      bzk.a(this, 40);
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
         dxg.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            cme.a((btr)this);
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

      cme.a(this);
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
      float $$0 = (float)this.u() / (float)cmb.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayz.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayz.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bsr $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azh $$1 = this.el();
         dse $$2 = this.bp();
         if ($$2.l() != dlh.a) {
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
   public boolean a(dbs $$0) {
      return this.gu();
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return cme.a(this, $$0);
   }

   @Override
   public but<cmd> dS() {
      return (but<cmd>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(BiConsumer<dwu<?>, arf> $$0) {
      if (this.dP() instanceof arf $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsw $$0) {
      if ($$0 instanceof btr $$1
         && this.dP() == $$0.dP()
         && btb.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != btc.d
         && $$1.ak() != btc.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(arf $$0, evt $$1, @Nullable bsw $$2, int $$3) {
      bse $$4 = new bse(bsg.G, 260, 0, false, false);
      bsf.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cmc.a(this::b).encodeStart(vg.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxg.a.a.encodeStart(vg.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cmc.a(this::b).parse(new Dynamic(vg.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dxg.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(bud.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public cmb y() {
      return cmb.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bsw $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bsw $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsw $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cme.a((btr)this);
         boolean $$3 = !(this.p() instanceof cmz);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cmz && $$3 && cmb.a($$4).d()) {
            this.dS().b(ccv.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<btr> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btr p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      this.dS().a(ccv.aE, bac.a, 1200L);
      if ($$2 == btv.k) {
         this.b(bud.n);
         this.dS().a(ccv.aC, bac.a, (long)cme.a);
         this.a(awa.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bsw $$3 = $$0.d();
         this.a($$3, cmb.c.a() + 20, false);
         if (this.bD.c(ccv.o).isEmpty() && $$3 instanceof btr $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btr $$0) {
      this.dS().b(ccv.ay);
      this.dS().a(ccv.o, $$0);
      this.dS().b(ccv.E);
      bzk.a(this, 200);
   }

   @Override
   public bsz e(bud $$0) {
      bsz $$1 = super.e($$0);
      return this.gu() ? bsz.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bsw $$0) {
      if (!this.gg() && !this.dS().a(ccv.aH)) {
         this.dS().a(ccv.aH, bac.a, 20L);
         this.d($$0);
         cme.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cmc gr() {
      return this.cF;
   }

   @Override
   protected cdd b(dca $$0) {
      return new cdc(this, $$0) {
         @Override
         protected eon a(int $$0) {
            this.o = new eot();
            this.o.a(true);
            return new eon(this.o, $$0) {
               @Override
               protected float a(eoj $$0, eoj $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxg.a gs() {
      return this.cE;
   }

   @Override
   public dxg.d gt() {
      return this.cD;
   }

   class a implements dxg.d {
      private static final int b = 16;
      private final dxb c = new dwv(cmd.this, cmd.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxb b() {
         return this.c;
      }

      @Override
      public axf<dwx> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwx> $$2, dwx.a $$3) {
         if (!cmd.this.gg() && !cmd.this.eB() && !cmd.this.dS().a(ccv.aI) && !cmd.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btr $$4 && !cmd.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dwx> $$2, @Nullable bsw $$3, @Nullable bsw $$4, float $$5) {
         if (!cmd.this.eB()) {
            cmd.this.bD.a(ccv.aI, bac.a, 40L);
            $$0.a(cmd.this, (byte)61);
            cmd.this.a(awa.BV, 5.0F, cmd.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (cmd.this.a($$4, 30.0)) {
                  if (cmd.this.dS().a(ccv.aA)) {
                     if (cmd.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cmd.this.d($$4);
                  } else {
                     cmd.this.a($$4, 10, true);
                  }
               }

               cmd.this.dS().a(ccv.aA, bac.a, 100L);
            } else {
               cmd.this.d($$3);
            }

            if (!cmd.this.y().d()) {
               Optional<btr> $$7 = cmd.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cme.a(cmd.this, $$6);
               }
            }
         }
      }
   }
}
