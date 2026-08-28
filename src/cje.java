import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cje extends cjn implements ciy {
   private static final akh<Integer> bN = akl.a(cje.class, akj.b);
   private static final Predicate<bxb> bO = new Predicate<bxb>() {
      public boolean a(@Nullable bxb $$0) {
         return $$0 != null && cje.bP.containsKey($$0.aq());
      }
   };
   static final Map<bwj<?>, awk> bP = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bwj.o, awl.tt);
      $$0.put(bwj.q, awl.tu);
      $$0.put(bwj.r, awl.tv);
      $$0.put(bwj.v, awl.tS);
      $$0.put(bwj.D, awl.tw);
      $$0.put(bwj.E, awl.tx);
      $$0.put(bwj.K, awl.ty);
      $$0.put(bwj.M, awl.tz);
      $$0.put(bwj.P, awl.tA);
      $$0.put(bwj.O, awl.tB);
      $$0.put(bwj.S, awl.tC);
      $$0.put(bwj.ad, awl.tD);
      $$0.put(bwj.ai, awl.tE);
      $$0.put(bwj.aj, awl.tF);
      $$0.put(bwj.am, awl.tG);
      $$0.put(bwj.an, awl.tH);
      $$0.put(bwj.az, awl.tI);
      $$0.put(bwj.aP, awl.tJ);
      $$0.put(bwj.aR, awl.tK);
      $$0.put(bwj.aS, awl.tL);
      $$0.put(bwj.aT, awl.tM);
      $$0.put(bwj.aZ, awl.tN);
      $$0.put(bwj.bc, awl.tO);
      $$0.put(bwj.be, awl.tP);
      $$0.put(bwj.bf, awl.tQ);
      $$0.put(bwj.bh, awl.tR);
      $$0.put(bwj.bo, awl.tS);
      $$0.put(bwj.bs, awl.tT);
      $$0.put(bwj.bC, awl.tU);
      $$0.put(bwj.bE, awl.tV);
      $$0.put(bwj.bG, awl.tW);
      $$0.put(bwj.bI, awl.tX);
      $$0.put(bwj.bJ, awl.tY);
      $$0.put(bwj.bK, awl.tZ);
      $$0.put(bwj.bN, awl.ua);
      $$0.put(bwj.bO, awl.ub);
      $$0.put(bwj.bQ, awl.uc);
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

   public cje(bwj<? extends cje> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new ccv(this, 10, false);
      this.a(ewm.n, -1.0F);
      this.a(ewm.o, -1.0F);
      this.a(ewm.x, -1.0F);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.a(af.a(cje.b.values(), $$0.C_()));
      if ($$3 == null) {
         $$3 = new bvq.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void D() {
      this.bC.a(0, new bxv.a(1.25));
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new ced(this, cqs.class, 8.0F));
      this.bC.a(2, new cfa(this));
      this.bC.a(2, new cdt(this, 1.0, 5.0F, 1.0F));
      this.bC.a(2, new cje.a(this, 1.0));
      this.bC.a(3, new cea(this));
      this.bC.a(3, new cds(this, 1.0, 3.0F, 7.0F));
   }

   public static bye.a gC() {
      return cio.gv().a(byf.s, 6.0).a(byf.l, 0.4F).a(byf.v, 0.2F).a(byf.c, 3.0);
   }

   @Override
   protected cgj b(dip $$0) {
      cgh $$1 = new cgh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void k_() {
      if (this.bT == null || !this.bT.a(this.dt(), 3.46) || !this.dV().a_(this.bT).a(dlw.eg)) {
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
      this.bK = azk.a(this.bK, 0.0F, 1.0F);
      if (!this.aJ() && this.bQ < 1.0F) {
         this.bQ = 1.0F;
      }

      this.bQ *= 0.9F;
      fdw $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bJ = this.bJ + this.bQ * 2.0F;
   }

   public static boolean a(dip $$0, bwa $$1) {
      if ($$1.bK() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bxb> $$2 = $$0.a(bxb.class, $$1.cR().g(20.0), bO);
         if (!$$2.isEmpty()) {
            bxb $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               awk $$4 = b($$3.aq());
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
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if (!this.q() && $$2.a(axi.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.tq, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bty.a;
      } else if (!$$2.a(axi.aB)) {
         if (!this.gF() && this.q() && this.j($$0)) {
            if (!this.dV().C) {
               this.y(!this.gq());
            }

            return bty.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bve(bvg.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bty.a;
      }
   }

   @Override
   public boolean k(cys $$0) {
      return false;
   }

   public static boolean c(bwj<cje> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.ce) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dzo $$2, iu $$3) {
   }

   @Override
   public boolean a(cio $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return null;
   }

   @Nullable
   @Override
   public awk u() {
      return a(this.dV(), this.dV().A);
   }

   public static awk a(dip $$0, azt $$1) {
      if ($$0.an() != btv.a && $$1.a(1000) == 0) {
         List<bwj<?>> $$2 = Lists.newArrayList(bP.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awl.to;
      }
   }

   private static awk b(bwj<?> $$0) {
      return bP.getOrDefault($$0, awl.to);
   }

   @Override
   protected awk e(bup $$0) {
      return awl.ts;
   }

   @Override
   protected awk l_() {
      return awl.tp;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.ud, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bR;
   }

   @Override
   protected void aZ() {
      this.a(awl.tr, 0.15F, 1.0F);
      this.bR = this.Y + this.bK / 2.0F;
   }

   @Override
   public float fe() {
      return a(this.ae);
   }

   public static float a(azt $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awm dm() {
      return awm.g;
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   protected void D(bwa $$0) {
      if (!($$0 instanceof cqs)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.y(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cje.b gE() {
      return cje.b.a(this.al.a(bN));
   }

   private void a(cje.b $$0) {
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
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gE().i);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cje.b.a($$0.h("Variant")));
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
   public fdw cT() {
      return new fdw(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cfh {
      public a(bxh $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fdw h() {
         fdw $$0 = null;
         if (this.b.bj()) {
            $$0 = chv.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fdw k() {
         iu $$0 = this.b.dv();
         iu.a $$1 = new iu.a();
         iu.a $$2 = new iu.a();

         for (iu $$4 : iu.b(
            azk.a(this.b.dA() - 3.0),
            azk.a(this.b.dC() - 6.0),
            azk.a(this.b.dG() - 3.0),
            azk.a(this.b.dA() + 3.0),
            azk.a(this.b.dC() + 6.0),
            azk.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dzo $$5 = this.b.dV().a_($$2.a($$4, ja.a));
               boolean $$6 = $$5.b() instanceof dqi || $$5.a(axa.u);
               if ($$6 && this.b.dV().v($$4) && this.b.dV().v($$1.a($$4, ja.b))) {
                  return fdw.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bai {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cje.b> f = bai.a(cje.b::values);
      private static final IntFunction<cje.b> h = aya.a(cje.b::a, values(), aya.a.c);
      public static final yu<ByteBuf, cje.b> g = ys.a(h, cje.b::a);
      final int i;
      private final String j;

      private b(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public int a() {
         return this.i;
      }

      public static cje.b a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
