import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chm extends cht implements bwf<chm.b>, chf {
   private static final ajx<Integer> cg = akb.a(chm.class, ajz.b);
   private static final Predicate<bvh> ch = new Predicate<bvh>() {
      public boolean a(@Nullable bvh $$0) {
         return $$0 != null && chm.ci.containsKey($$0.aq());
      }
   };
   static final Map<buq<?>, avy> ci = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(buq.o, avz.tj);
      $$0.put(buq.q, avz.tk);
      $$0.put(buq.r, avz.tl);
      $$0.put(buq.v, avz.tI);
      $$0.put(buq.D, avz.tm);
      $$0.put(buq.E, avz.tn);
      $$0.put(buq.K, avz.to);
      $$0.put(buq.M, avz.tp);
      $$0.put(buq.P, avz.tq);
      $$0.put(buq.O, avz.tr);
      $$0.put(buq.S, avz.ts);
      $$0.put(buq.ad, avz.tt);
      $$0.put(buq.ai, avz.tu);
      $$0.put(buq.aj, avz.tv);
      $$0.put(buq.am, avz.tw);
      $$0.put(buq.an, avz.tx);
      $$0.put(buq.az, avz.ty);
      $$0.put(buq.aP, avz.tz);
      $$0.put(buq.aR, avz.tA);
      $$0.put(buq.aS, avz.tB);
      $$0.put(buq.aT, avz.tC);
      $$0.put(buq.aY, avz.tD);
      $$0.put(buq.bb, avz.tE);
      $$0.put(buq.bd, avz.tF);
      $$0.put(buq.be, avz.tG);
      $$0.put(buq.bg, avz.tH);
      $$0.put(buq.bn, avz.tI);
      $$0.put(buq.br, avz.tJ);
      $$0.put(buq.bB, avz.tK);
      $$0.put(buq.bD, avz.tL);
      $$0.put(buq.bF, avz.tM);
      $$0.put(buq.bH, avz.tN);
      $$0.put(buq.bI, avz.tO);
      $$0.put(buq.bJ, avz.tP);
      $$0.put(buq.bM, avz.tQ);
      $$0.put(buq.bN, avz.tR);
      $$0.put(buq.bP, avz.tS);
   });
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private ji cm;

   public chm(buq<? extends chm> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cbd(this, 10, false);
      this.a(eto.n, -1.0F);
      this.a(eto.o, -1.0F);
      this.a(eto.x, -1.0F);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.a(af.a(chm.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bua.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bS.a(0, new bwc.a(1.25));
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new ccl(this, cov.class, 8.0F));
      this.bS.a(2, new cdi(this));
      this.bS.a(2, new ccb(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chm.a(this, 1.0));
      this.bS.a(3, new cci(this));
      this.bS.a(3, new cca(this, 1.0, 3.0F, 7.0F));
   }

   public static bwm.a gB() {
      return cgw.gu().a(bwn.s, 6.0).a(bwn.l, 0.4F).a(bwn.v, 0.2F).a(bwn.c, 3.0);
   }

   @Override
   protected cer b(dgg $$0) {
      cep $$1 = new cep(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cm == null || !this.cm.a(this.du(), 3.46) || !this.dW().a_(this.cm).a(djm.eg)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dW().A.a(400) == 0) {
         a(this.dW(), this);
      }

      super.d_();
      this.gG();
   }

   @Override
   public void a(ji $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gC() {
      return this.cl;
   }

   private void gG() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.cd = ayy.a(this.cd, 0.0F, 1.0F);
      if (!this.aJ() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      fay $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dgg $$0, buj $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvh> $$2 = $$0.a(bvh.class, $$1.cR().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvh $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               avy $$4 = b($$3.aq());
               $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), $$4, $$1.dn(), 0.7F, a($$0.A));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(awx.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.tg, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dW().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dW().a(this, (byte)7);
            } else {
               this.dW().a(this, (byte)6);
            }
         }

         return bsi.a;
      } else if (!$$2.a(awx.aB)) {
         if (!this.gE() && this.p() && this.j($$0)) {
            if (!this.dW().C) {
               this.z(!this.gp());
            }

            return bsi.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bto(btq.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dX().a($$0), Float.MAX_VALUE);
         }

         return bsi.a;
      }
   }

   @Override
   public boolean j(cwn $$0) {
      return false;
   }

   public static boolean c(buq<chm> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwv $$2, ji $$3) {
   }

   @Override
   public boolean a(cgw $$0) {
      return false;
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return null;
   }

   @Nullable
   @Override
   public avy u() {
      return a(this.dW(), this.dW().A);
   }

   public static avy a(dgg $$0, azg $$1) {
      if ($$0.am() != bsf.a && $$1.a(1000) == 0) {
         List<buq<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return avz.te;
      }
   }

   private static avy b(buq<?> $$0) {
      return ci.getOrDefault($$0, avz.te);
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.ti;
   }

   @Override
   protected avy o_() {
      return avz.tf;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.tT, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ck;
   }

   @Override
   protected void aZ() {
      this.a(avz.th, 0.15F, 1.0F);
      this.ck = this.Y + this.cd / 2.0F;
   }

   @Override
   public float fh() {
      return a(this.ae);
   }

   public static float a(azg $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awa dn() {
      return awa.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(buj $$0) {
      if (!($$0 instanceof cov)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public chm.b gD() {
      return chm.b.a(this.al.a(cg));
   }

   public void a(chm.b $$0) {
      this.al.a(cg, $$0.h);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD().h);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chm.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gE() {
      return !this.aJ();
   }

   @Override
   protected boolean gt() {
      return true;
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a extends cdp {
      public a(bvn $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fay h() {
         fay $$0 = null;
         if (this.b.bj()) {
            $$0 = cgd.a(this.b, 15, 15);
         }

         if (this.b.dZ().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fay k() {
         ji $$0 = this.b.dw();
         ji.a $$1 = new ji.a();
         ji.a $$2 = new ji.a();

         for (ji $$4 : ji.b(
            ayy.a(this.b.dB() - 3.0),
            ayy.a(this.b.dD() - 6.0),
            ayy.a(this.b.dH() - 3.0),
            ayy.a(this.b.dB() + 3.0),
            ayy.a(this.b.dD() + 6.0),
            ayy.a(this.b.dH() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dwv $$5 = this.b.dW().a_($$2.a($$4, jn.a));
               boolean $$6 = $$5.b() instanceof dnw || $$5.a(awo.u);
               if ($$6 && this.b.dW().u($$4) && this.b.dW().u($$1.a($$4, jn.b))) {
                  return fay.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements azu {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<chm.b> f = azu.a(chm.b::values);
      private static final IntFunction<chm.b> g = axp.a(chm.b::a, values(), axp.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chm.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
