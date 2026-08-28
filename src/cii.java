import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cii extends cip implements bxb<cii.b>, cib {
   private static final alc<Integer> ch = alg.a(cii.class, ale.b);
   private static final Predicate<bwd> ci = new Predicate<bwd>() {
      public boolean a(@Nullable bwd $$0) {
         return $$0 != null && cii.cj.containsKey($$0.aq());
      }
   };
   static final Map<bvm<?>, axe> cj = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvm.o, axf.tc);
      $$0.put(bvm.q, axf.td);
      $$0.put(bvm.r, axf.te);
      $$0.put(bvm.v, axf.tB);
      $$0.put(bvm.F, axf.tg);
      $$0.put(bvm.L, axf.th);
      $$0.put(bvm.N, axf.ti);
      $$0.put(bvm.Q, axf.tj);
      $$0.put(bvm.P, axf.tk);
      $$0.put(bvm.T, axf.tl);
      $$0.put(bvm.ae, axf.tm);
      $$0.put(bvm.aj, axf.tn);
      $$0.put(bvm.ak, axf.to);
      $$0.put(bvm.an, axf.tp);
      $$0.put(bvm.ao, axf.tq);
      $$0.put(bvm.aA, axf.tr);
      $$0.put(bvm.aQ, axf.ts);
      $$0.put(bvm.aS, axf.tt);
      $$0.put(bvm.aT, axf.tu);
      $$0.put(bvm.aU, axf.tv);
      $$0.put(bvm.aZ, axf.tw);
      $$0.put(bvm.bc, axf.tx);
      $$0.put(bvm.be, axf.ty);
      $$0.put(bvm.bf, axf.tz);
      $$0.put(bvm.bh, axf.tA);
      $$0.put(bvm.bo, axf.tB);
      $$0.put(bvm.bs, axf.tC);
      $$0.put(bvm.bC, axf.tD);
      $$0.put(bvm.bE, axf.tE);
      $$0.put(bvm.bG, axf.tF);
      $$0.put(bvm.bI, axf.tG);
      $$0.put(bvm.bJ, axf.tH);
      $$0.put(bvm.bK, axf.tI);
      $$0.put(bvm.bN, axf.tJ);
      $$0.put(bvm.D, axf.tf);
      $$0.put(bvm.E, axf.tf);
      $$0.put(bvm.bO, axf.tK);
      $$0.put(bvm.bQ, axf.tL);
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

   public cii(bvm<? extends cii> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cbz(this, 10, false);
      this.a(eug.n, -1.0F);
      this.a(eug.o, -1.0F);
      this.a(eug.x, -1.0F);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.a(ae.a(cii.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new buw.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bT.a(0, new bwy.a(1.25));
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cdh(this, cps.class, 8.0F));
      this.bT.a(2, new cee(this));
      this.bT.a(2, new ccx(this, 1.0, 5.0F, 1.0F));
      this.bT.a(2, new cii.a(this, 1.0));
      this.bT.a(3, new cde(this));
      this.bT.a(3, new ccw(this, 1.0, 3.0F, 7.0F));
   }

   public static bxi.a gy() {
      return chs.gr().a(bxj.s, 6.0).a(bxj.l, 0.4F).a(bxj.v, 0.2F).a(bxj.c, 3.0);
   }

   @Override
   protected cfn b(dha $$0) {
      cfl $$1 = new cfl(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cn == null || !this.cn.a(this.dt(), 3.46) || !this.dV().a_(this.cn).a(dkg.eg)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dV().A.a(400) == 0) {
         a(this.dV(), this);
      }

      super.d_();
      this.gD();
   }

   @Override
   public void a(jh $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gz() {
      return this.cm;
   }

   private void gD() {
      this.cg = this.cd;
      this.cf = this.ce;
      this.ce = this.ce + (float)(!this.aJ() && !this.bZ() ? 4 : -1) * 0.3F;
      this.ce = bae.a(this.ce, 0.0F, 1.0F);
      if (!this.aJ() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      fbs $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dha $$0, bvf $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bwd> $$2 = $$0.a(bwd.class, $$1.cR().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bwd $$3 = $$2.get($$0.A.a($$2.size()));
            if (!$$3.bb()) {
               axe $$4 = b($$3.aq());
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
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(ayd.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.sZ, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bte.a;
      } else if (!$$2.a(ayd.aD)) {
         if (!this.gB() && this.p() && this.j($$0)) {
            if (!this.dV().C) {
               this.z(!this.gm());
            }

            return bte.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new buk(bum.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bte.a;
      }
   }

   @Override
   public boolean j(cxk $$0) {
      return false;
   }

   public static boolean c(bvm<cii> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxn $$2, jh $$3) {
   }

   @Override
   public boolean a(chs $$0) {
      return false;
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return null;
   }

   @Nullable
   @Override
   public axe u() {
      return a(this.dV(), this.dV().A);
   }

   public static axe a(dha $$0, bam $$1) {
      if ($$0.al() != btb.a && $$1.a(1000) == 0) {
         List<bvm<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return axf.sX;
      }
   }

   private static axe b(bvm<?> $$0) {
      return cj.getOrDefault($$0, axf.sX);
   }

   @Override
   protected axe e(btv $$0) {
      return axf.tb;
   }

   @Override
   protected axe o_() {
      return axf.sY;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.tM, 0.15F, 1.0F);
   }

   @Override
   protected boolean ba() {
      return this.Y > this.cl;
   }

   @Override
   protected void aZ() {
      this.a(axf.ta, 0.15F, 1.0F);
      this.cl = this.Y + this.ce / 2.0F;
   }

   @Override
   public float ff() {
      return a(this.ae);
   }

   public static float a(bam $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public axg dm() {
      return axg.g;
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   protected void D(bvf $$0) {
      if (!($$0 instanceof cps)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cii.b gA() {
      return cii.b.a(this.al.a(ch));
   }

   public void a(cii.b $$0) {
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
      $$0.a("Variant", this.gA().h);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cii.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gB() {
      return !this.aJ();
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cel {
      public a(bwj $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fbs h() {
         fbs $$0 = null;
         if (this.b.bj()) {
            $$0 = cgz.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fbs k() {
         jh $$0 = this.b.dv();
         jh.a $$1 = new jh.a();
         jh.a $$2 = new jh.a();

         for (jh $$4 : jh.b(
            bae.a(this.b.dA() - 3.0),
            bae.a(this.b.dC() - 6.0),
            bae.a(this.b.dG() - 3.0),
            bae.a(this.b.dA() + 3.0),
            bae.a(this.b.dC() + 6.0),
            bae.a(this.b.dG() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dxn $$5 = this.b.dV().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof doq || $$5.a(axu.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jm.b))) {
                  return fbs.c($$4);
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

      public static final Codec<cii.b> f = bba.a(cii.b::values);
      private static final IntFunction<cii.b> g = ayv.a(cii.b::a, values(), ayv.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cii.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
