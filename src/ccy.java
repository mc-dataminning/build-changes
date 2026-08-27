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

public class ccy extends cdf implements brs<ccy.b>, ccr {
   private static final aja<Integer> ce = aje.a(ccy.class, ajc.b);
   private static final Predicate<bqv> cf = new Predicate<bqv>() {
      public boolean a(@Nullable bqv $$0) {
         return $$0 != null && ccy.ci.containsKey($$0.ai());
      }
   };
   private static final crn cg = crv.rR;
   private static final Set<crn> ch = Sets.newHashSet(new crn[]{crv.pu, crv.rY, crv.rX, crv.vj, crv.vg, crv.vh});
   static final Map<bqg<?>, aun> ci = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bqg.i, auo.so);
      $$0.put(bqg.l, auo.sp);
      $$0.put(bqg.m, auo.sq);
      $$0.put(bqg.q, auo.sM);
      $$0.put(bqg.x, auo.sr);
      $$0.put(bqg.B, auo.ss);
      $$0.put(bqg.D, auo.st);
      $$0.put(bqg.F, auo.su);
      $$0.put(bqg.I, auo.sv);
      $$0.put(bqg.J, auo.sw);
      $$0.put(bqg.T, auo.sx);
      $$0.put(bqg.Y, auo.sy);
      $$0.put(bqg.Z, auo.sz);
      $$0.put(bqg.ac, auo.sA);
      $$0.put(bqg.ad, auo.sB);
      $$0.put(bqg.ao, auo.sC);
      $$0.put(bqg.ax, auo.sD);
      $$0.put(bqg.az, auo.sE);
      $$0.put(bqg.aA, auo.sF);
      $$0.put(bqg.aB, auo.sG);
      $$0.put(bqg.aG, auo.sH);
      $$0.put(bqg.aJ, auo.sI);
      $$0.put(bqg.aL, auo.sJ);
      $$0.put(bqg.aM, auo.sK);
      $$0.put(bqg.aO, auo.sL);
      $$0.put(bqg.aV, auo.sM);
      $$0.put(bqg.aX, auo.sN);
      $$0.put(bqg.bh, auo.sO);
      $$0.put(bqg.bj, auo.sP);
      $$0.put(bqg.bl, auo.sQ);
      $$0.put(bqg.bn, auo.sR);
      $$0.put(bqg.bo, auo.sS);
      $$0.put(bqg.bp, auo.sT);
      $$0.put(bqg.bs, auo.sU);
      $$0.put(bqg.bt, auo.sV);
      $$0.put(bqg.bv, auo.sW);
   });
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private id cm;

   public ccy(bqg<? extends ccy> $$0, czg $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 10, false);
      this.a(els.n, -1.0F);
      this.a(els.o, -1.0F);
      this.a(els.x, -1.0F);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.a(ac.a(ccy.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bpu.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bR.a(0, new byj(this, 1.25));
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new bxy(this, cka.class, 8.0F));
      this.bR.a(2, new byv(this));
      this.bR.a(2, new bxo(this, 1.0, 5.0F, 1.0F, true));
      this.bR.a(2, new ccy.a(this, 1.0));
      this.bR.a(3, new bxv(this));
      this.bR.a(3, new bxn(this, 1.0, 3.0F, 7.0F));
   }

   public static brz.a gt() {
      return bqv.A().a(bsa.q, 6.0).a(bsa.j, 0.4F).a(bsa.r, 0.2F);
   }

   @Override
   protected cae b(czg $$0) {
      cac $$1 = new cac(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dk(), 3.46) || !this.dM().a_(this.cm).a(dcj.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dM().z.a(400) == 0) {
         a(this.dM(), this);
      }

      super.n_();
      this.gx();
   }

   @Override
   public void a(id $$0, boolean $$1) {
      this.cm = $$0;
      this.cl = $$1;
   }

   public boolean gu() {
      return this.cl;
   }

   private void gx() {
      this.cd = this.ca;
      this.cc = this.cb;
      this.cb = this.cb + (float)(!this.aC() && !this.bO() ? 4 : -1) * 0.3F;
      this.cb = axm.a(this.cb, 0.0F, 1.0F);
      if (!this.aC() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      esj $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cj * 2.0F;
   }

   public static boolean a(czg $$0, bqa $$1) {
      if ($$1.bA() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bqv> $$2 = $$0.a(bqv.class, $$1.cH().g(20.0), cf);
         if (!$$2.isEmpty()) {
            bqv $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               aun $$4 = b($$3.ai());
               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$4, $$1.db(), 0.7F, a($$0.z));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if (!this.r() && ch.contains($$2.f())) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.sl, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bof.a(this.dM().B);
      } else if (!$$2.a(cg)) {
         if (!this.gA() && this.r() && this.j($$0)) {
            if (!this.dM().B) {
               this.y(!this.gn());
            }

            return bof.a(this.dM().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bpm(bpo.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bof.a(this.dM().B);
      }
   }

   @Override
   public boolean o(crs $$0) {
      return false;
   }

   public static boolean c(bqg<ccy> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bV) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
   }

   @Override
   public boolean a(cci $$0) {
      return false;
   }

   @Nullable
   @Override
   public bpu a(apu $$0, bpu $$1) {
      return null;
   }

   @Override
   public boolean C(bqa $$0) {
      return $$0.a(this.dN().b((bqt)this), 3.0F);
   }

   @Nullable
   @Override
   public aun v() {
      return a(this.dM(), this.dM().z);
   }

   public static aun a(czg $$0, axt $$1) {
      if ($$0.ak() != boc.a && $$1.a(1000) == 0) {
         List<bqg<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return auo.sj;
      }
   }

   private static aun b(bqg<?> $$0) {
      return ci.getOrDefault($$0, auo.sj);
   }

   @Override
   protected aun d(boy $$0) {
      return auo.sn;
   }

   @Override
   protected aun o_() {
      return auo.sk;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.sX, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ck;
   }

   @Override
   protected void aS() {
      this.a(auo.sm, 0.15F, 1.0F);
      this.ck = this.aa + this.cb / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ag);
   }

   public static float a(axt $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aup db() {
      return aup.g;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected void D(bqa $$0) {
      if (!($$0 instanceof cka)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public ccy.b gv() {
      return ccy.b.a(this.an.a(ce));
   }

   public void a(ccy.b $$0) {
      this.an.a(ce, $$0.h);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().h);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(ccy.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends bzc {
      public a(brb $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected esj h() {
         esj $$0 = null;
         if (this.b.bc()) {
            $$0 = cbq.a(this.b, 15, 15);
         }

         if (this.b.ei().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private esj k() {
         id $$0 = this.b.dm();
         id.a $$1 = new id.a();
         id.a $$2 = new id.a();

         for (id $$4 : id.b(
            axm.a(this.b.dr() - 3.0),
            axm.a(this.b.dt() - 6.0),
            axm.a(this.b.dx() - 3.0),
            axm.a(this.b.dr() + 3.0),
            axm.a(this.b.dt() + 6.0),
            axm.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dpi $$5 = this.b.dM().a_($$2.a($$4, ij.a));
               boolean $$6 = $$5.b() instanceof dgq || $$5.a(ave.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ij.b))) {
                  return esj.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements ayg {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<ccy.b> f = ayg.a(ccy.b::values);
      private static final IntFunction<ccy.b> g = awd.a(ccy.b::a, values(), awd.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static ccy.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
