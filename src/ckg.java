import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckg extends cko implements cka {
   private static final akn<Integer> bQ = akr.a(ckg.class, akp.b);
   private static final Predicate<bxy> bR = new Predicate<bxy>() {
      public boolean a(@Nullable bxy $$0) {
         return $$0 != null && ckg.bS.containsKey($$0.an());
      }
   };
   static final Map<bxe<?>, awq> bS = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bxe.p, awr.tx);
      $$0.put(bxe.r, awr.ty);
      $$0.put(bxe.s, awr.tz);
      $$0.put(bxe.w, awr.tW);
      $$0.put(bxe.E, awr.tA);
      $$0.put(bxe.F, awr.tB);
      $$0.put(bxe.L, awr.tC);
      $$0.put(bxe.N, awr.tD);
      $$0.put(bxe.Q, awr.tE);
      $$0.put(bxe.P, awr.tF);
      $$0.put(bxe.T, awr.tG);
      $$0.put(bxe.ae, awr.tH);
      $$0.put(bxe.aj, awr.tI);
      $$0.put(bxe.ak, awr.tJ);
      $$0.put(bxe.an, awr.tK);
      $$0.put(bxe.ao, awr.tL);
      $$0.put(bxe.aA, awr.tM);
      $$0.put(bxe.aQ, awr.tN);
      $$0.put(bxe.aS, awr.tO);
      $$0.put(bxe.aT, awr.tP);
      $$0.put(bxe.aU, awr.tQ);
      $$0.put(bxe.ba, awr.tR);
      $$0.put(bxe.bd, awr.tS);
      $$0.put(bxe.bf, awr.tT);
      $$0.put(bxe.bg, awr.tU);
      $$0.put(bxe.bi, awr.tV);
      $$0.put(bxe.bp, awr.tW);
      $$0.put(bxe.bt, awr.tX);
      $$0.put(bxe.bD, awr.tY);
      $$0.put(bxe.bF, awr.tZ);
      $$0.put(bxe.bH, awr.ua);
      $$0.put(bxe.bJ, awr.ub);
      $$0.put(bxe.bK, awr.uc);
      $$0.put(bxe.bL, awr.ud);
      $$0.put(bxe.bO, awr.ue);
      $$0.put(bxe.bP, awr.uf);
      $$0.put(bxe.bR, awr.ug);
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

   public ckg(bxe<? extends ckg> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cds(this, 10, false);
      this.a(eyh.n, -1.0F);
      this.a(eyh.o, -1.0F);
      this.a(eyh.x, -1.0F);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.a(ag.a(ckg.b.values(), $$0.G_()));
      if ($$3 == null) {
         $$3 = new bwl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bF.a(0, new bys.a(1.25));
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfa(this, crz.class, 8.0F));
      this.bF.a(2, new cfx(this));
      this.bF.a(2, new ceq(this, 1.0, 5.0F, 1.0F));
      this.bF.a(2, new ckg.a(this, 1.0));
      this.bF.a(3, new cex(this));
      this.bF.a(3, new cep(this, 1.0, 3.0F, 7.0F));
   }

   public static bzb.a gG() {
      return cjm.gz().a(bzc.s, 6.0).a(bzc.l, 0.4F).a(bzc.v, 0.2F).a(bzc.c, 3.0);
   }

   @Override
   protected chg b(djz $$0) {
      che $$1 = new che(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bW == null || !this.bW.a(this.dt(), 3.46) || !this.dV().a_(this.bW).a(dng.ek)) {
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
      this.bN = azq.a(this.bN, 0.0F, 1.0F);
      if (!this.aH() && this.bT < 1.0F) {
         this.bT = 1.0F;
      }

      this.bT *= 0.9F;
      ffs $$0 = this.dy();
      if (!this.aH() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bM = this.bM + this.bT * 2.0F;
   }

   public static boolean a(djz $$0, bwv $$1) {
      if ($$1.bJ() && !$$1.ba() && $$0.A.a(2) == 0) {
         List<bxy> $$2 = $$0.a(bxy.class, $$1.cR().g(20.0), bR);
         if (!$$2.isEmpty()) {
            bxy $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.ba()) {
               awq $$4 = b($$3.an());
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
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axo.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.ba()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.tu, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return but.a;
      } else if (!$$2.a(axo.aD)) {
         if (!this.gJ() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gu());
            }

            return but.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bvz(bwb.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return but.a;
      }
   }

   @Override
   public boolean i(daa $$0) {
      return false;
   }

   public static boolean c(bxe<ckg> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cf) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
   }

   @Override
   public boolean a(cjm $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return null;
   }

   @Nullable
   @Override
   public awq u() {
      return a(this.dV(), this.dV().A);
   }

   public static awq a(djz $$0, azz $$1) {
      if ($$0.an() != buq.a && $$1.a(1000) == 0) {
         List<bxe<?>> $$2 = Lists.newArrayList(bS.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awr.ts;
      }
   }

   private static awq b(bxe<?> $$0) {
      return bS.getOrDefault($$0, awr.ts);
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.tw;
   }

   @Override
   protected awq l_() {
      return awr.tt;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.uh, 0.15F, 1.0F);
   }

   @Override
   protected boolean aZ() {
      return this.Y > this.bU;
   }

   @Override
   protected void aY() {
      this.a(awr.tv, 0.15F, 1.0F);
      this.bU = this.Y + this.bN / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(azz $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aws dm() {
      return aws.g;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   protected void D(bwv $$0) {
      if (!($$0 instanceof crz)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public ckg.b gI() {
      return ckg.b.a(this.al.a(bQ));
   }

   private void a(ckg.b $$0) {
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
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bQ, ckg.b.f.k);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", ckg.b.h, this.gI());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckg.b>a("Variant", ckg.b.h).orElse(ckg.b.f));
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
   public ffs cT() {
      return new ffs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cge {
      public a(bye $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ffs h() {
         ffs $$0 = null;
         if (this.b.bi()) {
            $$0 = cis.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ffs k() {
         iw $$0 = this.b.dv();
         iw.a $$1 = new iw.a();
         iw.a $$2 = new iw.a();

         for (iw $$4 : iw.b(
            azq.a(this.b.dA() - 3.0),
            azq.a(this.b.dC() - 6.0),
            azq.a(this.b.dG() - 3.0),
            azq.a(this.b.dA() + 3.0),
            azq.a(this.b.dC() + 6.0),
            azq.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               ebg $$5 = this.b.dV().a_($$2.a($$4, jc.a));
               boolean $$6 = $$5.b() instanceof dru || $$5.a(axg.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, jc.b))) {
                  return ffs.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bao {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final ckg.b f = a;
      private static final IntFunction<ckg.b> j = ayg.a(ckg.b::a, values(), ayg.a.c);
      public static final Codec<ckg.b> g = bao.a(ckg.b::values);
      @Deprecated
      public static final Codec<ckg.b> h = Codec.INT.xmap(j::apply, ckg.b::a);
      public static final za<ByteBuf, ckg.b> i = yy.a(j, ckg.b::a);
      final int k;
      private final String l;

      private b(final int $$0, final String $$1) {
         this.k = $$0;
         this.l = $$1;
      }

      public int a() {
         return this.k;
      }

      public static ckg.b a(int $$0) {
         return j.apply($$0);
      }

      @Override
      public String c() {
         return this.l;
      }
   }
}
