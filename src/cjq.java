import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cjq extends chw implements bxf<jq<cih>> {
   protected static final ImmutableList<cgq<? extends cgp<? super cjq>>> bZ = ImmutableList.of(cgq.c, cgq.f, cgq.v, cgq.s, cgq.w);
   protected static final ImmutableList<cfj<?>> ca = ImmutableList.of(
      cfj.n, cfj.g, cfj.h, cfj.m, cfj.E, cfj.t, cfj.r, cfj.S, cfj.T, cfj.o, cfj.O, cfj.P, new cfj[]{cfj.R, cfj.x, cfj.y, cfj.B, cfj.X, cfj.Y, cfj.Z, cfj.aa}
   );
   private static final alc<jq<cih>> ch = alg.a(cjq.class, ale.z);
   private static final alc<OptionalInt> ci = alg.a(cjq.class, ale.v);
   private static final int cj = 5;
   public static final String cb = "variant";
   private static final aly<cih> ck = cih.b;
   public final bvb cd = new bvb();
   public final bvb ce = new bvb();
   public final bvb cf = new bvb();
   public final bvb cg = new bvb();

   public cjq(bvq<? extends chw> $$0, dhh $$1) {
      super($$0, $$1);
      this.bP = new cjq.a(this);
      this.a(eun.j, 4.0F);
      this.a(eun.e, -1.0F);
      this.bQ = new cci(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxh.b<cjq> ed() {
      return bxh.a(ca, bZ);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cjr.a(this.ed().a($$0));
   }

   @Override
   public bxh<cjq> ec() {
      return (bxh<cjq>)super.ec();
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

   public Optional<bvj> t() {
      return this.al.a(ci).stream().mapToObj(this.dW()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bvj $$0) {
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

   public jq<cih> x() {
      return this.al.a(ch);
   }

   public void j(jq<cih> $$0) {
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
      bps $$1 = bpr.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cjr.a(this);
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
         bwr $$1 = this.aw();
         if ($$1 == bwr.g) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bwr.i) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }

         if ($$1 == bwr.j) {
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
   public bva a(ash $$0, bva $$1) {
      cjq $$2 = bvq.ac.a($$0, bvp.e);
      if ($$2 != null) {
         cjr.a($$2, $$0.H_());
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
   public void a(ash $$0, chw $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cfj.Y, bbk.a);
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      jq<dij> $$4 = $$0.t(this.dw());
      if ($$4.a(axt.ai)) {
         this.j(ma.aj.b(cih.d));
      } else if ($$4.a(axt.aj)) {
         this.j(ma.aj.b(cih.c));
      } else {
         this.j(ma.aj.b(ck));
      }

      cjr.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxm.a go() {
      return chw.gt().a(bxn.v, 1.0).a(bxn.s, 10.0).a(bxn.c, 10.0).a(bxn.B, 1.0);
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.kf;
   }

   @Nullable
   @Override
   protected axe e(btz $$0) {
      return axf.ki;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.kg;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
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
   public void a_(fbx $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwj.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bwf $$0) {
      if ($$0 instanceof cnf $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axy.n);
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cjq.c(this, $$0);
   }

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.aq);
   }

   public static boolean c(bvq<? extends chw> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ci) && a($$1, $$3);
   }

   class a extends ccf {
      a(final bwh $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cjq.this.t().isEmpty();
      }
   }

   static class b extends euf {
      private final jh.a a = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eui a() {
         return !this.c.bj() ? super.a() : this.c(new jh(bae.a(this.c.cR().a), bae.a(this.c.cR().b), bae.a(this.c.cR().c)));
      }

      @Override
      public eun a(eup $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dxu $$4 = $$0.a(this.a);
         return $$4.a(axu.bT) ? eun.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfo {
      c(cjq $$0, dhh $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eun $$0) {
         return $$0 != eun.k && super.b($$0);
      }

      @Override
      protected eum a(int $$0) {
         this.o = new cjq.b(true);
         this.o.a(true);
         return new eum(this.o, $$0);
      }
   }
}
