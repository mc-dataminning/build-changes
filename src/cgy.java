import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgy extends cfe implements buo<ji<cfp>> {
   protected static final ImmutableList<cdz<? extends cdy<? super cgy>>> bY = ImmutableList.of(cdz.c, cdz.f, cdz.v, cdz.s, cdz.w);
   protected static final ImmutableList<ccs<?>> bZ = ImmutableList.of(
      ccs.n, ccs.g, ccs.h, ccs.m, ccs.E, ccs.t, ccs.r, ccs.S, ccs.T, ccs.o, ccs.O, ccs.P, new ccs[]{ccs.R, ccs.x, ccs.y, ccs.B, ccs.X, ccs.Y, ccs.Z, ccs.aa}
   );
   private static final akj<ji<cfp>> cg = akn.a(cgy.class, akl.z);
   private static final akj<OptionalInt> ch = akn.a(cgy.class, akl.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ald<cfp> cj = cfp.a;
   public final bso cc = new bso();
   public final bso cd = new bso();
   public final bso ce = new bso();
   public final bso cf = new bso();

   public cgy(bsz<? extends cfe> $$0, dbx $$1) {
      super($$0, $$1);
      this.bO = new cgy.a(this);
      this.a(eol.j, 4.0F);
      this.a(eol.e, -1.0F);
      this.bP = new bzr(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected buq.b<cgy> dT() {
      return buq.a(bZ, bY);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cgz.a(this.dT().a($$0));
   }

   @Override
   public buq<cgy> dS() {
      return (buq<cgy>)super.dS();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cg, lp.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<bst> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bst $$0) {
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

   public ji<cfp> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfp> $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(ale.a($$0.l("variant"))).map($$0x -> ald.a(lq.B, $$0x)).flatMap(lp.al::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("frogBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("frogActivityUpdate");
      cgz.a(this);
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
   public void a(akj<?> $$0) {
      if (at.equals($$0)) {
         bua $$1 = this.ar();
         if ($$1 == bua.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == bua.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == bua.j) {
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
   public bsn a(are $$0, bsn $$1) {
      cgy $$2 = bsz.R.a((dbx)$$0);
      if ($$2 != null) {
         cgz.a($$2, $$0.E_());
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
   public void a(are $$0, cfe $$1) {
      this.a($$0, $$1, null);
      this.dS().a(ccs.Y, bab.a);
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      ji<dcw> $$4 = $$0.t(this.dp());
      if ($$4.a(awn.ai)) {
         this.i(lp.al.g(cfp.c));
      } else if ($$4.a(awn.aj)) {
         this.i(lp.al.g(cfp.b));
      } else {
         this.i(lp.al.g(cj));
      }

      cgz.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buv.a gq() {
      return btq.A().a(buw.r, 1.0).a(buw.q, 10.0).a(buw.c, 10.0).a(buw.v, 1.0);
   }

   @Nullable
   @Override
   protected avy v() {
      return avz.jL;
   }

   @Nullable
   @Override
   protected avy d(brm $$0) {
      return avz.jO;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.jM;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(evq $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btt.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bto $$0) {
      if ($$0 instanceof ckl $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(aws.n);
   }

   @Override
   protected cda b(dbx $$0) {
      return new cgy.c(this, $$0);
   }

   @Nullable
   @Override
   public bto p() {
      return this.N();
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.al);
   }

   public static boolean c(bsz<? extends cfe> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.cg) && a($$1, $$3);
   }

   class a extends bzo {
      a(final btq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgy.this.u().isEmpty();
      }
   }

   static class b extends eod {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eog a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayy.a(this.b.cK().a), ayy.a(this.b.cK().b), ayy.a(this.b.cK().c)));
      }

      @Override
      public eol a(eon $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsb $$4 = $$0.a(this.l);
         return $$4.a(awo.bR) ? eol.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccx {
      c(cgy $$0, dbx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eol $$0) {
         return $$0 != eol.k && super.b($$0);
      }

      @Override
      protected eok a(int $$0) {
         this.o = new cgy.b(true);
         this.o.a(true);
         return new eok(this.o, $$0);
      }
   }
}
