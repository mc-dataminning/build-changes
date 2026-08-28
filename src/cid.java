import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cid extends cgr implements bwa<cid.e>, cgt {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cfl<? extends cfk<? super cid>>> bZ = ImmutableList.of(cfl.c, cfl.o, cfl.f, cfl.p, cfl.q);
   protected static final ImmutableList<? extends cee<?>> ca = ImmutableList.of(
      cee.r, cee.g, cee.h, cee.k, cee.l, cee.n, cee.m, cee.E, cee.t, cee.o, cee.p, cee.K, new cee[]{cee.y, cee.N, cee.B, cee.O, cee.P, cee.R, cee.U, cee.Z}
   );
   private static final akl<Integer> ck = akp.a(cid.class, akn.b);
   private static final akl<Boolean> cl = akp.a(cid.class, akn.k);
   private static final akl<Boolean> cm = akp.a(cid.class, akn.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axy cf = new axy(10, azk::m);
   public final axy cg = new axy(10, azk::m);
   public final axy ch = new axy(10, azk::m);
   public final axy ci = new axy(10, azk::m);
   private static final int cq = 100;

   public cid(bul<? extends cid> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, 0.0F);
      this.bP = new cid.d(this);
      this.bO = new cid.c(this, 20);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gu().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cid.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gv()) {
         super.U();
      }
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      boolean $$4 = false;
      if ($$2 == buk.l) {
         return $$3;
      } else {
         azs $$5 = $$0.E_();
         if ($$3 instanceof cid.b) {
            if (((cid.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cid.b(cid.e.a($$5), cid.e.a($$5));
         }

         this.a(((cid.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aB() {
      int $$0 = this.cu();
      super.aB();
      if (!this.gh()) {
         this.t($$0);
      }

      if (this.dX().y_()) {
         this.gx();
      }
   }

   private void gx() {
      cid.a $$0;
      if (this.gv()) {
         $$0 = cid.a.a;
      } else if (this.bn()) {
         $$0 = cid.a.b;
      } else if (this.aK()) {
         $$0 = cid.a.c;
      } else {
         $$0 = cid.a.d;
      }

      this.cf.a($$0 == cid.a.a);
      this.cg.a($$0 == cid.a.b);
      this.ch.a($$0 == cid.a.c);
      boolean $$4 = this.aT.d() || this.dP() != this.P || this.dN() != this.O;
      this.ci.a($$4);
   }

   protected void t(int $$0) {
      if (this.bM() && !this.bm()) {
         this.j($$0 - 1);
         if (this.cu() == -20) {
            this.j(0);
            this.a(this.dY().t(), 2.0F);
         }
      } else {
         this.j(this.ct());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cu() + 1800;
      this.j(Math.min($$0, this.ct()));
   }

   @Override
   public int ct() {
      return 6000;
   }

   public cid.e gu() {
      return cid.e.a(this.am.a(ck));
   }

   public void a(cid.e $$0) {
      this.am.a(ck, $$0.a());
   }

   private static boolean a(azs $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cK() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cl, $$0);
   }

   public boolean gv() {
      return this.am.a(cl);
   }

   @Override
   public boolean t() {
      return this.am.a(cm);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(cm, $$0);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      cid $$2 = bul.f.a($$0, buk.e);
      if ($$2 != null) {
         cid.e $$3;
         if (a(this.af)) {
            $$3 = cid.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gu() : ((cid)$$1).gu();
         }

         $$2.a($$3);
         $$2.ga();
      }

      return $$2;
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.aC);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("axolotlBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      $$0.a("axolotlActivityUpdate");
      cie.a(this);
      $$0.c();
      if (!this.gh()) {
         Optional<Integer> $$1 = this.ed().c(cee.N);
         this.y($$1.isPresent() && $$1.get() > 0);
      }
   }

   public static bwh.a gw() {
      return cgr.gz().a(bwi.s, 14.0).a(bwi.v, 1.0).a(bwi.c, 2.0).a(bwi.B, 1.0);
   }

   @Override
   protected cem b(dfb $$0) {
      return new cej(this, $$0);
   }

   @Override
   public void gl() {
      this.a(awl.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      float $$2 = this.eG();
      if (!this.dX().C
         && !this.gh()
         && this.dX().A.a(3) == 0
         && ((float)this.dX().A.a(3) < $$1 || $$2 / this.eV() < 0.5F)
         && $$1 < $$2
         && this.bk()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gv()) {
         this.bF.a(cee.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      return cgt.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cwb $$0) {
      cgt.a(this, $$0);
      cyk.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gu().a());
         $$0x.a("Age", this.g());
         bwc<?> $$1 = this.ed();
         if ($$1.a(cee.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cee.U));
         }
      });
   }

   @Override
   public void h(uk $$0) {
      cgt.a(this, $$0);
      this.a(cid.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ed().a(cee.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cwb X_() {
      return new cwb(cwf.qK);
   }

   @Override
   public awk y() {
      return awl.dj;
   }

   @Override
   public boolean ez() {
      return !this.gv() && super.ez();
   }

   public static void a(cid $$0, bva $$1) {
      dfb $$2 = $$0.dX();
      if ($$1.eH()) {
         bsu $$3 = $$1.eI();
         if ($$3 != null) {
            bue $$4 = $$3.d();
            if ($$4 != null && $$4.ar() == bul.by) {
               com $$5 = (com)$$4;
               List<com> $$6 = $$2.a(com.class, $$0.cS().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(com $$0) {
      btj $$1 = $$0.c(btl.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new btj(btl.j, $$3, 0), this);
      }

      $$0.e(btl.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.aM;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.aL;
   }

   @Nullable
   @Override
   protected awk w() {
      return this.bk() ? awl.aO : awl.aN;
   }

   @Override
   protected awk aX() {
      return awl.aP;
   }

   @Override
   protected awk aW() {
      return awl.aQ;
   }

   @Override
   protected bwc.b<cid> ee() {
      return bwc.a(ca, bZ);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cie.a(this.ee().a($$0));
   }

   @Override
   public bwc<cid> ed() {
      return (bwc<cid>)super.ed();
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(bve.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(com $$0, bsc $$1, cwb $$2) {
      if ($$2.a(cwf.qJ)) {
         $$0.a($$1, cwe.a($$2, $$0, new cwb(cwf.qA)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.an();
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }

   public static boolean a(bul<? extends bva> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends btv.a {
      public final cid.e[] a;

      public b(cid.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cid.e a(azs $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbc {
      public c(final cid $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cid.this.gv()) {
            super.a();
         }
      }
   }

   static class d extends cbd {
      private final cid l;

      public d(cid $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gv()) {
            super.a();
         }
      }
   }

   public static enum e implements bag {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cid.e> g = ayb.a(cid.e::a, values(), ayb.a.a);
      public static final Codec<cid.e> f = bag.a(cid.e::values);
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

      public static cid.e a(int $$0) {
         return g.apply($$0);
      }

      public static cid.e a(azs $$0) {
         return a($$0, true);
      }

      public static cid.e b(azs $$0) {
         return a($$0, false);
      }

      private static cid.e a(azs $$0, boolean $$1) {
         cid.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cid.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
