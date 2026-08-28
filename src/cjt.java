import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjt extends ckb implements cjn {
   private static final akj<Integer> bO = akn.a(cjt.class, akl.b);
   private static final Predicate<bxl> bP = new Predicate<bxl>() {
      public boolean a(@Nullable bxl $$0) {
         return $$0 != null && cjt.bQ.containsKey($$0.an());
      }
   };
   static final Map<bwr<?>, awm> bQ = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwr.o, awn.tx);
      $$0.put(bwr.q, awn.ty);
      $$0.put(bwr.r, awn.tz);
      $$0.put(bwr.v, awn.tW);
      $$0.put(bwr.D, awn.tA);
      $$0.put(bwr.E, awn.tB);
      $$0.put(bwr.K, awn.tC);
      $$0.put(bwr.M, awn.tD);
      $$0.put(bwr.P, awn.tE);
      $$0.put(bwr.O, awn.tF);
      $$0.put(bwr.S, awn.tG);
      $$0.put(bwr.ad, awn.tH);
      $$0.put(bwr.ai, awn.tI);
      $$0.put(bwr.aj, awn.tJ);
      $$0.put(bwr.am, awn.tK);
      $$0.put(bwr.an, awn.tL);
      $$0.put(bwr.az, awn.tM);
      $$0.put(bwr.aP, awn.tN);
      $$0.put(bwr.aR, awn.tO);
      $$0.put(bwr.aS, awn.tP);
      $$0.put(bwr.aT, awn.tQ);
      $$0.put(bwr.aZ, awn.tR);
      $$0.put(bwr.bc, awn.tS);
      $$0.put(bwr.be, awn.tT);
      $$0.put(bwr.bf, awn.tU);
      $$0.put(bwr.bh, awn.tV);
      $$0.put(bwr.bo, awn.tW);
      $$0.put(bwr.bs, awn.tX);
      $$0.put(bwr.bC, awn.tY);
      $$0.put(bwr.bE, awn.tZ);
      $$0.put(bwr.bG, awn.ua);
      $$0.put(bwr.bI, awn.ub);
      $$0.put(bwr.bJ, awn.uc);
      $$0.put(bwr.bK, awn.ud);
      $$0.put(bwr.bN, awn.ue);
      $$0.put(bwr.bO, awn.uf);
      $$0.put(bwr.bQ, awn.ug);
   });
   public float bK;
   public float bL;
   public float bM;
   public float bN;
   private float bR = 1.0F;
   private float bS = 1.0F;
   private boolean bT;
   @Nullable
   private iv bU;

   public cjt(bwr<? extends cjt> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new cdf(this, 10, false);
      this.a(exm.n, -1.0F);
      this.a(exm.o, -1.0F);
      this.a(exm.x, -1.0F);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.a(ag.a(cjt.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bvy.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bD.a(0, new byf.a(1.25));
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cen(this, crj.class, 8.0F));
      this.bD.a(2, new cfk(this));
      this.bD.a(2, new ced(this, 1.0, 5.0F, 1.0F));
      this.bD.a(2, new cjt.a(this, 1.0));
      this.bD.a(3, new cek(this));
      this.bD.a(3, new cec(this, 1.0, 3.0F, 7.0F));
   }

   public static byo.a gF() {
      return ciz.gy().a(byp.s, 6.0).a(byp.l, 0.4F).a(byp.v, 0.2F).a(byp.c, 3.0);
   }

   @Override
   protected cgt b(djh $$0) {
      cgr $$1 = new cgr(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bU == null || !this.bU.a(this.ds(), 3.46) || !this.dU().a_(this.bU).a(dmo.ek)) {
         this.bT = false;
         this.bU = null;
      }

      if (this.dU().A.a(400) == 0) {
         a(this.dU(), this);
      }

      super.k_();
      this.gK();
   }

   @Override
   public void a(iv $$0, boolean $$1) {
      this.bU = $$0;
      this.bT = $$1;
   }

   public boolean gG() {
      return this.bT;
   }

   private void gK() {
      this.bN = this.bK;
      this.bM = this.bL;
      this.bL = this.bL + (float)(!this.aH() && !this.bX() ? 4 : -1) * 0.3F;
      this.bL = azm.a(this.bL, 0.0F, 1.0F);
      if (!this.aH() && this.bR < 1.0F) {
         this.bR = 1.0F;
      }

      this.bR *= 0.9F;
      fex $$0 = this.dx();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bK = this.bK + this.bR * 2.0F;
   }

   public static boolean a(djh $$0, bwi $$1) {
      if ($$1.bI() && !$$1.aZ() && $$0.A.a(2) == 0) {
         List<bxl> $$2 = $$0.a(bxl.class, $$1.cQ().g(20.0), bP);
         if (!$$2.isEmpty()) {
            bxl $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.aZ()) {
               awm $$4 = b($$3.an());
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
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axk.aB)) {
         this.a($$0, $$1, $$2);
         if (!this.aZ()) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.tu, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dU().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dU().a(this, (byte)7);
            } else {
               this.dU().a(this, (byte)6);
            }
         }

         return bug.a;
      } else if (!$$2.a(axk.aC)) {
         if (!this.gI() && this.q() && this.j($$0)) {
            if (!this.dU().C) {
               this.y(!this.gt());
            }

            return bug.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bvm(bvo.s, 900));
         if ($$0.b() || !this.cB()) {
            this.a(this.dV().a($$0), Float.MAX_VALUE);
         }

         return bug.a;
      }
   }

   @Override
   public boolean i(czk $$0) {
      return false;
   }

   public static boolean c(bwr<cjt> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cf) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, eao $$2, iv $$3) {
   }

   @Override
   public boolean a(ciz $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return null;
   }

   @Nullable
   @Override
   public awm u() {
      return a(this.dU(), this.dU().A);
   }

   public static awm a(djh $$0, azv $$1) {
      if ($$0.an() != bud.a && $$1.a(1000) == 0) {
         List<bwr<?>> $$2 = Lists.newArrayList(bQ.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awn.ts;
      }
   }

   private static awm b(bwr<?> $$0) {
      return bQ.getOrDefault($$0, awn.ts);
   }

   @Override
   protected awm e(bux $$0) {
      return awn.tw;
   }

   @Override
   protected awm l_() {
      return awn.tt;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.uh, 0.15F, 1.0F);
   }

   @Override
   protected boolean aY() {
      return this.Y > this.bS;
   }

   @Override
   protected void aX() {
      this.a(awn.tv, 0.15F, 1.0F);
      this.bS = this.Y + this.bL / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.ae);
   }

   public static float a(azv $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awo dl() {
      return awo.g;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected void D(bwi $$0) {
      if (!($$0 instanceof crj)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cjt.b gH() {
      return cjt.b.a(this.al.a(bO));
   }

   private void a(cjt.b $$0) {
      this.al.a(bO, $$0.j);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aA ? c((kj<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aA) {
         this.a(c(kk.aA, $$1));
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
      $$0.a("Variant", cjt.b.g, this.gH());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cjt.b>a("Variant", cjt.b.g).orElse(cjt.b.a));
   }

   @Override
   public boolean gI() {
      return !this.aH();
   }

   @Override
   protected boolean gx() {
      return true;
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.5F * this.cR()), (double)(this.dp() * 0.4F));
   }

   static class a extends cfr {
      public a(bxr $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fex h() {
         fex $$0 = null;
         if (this.b.bh()) {
            $$0 = cif.a(this.b, 15, 15);
         }

         if (this.b.dX().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fex k() {
         iv $$0 = this.b.du();
         iv.a $$1 = new iv.a();
         iv.a $$2 = new iv.a();

         for (iv $$4 : iv.b(
            azm.a(this.b.dz() - 3.0),
            azm.a(this.b.dB() - 6.0),
            azm.a(this.b.dF() - 3.0),
            azm.a(this.b.dz() + 3.0),
            azm.a(this.b.dB() + 6.0),
            azm.a(this.b.dF() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               eao $$5 = this.b.dU().a_($$2.a($$4, jb.a));
               boolean $$6 = $$5.b() instanceof drc || $$5.a(axc.u);
               if ($$6 && this.b.dU().v($$4) && this.b.dU().v($$1.a($$4, jb.b))) {
                  return fex.c($$4);
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

      private static final IntFunction<cjt.b> i = ayc.a(cjt.b::a, values(), ayc.a.c);
      public static final Codec<cjt.b> f = bak.a(cjt.b::values);
      @Deprecated
      public static final Codec<cjt.b> g = Codec.INT.xmap(i::apply, cjt.b::a);
      public static final yw<ByteBuf, cjt.b> h = yu.a(i, cjt.b::a);
      final int j;
      private final String k;

      private b(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      public int a() {
         return this.j;
      }

      public static cjt.b a(int $$0) {
         return i.apply($$0);
      }

      @Override
      public String c() {
         return this.k;
      }
   }
}
