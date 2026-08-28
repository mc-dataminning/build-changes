import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgz extends cff implements bup<ji<cfq>> {
   protected static final ImmutableList<cea<? extends cdz<? super cgz>>> bY = ImmutableList.of(cea.c, cea.f, cea.v, cea.s, cea.w);
   protected static final ImmutableList<cct<?>> bZ = ImmutableList.of(
      cct.n, cct.g, cct.h, cct.m, cct.E, cct.t, cct.r, cct.S, cct.T, cct.o, cct.O, cct.P, new cct[]{cct.R, cct.x, cct.y, cct.B, cct.X, cct.Y, cct.Z, cct.aa}
   );
   private static final akk<ji<cfq>> cg = ako.a(cgz.class, akm.z);
   private static final akk<OptionalInt> ch = ako.a(cgz.class, akm.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ale<cfq> cj = cfq.a;
   public final bsp cc = new bsp();
   public final bsp cd = new bsp();
   public final bsp ce = new bsp();
   public final bsp cf = new bsp();

   public cgz(bta<? extends cff> $$0, dby $$1) {
      super($$0, $$1);
      this.bO = new cgz.a(this);
      this.a(eom.j, 4.0F);
      this.a(eom.e, -1.0F);
      this.bP = new bzs(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bur.b<cgz> dT() {
      return bur.a(bZ, bY);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return cha.a(this.dT().a($$0));
   }

   @Override
   public bur<cgz> dS() {
      return (bur<cgz>)super.dS();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cg, lp.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<bsu> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsu $$0) {
      this.ao.a(ch, OptionalInt.of($$0.al()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public ji<cfq> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfq> $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      Optional.ofNullable(alf.a($$0.l("variant"))).map($$0x -> ale.a(lq.B, $$0x)).flatMap(lp.al::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("frogBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("frogActivityUpdate");
      cha.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dP().x_()) {
         this.cf.a(this.bh() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(akk<?> $$0) {
      if (at.equals($$0)) {
         bub $$1 = this.ar();
         if ($$1 == bub.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == bub.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == bub.j) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cc.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aU.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      cgz $$2 = bta.R.a((dby)$$0);
      if ($$2 != null) {
         cha.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arf $$0, cff $$1) {
      this.a($$0, $$1, null);
      this.dS().a(cct.Y, bac.a);
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      ji<dcx> $$4 = $$0.t(this.dp());
      if ($$4.a(awo.ai)) {
         this.i(lp.al.g(cfq.c));
      } else if ($$4.a(awo.aj)) {
         this.i(lp.al.g(cfq.b));
      } else {
         this.i(lp.al.g(cj));
      }

      cha.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buw.a gq() {
      return btr.A().a(bux.r, 1.0).a(bux.q, 10.0).a(bux.c, 10.0).a(bux.v, 1.0);
   }

   @Nullable
   @Override
   protected avz v() {
      return awa.jL;
   }

   @Nullable
   @Override
   protected avz d(brn $$0) {
      return awa.jO;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.jM;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(evr $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btu.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btp $$0) {
      if ($$0 instanceof ckm $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(awt.n);
   }

   @Override
   protected cdb b(dby $$0) {
      return new cgz.c(this, $$0);
   }

   @Nullable
   @Override
   public btp p() {
      return this.N();
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(bta<? extends cff> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cg) && a($$1, $$3);
   }

   class a extends bzp {
      a(final btr $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgz.this.u().isEmpty();
      }
   }

   static class b extends eoe {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eoh a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayz.a(this.b.cK().a), ayz.a(this.b.cK().b), ayz.a(this.b.cK().c)));
      }

      @Override
      public eom a(eoo $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsc $$4 = $$0.a(this.l);
         return $$4.a(awp.bR) ? eom.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccy {
      c(cgz $$0, dby $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eom $$0) {
         return $$0 != eom.k && super.b($$0);
      }

      @Override
      protected eol a(int $$0) {
         this.o = new cgz.b(true);
         this.o.a(true);
         return new eol(this.o, $$0);
      }
   }
}
