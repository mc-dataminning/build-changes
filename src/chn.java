import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chn extends chu implements bwg<chn.b>, chg {
   private static final ajx<Integer> cg = akb.a(chn.class, ajz.b);
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
      $$0.put(bur.F, awa.tn);
      $$0.put(bur.L, awa.to);
      $$0.put(bur.N, awa.tp);
      $$0.put(bur.Q, awa.tq);
      $$0.put(bur.P, awa.tr);
      $$0.put(bur.T, awa.ts);
      $$0.put(bur.ae, awa.tt);
      $$0.put(bur.aj, awa.tu);
      $$0.put(bur.ak, awa.tv);
      $$0.put(bur.an, awa.tw);
      $$0.put(bur.ao, awa.tx);
      $$0.put(bur.aA, awa.ty);
      $$0.put(bur.aQ, awa.tz);
      $$0.put(bur.aS, awa.tA);
      $$0.put(bur.aT, awa.tB);
      $$0.put(bur.aU, awa.tC);
      $$0.put(bur.aZ, awa.tD);
      $$0.put(bur.bc, awa.tE);
      $$0.put(bur.be, awa.tF);
      $$0.put(bur.bf, awa.tG);
      $$0.put(bur.bh, awa.tH);
      $$0.put(bur.bo, awa.tI);
      $$0.put(bur.bs, awa.tJ);
      $$0.put(bur.bC, awa.tK);
      $$0.put(bur.bE, awa.tL);
      $$0.put(bur.bG, awa.tM);
      $$0.put(bur.bI, awa.tN);
      $$0.put(bur.bJ, awa.tO);
      $$0.put(bur.bK, awa.tP);
      $$0.put(bur.bN, awa.tQ);
      $$0.put(bur.D, awa.tm);
      $$0.put(bur.E, awa.tm);
      $$0.put(bur.bO, awa.tR);
      $$0.put(bur.bQ, awa.tS);
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

   public chn(bur<? extends chn> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cbe(this, 10, false);
      this.a(etq.n, -1.0F);
      this.a(etq.o, -1.0F);
      this.a(etq.x, -1.0F);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
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
   protected void B() {
      this.bS.a(0, new bwd.a(1.25));
      this.bS.a(0, new cby(this));
      this.bS.a(1, new ccm(this, cox.class, 8.0F));
      this.bS.a(2, new cdj(this));
      this.bS.a(2, new ccc(this, 1.0, 5.0F, 1.0F));
      this.bS.a(2, new chn.a(this, 1.0));
      this.bS.a(3, new ccj(this));
      this.bS.a(3, new ccb(this, 1.0, 3.0F, 7.0F));
   }

   public static bwn.a gB() {
      return cgx.gu().a(bwo.s, 6.0).a(bwo.l, 0.4F).a(bwo.v, 0.2F).a(bwo.c, 3.0);
   }

   @Override
   protected ces b(dgi $$0) {
      ceq $$1 = new ceq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cm == null || !this.cm.a(this.du(), 3.46) || !this.dW().a_(this.cm).a(djo.eg)) {
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
      this.cd = ayz.a(this.cd, 0.0F, 1.0F);
      if (!this.aJ() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      fba $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cc = this.cc + this.cj * 2.0F;
   }

   public static boolean a(dgi $$0, buk $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvi> $$2 = $$0.a(bvi.class, $$1.cR().g(20.0), ch);
         if (!$$2.isEmpty()) {
            bvi $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               avz $$4 = b($$3.aq());
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
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(awy.aA)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), awa.tg, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dW().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dW().a(this, (byte)7);
            } else {
               this.dW().a(this, (byte)6);
            }
         }

         return bsj.a;
      } else if (!$$2.a(awy.aB)) {
         if (!this.gE() && this.p() && this.j($$0)) {
            if (!this.dW().C) {
               this.z(!this.gp());
            }

            return bsj.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new btp(btr.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dX().a($$0), Float.MAX_VALUE);
         }

         return bsj.a;
      }
   }

   @Override
   public boolean j(cwp $$0) {
      return false;
   }

   public static boolean c(bur<chn> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
   }

   @Override
   public boolean a(cgx $$0) {
      return false;
   }

   @Nullable
   @Override
   public bub a(arc $$0, bub $$1) {
      return null;
   }

   @Nullable
   @Override
   public avz u() {
      return a(this.dW(), this.dW().A);
   }

   public static avz a(dgi $$0, azh $$1) {
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
   protected void b(ji $$0, dwx $$1) {
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
   public awb dn() {
      return awb.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(buk $$0) {
      if (!($$0 instanceof cox)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public chn.b gD() {
      return chn.b.a(this.al.a(cg));
   }

   public void a(chn.b $$0) {
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
      this.a(chn.b.a($$0.h("Variant")));
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
   public fba cT() {
      return new fba(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a extends cdq {
      public a(bvo $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fba h() {
         fba $$0 = null;
         if (this.b.bj()) {
            $$0 = cge.a(this.b, 15, 15);
         }

         if (this.b.dZ().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fba k() {
         ji $$0 = this.b.dw();
         ji.a $$1 = new ji.a();
         ji.a $$2 = new ji.a();

         for (ji $$4 : ji.b(
            ayz.a(this.b.dB() - 3.0),
            ayz.a(this.b.dD() - 6.0),
            ayz.a(this.b.dH() - 3.0),
            ayz.a(this.b.dB() + 3.0),
            ayz.a(this.b.dD() + 6.0),
            ayz.a(this.b.dH() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dwx $$5 = this.b.dW().a_($$2.a($$4, jn.a));
               boolean $$6 = $$5.b() instanceof dny || $$5.a(awp.u);
               if ($$6 && this.b.dW().u($$4) && this.b.dW().u($$1.a($$4, jn.b))) {
                  return fba.c($$4);
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
