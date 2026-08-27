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

public class cbt extends cca implements bqn<cbt.b>, cbm {
   private static final aim<Integer> ce = aiq.a(cbt.class, aio.b);
   private static final Predicate<bpq> cf = new Predicate<bpq>() {
      public boolean a(@Nullable bpq $$0) {
         return $$0 != null && cbt.ci.containsKey($$0.ai());
      }
   };
   private static final cqf cg = cqn.rR;
   private static final Set<cqf> ch = Sets.newHashSet(new cqf[]{cqn.pu, cqn.rY, cqn.rX, cqn.vi, cqn.vf, cqn.vg});
   static final Map<bpc<?>, atx> ci = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bpc.j, aty.sh);
      $$0.put(bpc.m, aty.si);
      $$0.put(bpc.q, aty.sE);
      $$0.put(bpc.x, aty.sj);
      $$0.put(bpc.B, aty.sk);
      $$0.put(bpc.D, aty.sl);
      $$0.put(bpc.F, aty.sm);
      $$0.put(bpc.I, aty.sn);
      $$0.put(bpc.J, aty.so);
      $$0.put(bpc.T, aty.sp);
      $$0.put(bpc.Y, aty.sq);
      $$0.put(bpc.Z, aty.sr);
      $$0.put(bpc.ac, aty.ss);
      $$0.put(bpc.ad, aty.st);
      $$0.put(bpc.ao, aty.su);
      $$0.put(bpc.ax, aty.sv);
      $$0.put(bpc.az, aty.sw);
      $$0.put(bpc.aA, aty.sx);
      $$0.put(bpc.aB, aty.sy);
      $$0.put(bpc.aG, aty.sz);
      $$0.put(bpc.aJ, aty.sA);
      $$0.put(bpc.aL, aty.sB);
      $$0.put(bpc.aM, aty.sC);
      $$0.put(bpc.aO, aty.sD);
      $$0.put(bpc.aV, aty.sE);
      $$0.put(bpc.aX, aty.sF);
      $$0.put(bpc.bh, aty.sG);
      $$0.put(bpc.bj, aty.sH);
      $$0.put(bpc.bl, aty.sI);
      $$0.put(bpc.bn, aty.sJ);
      $$0.put(bpc.bo, aty.sK);
      $$0.put(bpc.bp, aty.sL);
      $$0.put(bpc.bs, aty.sM);
      $$0.put(bpc.bt, aty.sN);
      $$0.put(bpc.bv, aty.sO);
   });
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   private float cj = 1.0F;
   private float ck = 1.0F;
   private boolean cl;
   @Nullable
   private ib cm;

   public cbt(bpc<? extends cbt> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new bvl(this, 10, false);
      this.a(eiy.n, -1.0F);
      this.a(eiy.o, -1.0F);
      this.a(eiy.x, -1.0F);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      this.a(ac.a(cbt.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bor.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxe(this, 1.25));
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new bwt(this, cis.class, 8.0F));
      this.bR.a(2, new bxq(this));
      this.bR.a(2, new bwj(this, 1.0, 5.0F, 1.0F, true));
      this.bR.a(2, new cbt.a(this, 1.0));
      this.bR.a(3, new bwq(this));
      this.bR.a(3, new bwi(this, 1.0, 3.0F, 7.0F));
   }

   public static bqu.a gt() {
      return bpq.A().a(bqv.q, 6.0).a(bqv.j, 0.4F).a(bqv.r, 0.2F);
   }

   @Override
   protected byz b(cwz $$0) {
      byx $$1 = new byx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cm == null || !this.cm.a(this.dk(), 3.46) || !this.dM().a_(this.cm).a(dac.dT)) {
         this.cl = false;
         this.cm = null;
      }

      if (this.dM().z.a(400) == 0) {
         a(this.dM(), this);
      }

      super.m_();
      this.gx();
   }

   @Override
   public void a(ib $$0, boolean $$1) {
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
      this.cb = aww.a(this.cb, 0.0F, 1.0F);
      if (!this.aC() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      epr $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cj * 2.0F;
   }

   public static boolean a(cwz $$0, bow $$1) {
      if ($$1.bA() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bpq> $$2 = $$0.a(bpq.class, $$1.cH().g(20.0), cf);
         if (!$$2.isEmpty()) {
            bpq $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               atx $$4 = b($$3.ai());
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
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if (!this.r() && ch.contains($$2.d())) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.se, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bnc.a(this.dM().B);
      } else if (!$$2.a(cg)) {
         if (!this.gA() && this.r() && this.j($$0)) {
            if (!this.dM().B) {
               this.y(!this.gn());
            }

            return bnc.a(this.dM().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new boj(bol.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bnc.a(this.dM().B);
      }
   }

   @Override
   public boolean o(cqk $$0) {
      return false;
   }

   public static boolean c(bpc<cbt> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bV) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dmz $$2, ib $$3) {
   }

   @Override
   public boolean a(cbd $$0) {
      return false;
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return null;
   }

   @Override
   public boolean C(bow $$0) {
      return $$0.a(this.dN().b((bpo)this), 3.0F);
   }

   @Nullable
   @Override
   public atx v() {
      return a(this.dM(), this.dM().z);
   }

   public static atx a(cwz $$0, axd $$1) {
      if ($$0.aj() != bmz.a && $$1.a(1000) == 0) {
         List<bpc<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aty.sc;
      }
   }

   private static atx b(bpc<?> $$0) {
      return ci.getOrDefault($$0, aty.sc);
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.sg;
   }

   @Override
   protected atx n_() {
      return aty.sd;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.sP, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ck;
   }

   @Override
   protected void aS() {
      this.a(aty.sf, 0.15F, 1.0F);
      this.ck = this.aa + this.cb / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ag);
   }

   public static float a(axd $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public atz db() {
      return atz.g;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected void D(bow $$0) {
      if (!($$0 instanceof cis)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cbt.b gv() {
      return cbt.b.a(this.an.a(ce));
   }

   public void a(cbt.b $$0) {
      this.an.a(ce, $$0.h);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().h);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cbt.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends bxx {
      public a(bpw $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected epr h() {
         epr $$0 = null;
         if (this.b.bc()) {
            $$0 = cal.a(this.b, 15, 15);
         }

         if (this.b.ei().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private epr k() {
         ib $$0 = this.b.dm();
         ib.a $$1 = new ib.a();
         ib.a $$2 = new ib.a();

         for (ib $$4 : ib.b(
            aww.a(this.b.dr() - 3.0),
            aww.a(this.b.dt() - 6.0),
            aww.a(this.b.dx() - 3.0),
            aww.a(this.b.dr() + 3.0),
            aww.a(this.b.dt() + 6.0),
            aww.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dmz $$5 = this.b.dM().a_($$2.a($$4, ih.a));
               boolean $$6 = $$5.b() instanceof dej || $$5.a(aun.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ih.b))) {
                  return epr.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements axq {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cbt.b> f = axq.a(cbt.b::values);
      private static final IntFunction<cbt.b> g = avn.a(cbt.b::a, values(), avn.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cbt.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
