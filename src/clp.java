import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clp extends cjr implements dxq {
   private static final Logger cc = LogUtils.getLogger();
   private static final int cd = 40;
   private static final int ce = 200;
   private static final int cf = 500;
   private static final float cg = 0.3F;
   private static final float ch = 1.0F;
   private static final float ci = 1.5F;
   private static final int cj = 30;
   private static final ajp<Integer> ck = ajt.a(clp.class, ajr.b);
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
   private int cA;
   private int cC;
   private int cD;
   public bsc b = new bsc();
   public bsc c = new bsc();
   public bsc d = new bsc();
   public bsc e = new bsc();
   public bsc ca = new bsc();
   public bsc cb = new bsc();
   private final dxe<dxq.b> cE;
   private final dxq.d cF;
   private dxq.a cG;
   clo cH = new clo(this::b, Collections.emptyList());

   public clp(bsn<? extends cjr> $$0, dcg $$1) {
      super($$0, $$1);
      this.cF = new clp.a();
      this.cG = new dxq.a();
      this.cE = new dxe<>(new dxq.b(this));
      this.bP = 5;
      this.J().a(true);
      this.a(epa.m, 0.0F);
      this.a(epa.q, 8.0F);
      this.a(epa.f, 8.0F);
      this.a(epa.i, 8.0F);
      this.a(epa.o, 0.0F);
      this.a(epa.n, 0.0F);
   }

   @Override
   public zb<abn> dn() {
      return new abo(this, this.c(bto.n) ? 1 : 0);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bto.n);
      }
   }

   @Override
   public boolean a(dcj $$0) {
      return super.a($$0) && $$0.a(this, this.am().n().a(this.dp()));
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bra $$0) {
      return this.gr() && !$$0.a(avy.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(bto.o) || this.c(bto.n);
   }

   @Override
   protected boolean o(bsh $$0) {
      return false;
   }

   @Override
   public boolean fM() {
      return true;
   }

   @Override
   protected float aQ() {
      return this.aa + 0.55F;
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 500.0).a(buk.v, 0.3F).a(buk.p, 1.0).a(buk.d, 1.5).a(buk.c, 30.0);
   }

   @Override
   public boolean be() {
      return true;
   }

   @Override
   protected float fc() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avg v() {
      return !this.c(bto.l) && !this.gr() ? this.x().b() : null;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.BN;
   }

   @Override
   protected avg n_() {
      return avh.BJ;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.BX, 10.0F, 1.0F);
   }

   @Override
   public boolean D(bsh $$0) {
      this.dR().a(this, (byte)4);
      this.a(avh.BI, 10.0F, this.fd());
      byv.a(this, 40);
      return super.D($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int t() {
      return this.ao.a(ck);
   }

   private void gu() {
      this.ao.a(ck, this.gx());
   }

   @Override
   public void l() {
      if (this.dR() instanceof aqm $$0) {
         dxq.c.a($$0, this.cG, this.cF);
         if (this.fS() || this.W()) {
            clq.a((btc)this);
         }
      }

      super.l();
      if (this.dR().x_()) {
         if (this.ai % this.gv() == 0) {
            this.cC = 10;
            if (!this.aY()) {
               this.dR().a(this.dw(), this.dy(), this.dC(), avh.BM, this.dg(), 5.0F, this.fd(), false);
            }
         }

         this.cA = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
         }

         switch (this.at()) {
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
      aqm $$0 = (aqm)this.dR();
      $$0.ag().a("wardenBrain");
      this.dV().a($$0, this);
      this.dR().ag().c();
      super.Z();
      if ((this.ai + this.an()) % 120 == 0) {
         a($$0, this.dp(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gu();
      }

      clq.a(this);
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
      float $$0 = (float)this.t() / (float)cln.c.a();
      return 40 - ayg.d(ayg.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float H(float $$0) {
      return ayg.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   public float I(float $$0) {
      return ayg.i($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bsc $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayo $$1 = this.dU();
         dsl $$2 = this.br();
         if ($$2.l() != dlo.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dw() + (double)ayg.b($$1, -0.7F, 0.7F);
               double $$5 = this.dy();
               double $$6 = this.dC() + (double)ayg.b($$1, -0.7F, 0.7F);
               this.dR().a(new lb(lj.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         switch (this.at()) {
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
   public boolean a(dby $$0) {
      return this.gr();
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return clq.a(this, $$0);
   }

   @Override
   public bue<clp> dV() {
      return (bue<clp>)super.dV();
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void a(BiConsumer<dxe<?>, aqm> $$0) {
      if (this.dR() instanceof aqm $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bsh $$0) {
      if ($$0 instanceof btc $$1
         && this.dR() == $$0.dR()
         && bsm.e.test($$0)
         && !this.s($$0)
         && $$1.am() != bsn.d
         && $$1.am() != bsn.bm
         && !$$1.cw()
         && !$$1.ez()
         && this.dR().C_().a($$1.cM())) {
         return true;
      }

      return false;
   }

   public static void a(aqm $$0, ewh $$1, @Nullable bsh $$2, int $$3) {
      brp $$4 = new brp(brr.G, 260, 0, false, false);
      brq.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clo.a(this::b).encodeStart(ul.a, this.cH).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dxq.a.a.encodeStart(ul.a, this.cG).resultOrPartial(cc::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clo.a(this::b).parse(new Dynamic(ul.a, $$0.c("anger"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cH = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         dxq.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(cc::error).ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bto.l)) {
         this.a(this.x().c(), 10.0F, this.fd());
      }
   }

   public cln x() {
      return cln.a(this.gx());
   }

   private int gx() {
      return this.cH.b(this.p());
   }

   public void c(bsh $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bsh $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bsh $$0, int $$1, boolean $$2) {
      if (!this.gc() && this.b($$0)) {
         clq.a((btc)this);
         boolean $$3 = !(this.p() instanceof cml);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cml && $$3 && cln.a($$4).d()) {
            this.dV().b(ccg.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<btc> gn() {
      return this.x().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.dV().a(ccg.aE, azk.a, 1200L);
      if ($$2 == btg.k) {
         this.b(bto.n);
         this.dV().a(ccg.aC, azk.a, (long)clq.a);
         this.a(avh.BF, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dR().B && !this.gc() && !this.gr()) {
         bsh $$3 = $$0.d();
         this.a($$3, cln.c.a() + 20, false);
         if (this.bG.c(ccg.o).isEmpty() && $$3 instanceof btc $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(btc $$0) {
      this.dV().b(ccg.ay);
      this.dV().a(ccg.o, $$0);
      this.dV().b(ccg.E);
      byv.a(this, 200);
   }

   @Override
   public bsk e(bto $$0) {
      bsk $$1 = super.e($$0);
      return this.gr() ? bsk.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bC() {
      return !this.gr() && super.bC();
   }

   @Override
   protected void E(bsh $$0) {
      if (!this.gc() && !this.dV().a(ccg.aH)) {
         this.dV().a(ccg.aH, azk.a, 20L);
         this.d($$0);
         clq.a(this, $$0.dr());
      }

      super.E($$0);
   }

   @VisibleForTesting
   public clo go() {
      return this.cH;
   }

   @Override
   protected cco b(dcg $$0) {
      return new ccn(this, $$0) {
         @Override
         protected eoz a(int $$0) {
            this.o = new epf();
            this.o.a(true);
            return new eoz(this.o, $$0) {
               @Override
               protected float a(eov $$0, eov $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dxq.a gp() {
      return this.cG;
   }

   @Override
   public dxq.d gq() {
      return this.cF;
   }

   class a implements dxq.d {
      private static final int b = 16;
      private final dxl c = new dxf(clp.this, clp.this.cN());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dxl b() {
         return this.c;
      }

      @Override
      public awm<dxh> c() {
         return awd.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxh> $$2, dxh.a $$3) {
         if (!clp.this.gc() && !clp.this.ez() && !clp.this.dV().a(ccg.aI) && !clp.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof btc $$4 && !clp.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable bsh $$3, @Nullable bsh $$4, float $$5) {
         if (!clp.this.ez()) {
            clp.this.bG.a(ccg.aI, azk.a, 40L);
            $$0.a(clp.this, (byte)61);
            clp.this.a(avh.BY, 5.0F, clp.this.fd());
            ja $$6 = $$1;
            if ($$4 != null) {
               if (clp.this.a($$4, 30.0)) {
                  if (clp.this.dV().a(ccg.aA)) {
                     if (clp.this.b($$4)) {
                        $$6 = $$4.dr();
                     }

                     clp.this.d($$4);
                  } else {
                     clp.this.a($$4, 10, true);
                  }
               }

               clp.this.dV().a(ccg.aA, azk.a, 100L);
            } else {
               clp.this.d($$3);
            }

            if (!clp.this.x().d()) {
               Optional<btc> $$7 = clp.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  clq.a(clp.this, $$6);
               }
            }
         }
      }
   }
}
