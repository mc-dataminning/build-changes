import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciw extends cjf implements cip {
   private static final akg<Integer> bM = akk.a(ciw.class, aki.b);
   private static final Predicate<bwt> bN = new Predicate<bwt>() {
      public boolean a(@Nullable bwt $$0) {
         return $$0 != null && ciw.bO.containsKey($$0.aq());
      }
   };
   static final Map<bwb<?>, awj> bO = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwb.o, awk.tt);
      $$0.put(bwb.q, awk.tu);
      $$0.put(bwb.r, awk.tv);
      $$0.put(bwb.v, awk.tS);
      $$0.put(bwb.D, awk.tw);
      $$0.put(bwb.E, awk.tx);
      $$0.put(bwb.K, awk.ty);
      $$0.put(bwb.M, awk.tz);
      $$0.put(bwb.P, awk.tA);
      $$0.put(bwb.O, awk.tB);
      $$0.put(bwb.S, awk.tC);
      $$0.put(bwb.ad, awk.tD);
      $$0.put(bwb.ai, awk.tE);
      $$0.put(bwb.aj, awk.tF);
      $$0.put(bwb.am, awk.tG);
      $$0.put(bwb.an, awk.tH);
      $$0.put(bwb.az, awk.tI);
      $$0.put(bwb.aP, awk.tJ);
      $$0.put(bwb.aR, awk.tK);
      $$0.put(bwb.aS, awk.tL);
      $$0.put(bwb.aT, awk.tM);
      $$0.put(bwb.aY, awk.tN);
      $$0.put(bwb.bb, awk.tO);
      $$0.put(bwb.bd, awk.tP);
      $$0.put(bwb.be, awk.tQ);
      $$0.put(bwb.bg, awk.tR);
      $$0.put(bwb.bn, awk.tS);
      $$0.put(bwb.br, awk.tT);
      $$0.put(bwb.bB, awk.tU);
      $$0.put(bwb.bD, awk.tV);
      $$0.put(bwb.bF, awk.tW);
      $$0.put(bwb.bH, awk.tX);
      $$0.put(bwb.bI, awk.tY);
      $$0.put(bwb.bJ, awk.tZ);
      $$0.put(bwb.bM, awk.ua);
      $$0.put(bwb.bN, awk.ub);
      $$0.put(bwb.bP, awk.uc);
   });
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   private float bP = 1.0F;
   private float bQ = 1.0F;
   private boolean bR;
   @Nullable
   private jj bS;

   public ciw(bwb<? extends ciw> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccn(this, 10, false);
      this.a(evk.n, -1.0F);
      this.a(evk.o, -1.0F);
      this.a(evk.x, -1.0F);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.a(af.a(ciw.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bvi.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bB.a(0, new bxn.a(1.25));
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cdv(this, cqi.class, 8.0F));
      this.bB.a(2, new ces(this));
      this.bB.a(2, new cdl(this, 1.0, 5.0F, 1.0F));
      this.bB.a(2, new ciw.a(this, 1.0));
      this.bB.a(3, new cds(this));
      this.bB.a(3, new cdk(this, 1.0, 3.0F, 7.0F));
   }

   public static bxw.a gC() {
      return cig.gv().a(bxx.s, 6.0).a(bxx.l, 0.4F).a(bxx.v, 0.2F).a(bxx.c, 3.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      cfz $$1 = new cfz(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bS == null || !this.bS.a(this.dt(), 3.46) || !this.dV().a_(this.bS).a(dkw.eg)) {
         this.bR = false;
         this.bS = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.k_();
      this.gH();
   }

   @Override
   public void a(jj $$0, boolean $$1) {
      this.bS = $$0;
      this.bR = $$1;
   }

   public boolean gD() {
      return this.bR;
   }

   private void gH() {
      this.bL = this.bI;
      this.bK = this.bJ;
      this.bJ = this.bJ + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.bJ = azk.a(this.bJ, 0.0F, 1.0F);
      if (!this.aJ() && this.bP < 1.0F) {
         this.bP = 1.0F;
      }

      this.bP *= 0.9F;
      fcu $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bI = this.bI + this.bP * 2.0F;
   }

   public static boolean a(dhp $$0, bvs $$1) {
      if ($$1.bK() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bwt> $$2 = $$0.a(bwt.class, $$1.cR().g(20.0), bN);
         if (!$$2.isEmpty()) {
            bwt $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               awj $$4 = b($$3.aq());
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
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axi.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.tq, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return btq.a;
      } else if (!$$2.a(axi.aB)) {
         if (!this.gF() && this.q() && this.k($$0)) {
            if (!this.dV().C) {
               this.y(!this.gq());
            }

            return btq.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new buw(buy.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return btq.a;
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return false;
   }

   public static boolean c(bwb<ciw> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.ce) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
   }

   @Override
   public boolean a(cig $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      return null;
   }

   @Nullable
   @Override
   public awj u() {
      return a(this.dV(), this.dV().A);
   }

   public static awj a(dhp $$0, azs $$1) {
      if ($$0.an() != btn.a && $$1.a(1000) == 0) {
         List<bwb<?>> $$2 = Lists.newArrayList(bO.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awk.to;
      }
   }

   private static awj b(bwb<?> $$0) {
      return bO.getOrDefault($$0, awk.to);
   }

   @Override
   protected awj e(buh $$0) {
      return awk.ts;
   }

   @Override
   protected awj l_() {
      return awk.tp;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.ud, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bQ;
   }

   @Override
   protected void aZ() {
      this.a(awk.tr, 0.15F, 1.0F);
      this.bQ = this.Y + this.bJ / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.ae);
   }

   public static float a(azs $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awl dm() {
      return awl.g;
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   protected void D(bvs $$0) {
      if (!($$0 instanceof cqi)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public ciw.b gE() {
      return ciw.b.a(this.al.a(bM));
   }

   private void a(ciw.b $$0) {
      this.al.a(bM, $$0.i);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.ax ? b((kw<T>)$$0, this.gE()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.ax);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.ax) {
         this.a(b(kx.ax, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bM, 0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gE().i);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(ciw.b.a($$0.h("Variant")));
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
   public fcu cT() {
      return new fcu(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cez {
      public a(bwz $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fcu h() {
         fcu $$0 = null;
         if (this.b.bj()) {
            $$0 = chn.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fcu k() {
         jj $$0 = this.b.dv();
         jj.a $$1 = new jj.a();
         jj.a $$2 = new jj.a();

         for (jj $$4 : jj.b(
            azk.a(this.b.dA() - 3.0),
            azk.a(this.b.dC() - 6.0),
            azk.a(this.b.dG() - 3.0),
            azk.a(this.b.dA() + 3.0),
            azk.a(this.b.dC() + 6.0),
            azk.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dym $$5 = this.b.dV().a_($$2.a($$4, jo.a));
               boolean $$6 = $$5.b() instanceof dpi || $$5.a(awz.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jo.b))) {
                  return fcu.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bag {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<ciw.b> f = bag.a(ciw.b::values);
      private static final IntFunction<ciw.b> h = aya.a(ciw.b::a, values(), aya.a.c);
      public static final yt<ByteBuf, ciw.b> g = yr.a(h, ciw.b::a);
      final int i;
      private final String j;

      private b(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public int a() {
         return this.i;
      }

      public static ciw.b a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
