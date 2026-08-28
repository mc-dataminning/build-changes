import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cjm extends chs implements bxb<jq<cid>> {
   protected static final ImmutableList<cgm<? extends cgl<? super cjm>>> bZ = ImmutableList.of(cgm.c, cgm.f, cgm.v, cgm.s, cgm.w);
   protected static final ImmutableList<cff<?>> ca = ImmutableList.of(
      cff.n, cff.g, cff.h, cff.m, cff.E, cff.t, cff.r, cff.S, cff.T, cff.o, cff.O, cff.P, new cff[]{cff.R, cff.x, cff.y, cff.B, cff.X, cff.Y, cff.Z, cff.aa}
   );
   private static final alc<jq<cid>> ch = alg.a(cjm.class, ale.z);
   private static final alc<OptionalInt> ci = alg.a(cjm.class, ale.v);
   private static final int cj = 5;
   public static final String cb = "variant";
   private static final aly<cid> ck = cid.b;
   public final bux cd = new bux();
   public final bux ce = new bux();
   public final bux cf = new bux();
   public final bux cg = new bux();

   public cjm(bvm<? extends chs> $$0, dha $$1) {
      super($$0, $$1);
      this.bP = new cjm.a(this);
      this.a(eug.j, 4.0F);
      this.a(eug.e, -1.0F);
      this.bQ = new cce(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxd.b<cjm> ec() {
      return bxd.a(ca, bZ);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjn.a(this.ec().a($$0));
   }

   @Override
   public bxd<cjm> eb() {
      return (bxd<cjm>)super.eb();
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

   public Optional<bvf> t() {
      return this.al.a(ci).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bvf $$0) {
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

   public jq<cid> x() {
      return this.al.a(ch);
   }

   public void j(jq<cid> $$0) {
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
      bpo $$1 = bpn.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cjn.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().B_()) {
         this.cg.a(this.bm() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(alc<?> $$0) {
      if (aq.equals($$0)) {
         bwn $$1 = this.aw();
         if ($$1 == bwn.g) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bwn.i) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }

         if ($$1 == bwn.j) {
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
   public void gs() {
      this.dV().a(null, this, axf.kg, axg.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      cjm $$2 = bvm.ac.a($$0, bvl.e);
      if ($$2 != null) {
         cjn.a($$2, $$0.H_());
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
   public void a(ash $$0, chs $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cff.Y, bbk.a);
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      jq<dic> $$4 = $$0.t(this.dv());
      if ($$4.a(axt.ai)) {
         this.j(ma.aj.b(cid.d));
      } else if ($$4.a(axt.aj)) {
         this.j(ma.aj.b(cid.c));
      } else {
         this.j(ma.aj.b(ck));
      }

      cjn.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxi.a gm() {
      return chs.gr().a(bxj.v, 1.0).a(bxj.s, 10.0).a(bxj.c, 10.0).a(bxj.B, 1.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.ke;
   }

   @Nullable
   @Override
   protected axe e(btv $$0) {
      return axf.kh;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.kf;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.kk, 0.15F, 1.0F);
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
   public void a_(fbs $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwf.a, this.dy());
         this.h(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bwb $$0) {
      if ($$0 instanceof cnb $$1 && $$1.gm() != 1) {
         return false;
      }

      return $$0.aq().a(axy.n);
   }

   @Override
   protected cfn b(dha $$0) {
      return new cjm.c(this, $$0);
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.O();
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.aq);
   }

   public static boolean c(bvm<? extends chs> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ci) && a($$1, $$3);
   }

   class a extends ccb {
      a(final bwd $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cjm.this.t().isEmpty();
      }
   }

   static class b extends ety {
      private final jh.a a = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eub a() {
         return !this.c.bj() ? super.a() : this.c(new jh(bae.a(this.c.cR().a), bae.a(this.c.cR().b), bae.a(this.c.cR().c)));
      }

      @Override
      public eug a(eui $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dxn $$4 = $$0.a(this.a);
         return $$4.a(axu.bT) ? eug.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfk {
      c(cjm $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eug $$0) {
         return $$0 != eug.k && super.b($$0);
      }

      @Override
      protected euf a(int $$0) {
         this.o = new cjm.b(true);
         this.o.a(true);
         return new euf(this.o, $$0);
      }
   }
}
