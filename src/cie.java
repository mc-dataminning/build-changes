import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cie extends cil implements bwx<cie.b>, chx {
   private static final aks<Integer> ch = akw.a(cie.class, aku.b);
   private static final Predicate<bvz> ci = new Predicate<bvz>() {
      public boolean a(@Nullable bvz $$0) {
         return $$0 != null && cie.cj.containsKey($$0.aq());
      }
   };
   static final Map<bvi<?>, awu> cj = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvi.o, awv.tj);
      $$0.put(bvi.q, awv.tk);
      $$0.put(bvi.r, awv.tl);
      $$0.put(bvi.v, awv.tI);
      $$0.put(bvi.F, awv.tn);
      $$0.put(bvi.L, awv.to);
      $$0.put(bvi.N, awv.tp);
      $$0.put(bvi.Q, awv.tq);
      $$0.put(bvi.P, awv.tr);
      $$0.put(bvi.T, awv.ts);
      $$0.put(bvi.ae, awv.tt);
      $$0.put(bvi.aj, awv.tu);
      $$0.put(bvi.ak, awv.tv);
      $$0.put(bvi.an, awv.tw);
      $$0.put(bvi.ao, awv.tx);
      $$0.put(bvi.aA, awv.ty);
      $$0.put(bvi.aQ, awv.tz);
      $$0.put(bvi.aS, awv.tA);
      $$0.put(bvi.aT, awv.tB);
      $$0.put(bvi.aU, awv.tC);
      $$0.put(bvi.aZ, awv.tD);
      $$0.put(bvi.bc, awv.tE);
      $$0.put(bvi.be, awv.tF);
      $$0.put(bvi.bf, awv.tG);
      $$0.put(bvi.bh, awv.tH);
      $$0.put(bvi.bo, awv.tI);
      $$0.put(bvi.bs, awv.tJ);
      $$0.put(bvi.bC, awv.tK);
      $$0.put(bvi.bE, awv.tL);
      $$0.put(bvi.bG, awv.tM);
      $$0.put(bvi.bI, awv.tN);
      $$0.put(bvi.bJ, awv.tO);
      $$0.put(bvi.bK, awv.tP);
      $$0.put(bvi.bN, awv.tQ);
      $$0.put(bvi.D, awv.tm);
      $$0.put(bvi.E, awv.tm);
      $$0.put(bvi.bO, awv.tR);
      $$0.put(bvi.bQ, awv.tS);
   });
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private jh cn;

   public cie(bvi<? extends cie> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cbv(this, 10, false);
      this.a(euh.n, -1.0F);
      this.a(euh.o, -1.0F);
      this.a(euh.x, -1.0F);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.a(ae.a(cie.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bus.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bT.a(0, new bwu.a(1.25));
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdd(this, cpo.class, 8.0F));
      this.bT.a(2, new cea(this));
      this.bT.a(2, new cct(this, 1.0, 5.0F, 1.0F));
      this.bT.a(2, new cie.a(this, 1.0));
      this.bT.a(3, new cda(this));
      this.bT.a(3, new ccs(this, 1.0, 3.0F, 7.0F));
   }

   public static bxe.a gA() {
      return cho.gt().a(bxf.s, 6.0).a(bxf.l, 0.4F).a(bxf.v, 0.2F).a(bxf.c, 3.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      cfh $$1 = new cfh(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cn == null || !this.cn.a(this.du(), 3.46) || !this.dW().a_(this.cn).a(dkf.eg)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dW().A.a(400) == 0) {
         a(this.dW(), this);
      }

      super.d_();
      this.gF();
   }

   @Override
   public void a(jh $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gB() {
      return this.cm;
   }

   private void gF() {
      this.cg = this.cd;
      this.cf = this.ce;
      this.ce = this.ce + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.ce = azu.a(this.ce, 0.0F, 1.0F);
      if (!this.aJ() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      fbr $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dgz $$0, bvb $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bvz> $$2 = $$0.a(bvz.class, $$1.cR().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bvz $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               awu $$4 = b($$3.aq());
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
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(axt.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.tg, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dW().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dW().a(this, (byte)7);
            } else {
               this.dW().a(this, (byte)6);
            }
         }

         return bta.a;
      } else if (!$$2.a(axt.aD)) {
         if (!this.gD() && this.p() && this.j($$0)) {
            if (!this.dW().C) {
               this.z(!this.go());
            }

            return bta.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bug(bui.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dX().a($$0), Float.MAX_VALUE);
         }

         return bta.a;
      }
   }

   @Override
   public boolean j(cxg $$0) {
      return false;
   }

   public static boolean c(bvi<cie> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxo $$2, jh $$3) {
   }

   @Override
   public boolean a(cho $$0) {
      return false;
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return null;
   }

   @Nullable
   @Override
   public awu u() {
      return a(this.dW(), this.dW().A);
   }

   public static awu a(dgz $$0, bac $$1) {
      if ($$0.am() != bsx.a && $$1.a(1000) == 0) {
         List<bvi<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return awv.te;
      }
   }

   private static awu b(bvi<?> $$0) {
      return cj.getOrDefault($$0, awv.te);
   }

   @Override
   protected awu e(btr $$0) {
      return awv.ti;
   }

   @Override
   protected awu o_() {
      return awv.tf;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.tT, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.cl;
   }

   @Override
   protected void aZ() {
      this.a(awv.th, 0.15F, 1.0F);
      this.cl = this.Y + this.ce / 2.0F;
   }

   @Override
   public float fh() {
      return a(this.ae);
   }

   public static float a(bac $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aww dn() {
      return aww.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(bvb $$0) {
      if (!($$0 instanceof cpo)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cie.b gC() {
      return cie.b.a(this.al.a(ch));
   }

   public void a(cie.b $$0) {
      this.al.a(ch, $$0.h);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().h);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cie.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gD() {
      return !this.aJ();
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a extends ceh {
      public a(bwf $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fbr h() {
         fbr $$0 = null;
         if (this.b.bj()) {
            $$0 = cgv.a(this.b, 15, 15);
         }

         if (this.b.dZ().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fbr k() {
         jh $$0 = this.b.dw();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            azu.a(this.b.dB() - 3.0),
            azu.a(this.b.dD() - 6.0),
            azu.a(this.b.dH() - 3.0),
            azu.a(this.b.dB() + 3.0),
            azu.a(this.b.dD() + 6.0),
            azu.a(this.b.dH() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dxo $$5 = this.b.dW().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof dop || $$5.a(axk.u);
               if ($$6 && this.b.dW().u($$4) && this.b.dW().u($$1.a($$4, jm.b))) {
                  return fbr.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements baq {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cie.b> f = baq.a(cie.b::values);
      private static final IntFunction<cie.b> g = ayl.a(cie.b::a, values(), ayl.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cie.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
