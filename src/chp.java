import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chp extends cgd implements bvm<chp.e>, cgf {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cex<? extends cew<? super chp>>> bZ = ImmutableList.of(cex.c, cex.o, cex.f, cex.p, cex.q);
   protected static final ImmutableList<? extends cdq<?>> ca = ImmutableList.of(
      cdq.r, cdq.g, cdq.h, cdq.k, cdq.l, cdq.n, cdq.m, cdq.E, cdq.t, cdq.o, cdq.p, cdq.K, new cdq[]{cdq.y, cdq.N, cdq.B, cdq.O, cdq.P, cdq.R, cdq.U, cdq.Z}
   );
   private static final akh<Integer> ck = akl.a(chp.class, akj.b);
   private static final akh<Boolean> cl = akl.a(chp.class, akj.k);
   private static final akh<Boolean> cm = akl.a(chp.class, akj.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axt cf = new axt(10, azf::m);
   public final axt cg = new axt(10, azf::m);
   public final axt ch = new axt(10, azf::m);
   public final axt ci = new axt(10, azf::m);
   private static final int cq = 100;

   public chp(bty<? extends chp> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.j, 0.0F);
      this.bP = new chp.d(this);
      this.bO = new chp.c(this, 20);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Variant", this.go().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(chp.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gp()) {
         super.U();
      }
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      boolean $$4 = false;
      if ($$2 == btx.l) {
         return $$3;
      } else {
         azn $$5 = $$0.D_();
         if ($$3 instanceof chp.b) {
            if (((chp.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new chp.b(chp.e.a($$5), chp.e.a($$5));
         }

         this.a(((chp.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void ay() {
      int $$0 = this.cq();
      super.ay();
      if (!this.gd()) {
         this.t($$0);
      }

      if (this.dS().x_()) {
         this.gr();
      }
   }

   private void gr() {
      chp.a $$0;
      if (this.gp()) {
         $$0 = chp.a.a;
      } else if (this.bl()) {
         $$0 = chp.a.b;
      } else if (this.aH()) {
         $$0 = chp.a.c;
      } else {
         $$0 = chp.a.d;
      }

      this.cf.a($$0 == chp.a.a);
      this.cg.a($$0 == chp.a.b);
      this.ch.a($$0 == chp.a.c);
      boolean $$4 = this.aP.d() || this.dK() != this.P || this.dI() != this.O;
      this.ci.a($$4);
   }

   protected void t(int $$0) {
      if (this.bI() && !this.bk()) {
         this.j($$0 - 1);
         if (this.cq() == -20) {
            this.j(0);
            this.a(this.dT().t(), 2.0F);
         }
      } else {
         this.j(this.cp());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cq() + 1800;
      this.j(Math.min($$0, this.cp()));
   }

   @Override
   public int cp() {
      return 6000;
   }

   public chp.e go() {
      return chp.e.a(this.am.a(ck));
   }

   public void a(chp.e $$0) {
      this.am.a(ck, $$0.a());
   }

   private static boolean a(azn $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cG() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cl, $$0);
   }

   public boolean gp() {
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
   public btk a(arj $$0, btk $$1) {
      chp $$2 = bty.f.a($$0, btx.e);
      if ($$2 != null) {
         chp.e $$3;
         if (a(this.af)) {
            $$3 = chp.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.go() : ((chp)$$1).go();
         }

         $$2.a($$3);
         $$2.fW();
      }

      return $$2;
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ay);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("axolotlBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("axolotlActivityUpdate");
      chq.a(this);
      this.dS().ah().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dY().c(cdq.N);
         this.y($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bvt.a gq() {
      return cgd.gt().a(bvu.s, 14.0).a(bvu.v, 1.0).a(bvu.c, 2.0).a(bvu.B, 1.0);
   }

   @Override
   protected cdy b(dej $$0) {
      return new cdv(this, $$0);
   }

   @Override
   public void gh() {
      this.a(awg.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      float $$2 = this.eB();
      if (!this.dS().B
         && !this.gd()
         && this.dS().z.a(3) == 0
         && ((float)this.dS().z.a(3) < $$1 || $$2 / this.eQ() < 0.5F)
         && $$1 < $$2
         && this.bi()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gp()) {
         this.bB.a(cdq.N, 200);
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
   public brs b(cnx $$0, brr $$1) {
      return cgf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cvs $$0) {
      cgf.a(this, $$0);
      cyh.a(ks.S, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.g());
         bvo<?> $$1 = this.dY();
         if ($$1.a(cdq.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cdq.U));
         }
      });
   }

   @Override
   public void h(ug $$0) {
      cgf.a(this, $$0);
      this.a(chp.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dY().a(cdq.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cvs W_() {
      return new cvs(cvw.qK);
   }

   @Override
   public awf y() {
      return awg.dj;
   }

   @Override
   public boolean eu() {
      return !this.gp() && super.eu();
   }

   public static void a(chp $$0, bun $$1) {
      dej $$2 = $$0.dS();
      if ($$1.eC()) {
         bsj $$3 = $$1.eD();
         if ($$3 != null) {
            btr $$4 = $$3.d();
            if ($$4 != null && $$4.ao() == bty.by) {
               cnx $$5 = (cnx)$$4;
               List<cnx> $$6 = $$2.a(cnx.class, $$0.cO().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(cnx $$0) {
      bsy $$1 = $$0.c(bta.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsy(bta.j, $$3, 0), this);
      }

      $$0.e(bta.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.aM;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.aL;
   }

   @Nullable
   @Override
   protected awf w() {
      return this.bi() ? awg.aO : awg.aN;
   }

   @Override
   protected awf aU() {
      return awg.aP;
   }

   @Override
   protected awf aT() {
      return awg.aQ;
   }

   @Override
   protected bvo.b<chp> dZ() {
      return bvo.a(ca, bZ);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return chq.a(this.dZ().a($$0));
   }

   @Override
   public bvo<chp> dY() {
      return (bvo<chp>)super.dY();
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(bur.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cnx $$0, brr $$1, cvs $$2) {
      if ($$2.a(cvw.qJ)) {
         $$0.a($$1, cvv.a($$2, $$0, new cvs(cvw.qA)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ak();
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }

   public static boolean a(bty<? extends bun> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends btk.a {
      public final chp.e[] a;

      public b(chp.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public chp.e a(azn $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cao {
      public c(final chp $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!chp.this.gp()) {
            super.a();
         }
      }
   }

   static class d extends cap {
      private final chp l;

      public d(chp $$0) {
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

   public static enum e implements bab {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<chp.e> g = axw.a(chp.e::a, values(), axw.a.a);
      public static final Codec<chp.e> f = bab.a(chp.e::values);
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

      public static chp.e a(int $$0) {
         return g.apply($$0);
      }

      public static chp.e a(azn $$0) {
         return a($$0, true);
      }

      public static chp.e b(azn $$0) {
         return a($$0, false);
      }

      private static chp.e a(azn $$0, boolean $$1) {
         chp.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(chp.e[]::new);
         return ad.a($$2, $$0);
      }
   }
}
