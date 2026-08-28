import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cim extends cit implements bxf<cim.b>, cif {
   private static final alc<Integer> ch = alg.a(cim.class, ale.b);
   private static final Predicate<bwh> ci = new Predicate<bwh>() {
      public boolean a(@Nullable bwh $$0) {
         return $$0 != null && cim.cj.containsKey($$0.aq());
      }
   };
   static final Map<bvq<?>, axe> cj = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvq.o, axf.td);
      $$0.put(bvq.q, axf.te);
      $$0.put(bvq.r, axf.tf);
      $$0.put(bvq.v, axf.tC);
      $$0.put(bvq.F, axf.th);
      $$0.put(bvq.L, axf.ti);
      $$0.put(bvq.N, axf.tj);
      $$0.put(bvq.Q, axf.tk);
      $$0.put(bvq.P, axf.tl);
      $$0.put(bvq.T, axf.tm);
      $$0.put(bvq.ae, axf.tn);
      $$0.put(bvq.aj, axf.to);
      $$0.put(bvq.ak, axf.tp);
      $$0.put(bvq.an, axf.tq);
      $$0.put(bvq.ao, axf.tr);
      $$0.put(bvq.aA, axf.ts);
      $$0.put(bvq.aQ, axf.tt);
      $$0.put(bvq.aS, axf.tu);
      $$0.put(bvq.aT, axf.tv);
      $$0.put(bvq.aU, axf.tw);
      $$0.put(bvq.aZ, axf.tx);
      $$0.put(bvq.bc, axf.ty);
      $$0.put(bvq.be, axf.tz);
      $$0.put(bvq.bf, axf.tA);
      $$0.put(bvq.bh, axf.tB);
      $$0.put(bvq.bo, axf.tC);
      $$0.put(bvq.bs, axf.tD);
      $$0.put(bvq.bC, axf.tE);
      $$0.put(bvq.bE, axf.tF);
      $$0.put(bvq.bG, axf.tG);
      $$0.put(bvq.bI, axf.tH);
      $$0.put(bvq.bJ, axf.tI);
      $$0.put(bvq.bK, axf.tJ);
      $$0.put(bvq.bN, axf.tK);
      $$0.put(bvq.D, axf.tg);
      $$0.put(bvq.E, axf.tg);
      $$0.put(bvq.bO, axf.tL);
      $$0.put(bvq.bQ, axf.tM);
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

   public cim(bvq<? extends cim> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new ccd(this, 10, false);
      this.a(eun.n, -1.0F);
      this.a(eun.o, -1.0F);
      this.a(eun.x, -1.0F);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.a(ae.a(cim.b.values(), $$0.H_()));
      if ($$3 == null) {
         $$3 = new bva.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   protected void B() {
      this.bT.a(0, new bxc.a(1.25));
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cdl(this, cpw.class, 8.0F));
      this.bT.a(2, new cei(this));
      this.bT.a(2, new cdb(this, 1.0, 5.0F, 1.0F));
      this.bT.a(2, new cim.a(this, 1.0));
      this.bT.a(3, new cdi(this));
      this.bT.a(3, new cda(this, 1.0, 3.0F, 7.0F));
   }

   public static bxm.a gy() {
      return chw.gr().a(bxn.s, 6.0).a(bxn.l, 0.4F).a(bxn.v, 0.2F).a(bxn.c, 3.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      cfp $$1 = new cfp(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cn == null || !this.cn.a(this.dt(), 3.46) || !this.dV().a_(this.cn).a(dkn.eg)) {
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
      fbx $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.cd = this.cd + this.ck * 2.0F;
   }

   public static boolean a(dhh $$0, bvj $$1) {
      if ($$1.bL() && !$$1.bb() && $$0.A.a(2) == 0) {
         List<bwh> $$2 = $$0.a(bwh.class, $$1.cR().g(20.0), ci);
         if (!$$2.isEmpty()) {
            bwh $$3 = $$2.get($$0.A.a($$2.size()));
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
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if (!this.p() && $$2.a(ayd.aC)) {
         this.a($$0, $$1, $$2);
         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.ta, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }

         if (!this.dV().C) {
            if (this.ae.a(10) == 0) {
               this.a($$0);
               this.dV().a(this, (byte)7);
            } else {
               this.dV().a(this, (byte)6);
            }
         }

         return bti.a;
      } else if (!$$2.a(ayd.aD)) {
         if (!this.gB() && this.p() && this.j($$0)) {
            if (!this.dV().C) {
               this.z(!this.gm());
            }

            return bti.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         this.a($$0, $$1, $$2);
         this.a(new buo(buq.s, 900));
         if ($$0.b() || !this.cC()) {
            this.a(this.dW().a($$0), Float.MAX_VALUE);
         }

         return bti.a;
      }
   }

   @Override
   public boolean j(cxo $$0) {
      return false;
   }

   public static boolean c(bvq<cim> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cd) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxu $$2, jh $$3) {
   }

   @Override
   public boolean a(chw $$0) {
      return false;
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      return null;
   }

   @Nullable
   @Override
   public axe u() {
      return a(this.dV(), this.dV().A);
   }

   public static axe a(dhh $$0, bam $$1) {
      if ($$0.al() != btf.a && $$1.a(1000) == 0) {
         List<bvq<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return axf.sY;
      }
   }

   private static axe b(bvq<?> $$0) {
      return cj.getOrDefault($$0, axf.sY);
   }

   @Override
   protected axe e(btz $$0) {
      return axf.tc;
   }

   @Override
   protected axe o_() {
      return axf.sZ;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
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
   protected void D(bvj $$0) {
      if (!($$0 instanceof cpw)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   public cim.b gA() {
      return cim.b.a(this.al.a(ch));
   }

   public void a(cim.b $$0) {
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
      this.a(cim.b.a($$0.h("Variant")));
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
   public fbx cT() {
      return new fbx(0.0, (double)(0.5F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a extends cep {
      public a(bwn $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected fbx h() {
         fbx $$0 = null;
         if (this.b.bj()) {
            $$0 = chd.a(this.b, 15, 15);
         }

         if (this.b.dY().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private fbx k() {
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
               dxu $$5 = this.b.dV().a_($$2.a($$4, jm.a));
               boolean $$6 = $$5.b() instanceof dox || $$5.a(axu.u);
               if ($$6 && this.b.dV().u($$4) && this.b.dV().u($$1.a($$4, jm.b))) {
                  return fbx.c($$4);
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

      public static final Codec<cim.b> f = bba.a(cim.b::values);
      private static final IntFunction<cim.b> g = ayv.a(cim.b::a, values(), ayv.a.c);
      final int h;
      private final String i;

      private b(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cim.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
