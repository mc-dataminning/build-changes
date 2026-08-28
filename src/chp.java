import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chp extends chw implements bwi<chp.b>, chi {
   private static final ajy<Integer> cg = akc.a(chp.class, aka.b);
   private static final Predicate<bvk> ch = new Predicate<bvk>() {
      public boolean a(@Nullable bvk $$0) {
         return $$0 != null && chp.ci.containsKey($$0.aq());
      }
   };
   static final Map<but<?>, avz> ci = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(but.o, awa.tj);
      $$0.put(but.q, awa.tk);
      $$0.put(but.r, awa.tl);
      $$0.put(but.v, awa.tI);
      $$0.put(but.D, awa.tm);
      $$0.put(but.E, awa.tn);
      $$0.put(but.K, awa.to);
      $$0.put(but.M, awa.tp);
      $$0.put(but.P, awa.tq);
      $$0.put(but.O, awa.tr);
      $$0.put(but.S, awa.ts);
      $$0.put(but.ad, awa.tt);
      $$0.put(but.ai, awa.tu);
      $$0.put(but.aj, awa.tv);
      $$0.put(but.am, awa.tw);
      $$0.put(but.an, awa.tx);
      $$0.put(but.az, awa.ty);
      $$0.put(but.aP, awa.tz);
      $$0.put(but.aR, awa.tA);
      $$0.put(but.aS, awa.tB);
      $$0.put(but.aT, awa.tC);
      $$0.put(but.aY, awa.tD);
      $$0.put(but.bb, awa.tE);
      $$0.put(but.bd, awa.tF);
      $$0.put(but.be, awa.tG);
      $$0.put(but.bg, awa.tH);
      $$0.put(but.bn, awa.tI);
      $$0.put(but.br, awa.tJ);
      $$0.put(but.bB, awa.tK);
      $$0.put(but.bD, awa.tL);
      $$0.put(but.bF, awa.tM);
      $$0.put(but.bH, awa.tN);
      $$0.put(but.bI, awa.tO);
      $$0.put(but.bJ, awa.tP);
      $$0.put(but.bM, awa.tQ);
      $$0.put(but.bN, awa.tR);
      $$0.put(but.bP, awa.tS);
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

   public chp(but<? extends chp> $$0, dgj $$1) {
      super($$0, $$1);
      this.bP = new cbg(this, 10, false);
      this.a(etr.n, -1.0F);
      this.a(etr.o, -1.0F);
      this.a(etr.x, -1.0F);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      this.a(af.a(chp.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bud.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void E() {
      this.bS.a(0, new bwf.a(1.25));
      this.bS.a(0, new cca(this));
      this.bS.a(1, new cco(this, coy.class, 8.0F));
      this.bS.a(2, new cdl(this));
      this.bS.a(2, new cce(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chp.a(this, 1.0));
      this.bS.a(3, new ccl(this));
      this.bS.a(3, new ccd(this, 1.0, 3.0F, 7.0F));
   }

   public static bwp.a gE() {
      return cgz.gx().a(bwq.s, 6.0).a(bwq.l, 0.4F).a(bwq.v, 0.2F).a(bwq.c, 3.0);
   }

   @Override
   protected ceu b(dgj $$0) {
      ces $$1 = new ces(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cm == null || !this.cm.a(this.dt(), 3.46) || !this.dV().a_(this.cm).a(djp.eg)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.d_();
      this.gJ();
   }

   @Override
   public void a(ji $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gF() {
      return this.cl;
   }

   private void gJ() {
      this.cf = this.cc;
      this.ce = this.cd;
      this.cd = this.cd + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.cd = ayz.a(this.cd, 0.0F, 1.0F);
      if (!this.aJ() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      fbb $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dgj $$0, bum $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvk> $$2 = $$0.a(bvk.class, $$1.cR().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvk $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               avz $$4 = b($$3.aq());
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
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(awy.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.tg, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bsl.a;
      } else if (!$$2.a(awy.aB)) {
         if (!this.gH() && this.p() && this.j($$0)) {
            if (!this.dV().C) {
               this.z(!this.gs());
            }

            return bsl.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new btr(btt.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bsl.a;
      }
   }

   @Override
   public boolean j(cwq $$0) {
      return false;
   }

   public static boolean c(but<chp> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwy $$2, ji $$3) {
   }

   @Override
   public boolean a(cgz $$0) {
      return false;
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      return null;
   }

   @Nullable
   @Override
   public avz u() {
      return a(this.dV(), this.dV().A);
   }

   public static avz a(dgj $$0, azh $$1) {
      if ($$0.am() != bsi.a && $$1.a(1000) == 0) {
         List<but<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awa.te;
      }
   }

   private static avz b(but<?> $$0) {
      return ci.getOrDefault($$0, awa.te);
   }

   @Override
   protected avz e(btc $$0) {
      return awa.ti;
   }

   @Override
   protected avz o_() {
      return awa.tf;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.tT, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ck;
   }

   @Override
   protected void aZ() {
      this.a(awa.th, 0.15F, 1.0F);
      this.ck = this.Y + this.cd / 2.0F;
   }

   @Override
   public float fh() {
      return a(this.ae);
   }

   public static float a(azh $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public awb dm() {
      return awb.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(bum $$0) {
      if (!($$0 instanceof coy)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public chp.b gG() {
      return chp.b.a(this.al.a(cg));
   }

   public void a(chp.b $$0) {
      this.al.a(cg, $$0.h);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gG().h);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chp.b.a($$0.h("Variant")));
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
   public fbb cT() {
      return new fbb(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cds {
      public a(bvq $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fbb h() {
         fbb $$0 = null;
         if (this.b.bj()) {
            $$0 = cgg.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fbb k() {
         ji $$0 = this.b.dv();
         ji.a $$1 = new ji.a();
         ji.a $$2 = new ji.a();

         for (ji $$4 : ji.b(
            ayz.a(this.b.dA() - 3.0),
            ayz.a(this.b.dC() - 6.0),
            ayz.a(this.b.dG() - 3.0),
            ayz.a(this.b.dA() + 3.0),
            ayz.a(this.b.dC() + 6.0),
            ayz.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dwy $$5 = this.b.dV().a_($$2.a($$4, jn.a));
               boolean $$6 = $$5.b() instanceof dnz || $$5.a(awp.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jn.b))) {
                  return fbb.c($$4);
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

      public static final Codec<chp.b> f = azv.a(chp.b::values);
      private static final IntFunction<chp.b> g = axq.a(chp.b::a, values(), axq.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chp.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
