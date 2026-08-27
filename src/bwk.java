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

public class bwk extends bwr implements blh<bwk.b>, bwd {
   private static final afc<Integer> ca = aff.a(bwk.class, afe.b);
   private static final Predicate<bkl> cb = new Predicate<bkl>() {
      public boolean a(@Nullable bkl $$0) {
         return $$0 != null && bwk.ce.containsKey($$0.ag());
      }
   };
   private static final cke cc = ckm.re;
   private static final Set<cke> cd = Sets.newHashSet(new cke[]{ckm.oH, ckm.rk, ckm.rj, ckm.ur, ckm.uo, ckm.up});
   static final Map<bjx<?>, aqc> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bjx.i, aqd.rc);
      $$0.put(bjx.n, aqd.ry);
      $$0.put(bjx.u, aqd.rd);
      $$0.put(bjx.y, aqd.re);
      $$0.put(bjx.A, aqd.rf);
      $$0.put(bjx.C, aqd.rg);
      $$0.put(bjx.F, aqd.rh);
      $$0.put(bjx.G, aqd.ri);
      $$0.put(bjx.Q, aqd.rj);
      $$0.put(bjx.V, aqd.rk);
      $$0.put(bjx.W, aqd.rl);
      $$0.put(bjx.Z, aqd.rm);
      $$0.put(bjx.aa, aqd.rn);
      $$0.put(bjx.al, aqd.ro);
      $$0.put(bjx.au, aqd.rp);
      $$0.put(bjx.aw, aqd.rq);
      $$0.put(bjx.ax, aqd.rr);
      $$0.put(bjx.ay, aqd.rs);
      $$0.put(bjx.aD, aqd.rt);
      $$0.put(bjx.aG, aqd.ru);
      $$0.put(bjx.aI, aqd.rv);
      $$0.put(bjx.aJ, aqd.rw);
      $$0.put(bjx.aL, aqd.rx);
      $$0.put(bjx.aS, aqd.ry);
      $$0.put(bjx.aU, aqd.rz);
      $$0.put(bjx.be, aqd.rA);
      $$0.put(bjx.bg, aqd.rB);
      $$0.put(bjx.bi, aqd.rC);
      $$0.put(bjx.bj, aqd.rD);
      $$0.put(bjx.bk, aqd.rE);
      $$0.put(bjx.bl, aqd.rF);
      $$0.put(bjx.bo, aqd.rG);
      $$0.put(bjx.bp, aqd.rH);
      $$0.put(bjx.br, aqd.rI);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private ht ci;

   public bwk(bjx<? extends bwk> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqe(this, 10, false);
      this.a(ebp.n, -1.0F);
      this.a(ebp.o, -1.0F);
      this.a(ebp.x, -1.0F);
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.a(ac.a(bwk.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bjo.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void z() {
      this.bO.a(0, new brx(this, 1.25));
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new brm(this, ccx.class, 8.0F));
      this.bO.a(2, new bsj(this));
      this.bO.a(2, new brc(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bwk.a(this, 1.0));
      this.bO.a(3, new brj(this));
      this.bO.a(3, new brb(this, 1.0, 3.0F, 7.0F));
   }

   public static blo.a gk() {
      return bkl.A().a(blp.l, 6.0).a(blp.f, 0.4F).a(blp.m, 0.2F);
   }

   @Override
   protected bts b(cqz $$0) {
      btq $$1 = new btq(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void c_() {
      if (this.ci == null || !this.ci.a(this.dj(), 3.46) || !this.dL().a_(this.ci).a(cuc.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dL().z.a(400) == 0) {
         a(this.dL(), this);
      }

      super.c_();
      this.go();
   }

   @Override
   public void a(ht $$0, boolean $$1) {
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
      this.bX = asy.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      eif $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cqz $$0, bjt $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bkl> $$2 = $$0.a(bkl.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bkl $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               aqc $$4 = b($$3.ag());
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
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (!this.s() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.qZ, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return bib.a(this.dL().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new bjg(bji.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return bib.a(this.dL().B);
      } else if (!this.gr() && this.s() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.ge());
         }

         return bib.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(ckj $$0) {
      return false;
   }

   public static boolean c(bjx<bwk> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
   }

   @Override
   public boolean a(bvu $$0) {
      return false;
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      return null;
   }

   @Override
   public boolean C(bjt $$0) {
      return $$0.a(this.dM().b((bkj)this), 3.0F);
   }

   @Nullable
   @Override
   public aqc w() {
      return a(this.dL(), this.dL().z);
   }

   public static aqc a(cqz $$0, ate $$1) {
      if ($$0.ai() != bhy.a && $$1.a(1000) == 0) {
         List<bjx<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aqd.qX;
      }
   }

   private static aqc b(bjx<?> $$0) {
      return ce.getOrDefault($$0, aqd.qX);
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.rb;
   }

   @Override
   protected aqc m_() {
      return aqd.qY;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.rJ, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(aqd.ra, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eW() {
      return a(this.ag);
   }

   public static float a(ate $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqe da() {
      return aqe.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(bjt $$0) {
      if (!($$0 instanceof ccx)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bwk.b gm() {
      return bwk.b.a(this.an.b(ca));
   }

   public void a(bwk.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(bwk.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aA();
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends bsq {
      public a(bks $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eif h() {
         eif $$0 = null;
         if (this.b.aX()) {
            $$0 = bvc.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eif k() {
         ht $$0 = this.b.dl();
         ht.a $$1 = new ht.a();
         ht.a $$2 = new ht.a();

         for (ht $$4 : ht.b(
            asy.a(this.b.dq() - 3.0),
            asy.a(this.b.ds() - 6.0),
            asy.a(this.b.dw() - 3.0),
            asy.a(this.b.dq() + 3.0),
            asy.a(this.b.ds() + 6.0),
            asy.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dgb $$5 = this.b.dL().a_($$2.a($$4, hx.a));
               boolean $$6 = $$5.b() instanceof cyi || $$5.a(aqs.t);
               if ($$6 && this.b.dL().t($$4) && this.b.dL().t($$1.a($$4, hx.b))) {
                  return eif.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements atr {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bwk.b> f = atr.a(bwk.b::values);
      private static final IntFunction<bwk.b> g = arr.a(bwk.b::a, values(), arr.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bwk.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
