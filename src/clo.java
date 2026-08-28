import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clo extends cjq implements dxp {
   private static final Logger cc = LogUtils.getLogger();
   private static final int cd = 40;
   private static final int ce = 200;
   private static final int cf = 500;
   private static final float cg = 0.3F;
   private static final float ch = 1.0F;
   private static final float ci = 1.5F;
   private static final int cj = 30;
   private static final ajp<Integer> ck = ajt.a(clo.class, ajr.b);
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
   private int cB;
   private int cC;
   private int cD;
   public bsb b = new bsb();
   public bsb c = new bsb();
   public bsb d = new bsb();
   public bsb e = new bsb();
   public bsb ca = new bsb();
   public bsb cb = new bsb();
   private final dxd<dxp.b> cE;
   private final dxp.d cF;
   private dxp.a cG;
   cln cH = new cln(this::b, Collections.emptyList());

   public clo(bsm<? extends cjq> $$0, dcf $$1) {
      super($$0, $$1);
      this.cF = new clo.a();
      this.cG = new dxp.a();
      this.cE = new dxd<>(new dxp.b(this));
      this.bP = 5;
      this.K().a(true);
      this.a(eoy.m, 0.0F);
      this.a(eoy.q, 8.0F);
      this.a(eoy.f, 8.0F);
      this.a(eoy.i, 8.0F);
      this.a(eoy.o, 0.0F);
      this.a(eoy.n, 0.0F);
   }

   @Override
   public zb<abn> dm() {
      return new abo(this, this.c(btn.n) ? 1 : 0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(btn.n);
      }
   }

   @Override
   public boolean a(dci $$0) {
      return super.a($$0) && $$0.a(this, this.al().n().a(this.do()));
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqz $$0) {
      return this.gs() && !$$0.a(avy.e) ? true : super.b($$0);
   }

   boolean gs() {
      return this.c(btn.o) || this.c(btn.n);
   }

   @Override
   protected boolean o(bsg $$0) {
      return false;
   }

   @Override
   public boolean fL() {
      return true;
   }

   @Override
   protected float aP() {
      return this.aa + 0.55F;
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 500.0).a(buj.v, 0.3F).a(buj.p, 1.0).a(buj.d, 1.5).a(buj.c, 30.0);
   }

   @Override
   public boolean bd() {
      return true;
   }

   @Override
   protected float fb() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avg v() {
      return !this.c(btn.l) && !this.gs() ? this.y().b() : null;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.BN;
   }

   @Override
   protected avg o_() {
      return avh.BJ;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.BX, 10.0F, 1.0F);
   }

   @Override
   public boolean D(bsg $$0) {
      this.dQ().a(this, (byte)4);
      this.a(avh.BI, 10.0F, this.fc());
      byu.a(this, 40);
      return super.D($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int u() {
      return this.ao.a(ck);
   }

   private void gv() {
      this.ao.a(ck, this.gy());
   }

   @Override
   public void l() {
      if (this.dQ() instanceof aqm $$0) {
         dxp.c.a($$0, this.cG, this.cF);
         if (this.fT() || this.W()) {
            clp.a((btb)this);
         }
      }

      super.l();
      if (this.dQ().x_()) {
         if (this.ai % this.gw() == 0) {
            this.cC = 10;
            if (!this.aX()) {
               this.dQ().a(this.dv(), this.dx(), this.dB(), avh.BM, this.df(), 5.0F, this.fc(), false);
            }
         }

         this.cB = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
         }

         switch (this.as()) {
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
      aqm $$0 = (aqm)this.dQ();
      $$0.ag().a("wardenBrain");
      this.dU().a($$0, this);
      this.dQ().ag().c();
      super.Z();
      if ((this.ai + this.am()) % 120 == 0) {
         a($$0, this.do(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gv();
      }

      clp.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.ca.a(this.ai);
      } else if ($$0 == 61) {
         this.cz = 10;
      } else if ($$0 == 62) {
         this.cb.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gw() {
      float $$0 = (float)this.u() / (float)clm.c.a();
      return 40 - ayg.d(ayg.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float H(float $$0) {
      return ayg.i($$0, (float)this.cB, (float)this.cz) / 10.0F;
   }

   public float I(float $$0) {
      return ayg.i($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bsb $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayo $$1 = this.dT();
         dsk $$2 = this.bq();
         if ($$2.l() != dln.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dv() + (double)ayg.b($$1, -0.7F, 0.7F);
               double $$5 = this.dx();
               double $$6 = this.dB() + (double)ayg.b($$1, -0.7F, 0.7F);
               this.dQ().a(new lb(lj.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         switch (this.as()) {
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
   public boolean a(dbx $$0) {
      return this.gs();
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return clp.a(this, $$0);
   }

   @Override
   public bud<clo> dU() {
      return (bud<clo>)super.dU();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(BiConsumer<dxd<?>, aqm> $$0) {
      if (this.dQ() instanceof aqm $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsg $$0) {
      if ($$0 instanceof btb $$1
         && this.dQ() == $$0.dQ()
         && bsl.e.test($$0)
         && !this.s($$0)
         && $$1.al() != bsm.d
         && $$1.al() != bsm.bm
         && !$$1.cv()
         && !$$1.ey()
         && this.dQ().C_().a($$1.cL())) {
         return true;
      }

      return false;
   }

   public static void a(aqm $$0, ewf $$1, @Nullable bsg $$2, int $$3) {
      bro $$4 = new bro(brq.G, 260, 0, false, false);
      brp.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cln.a(this::b).encodeStart(ul.a, this.cH).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxp.a.a.encodeStart(ul.a, this.cG).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cln.a(this::b).parse(new Dynamic(ul.a, $$0.c("anger"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cH = $$0x);
         this.gv();
      }

      if ($$0.b("listener", 10)) {
         dxp.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gx() {
      if (!this.c(btn.l)) {
         this.a(this.y().c(), 10.0F, this.fc());
      }
   }

   public clm y() {
      return clm.a(this.gy());
   }

   private int gy() {
      return this.cH.b(this.p());
   }

   public void c(bsg $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bsg $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsg $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.b($$0)) {
         clp.a((btb)this);
         boolean $$3 = !(this.p() instanceof cmk);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cmk && $$3 && clm.a($$4).d()) {
            this.dU().b(ccf.o);
         }

         if ($$2) {
            this.gx();
         }
      }
   }

   public Optional<btb> go() {
      return this.y().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.dU().a(ccf.aE, azk.a, 1200L);
      if ($$2 == btf.k) {
         this.b(btn.n);
         this.dU().a(ccf.aC, azk.a, (long)clp.a);
         this.a(avh.BF, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dQ().B && !this.gd() && !this.gs()) {
         bsg $$3 = $$0.d();
         this.a($$3, clm.c.a() + 20, false);
         if (this.bF.c(ccf.o).isEmpty() && $$3 instanceof btb $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btb $$0) {
      this.dU().b(ccf.ay);
      this.dU().a(ccf.o, $$0);
      this.dU().b(ccf.E);
      byu.a(this, 200);
   }

   @Override
   public bsj e(btn $$0) {
      bsj $$1 = super.e($$0);
      return this.gs() ? bsj.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bB() {
      return !this.gs() && super.bB();
   }

   @Override
   protected void E(bsg $$0) {
      if (!this.gd() && !this.dU().a(ccf.aH)) {
         this.dU().a(ccf.aH, azk.a, 20L);
         this.d($$0);
         clp.a(this, $$0.dq());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public cln gp() {
      return this.cH;
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ccm(this, $$0) {
         @Override
         protected eox a(int $$0) {
            this.o = new epd();
            this.o.a(true);
            return new eox(this.o, $$0) {
               @Override
               protected float a(eot $$0, eot $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxp.a gq() {
      return this.cG;
   }

   @Override
   public dxp.d gr() {
      return this.cF;
   }

   class a implements dxp.d {
      private static final int b = 16;
      private final dxk c = new dxe(clo.this, clo.this.cM());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxk b() {
         return this.c;
      }

      @Override
      public awm<dxg> c() {
         return awd.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxg> $$2, dxg.a $$3) {
         if (!clo.this.gd() && !clo.this.ey() && !clo.this.dU().a(ccf.aI) && !clo.this.gs() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btb $$4 && !clo.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable bsg $$3, @Nullable bsg $$4, float $$5) {
         if (!clo.this.ey()) {
            clo.this.bF.a(ccf.aI, azk.a, 40L);
            $$0.a(clo.this, (byte)61);
            clo.this.a(avh.BY, 5.0F, clo.this.fc());
            ja $$6 = $$1;
            if ($$4 != null) {
               if (clo.this.a($$4, 30.0)) {
                  if (clo.this.dU().a(ccf.aA)) {
                     if (clo.this.b($$4)) {
                        $$6 = $$4.dq();
                     }

                     clo.this.d($$4);
                  } else {
                     clo.this.a($$4, 10, true);
                  }
               }

               clo.this.dU().a(ccf.aA, azk.a, 100L);
            } else {
               clo.this.d($$3);
            }

            if (!clo.this.y().d()) {
               Optional<btb> $$7 = clo.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  clp.a(clo.this, $$6);
               }
            }
         }
      }
   }
}
