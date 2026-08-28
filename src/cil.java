import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cil extends cgz implements bwi<cil.e>, chb {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cft<? extends cfs<? super cil>>> bZ = ImmutableList.of(cft.c, cft.o, cft.f, cft.p, cft.q);
   protected static final ImmutableList<? extends cem<?>> ca = ImmutableList.of(
      cem.r, cem.g, cem.h, cem.k, cem.l, cem.n, cem.m, cem.E, cem.t, cem.o, cem.p, cem.K, new cem[]{cem.y, cem.N, cem.B, cem.O, cem.P, cem.R, cem.U, cem.Z}
   );
   private static final ajy<Integer> ck = akc.a(cil.class, aka.b);
   private static final ajy<Boolean> cl = akc.a(cil.class, aka.k);
   private static final ajy<Boolean> cm = akc.a(cil.class, aka.k);
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

   public cil(but<? extends cil> $$0, dgj $$1) {
      super($$0, $$1);
      this.a(etr.j, 0.0F);
      this.bP = new cil.d(this);
      this.bO = new cil.c(this, 20);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
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
      this.a(cil.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gt()) {
         super.U();
      }
   }

   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      boolean $$4 = false;
      if ($$2 == bus.l) {
         return $$3;
      } else {
         azh $$5 = $$0.H_();
         if ($$3 instanceof cil.b) {
            if (((cil.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cil.b(cil.e.a($$5), cil.e.a($$5));
         }

         this.a(((cil.b)$$3).a($$5));
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
      cil.a $$0;
      if (this.gt()) {
         $$0 = cil.a.a;
      } else if (this.bm()) {
         $$0 = cil.a.b;
      } else if (this.aJ()) {
         $$0 = cil.a.c;
      } else {
         $$0 = cil.a.d;
      }

      this.cf.a($$0 == cil.a.a);
      this.cg.a($$0 == cil.a.b);
      this.ch.a($$0 == cil.a.c);
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

   public cil.e gs() {
      return cil.e.a(this.al.a(ck));
   }

   public void a(cil.e $$0) {
      this.al.a(ck, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dgm $$0) {
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
   public bud a(ard $$0, bud $$1) {
      cil $$2 = but.h.a($$0, bus.e);
      if ($$2 != null) {
         cil.e $$3;
         if (a(this.ae)) {
            $$3 = cil.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.gs() : ((cil)$$1).gs();
         }

         $$2.a($$3);
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.aC);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      bou $$1 = bot.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cim.a(this);
      $$1.c();
      if (!this.gf()) {
         Optional<Integer> $$2 = this.eb().c(cem.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bwp.a gu() {
      return cgz.gx().a(bwq.s, 14.0).a(bwq.v, 1.0).a(bwq.c, 2.0).a(bwq.B, 1.0);
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cer(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awa.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      float $$3 = this.eD();
      if (!this.gf()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gt()) {
         this.bE.a(cem.N, 200);
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
   public bsl b(coy $$0, bsk $$1) {
      return chb.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwq $$0) {
      chb.a(this, $$0);
      cyz.a(kv.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gs().a());
         $$0x.a("Age", this.Y_());
         bwk<?> $$1 = this.eb();
         if ($$1.a(cem.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cem.U));
         }
      });
   }

   @Override
   public void h(tq $$0) {
      chb.a(this, $$0);
      this.a(cil.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cem.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cwq W_() {
      return new cwq(cwu.rq);
   }

   @Override
   public avz t() {
      return awa.dk;
   }

   @Override
   public boolean ew() {
      return !this.gt() && super.ew();
   }

   public static void a(ard $$0, cil $$1, bvi $$2) {
      if ($$2.eE()) {
         btc $$3 = $$2.eF();
         if ($$3 != null) {
            bum $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == but.bR) {
               coy $$5 = (coy)$$4;
               List<coy> $$6 = $$0.a(coy.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(coy $$0) {
      btr $$1 = $$0.c(btt.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new btr(btt.j, $$3, 0), this);
      }

      $$0.e(btt.d);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.p();
   }

   @Override
   protected avz e(btc $$0) {
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
   protected bwk.b<cil> ec() {
      return bwk.a(ca, bZ);
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cim.a(this.ec().a($$0));
   }

   @Override
   public bwk<cil> eb() {
      return (bwk<cil>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void a_(fbb $$0) {
      if (this.dh() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvm.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(coy $$0, bsk $$1, cwq $$2) {
      if ($$2.a(cwu.rp)) {
         $$0.a($$1, cwt.a($$2, $$0, new cwq(cwu.rg)));
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
   public bvi O_() {
      return this.R();
   }

   public static boolean a(but<? extends bvi> $$0, dha $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bud.a {
      public final cil.e[] a;

      public b(cil.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cil.e a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbk {
      public c(final cil $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cil.this.gt()) {
            super.a();
         }
      }
   }

   static class d extends cbl {
      private final cil l;

      public d(cil $$0) {
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

      private static final IntFunction<cil.e> g = axq.a(cil.e::a, values(), axq.a.a);
      public static final Codec<cil.e> f = azv.a(cil.e::values);
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

      public static cil.e a(int $$0) {
         return g.apply($$0);
      }

      public static cil.e a(azh $$0) {
         return a($$0, true);
      }

      public static cil.e b(azh $$0) {
         return a($$0, false);
      }

      private static cil.e a(azh $$0, boolean $$1) {
         cil.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cil.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
