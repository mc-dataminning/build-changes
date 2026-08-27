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

public class cbu extends ccb implements bqo<cbu.b>, cbn {
   private static final aim<Integer> ce = aiq.a(cbu.class, aio.b);
   private static final Predicate<bpr> cf = new Predicate<bpr>() {
      public boolean a(@Nullable bpr $$0) {
         return $$0 != null && cbu.ci.containsKey($$0.ai());
      }
   };
   private static final cqh cg = cqp.rR;
   private static final Set<cqh> ch = Sets.newHashSet(new cqh[]{cqp.pu, cqp.rY, cqp.rX, cqp.vj, cqp.vg, cqp.vh});
   static final Map<bpd<?>, atx> ci = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bpd.j, aty.sl);
      $$0.put(bpd.m, aty.sm);
      $$0.put(bpd.n, aty.sn);
      $$0.put(bpd.r, aty.sJ);
      $$0.put(bpd.y, aty.so);
      $$0.put(bpd.C, aty.sp);
      $$0.put(bpd.E, aty.sq);
      $$0.put(bpd.G, aty.sr);
      $$0.put(bpd.J, aty.ss);
      $$0.put(bpd.K, aty.st);
      $$0.put(bpd.U, aty.su);
      $$0.put(bpd.Z, aty.sv);
      $$0.put(bpd.aa, aty.sw);
      $$0.put(bpd.ad, aty.sx);
      $$0.put(bpd.ae, aty.sy);
      $$0.put(bpd.ap, aty.sz);
      $$0.put(bpd.ay, aty.sA);
      $$0.put(bpd.aA, aty.sB);
      $$0.put(bpd.aB, aty.sC);
      $$0.put(bpd.aC, aty.sD);
      $$0.put(bpd.aH, aty.sE);
      $$0.put(bpd.aK, aty.sF);
      $$0.put(bpd.aM, aty.sG);
      $$0.put(bpd.aN, aty.sH);
      $$0.put(bpd.aP, aty.sI);
      $$0.put(bpd.aW, aty.sJ);
      $$0.put(bpd.aY, aty.sK);
      $$0.put(bpd.bi, aty.sL);
      $$0.put(bpd.bk, aty.sM);
      $$0.put(bpd.bm, aty.sN);
      $$0.put(bpd.bo, aty.sO);
      $$0.put(bpd.bp, aty.sP);
      $$0.put(bpd.bq, aty.sQ);
      $$0.put(bpd.bt, aty.sR);
      $$0.put(bpd.bu, aty.sS);
      $$0.put(bpd.bw, aty.sT);
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

   public cbu(bpd<? extends cbu> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new bvm(this, 10, false);
      this.a(ejg.n, -1.0F);
      this.a(ejg.o, -1.0F);
      this.a(ejg.x, -1.0F);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.a(ac.a(cbu.b.values(), $$0.E_()));
      if ($$3 == null) {
         $$3 = new bos.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this, 1.25));
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new bwu(this, ciu.class, 8.0F));
      this.bR.a(2, new bxr(this));
      this.bR.a(2, new bwk(this, 1.0, 5.0F, 1.0F, true));
      this.bR.a(2, new cbu.a(this, 1.0));
      this.bR.a(3, new bwr(this));
      this.bR.a(3, new bwj(this, 1.0, 3.0F, 7.0F));
   }

   public static bqv.a gt() {
      return bpr.A().a(bqw.q, 6.0).a(bqw.j, 0.4F).a(bqw.r, 0.2F);
   }

   @Override
   protected bza b(cxb $$0) {
      byy $$1 = new byy(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void m_() {
      if (this.cm == null || !this.cm.a(this.dk(), 3.46) || !this.dM().a_(this.cm).a(dae.dT)) {
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
      ept $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.ca = this.ca + this.cj * 2.0F;
   }

   public static boolean a(cxb $$0, box $$1) {
      if ($$1.bA() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bpr> $$2 = $$0.a(bpr.class, $$1.cH().g(20.0), cf);
         if (!$$2.isEmpty()) {
            bpr $$3 = $$2.get($$0.z.a($$2.size()));
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
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (!this.r() && ch.contains($$2.d())) {
         $$2.a(1, $$0);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.si, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return bnd.a(this.dM().B);
      } else if (!$$2.a(cg)) {
         if (!this.gA() && this.r() && this.j($$0)) {
            if (!this.dM().B) {
               this.y(!this.gn());
            }

            return bnd.a(this.dM().B);
         } else {
            return super.b($$0, $$1);
         }
      } else {
         $$2.a(1, $$0);
         this.b(new bok(bom.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return bnd.a(this.dM().B);
      }
   }

   @Override
   public boolean o(cqm $$0) {
      return false;
   }

   public static boolean c(bpd<cbu> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bV) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dnb $$2, ib $$3) {
   }

   @Override
   public boolean a(cbe $$0) {
      return false;
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      return null;
   }

   @Override
   public boolean C(box $$0) {
      return $$0.a(this.dN().b((bpp)this), 3.0F);
   }

   @Nullable
   @Override
   public atx v() {
      return a(this.dM(), this.dM().z);
   }

   public static atx a(cxb $$0, axd $$1) {
      if ($$0.aj() != bna.a && $$1.a(1000) == 0) {
         List<bpd<?>> $$2 = Lists.newArrayList(ci.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return aty.sg;
      }
   }

   private static atx b(bpd<?> $$0) {
      return ci.getOrDefault($$0, aty.sg);
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.sk;
   }

   @Override
   protected atx n_() {
      return aty.sh;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.sU, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ck;
   }

   @Override
   protected void aS() {
      this.a(aty.sj, 0.15F, 1.0F);
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
   protected void D(box $$0) {
      if (!($$0 instanceof ciu)) {
         super.D($$0);
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public cbu.b gv() {
      return cbu.b.a(this.an.a(ce));
   }

   public void a(cbu.b $$0) {
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
      this.a(cbu.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gA() {
      return !this.aC();
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends bxy {
      public a(bpx $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ept h() {
         ept $$0 = null;
         if (this.b.bc()) {
            $$0 = cam.a(this.b, 15, 15);
         }

         if (this.b.ei().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ept k() {
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
               dnb $$5 = this.b.dM().a_($$2.a($$4, ih.a));
               boolean $$6 = $$5.b() instanceof del || $$5.a(aun.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ih.b))) {
                  return ept.c($$4);
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

      public static final Codec<cbu.b> f = axq.a(cbu.b::values);
      private static final IntFunction<cbu.b> g = avn.a(cbu.b::a, values(), avn.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cbu.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
