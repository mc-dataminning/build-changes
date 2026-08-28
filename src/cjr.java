import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cjr extends chx implements bxg<jq<cii>> {
   protected static final ImmutableList<cgr<? extends cgq<? super cjr>>> bZ = ImmutableList.of(cgr.c, cgr.f, cgr.v, cgr.s, cgr.w);
   protected static final ImmutableList<cfk<?>> ca = ImmutableList.of(
      cfk.n, cfk.g, cfk.h, cfk.m, cfk.E, cfk.t, cfk.r, cfk.S, cfk.T, cfk.o, cfk.O, cfk.P, new cfk[]{cfk.R, cfk.x, cfk.y, cfk.B, cfk.X, cfk.Y, cfk.Z, cfk.aa}
   );
   private static final alc<jq<cii>> ch = alg.a(cjr.class, ale.z);
   private static final alc<OptionalInt> ci = alg.a(cjr.class, ale.v);
   private static final int cj = 5;
   public static final String cb = "variant";
   private static final aly<cii> ck = cii.b;
   public final bvc cd = new bvc();
   public final bvc ce = new bvc();
   public final bvc cf = new bvc();
   public final bvc cg = new bvc();

   public cjr(bvr<? extends chx> $$0, dhi $$1) {
      super($$0, $$1);
      this.bP = new cjr.a(this);
      this.a(euo.j, 4.0F);
      this.a(euo.e, -1.0F);
      this.bQ = new ccj(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxi.b<cjr> ed() {
      return bxi.a(ca, bZ);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cjs.a(this.ed().a($$0));
   }

   @Override
   public bxi<cjr> ec() {
      return (bxi<cjr>)super.ec();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ch, ma.aj.b(ck));
      $$0.a(ci, OptionalInt.empty());
   }

   public void p() {
      this.al.a(ci, OptionalInt.empty());
   }

   public Optional<bvk> t() {
      return this.al.a(ci).stream().mapToObj(this.dW()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bvk $$0) {
      this.al.a(ci, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ac() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public jq<cii> x() {
      return this.al.a(ch);
   }

   public void j(jq<cii> $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(ck).a().toString());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      Optional.ofNullable(alz.c($$0.l("variant"))).map($$0x -> aly.a(mb.F, $$0x)).flatMap(ma.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cjs.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dW().B_()) {
         this.cg.a(this.bm() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(alc<?> $$0) {
      if (aq.equals($$0)) {
         bws $$1 = this.aw();
         if ($$1 == bws.g) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bws.i) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }

         if ($$1 == bws.j) {
            this.cf.a(this.af);
         } else {
            this.cf.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cd.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void gu() {
      this.dW().a(null, this, axf.kh, axg.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      cjr $$2 = bvr.ac.a($$0, bvq.e);
      if ($$2 != null) {
         cjs.a($$2, $$0.H_());
      }

      return $$2;
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(ash $$0, chx $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cfk.Y, bbk.a);
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      jq<dik> $$4 = $$0.t(this.dw());
      if ($$4.a(axt.ai)) {
         this.j(ma.aj.b(cii.d));
      } else if ($$4.a(axt.aj)) {
         this.j(ma.aj.b(cii.c));
      } else {
         this.j(ma.aj.b(ck));
      }

      cjs.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxn.a go() {
      return chx.gt().a(bxo.v, 1.0).a(bxo.s, 10.0).a(bxo.c, 10.0).a(bxo.B, 1.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.kf;
   }

   @Nullable
   @Override
   protected axe e(bua $$0) {
      return axf.ki;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.kg;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.kl, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 5;
   }

   @Override
   public void a_(fby $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwk.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bwg $$0) {
      if ($$0 instanceof cng $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axy.n);
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cjr.c(this, $$0);
   }

   @Nullable
   @Override
   public bwg O_() {
      return this.O();
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.aq);
   }

   public static boolean c(bvr<? extends chx> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ci) && a($$1, $$3);
   }

   class a extends ccg {
      a(final bwi $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cjr.this.t().isEmpty();
      }
   }

   static class b extends eug {
      private final jh.a a = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public euj a() {
         return !this.c.bj() ? super.a() : this.c(new jh(bae.a(this.c.cR().a), bae.a(this.c.cR().b), bae.a(this.c.cR().c)));
      }

      @Override
      public euo a(euq $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dxv $$4 = $$0.a(this.a);
         return $$4.a(axu.bT) ? euo.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfp {
      c(cjr $$0, dhi $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(euo $$0) {
         return $$0 != euo.k && super.b($$0);
      }

      @Override
      protected eun a(int $$0) {
         this.o = new cjr.b(true);
         this.o.a(true);
         return new eun(this.o, $$0);
      }
   }
}
