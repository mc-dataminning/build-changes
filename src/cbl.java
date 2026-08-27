import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cbl extends bzt implements bpd<cae> {
   public static final cry bT = cry.a(cpc.qP);
   protected static final ImmutableList<byo<? extends byn<? super cbl>>> bU = ImmutableList.of(byo.c, byo.f, byo.v, byo.s, byo.w);
   protected static final ImmutableList<bxh<?>> bW = ImmutableList.of(
      bxh.n, bxh.g, bxh.h, bxh.m, bxh.E, bxh.t, bxh.r, bxh.S, bxh.T, bxh.o, bxh.O, bxh.P, new bxh[]{bxh.R, bxh.x, bxh.y, bxh.B, bxh.X, bxh.Y, bxh.Z, bxh.aa}
   );
   private static final aie<cae> cc = aih.a(cbl.class, aig.x);
   private static final aie<OptionalInt> cd = aih.a(cbl.class, aig.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bnk bY = new bnk();
   public final bnk bZ = new bnk();
   public final bnk ca = new bnk();
   public final bnk cb = new bnk();

   public cbl(bnu<? extends bzt> $$0, cvn $$1) {
      super($$0, $$1);
      this.bK = new cbl.a(this);
      this.a(eha.j, 4.0F);
      this.a(eha.e, -1.0F);
      this.bL = new bug(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bpf.b<cbl> dP() {
      return bpf.a(bW, bU);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbm.a(this.dP().a($$0));
   }

   @Override
   public bpf<cbl> dO() {
      return (bpf<cbl>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, cae.a);
      this.am.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.am.b(cd, OptionalInt.empty());
   }

   public Optional<bno> w() {
      return this.am.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bno $$0) {
      this.am.b(cd, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fJ() {
      return 35;
   }

   @Override
   public int fH() {
      return 5;
   }

   public cae A() {
      return this.am.b(cc);
   }

   public void a(cae $$0) {
      this.am.b(cc, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("variant", kf.al.b(this.A()).toString());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      cae $$1 = kf.al.a(aiy.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void aa() {
      this.dM().af().a("frogBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("frogActivityUpdate");
      cbm.a(this);
      this.dM().af().c();
      super.aa();
   }

   @Override
   public void l() {
      if (this.dM().y_()) {
         this.cb.a(this.bc() && !this.aQ.c(), this.ag);
      }

      super.l();
   }

   @Override
   public void a(aie<?> $$0) {
      if (ar.equals($$0)) {
         bor $$1 = this.ap();
         if ($$1 == bor.g) {
            this.bY.a(this.ag);
         } else {
            this.bY.a();
         }

         if ($$1 == bor.i) {
            this.bZ.a(this.ag);
         } else {
            this.bZ.a();
         }

         if ($$1 == bor.j) {
            this.ca.a(this.ag);
         } else {
            this.ca.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.bY.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aQ.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      cbl $$2 = bnu.Q.a((cvn)$$0);
      if ($$2 != null) {
         cbm.a($$2, $$0.F_());
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
   public void a(aov $$0, bzt $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bxh.Y, axk.a);
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      ij<cwm> $$5 = $$0.t(this.dm());
      if ($$5.a(aty.ai)) {
         this.a(cae.c);
      } else if ($$5.a(aty.aj)) {
         this.a(cae.b);
      } else {
         this.a(cae.a);
      }

      cbm.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bpk.a gg() {
      return boi.C().a(bpl.o, 1.0).a(bpl.n, 10.0).a(bpl.c, 10.0).a(bpl.r, 1.0);
   }

   @Nullable
   @Override
   protected atj y() {
      return atk.jw;
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.jz;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.jx;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.jC, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(ens $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bol.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bog $$0) {
      if ($$0 instanceof cew $$1 && $$1.gh() != 1) {
         return false;
      }

      return $$0.ai().a(auc.n);
   }

   @Override
   protected bxp b(cvn $$0) {
      return new cbl.c(this, $$0);
   }

   @Override
   public boolean m(coz $$0) {
      return bT.a($$0);
   }

   public static boolean c(bnu<? extends bzt> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bZ) && a($$1, $$3);
   }

   class a extends bud {
      a(boi $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cbl.this.w().isEmpty();
      }
   }

   static class b extends egy {
      private final hz.a l = new hz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ehc a() {
         return !this.b.aZ() ? super.a() : this.c(new hz(awh.a(this.b.cH().a), awh.a(this.b.cH().b), awh.a(this.b.cH().c)));
      }

      @Override
      public eha a(cut $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dlf $$4 = $$0.a_(this.l);
         return $$4.a(atz.bK) ? eha.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bxm {
      c(cbl $$0, cvn $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eha $$0) {
         return $$0 != eha.k && super.b($$0);
      }

      @Override
      protected ehg a(int $$0) {
         this.o = new cbl.b(true);
         this.o.a(true);
         return new ehg(this.o, $$0);
      }
   }
}
