import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgw extends cfc implements bum<jm<cfn>> {
   protected static final ImmutableList<cdx<? extends cdw<? super cgw>>> ca = ImmutableList.of(cdx.c, cdx.f, cdx.v, cdx.s, cdx.w);
   protected static final ImmutableList<ccq<?>> cb = ImmutableList.of(
      ccq.n, ccq.g, ccq.h, ccq.m, ccq.E, ccq.t, ccq.r, ccq.S, ccq.T, ccq.o, ccq.O, ccq.P, new ccq[]{ccq.R, ccq.x, ccq.y, ccq.B, ccq.X, ccq.Y, ccq.Z, ccq.aa}
   );
   private static final ajv<jm<cfn>> ci = ajz.a(cgw.class, ajx.z);
   private static final ajv<OptionalInt> cj = ajz.a(cgw.class, ajx.v);
   private static final int ck = 5;
   public static final String cc = "variant";
   private static final akp<cfn> cl = cfn.b;
   public final bsl ce = new bsl();
   public final bsl cf = new bsl();
   public final bsl cg = new bsl();
   public final bsl ch = new bsl();

   public cgw(bsw<? extends cfc> $$0, dcu $$1) {
      super($$0, $$1);
      this.bQ = new cgw.a(this);
      this.a(epp.j, 4.0F);
      this.a(epp.e, -1.0F);
      this.bR = new bzp(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected buo.b<cgw> dV() {
      return buo.a(cb, ca);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return cgx.a(this.dV().a($$0));
   }

   @Override
   public buo<cgw> dU() {
      return (buo<cgw>)super.dU();
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ci, lt.aj.g(cl));
      $$0.a(cj, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(cj, OptionalInt.empty());
   }

   public Optional<bsq> t() {
      return this.ao.a(cj).stream().mapToObj(this.dQ()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsq $$0) {
      this.ao.a(cj, OptionalInt.of($$0.an()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public jm<cfn> x() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jm<cfn> $$0) {
      this.ao.a(ci, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cl).a().toString());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akq.c($$0.l("variant"))).map($$0x -> akp.a(lu.F, $$0x)).flatMap(lt.aj::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("frogBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("frogActivityUpdate");
      cgx.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dQ().x_()) {
         this.ch.a(this.bi() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajv<?> $$0) {
      if (at.equals($$0)) {
         bty $$1 = this.at();
         if ($$1 == bty.g) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == bty.i) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }

         if ($$1 == bty.j) {
            this.cg.a(this.ai);
         } else {
            this.cg.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.ce.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aU.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      cgw $$2 = bsw.R.a((dcu)$$0);
      if ($$2 != null) {
         cgx.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean o_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aqt $$0, cfc $$1) {
      this.a($$0, $$1, null);
      this.dU().a(ccq.Y, azr.a);
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      jm<ddu> $$4 = $$0.t(this.dq());
      if ($$4.a(awc.ai)) {
         this.i(lt.aj.g(cfn.d));
      } else if ($$4.a(awc.aj)) {
         this.i(lt.aj.g(cfn.c));
      } else {
         this.i(lt.aj.g(cl));
      }

      cgx.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static but.a gm() {
      return btn.A().a(buu.v, 1.0).a(buu.s, 10.0).a(buu.c, 10.0).a(buu.B, 1.0);
   }

   @Nullable
   @Override
   protected avn v() {
      return avo.jL;
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.jO;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.jM;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a(eww $$0) {
      if (this.db() && this.bf()) {
         this.a(this.fk(), $$0);
         this.a(btq.a, this.dt());
         this.i(this.dt().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btl $$0) {
      if ($$0 instanceof ckk $$1 && $$1.gn() != 1) {
         return false;
      }

      return $$0.am().a(awh.n);
   }

   @Override
   protected ccy b(dcu $$0) {
      return new cgw.c(this, $$0);
   }

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.al);
   }

   public static boolean c(bsw<? extends cfc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.cg) && a($$1, $$3);
   }

   class a extends bzm {
      a(final btn $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgw.this.t().isEmpty();
      }
   }

   static class b extends eph {
      private final jd.a l = new jd.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public epk a() {
         return !this.b.bf() ? super.a() : this.c(new jd(ayn.a(this.b.cL().a), ayn.a(this.b.cL().b), ayn.a(this.b.cL().c)));
      }

      @Override
      public epp a(epr $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dta $$4 = $$0.a(this.l);
         return $$4.a(awd.bR) ? epp.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccv {
      c(cgw $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(epp $$0) {
         return $$0 != epp.k && super.b($$0);
      }

      @Override
      protected epo a(int $$0) {
         this.o = new cgw.b(true);
         this.o.a(true);
         return new epo(this.o, $$0);
      }
   }
}
