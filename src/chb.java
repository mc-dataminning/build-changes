import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class chb extends cfh implements bur<ji<cfs>> {
   protected static final ImmutableList<cec<? extends ceb<? super chb>>> bY = ImmutableList.of(cec.c, cec.f, cec.v, cec.s, cec.w);
   protected static final ImmutableList<ccv<?>> bZ = ImmutableList.of(
      ccv.n, ccv.g, ccv.h, ccv.m, ccv.E, ccv.t, ccv.r, ccv.S, ccv.T, ccv.o, ccv.O, ccv.P, new ccv[]{ccv.R, ccv.x, ccv.y, ccv.B, ccv.X, ccv.Y, ccv.Z, ccv.aa}
   );
   private static final akk<ji<cfs>> cg = ako.a(chb.class, akm.z);
   private static final akk<OptionalInt> ch = ako.a(chb.class, akm.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ale<cfs> cj = cfs.a;
   public final bsr cc = new bsr();
   public final bsr cd = new bsr();
   public final bsr ce = new bsr();
   public final bsr cf = new bsr();

   public chb(btc<? extends cfh> $$0, dca $$1) {
      super($$0, $$1);
      this.bO = new chb.a(this);
      this.a(eoo.j, 4.0F);
      this.a(eoo.e, -1.0F);
      this.bP = new bzu(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected but.b<chb> dT() {
      return but.a(bZ, bY);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      return chc.a(this.dT().a($$0));
   }

   @Override
   public but<chb> dS() {
      return (but<chb>)super.dS();
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

   public Optional<bsw> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsw $$0) {
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

   public ji<cfs> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfs> $$0) {
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
      chc.a(this);
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
         bud $$1 = this.ar();
         if ($$1 == bud.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == bud.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == bud.j) {
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
   public bsq a(arf $$0, bsq $$1) {
      chb $$2 = btc.R.a((dca)$$0);
      if ($$2 != null) {
         chc.a($$2, $$0.E_());
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
   public void a(arf $$0, cfh $$1) {
      this.a($$0, $$1, null);
      this.dS().a(ccv.Y, bac.a);
   }

   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      ji<dcz> $$4 = $$0.t(this.dp());
      if ($$4.a(awo.ai)) {
         this.i(lp.al.g(cfs.c));
      } else if ($$4.a(awo.aj)) {
         this.i(lp.al.g(cfs.b));
      } else {
         this.i(lp.al.g(cj));
      }

      chc.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buy.a gq() {
      return btt.A().a(buz.r, 1.0).a(buz.q, 10.0).a(buz.c, 10.0).a(buz.v, 1.0);
   }

   @Nullable
   @Override
   protected avz v() {
      return awa.jL;
   }

   @Nullable
   @Override
   protected avz d(brp $$0) {
      return awa.jO;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.jM;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
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
   public void a(evt $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btw.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btr $$0) {
      if ($$0 instanceof cko $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(awt.n);
   }

   @Override
   protected cdd b(dca $$0) {
      return new chb.c(this, $$0);
   }

   @Nullable
   @Override
   public btr p() {
      return this.N();
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(btc<? extends cfh> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cg) && a($$1, $$3);
   }

   class a extends bzr {
      a(final btt $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return chb.this.u().isEmpty();
      }
   }

   static class b extends eog {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eoj a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayz.a(this.b.cK().a), ayz.a(this.b.cK().b), ayz.a(this.b.cK().c)));
      }

      @Override
      public eoo a(eoq $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dse $$4 = $$0.a(this.l);
         return $$4.a(awp.bR) ? eoo.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cda {
      c(chb $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eoo $$0) {
         return $$0 != eoo.k && super.b($$0);
      }

      @Override
      protected eon a(int $$0) {
         this.o = new chb.b(true);
         this.o.a(true);
         return new eon(this.o, $$0);
      }
   }
}
