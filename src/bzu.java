import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class bzu extends byc implements bnm<byn> {
   public static final cqh bU = cqh.a(cnj.qP);
   protected static final ImmutableList<bwx<? extends bww<? super bzu>>> bV = ImmutableList.of(bwx.c, bwx.f, bwx.v, bwx.s, bwx.w);
   protected static final ImmutableList<bvq<?>> bX = ImmutableList.of(
      bvq.n, bvq.g, bvq.h, bvq.m, bvq.E, bvq.t, bvq.r, bvq.S, bvq.T, bvq.o, bvq.O, bvq.P, new bvq[]{bvq.R, bvq.x, bvq.y, bvq.B, bvq.X, bvq.Y, bvq.Z, bvq.aa}
   );
   private static final agn<byn> cd = agq.a(bzu.class, agp.x);
   private static final agn<OptionalInt> ce = agq.a(bzu.class, agp.u);
   private static final int cf = 5;
   public static final String bY = "variant";
   public final bls bZ = new bls();
   public final bls ca = new bls();
   public final bls cb = new bls();
   public final bls cc = new bls();

   public bzu(bmc<? extends byc> $$0, ctx $$1) {
      super($$0, $$1);
      this.bL = new bzu.a(this);
      this.a(efk.j, 4.0F);
      this.a(efk.e, -1.0F);
      this.bM = new bsp(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bno.b<bzu> dO() {
      return bno.a(bX, bV);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzv.a(this.dO().a($$0));
   }

   @Override
   public bno<bzu> dN() {
      return (bno<bzu>)super.dN();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, byn.a);
      this.an.a(ce, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(ce, OptionalInt.empty());
   }

   public Optional<blw> w() {
      return this.an.b(ce).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(blw $$0) {
      this.an.b(ce, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fI() {
      return 35;
   }

   @Override
   public int fH() {
      return 5;
   }

   public byn A() {
      return this.an.b(cd);
   }

   public void a(byn $$0) {
      this.an.b(cd, $$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("variant", kd.al.b(this.A()).toString());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      byn $$1 = kd.al.a(ahh.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void aa() {
      this.dL().af().a("frogBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("frogActivityUpdate");
      bzv.a(this);
      this.dL().af().c();
      super.aa();
   }

   @Override
   public void l() {
      if (this.dL().y_()) {
         this.cc.a(this.bc() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(agn<?> $$0) {
      if (as.equals($$0)) {
         bna $$1 = this.ap();
         if ($$1 == bna.g) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bna.i) {
            this.ca.a(this.ah);
         } else {
            this.ca.a();
         }

         if ($$1 == bna.j) {
            this.cb.a(this.ah);
         } else {
            this.cb.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void u(float $$0) {
      float $$1;
      if (this.bZ.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aQ.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      bzu $$2 = bmc.Q.a((ctx)$$0);
      if ($$2 != null) {
         bzv.a($$2, $$0.F_());
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
   public void a(ane $$0, byc $$1) {
      this.a($$0, $$1, null);
      this.dN().a(bvq.Y, avt.a);
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      ih<cuw> $$5 = $$0.t(this.dl());
      if ($$5.a(ash.ai)) {
         this.a(byn.c);
      } else if ($$5.a(ash.aj)) {
         this.a(byn.b);
      } else {
         this.a(byn.a);
      }

      bzv.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnt.a gf() {
      return bmq.C().a(bnu.o, 1.0).a(bnu.n, 10.0).a(bnu.c, 10.0).a(bnu.r, 1.0);
   }

   @Nullable
   @Override
   protected ars y() {
      return art.jw;
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.jz;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.jx;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.jC, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(emc $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bmo $$0) {
      if ($$0 instanceof cdf $$1 && $$1.gg() != 1) {
         return false;
      }

      return $$0.ai().a(asl.n);
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bzu.c(this, $$0);
   }

   @Override
   public boolean m(cng $$0) {
      return bU.a($$0);
   }

   public static boolean c(bmc<? extends byc> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bY) && a($$1, $$3);
   }

   class a extends bsm {
      a(bmq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bzu.this.w().isEmpty();
      }
   }

   static class b extends efi {
      private final hx.a l = new hx.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public efm a() {
         return !this.b.aZ() ? super.a() : this.c(new hx(aup.a(this.b.cH().a), aup.a(this.b.cH().b), aup.a(this.b.cH().c)));
      }

      @Override
      public efk a(ctd $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         djp $$4 = $$0.a_(this.l);
         return $$4.a(asi.bK) ? efk.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bvv {
      c(bzu $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(efk $$0) {
         return $$0 != efk.k && super.b($$0);
      }

      @Override
      protected efq a(int $$0) {
         this.o = new bzu.b(true);
         this.o.a(true);
         return new efq(this.o, $$0);
      }
   }
}
