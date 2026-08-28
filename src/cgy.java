import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgy extends cfe implements buo<jm<cfp>> {
   protected static final ImmutableList<cdz<? extends cdy<? super cgy>>> ca = ImmutableList.of(cdz.c, cdz.f, cdz.v, cdz.s, cdz.w);
   protected static final ImmutableList<ccs<?>> cb = ImmutableList.of(
      ccs.n, ccs.g, ccs.h, ccs.m, ccs.E, ccs.t, ccs.r, ccs.S, ccs.T, ccs.o, ccs.O, ccs.P, new ccs[]{ccs.R, ccs.x, ccs.y, ccs.B, ccs.X, ccs.Y, ccs.Z, ccs.aa}
   );
   private static final ajw<jm<cfp>> ci = aka.a(cgy.class, ajy.z);
   private static final ajw<OptionalInt> cj = aka.a(cgy.class, ajy.v);
   private static final int ck = 5;
   public static final String cc = "variant";
   private static final akq<cfp> cl = cfp.b;
   public final bsm ce = new bsm();
   public final bsm cf = new bsm();
   public final bsm cg = new bsm();
   public final bsm ch = new bsm();

   public cgy(bsx<? extends cfe> $$0, dcw $$1) {
      super($$0, $$1);
      this.bQ = new cgy.a(this);
      this.a(epv.j, 4.0F);
      this.a(epv.e, -1.0F);
      this.bR = new bzr(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected buq.b<cgy> dU() {
      return buq.a(cb, ca);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgz.a(this.dU().a($$0));
   }

   @Override
   public buq<cgy> dT() {
      return (buq<cgy>)super.dT();
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ci, lt.aj.g(cl));
      $$0.a(cj, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(cj, OptionalInt.empty());
   }

   public Optional<bsr> t() {
      return this.ao.a(cj).stream().mapToObj(this.dO()::a).filter(Objects::nonNull).findFirst();
   }

   public void c(bsr $$0) {
      this.ao.a(cj, OptionalInt.of($$0.an()));
   }

   @Override
   public int fM() {
      return 35;
   }

   @Override
   public int ae() {
      return 5;
   }

   public jm<cfp> x() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jm<cfp> $$0) {
      this.ao.a(ci, $$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(cl).a().toString());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      Optional.ofNullable(akr.c($$0.l("variant"))).map($$0x -> akq.a(lu.F, $$0x)).flatMap(lt.aj::b).ifPresent(this::i);
   }

   @Override
   protected void ab() {
      this.dO().ag().a("frogBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("frogActivityUpdate");
      cgz.a(this);
      this.dO().ag().c();
      super.ab();
   }

   @Override
   public void l() {
      if (this.dO().x_()) {
         this.ch.a(this.bi() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajw<?> $$0) {
      if (at.equals($$0)) {
         bua $$1 = this.at();
         if ($$1 == bua.g) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == bua.i) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }

         if ($$1 == bua.j) {
            this.cg.a(this.ai);
         } else {
            this.cg.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void z(float $$0) {
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
   public bsl a(aqu $$0, bsl $$1) {
      cgy $$2 = bsx.R.a((dcw)$$0);
      if ($$2 != null) {
         cgz.a($$2, $$0.E_());
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
   public void a(aqu $$0, cfe $$1) {
      this.a($$0, $$1, null);
      this.dT().a(ccs.Y, azs.a);
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      jm<ddw> $$4 = $$0.t(this.do());
      if ($$4.a(awd.ai)) {
         this.i(lt.aj.g(cfp.d));
      } else if ($$4.a(awd.aj)) {
         this.i(lt.aj.g(cfp.c));
      } else {
         this.i(lt.aj.g(cl));
      }

      cgz.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buv.a gk() {
      return btp.C().a(buw.v, 1.0).a(buw.s, 10.0).a(buw.c, 10.0).a(buw.B, 1.0);
   }

   @Nullable
   @Override
   protected avo v() {
      return avp.jL;
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return avp.jO;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.jM;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a(exc $$0) {
      if (this.da() && this.bf()) {
         this.a(this.fj(), $$0);
         this.a(bts.a, this.dr());
         this.i(this.dr().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btn $$0) {
      if ($$0 instanceof ckm $$1 && $$1.gl() != 1) {
         return false;
      }

      return $$0.am().a(awi.n);
   }

   @Override
   protected cda b(dcw $$0) {
      return new cgy.c(this, $$0);
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.al);
   }

   public static boolean c(bsx<? extends cfe> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.ch) && a($$1, $$3);
   }

   class a extends bzo {
      a(final btp $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgy.this.t().isEmpty();
      }
   }

   static class b extends epn {
      private final jd.a l = new jd.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public epq a() {
         return !this.b.bf() ? super.a() : this.c(new jd(ayo.a(this.b.cK().a), ayo.a(this.b.cK().b), ayo.a(this.b.cK().c)));
      }

      @Override
      public epv a(epx $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dtc $$4 = $$0.a(this.l);
         return $$4.a(awe.bS) ? epv.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccx {
      c(cgy $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(epv $$0) {
         return $$0 != epv.k && super.b($$0);
      }

      @Override
      protected epu a(int $$0) {
         this.o = new cgy.b(true);
         this.o.a(true);
         return new epu(this.o, $$0);
      }
   }
}
