import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjo extends cjx implements cji {
   private static final akj<Integer> bO = akn.a(cjo.class, akl.b);
   private static final Predicate<bxg> bP = new Predicate<bxg>() {
      public boolean a(@Nullable bxg $$0) {
         return $$0 != null && cjo.bQ.containsKey($$0.aq());
      }
   };
   static final Map<bwo<?>, awm> bQ = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwo.o, awn.tx);
      $$0.put(bwo.q, awn.ty);
      $$0.put(bwo.r, awn.tz);
      $$0.put(bwo.v, awn.tW);
      $$0.put(bwo.D, awn.tA);
      $$0.put(bwo.E, awn.tB);
      $$0.put(bwo.K, awn.tC);
      $$0.put(bwo.M, awn.tD);
      $$0.put(bwo.P, awn.tE);
      $$0.put(bwo.O, awn.tF);
      $$0.put(bwo.S, awn.tG);
      $$0.put(bwo.ad, awn.tH);
      $$0.put(bwo.ai, awn.tI);
      $$0.put(bwo.aj, awn.tJ);
      $$0.put(bwo.am, awn.tK);
      $$0.put(bwo.an, awn.tL);
      $$0.put(bwo.az, awn.tM);
      $$0.put(bwo.aP, awn.tN);
      $$0.put(bwo.aR, awn.tO);
      $$0.put(bwo.aS, awn.tP);
      $$0.put(bwo.aT, awn.tQ);
      $$0.put(bwo.aZ, awn.tR);
      $$0.put(bwo.bc, awn.tS);
      $$0.put(bwo.be, awn.tT);
      $$0.put(bwo.bf, awn.tU);
      $$0.put(bwo.bh, awn.tV);
      $$0.put(bwo.bo, awn.tW);
      $$0.put(bwo.bs, awn.tX);
      $$0.put(bwo.bC, awn.tY);
      $$0.put(bwo.bE, awn.tZ);
      $$0.put(bwo.bG, awn.ua);
      $$0.put(bwo.bI, awn.ub);
      $$0.put(bwo.bJ, awn.uc);
      $$0.put(bwo.bK, awn.ud);
      $$0.put(bwo.bN, awn.ue);
      $$0.put(bwo.bO, awn.uf);
      $$0.put(bwo.bQ, awn.ug);
   });
   public float bK;
   public float bL;
   public float bM;
   public float bN;
   private float bR = 1.0F;
   private float bS = 1.0F;
   private boolean bT;
   @Nullable
   private iu bU;

   public cjo(bwo<? extends cjo> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cda(this, 10, false);
      this.a(exf.n, -1.0F);
      this.a(exf.o, -1.0F);
      this.a(exf.x, -1.0F);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.a(af.a(cjo.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bvv.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bD.a(0, new bya.a(1.25));
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cei(this, crc.class, 8.0F));
      this.bD.a(2, new cff(this));
      this.bD.a(2, new cdy(this, 1.0, 5.0F, 1.0F));
      this.bD.a(2, new cjo.a(this, 1.0));
      this.bD.a(3, new cef(this));
      this.bD.a(3, new cdx(this, 1.0, 3.0F, 7.0F));
   }

   public static byj.a gD() {
      return ciu.gw().a(byk.s, 6.0).a(byk.l, 0.4F).a(byk.v, 0.2F).a(byk.c, 3.0);
   }

   @Override
   protected cgo b(dja $$0) {
      cgm $$1 = new cgm(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bU == null || !this.bU.a(this.dt(), 3.46) || !this.dV().a_(this.bU).a(dmh.ek)) {
         this.bT = false;
         this.bU = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.k_();
      this.gI();
   }

   @Override
   public void a(iu $$0, boolean $$1) {
      this.bU = $$0;
      this.bT = $$1;
   }

   public boolean gE() {
      return this.bT;
   }

   private void gI() {
      this.bN = this.bK;
      this.bM = this.bL;
      this.bL = this.bL + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.bL = azm.a(this.bL, 0.0F, 1.0F);
      if (!this.aJ() && this.bR < 1.0F) {
         this.bR = 1.0F;
      }

      this.bR *= 0.9F;
      feq $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bK = this.bK + this.bR * 2.0F;
   }

   public static boolean a(dja $$0, bwf $$1) {
      if ($$1.bK() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bxg> $$2 = $$0.a(bxg.class, $$1.cR().g(20.0), bP);
         if (!$$2.isEmpty()) {
            bxg $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               awm $$4 = b($$3.aq());
               $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$4, $$1.dm(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axk.aB)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.tu, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bud.a;
      } else if (!$$2.a(axk.aC)) {
         if (!this.gG() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gr());
            }

            return bud.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bvj(bvl.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bud.a;
      }
   }

   @Override
   public boolean i(czd $$0) {
      return false;
   }

   public static boolean c(bwo<cjo> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cf) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, eah $$2, iu $$3) {
   }

   @Override
   public boolean a(ciu $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return null;
   }

   @Nullable
   @Override
   public awm u() {
      return a(this.dV(), this.dV().A);
   }

   public static awm a(dja $$0, azv $$1) {
      if ($$0.an() != bua.a && $$1.a(1000) == 0) {
         List<bwo<?>> $$2 = Lists.newArrayList(bQ.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awn.ts;
      }
   }

   private static awm b(bwo<?> $$0) {
      return bQ.getOrDefault($$0, awn.ts);
   }

   @Override
   protected awm e(buu $$0) {
      return awn.tw;
   }

   @Override
   protected awm l_() {
      return awn.tt;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.uh, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bS;
   }

   @Override
   protected void aZ() {
      this.a(awn.tv, 0.15F, 1.0F);
      this.bS = this.Y + this.bL / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(azv $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awo dm() {
      return awo.g;
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   protected void D(bwf $$0) {
      if (!($$0 instanceof crc)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cjo.b gF() {
      return cjo.b.a(this.al.a(bO));
   }

   private void a(cjo.b $$0) {
      this.al.a(bO, $$0.i);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aA ? c((ki<T>)$$0, this.gF()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aA) {
         this.a(c(kj.aA, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bO, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gF().i);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjo.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gG() {
      return !this.aJ();
   }

   @Override
   protected boolean gv() {
      return true;
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cfm {
      public a(bxm $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected feq h() {
         feq $$0 = null;
         if (this.b.bj()) {
            $$0 = cia.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private feq k() {
         iu $$0 = this.b.dv();
         iu.a $$1 = new iu.a();
         iu.a $$2 = new iu.a();

         for (iu $$4 : iu.b(
            azm.a(this.b.dA() - 3.0),
            azm.a(this.b.dC() - 6.0),
            azm.a(this.b.dG() - 3.0),
            azm.a(this.b.dA() + 3.0),
            azm.a(this.b.dC() + 6.0),
            azm.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               eah $$5 = this.b.dV().a_($$2.a($$4, ja.a));
               boolean $$6 = $$5.b() instanceof dqv || $$5.a(axc.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, ja.b))) {
                  return feq.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bak {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cjo.b> f = bak.a(cjo.b::values);
      private static final IntFunction<cjo.b> h = ayc.a(cjo.b::a, values(), ayc.a.c);
      public static final yw<ByteBuf, cjo.b> g = yu.a(h, cjo.b::a);
      final int i;
      private final String j;

      private b(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public int a() {
         return this.i;
      }

      public static cjo.b a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
