import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgu extends cfa implements buk<ji<cfl>> {
   protected static final ImmutableList<cdv<? extends cdu<? super cgu>>> bY = ImmutableList.of(cdv.c, cdv.f, cdv.v, cdv.s, cdv.w);
   protected static final ImmutableList<cco<?>> bZ = ImmutableList.of(
      cco.n, cco.g, cco.h, cco.m, cco.E, cco.t, cco.r, cco.S, cco.T, cco.o, cco.O, cco.P, new cco[]{cco.R, cco.x, cco.y, cco.B, cco.X, cco.Y, cco.Z, cco.aa}
   );
   private static final akg<ji<cfl>> cg = akk.a(cgu.class, aki.z);
   private static final akg<OptionalInt> ch = akk.a(cgu.class, aki.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ala<cfl> cj = cfl.a;
   public final bsk cc = new bsk();
   public final bsk cd = new bsk();
   public final bsk ce = new bsk();
   public final bsk cf = new bsk();

   public cgu(bsv<? extends cfa> $$0, dbt $$1) {
      super($$0, $$1);
      this.bO = new cgu.a(this);
      this.a(eoh.j, 4.0F);
      this.a(eoh.e, -1.0F);
      this.bP = new bzn(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bum.b<cgu> dT() {
      return bum.a(bZ, bY);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return cgv.a(this.dT().a($$0));
   }

   @Override
   public bum<cgu> dS() {
      return (bum<cgu>)super.dS();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, lp.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<bsp> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsp $$0) {
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

   public ji<cfl> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfl> $$0) {
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
      Optional.ofNullable(alb.a($$0.l("variant"))).map($$0x -> ala.a(lq.B, $$0x)).flatMap(lp.al::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("frogBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("frogActivityUpdate");
      cgv.a(this);
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
   public void a(akg<?> $$0) {
      if (at.equals($$0)) {
         btw $$1 = this.ar();
         if ($$1 == btw.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == btw.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == btw.j) {
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
   public bsj a(arb $$0, bsj $$1) {
      cgu $$2 = bsv.R.a((dbt)$$0);
      if ($$2 != null) {
         cgv.a($$2, $$0.E_());
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
   public void a(arb $$0, cfa $$1) {
      this.a($$0, $$1, null);
      this.dS().a(cco.Y, azx.a);
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      ji<dcs> $$4 = $$0.t(this.dp());
      if ($$4.a(awk.ai)) {
         this.i(lp.al.g(cfl.c));
      } else if ($$4.a(awk.aj)) {
         this.i(lp.al.g(cfl.b));
      } else {
         this.i(lp.al.g(cj));
      }

      cgv.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bur.a gq() {
      return btm.A().a(bus.r, 1.0).a(bus.q, 10.0).a(bus.c, 10.0).a(bus.v, 1.0);
   }

   @Nullable
   @Override
   protected avv v() {
      return avw.jL;
   }

   @Nullable
   @Override
   protected avv d(bri $$0) {
      return avw.jO;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.jM;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(evm $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btp.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btk $$0) {
      if ($$0 instanceof ckh $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(awp.n);
   }

   @Override
   protected ccw b(dbt $$0) {
      return new cgu.c(this, $$0);
   }

   @Nullable
   @Override
   public btk p() {
      return this.N();
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.al);
   }

   public static boolean c(bsv<? extends cfa> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.cg) && a($$1, $$3);
   }

   class a extends bzk {
      a(final btm $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgu.this.u().isEmpty();
      }
   }

   static class b extends enz {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eoc a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayu.a(this.b.cK().a), ayu.a(this.b.cK().b), ayu.a(this.b.cK().c)));
      }

      @Override
      public eoh a(eoj $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         drx $$4 = $$0.a(this.l);
         return $$4.a(awl.bR) ? eoh.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cct {
      c(cgu $$0, dbt $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eoh $$0) {
         return $$0 != eoh.k && super.b($$0);
      }

      @Override
      protected eog a(int $$0) {
         this.o = new cgu.b(true);
         this.o.a(true);
         return new eog(this.o, $$0);
      }
   }
}
