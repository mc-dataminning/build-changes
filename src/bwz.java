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

public class bwz extends bxg implements blw<bwz.b>, bws {
   private static final afm<Integer> ca = afp.a(bwz.class, afo.b);
   private static final Predicate<bla> cb = new Predicate<bla>() {
      public boolean a(@Nullable bla $$0) {
         return $$0 != null && bwz.ce.containsKey($$0.ag());
      }
   };
   private static final ckw cc = cle.re;
   private static final Set<ckw> cd = Sets.newHashSet(new ckw[]{cle.oH, cle.rl, cle.rk, cle.us, cle.up, cle.uq});
   static final Map<bkm<?>, aqm> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bkm.i, aqn.re);
      $$0.put(bkm.n, aqn.rA);
      $$0.put(bkm.u, aqn.rf);
      $$0.put(bkm.y, aqn.rg);
      $$0.put(bkm.A, aqn.rh);
      $$0.put(bkm.C, aqn.ri);
      $$0.put(bkm.F, aqn.rj);
      $$0.put(bkm.G, aqn.rk);
      $$0.put(bkm.Q, aqn.rl);
      $$0.put(bkm.V, aqn.rm);
      $$0.put(bkm.W, aqn.rn);
      $$0.put(bkm.Z, aqn.ro);
      $$0.put(bkm.aa, aqn.rp);
      $$0.put(bkm.al, aqn.rq);
      $$0.put(bkm.au, aqn.rr);
      $$0.put(bkm.aw, aqn.rs);
      $$0.put(bkm.ax, aqn.rt);
      $$0.put(bkm.ay, aqn.ru);
      $$0.put(bkm.aD, aqn.rv);
      $$0.put(bkm.aG, aqn.rw);
      $$0.put(bkm.aI, aqn.rx);
      $$0.put(bkm.aJ, aqn.ry);
      $$0.put(bkm.aL, aqn.rz);
      $$0.put(bkm.aS, aqn.rA);
      $$0.put(bkm.aU, aqn.rB);
      $$0.put(bkm.be, aqn.rC);
      $$0.put(bkm.bg, aqn.rD);
      $$0.put(bkm.bi, aqn.rE);
      $$0.put(bkm.bj, aqn.rF);
      $$0.put(bkm.bk, aqn.rG);
      $$0.put(bkm.bl, aqn.rH);
      $$0.put(bkm.bo, aqn.rI);
      $$0.put(bkm.bp, aqn.rJ);
      $$0.put(bkm.br, aqn.rK);
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

   public bwz(bkm<? extends bwz> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bqt(this, 10, false);
      this.a(ecr.n, -1.0F);
      this.a(ecr.o, -1.0F);
      this.a(ecr.x, -1.0F);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.a(ac.a(bwz.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bkd.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bsm(this, 1.25));
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsb(this, cdm.class, 8.0F));
      this.bO.a(2, new bsy(this));
      this.bO.a(2, new brr(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bwz.a(this, 1.0));
      this.bO.a(3, new bry(this));
      this.bO.a(3, new brq(this, 1.0, 3.0F, 7.0F));
   }

   public static bmd.a gk() {
      return bla.A().a(bme.l, 6.0).a(bme.f, 0.4F).a(bme.m, 0.2F);
   }

   @Override
   protected buh b(crs $$0) {
      buf $$1 = new buf(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void c_() {
      if (this.ci == null || !this.ci.a(this.dj(), 3.46) || !this.dL().a_(this.ci).a(cuv.dT)) {
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
      this.bX = ati.a(this.bX, 0.0F, 1.0F);
      if (!this.aA() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      eji $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(crs $$0, bki $$1) {
      if ($$1.bv() && !$$1.aS() && $$0.z.a(2) == 0) {
         List<bla> $$2 = $$0.a(bla.class, $$1.cG().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bla $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aS()) {
               aqm $$4 = b($$3.ag());
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
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (!this.s() && cd.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aS()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.rb, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return biq.a(this.dL().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new bjv(bjx.s, 900));
         if ($$0.f() || !this.cq()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return biq.a(this.dL().B);
      } else if (!this.gr() && this.s() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.ge());
         }

         return biq.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(clb $$0) {
      return false;
   }

   public static boolean c(bkm<bwz> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
   }

   @Override
   public boolean a(bwj $$0) {
      return false;
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      return null;
   }

   @Override
   public boolean C(bki $$0) {
      return $$0.a(this.dM().b((bky)this), 3.0F);
   }

   @Nullable
   @Override
   public aqm w() {
      return a(this.dL(), this.dL().z);
   }

   public static aqm a(crs $$0, ato $$1) {
      if ($$0.ai() != bin.a && $$1.a(1000) == 0) {
         List<bkm<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aqn.qZ;
      }
   }

   private static aqm b(bkm<?> $$0) {
      return ce.getOrDefault($$0, aqn.qZ);
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.rd;
   }

   @Override
   protected aqm m_() {
      return aqn.ra;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.rL, 0.15F, 1.0F);
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cg;
   }

   @Override
   protected void aQ() {
      this.a(aqn.rc, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eW() {
      return a(this.ag);
   }

   public static float a(ato $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqo da() {
      return aqo.g;
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected void D(bki $$0) {
      if (!($$0 instanceof cdm)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bwz.b gm() {
      return bwz.b.a(this.an.b(ca));
   }

   public void a(bwz.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().h);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bwz.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gr() {
      return !this.aA();
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends btf {
      public a(blh $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected eji h() {
         eji $$0 = null;
         if (this.b.aX()) {
            $$0 = bvr.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private eji k() {
         ht $$0 = this.b.dl();
         ht.a $$1 = new ht.a();
         ht.a $$2 = new ht.a();

         for (ht $$4 : ht.b(
            ati.a(this.b.dq() - 3.0),
            ati.a(this.b.ds() - 6.0),
            ati.a(this.b.dw() - 3.0),
            ati.a(this.b.dq() + 3.0),
            ati.a(this.b.ds() + 6.0),
            ati.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dgw $$5 = this.b.dL().a_($$2.a($$4, hx.a));
               boolean $$6 = $$5.b() instanceof czc || $$5.a(arc.t);
               if ($$6 && this.b.dL().t($$4) && this.b.dL().t($$1.a($$4, hx.b))) {
                  return eji.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements aub {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bwz.b> f = aub.a(bwz.b::values);
      private static final IntFunction<bwz.b> g = asb.a(bwz.b::a, values(), asb.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bwz.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
