import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cor extends cmo implements ect {
   private static final Logger cb = LogUtils.getLogger();
   private static final int cc = 40;
   private static final int cd = 200;
   private static final int ce = 500;
   private static final float cf = 0.3F;
   private static final float cg = 1.0F;
   private static final float ch = 1.5F;
   private static final int ci = 30;
   private static final int cj = 24;
   private static final aks<Integer> ck = akw.a(cor.class, aku.b);
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
   private int cC;
   private int cD;
   private int cE;
   public but a = new but();
   public but b = new but();
   public but c = new but();
   public but d = new but();
   public but bZ = new but();
   public but ca = new but();
   private final ech<ect.b> cF;
   private final ect.d cG;
   private ect.a cH;
   coq cI = new coq(this::b, Collections.emptyList());

   public cor(bvi<? extends cmo> $$0, dgz $$1) {
      super($$0, $$1);
      this.cG = new cor.a();
      this.cH = new ect.a();
      this.cF = new ech<>(new ect.b(this));
      this.bO = 5;
      this.L().a(true);
      this.a(euh.m, 0.0F);
      this.a(euh.q, 8.0F);
      this.a(euh.f, 8.0F);
      this.a(euh.i, 8.0F);
      this.a(euh.o, 0.0F);
      this.a(euh.n, 0.0F);
   }

   @Override
   public zr<acg> a(arv $$0) {
      return new ach(this, $$0, this.c(bwj.n) ? 1 : 0);
   }

   @Override
   public void a(ach $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bwj.n);
      }
   }

   @Override
   public boolean a(dhc $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.du()));
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arx $$0, btr $$1) {
      return this.gr() && !$$1.a(axm.d) ? true : super.a($$0, $$1);
   }

   boolean gr() {
      return this.c(bwj.o) || this.c(bwj.n);
   }

   @Override
   protected boolean o(bvb $$0) {
      return false;
   }

   @Override
   public boolean fU() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 500.0).a(bxf.v, 0.3F).a(bxf.p, 1.0).a(bxf.d, 1.5).a(bxf.c, 30.0).a(bxf.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fg() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awu u() {
      return !this.c(bwj.l) && !this.gr() ? this.t().b() : null;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.CD;
   }

   @Override
   protected awu o_() {
      return awv.Cz;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.CN, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      $$0.a(this, (byte)4);
      this.a(awv.Cy, 10.0F, this.fh());
      cbq.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int p() {
      return this.al.a(ck);
   }

   private void gu() {
      this.al.a(ck, this.gx());
   }

   @Override
   public void h() {
      if (this.dW() instanceof arx $$0) {
         ect.c.a($$0, this.cH, this.cG);
         if (this.aj() || this.W()) {
            cos.a((bvx)this);
         }
      }

      super.h();
      if (this.dW().B_()) {
         if (this.af % this.gv() == 0) {
            this.cD = 10;
            if (!this.bb()) {
               this.dW().a(this.dB(), this.dD(), this.dH(), awv.CC, this.dn(), 5.0F, this.fh(), false);
            }
         }

         this.cC = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cE = this.cD;
         if (this.cD > 0) {
            this.cD--;
         }

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("wardenBrain");
      this.ec().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.du(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cI.a($$0, this::b);
         this.gu();
      }

      cos.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bZ.a(this.af);
      } else if ($$0 == 61) {
         this.cz = 10;
      } else if ($$0 == 62) {
         this.ca.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.p() / (float)cop.c.a();
      return 40 - azu.d(azu.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azu.h($$0, (float)this.cC, (float)this.cz) / 10.0F;
   }

   public float K(float $$0) {
      return azu.h($$0, (float)this.cE, (float)this.cD) / 10.0F;
   }

   private void a(but $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         bac $$1 = this.dZ();
         dxo $$2 = this.bu();
         if ($$2.o() != dqo.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dB() + (double)azu.b($$1, -0.7F, 0.7F);
               double $$5 = this.dD();
               double $$6 = this.dH() + (double)azu.b($$1, -0.7F, 0.7F);
               this.dW().a(new lk(ls.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aks<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.aw()) {
            case n:
               this.c.a(this.af);
               break;
            case o:
               this.d.a(this.af);
               break;
            case l:
               this.a.a(this.af);
               break;
            case m:
               this.b.a(this.af);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dgr $$0) {
      return this.gr();
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cos.a(this, $$0);
   }

   @Override
   public bwz<cor> ec() {
      return (bwz<cor>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public void a(BiConsumer<ech<?>, arx> $$0) {
      if (this.dW() instanceof arx $$1) {
         $$0.accept(this.cF, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bvb $$0) {
      if ($$0 instanceof bvx $$1
         && this.dW() == $$0.dW()
         && bvg.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bvi.f
         && $$1.aq() != bvi.bG
         && !$$1.cC()
         && !$$1.eF()
         && this.dW().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arx $$0, fbr $$1, @Nullable bvb $$2, int $$3) {
      bug $$4 = new bug(bui.G, 260, 0, false, false);
      buh.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      aln<vj> $$1 = this.dY().a(va.a);
      coq.a(this::b)
         .encodeStart($$1, this.cI)
         .resultOrPartial($$0x -> cb.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ect.a.a
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> cb.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      aln<vj> $$1 = this.dY().a(va.a);
      if ($$0.e("anger")) {
         coq.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> cb.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cI = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         ect.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> cb.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bwj.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public cop t() {
      return cop.a(this.gx());
   }

   private int gx() {
      return this.cI.b(this.O_());
   }

   @Override
   public void c(bvb $$0) {
      this.cI.a($$0);
   }

   public void d(@Nullable bvb $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bvb $$0, int $$1, boolean $$2) {
      if (!this.gb() && this.b($$0)) {
         cos.a((bvx)this);
         boolean $$3 = !(this.O_() instanceof cpo);
         int $$4 = this.cI.a($$0, $$1);
         if ($$0 instanceof cpo && $$3 && cop.a($$4).d()) {
            this.ec().b(cfb.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bvx> x() {
      return this.t().d() ? this.cI.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.ec().a(cfb.aE, bba.a, 1200L);
      if ($$2 == bvh.k) {
         this.b(bwj.n);
         this.ec().a(cfb.aC, bba.a, (long)cos.a);
         this.a(awv.Cv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gb() && !this.gr()) {
         bvb $$4 = $$1.d();
         this.a($$4, cop.c.a() + 20, false);
         if (this.bF.c(cfb.o).isEmpty() && $$4 instanceof bvx $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bvx $$0) {
      this.ec().b(cfb.ay);
      this.ec().a(cfb.o, $$0);
      this.ec().b(cfb.E);
      cbq.a(this, 200);
   }

   @Override
   public bve e(bwj $$0) {
      bve $$1 = super.e($$0);
      return this.gr() ? bve.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gr() && super.bI();
   }

   @Override
   protected void D(bvb $$0) {
      if (!this.gb() && !this.ec().a(cfb.aH)) {
         this.ec().a(cfb.aH, bba.a, 20L);
         this.d($$0);
         cos.a(this, $$0.dw());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public coq go() {
      return this.cI;
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfi(this, $$0) {
         @Override
         protected eug a(int $$0) {
            this.o = new eum();
            this.o.a(true);
            return new eug(this.o, $$0) {
               @Override
               protected float a(euc $$0, euc $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ect.a gp() {
      return this.cH;
   }

   @Override
   public ect.d gq() {
      return this.cG;
   }

   class a implements ect.d {
      private static final int b = 16;
      private final eco c = new eci(cor.this, cor.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eco b() {
         return this.c;
      }

      @Override
      public aya<eck> c() {
         return axr.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arx $$0, jh $$1, jq<eck> $$2, eck.a $$3) {
         if (!cor.this.gb() && !cor.this.eF() && !cor.this.ec().a(cfb.aI) && !cor.this.gr() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bvx $$4 && !cor.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arx $$0, jh $$1, jq<eck> $$2, @Nullable bvb $$3, @Nullable bvb $$4, float $$5) {
         if (!cor.this.eF()) {
            cor.this.bF.a(cfb.aI, bba.a, 40L);
            $$0.a(cor.this, (byte)61);
            cor.this.a(awv.CO, 5.0F, cor.this.fh());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cor.this.a($$4, 30.0)) {
                  if (cor.this.ec().a(cfb.aA)) {
                     if (cor.this.b($$4)) {
                        $$6 = $$4.dw();
                     }

                     cor.this.d($$4);
                  } else {
                     cor.this.a($$4, 10, true);
                  }
               }

               cor.this.ec().a(cfb.aA, bba.a, 100L);
            } else {
               cor.this.d($$3);
            }

            if (!cor.this.t().d()) {
               Optional<bvx> $$7 = cor.this.cI.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cos.a(cor.this, $$6);
               }
            }
         }
      }
   }
}
