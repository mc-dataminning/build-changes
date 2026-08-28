import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cik extends cgy implements bwh<cik.e>, cha {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cfs<? extends cfr<? super cik>>> bZ = ImmutableList.of(cfs.c, cfs.o, cfs.f, cfs.p, cfs.q);
   protected static final ImmutableList<? extends cel<?>> ca = ImmutableList.of(
      cel.r, cel.g, cel.h, cel.k, cel.l, cel.n, cel.m, cel.E, cel.t, cel.o, cel.p, cel.K, new cel[]{cel.y, cel.N, cel.B, cel.O, cel.P, cel.R, cel.U, cel.Z}
   );
   private static final ajy<Integer> ck = akc.a(cik.class, aka.b);
   private static final ajy<Boolean> cl = akc.a(cik.class, aka.k);
   private static final ajy<Boolean> cm = akc.a(cik.class, aka.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axn cf = new axn(10, ayz::m);
   public final axn cg = new axn(10, ayz::m);
   public final axn ch = new axn(10, ayz::m);
   public final axn ci = new axn(10, ayz::m);
   private static final int cq = 100;

   public cik(bus<? extends cik> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.j, 0.0F);
      this.bP = new cik.d(this);
      this.bO = new cik.c(this, 20);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gs().a());
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cik.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gt()) {
         super.U();
      }
   }

   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      boolean $$4 = false;
      if ($$2 == bur.l) {
         return $$3;
      } else {
         azh $$5 = $$0.H_();
         if ($$3 instanceof cik.b) {
            if (((cik.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cik.b(cik.e.a($$5), cik.e.a($$5));
         }

         this.a(((cik.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void az() {
      int $$0 = this.ct();
      super.az();
      if (!this.gf()) {
         this.s($$0);
      }

      if (this.dV().B_()) {
         this.gv();
      }
   }

   private void gv() {
      cik.a $$0;
      if (this.gt()) {
         $$0 = cik.a.a;
      } else if (this.bm()) {
         $$0 = cik.a.b;
      } else if (this.aJ()) {
         $$0 = cik.a.c;
      } else {
         $$0 = cik.a.d;
      }

      this.cf.a($$0 == cik.a.a);
      this.cg.a($$0 == cik.a.b);
      this.ch.a($$0 == cik.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.ci.a($$4);
   }

   protected void s(int $$0) {
      if (this.bL() && !this.bl()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dW().t(), 2.0F);
         }
      } else {
         this.j(this.cs());
      }
   }

   public void x() {
      int $$0 = this.ct() + 1800;
      this.j(Math.min($$0, this.cs()));
   }

   @Override
   public int cs() {
      return 6000;
   }

   public cik.e gs() {
      return cik.e.a(this.al.a(ck));
   }

   public void a(cik.e $$0) {
      this.al.a(ck, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void y(boolean $$0) {
      this.al.a(cl, $$0);
   }

   public boolean gt() {
      return this.al.a(cl);
   }

   @Override
   public boolean p() {
      return this.al.a(cm);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(cm, $$0);
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      cik $$2 = bus.h.a($$0, bur.e);
      if ($$2 != null) {
         cik.e $$3;
         if (a(this.ae)) {
            $$3 = cik.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.gs() : ((cik)$$1).gs();
         }

         $$2.a($$3);
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.aC);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cil.a(this);
      $$1.c();
      if (!this.gf()) {
         Optional<Integer> $$2 = this.eb().c(cel.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bwo.a gu() {
      return cgy.gx().a(bwp.s, 14.0).a(bwp.v, 1.0).a(bwp.c, 2.0).a(bwp.B, 1.0);
   }

   @Override
   protected cet b(dgi $$0) {
      return new ceq(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awa.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      float $$3 = this.eD();
      if (!this.gf()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gt()) {
         this.bE.a(cel.N, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      return cha.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwp $$0) {
      cha.a(this, $$0);
      cyy.a(kv.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gs().a());
         $$0x.a("Age", this.Y_());
         bwj<?> $$1 = this.eb();
         if ($$1.a(cel.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cel.U));
         }
      });
   }

   @Override
   public void h(tq $$0) {
      cha.a(this, $$0);
      this.a(cik.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cel.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cwp W_() {
      return new cwp(cwt.rq);
   }

   @Override
   public avz t() {
      return awa.dk;
   }

   @Override
   public boolean ew() {
      return !this.gt() && super.ew();
   }

   public static void a(ard $$0, cik $$1, bvh $$2) {
      if ($$2.eE()) {
         btb $$3 = $$2.eF();
         if ($$3 != null) {
            bul $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bus.bR) {
               cox $$5 = (cox)$$4;
               List<cox> $$6 = $$0.a(cox.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cox $$0) {
      btq $$1 = $$0.c(bts.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new btq(bts.j, $$3, 0), this);
      }

      $$0.e(bts.d);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.p();
   }

   @Override
   protected avz e(btb $$0) {
      return awa.aM;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.aL;
   }

   @Nullable
   @Override
   protected avz u() {
      return this.bj() ? awa.aO : awa.aN;
   }

   @Override
   protected avz aW() {
      return awa.aP;
   }

   @Override
   protected avz aV() {
      return awa.aQ;
   }

   @Override
   protected bwj.b<cik> ec() {
      return bwj.a(ca, bZ);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cil.a(this.ec().a($$0));
   }

   @Override
   public bwj<cik> eb() {
      return (bwj<cik>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void a_(fba $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvl.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cox $$0, bsj $$1, cwp $$2) {
      if ($$2.a(cwt.rp)) {
         $$0.a($$1, cws.a($$2, $$0, new cwp(cwt.rg)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.R();
   }

   public static boolean a(bus<? extends bvh> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends buc.a {
      public final cik.e[] a;

      public b(cik.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cik.e a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbj {
      public c(final cik $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cik.this.gt()) {
            super.a();
         }
      }
   }

   static class d extends cbk {
      private final cik l;

      public d(cik $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gt()) {
            super.a();
         }
      }
   }

   public static enum e implements azv {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cik.e> g = axq.a(cik.e::a, values(), axq.a.a);
      public static final Codec<cik.e> f = azv.a(cik.e::values);
      private final int h;
      private final String i;
      private final boolean j;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }

      public static cik.e a(int $$0) {
         return g.apply($$0);
      }

      public static cik.e a(azh $$0) {
         return a($$0, true);
      }

      public static cik.e b(azh $$0) {
         return a($$0, false);
      }

      private static cik.e a(azh $$0, boolean $$1) {
         cik.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cik.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
