import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmc extends cke implements dxf {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final akk<Integer> ci = ako.a(cmc.class, akm.b);
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
   public bsq b = new bsq();
   public bsq c = new bsq();
   public bsq d = new bsq();
   public bsq e = new bsq();
   public bsq bY = new bsq();
   public bsq bZ = new bsq();
   private final dwt<dxf.b> cC;
   private final dxf.d cD;
   private dxf.a cE;
   cmb cF = new cmb(this::b, Collections.emptyList());

   public cmc(btb<? extends cke> $$0, dbz $$1) {
      super($$0, $$1);
      this.cD = new cmc.a();
      this.cE = new dxf.a();
      this.cC = new dwt<>(new dxf.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(eon.m, 0.0F);
      this.a(eon.q, 8.0F);
      this.a(eon.f, 8.0F);
      this.a(eon.i, 8.0F);
      this.a(eon.o, 0.0F);
      this.a(eon.n, 0.0F);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, this.c(buc.n) ? 1 : 0);
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(buc.n);
      }
   }

   @Override
   public boolean a(dcc $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bro $$0) {
      return this.gu() && !$$0.a(awr.e) ? true : super.b($$0);
   }

   boolean gu() {
      return this.c(buc.o) || this.c(buc.n);
   }

   @Override
   protected boolean o(bsv $$0) {
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

   public static bux.a s() {
      return cke.gw().a(buy.q, 500.0).a(buy.r, 0.3F).a(buy.n, 1.0).a(buy.d, 1.5).a(buy.c, 30.0);
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
      return !this.c(buc.l) && !this.gu() ? this.y().b() : null;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.BK;
   }

   @Override
   protected avz o_() {
      return awa.BG;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bsv $$0) {
      this.dP().a(this, (byte)4);
      this.a(awa.BF, 10.0F, this.ff());
      bzj.a(this, 40);
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
         dxf.c.a($$0, this.cE, this.cD);
         if (this.fW() || this.W()) {
            cmd.a((btq)this);
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

      cmd.a(this);
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
      float $$0 = (float)this.u() / (float)cma.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayz.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayz.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bsq $$0) {
      if ((float)$$0.b() < 4500.0F) {
         azh $$1 = this.el();
         dsd $$2 = this.bp();
         if ($$2.l() != dlg.a) {
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
   public boolean a(dbr $$0) {
      return this.gu();
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return cmd.a(this, $$0);
   }

   @Override
   public bus<cmc> dS() {
      return (bus<cmc>)super.dS();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(BiConsumer<dwt<?>, arf> $$0) {
      if (this.dP() instanceof arf $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsv $$0) {
      if ($$0 instanceof btq $$1
         && this.dP() == $$0.dP()
         && bta.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != btb.d
         && $$1.ak() != btb.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(arf $$0, evs $$1, @Nullable bsv $$2, int $$3) {
      bsd $$4 = new bsd(bsf.G, 260, 0, false, false);
      bse.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cmb.a(this::b).encodeStart(vg.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxf.a.a.encodeStart(vg.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cmb.a(this::b).parse(new Dynamic(vg.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gx();
      }

      if ($$0.b("listener", 10)) {
         dxf.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gz() {
      if (!this.c(buc.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public cma y() {
      return cma.a(this.gA());
   }

   private int gA() {
      return this.cF.b(this.p());
   }

   public void c(bsv $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bsv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsv $$0, int $$1, boolean $$2) {
      if (!this.gg() && this.b($$0)) {
         cmd.a((btq)this);
         boolean $$3 = !(this.p() instanceof cmy);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cmy && $$3 && cma.a($$4).d()) {
            this.dS().b(ccu.o);
         }

         if ($$2) {
            this.gz();
         }
      }
   }

   public Optional<btq> gq() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btq p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      this.dS().a(ccu.aE, bac.a, 1200L);
      if ($$2 == btu.k) {
         this.b(buc.n);
         this.dS().a(ccu.aC, bac.a, (long)cmd.a);
         this.a(awa.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gg() && !this.gu()) {
         bsv $$3 = $$0.d();
         this.a($$3, cma.c.a() + 20, false);
         if (this.bD.c(ccu.o).isEmpty() && $$3 instanceof btq $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btq $$0) {
      this.dS().b(ccu.ay);
      this.dS().a(ccu.o, $$0);
      this.dS().b(ccu.E);
      bzj.a(this, 200);
   }

   @Override
   public bsy e(buc $$0) {
      bsy $$1 = super.e($$0);
      return this.gu() ? bsy.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gu() && super.bA();
   }

   @Override
   protected void D(bsv $$0) {
      if (!this.gg() && !this.dS().a(ccu.aH)) {
         this.dS().a(ccu.aH, bac.a, 20L);
         this.d($$0);
         cmd.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cmb gr() {
      return this.cF;
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cdb(this, $$0) {
         @Override
         protected eom a(int $$0) {
            this.o = new eos();
            this.o.a(true);
            return new eom(this.o, $$0) {
               @Override
               protected float a(eoi $$0, eoi $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxf.a gs() {
      return this.cE;
   }

   @Override
   public dxf.d gt() {
      return this.cD;
   }

   class a implements dxf.d {
      private static final int b = 16;
      private final dxa c = new dwu(cmc.this, cmc.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxa b() {
         return this.c;
      }

      @Override
      public axf<dww> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dww> $$2, dww.a $$3) {
         if (!cmc.this.gg() && !cmc.this.eB() && !cmc.this.dS().a(ccu.aI) && !cmc.this.gu() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btq $$4 && !cmc.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dww> $$2, @Nullable bsv $$3, @Nullable bsv $$4, float $$5) {
         if (!cmc.this.eB()) {
            cmc.this.bD.a(ccu.aI, bac.a, 40L);
            $$0.a(cmc.this, (byte)61);
            cmc.this.a(awa.BV, 5.0F, cmc.this.ff());
            iz $$6 = $$1;
            if ($$4 != null) {
               if (cmc.this.a($$4, 30.0)) {
                  if (cmc.this.dS().a(ccu.aA)) {
                     if (cmc.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cmc.this.d($$4);
                  } else {
                     cmc.this.a($$4, 10, true);
                  }
               }

               cmc.this.dS().a(ccu.aA, bac.a, 100L);
            } else {
               cmc.this.d($$3);
            }

            if (!cmc.this.y().d()) {
               Optional<btq> $$7 = cmc.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmd.a(cmc.this, $$6);
               }
            }
         }
      }
   }
}
