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

public class can extends cau implements bph<can.b>, cag {
   private static final aie<Integer> ca = aih.a(can.class, aig.b);
   private static final Predicate<bok> cb = new Predicate<bok>() {
      public boolean a(@Nullable bok $$0) {
         return $$0 != null && can.ce.containsKey($$0.ai());
      }
   };
   private static final coy cc = cpg.rR;
   private static final Set<coy> cd = Sets.newHashSet(new coy[]{cpg.pu, cpg.rY, cpg.rX, cpg.vh, cpg.ve, cpg.vf});
   static final Map<bnw<?>, atk> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bnw.j, atl.se);
      $$0.put(bnw.m, atl.sf);
      $$0.put(bnw.p, atl.sB);
      $$0.put(bnw.w, atl.sg);
      $$0.put(bnw.A, atl.sh);
      $$0.put(bnw.C, atl.si);
      $$0.put(bnw.E, atl.sj);
      $$0.put(bnw.H, atl.sk);
      $$0.put(bnw.I, atl.sl);
      $$0.put(bnw.S, atl.sm);
      $$0.put(bnw.X, atl.sn);
      $$0.put(bnw.Y, atl.so);
      $$0.put(bnw.ab, atl.sp);
      $$0.put(bnw.ac, atl.sq);
      $$0.put(bnw.an, atl.sr);
      $$0.put(bnw.aw, atl.ss);
      $$0.put(bnw.ay, atl.st);
      $$0.put(bnw.az, atl.su);
      $$0.put(bnw.aA, atl.sv);
      $$0.put(bnw.aF, atl.sw);
      $$0.put(bnw.aI, atl.sx);
      $$0.put(bnw.aK, atl.sy);
      $$0.put(bnw.aL, atl.sz);
      $$0.put(bnw.aN, atl.sA);
      $$0.put(bnw.aU, atl.sB);
      $$0.put(bnw.aW, atl.sC);
      $$0.put(bnw.bg, atl.sD);
      $$0.put(bnw.bi, atl.sE);
      $$0.put(bnw.bk, atl.sF);
      $$0.put(bnw.bm, atl.sG);
      $$0.put(bnw.bn, atl.sH);
      $$0.put(bnw.bo, atl.sI);
      $$0.put(bnw.br, atl.sJ);
      $$0.put(bnw.bs, atl.sK);
      $$0.put(bnw.bu, atl.sL);
   });
   public float bW;
   public float bX;
   public float bY;
   public float bZ;
   private float cf = 1.0F;
   private float cg = 1.0F;
   private boolean ch;
   @Nullable
   private hz ci;

   public can(bnw<? extends can> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buf(this, 10, false);
      this.a(ehh.n, -1.0F);
      this.a(ehh.o, -1.0F);
      this.a(ehh.x, -1.0F);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.a(ac.a(can.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new bnl.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bvy(this, 1.25));
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bvn(this, chl.class, 8.0F));
      this.bO.a(2, new bwk(this));
      this.bO.a(2, new bvd(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new can.a(this, 1.0));
      this.bO.a(3, new bvk(this));
      this.bO.a(3, new bvc(this, 1.0, 3.0F, 7.0F));
   }

   public static bpo.a gm() {
      return bok.C().a(bpp.n, 6.0).a(bpp.h, 0.4F).a(bpp.o, 0.2F);
   }

   @Override
   protected bxt b(cvr $$0) {
      bxr $$1 = new bxr(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cyu.dT)) {
         this.ch = false;
         this.ci = null;
      }

      if (this.dM().z.a(400) == 0) {
         a(this.dM(), this);
      }

      super.d_();
      this.gq();
   }

   @Override
   public void a(hz $$0, boolean $$1) {
      this.ci = $$0;
      this.ch = $$1;
   }

   public boolean gn() {
      return this.ch;
   }

   private void gq() {
      this.bZ = this.bW;
      this.bY = this.bX;
      this.bX = this.bX + (float)(!this.aC() && !this.bO() ? 4 : -1) * 0.3F;
      this.bX = awi.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      enz $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cvr $$0, bnq $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bok> $$2 = $$0.a(bok.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            bok $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               atk $$4 = b($$3.ai());
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
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.sb, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.af.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return blw.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         this.b(new bnd(bnf.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return blw.a(this.dM().B);
      } else if (!this.gt() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.gg());
         }

         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cpd $$0) {
      return false;
   }

   public static boolean c(bnw<can> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bU) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
   }

   @Override
   public boolean a(bzx $$0) {
      return false;
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      return null;
   }

   @Override
   public boolean B(bnq $$0) {
      return $$0.a(this.dN().b((boi)this), 3.0F);
   }

   @Nullable
   @Override
   public atk y() {
      return a(this.dM(), this.dM().z);
   }

   public static atk a(cvr $$0, awp $$1) {
      if ($$0.aj() != blt.a && $$1.a(1000) == 0) {
         List<bnw<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return atl.rZ;
      }
   }

   private static atk b(bnw<?> $$0) {
      return ce.getOrDefault($$0, atl.rZ);
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.sd;
   }

   @Override
   protected atk n_() {
      return atl.sa;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.sM, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.Z > this.cg;
   }

   @Override
   protected void aS() {
      this.a(atl.sc, 0.15F, 1.0F);
      this.cg = this.Z + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.af);
   }

   public static float a(awp $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public atm db() {
      return atm.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void C(bnq $$0) {
      if (!($$0 instanceof chl)) {
         super.C($$0);
      }
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public can.b go() {
      return can.b.a(this.am.b(ca));
   }

   public void a(can.b $$0) {
      this.am.b(ca, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.go().h);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(can.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gt() {
      return !this.aC();
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends bwr {
      public a(boq $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected enz h() {
         enz $$0 = null;
         if (this.b.aZ()) {
            $$0 = bzf.a(this.b, 15, 15);
         }

         if (this.b.eh().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private enz k() {
         hz $$0 = this.b.dm();
         hz.a $$1 = new hz.a();
         hz.a $$2 = new hz.a();

         for (hz $$4 : hz.b(
            awi.a(this.b.dr() - 3.0),
            awi.a(this.b.dt() - 6.0),
            awi.a(this.b.dx() - 3.0),
            awi.a(this.b.dr() + 3.0),
            awi.a(this.b.dt() + 6.0),
            awi.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dlj $$5 = this.b.dM().a_($$2.a($$4, ie.a));
               boolean $$6 = $$5.b() instanceof ddb || $$5.a(aua.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ie.b))) {
                  return enz.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements axc {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<can.b> f = axc.a(can.b::values);
      private static final IntFunction<can.b> g = ava.a(can.b::a, values(), ava.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static can.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
