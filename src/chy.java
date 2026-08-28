import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chy extends cgm implements bvv<chy.e>, cgo {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cfg<? extends cff<? super chy>>> bZ = ImmutableList.of(cfg.c, cfg.o, cfg.f, cfg.p, cfg.q);
   protected static final ImmutableList<? extends cdz<?>> ca = ImmutableList.of(
      cdz.r, cdz.g, cdz.h, cdz.k, cdz.l, cdz.n, cdz.m, cdz.E, cdz.t, cdz.o, cdz.p, cdz.K, new cdz[]{cdz.y, cdz.N, cdz.B, cdz.O, cdz.P, cdz.R, cdz.U, cdz.Z}
   );
   private static final akk<Integer> ck = ako.a(chy.class, akm.b);
   private static final akk<Boolean> cl = ako.a(chy.class, akm.k);
   private static final akk<Boolean> cm = ako.a(chy.class, akm.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axx cf = new axx(10, azj::m);
   public final axx cg = new axx(10, azj::m);
   public final axx ch = new axx(10, azj::m);
   public final axx ci = new axx(10, azj::m);
   private static final int cq = 100;

   public chy(bug<? extends chy> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.j, 0.0F);
      this.bP = new chy.d(this);
      this.bO = new chy.c(this, 20);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return 0.0F;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(chy.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gw()) {
         super.U();
      }
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      boolean $$4 = false;
      if ($$2 == buf.l) {
         return $$3;
      } else {
         azr $$5 = $$0.E_();
         if ($$3 instanceof chy.b) {
            if (((chy.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new chy.b(chy.e.a($$5), chy.e.a($$5));
         }

         this.a(((chy.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aA() {
      int $$0 = this.cu();
      super.aA();
      if (!this.gi()) {
         this.t($$0);
      }

      if (this.dX().y_()) {
         this.gy();
      }
   }

   private void gy() {
      chy.a $$0;
      if (this.gw()) {
         $$0 = chy.a.a;
      } else if (this.bn()) {
         $$0 = chy.a.b;
      } else if (this.aJ()) {
         $$0 = chy.a.c;
      } else {
         $$0 = chy.a.d;
      }

      this.cf.a($$0 == chy.a.a);
      this.cg.a($$0 == chy.a.b);
      this.ch.a($$0 == chy.a.c);
      boolean $$4 = this.aQ.d() || this.dP() != this.P || this.dN() != this.O;
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

   public chy.e gv() {
      return chy.e.a(this.am.a(ck));
   }

   public void a(chy.e $$0) {
      this.am.a(ck, $$0.a());
   }

   private static boolean a(azr $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cK() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cl, $$0);
   }

   public boolean gw() {
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
   public btq a(arm $$0, btq $$1) {
      chy $$2 = bug.f.a($$0, buf.e);
      if ($$2 != null) {
         chy.e $$3;
         if (a(this.af)) {
            $$3 = chy.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gv() : ((chy)$$1).gv();
         }

         $$2.a($$3);
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.az);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ac() {
      this.dX().ah().a("axolotlBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("axolotlActivityUpdate");
      chz.a(this);
      this.dX().ah().c();
      if (!this.gi()) {
         Optional<Integer> $$0 = this.ed().c(cdz.N);
         this.y($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bwc.a gx() {
      return cgm.gA().a(bwd.s, 14.0).a(bwd.v, 1.0).a(bwd.c, 2.0).a(bwd.B, 1.0);
   }

   @Override
   protected ceh b(dev $$0) {
      return new cee(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awk.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      float $$2 = this.eG();
      if (!this.dX().C
         && !this.gi()
         && this.dX().A.a(3) == 0
         && ((float)this.dX().A.a(3) < $$1 || $$2 / this.eV() < 0.5F)
         && $$1 < $$2
         && this.bk()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gw()) {
         this.bC.a(cdz.N, 200);
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
   public bry b(coh $$0, brx $$1) {
      return cgo.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void k(cvx $$0) {
      cgo.a(this, $$0);
      cyg.a(kt.W, $$0, $$0x -> {
         $$0x.a("Variant", this.gv().a());
         $$0x.a("Age", this.g());
         bvx<?> $$1 = this.ed();
         if ($$1.a(cdz.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cdz.U));
         }
      });
   }

   @Override
   public void h(uj $$0) {
      cgo.a(this, $$0);
      this.a(chy.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ed().a(cdz.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cvx X_() {
      return new cvx(cwb.qK);
   }

   @Override
   public awj y() {
      return awk.dj;
   }

   @Override
   public boolean ez() {
      return !this.gw() && super.ez();
   }

   public static void a(chy $$0, buv $$1) {
      dev $$2 = $$0.dX();
      if ($$1.eH()) {
         bsp $$3 = $$1.eI();
         if ($$3 != null) {
            btz $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bug.by) {
               coh $$5 = (coh)$$4;
               List<coh> $$6 = $$2.a(coh.class, $$0.cS().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(coh $$0) {
      bte $$1 = $$0.c(btg.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bte(btg.j, $$3, 0), this);
      }

      $$0.e(btg.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.t();
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.aM;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.aL;
   }

   @Nullable
   @Override
   protected awj w() {
      return this.bk() ? awk.aO : awk.aN;
   }

   @Override
   protected awj aW() {
      return awk.aP;
   }

   @Override
   protected awj aV() {
      return awk.aQ;
   }

   @Override
   protected bvx.b<chy> ee() {
      return bvx.a(ca, bZ);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return chz.a(this.ee().a($$0));
   }

   @Override
   public bvx<chy> ed() {
      return (bvx<chy>)super.ed();
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj() && this.bk()) {
         this.a(this.fr(), $$0);
         this.a(buz.a, this.dA());
         this.h(this.dA().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(coh $$0, brx $$1, cvx $$2) {
      if ($$2.a(cwb.qJ)) {
         $$0.a($$1, cwa.a($$2, $$0, new cvx(cwb.qA)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.am();
   }

   @Nullable
   @Override
   public buv m() {
      return this.R();
   }

   public static boolean a(bug<? extends buv> $$0, dfl $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends btq.a {
      public final chy.e[] a;

      public b(chy.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public chy.e a(azr $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cax {
      public c(final chy $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!chy.this.gw()) {
            super.a();
         }
      }
   }

   static class d extends cay {
      private final chy l;

      public d(chy $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gw()) {
            super.a();
         }
      }
   }

   public static enum e implements baf {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<chy.e> g = aya.a(chy.e::a, values(), aya.a.a);
      public static final Codec<chy.e> f = baf.a(chy.e::values);
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

      public static chy.e a(int $$0) {
         return g.apply($$0);
      }

      public static chy.e a(azr $$0) {
         return a($$0, true);
      }

      public static chy.e b(azr $$0) {
         return a($$0, false);
      }

      private static chy.e a(azr $$0, boolean $$1) {
         chy.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(chy.e[]::new);
         return ad.a($$2, $$0);
      }
   }
}
