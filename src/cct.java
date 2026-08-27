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

public class cct extends cda implements brn<cct.b>, ccm {
   private static final aiy<Integer> ce = ajc.a(cct.class, aja.b);
   private static final Predicate<bqq> cf = new Predicate<bqq>() {
      public boolean a(@Nullable bqq $$0) {
         return $$0 != null && cct.ci.containsKey($$0.ai());
      }
   };
   private static final cre cg = crm.rR;
   private static final Set<cre> ch = Sets.newHashSet(new cre[]{crm.pu, crm.rY, crm.rX, crm.vj, crm.vg, crm.vh});
   static final Map<bqb<?>, aul> ci = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bqb.i, aum.so);
      $$0.put(bqb.l, aum.sp);
      $$0.put(bqb.m, aum.sq);
      $$0.put(bqb.q, aum.sM);
      $$0.put(bqb.x, aum.sr);
      $$0.put(bqb.B, aum.ss);
      $$0.put(bqb.D, aum.st);
      $$0.put(bqb.F, aum.su);
      $$0.put(bqb.I, aum.sv);
      $$0.put(bqb.J, aum.sw);
      $$0.put(bqb.T, aum.sx);
      $$0.put(bqb.Y, aum.sy);
      $$0.put(bqb.Z, aum.sz);
      $$0.put(bqb.ac, aum.sA);
      $$0.put(bqb.ad, aum.sB);
      $$0.put(bqb.ao, aum.sC);
      $$0.put(bqb.ax, aum.sD);
      $$0.put(bqb.az, aum.sE);
      $$0.put(bqb.aA, aum.sF);
      $$0.put(bqb.aB, aum.sG);
      $$0.put(bqb.aG, aum.sH);
      $$0.put(bqb.aJ, aum.sI);
      $$0.put(bqb.aL, aum.sJ);
      $$0.put(bqb.aM, aum.sK);
      $$0.put(bqb.aO, aum.sL);
      $$0.put(bqb.aV, aum.sM);
      $$0.put(bqb.aX, aum.sN);
      $$0.put(bqb.bh, aum.sO);
      $$0.put(bqb.bj, aum.sP);
      $$0.put(bqb.bl, aum.sQ);
      $$0.put(bqb.bn, aum.sR);
      $$0.put(bqb.bo, aum.sS);
      $$0.put(bqb.bp, aum.sT);
      $$0.put(bqb.bs, aum.sU);
      $$0.put(bqb.bt, aum.sV);
      $$0.put(bqb.bv, aum.sW);
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

   public cct(bqb<? extends cct> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new bwl(this, 10, false);
      this.a(elj.n, -1.0F);
      this.a(elj.o, -1.0F);
      this.a(elj.x, -1.0F);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.a(ac.a(cct.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bpp.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   protected void z() {
      this.bR.a(0, new bye(this, 1.25));
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new bxt(this, cjt.class, 8.0F));
      this.bR.a(2, new byq(this));
      this.bR.a(2, new bxj(this, 1.0, 5.0F, 1.0F, true));
      this.bR.a(2, new cct.a(this, 1.0));
      this.bR.a(3, new bxq(this));
      this.bR.a(3, new bxi(this, 1.0, 3.0F, 7.0F));
   }

   public static bru.a gt() {
      return bqq.A().a(brv.q, 6.0).a(brv.j, 0.4F).a(brv.r, 0.2F);
   }

   @Override
   protected bzz b(cyx $$0) {
      bzx $$1 = new bzx(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void n_() {
      if (this.cm == null || !this.cm.a(this.dk(), 3.46) || !this.dM().a_(this.cm).a(dca.dT)) {
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
      this.cb = axk.a(this.cb, 0.0F, 1.0F);
      if (!this.aC() && this.cj < 1.0F) {
         this.cj = 1.0F;
      }

      this.cj *= 0.9F;
      esa $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cj * 2.0F;
   }

   public static boolean a(cyx $$0, bpv $$1) {
      if ($$1.bA() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bqq> $$2 = $$0.a(bqq.class, $$1.cH().g(20.0), cf);
         if (!$$2.isEmpty()) {
            bqq $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               aul $$4 = b($$3.ai());
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
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (!this.r() && ch.contains($$2.f())) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.sl, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return boa.a(this.dM().B);
      } else if (!$$2.a(cg)) {
         if (!this.gA() && this.r() && this.j($$0)) {
            if (!this.dM().B) {
               this.y(!this.gn());
            }

            return boa.a(this.dM().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bph(bpj.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return boa.a(this.dM().B);
      }
   }

   @Override
   public boolean o(crj $$0) {
      return false;
   }

   public static boolean c(bqb<cct> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bV) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
   }

   @Override
   public boolean a(ccd $$0) {
      return false;
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return null;
   }

   @Override
   public boolean C(bpv $$0) {
      return $$0.a(this.dN().b((bqo)this), 3.0F);
   }

   @Nullable
   @Override
   public aul v() {
      return a(this.dM(), this.dM().z);
   }

   public static aul a(cyx $$0, axr $$1) {
      if ($$0.ak() != bnx.a && $$1.a(1000) == 0) {
         List<bqb<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aum.sj;
      }
   }

   private static aul b(bqb<?> $$0) {
      return ci.getOrDefault($$0, aum.sj);
   }

   @Override
   protected aul d(bot $$0) {
      return aum.sn;
   }

   @Override
   protected aul o_() {
      return aum.sk;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.sX, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ck;
   }

   @Override
   protected void aS() {
      this.a(aum.sm, 0.15F, 1.0F);
      this.ck = this.aa + this.cb / 2.0F;
   }

   @Override
   public float fc() {
      return a(this.ag);
   }

   public static float a(axr $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aun db() {
      return aun.g;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected void D(bpv $$0) {
      if (!($$0 instanceof cjt)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cct.b gv() {
      return cct.b.a(this.an.a(ce));
   }

   public void a(cct.b $$0) {
      this.an.a(ce, $$0.h);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().h);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(cct.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends byx {
      public a(bqw $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected esa h() {
         esa $$0 = null;
         if (this.b.bc()) {
            $$0 = cbl.a(this.b, 15, 15);
         }

         if (this.b.ei().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private esa k() {
         ib $$0 = this.b.dm();
         ib.a $$1 = new ib.a();
         ib.a $$2 = new ib.a();

         for (ib $$4 : ib.b(
            axk.a(this.b.dr() - 3.0),
            axk.a(this.b.dt() - 6.0),
            axk.a(this.b.dx() - 3.0),
            axk.a(this.b.dr() + 3.0),
            axk.a(this.b.dt() + 6.0),
            axk.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               doz $$5 = this.b.dM().a_($$2.a($$4, ih.a));
               boolean $$6 = $$5.b() instanceof dgh || $$5.a(avc.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ih.b))) {
                  return esa.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements aye {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<cct.b> f = aye.a(cct.b::values);
      private static final IntFunction<cct.b> g = awb.a(cct.b::a, values(), awb.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cct.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
