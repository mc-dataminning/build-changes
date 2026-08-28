import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chh extends cfv implements bve<chh.e>, cfx {
   public static final int bZ = 200;
   private static final int ck = 10;
   protected static final ImmutableList<? extends cep<? extends ceo<? super chh>>> ca = ImmutableList.of(cep.c, cep.o, cep.f, cep.p, cep.q);
   protected static final ImmutableList<? extends cdi<?>> cb = ImmutableList.of(
      cdi.r, cdi.g, cdi.h, cdi.k, cdi.l, cdi.n, cdi.m, cdi.E, cdi.t, cdi.o, cdi.p, cdi.K, new cdi[]{cdi.y, cdi.N, cdi.B, cdi.O, cdi.P, cdi.R, cdi.U, cdi.Z}
   );
   private static final akg<Integer> cl = akk.a(chh.class, aki.b);
   private static final akg<Boolean> cm = akk.a(chh.class, aki.k);
   private static final akg<Boolean> cn = akk.a(chh.class, aki.k);
   public static final double cd = 20.0;
   public static final int ce = 1200;
   private static final int co = 6000;
   public static final String cf = "Variant";
   private static final int cp = 1800;
   private static final int cq = 2400;
   public final axq cg = new axq(10, azc::l);
   public final axq ch = new axq(10, azc::l);
   public final axq ci = new axq(10, azc::l);
   public final axq cj = new axq(10, azc::l);
   private static final int cr = 100;

   public chh(btq<? extends chh> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.j, 0.0F);
      this.bQ = new chh.d(this);
      this.bP = new chh.c(this, 20);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cl, 0);
      $$0.a(cm, false);
      $$0.a(cn, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.go().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(chh.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gp()) {
         super.U();
      }
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      boolean $$4 = false;
      if ($$2 == btp.l) {
         return $$3;
      } else {
         azk $$5 = $$0.C_();
         if ($$3 instanceof chh.b) {
            if (((chh.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new chh.b(chh.e.a($$5), chh.e.a($$5));
         }

         this.a(((chh.b)$$3).a($$5));
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

      if (this.dS().w_()) {
         this.gr();
      }
   }

   private void gr() {
      chh.a $$0;
      if (this.gp()) {
         $$0 = chh.a.a;
      } else if (this.bl()) {
         $$0 = chh.a.b;
      } else if (this.aH()) {
         $$0 = chh.a.c;
      } else {
         $$0 = chh.a.d;
      }

      this.cg.a($$0 == chh.a.a);
      this.ch.a($$0 == chh.a.b);
      this.ci.a($$0 == chh.a.c);
      boolean $$4 = this.aQ.d() || this.dK() != this.P || this.dI() != this.O;
      this.cj.a($$4);
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

   public chh.e go() {
      return chh.e.a(this.am.a(cl));
   }

   public void a(chh.e $$0) {
      this.am.a(cl, $$0.a());
   }

   private static boolean a(azk $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cG() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cm, $$0);
   }

   public boolean gp() {
      return this.am.a(cm);
   }

   @Override
   public boolean t() {
      return this.am.a(cn);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(cn, $$0);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      chh $$2 = btq.f.a($$0, btp.e);
      if ($$2 != null) {
         chh.e $$3;
         if (a(this.af)) {
            $$3 = chh.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.go() : ((chh)$$1).go();
         }

         $$2.a($$3);
         $$2.fV();
      }

      return $$2;
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ay);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("axolotlBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("axolotlActivityUpdate");
      chi.a(this);
      this.dS().ah().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dX().c(cdi.N);
         this.y($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bvl.a gq() {
      return cfv.gt().a(bvm.s, 14.0).a(bvm.v, 1.0).a(bvm.c, 2.0).a(bvm.B, 1.0);
   }

   @Override
   protected cdq b(dds $$0) {
      return new cdn(this, $$0);
   }

   @Override
   public void gh() {
      this.a(awd.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dS().B
         && !this.gd()
         && this.dS().z.a(3) == 0
         && ((float)this.dS().z.a(3) < $$1 || $$2 / this.eQ() < 0.5F)
         && $$1 < $$2
         && this.bi()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gp()) {
         this.bC.a(cdi.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public int ag() {
      return 1;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      return cfx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void o(cvl $$0) {
      cfx.a(this, $$0);
      cya.a(kr.P, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.g());
         bvg<?> $$1 = this.dX();
         if ($$1.a(cdi.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cdi.U));
         }
      });
   }

   @Override
   public void h(uf $$0) {
      cfx.a(this, $$0);
      this.a(chh.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dX().a(cdi.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cvl V_() {
      return new cvl(cvo.qK);
   }

   @Override
   public awc y() {
      return awd.dj;
   }

   @Override
   public boolean et() {
      return !this.gp() && super.et();
   }

   public static void a(chh $$0, buf $$1) {
      dds $$2 = $$0.dS();
      if ($$1.eB()) {
         bsb $$3 = $$1.eC();
         if ($$3 != null) {
            btj $$4 = $$3.d();
            if ($$4 != null && $$4.ao() == btq.by) {
               cnp $$5 = (cnp)$$4;
               List<cnp> $$6 = $$2.a(cnp.class, $$0.cO().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(cnp $$0) {
      bsq $$1 = $$0.c(bss.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsq(bss.j, $$3, 0), this);
      }

      $$0.e(bss.d);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.t();
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.aM;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.aL;
   }

   @Nullable
   @Override
   protected awc w() {
      return this.bi() ? awd.aO : awd.aN;
   }

   @Override
   protected awc aU() {
      return awd.aP;
   }

   @Override
   protected awc aT() {
      return awd.aQ;
   }

   @Override
   protected bvg.b<chh> dY() {
      return bvg.a(cb, ca);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return chi.a(this.dY().a($$0));
   }

   @Override
   public bvg<chh> dX() {
      return (bvg<chh>)super.dX();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cnp $$0, brj $$1, cvl $$2) {
      if ($$2.a(cvo.qJ)) {
         $$0.a($$1, cvn.a($$2, $$0, new cvl(cvo.qA)));
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
   public buf m() {
      return this.R();
   }

   public static boolean a(btq<? extends buf> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends btc.a {
      public final chh.e[] a;

      public b(chh.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public chh.e a(azk $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cag {
      public c(final chh $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!chh.this.gp()) {
            super.a();
         }
      }
   }

   static class d extends cah {
      private final chh l;

      public d(chh $$0) {
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

   public static enum e implements azy {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<chh.e> g = axt.a(chh.e::a, values(), axt.a.a);
      public static final Codec<chh.e> f = azy.a(chh.e::values);
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

      public static chh.e a(int $$0) {
         return g.apply($$0);
      }

      public static chh.e a(azk $$0) {
         return a($$0, true);
      }

      public static chh.e b(azk $$0) {
         return a($$0, false);
      }

      private static chh.e a(azk $$0, boolean $$1) {
         chh.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(chh.e[]::new);
         return ad.a($$2, $$0);
      }
   }
}
