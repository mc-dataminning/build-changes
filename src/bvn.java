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

public class bvn extends bvu implements bkk<bvn.b>, bvg {
   private static final aef<Integer> ca = aei.a(bvn.class, aeh.b);
   private static final Predicate<bjo> cb = new Predicate<bjo>() {
      public boolean a(@Nullable bjo $$0) {
         return $$0 != null && bvn.ce.containsKey($$0.ag());
      }
   };
   private static final cjg cc = cjo.re;
   private static final Set<cjg> cd = Sets.newHashSet(new cjg[]{cjo.oH, cjo.rk, cjo.rj, cjo.ur, cjo.uo, cjo.up});
   static final Map<bja<?>, apf> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bja.i, apg.ra);
      $$0.put(bja.n, apg.rw);
      $$0.put(bja.u, apg.rb);
      $$0.put(bja.y, apg.rc);
      $$0.put(bja.A, apg.rd);
      $$0.put(bja.C, apg.re);
      $$0.put(bja.F, apg.rf);
      $$0.put(bja.G, apg.rg);
      $$0.put(bja.Q, apg.rh);
      $$0.put(bja.V, apg.ri);
      $$0.put(bja.W, apg.rj);
      $$0.put(bja.Z, apg.rk);
      $$0.put(bja.aa, apg.rl);
      $$0.put(bja.al, apg.rm);
      $$0.put(bja.au, apg.rn);
      $$0.put(bja.aw, apg.ro);
      $$0.put(bja.ax, apg.rp);
      $$0.put(bja.ay, apg.rq);
      $$0.put(bja.aD, apg.rr);
      $$0.put(bja.aG, apg.rs);
      $$0.put(bja.aI, apg.rt);
      $$0.put(bja.aJ, apg.ru);
      $$0.put(bja.aL, apg.rv);
      $$0.put(bja.aS, apg.rw);
      $$0.put(bja.aU, apg.rx);
      $$0.put(bja.be, apg.ry);
      $$0.put(bja.bg, apg.rz);
      $$0.put(bja.bi, apg.rA);
      $$0.put(bja.bj, apg.rB);
      $$0.put(bja.bk, apg.rC);
      $$0.put(bja.bl, apg.rD);
      $$0.put(bja.bo, apg.rE);
      $$0.put(bja.bp, apg.rF);
      $$0.put(bja.br, apg.rG);
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

   public bvn(bja<? extends bvn> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new bph(this, 10, false);
      this.a(ear.n, -1.0F);
      this.a(ear.o, -1.0F);
      this.a(ear.x, -1.0F);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.a(ac.a(bvn.b.values(), $$0.D_()));
      if ($$3 == null) {
         $$3 = new bir.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean m_() {
      return false;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bra(this, 1.25));
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bqp(this, cca.class, 8.0F));
      this.bO.a(2, new brm(this));
      this.bO.a(2, new bqf(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bvn.a(this, 1.0));
      this.bO.a(3, new bqm(this));
      this.bO.a(3, new bqe(this, 1.0, 3.0F, 7.0F));
   }

   public static bkr.a gk() {
      return bjo.A().a(bks.l, 6.0).a(bks.f, 0.4F).a(bks.m, 0.2F);
   }

   @Override
   protected bsv b(cqb $$0) {
      bst $$1 = new bst(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.dj(), 3.46) || !this.dL().a_(this.ci).a(cte.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dL().z.a(400) == 0) {
         a(this.dL(), this);
      }

      super.b_();
      this.go();
   }

   @Override
   public void a(gw $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gl() {
      return this.ch;
   }

   private void go() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aA() && !this.bN() ? 4 : -1) * 0.3F;
      this.bX = asb.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehh $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cqb $$0, biw $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bjo> $$2 = $$0.a(bjo.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bjo $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               apf $$4 = b($$3.ag());
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
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if (!this.s() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.qX, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return bhe.a(this.dL().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new bij(bil.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return bhe.a(this.dL().B);
      } else if (!this.gr() && this.s() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.ge());
         }

         return bhe.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cjl $$0) {
      return false;
   }

   public static boolean c(bja<bvn> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
   }

   @Override
   public boolean a(bux $$0) {
      return false;
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      return null;
   }

   @Override
   public boolean C(biw $$0) {
      return $$0.a(this.dM().b((bjm)this), 3.0F);
   }

   @Nullable
   @Override
   public apf w() {
      return a(this.dL(), this.dL().z);
   }

   public static apf a(cqb $$0, ash $$1) {
      if ($$0.ai() != bhb.a && $$1.a(1000) == 0) {
         List<bja<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return apg.qV;
      }
   }

   private static apf b(bja<?> $$0) {
      return ce.getOrDefault($$0, apg.qV);
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.qZ;
   }

   @Override
   protected apf l_() {
      return apg.qW;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(apg.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eW() {
      return a(this.ag);
   }

   public static float a(ash $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aph da() {
      return aph.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(biw $$0) {
      if (!($$0 instanceof cca)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bvn.b gm() {
      return bvn.b.a(this.an.b(ca));
   }

   public void a(bvn.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bvn.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aA();
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends brt {
      public a(bjv $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehh h() {
         ehh $$0 = null;
         if (this.b.aX()) {
            $$0 = buf.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehh k() {
         gw $$0 = this.b.dl();
         gw.a $$1 = new gw.a();
         gw.a $$2 = new gw.a();

         for (gw $$4 : gw.b(
            asb.a(this.b.dq() - 3.0),
            asb.a(this.b.ds() - 6.0),
            asb.a(this.b.dw() - 3.0),
            asb.a(this.b.dq() + 3.0),
            asb.a(this.b.ds() + 6.0),
            asb.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dfd $$5 = this.b.dL().a_($$2.a($$4, ha.a));
               boolean $$6 = $$5.b() instanceof cxk || $$5.a(apv.t);
               if ($$6 && this.b.dL().t($$4) && this.b.dL().t($$1.a($$4, ha.b))) {
                  return ehh.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements asu {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bvn.b> f = asu.a(bvn.b::values);
      private static final IntFunction<bvn.b> g = aqu.a(bvn.b::a, values(), aqu.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bvn.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
