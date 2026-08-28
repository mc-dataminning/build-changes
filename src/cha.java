import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cha extends cfg implements buq<ji<cfr>> {
   protected static final ImmutableList<ceb<? extends cea<? super cha>>> bY = ImmutableList.of(ceb.c, ceb.f, ceb.v, ceb.s, ceb.w);
   protected static final ImmutableList<ccu<?>> bZ = ImmutableList.of(
      ccu.n, ccu.g, ccu.h, ccu.m, ccu.E, ccu.t, ccu.r, ccu.S, ccu.T, ccu.o, ccu.O, ccu.P, new ccu[]{ccu.R, ccu.x, ccu.y, ccu.B, ccu.X, ccu.Y, ccu.Z, ccu.aa}
   );
   private static final akk<ji<cfr>> cg = ako.a(cha.class, akm.z);
   private static final akk<OptionalInt> ch = ako.a(cha.class, akm.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ale<cfr> cj = cfr.a;
   public final bsq cc = new bsq();
   public final bsq cd = new bsq();
   public final bsq ce = new bsq();
   public final bsq cf = new bsq();

   public cha(btb<? extends cfg> $$0, dbz $$1) {
      super($$0, $$1);
      this.bO = new cha.a(this);
      this.a(eon.j, 4.0F);
      this.a(eon.e, -1.0F);
      this.bP = new bzt(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bus.b<cha> dT() {
      return bus.a(bZ, bY);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      return chb.a(this.dT().a($$0));
   }

   @Override
   public bus<cha> dS() {
      return (bus<cha>)super.dS();
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

   public Optional<bsv> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsv $$0) {
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

   public ji<cfr> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfr> $$0) {
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
      chb.a(this);
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
         buc $$1 = this.ar();
         if ($$1 == buc.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == buc.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == buc.j) {
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
   public bsp a(arf $$0, bsp $$1) {
      cha $$2 = btb.R.a((dbz)$$0);
      if ($$2 != null) {
         chb.a($$2, $$0.E_());
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
   public void a(arf $$0, cfg $$1) {
      this.a($$0, $$1, null);
      this.dS().a(ccu.Y, bac.a);
   }

   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      ji<dcy> $$4 = $$0.t(this.dp());
      if ($$4.a(awo.ai)) {
         this.i(lp.al.g(cfr.c));
      } else if ($$4.a(awo.aj)) {
         this.i(lp.al.g(cfr.b));
      } else {
         this.i(lp.al.g(cj));
      }

      chb.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bux.a gq() {
      return bts.A().a(buy.r, 1.0).a(buy.q, 10.0).a(buy.c, 10.0).a(buy.v, 1.0);
   }

   @Nullable
   @Override
   protected avz v() {
      return awa.jL;
   }

   @Nullable
   @Override
   protected avz d(bro $$0) {
      return awa.jO;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.jM;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
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
   public void a(evs $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(btv.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btq $$0) {
      if ($$0 instanceof ckn $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(awt.n);
   }

   @Override
   protected cdc b(dbz $$0) {
      return new cha.c(this, $$0);
   }

   @Nullable
   @Override
   public btq p() {
      return this.N();
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.al);
   }

   public static boolean c(btb<? extends cfg> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cg) && a($$1, $$3);
   }

   class a extends bzq {
      a(final bts $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cha.this.u().isEmpty();
      }
   }

   static class b extends eof {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eoi a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayz.a(this.b.cK().a), ayz.a(this.b.cK().b), ayz.a(this.b.cK().c)));
      }

      @Override
      public eon a(eop $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsd $$4 = $$0.a(this.l);
         return $$4.a(awp.bR) ? eon.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccz {
      c(cha $$0, dbz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eon $$0) {
         return $$0 != eon.k && super.b($$0);
      }

      @Override
      protected eom a(int $$0) {
         this.o = new cha.b(true);
         this.o.a(true);
         return new eom(this.o, $$0);
      }
   }
}
