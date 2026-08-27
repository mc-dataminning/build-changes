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

public class bys extends byz implements bnm<bys.b>, byl {
   private static final agn<Integer> cb = agq.a(bys.class, agp.b);
   private static final Predicate<bmq> cc = new Predicate<bmq>() {
      public boolean a(@Nullable bmq $$0) {
         return $$0 != null && bys.cf.containsKey($$0.ai());
      }
   };
   private static final cnb cd = cnj.rR;
   private static final Set<cnb> ce = Sets.newHashSet(new cnb[]{cnj.pu, cnj.rY, cnj.rX, cnj.vh, cnj.ve, cnj.vf});
   static final Map<bmc<?>, ars> cf = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bmc.j, art.sd);
      $$0.put(bmc.m, art.se);
      $$0.put(bmc.p, art.sA);
      $$0.put(bmc.w, art.sf);
      $$0.put(bmc.A, art.sg);
      $$0.put(bmc.C, art.sh);
      $$0.put(bmc.E, art.si);
      $$0.put(bmc.H, art.sj);
      $$0.put(bmc.I, art.sk);
      $$0.put(bmc.S, art.sl);
      $$0.put(bmc.X, art.sm);
      $$0.put(bmc.Y, art.sn);
      $$0.put(bmc.ab, art.so);
      $$0.put(bmc.ac, art.sp);
      $$0.put(bmc.an, art.sq);
      $$0.put(bmc.aw, art.sr);
      $$0.put(bmc.ay, art.ss);
      $$0.put(bmc.az, art.st);
      $$0.put(bmc.aA, art.su);
      $$0.put(bmc.aF, art.sv);
      $$0.put(bmc.aI, art.sw);
      $$0.put(bmc.aK, art.sx);
      $$0.put(bmc.aL, art.sy);
      $$0.put(bmc.aN, art.sz);
      $$0.put(bmc.aU, art.sA);
      $$0.put(bmc.aW, art.sB);
      $$0.put(bmc.bg, art.sC);
      $$0.put(bmc.bi, art.sD);
      $$0.put(bmc.bk, art.sE);
      $$0.put(bmc.bm, art.sF);
      $$0.put(bmc.bn, art.sG);
      $$0.put(bmc.bo, art.sH);
      $$0.put(bmc.br, art.sI);
      $$0.put(bmc.bs, art.sJ);
      $$0.put(bmc.bu, art.sK);
   });
   public float bX;
   public float bY;
   public float bZ;
   public float ca;
   private float cg = 1.0F;
   private float ch = 1.0F;
   private boolean ci;
   @Nullable
   private hx cj;

   public bys(bmc<? extends bys> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsk(this, 10, false);
      this.a(efk.n, -1.0F);
      this.a(efk.o, -1.0F);
      this.a(efk.x, -1.0F);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.a(ac.a(bys.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new blr.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bP.a(0, new bud(this, 1.25));
      this.bP.a(0, new bte(this));
      this.bP.a(1, new bts(this, cfq.class, 8.0F));
      this.bP.a(2, new bup(this));
      this.bP.a(2, new bti(this, 1.0, 5.0F, 1.0F, true));
      this.bP.a(2, new bys.a(this, 1.0));
      this.bP.a(3, new btp(this));
      this.bP.a(3, new bth(this, 1.0, 3.0F, 7.0F));
   }

   public static bnt.a gl() {
      return bmq.C().a(bnu.n, 6.0).a(bnu.h, 0.4F).a(bnu.o, 0.2F);
   }

   @Override
   protected bvy b(ctx $$0) {
      bvw $$1 = new bvw(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.cj == null || !this.cj.a(this.dj(), 3.46) || !this.dL().a_(this.cj).a(cxa.dT)) {
         this.ci = false;
         this.cj = null;
      }

      if (this.dL().z.a(400) == 0) {
         a(this.dL(), this);
      }

      super.d_();
      this.gp();
   }

   @Override
   public void a(hx $$0, boolean $$1) {
      this.cj = $$0;
      this.ci = $$1;
   }

   public boolean gm() {
      return this.ci;
   }

   private void gp() {
      this.ca = this.bX;
      this.bZ = this.bY;
      this.bY = this.bY + (float)(!this.aC() && !this.bO() ? 4 : -1) * 0.3F;
      this.bY = aup.a(this.bY, 0.0F, 1.0F);
      if (!this.aC() && this.cg < 1.0F) {
         this.cg = 1.0F;
      }

      this.cg *= 0.9F;
      emc $$0 = this.do();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bX = this.bX + this.cg * 2.0F;
   }

   public static boolean a(ctx $$0, blw $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<bmq> $$2 = $$0.a(bmq.class, $$1.cH().g(20.0), cc);
         if (!$$2.isEmpty()) {
            bmq $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               ars $$4 = b($$3.ai());
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
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (!this.u() && ce.contains($$2.d())) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), art.sa, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }

         if (!this.dL().B) {
            if (this.ag.a(10) == 0) {
               this.f($$0);
               this.dL().a(this, (byte)7);
            } else {
               this.dL().a(this, (byte)6);
            }
         }

         return bkc.a(this.dL().B);
      } else if ($$2.a(cd)) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.b(new blj(bll.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dM().a($$0), Float.MAX_VALUE);
         }

         return bkc.a(this.dL().B);
      } else if (!this.gs() && this.u() && this.j($$0)) {
         if (!this.dL().B) {
            this.z(!this.gf());
         }

         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(cng $$0) {
      return false;
   }

   public static boolean c(bmc<bys> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bT) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
   }

   @Override
   public boolean a(byc $$0) {
      return false;
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return null;
   }

   @Override
   public boolean B(blw $$0) {
      return $$0.a(this.dM().b((bmo)this), 3.0F);
   }

   @Nullable
   @Override
   public ars y() {
      return a(this.dL(), this.dL().z);
   }

   public static ars a(ctx $$0, auw $$1) {
      if ($$0.ak() != bjz.a && $$1.a(1000) == 0) {
         List<bmc<?>> $$2 = Lists.newArrayList(cf.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return art.rY;
      }
   }

   private static ars b(bmc<?> $$0) {
      return cf.getOrDefault($$0, art.rY);
   }

   @Override
   protected ars d(bkv $$0) {
      return art.sc;
   }

   @Override
   protected ars n_() {
      return art.rZ;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.sL, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ch;
   }

   @Override
   protected void aS() {
      this.a(art.sb, 0.15F, 1.0F);
      this.ch = this.aa + this.bY / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.ag);
   }

   public static float a(auw $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public aru db() {
      return aru.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void C(blw $$0) {
      if (!($$0 instanceof cfq)) {
         super.C($$0);
      }
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dL().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public bys.b gn() {
      return bys.b.a(this.an.b(cb));
   }

   public void a(bys.b $$0) {
      this.an.b(cb, $$0.h);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, 0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().h);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(bys.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gs() {
      return !this.aC();
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends buw {
      public a(bmx $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected emc h() {
         emc $$0 = null;
         if (this.b.aZ()) {
            $$0 = bxk.a(this.b, 15, 15);
         }

         if (this.b.eg().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private emc k() {
         hx $$0 = this.b.dl();
         hx.a $$1 = new hx.a();
         hx.a $$2 = new hx.a();

         for (hx $$4 : hx.b(
            aup.a(this.b.dq() - 3.0),
            aup.a(this.b.ds() - 6.0),
            aup.a(this.b.dw() - 3.0),
            aup.a(this.b.dq() + 3.0),
            aup.a(this.b.ds() + 6.0),
            aup.a(this.b.dw() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               djp $$5 = this.b.dL().a_($$2.a($$4, ic.a));
               boolean $$6 = $$5.b() instanceof dbh || $$5.a(asi.t);
               if ($$6 && this.b.dL().u($$4) && this.b.dL().u($$1.a($$4, ic.b))) {
                  return emc.c($$4);
               }
            }
         }

         return null;
      }
   }

   public static enum b implements avl {
      a(0, "red_blue"),
      b(1, "blue"),
      c(2, "green"),
      d(3, "yellow_blue"),
      e(4, "gray");

      public static final Codec<bys.b> f = avl.a(bys.b::values);
      private static final IntFunction<bys.b> g = ath.a(bys.b::a, values(), ath.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static bys.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
