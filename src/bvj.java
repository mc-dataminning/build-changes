import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvj extends bvq implements bkg<bvj.b>, bvc {
   private static final aeg<Integer> ca = aej.a(bvj.class, aei.b);
   private static final Predicate<bjk> cb = new Predicate<bjk>() {
      public boolean a(@Nullable bjk $$0) {
         return $$0 != null && bvj.ce.containsKey($$0.ag());
      }
   };
   private static final cjc cc = cjk.re;
   private static final Set<cjc> cd = Sets.newHashSet(new cjc[]{cjk.oH, cjk.rk, cjk.rj, cjk.ur, cjk.uo, cjk.up});
   static final Map<biw<?>, ape> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(biw.i, apf.ra);
      $$0.put(biw.n, apf.rw);
      $$0.put(biw.u, apf.rb);
      $$0.put(biw.y, apf.rc);
      $$0.put(biw.A, apf.rd);
      $$0.put(biw.C, apf.re);
      $$0.put(biw.F, apf.rf);
      $$0.put(biw.G, apf.rg);
      $$0.put(biw.Q, apf.rh);
      $$0.put(biw.V, apf.ri);
      $$0.put(biw.W, apf.rj);
      $$0.put(biw.Z, apf.rk);
      $$0.put(biw.aa, apf.rl);
      $$0.put(biw.al, apf.rm);
      $$0.put(biw.au, apf.rn);
      $$0.put(biw.aw, apf.ro);
      $$0.put(biw.ax, apf.rp);
      $$0.put(biw.ay, apf.rq);
      $$0.put(biw.aD, apf.rr);
      $$0.put(biw.aG, apf.rs);
      $$0.put(biw.aI, apf.rt);
      $$0.put(biw.aJ, apf.ru);
      $$0.put(biw.aL, apf.rv);
      $$0.put(biw.aS, apf.rw);
      $$0.put(biw.aU, apf.rx);
      $$0.put(biw.be, apf.ry);
      $$0.put(biw.bg, apf.rz);
      $$0.put(biw.bi, apf.rA);
      $$0.put(biw.bj, apf.rB);
      $$0.put(biw.bk, apf.rC);
      $$0.put(biw.bl, apf.rD);
      $$0.put(biw.bo, apf.rE);
      $$0.put(biw.bp, apf.rF);
      $$0.put(biw.br, apf.rG);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private gw ci;

   public bvj(biw<? extends bvj> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bpd(this, 10, false);
      this.a(eaz.n, -1.0F);
      this.a(eaz.o, -1.0F);
      this.a(eaz.x, -1.0F);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.a(ac.a(bvj.b.values(), $$0.D_()));
      if ($$3 == null) {
         $$3 = new bin.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean m_() {
      return false;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqw(this, 1.25));
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bql(this, cbw.class, 8.0F));
      this.bO.a(2, new bri(this));
      this.bO.a(2, new bqb(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bvj.a(this, 1.0));
      this.bO.a(3, new bqi(this));
      this.bO.a(3, new bqa(this, 1.0, 3.0F, 7.0F));
   }

   public static bkn.a gj() {
      return bjk.A().a(bko.a, 6.0).a(bko.e, 0.4F).a(bko.d, 0.2F);
   }

   @Override
   protected bsr b(cpx $$0) {
      bsp $$1 = new bsp(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.dj(), 3.46) || !this.dL().a_(this.ci).a(csy.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dL().z.a(400) == 0) {
         a(this.dL(), this);
      }

      super.b_();
      this.gn();
   }

   @Override
   public void a(gw $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gk() {
      return this.ch;
   }

   private void gn() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aA() && !this.bN() ? 4 : -1) * 0.3F;
      this.bX = ary.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehp $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cpx $$0, bis $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bjk> $$2 = $$0.a(bjk.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bjk $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               ape $$4 = b($$3.ag());
               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), $$4, $$1.da(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if (!this.s() && cd.contains($$2.d())) {
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.qX, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return bha.a(this.dL().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         this.b(new bif(bih.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return bha.a(this.dL().B);
      } else if (!this.gq() && this.s() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.gd());
         }

         return bha.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cjh $$0) {
      return false;
   }

   public static boolean c(biw<bvj> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfl $$2, gw $$3) {
   }

   @Override
   public boolean a(but $$0) {
      return false;
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      return null;
   }

   @Override
   public boolean C(bis $$0) {
      return $$0.a(this.dM().b((bji)this), 3.0F);
   }

   @Nullable
   @Override
   public ape w() {
      return a(this.dL(), this.dL().z);
   }

   public static ape a(cpx $$0, ase $$1) {
      if ($$0.ai() != bgx.a && $$1.a(1000) == 0) {
         List<biw<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return apf.qV;
      }
   }

   private static ape b(biw<?> $$0) {
      return ce.getOrDefault($$0, apf.qV);
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.qZ;
   }

   @Override
   protected ape l_() {
      return apf.qW;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(apf.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eW() {
      return a(this.ag);
   }

   public static float a(ase $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public apg da() {
      return apg.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(bis $$0) {
      if (!($$0 instanceof cbw)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bvj.b gl() {
      return bvj.b.a(this.an.b(ca));
   }

   public void a(bvj.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl().h);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a(bvj.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gq() {
      return !this.aA();
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends brp {
      public a(bjr $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehp h() {
         ehp $$0 = null;
         if (this.b.aX()) {
            $$0 = bub.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehp k() {
         gw $$0 = this.b.dl();
         gw.a $$1 = new gw.a();
         gw.a $$2 = new gw.a();

         for (gw $$4 : gw.b(
            ary.a(this.b.dq() - 3.0),
            ary.a(this.b.ds() - 6.0),
            ary.a(this.b.dw() - 3.0),
            ary.a(this.b.dq() + 3.0),
            ary.a(this.b.ds() + 6.0),
            ary.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dfl $$5 = this.b.dL().a_($$2.a($$4, hc.a));
               boolean $$6 = $$5.b() instanceof cxe || $$5.a(apu.t);
               if ($$6 && this.b.dL().t($$4) && this.b.dL().t($$1.a($$4, hc.b))) {
                  return ehp.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements asr {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bvj.b> f = asr.a(bvj.b::values);
      private static final IntFunction<bvj.b> g = aqt.a(bvj.b::a, values(), aqt.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bvj.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
