import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckp extends ckx implements ckj {
   private static final aku<Integer> bQ = aky.a(ckp.class, akw.b);
   private static final Predicate<byh> bR = new Predicate<byh>() {
      public boolean a(@Nullable byh $$0) {
         return $$0 != null && ckp.bS.containsKey($$0.an());
      }
   };
   static final Map<bxn<?>, awx> bS = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxn.p, awy.tx);
      $$0.put(bxn.r, awy.ty);
      $$0.put(bxn.s, awy.tz);
      $$0.put(bxn.w, awy.tW);
      $$0.put(bxn.E, awy.tA);
      $$0.put(bxn.F, awy.tB);
      $$0.put(bxn.L, awy.tC);
      $$0.put(bxn.N, awy.tD);
      $$0.put(bxn.Q, awy.tE);
      $$0.put(bxn.P, awy.tF);
      $$0.put(bxn.T, awy.tG);
      $$0.put(bxn.ae, awy.tH);
      $$0.put(bxn.aj, awy.tI);
      $$0.put(bxn.ak, awy.tJ);
      $$0.put(bxn.an, awy.tK);
      $$0.put(bxn.ao, awy.tL);
      $$0.put(bxn.aA, awy.tM);
      $$0.put(bxn.aQ, awy.tN);
      $$0.put(bxn.aS, awy.tO);
      $$0.put(bxn.aT, awy.tP);
      $$0.put(bxn.aU, awy.tQ);
      $$0.put(bxn.ba, awy.tR);
      $$0.put(bxn.bd, awy.tS);
      $$0.put(bxn.bf, awy.tT);
      $$0.put(bxn.bg, awy.tU);
      $$0.put(bxn.bi, awy.tV);
      $$0.put(bxn.bp, awy.tW);
      $$0.put(bxn.bt, awy.tX);
      $$0.put(bxn.bD, awy.tY);
      $$0.put(bxn.bF, awy.tZ);
      $$0.put(bxn.bH, awy.ua);
      $$0.put(bxn.bJ, awy.ub);
      $$0.put(bxn.bK, awy.uc);
      $$0.put(bxn.bL, awy.ud);
      $$0.put(bxn.bO, awy.ue);
      $$0.put(bxn.bP, awy.uf);
      $$0.put(bxn.bR, awy.ug);
   });
   public float bM;
   public float bN;
   public float bO;
   public float bP;
   private float bT = 1.0F;
   private float bU = 1.0F;
   private boolean bV;
   @Nullable
   private iw bW;

   public ckp(bxn<? extends ckp> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceb(this, 10, false);
      this.a(eyr.n, -1.0F);
      this.a(eyr.o, -1.0F);
      this.a(eyr.x, -1.0F);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.a(ag.a(ckp.b.values(), $$0.G_()));
      if ($$3 == null) {
         $$3 = new bwu.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bF.a(0, new bzb.a(1.25));
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cfj(this, csi.class, 8.0F));
      this.bF.a(2, new cgg(this));
      this.bF.a(2, new cez(this, 1.0, 5.0F, 1.0F));
      this.bF.a(2, new ckp.a(this, 1.0));
      this.bF.a(3, new cfg(this));
      this.bF.a(3, new cey(this, 1.0, 3.0F, 7.0F));
   }

   public static bzk.a gG() {
      return cjv.gz().a(bzl.s, 6.0).a(bzl.l, 0.4F).a(bzl.v, 0.2F).a(bzl.c, 3.0);
   }

   @Override
   protected chp b(dkj $$0) {
      chn $$1 = new chn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bW == null || !this.bW.a(this.dt(), 3.46) || !this.dV().a_(this.bW).a(dnq.ek)) {
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
   public void a(iw $$0, boolean $$1) {
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
      this.bN = azz.a(this.bN, 0.0F, 1.0F);
      if (!this.aH() && this.bT < 1.0F) {
         this.bT = 1.0F;
      }

      this.bT *= 0.9F;
      fgc $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bM = this.bM + this.bT * 2.0F;
   }

   public static boolean a(dkj $$0, bxe $$1) {
      if ($$1.bJ() && !$$1.ba() && $$0.A.a(2) == 0) {
         List<byh> $$2 = $$0.a(byh.class, $$1.cR().g(20.0), bR);
         if (!$$2.isEmpty()) {
            byh $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.ba()) {
               awx $$4 = b($$3.an());
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
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axv.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.tu, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bvc.a;
      } else if (!$$2.a(axv.aD)) {
         if (!this.gJ() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gu());
            }

            return bvc.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bwi(bwk.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bvc.a;
      }
   }

   @Override
   public boolean i(dak $$0) {
      return false;
   }

   public static boolean c(bxn<ckp> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cf) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
   }

   @Override
   public boolean a(cjv $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return null;
   }

   @Nullable
   @Override
   public awx u() {
      return a(this.dV(), this.dV().A);
   }

   public static awx a(dkj $$0, bai $$1) {
      if ($$0.an() != buz.a && $$1.a(1000) == 0) {
         List<bxn<?>> $$2 = Lists.newArrayList(bS.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awy.ts;
      }
   }

   private static awx b(bxn<?> $$0) {
      return bS.getOrDefault($$0, awy.ts);
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.tw;
   }

   @Override
   protected awx l_() {
      return awy.tt;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.uh, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Y > this.bU;
   }

   @Override
   protected void aY() {
      this.a(awy.tv, 0.15F, 1.0F);
      this.bU = this.Y + this.bN / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(bai $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awz dm() {
      return awz.g;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   protected void D(bxe $$0) {
      if (!($$0 instanceof csi)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public ckp.b gI() {
      return ckp.b.a(this.al.a(bQ));
   }

   private void a(ckp.b $$0) {
      this.al.a(bQ, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aB ? c((kk<T>)$$0, this.gI()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aB);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aB) {
         this.a(c(kl.aB, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bQ, ckp.b.f.k);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", ckp.b.h, this.gI());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckp.b>a("Variant", ckp.b.h).orElse(ckp.b.f));
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
   public fgc cT() {
      return new fgc(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cgn {
      public a(byn $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fgc h() {
         fgc $$0 = null;
         if (this.b.bi()) {
            $$0 = cjb.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fgc k() {
         iw $$0 = this.b.dv();
         iw.a $$1 = new iw.a();
         iw.a $$2 = new iw.a();

         for (iw $$4 : iw.b(
            azz.a(this.b.dA() - 3.0),
            azz.a(this.b.dC() - 6.0),
            azz.a(this.b.dG() - 3.0),
            azz.a(this.b.dA() + 3.0),
            azz.a(this.b.dC() + 6.0),
            azz.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               ebq $$5 = this.b.dV().a_($$2.a($$4, jc.a));
               boolean $$6 = $$5.b() instanceof dse || $$5.a(axn.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, jc.b))) {
                  return fgc.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bax {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final ckp.b f = a;
      private static final IntFunction<ckp.b> j = ayo.a(ckp.b::a, values(), ayo.a.c);
      public static final Codec<ckp.b> g = bax.a(ckp.b::values);
      @Deprecated
      public static final Codec<ckp.b> h = Codec.INT.xmap(j::apply, ckp.b::a);
      public static final ze<ByteBuf, ckp.b> i = zc.a(j, ckp.b::a);
      final int k;
      private final String l;

      private b(final int $$0, final String $$1) {
         this.k = $$0;
         this.l = $$1;
      }

      public int a() {
         return this.k;
      }

      public static ckp.b a(int $$0) {
         return j.apply($$0);
      }

      @Override
      public String c() {
         return this.l;
      }
   }
}
