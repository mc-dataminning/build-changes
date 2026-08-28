import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cke extends ckm implements cjy {
   private static final akl<Integer> bQ = akp.a(cke.class, akn.b);
   private static final Predicate<bxw> bR = new Predicate<bxw>() {
      public boolean a(@Nullable bxw $$0) {
         return $$0 != null && cke.bS.containsKey($$0.an());
      }
   };
   static final Map<bxc<?>, awo> bS = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxc.p, awp.tx);
      $$0.put(bxc.r, awp.ty);
      $$0.put(bxc.s, awp.tz);
      $$0.put(bxc.w, awp.tW);
      $$0.put(bxc.E, awp.tA);
      $$0.put(bxc.F, awp.tB);
      $$0.put(bxc.L, awp.tC);
      $$0.put(bxc.N, awp.tD);
      $$0.put(bxc.Q, awp.tE);
      $$0.put(bxc.P, awp.tF);
      $$0.put(bxc.T, awp.tG);
      $$0.put(bxc.ae, awp.tH);
      $$0.put(bxc.aj, awp.tI);
      $$0.put(bxc.ak, awp.tJ);
      $$0.put(bxc.an, awp.tK);
      $$0.put(bxc.ao, awp.tL);
      $$0.put(bxc.aA, awp.tM);
      $$0.put(bxc.aQ, awp.tN);
      $$0.put(bxc.aS, awp.tO);
      $$0.put(bxc.aT, awp.tP);
      $$0.put(bxc.aU, awp.tQ);
      $$0.put(bxc.ba, awp.tR);
      $$0.put(bxc.bd, awp.tS);
      $$0.put(bxc.bf, awp.tT);
      $$0.put(bxc.bg, awp.tU);
      $$0.put(bxc.bi, awp.tV);
      $$0.put(bxc.bp, awp.tW);
      $$0.put(bxc.bt, awp.tX);
      $$0.put(bxc.bD, awp.tY);
      $$0.put(bxc.bF, awp.tZ);
      $$0.put(bxc.bH, awp.ua);
      $$0.put(bxc.bJ, awp.ub);
      $$0.put(bxc.bK, awp.uc);
      $$0.put(bxc.bL, awp.ud);
      $$0.put(bxc.bO, awp.ue);
      $$0.put(bxc.bP, awp.uf);
      $$0.put(bxc.bR, awp.ug);
   });
   public float bM;
   public float bN;
   public float bO;
   public float bP;
   private float bT = 1.0F;
   private float bU = 1.0F;
   private boolean bV;
   @Nullable
   private iv bW;

   public cke(bxc<? extends cke> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cdq(this, 10, false);
      this.a(eyf.n, -1.0F);
      this.a(eyf.o, -1.0F);
      this.a(eyf.x, -1.0F);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.a(ag.a(cke.b.values(), $$0.G_()));
      if ($$3 == null) {
         $$3 = new bwj.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bF.a(0, new byq.a(1.25));
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cey(this, crx.class, 8.0F));
      this.bF.a(2, new cfv(this));
      this.bF.a(2, new ceo(this, 1.0, 5.0F, 1.0F));
      this.bF.a(2, new cke.a(this, 1.0));
      this.bF.a(3, new cev(this));
      this.bF.a(3, new cen(this, 1.0, 3.0F, 7.0F));
   }

   public static byz.a gG() {
      return cjk.gz().a(bza.s, 6.0).a(bza.l, 0.4F).a(bza.v, 0.2F).a(bza.c, 3.0);
   }

   @Override
   protected che b(djx $$0) {
      chc $$1 = new chc(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bW == null || !this.bW.a(this.dt(), 3.46) || !this.dV().a_(this.bW).a(dne.ek)) {
         this.bV = false;
         this.bW = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.k_();
      this.gL();
   }

   @Override
   public void a(iv $$0, boolean $$1) {
      this.bW = $$0;
      this.bV = $$1;
   }

   public boolean gH() {
      return this.bV;
   }

   private void gL() {
      this.bP = this.bM;
      this.bO = this.bN;
      this.bN = this.bN + (float)(!this.aH() && !this.bY() ? 4 : -1) * 0.3F;
      this.bN = azo.a(this.bN, 0.0F, 1.0F);
      if (!this.aH() && this.bT < 1.0F) {
         this.bT = 1.0F;
      }

      this.bT *= 0.9F;
      ffq $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bM = this.bM + this.bT * 2.0F;
   }

   public static boolean a(djx $$0, bwt $$1) {
      if ($$1.bJ() && !$$1.ba() && $$0.A.a(2) == 0) {
         List<bxw> $$2 = $$0.a(bxw.class, $$1.cR().g(20.0), bR);
         if (!$$2.isEmpty()) {
            bxw $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.ba()) {
               awo $$4 = b($$3.an());
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
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axm.aB)) {
         this.a($$0, $$1, $$2);
         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.tu, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bur.a;
      } else if (!$$2.a(axm.aC)) {
         if (!this.gJ() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gu());
            }

            return bur.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bvx(bvz.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bur.a;
      }
   }

   @Override
   public boolean i(czy $$0) {
      return false;
   }

   public static boolean c(bxc<cke> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cf) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
   }

   @Override
   public boolean a(cjk $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return null;
   }

   @Nullable
   @Override
   public awo u() {
      return a(this.dV(), this.dV().A);
   }

   public static awo a(djx $$0, azx $$1) {
      if ($$0.an() != buo.a && $$1.a(1000) == 0) {
         List<bxc<?>> $$2 = Lists.newArrayList(bS.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awp.ts;
      }
   }

   private static awo b(bxc<?> $$0) {
      return bS.getOrDefault($$0, awp.ts);
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.tw;
   }

   @Override
   protected awo l_() {
      return awp.tt;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.uh, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Y > this.bU;
   }

   @Override
   protected void aY() {
      this.a(awp.tv, 0.15F, 1.0F);
      this.bU = this.Y + this.bN / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(azx $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awq dm() {
      return awq.g;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   protected void D(bwt $$0) {
      if (!($$0 instanceof crx)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cke.b gI() {
      return cke.b.a(this.al.a(bQ));
   }

   private void a(cke.b $$0) {
      this.al.a(bQ, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aB ? c((kj<T>)$$0, this.gI()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aB);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aB) {
         this.a(c(kk.aB, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bQ, cke.b.f.k);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", cke.b.h, this.gI());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cke.b>a("Variant", cke.b.h).orElse(cke.b.f));
   }

   @Override
   public boolean gJ() {
      return !this.aH();
   }

   @Override
   protected boolean gy() {
      return true;
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cgc {
      public a(byc $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ffq h() {
         ffq $$0 = null;
         if (this.b.bi()) {
            $$0 = ciq.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ffq k() {
         iv $$0 = this.b.dv();
         iv.a $$1 = new iv.a();
         iv.a $$2 = new iv.a();

         for (iv $$4 : iv.b(
            azo.a(this.b.dA() - 3.0),
            azo.a(this.b.dC() - 6.0),
            azo.a(this.b.dG() - 3.0),
            azo.a(this.b.dA() + 3.0),
            azo.a(this.b.dC() + 6.0),
            azo.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               ebe $$5 = this.b.dV().a_($$2.a($$4, jb.a));
               boolean $$6 = $$5.b() instanceof drs || $$5.a(axe.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, jb.b))) {
                  return ffq.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bam {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final cke.b f = a;
      private static final IntFunction<cke.b> j = aye.a(cke.b::a, values(), aye.a.c);
      public static final Codec<cke.b> g = bam.a(cke.b::values);
      @Deprecated
      public static final Codec<cke.b> h = Codec.INT.xmap(j::apply, cke.b::a);
      public static final yy<ByteBuf, cke.b> i = yw.a(j, cke.b::a);
      final int k;
      private final String l;

      private b(final int $$0, final String $$1) {
         this.k = $$0;
         this.l = $$1;
      }

      public int a() {
         return this.k;
      }

      public static cke.b a(int $$0) {
         return j.apply($$0);
      }

      @Override
      public String c() {
         return this.l;
      }
   }
}
