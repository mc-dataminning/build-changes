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

public class cdj extends cdq implements bsd<cdj.b>, cdc {
   private static final ajk<Integer> cf = ajo.a(cdj.class, ajm.b);
   private static final Predicate<brg> cg = new Predicate<brg>() {
      public boolean a(@Nullable brg $$0) {
         return $$0 != null && cdj.cj.containsKey($$0.ai());
      }
   };
   private static final cry ch = csg.rS;
   private static final Set<cry> ci = Sets.newHashSet(new cry[]{csg.pv, csg.rZ, csg.rY, csg.vl, csg.vi, csg.vj});
   static final Map<bqr<?>, auy> cj = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bqr.i, auz.sv);
      $$0.put(bqr.l, auz.sw);
      $$0.put(bqr.m, auz.sx);
      $$0.put(bqr.q, auz.sT);
      $$0.put(bqr.x, auz.sy);
      $$0.put(bqr.B, auz.sz);
      $$0.put(bqr.D, auz.sA);
      $$0.put(bqr.F, auz.sB);
      $$0.put(bqr.I, auz.sC);
      $$0.put(bqr.J, auz.sD);
      $$0.put(bqr.T, auz.sE);
      $$0.put(bqr.Y, auz.sF);
      $$0.put(bqr.Z, auz.sG);
      $$0.put(bqr.ac, auz.sH);
      $$0.put(bqr.ad, auz.sI);
      $$0.put(bqr.ao, auz.sJ);
      $$0.put(bqr.ax, auz.sK);
      $$0.put(bqr.az, auz.sL);
      $$0.put(bqr.aA, auz.sM);
      $$0.put(bqr.aB, auz.sN);
      $$0.put(bqr.aG, auz.sO);
      $$0.put(bqr.aJ, auz.sP);
      $$0.put(bqr.aL, auz.sQ);
      $$0.put(bqr.aM, auz.sR);
      $$0.put(bqr.aO, auz.sS);
      $$0.put(bqr.aV, auz.sT);
      $$0.put(bqr.aX, auz.sU);
      $$0.put(bqr.bh, auz.sV);
      $$0.put(bqr.bj, auz.sW);
      $$0.put(bqr.bl, auz.sX);
      $$0.put(bqr.bn, auz.sY);
      $$0.put(bqr.bo, auz.sZ);
      $$0.put(bqr.bp, auz.ta);
      $$0.put(bqr.bs, auz.tb);
      $$0.put(bqr.bt, auz.tc);
      $$0.put(bqr.bv, auz.td);
   });
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private im cn;

   public cdj(bqr<? extends cdj> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new bxb(this, 10, false);
      this.a(emi.n, -1.0F);
      this.a(emi.o, -1.0F);
      this.a(emi.x, -1.0F);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.a(ac.a(cdj.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bqf.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bS.a(0, new byu(this, 1.25));
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new byj(this, ckl.class, 8.0F));
      this.bS.a(2, new bzg(this));
      this.bS.a(2, new bxz(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new cdj.a(this, 1.0));
      this.bS.a(3, new byg(this));
      this.bS.a(3, new bxy(this, 1.0, 3.0F, 7.0F));
   }

   public static bsk.a gv() {
      return brg.A().a(bsl.q, 6.0).a(bsl.j, 0.4F).a(bsl.r, 0.2F);
   }

   @Override
   protected cap b(czu $$0) {
      can $$1 = new can(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cn == null || !this.cn.a(this.dl(), 3.46) || !this.dN().a_(this.cn).a(dcx.dT)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.dN().z.a(400) == 0) {
         a(this.dN(), this);
      }

      super.n_();
      this.gz();
   }

   @Override
   public void a(im $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean gw() {
      return this.cm;
   }

   private void gz() {
      this.ce = this.cb;
      this.cd = this.cc;
      this.cc = this.cc + (float)(!this.aC() && !this.bP() ? 4 : -1) * 0.3F;
      this.cc = axw.a(this.cc, 0.0F, 1.0F);
      if (!this.aC() && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      etf $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.cb = this.cb + this.ck * 2.0F;
   }

   public static boolean a(czu $$0, bql $$1) {
      if ($$1.bB() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<brg> $$2 = $$0.a(brg.class, $$1.cI().g(20.0), cg);
         if (!$$2.isEmpty()) {
            brg $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               auy $$4 = b($$3.ai());
               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$4, $$1.dc(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (!this.r() && ci.contains($$2.f())) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), auz.ss, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }

         if (!this.dN().B) {
            if (this.ah.a(10) == 0) {
               this.f($$0);
               this.dN().a(this, (byte)7);
            } else {
               this.dN().a(this, (byte)6);
            }
         }

         return boq.a(this.dN().B);
      } else if (!$$2.a(ch)) {
         if (!this.gC() && this.r() && this.j($$0)) {
            if (!this.dN().B) {
               this.y(!this.gp());
            }

            return boq.a(this.dN().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bpx(bpz.s, 900));
         if ($$0.f() || !this.cs()) {
            this.a(this.dO().a($$0), Float.MAX_VALUE);
         }

         return boq.a(this.dN().B);
      }
   }

   @Override
   public boolean o(csd $$0) {
      return false;
   }

   public static boolean c(bqr<cdj> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bV) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   public boolean a(cct $$0) {
      return false;
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      return null;
   }

   @Override
   public boolean C(bql $$0) {
      return $$0.a(this.dO().b((bre)this), 3.0F);
   }

   @Nullable
   @Override
   public auy v() {
      return a(this.dN(), this.dN().z);
   }

   public static auy a(czu $$0, ayd $$1) {
      if ($$0.ak() != bon.a && $$1.a(1000) == 0) {
         List<bqr<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return auz.sq;
      }
   }

   private static auy b(bqr<?> $$0) {
      return cj.getOrDefault($$0, auz.sq);
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.su;
   }

   @Override
   protected auy o_() {
      return auz.sr;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.te, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.ab > this.cl;
   }

   @Override
   protected void aS() {
      this.a(auz.st, 0.15F, 1.0F);
      this.cl = this.ab + this.cc / 2.0F;
   }

   @Override
   public float fd() {
      return a(this.ah);
   }

   public static float a(ayd $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public ava dc() {
      return ava.g;
   }

   @Override
   public boolean by() {
      return true;
   }

   @Override
   protected void D(bql $$0) {
      if (!($$0 instanceof ckl)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cdj.b gx() {
      return cdj.b.a(this.ao.a(cf));
   }

   public void a(cdj.b $$0) {
      this.ao.a(cf, $$0.h);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx().h);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cdj.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gC() {
      return !this.aC();
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.5F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   static class a extends bzn {
      public a(brm $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected etf h() {
         etf $$0 = null;
         if (this.b.bc()) {
            $$0 = ccb.a(this.b, 15, 15);
         }

         if (this.b.ej().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private etf k() {
         im $$0 = this.b.dn();
         im.a $$1 = new im.a();
         im.a $$2 = new im.a();

         for (im $$4 : im.b(
            axw.a(this.b.ds() - 3.0),
            axw.a(this.b.du() - 6.0),
            axw.a(this.b.dy() - 3.0),
            axw.a(this.b.ds() + 3.0),
            axw.a(this.b.du() + 6.0),
            axw.a(this.b.dy() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dpy $$5 = this.b.dN().a_($$2.a($$4, ir.a));
               boolean $$6 = $$5.b() instanceof dhf || $$5.a(avo.t);
               if ($$6 && this.b.dN().u($$4) && this.b.dN().u($$1.a($$4, ir.b))) {
                  return etf.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ayq {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cdj.b> f = ayq.a(cdj.b::values);
      private static final IntFunction<cdj.b> g = awn.a(cdj.b::a, values(), awn.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cdj.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
