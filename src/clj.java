import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class clj extends cjm {
   protected static final ImmutableList<cif<? extends cie<? super clj>>> bI = ImmutableList.of(cif.c, cif.f, cif.v, cif.s, cif.w);
   protected static final ImmutableList<cgy<?>> bJ = ImmutableList.of(
      cgy.o, cgy.g, cgy.h, cgy.n, cgy.F, cgy.u, cgy.s, cgy.T, cgy.U, cgy.p, cgy.P, cgy.Q, new cgy[]{cgy.S, cgy.y, cgy.z, cgy.C, cgy.Y, cgy.Z, cgy.aa, cgy.ab}
   );
   private static final akn<jg<cll>> bP = akr.a(clj.class, akp.C);
   private static final akn<OptionalInt> bQ = akr.a(clj.class, akp.v);
   private static final int bR = 5;
   private static final alj<cll> bS = clm.a;
   public final bwm bK = new bwm();
   public final bwm bM = new bwm();
   public final bwm bN = new bwm();
   public final bwm bO = new bwm();

   public clj(bxe<? extends cjm> $$0, djz $$1) {
      super($$0, $$1);
      this.bB = new clj.a(this);
      this.a(eyh.j, 4.0F);
      this.a(eyh.e, -1.0F);
      this.bC = new cdx(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected byw.b<clj> ed() {
      return byw.a(bJ, bI);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return clk.a(this.ed().a($$0));
   }

   @Override
   public byw<clj> ec() {
      return (byw<clj>)super.ec();
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      jt<cll> $$1 = this.dX().f(mi.aT);
      $$0.a(bP, cui.a(this.dX(), bS));
      $$0.a(bQ, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bQ, OptionalInt.empty());
   }

   public Optional<bwv> t() {
      return this.al.a(bQ).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwv $$0) {
      this.al.a(bQ, OptionalInt.of($$0.ao()));
   }

   @Override
   public int ah() {
      return 35;
   }

   @Override
   public int af() {
      return 5;
   }

   public jg<cll> x() {
      return this.al.a(bP);
   }

   private void j(jg<cll> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aK ? c((kk<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aK) {
         this.j(c(kl.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cui.a($$0, this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cui.a($$0, this.dX(), mi.aT).ifPresent(this::j);
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      clk.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().A_()) {
         this.bO.a(this.bi() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akn<?> $$0) {
      if (aq.equals($$0)) {
         byi $$1 = this.at();
         if ($$1 == byi.g) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == byi.i) {
            this.bM.a(this.af);
         } else {
            this.bM.a();
         }

         if ($$1 == byi.j) {
            this.bN.a(this.af);
         } else {
            this.bN.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.bK.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void gA() {
      this.dV().a(null, this, awr.kr, aws.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      clj $$2 = bxe.ac.a($$0, bxd.e);
      if ($$2 != null) {
         clk.a($$2, $$0.G_());
      }

      return $$2;
   }

   @Override
   public boolean n_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aru $$0, cjm $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cgy.Z, bay.a);
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      clm.a(this.ae, this.dX(), cuf.a($$0, this.dv())).ifPresent(this::j);
      clk.a(this, $$0.G_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bzb.a gu() {
      return cjm.gz().a(bzc.v, 1.0).a(bzc.s, 10.0).a(bzc.c, 10.0).a(bzc.B, 1.0);
   }

   @Nullable
   @Override
   protected awq u() {
      return awr.kp;
   }

   @Nullable
   @Override
   protected awq e(bvk $$0) {
      return awr.ks;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.kq;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.kv, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(ffs $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bxw $$0) {
      if ($$0 instanceof cpk $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.an().a(axj.n);
   }

   @Override
   protected chg b(djz $$0) {
      return new clj.c(this, $$0);
   }

   @Nullable
   @Override
   public bxw f() {
      return this.Q();
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.aq);
   }

   public static boolean c(bxe<? extends cjm> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.ck) && a($$1, $$3);
   }

   class a extends cdu {
      a(final bxy $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return clj.this.t().isEmpty();
      }
   }

   static class b extends exz {
      private final iw.a a = new iw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eyc a() {
         return !this.c.bi() ? super.a() : this.c(new iw(azq.a(this.c.cR().a), azq.a(this.c.cR().b), azq.a(this.c.cR().c)));
      }

      @Override
      public eyh a(eyj $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         ebg $$4 = $$0.a(this.a);
         return $$4.a(axg.bV) ? eyh.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends chd {
      c(clj $$0, djz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eyh $$0) {
         return $$0 != eyh.k && super.b($$0);
      }

      @Override
      protected eyg a(int $$0) {
         this.o = new clj.b(true);
         return new eyg(this.o, $$0);
      }
   }
}
