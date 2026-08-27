import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfj extends cdp implements bsz<iw<cea>> {
   protected static final ImmutableList<cck<? extends ccj<? super cfj>>> bY = ImmutableList.of(cck.c, cck.f, cck.v, cck.s, cck.w);
   protected static final ImmutableList<cbd<?>> bZ = ImmutableList.of(
      cbd.n, cbd.g, cbd.h, cbd.m, cbd.E, cbd.t, cbd.r, cbd.S, cbd.T, cbd.o, cbd.O, cbd.P, new cbd[]{cbd.R, cbd.x, cbd.y, cbd.B, cbd.X, cbd.Y, cbd.Z, cbd.aa}
   );
   private static final ajm<iw<cea>> cg = ajq.a(cfj.class, ajo.z);
   private static final ajm<OptionalInt> ch = ajq.a(cfj.class, ajo.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final akg<cea> cj = cea.a;
   public final brc cc = new brc();
   public final brc cd = new brc();
   public final brc ce = new brc();
   public final brc cf = new brc();

   public cfj(brn<? extends cdp> $$0, dad $$1) {
      super($$0, $$1);
      this.bO = new cfj.a(this);
      this.a(emr.j, 4.0F);
      this.a(emr.e, -1.0F);
      this.bP = new byc(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected btb.b<cfj> dR() {
      return btb.a(bZ, bY);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return cfk.a(this.dR().a($$0));
   }

   @Override
   public btb<cfj> dQ() {
      return (btb<cfj>)super.dQ();
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cg, ld.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void r() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<brh> u() {
      return this.ao.a(ch).stream().mapToObj(this.dN()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(brh $$0) {
      this.ao.a(ch, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fO() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public iw<cea> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(iw<cea> $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      Optional.ofNullable(akh.a($$0.l("variant"))).map($$0x -> akg.a(le.B, $$0x)).flatMap(ld.al::b).ifPresent(this::i);
   }

   @Override
   protected void Y() {
      this.dN().af().a("frogBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      this.dN().af().a("frogActivityUpdate");
      cfk.a(this);
      this.dN().af().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dN().x_()) {
         this.cf.a(this.bf() && !this.aV.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajm<?> $$0) {
      if (at.equals($$0)) {
         bsl $$1 = this.ap();
         if ($$1 == bsl.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == bsl.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == bsl.j) {
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

      this.aV.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      cfj $$2 = brn.R.a((dad)$$0);
      if ($$2 != null) {
         cfk.a($$2, $$0.E_());
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
   public void a(aqh $$0, cdp $$1) {
      this.a($$0, $$1, null);
      this.dQ().a(cbd.Y, azb.a);
   }

   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      iw<dbc> $$4 = $$0.t(this.dn());
      if ($$4.a(avq.ai)) {
         this.i(ld.al.g(cea.c));
      } else if ($$4.a(avq.aj)) {
         this.i(ld.al.g(cea.b));
      } else {
         this.i(ld.al.g(cj));
      }

      cfk.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static btg.a gp() {
      return bsc.A().a(bth.r, 1.0).a(bth.q, 10.0).a(bth.c, 10.0).a(bth.v, 1.0);
   }

   @Nullable
   @Override
   protected avb v() {
      return avc.jG;
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.jJ;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.jH;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.jM, 0.15F, 1.0F);
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(etp $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bsa $$0) {
      if ($$0 instanceof ciw $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.ai().a(avu.n);
   }

   @Override
   protected cbl b(dad $$0) {
      return new cfj.c(this, $$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.al);
   }

   public static boolean c(brn<? extends cdp> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.cg) && a($$1, $$3);
   }

   class a extends bxz {
      a(bsc $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cfj.this.u().isEmpty();
      }
   }

   static class b extends emj {
      private final in.a l = new in.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public emm a() {
         return !this.b.bc() ? super.a() : this.c(new in(axz.a(this.b.cI().a), axz.a(this.b.cI().b), axz.a(this.b.cI().c)));
      }

      @Override
      public emr a(emt $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dqh $$4 = $$0.a(this.l);
         return $$4.a(avr.bR) ? emr.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cbi {
      c(cfj $$0, dad $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(emr $$0) {
         return $$0 != emr.k && super.b($$0);
      }

      @Override
      protected emq a(int $$0) {
         this.o = new cfj.b(true);
         this.o.a(true);
         return new emq(this.o, $$0);
      }
   }
}
