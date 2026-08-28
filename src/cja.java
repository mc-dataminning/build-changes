import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cja extends cho implements bwx<cja.e>, chq {
   public static final int bZ = 200;
   private static final int ck = 10;
   protected static final ImmutableList<? extends cgi<? extends cgh<? super cja>>> ca = ImmutableList.of(cgi.c, cgi.o, cgi.f, cgi.p, cgi.q);
   protected static final ImmutableList<? extends cfb<?>> cb = ImmutableList.of(
      cfb.r, cfb.g, cfb.h, cfb.k, cfb.l, cfb.n, cfb.m, cfb.E, cfb.t, cfb.o, cfb.p, cfb.K, new cfb[]{cfb.y, cfb.N, cfb.B, cfb.O, cfb.P, cfb.R, cfb.U, cfb.Z}
   );
   private static final aks<Integer> cl = akw.a(cja.class, aku.b);
   private static final aks<Boolean> cm = akw.a(cja.class, aku.k);
   private static final aks<Boolean> cn = akw.a(cja.class, aku.k);
   public static final double cd = 20.0;
   public static final int ce = 1200;
   private static final int co = 6000;
   public static final String cf = "Variant";
   private static final int cp = 1800;
   private static final int cq = 2400;
   public final ayi cg = new ayi(10, azu::m);
   public final ayi ch = new ayi(10, azu::m);
   public final ayi ci = new ayi(10, azu::m);
   public final ayi cj = new ayi(10, azu::m);
   private static final int cr = 100;

   public cja(bvi<? extends cja> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.j, 0.0F);
      this.bQ = new cja.d(this);
      this.bP = new cja.c(this, 20);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cl, 0);
      $$0.a(cm, false);
      $$0.a(cn, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Variant", this.go().a());
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cja.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gp()) {
         super.R();
      }
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      boolean $$4 = false;
      if ($$2 == bvh.l) {
         return $$3;
      } else {
         bac $$5 = $$0.H_();
         if ($$3 instanceof cja.b) {
            if (((cja.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cja.b(cja.e.a($$5), cja.e.a($$5));
         }

         this.a(((cja.b)$$3).a($$5));
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
      if (!this.gb()) {
         this.s($$0);
      }

      if (this.dW().B_()) {
         this.gr();
      }
   }

   private void gr() {
      cja.a $$0;
      if (this.gp()) {
         $$0 = cja.a.a;
      } else if (this.bm()) {
         $$0 = cja.a.b;
      } else if (this.aJ()) {
         $$0 = cja.a.c;
      } else {
         $$0 = cja.a.d;
      }

      this.cg.a($$0 == cja.a.a);
      this.ch.a($$0 == cja.a.b);
      this.ci.a($$0 == cja.a.c);
      boolean $$4 = this.aT.d() || this.dO() != this.O || this.dM() != this.N;
      this.cj.a($$4);
   }

   protected void s(int $$0) {
      if (this.bL() && !this.bl()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dX().t(), 2.0F);
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

   public cja.e go() {
      return cja.e.a(this.al.a(cl));
   }

   public void a(cja.e $$0) {
      this.al.a(cl, $$0.a());
   }

   private static boolean a(bac $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void y(boolean $$0) {
      this.al.a(cm, $$0);
   }

   public boolean gp() {
      return this.al.a(cm);
   }

   @Override
   public boolean p() {
      return this.al.a(cn);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(cn, $$0);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      cja $$2 = bvi.h.a($$0, bvh.e);
      if ($$2 != null) {
         cja.e $$3;
         if (a(this.ae)) {
            $$3 = cja.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.go() : ((cja)$$1).go();
         }

         $$2.a($$3);
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.aE);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjb.a(this);
      $$1.c();
      if (!this.gb()) {
         Optional<Integer> $$2 = this.ec().c(cfb.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxe.a gq() {
      return cho.gt().a(bxf.s, 14.0).a(bxf.v, 1.0).a(bxf.c, 2.0).a(bxf.B, 1.0);
   }

   @Override
   protected cfj b(dgz $$0) {
      return new cfg(this, $$0);
   }

   @Override
   public void gf() {
      this.a(awv.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      float $$3 = this.eE();
      if (!this.gb()
         && this.dW().A.a(3) == 0
         && ((float)this.dW().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gp()) {
         this.bF.a(cfb.N, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      return chq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxg $$0) {
      chq.a(this, $$0);
      czp.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.Z_());
         bwz<?> $$1 = this.ec();
         if ($$1.a(cfb.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cfb.U));
         }
      });
   }

   @Override
   public void h(um $$0) {
      chq.a(this, $$0);
      this.a(cja.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ec().a(cfb.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxg X_() {
      return new cxg(cxk.rq);
   }

   @Override
   public awu t() {
      return awv.dk;
   }

   @Override
   public boolean ex() {
      return !this.gp() && super.ex();
   }

   public static void a(arx $$0, cja $$1, bvx $$2) {
      if ($$2.eF()) {
         btr $$3 = $$2.eG();
         if ($$3 != null) {
            bvb $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bvi.bS) {
               cpo $$5 = (cpo)$$4;
               List<cpo> $$6 = $$0.a(cpo.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cpo $$0) {
      bug $$1 = $$0.c(bui.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bug(bui.j, $$3, 0), this);
      }

      $$0.e(bui.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.p();
   }

   @Override
   protected awu e(btr $$0) {
      return awv.aM;
   }

   @Nullable
   @Override
   protected awu o_() {
      return awv.aL;
   }

   @Nullable
   @Override
   protected awu u() {
      return this.bj() ? awv.aO : awv.aN;
   }

   @Override
   protected awu aW() {
      return awv.aP;
   }

   @Override
   protected awu aV() {
      return awv.aQ;
   }

   @Override
   protected bwz.b<cja> ed() {
      return bwz.a(cb, ca);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cjb.a(this.ed().a($$0));
   }

   @Override
   public bwz<cja> ec() {
      return (bwz<cja>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cpo $$0, bsz $$1, cxg $$2) {
      if ($$2.a(cxk.rp)) {
         $$0.a($$1, cxj.a($$2, $$0, new cxg(cxk.rg)));
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
   public bvx O_() {
      return this.O();
   }

   public static boolean a(bvi<? extends bvx> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bus.a {
      public final cja.e[] a;

      public b(cja.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cja.e a(bac $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbz {
      public c(final cja $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cja.this.gp()) {
            super.a();
         }
      }
   }

   static class d extends cca {
      private final cja l;

      public d(cja $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gp()) {
            super.a();
         }
      }
   }

   public static enum e implements baq {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cja.e> g = ayl.a(cja.e::a, values(), ayl.a.a);
      public static final Codec<cja.e> f = baq.a(cja.e::values);
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

      public static cja.e a(int $$0) {
         return g.apply($$0);
      }

      public static cja.e a(bac $$0) {
         return a($$0, true);
      }

      public static cja.e b(bac $$0) {
         return a($$0, false);
      }

      private static cja.e a(bac $$0, boolean $$1) {
         cja.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cja.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
