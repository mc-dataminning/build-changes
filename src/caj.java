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

public class caj extends caq implements bpd<caj.b>, cac {
   private static final aie<Integer> ca = aih.a(caj.class, aig.b);
   private static final Predicate<boi> cb = new Predicate<boi>() {
      public boolean a(@Nullable boi $$0) {
         return $$0 != null && caj.ce.containsKey($$0.ai());
      }
   };
   private static final cou cc = cpc.rR;
   private static final Set<cou> cd = Sets.newHashSet(new cou[]{cpc.pu, cpc.rY, cpc.rX, cpc.vh, cpc.ve, cpc.vf});
   static final Map<bnu<?>, atj> ce = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bnu.j, atk.sd);
      $$0.put(bnu.m, atk.se);
      $$0.put(bnu.p, atk.sA);
      $$0.put(bnu.w, atk.sf);
      $$0.put(bnu.A, atk.sg);
      $$0.put(bnu.C, atk.sh);
      $$0.put(bnu.E, atk.si);
      $$0.put(bnu.H, atk.sj);
      $$0.put(bnu.I, atk.sk);
      $$0.put(bnu.S, atk.sl);
      $$0.put(bnu.X, atk.sm);
      $$0.put(bnu.Y, atk.sn);
      $$0.put(bnu.ab, atk.so);
      $$0.put(bnu.ac, atk.sp);
      $$0.put(bnu.an, atk.sq);
      $$0.put(bnu.aw, atk.sr);
      $$0.put(bnu.ay, atk.ss);
      $$0.put(bnu.az, atk.st);
      $$0.put(bnu.aA, atk.su);
      $$0.put(bnu.aF, atk.sv);
      $$0.put(bnu.aI, atk.sw);
      $$0.put(bnu.aK, atk.sx);
      $$0.put(bnu.aL, atk.sy);
      $$0.put(bnu.aN, atk.sz);
      $$0.put(bnu.aU, atk.sA);
      $$0.put(bnu.aW, atk.sB);
      $$0.put(bnu.bg, atk.sC);
      $$0.put(bnu.bi, atk.sD);
      $$0.put(bnu.bk, atk.sE);
      $$0.put(bnu.bm, atk.sF);
      $$0.put(bnu.bn, atk.sG);
      $$0.put(bnu.bo, atk.sH);
      $$0.put(bnu.br, atk.sI);
      $$0.put(bnu.bs, atk.sJ);
      $$0.put(bnu.bu, atk.sK);
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

   public caj(bnu<? extends caj> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new bub(this, 10, false);
      this.a(eha.n, -1.0F);
      this.a(eha.o, -1.0F);
      this.a(eha.x, -1.0F);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.a(ac.a(caj.b.values(), $$0.F_()));
      if ($$3 == null) {
         $$3 = new bnj.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   protected void B() {
      this.bO.a(0, new bvu(this, 1.25));
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bvj(this, chh.class, 8.0F));
      this.bO.a(2, new bwg(this));
      this.bO.a(2, new buz(this, 1.0, 5.0F, 1.0F, true));
      this.bO.a(2, new caj.a(this, 1.0));
      this.bO.a(3, new bvg(this));
      this.bO.a(3, new buy(this, 1.0, 3.0F, 7.0F));
   }

   public static bpk.a gm() {
      return boi.C().a(bpl.n, 6.0).a(bpl.h, 0.4F).a(bpl.o, 0.2F);
   }

   @Override
   protected bxp b(cvn $$0) {
      bxn $$1 = new bxn(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   public void d_() {
      if (this.ci == null || !this.ci.a(this.dk(), 3.46) || !this.dM().a_(this.ci).a(cyq.dT)) {
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
      this.bX = awh.a(this.bX, 0.0F, 1.0F);
      if (!this.aC() && this.cf < 1.0F) {
         this.cf = 1.0F;
      }

      this.cf *= 0.9F;
      ens $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bW = this.bW + this.cf * 2.0F;
   }

   public static boolean a(cvn $$0, bno $$1) {
      if ($$1.bx() && !$$1.aU() && $$0.z.a(2) == 0) {
         List<boi> $$2 = $$0.a(boi.class, $$1.cH().g(20.0), cb);
         if (!$$2.isEmpty()) {
            boi $$3 = $$2.get($$0.z.a($$2.size()));
            if (!$$3.aU()) {
               atj $$4 = b($$3.ai());
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
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (!this.u() && cd.contains($$2.d())) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.sa, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }

         if (!this.dM().B) {
            if (this.af.a(10) == 0) {
               this.f($$0);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }
         }

         return blu.a(this.dM().B);
      } else if ($$2.a(cc)) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         this.b(new bnb(bnd.s, 900));
         if ($$0.f() || !this.cr()) {
            this.a(this.dN().a($$0), Float.MAX_VALUE);
         }

         return blu.a(this.dM().B);
      } else if (!this.gt() && this.u() && this.j($$0)) {
         if (!this.dM().B) {
            this.z(!this.gg());
         }

         return blu.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean m(coz $$0) {
      return false;
   }

   public static boolean c(bnu<caj> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bU) && a($$1, $$3);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlf $$2, hz $$3) {
   }

   @Override
   public boolean a(bzt $$0) {
      return false;
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return null;
   }

   @Override
   public boolean B(bno $$0) {
      return $$0.a(this.dN().b((bog)this), 3.0F);
   }

   @Nullable
   @Override
   public atj y() {
      return a(this.dM(), this.dM().z);
   }

   public static atj a(cvn $$0, awo $$1) {
      if ($$0.ak() != blr.a && $$1.a(1000) == 0) {
         List<bnu<?>> $$2 = Lists.newArrayList(ce.keySet());
         return b($$2.get($$1.a($$2.size())));
      } else {
         return atk.rY;
      }
   }

   private static atj b(bnu<?> $$0) {
      return ce.getOrDefault($$0, atk.rY);
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.sc;
   }

   @Override
   protected atj n_() {
      return atk.rZ;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.sL, 0.15F, 1.0F);
   }

   @Override
   protected boolean aT() {
      return this.Z > this.cg;
   }

   @Override
   protected void aS() {
      this.a(atk.sb, 0.15F, 1.0F);
      this.cg = this.Z + this.bX / 2.0F;
   }

   @Override
   public float eX() {
      return a(this.af);
   }

   public static float a(awo $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public atl db() {
      return atl.g;
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected void C(bno $$0) {
      if (!($$0 instanceof chh)) {
         super.C($$0);
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   public caj.b go() {
      return caj.b.a(this.am.b(ca));
   }

   public void a(caj.b $$0) {
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
      this.a(caj.b.a($$0.h("Variant")));
   }

   @Override
   public boolean gt() {
      return !this.aC();
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a extends bwn {
      public a(boo $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected ens h() {
         ens $$0 = null;
         if (this.b.aZ()) {
            $$0 = bzb.a(this.b, 15, 15);
         }

         if (this.b.eh().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private ens k() {
         hz $$0 = this.b.dm();
         hz.a $$1 = new hz.a();
         hz.a $$2 = new hz.a();

         for (hz $$4 : hz.b(
            awh.a(this.b.dr() - 3.0),
            awh.a(this.b.dt() - 6.0),
            awh.a(this.b.dx() - 3.0),
            awh.a(this.b.dr() + 3.0),
            awh.a(this.b.dt() + 6.0),
            awh.a(this.b.dx() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               dlf $$5 = this.b.dM().a_($$2.a($$4, ie.a));
               boolean $$6 = $$5.b() instanceof dcx || $$5.a(atz.t);
               if ($$6 && this.b.dM().u($$4) && this.b.dM().u($$1.a($$4, ie.b))) {
                  return ens.c($$4);
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

      public static final Codec<caj.b> f = axc.a(caj.b::values);
      private static final IntFunction<caj.b> g = auz.a(caj.b::a, values(), auz.a.c);
      final int h;
      private final String i;

      private b(int $$0, String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static caj.b a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
