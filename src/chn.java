import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chn extends chu implements bwg<chn.b>, chg {
   private static final ajy<Integer> cg = akc.a(chn.class, aka.b);
   private static final Predicate<bvi> ch = new Predicate<bvi>() {
      public boolean a(@Nullable bvi $$0) {
         return $$0 != null && chn.ci.containsKey($$0.aq());
      }
   };
   static final Map<bur<?>, avz> ci = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bur.o, awa.tj);
      $$0.put(bur.q, awa.tk);
      $$0.put(bur.r, awa.tl);
      $$0.put(bur.v, awa.tI);
      $$0.put(bur.D, awa.tm);
      $$0.put(bur.E, awa.tn);
      $$0.put(bur.K, awa.to);
      $$0.put(bur.M, awa.tp);
      $$0.put(bur.P, awa.tq);
      $$0.put(bur.O, awa.tr);
      $$0.put(bur.S, awa.ts);
      $$0.put(bur.ad, awa.tt);
      $$0.put(bur.ai, awa.tu);
      $$0.put(bur.aj, awa.tv);
      $$0.put(bur.am, awa.tw);
      $$0.put(bur.an, awa.tx);
      $$0.put(bur.az, awa.ty);
      $$0.put(bur.aP, awa.tz);
      $$0.put(bur.aR, awa.tA);
      $$0.put(bur.aS, awa.tB);
      $$0.put(bur.aT, awa.tC);
      $$0.put(bur.aY, awa.tD);
      $$0.put(bur.bb, awa.tE);
      $$0.put(bur.bd, awa.tF);
      $$0.put(bur.be, awa.tG);
      $$0.put(bur.bg, awa.tH);
      $$0.put(bur.bn, awa.tI);
      $$0.put(bur.br, awa.tJ);
      $$0.put(bur.bB, awa.tK);
      $$0.put(bur.bD, awa.tL);
      $$0.put(bur.bF, awa.tM);
      $$0.put(bur.bH, awa.tN);
      $$0.put(bur.bI, awa.tO);
      $$0.put(bur.bJ, awa.tP);
      $$0.put(bur.bM, awa.tQ);
      $$0.put(bur.bN, awa.tR);
      $$0.put(bur.bP, awa.tS);
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

   public chn(bur<? extends chn> $$0, dgh $$1) {
      super($$0, $$1);
      this.bP = new cbe(this, 10, false);
      this.a(etp.n, -1.0F);
      this.a(etp.o, -1.0F);
      this.a(etp.x, -1.0F);
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.a(af.a(chn.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bub.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void E() {
      this.bS.a(0, new bwd.a(1.25));
      this.bS.a(0, new cby(this));
      this.bS.a(1, new ccm(this, cow.class, 8.0F));
      this.bS.a(2, new cdj(this));
      this.bS.a(2, new ccc(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chn.a(this, 1.0));
      this.bS.a(3, new ccj(this));
      this.bS.a(3, new ccb(this, 1.0, 3.0F, 7.0F));
   }

   public static bwn.a gE() {
      return cgx.gx().a(bwo.s, 6.0).a(bwo.l, 0.4F).a(bwo.v, 0.2F).a(bwo.c, 3.0);
   }

   @Override
   protected ces b(dgh $$0) {
      ceq $$1 = new ceq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cm == null || !this.cm.a(this.dt(), 3.46) || !this.dV().a_(this.cm).a(djn.eg)) {
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
      faz $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dgh $$0, buk $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvi> $$2 = $$0.a(bvi.class, $$1.cR().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvi $$3 = $$2.get($$0.A.a($$2.size()));
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
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
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

         return bsj.a;
      } else if (!$$2.a(awy.aB)) {
         if (!this.gH() && this.p() && this.j($$0)) {
            if (!this.dV().C) {
               this.z(!this.gs());
            }

            return bsj.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new btp(btr.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bsj.a;
      }
   }

   @Override
   public boolean j(cwo $$0) {
      return false;
   }

   public static boolean c(bur<chn> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dww $$2, ji $$3) {
   }

   @Override
   public boolean a(cgx $$0) {
      return false;
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      return null;
   }

   @Nullable
   @Override
   public avz u() {
      return a(this.dV(), this.dV().A);
   }

   public static avz a(dgh $$0, azh $$1) {
      if ($$0.am() != bsg.a && $$1.a(1000) == 0) {
         List<bur<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awa.te;
      }
   }

   private static avz b(bur<?> $$0) {
      return ci.getOrDefault($$0, awa.te);
   }

   @Override
   protected avz e(bta $$0) {
      return awa.ti;
   }

   @Override
   protected avz o_() {
      return awa.tf;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
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
   protected void D(buk $$0) {
      if (!($$0 instanceof cow)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public chn.b gG() {
      return chn.b.a(this.al.a(cg));
   }

   public void a(chn.b $$0) {
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
      this.a(chn.b.a($$0.h("Variant")));
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
   public faz cT() {
      return new faz(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cdq {
      public a(bvo $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected faz h() {
         faz $$0 = null;
         if (this.b.bj()) {
            $$0 = cge.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private faz k() {
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
               dww $$5 = this.b.dV().a_($$2.a($$4, jn.a));
               boolean $$6 = $$5.b() instanceof dnx || $$5.a(awp.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jn.b))) {
                  return faz.c($$4);
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

      public static final Codec<chn.b> f = azv.a(chn.b::values);
      private static final IntFunction<chn.b> g = axq.a(chn.b::a, values(), axq.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static chn.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
