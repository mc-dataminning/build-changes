import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjk extends cjt implements cje {
   private static final akj<Integer> bN = akn.a(cjk.class, akl.b);
   private static final Predicate<bxe> bO = new Predicate<bxe>() {
      public boolean a(@Nullable bxe $$0) {
         return $$0 != null && cjk.bP.containsKey($$0.aq());
      }
   };
   static final Map<bwm<?>, awm> bP = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwm.o, awn.tu);
      $$0.put(bwm.q, awn.tv);
      $$0.put(bwm.r, awn.tw);
      $$0.put(bwm.v, awn.tT);
      $$0.put(bwm.D, awn.tx);
      $$0.put(bwm.E, awn.ty);
      $$0.put(bwm.K, awn.tz);
      $$0.put(bwm.M, awn.tA);
      $$0.put(bwm.P, awn.tB);
      $$0.put(bwm.O, awn.tC);
      $$0.put(bwm.S, awn.tD);
      $$0.put(bwm.ad, awn.tE);
      $$0.put(bwm.ai, awn.tF);
      $$0.put(bwm.aj, awn.tG);
      $$0.put(bwm.am, awn.tH);
      $$0.put(bwm.an, awn.tI);
      $$0.put(bwm.az, awn.tJ);
      $$0.put(bwm.aP, awn.tK);
      $$0.put(bwm.aR, awn.tL);
      $$0.put(bwm.aS, awn.tM);
      $$0.put(bwm.aT, awn.tN);
      $$0.put(bwm.aZ, awn.tO);
      $$0.put(bwm.bc, awn.tP);
      $$0.put(bwm.be, awn.tQ);
      $$0.put(bwm.bf, awn.tR);
      $$0.put(bwm.bh, awn.tS);
      $$0.put(bwm.bo, awn.tT);
      $$0.put(bwm.bs, awn.tU);
      $$0.put(bwm.bC, awn.tV);
      $$0.put(bwm.bE, awn.tW);
      $$0.put(bwm.bG, awn.tX);
      $$0.put(bwm.bI, awn.tY);
      $$0.put(bwm.bJ, awn.tZ);
      $$0.put(bwm.bK, awn.ua);
      $$0.put(bwm.bN, awn.ub);
      $$0.put(bwm.bO, awn.uc);
      $$0.put(bwm.bQ, awn.ud);
   });
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   private float bQ = 1.0F;
   private float bR = 1.0F;
   private boolean bS;
   @Nullable
   private iu bT;

   public cjk(bwm<? extends cjk> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new ccy(this, 10, false);
      this.a(ewx.n, -1.0F);
      this.a(ewx.o, -1.0F);
      this.a(ewx.x, -1.0F);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.a(af.a(cjk.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bvt.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bC.a(0, new bxy.a(1.25));
      this.bC.a(0, new cds(this));
      this.bC.a(1, new ceg(this, cqy.class, 8.0F));
      this.bC.a(2, new cfd(this));
      this.bC.a(2, new cdw(this, 1.0, 5.0F, 1.0F));
      this.bC.a(2, new cjk.a(this, 1.0));
      this.bC.a(3, new ced(this));
      this.bC.a(3, new cdv(this, 1.0, 3.0F, 7.0F));
   }

   public static byh.a gC() {
      return cis.gv().a(byi.s, 6.0).a(byi.l, 0.4F).a(byi.v, 0.2F).a(byi.c, 3.0);
   }

   @Override
   protected cgm b(div $$0) {
      cgk $$1 = new cgk(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bT == null || !this.bT.a(this.dt(), 3.46) || !this.dV().a_(this.bT).a(dmc.eh)) {
         this.bS = false;
         this.bT = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.k_();
      this.gH();
   }

   @Override
   public void a(iu $$0, boolean $$1) {
      this.bT = $$0;
      this.bS = $$1;
   }

   public boolean gD() {
      return this.bS;
   }

   private void gH() {
      this.bM = this.bJ;
      this.bL = this.bK;
      this.bK = this.bK + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.bK = azm.a(this.bK, 0.0F, 1.0F);
      if (!this.aJ() && this.bQ < 1.0F) {
         this.bQ = 1.0F;
      }

      this.bQ *= 0.9F;
      fei $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bJ = this.bJ + this.bQ * 2.0F;
   }

   public static boolean a(div $$0, bwd $$1) {
      if ($$1.bK() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bxe> $$2 = $$0.a(bxe.class, $$1.cR().g(20.0), bO);
         if (!$$2.isEmpty()) {
            bxe $$3 = $$2.get($$0.A.a($$2.size()));
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
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axk.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.tr, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bub.a;
      } else if (!$$2.a(axk.aB)) {
         if (!this.gF() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gq());
            }

            return bub.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bvh(bvj.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bub.a;
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return false;
   }

   public static boolean c(bwm<cjk> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ce) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzz $$2, iu $$3) {
   }

   @Override
   public boolean a(cis $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return null;
   }

   @Nullable
   @Override
   public awm u() {
      return a(this.dV(), this.dV().A);
   }

   public static awm a(div $$0, azv $$1) {
      if ($$0.an() != bty.a && $$1.a(1000) == 0) {
         List<bwm<?>> $$2 = Lists.newArrayList(bP.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awn.tp;
      }
   }

   private static awm b(bwm<?> $$0) {
      return bP.getOrDefault($$0, awn.tp);
   }

   @Override
   protected awm e(bus $$0) {
      return awn.tt;
   }

   @Override
   protected awm l_() {
      return awn.tq;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.ue, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bR;
   }

   @Override
   protected void aZ() {
      this.a(awn.ts, 0.15F, 1.0F);
      this.bR = this.Y + this.bK / 2.0F;
   }

   @Override
   public float fe() {
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
   protected void D(bwd $$0) {
      if (!($$0 instanceof cqy)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cjk.b gE() {
      return cjk.b.a(this.al.a(bN));
   }

   private void a(cjk.b $$0) {
      this.al.a(bN, $$0.i);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aA ? c((ki<T>)$$0, this.gE()) : super.a($$0);
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
      $$0.a(bN, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gE().i);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjk.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gF() {
      return !this.aJ();
   }

   @Override
   protected boolean gu() {
      return true;
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cfk {
      public a(bxk $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fei h() {
         fei $$0 = null;
         if (this.b.bj()) {
            $$0 = chy.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fei k() {
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
               dzz $$5 = this.b.dV().a_($$2.a($$4, ja.a));
               boolean $$6 = $$5.b() instanceof dqp || $$5.a(axc.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, ja.b))) {
                  return fei.c($$4);
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

      public static final Codec<cjk.b> f = bak.a(cjk.b::values);
      private static final IntFunction<cjk.b> h = ayc.a(cjk.b::a, values(), ayc.a.c);
      public static final yw<ByteBuf, cjk.b> g = yu.a(h, cjk.b::a);
      final int i;
      private final String j;

      private b(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public int a() {
         return this.i;
      }

      public static cjk.b a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
