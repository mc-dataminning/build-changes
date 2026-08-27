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

public class bvh extends bvo implements bke<bvh.b>, bva {
   private static final aef<Integer> ca = aei.a(bvh.class, aeh.b);
   private static final Predicate<bji> cb = new Predicate<bji>() {
      public boolean a(@Nullable bji $$0) {
         return $$0 != null && bvh.ce.containsKey($$0.ah());
      }
   };
   private static final cja cc = cji.re;
   private static final Set<cja> cd = Sets.newHashSet(new cja[]{cji.oH, cji.rk, cji.rj, cji.ur, cji.uo, cji.up});
   static final Map<biu<?>, apd> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(biu.i, ape.ra);
      $$0.put(biu.n, ape.rw);
      $$0.put(biu.u, ape.rb);
      $$0.put(biu.y, ape.rc);
      $$0.put(biu.A, ape.rd);
      $$0.put(biu.C, ape.re);
      $$0.put(biu.F, ape.rf);
      $$0.put(biu.G, ape.rg);
      $$0.put(biu.Q, ape.rh);
      $$0.put(biu.V, ape.ri);
      $$0.put(biu.W, ape.rj);
      $$0.put(biu.Z, ape.rk);
      $$0.put(biu.aa, ape.rl);
      $$0.put(biu.al, ape.rm);
      $$0.put(biu.au, ape.rn);
      $$0.put(biu.aw, ape.ro);
      $$0.put(biu.ax, ape.rp);
      $$0.put(biu.ay, ape.rq);
      $$0.put(biu.aD, ape.rr);
      $$0.put(biu.aG, ape.rs);
      $$0.put(biu.aI, ape.rt);
      $$0.put(biu.aJ, ape.ru);
      $$0.put(biu.aL, ape.rv);
      $$0.put(biu.aS, ape.rw);
      $$0.put(biu.aU, ape.rx);
      $$0.put(biu.be, ape.ry);
      $$0.put(biu.bg, ape.rz);
      $$0.put(biu.bi, ape.rA);
      $$0.put(biu.bj, ape.rB);
      $$0.put(biu.bk, ape.rC);
      $$0.put(biu.bl, ape.rD);
      $$0.put(biu.bo, ape.rE);
      $$0.put(biu.bp, ape.rF);
      $$0.put(biu.br, ape.rG);
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

   public bvh(biu<? extends bvh> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bpb(this, 10, false);
      this.a(eax.n, -1.0F);
      this.a(eax.o, -1.0F);
      this.a(eax.x, -1.0F);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      this.a(ac.a(bvh.b.values(), $$0.D_()));
      if ($$3 == null) {
         $$3 = new bil.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean m_() {
      return false;
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqu(this, 1.25));
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bqj(this, cbu.class, 8.0F));
      this.bO.a(2, new brg(this));
      this.bO.a(2, new bpz(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new bvh.a(this, 1.0));
      this.bO.a(3, new bqg(this));
      this.bO.a(3, new bpy(this, 1.0, 3.0F, 7.0F));
   }

   public static bkl.a gj() {
      return bji.A().a(bkm.a, 6.0).a(bkm.e, 0.4F).a(bkm.d, 0.2F);
   }

   @Override
   protected bsp b(cpv $$0) {
      bsn $$1 = new bsn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void b_() {
      if (this.ci == null || !this.ci.a(this.dj(), 3.46) || !this.dL().a_(this.ci).a(csw.dT)) {
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
      this.bX = this.bX + (float)(!this.aB() && !this.bO() ? 4 : -1) * 0.3F;
      this.bX = arx.a(this.bX, 0.0F, 1.0F);
      if (!this.aB() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ehn $$0 = this.do();
      if (!this.aB() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cpv $$0, biq $$1) {
      if ($$1.bw() && !$$1.aT() && $$0.z.a(2) == 0) {
         List<bji> $$2 = $$0.a(bji.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bji $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aT()) {
               apd $$4 = b($$3.ah());
               $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), $$4, $$1.db(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (!this.s() && cd.contains($$2.d())) {
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         if (!this.aT()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), ape.qX, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return bgy.a(this.dL().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         this.b(new bid(bif.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return bgy.a(this.dL().B);
      } else if (!this.gq() && this.s() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.gd());
         }

         return bgy.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cjf $$0) {
      return false;
   }

   public static boolean c(biu<bvh> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(apt.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
   }

   @Override
   public boolean a(bur $$0) {
      return false;
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      return null;
   }

   @Override
   public boolean C(biq $$0) {
      return $$0.a(this.dM().b((bjg)this), 3.0F);
   }

   @Nullable
   @Override
   public apd w() {
      return a(this.dL(), this.dL().z);
   }

   public static apd a(cpv $$0, asc $$1) {
      if ($$0.ai() != bgv.a && $$1.a(1000) == 0) {
         List<biu<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return ape.qV;
      }
   }

   private static apd b(biu<?> $$0) {
      return ce.getOrDefault($$0, ape.qV);
   }

   @Override
   protected apd d(bho $$0) {
      return ape.qZ;
   }

   @Override
   protected apd l_() {
      return ape.qW;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.rH, 0.15F, 1.0F);
   }

   @Override
   protected boolean aS() {
      return this.aa > this.cg;
   }

   @Override
   protected void aR() {
      this.a(ape.qY, 0.15F, 1.0F);
      this.cg = this.aa + this.bX / 2.0F;
   }

   @Override
   public float eW() {
      return a(this.ag);
   }

   public static float a(asc $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public apf db() {
      return apf.g;
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   protected void D(biq $$0) {
      if (!($$0 instanceof cbu)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bvh.b gl() {
      return bvh.b.a(this.an.b(ca));
   }

   public void a(bvh.b $$0) {
      this.an.b(ca, $$0.h);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl().h);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.a(bvh.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gq() {
      return !this.aB();
   }

   @Override
   public ehn cJ() {
      return new ehn(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.4375F * $$2, 0.0F);
   }

   static class a extends brn {
      public a(bjp $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ehn h() {
         ehn $$0 = null;
         if (this.b.aY()) {
            $$0 = btz.a(this.b, 15, 15);
         }

         if (this.b.ef().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ehn k() {
         gw $$0 = this.b.dl();
         gw.a $$1 = new gw.a();
         gw.a $$2 = new gw.a();

         for (gw $$4 : gw.b(
            arx.a(this.b.dq() - 3.0),
            arx.a(this.b.ds() - 6.0),
            arx.a(this.b.dw() - 3.0),
            arx.a(this.b.dq() + 3.0),
            arx.a(this.b.ds() + 6.0),
            arx.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dfj $$5 = this.b.dL().a_($$2.a($$4, hc.a));
               boolean $$6 = $$5.b() instanceof cxc || $$5.a(apt.t);
               if ($$6 && this.b.dL().t($$4) && this.b.dL().t($$1.a($$4, hc.b))) {
                  return ehn.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements asp {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bvh.b> f = asp.a(bvh.b::values);
      private static final IntFunction<bvh.b> g = aqs.a(bvh.b::a, values(), aqs.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bvh.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
