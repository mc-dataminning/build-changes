import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class clh extends cjk {
   protected static final ImmutableList<cid<? extends cic<? super clh>>> bI = ImmutableList.of(cid.c, cid.f, cid.v, cid.s, cid.w);
   protected static final ImmutableList<cgw<?>> bJ = ImmutableList.of(
      cgw.o, cgw.g, cgw.h, cgw.n, cgw.F, cgw.u, cgw.s, cgw.T, cgw.U, cgw.p, cgw.P, cgw.Q, new cgw[]{cgw.S, cgw.y, cgw.z, cgw.C, cgw.Y, cgw.Z, cgw.aa, cgw.ab}
   );
   private static final akl<jf<clj>> bP = akp.a(clh.class, akn.C);
   private static final akl<OptionalInt> bQ = akp.a(clh.class, akn.v);
   private static final int bR = 5;
   private static final alh<clj> bS = clk.a;
   public final bwk bK = new bwk();
   public final bwk bM = new bwk();
   public final bwk bN = new bwk();
   public final bwk bO = new bwk();

   public clh(bxc<? extends cjk> $$0, djx $$1) {
      super($$0, $$1);
      this.bB = new clh.a(this);
      this.a(eyf.j, 4.0F);
      this.a(eyf.e, -1.0F);
      this.bC = new cdv(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected byu.b<clh> ed() {
      return byu.a(bJ, bI);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cli.a(this.ed().a($$0));
   }

   @Override
   public byu<clh> ec() {
      return (byu<clh>)super.ec();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      js<clj> $$1 = this.dX().f(mh.aT);
      $$0.a(bP, cug.a(this.dX(), bS));
      $$0.a(bQ, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bQ, OptionalInt.empty());
   }

   public Optional<bwt> t() {
      return this.al.a(bQ).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwt $$0) {
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

   public jf<clj> x() {
      return this.al.a(bP);
   }

   private void j(jf<clj> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aK ? c((kj<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aK) {
         this.j(c(kk.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cug.a($$0, this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cug.a($$0, this.dX(), mh.aT).ifPresent(this::j);
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cli.a(this);
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
   public void a(akl<?> $$0) {
      if (aq.equals($$0)) {
         byg $$1 = this.at();
         if ($$1 == byg.g) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == byg.i) {
            this.bM.a(this.af);
         } else {
            this.bM.a();
         }

         if ($$1 == byg.j) {
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
      this.dV().a(null, this, awp.kr, awq.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      clh $$2 = bxc.ac.a($$0, bxb.e);
      if ($$2 != null) {
         cli.a($$2, $$0.G_());
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
   public void a(ars $$0, cjk $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cgw.Z, baw.a);
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      clk.a(this.ae, this.dX(), cud.a($$0, this.dv())).ifPresent(this::j);
      cli.a(this, $$0.G_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static byz.a gu() {
      return cjk.gz().a(bza.v, 1.0).a(bza.s, 10.0).a(bza.c, 10.0).a(bza.B, 1.0);
   }

   @Nullable
   @Override
   protected awo u() {
      return awp.kp;
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return awp.ks;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.kq;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.kv, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bxu $$0) {
      if ($$0 instanceof cpi $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.an().a(axh.n);
   }

   @Override
   protected che b(djx $$0) {
      return new clh.c(this, $$0);
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ap);
   }

   public static boolean c(bxc<? extends cjk> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.ck) && a($$1, $$3);
   }

   class a extends cds {
      a(final bxw $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return clh.this.t().isEmpty();
      }
   }

   static class b extends exx {
      private final iv.a a = new iv.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eya a() {
         return !this.c.bi() ? super.a() : this.c(new iv(azo.a(this.c.cR().a), azo.a(this.c.cR().b), azo.a(this.c.cR().c)));
      }

      @Override
      public eyf a(eyh $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         ebe $$4 = $$0.a(this.a);
         return $$4.a(axe.bV) ? eyf.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends chb {
      c(clh $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eyf $$0) {
         return $$0 != eyf.k && super.b($$0);
      }

      @Override
      protected eye a(int $$0) {
         this.o = new clh.b(true);
         return new eye(this.o, $$0);
      }
   }
}
