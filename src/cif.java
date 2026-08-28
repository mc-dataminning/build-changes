import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cif extends cio implements bwy<cif.b>, chy {
   private static final ajx<Integer> bN = akb.a(cif.class, ajz.b);
   private static final Predicate<bwa> bO = new Predicate<bwa>() {
      public boolean a(@Nullable bwa $$0) {
         return $$0 != null && cif.bP.containsKey($$0.aq());
      }
   };
   static final Map<bvi<?>, avz> bP = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvi.o, awa.tt);
      $$0.put(bvi.q, awa.tu);
      $$0.put(bvi.r, awa.tv);
      $$0.put(bvi.v, awa.tS);
      $$0.put(bvi.D, awa.tw);
      $$0.put(bvi.E, awa.tx);
      $$0.put(bvi.K, awa.ty);
      $$0.put(bvi.M, awa.tz);
      $$0.put(bvi.P, awa.tA);
      $$0.put(bvi.O, awa.tB);
      $$0.put(bvi.S, awa.tC);
      $$0.put(bvi.ad, awa.tD);
      $$0.put(bvi.ai, awa.tE);
      $$0.put(bvi.aj, awa.tF);
      $$0.put(bvi.am, awa.tG);
      $$0.put(bvi.an, awa.tH);
      $$0.put(bvi.az, awa.tI);
      $$0.put(bvi.aP, awa.tJ);
      $$0.put(bvi.aR, awa.tK);
      $$0.put(bvi.aS, awa.tL);
      $$0.put(bvi.aT, awa.tM);
      $$0.put(bvi.aY, awa.tN);
      $$0.put(bvi.bb, awa.tO);
      $$0.put(bvi.bd, awa.tP);
      $$0.put(bvi.be, awa.tQ);
      $$0.put(bvi.bg, awa.tR);
      $$0.put(bvi.bn, awa.tS);
      $$0.put(bvi.br, awa.tT);
      $$0.put(bvi.bB, awa.tU);
      $$0.put(bvi.bD, awa.tV);
      $$0.put(bvi.bF, awa.tW);
      $$0.put(bvi.bH, awa.tX);
      $$0.put(bvi.bI, awa.tY);
      $$0.put(bvi.bJ, awa.tZ);
      $$0.put(bvi.bM, awa.ua);
      $$0.put(bvi.bN, awa.ub);
      $$0.put(bvi.bP, awa.uc);
   });
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   private float bQ = 1.0F;
   private float bR = 1.0F;
   private boolean bS;
   @Nullable
   private ji bT;

   public cif(bvi<? extends cif> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cbw(this, 10, false);
      this.a(eun.n, -1.0F);
      this.a(eun.o, -1.0F);
      this.a(eun.x, -1.0F);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.a(af.a(cif.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new buq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bC.a(0, new bwv.a(1.25));
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cde(this, cpr.class, 8.0F));
      this.bC.a(2, new ceb(this));
      this.bC.a(2, new ccu(this, 1.0, 5.0F, 1.0F));
      this.bC.a(2, new cif.a(this, 1.0));
      this.bC.a(3, new cdb(this));
      this.bC.a(3, new cct(this, 1.0, 3.0F, 7.0F));
   }

   public static bxf.a gE() {
      return chp.gx().a(bxg.s, 6.0).a(bxg.l, 0.4F).a(bxg.v, 0.2F).a(bxg.c, 3.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      cfi $$1 = new cfi(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bT == null || !this.bT.a(this.ds(), 3.46) || !this.dU().a_(this.bT).a(dkg.eg)) {
         this.bS = false;
         this.bT = null;
      }

      if (this.dU().A.a(400) == 0) {
         a(this.dU(), this);
      }

      super.k_();
      this.gJ();
   }

   @Override
   public void a(ji $$0, boolean $$1) {
      this.bT = $$0;
      this.bS = $$1;
   }

   public boolean gF() {
      return this.bS;
   }

   private void gJ() {
      this.bM = this.bJ;
      this.bL = this.bK;
      this.bK = this.bK + (float)(!this.aJ() && !this.bY() ? 4 : -1) * 0.3F;
      this.bK = ayz.a(this.bK, 0.0F, 1.0F);
      if (!this.aJ() && this.bQ < 1.0F) {
         this.bQ = 1.0F;
      }

      this.bQ *= 0.9F;
      fbx $$0 = this.dx();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bJ = this.bJ + this.bQ * 2.0F;
   }

   public static boolean a(dgz $$0, bva $$1) {
      if ($$1.bJ() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bwa> $$2 = $$0.a(bwa.class, $$1.cQ().g(20.0), bO);
         if (!$$2.isEmpty()) {
            bwa $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               avz $$4 = b($$3.aq());
               $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$4, $$1.dl(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(awy.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.tq, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dU().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dU().a(this, (byte)7);
            } else {
               this.dU().a(this, (byte)6);
            }
         }

         return bsy.a;
      } else if (!$$2.a(awy.aB)) {
         if (!this.gH() && this.q() && this.k($$0)) {
            if (!this.dU().C) {
               this.y(!this.gs());
            }

            return bsy.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bue(bug.s, 900));
         if ($$0.b() || !this.cB()) {
            this.a(this.dV().a($$0), Float.MAX_VALUE);
         }

         return bsy.a;
      }
   }

   @Override
   public boolean j(cxh $$0) {
      return false;
   }

   public static boolean c(bvi<cif> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ce) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
   }

   @Override
   public boolean a(chp $$0) {
      return false;
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return null;
   }

   @Nullable
   @Override
   public avz u() {
      return a(this.dU(), this.dU().A);
   }

   public static avz a(dgz $$0, azh $$1) {
      if ($$0.an() != bsv.a && $$1.a(1000) == 0) {
         List<bvi<?>> $$2 = Lists.newArrayList(bP.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awa.to;
      }
   }

   private static avz b(bvi<?> $$0) {
      return bP.getOrDefault($$0, awa.to);
   }

   @Override
   protected avz e(btp $$0) {
      return awa.ts;
   }

   @Override
   protected avz l_() {
      return awa.tp;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.ud, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bR;
   }

   @Override
   protected void aZ() {
      this.a(awa.tr, 0.15F, 1.0F);
      this.bR = this.Y + this.bK / 2.0F;
   }

   @Override
   public float fh() {
      return a(this.ae);
   }

   public static float a(azh $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awb dl() {
      return awb.g;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   protected void D(bva $$0) {
      if (!($$0 instanceof cpr)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cif.b gG() {
      return cif.b.a(this.al.a(bN));
   }

   public void a(cif.b $$0) {
      this.al.a(bN, $$0.h);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gG().h);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cif.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gH() {
      return !this.aJ();
   }

   @Override
   protected boolean gw() {
      return true;
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.4F));
   }

   static class a extends cei {
      public a(bwg $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fbx h() {
         fbx $$0 = null;
         if (this.b.bj()) {
            $$0 = cgw.a(this.b, 15, 15);
         }

         if (this.b.dX().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fbx k() {
         ji $$0 = this.b.du();
         ji.a $$1 = new ji.a();
         ji.a $$2 = new ji.a();

         for (ji $$4 : ji.b(
            ayz.a(this.b.dz() - 3.0),
            ayz.a(this.b.dB() - 6.0),
            ayz.a(this.b.dF() - 3.0),
            ayz.a(this.b.dz() + 3.0),
            ayz.a(this.b.dB() + 6.0),
            ayz.a(this.b.dF() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dxq $$5 = this.b.dU().a_($$2.a($$4, jn.a));
               boolean $$6 = $$5.b() instanceof dos || $$5.a(awp.u);
               if ($$6 && this.b.dU().u($$4) && this.b.dU().u($$1.a($$4, jn.b))) {
                  return fbx.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azv {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cif.b> f = azv.a(cif.b::values);
      private static final IntFunction<cif.b> g = axq.a(cif.b::a, values(), axq.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cif.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
