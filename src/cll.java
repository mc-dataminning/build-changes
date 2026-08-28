import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cll extends cjn implements dxj {
   private static final Logger cc = LogUtils.getLogger();
   private static final int cd = 40;
   private static final int ce = 200;
   private static final int cf = 500;
   private static final float cg = 0.3F;
   private static final float ch = 1.0F;
   private static final float ci = 1.5F;
   private static final int cj = 30;
   private static final ajp<Integer> ck = ajt.a(cll.class, ajr.b);
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
   public bry b = new bry();
   public bry c = new bry();
   public bry d = new bry();
   public bry e = new bry();
   public bry ca = new bry();
   public bry cb = new bry();
   private final dwx<dxj.b> cE;
   private final dxj.d cF;
   private dxj.a cG;
   clk cH = new clk(this::b, Collections.emptyList());

   public cll(bsj<? extends cjn> $$0, dcd $$1) {
      super($$0, $$1);
      this.cF = new cll.a();
      this.cG = new dxj.a();
      this.cE = new dwx<>(new dxj.b(this));
      this.bP = 5;
      this.K().a(true);
      this.a(eos.m, 0.0F);
      this.a(eos.q, 8.0F);
      this.a(eos.f, 8.0F);
      this.a(eos.i, 8.0F);
      this.a(eos.o, 0.0F);
      this.a(eos.n, 0.0F);
   }

   @Override
   public zb<abn> dl() {
      return new abo(this, this.c(btk.n) ? 1 : 0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(btk.n);
      }
   }

   @Override
   public boolean a(dcg $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqw $$0) {
      return this.gr() && !$$0.a(avw.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(btk.o) || this.c(btk.n);
   }

   @Override
   protected boolean o(bsd $$0) {
      return false;
   }

   @Override
   public boolean fK() {
      return true;
   }

   @Override
   protected float aO() {
      return this.aa + 0.55F;
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 500.0).a(bug.v, 0.3F).a(bug.p, 1.0).a(bug.d, 1.5).a(bug.c, 30.0);
   }

   @Override
   public boolean bc() {
      return true;
   }

   @Override
   protected float fa() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected ave v() {
      return !this.c(btk.l) && !this.gr() ? this.y().b() : null;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.BN;
   }

   @Override
   protected ave o_() {
      return avf.BJ;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.BX, 10.0F, 1.0F);
   }

   @Override
   public boolean D(bsd $$0) {
      this.dP().a(this, (byte)4);
      this.a(avf.BI, 10.0F, this.fb());
      byr.a(this, 40);
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

   private void gu() {
      this.ao.a(ck, this.gx());
   }

   @Override
   public void l() {
      if (this.dP() instanceof aqk $$0) {
         dxj.c.a($$0, this.cG, this.cF);
         if (this.fS() || this.W()) {
            clm.a((bsy)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gv() == 0) {
            this.cC = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avf.BM, this.de(), 5.0F, this.fb(), false);
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
      aqk $$0 = (aqk)this.dP();
      $$0.ag().a("wardenBrain");
      this.dT().a($$0, this);
      this.dP().ag().c();
      super.Z();
      if ((this.ai + this.al()) % 120 == 0) {
         a($$0, this.dn(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gu();
      }

      clm.a(this);
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

   private int gv() {
      float $$0 = (float)this.u() / (float)clj.c.a();
      return 40 - aye.d(aye.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float H(float $$0) {
      return aye.i($$0, (float)this.cB, (float)this.cz) / 10.0F;
   }

   public float I(float $$0) {
      return aye.i($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bry $$0) {
      if ((float)$$0.b() < 4500.0F) {
         aym $$1 = this.dS();
         dsh $$2 = this.bp();
         if ($$2.l() != dll.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)aye.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)aye.b($$1, -0.7F, 0.7F);
               this.dP().a(new lb(lj.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
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
   public boolean a(dbv $$0) {
      return this.gr();
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return clm.a(this, $$0);
   }

   @Override
   public bua<cll> dT() {
      return (bua<cll>)super.dT();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(BiConsumer<dwx<?>, aqk> $$0) {
      if (this.dP() instanceof aqk $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsd $$0) {
      if ($$0 instanceof bsy $$1
         && this.dP() == $$0.dP()
         && bsi.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsj.d
         && $$1.ak() != bsj.bm
         && !$$1.cu()
         && !$$1.ex()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(aqk $$0, evz $$1, @Nullable bsd $$2, int $$3) {
      brl $$4 = new brl(brn.G, 260, 0, false, false);
      brm.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clk.a(this::b).encodeStart(ul.a, this.cH).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxj.a.a.encodeStart(ul.a, this.cG).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clk.a(this::b).parse(new Dynamic(ul.a, $$0.c("anger"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cH = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         dxj.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gw() {
      if (!this.c(btk.l)) {
         this.a(this.y().c(), 10.0F, this.fb());
      }
   }

   public clj y() {
      return clj.a(this.gx());
   }

   private int gx() {
      return this.cH.b(this.p());
   }

   public void c(bsd $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bsd $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsd $$0, int $$1, boolean $$2) {
      if (!this.gc() && this.b($$0)) {
         clm.a((bsy)this);
         boolean $$3 = !(this.p() instanceof cmh);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cmh && $$3 && clj.a($$4).d()) {
            this.dT().b(ccc.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bsy> gn() {
      return this.y().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.dT().a(ccc.aE, azh.a, 1200L);
      if ($$2 == btc.k) {
         this.b(btk.n);
         this.dT().a(ccc.aC, azh.a, (long)clm.a);
         this.a(avf.BF, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gc() && !this.gr()) {
         bsd $$3 = $$0.d();
         this.a($$3, clj.c.a() + 20, false);
         if (this.bF.c(ccc.o).isEmpty() && $$3 instanceof bsy $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bsy $$0) {
      this.dT().b(ccc.ay);
      this.dT().a(ccc.o, $$0);
      this.dT().b(ccc.E);
      byr.a(this, 200);
   }

   @Override
   public bsg e(btk $$0) {
      bsg $$1 = super.e($$0);
      return this.gr() ? bsg.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gr() && super.bA();
   }

   @Override
   protected void E(bsd $$0) {
      if (!this.gc() && !this.dT().a(ccc.aH)) {
         this.dT().a(ccc.aH, azh.a, 20L);
         this.d($$0);
         clm.a(this, $$0.dp());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public clk go() {
      return this.cH;
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccj(this, $$0) {
         @Override
         protected eor a(int $$0) {
            this.o = new eox();
            this.o.a(true);
            return new eor(this.o, $$0) {
               @Override
               protected float a(eon $$0, eon $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxj.a gp() {
      return this.cG;
   }

   @Override
   public dxj.d gq() {
      return this.cF;
   }

   class a implements dxj.d {
      private static final int b = 16;
      private final dxe c = new dwy(cll.this, cll.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxe b() {
         return this.c;
      }

      @Override
      public awk<dxa> c() {
         return awb.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqk $$0, ja $$1, jj<dxa> $$2, dxa.a $$3) {
         if (!cll.this.gc() && !cll.this.ex() && !cll.this.dT().a(ccc.aI) && !cll.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bsy $$4 && !cll.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable bsd $$3, @Nullable bsd $$4, float $$5) {
         if (!cll.this.ex()) {
            cll.this.bF.a(ccc.aI, azh.a, 40L);
            $$0.a(cll.this, (byte)61);
            cll.this.a(avf.BY, 5.0F, cll.this.fb());
            ja $$6 = $$1;
            if ($$4 != null) {
               if (cll.this.a($$4, 30.0)) {
                  if (cll.this.dT().a(ccc.aA)) {
                     if (cll.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     cll.this.d($$4);
                  } else {
                     cll.this.a($$4, 10, true);
                  }
               }

               cll.this.dT().a(ccc.aA, azh.a, 100L);
            } else {
               cll.this.d($$3);
            }

            if (!cll.this.y().d()) {
               Optional<bsy> $$7 = cll.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  clm.a(cll.this, $$6);
               }
            }
         }
      }
   }
}
