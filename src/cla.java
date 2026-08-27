import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cla extends cjc implements dwd {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final ajr<Integer> ci = ajv.a(cla.class, ajt.b);
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
   private int cy;
   private int cA;
   private int cB;
   public brp b = new brp();
   public brp c = new brp();
   public brp d = new brp();
   public brp e = new brp();
   public brp bY = new brp();
   public brp bZ = new brp();
   private final dvr<dwd.b> cC;
   private final dwd.d cD;
   private dwd.a cE;
   ckz cF = new ckz(this::b, Collections.emptyList());

   public cla(bsa<? extends cjc> $$0, dax $$1) {
      super($$0, $$1);
      this.cD = new cla.a();
      this.cE = new dwd.a();
      this.cC = new dvr<>(new dwd.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(enl.m, 0.0F);
      this.a(enl.q, 8.0F);
      this.a(enl.f, 8.0F);
      this.a(enl.i, 8.0F);
      this.a(enl.o, 0.0F);
      this.a(enl.n, 0.0F);
   }

   @Override
   public ze<abq> dl() {
      return new abr(this, this.c(bta.n) ? 1 : 0);
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bta.n);
      }
   }

   @Override
   public boolean a(dba $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(io $$0, dba $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqn $$0) {
      return this.gt() && !$$0.a(avy.e) ? true : super.b($$0);
   }

   boolean gt() {
      return this.c(bta.o) || this.c(bta.n);
   }

   @Override
   protected boolean o(bru $$0) {
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

   public static btv.a s() {
      return cjc.gv().a(btw.q, 500.0).a(btw.r, 0.3F).a(btw.n, 1.0).a(btw.d, 1.5).a(btw.c, 30.0);
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
   protected avg v() {
      return !this.c(bta.l) && !this.gt() ? this.y().b() : null;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.BK;
   }

   @Override
   protected avg o_() {
      return avh.BG;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bru $$0) {
      this.dP().a(this, (byte)4);
      this.a(avh.BF, 10.0F, this.ff());
      byh.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   public int u() {
      return this.ao.a(ci);
   }

   private void gw() {
      this.ao.a(ci, this.gz());
   }

   @Override
   public void l() {
      if (this.dP() instanceof aqm $$0) {
         dwd.c.a($$0, this.cE, this.cD);
         if (this.fV() || this.V()) {
            clb.a((bso)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gx() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avh.BJ, this.de(), 5.0F, this.ff(), false);
            }
         }

         this.cy = this.cx;
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
   protected void Y() {
      aqm $$0 = (aqm)this.dP();
      $$0.af().a("wardenBrain");
      this.dS().a($$0, this);
      this.dP().af().c();
      super.Y();
      if ((this.ai + this.al()) % 120 == 0) {
         a($$0, this.dn(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cF.a($$0, this::b);
         this.gw();
      }

      clb.a(this);
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

   private int gx() {
      float $$0 = (float)this.u() / (float)cky.c.a();
      return 40 - ayd.d(ayd.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayd.i($$0, (float)this.cy, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayd.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(brp $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayk $$1 = this.el();
         drb $$2 = this.bp();
         if ($$2.l() != dke.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayd.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayd.b($$1, -0.7F, 0.7F);
               this.dP().a(new kp(ky.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajr<?> $$0) {
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
   public boolean a(dap $$0) {
      return this.gt();
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return clb.a(this, $$0);
   }

   @Override
   public btq<cla> dS() {
      return (btq<cla>)super.dS();
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public void a(BiConsumer<dvr<?>, aqm> $$0) {
      if (this.dP() instanceof aqm $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bru $$0) {
      if ($$0 instanceof bso $$1
         && this.dP() == $$0.dP()
         && brz.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsa.d
         && $$1.ak() != bsa.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(aqm $$0, euk $$1, @Nullable bru $$2, int $$3) {
      brc $$4 = new brc(bre.G, 260, 0, false, false);
      brd.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      ckz.a(this::b).encodeStart(ur.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dwd.a.a.encodeStart(ur.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         ckz.a(this::b).parse(new Dynamic(ur.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         dwd.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gy() {
      if (!this.c(bta.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public cky y() {
      return cky.a(this.gz());
   }

   private int gz() {
      return this.cF.b(this.p());
   }

   public void c(bru $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bru $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bru $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         clb.a((bso)this);
         boolean $$3 = !(this.dS().c(cbs.o).orElse(null) instanceof clw);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof clw && $$3 && cky.a($$4).d()) {
            this.dS().b(cbs.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<bso> gp() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bso p() {
      return this.dS().c(cbs.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.dS().a(cbs.aE, azf.a, 1200L);
      if ($$2 == bss.k) {
         this.b(bta.n);
         this.dS().a(cbs.aC, azf.a, (long)clb.a);
         this.a(avh.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gf() && !this.gt()) {
         bru $$3 = $$0.d();
         this.a($$3, cky.c.a() + 20, false);
         if (this.bE.c(cbs.o).isEmpty() && $$3 instanceof bso $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bso $$0) {
      this.dS().b(cbs.ay);
      this.dS().a(cbs.o, $$0);
      this.dS().b(cbs.E);
      byh.a(this, 200);
   }

   @Override
   public brx e(bta $$0) {
      brx $$1 = super.e($$0);
      return this.gt() ? brx.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gt() && super.bA();
   }

   @Override
   protected void D(bru $$0) {
      if (!this.gf() && !this.dS().a(cbs.aH)) {
         this.dS().a(cbs.aH, azf.a, 20L);
         this.d($$0);
         clb.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public ckz gq() {
      return this.cF;
   }

   @Override
   protected cca b(dax $$0) {
      return new cbz(this, $$0) {
         @Override
         protected enk a(int $$0) {
            this.o = new enq();
            this.o.a(true);
            return new enk(this.o, $$0) {
               @Override
               protected float a(eng $$0, eng $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dwd.a gr() {
      return this.cE;
   }

   @Override
   public dwd.d gs() {
      return this.cD;
   }

   class a implements dwd.d {
      private static final int b = 16;
      private final dvy c = new dvs(cla.this, cla.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dvy b() {
         return this.c;
      }

      @Override
      public awl<dvu> c() {
         return awc.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, io $$1, ix<dvu> $$2, dvu.a $$3) {
         if (!cla.this.gf() && !cla.this.eB() && !cla.this.dS().a(cbs.aI) && !cla.this.gt() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bso $$4 && !cla.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable bru $$3, @Nullable bru $$4, float $$5) {
         if (!cla.this.eB()) {
            cla.this.bE.a(cbs.aI, azf.a, 40L);
            $$0.a(cla.this, (byte)61);
            cla.this.a(avh.BV, 5.0F, cla.this.ff());
            io $$6 = $$1;
            if ($$4 != null) {
               if (cla.this.a($$4, 30.0)) {
                  if (cla.this.dS().a(cbs.aA)) {
                     if (cla.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cla.this.d($$4);
                  } else {
                     cla.this.a($$4, 10, true);
                  }
               }

               cla.this.dS().a(cbs.aA, azf.a, 100L);
            } else {
               cla.this.d($$3);
            }

            if (!cla.this.y().d()) {
               Optional<bso> $$7 = cla.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  clb.a(cla.this, $$6);
               }
            }
         }
      }
   }
}
