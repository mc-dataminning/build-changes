import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cin extends ciu implements bxg<cin.b>, cig {
   private static final alc<Integer> ch = alg.a(cin.class, ale.b);
   private static final Predicate<bwi> ci = new Predicate<bwi>() {
      public boolean a(@Nullable bwi $$0) {
         return $$0 != null && cin.cj.containsKey($$0.aq());
      }
   };
   static final Map<bvr<?>, axe> cj = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvr.o, axf.td);
      $$0.put(bvr.q, axf.te);
      $$0.put(bvr.r, axf.tf);
      $$0.put(bvr.v, axf.tC);
      $$0.put(bvr.F, axf.th);
      $$0.put(bvr.L, axf.ti);
      $$0.put(bvr.N, axf.tj);
      $$0.put(bvr.Q, axf.tk);
      $$0.put(bvr.P, axf.tl);
      $$0.put(bvr.T, axf.tm);
      $$0.put(bvr.ae, axf.tn);
      $$0.put(bvr.aj, axf.to);
      $$0.put(bvr.ak, axf.tp);
      $$0.put(bvr.an, axf.tq);
      $$0.put(bvr.ao, axf.tr);
      $$0.put(bvr.aA, axf.ts);
      $$0.put(bvr.aQ, axf.tt);
      $$0.put(bvr.aS, axf.tu);
      $$0.put(bvr.aT, axf.tv);
      $$0.put(bvr.aU, axf.tw);
      $$0.put(bvr.aZ, axf.tx);
      $$0.put(bvr.bc, axf.ty);
      $$0.put(bvr.be, axf.tz);
      $$0.put(bvr.bf, axf.tA);
      $$0.put(bvr.bh, axf.tB);
      $$0.put(bvr.bo, axf.tC);
      $$0.put(bvr.bs, axf.tD);
      $$0.put(bvr.bC, axf.tE);
      $$0.put(bvr.bE, axf.tF);
      $$0.put(bvr.bG, axf.tG);
      $$0.put(bvr.bI, axf.tH);
      $$0.put(bvr.bJ, axf.tI);
      $$0.put(bvr.bK, axf.tJ);
      $$0.put(bvr.bN, axf.tK);
      $$0.put(bvr.D, axf.tg);
      $$0.put(bvr.E, axf.tg);
      $$0.put(bvr.bO, axf.tL);
      $$0.put(bvr.bQ, axf.tM);
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

   public cin(bvr<? extends cin> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cce(this, 10, false);
      this.a(euo.n, -1.0F);
      this.a(euo.o, -1.0F);
      this.a(euo.x, -1.0F);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      this.a(ae.a(cin.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bvb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bT.a(0, new bxd.a(1.25));
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cdm(this, cpx.class, 8.0F));
      this.bT.a(2, new cej(this));
      this.bT.a(2, new cdc(this, 1.0, 5.0F, 1.0F));
      this.bT.a(2, new cin.a(this, 1.0));
      this.bT.a(3, new cdj(this));
      this.bT.a(3, new cdb(this, 1.0, 3.0F, 7.0F));
   }

   public static bxn.a gA() {
      return chx.gt().a(bxo.s, 6.0).a(bxo.l, 0.4F).a(bxo.v, 0.2F).a(bxo.c, 3.0);
   }

   @Override
   protected cfs b(dhi $$0) {
      cfq $$1 = new cfq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cn == null || !this.cn.a(this.du(), 3.46) || !this.dW().a_(this.cn).a(dko.eg)) {
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
      this.ce = bae.a(this.ce, 0.0F, 1.0F);
      if (!this.aJ() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      fby $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dhi $$0, bvk $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bwi> $$2 = $$0.a(bwi.class, $$1.cR().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bwi $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               axe $$4 = b($$3.aq());
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
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(ayd.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.ta, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dW().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dW().a(this, (byte)7);
            } else {
               this.dW().a(this, (byte)6);
            }
         }

         return btj.a;
      } else if (!$$2.a(ayd.aD)) {
         if (!this.gD() && this.p() && this.j($$0)) {
            if (!this.dW().C) {
               this.z(!this.go());
            }

            return btj.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new bup(bur.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dX().a($$0), Float.MAX_VALUE);
         }

         return btj.a;
      }
   }

   @Override
   public boolean j(cxp $$0) {
      return false;
   }

   public static boolean c(bvr<cin> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   public boolean a(chx $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return null;
   }

   @Nullable
   @Override
   public axe u() {
      return a(this.dW(), this.dW().A);
   }

   public static axe a(dhi $$0, bam $$1) {
      if ($$0.al() != btg.a && $$1.a(1000) == 0) {
         List<bvr<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return axf.sY;
      }
   }

   private static axe b(bvr<?> $$0) {
      return cj.getOrDefault($$0, axf.sY);
   }

   @Override
   protected axe e(bua $$0) {
      return axf.tc;
   }

   @Override
   protected axe o_() {
      return axf.sZ;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.tN, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.cl;
   }

   @Override
   protected void aZ() {
      this.a(axf.tb, 0.15F, 1.0F);
      this.cl = this.Y + this.ce / 2.0F;
   }

   @Override
   public float fh() {
      return a(this.ae);
   }

   public static float a(bam $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public axg dn() {
      return axg.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(bvk $$0) {
      if (!($$0 instanceof cpx)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cin.b gC() {
      return cin.b.a(this.al.a(ch));
   }

   public void a(cin.b $$0) {
      this.al.a(ch, $$0.h);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().h);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cin.b.a($$0.h("Variant")));
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
   public fby cT() {
      return new fby(0.0, (double)(0.5F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a extends ceq {
      public a(bwo $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fby h() {
         fby $$0 = null;
         if (this.b.bj()) {
            $$0 = che.a(this.b, 15, 15);
         }

         if (this.b.dZ().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fby k() {
         jh $$0 = this.b.dw();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            bae.a(this.b.dB() - 3.0),
            bae.a(this.b.dD() - 6.0),
            bae.a(this.b.dH() - 3.0),
            bae.a(this.b.dB() + 3.0),
            bae.a(this.b.dD() + 6.0),
            bae.a(this.b.dH() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dxv $$5 = this.b.dW().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof doy || $$5.a(axu.u);
               if ($$6 && this.b.dW().u($$4) && this.b.dW().u($$1.a($$4, jm.b))) {
                  return fby.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements bba {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cin.b> f = bba.a(cin.b::values);
      private static final IntFunction<cin.b> g = ayv.a(cin.b::a, values(), ayv.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cin.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
