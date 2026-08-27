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

public class buy extends bvf implements bjv<buy.b>, bur {
   private static final adx<Integer> ca = aea.a(buy.class, adz.b);
   private static final Predicate<biy> cb = new Predicate<biy>() {
      public boolean a(@Nullable biy $$0) {
         return $$0 != null && buy.ce.containsKey($$0.ag());
      }
   };
   private static final cir cc = ciz.re;
   private static final Set<cir> cd = Sets.newHashSet(new cir[]{ciz.oH, ciz.rk, ciz.rj, ciz.ur, ciz.uo, ciz.up});
   static final Map<bik<?>, aot> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bik.i, aou.ra);
      $$0.put(bik.n, aou.rw);
      $$0.put(bik.u, aou.rb);
      $$0.put(bik.y, aou.rc);
      $$0.put(bik.A, aou.rd);
      $$0.put(bik.C, aou.re);
      $$0.put(bik.F, aou.rf);
      $$0.put(bik.G, aou.rg);
      $$0.put(bik.Q, aou.rh);
      $$0.put(bik.V, aou.ri);
      $$0.put(bik.W, aou.rj);
      $$0.put(bik.Z, aou.rk);
      $$0.put(bik.aa, aou.rl);
      $$0.put(bik.al, aou.rm);
      $$0.put(bik.au, aou.rn);
      $$0.put(bik.aw, aou.ro);
      $$0.put(bik.ax, aou.rp);
      $$0.put(bik.ay, aou.rq);
      $$0.put(bik.aD, aou.rr);
      $$0.put(bik.aG, aou.rs);
      $$0.put(bik.aI, aou.rt);
      $$0.put(bik.aJ, aou.ru);
      $$0.put(bik.aL, aou.rv);
      $$0.put(bik.aS, aou.rw);
      $$0.put(bik.aU, aou.rx);
      $$0.put(bik.be, aou.ry);
      $$0.put(bik.bg, aou.rz);
      $$0.put(bik.bi, aou.rA);
      $$0.put(bik.bj, aou.rB);
      $$0.put(bik.bk, aou.rC);
      $$0.put(bik.bl, aou.rD);
      $$0.put(bik.bo, aou.rE);
      $$0.put(bik.bp, aou.rF);
      $$0.put(bik.br, aou.rG);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private gv ci;

   public buy(bik<? extends buy> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new bos(this, 10, false);
      this.a(eam.n, -1.0F);
      this.a(eam.o, -1.0F);
      this.a(eam.x, -1.0F);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.a(ac.a(buy.b.values(), $$0.y_()));
      if ($$3 == null) {
         $$3 = new bib.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean i_() {
      return false;
   }

   @Override
   protected void w() {
      this.bO.a(0, new bql(this, 1.25));
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bqa(this, cbl.class, 8.0F));
      this.bO.a(2, new bqx(this));
      this.bO.a(2, new bpq(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new buy.a(this, 1.0));
      this.bO.a(3, new bpx(this));
      this.bO.a(3, new bpp(this, 1.0, 3.0F, 7.0F));
   }

   public static bkc.a gf() {
      return biy.x().a(bkd.a, 6.0).a(bkd.e, 0.4F).a(bkd.d, 0.2F);
   }

   @Override
   protected bsg b(cpk $$0) {
      bse $$1 = new bse(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.di(), 3.46) || !this.dK().a_(this.ci).a(csl.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dK().z.a(400) == 0) {
         a(this.dK(), this);
      }

      super.b_();
      this.gj();
   }

   @Override
   public void a(gv $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gg() {
      return this.ch;
   }

   private void gj() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aA() && !this.bN() ? 4 : -1) * 0.3F;
      this.bX = aro.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehf $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cpk $$0, big $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<biy> $$2 = $$0.a(biy.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            biy $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               aot $$4 = b($$3.ag());
               $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$4, $$1.da(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (!this.p() && cd.contains($$2.d())) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.qX, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dK().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dK().a(this, (byte)7);
            } else {
               this.dK().a(this, (byte)6);
            }
         }

         return bgo.a(this.dK().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         this.b(new bht(bhv.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dL().a($$0), Float.MAX_VALUE);
         }

         return bgo.a(this.dK().B);
      } else if (!this.gm() && this.p() && this.l($$0)) {
         if (!this.dK().B) {
            this.z(!this.fZ());
         }

         return bgo.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(ciw $$0) {
      return false;
   }

   public static boolean c(bik<buy> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dey $$2, gv $$3) {
   }

   @Override
   public boolean a(bui $$0) {
      return false;
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return null;
   }

   @Override
   public boolean C(big $$0) {
      return $$0.a(this.dL().b((biw)this), 3.0F);
   }

   @Nullable
   @Override
   public aot r() {
      return a(this.dK(), this.dK().z);
   }

   public static aot a(cpk $$0, art $$1) {
      if ($$0.ai() != bgl.a && $$1.a(1000) == 0) {
         List<bik<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aou.qV;
      }
   }

   private static aot b(bik<?> $$0) {
      return ce.getOrDefault($$0, aou.qV);
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.qZ;
   }

   @Override
   protected aot h_() {
      return aou.qW;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(aou.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eV() {
      return a(this.ag);
   }

   public static float a(art $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aov da() {
      return aov.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(big $$0) {
      if (!($$0 instanceof cbl)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public buy.b gh() {
      return buy.b.a(this.an.b(ca));
   }

   public void a(buy.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Variant", this.gh().h);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(buy.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gm() {
      return !this.aA();
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bre {
      public a(bjf $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehf h() {
         ehf $$0 = null;
         if (this.b.aX()) {
            $$0 = btq.a(this.b, 15, 15);
         }

         if (this.b.ee().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehf k() {
         gv $$0 = this.b.dk();
         gv.a $$1 = new gv.a();
         gv.a $$2 = new gv.a();

         for (gv $$4 : gv.b(
            aro.a(this.b.dp() - 3.0),
            aro.a(this.b.dr() - 6.0),
            aro.a(this.b.dv() - 3.0),
            aro.a(this.b.dp() + 3.0),
            aro.a(this.b.dr() + 6.0),
            aro.a(this.b.dv() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dey $$5 = this.b.dK().a_($$2.a($$4, hb.a));
               boolean $$6 = $$5.b() instanceof cwr || $$5.a(apj.t);
               if ($$6 && this.b.dK().t($$4) && this.b.dK().t($$1.a($$4, hb.b))) {
                  return ehf.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements asf {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<buy.b> f = asf.a(buy.b::values);
      private static final IntFunction<buy.b> g = aqi.a(buy.b::a, values(), aqi.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static buy.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
