import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cls extends cjv {
   protected static final ImmutableList<cio<? extends cin<? super cls>>> bI = ImmutableList.of(cio.c, cio.f, cio.v, cio.s, cio.w);
   protected static final ImmutableList<chh<?>> bJ = ImmutableList.of(
      chh.o, chh.g, chh.h, chh.n, chh.F, chh.u, chh.s, chh.T, chh.U, chh.p, chh.P, chh.Q, new chh[]{chh.S, chh.y, chh.z, chh.C, chh.Y, chh.Z, chh.aa, chh.ab}
   );
   private static final aku<jg<clu>> bP = aky.a(cls.class, akw.C);
   private static final aku<OptionalInt> bQ = aky.a(cls.class, akw.v);
   private static final int bR = 5;
   private static final alq<clu> bS = clv.a;
   public final bwv bK = new bwv();
   public final bwv bM = new bwv();
   public final bwv bN = new bwv();
   public final bwv bO = new bwv();

   public cls(bxn<? extends cjv> $$0, dkj $$1) {
      super($$0, $$1);
      this.bB = new cls.a(this);
      this.a(eyr.j, 4.0F);
      this.a(eyr.e, -1.0F);
      this.bC = new ceg(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bzf.b<cls> ed() {
      return bzf.a(bJ, bI);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return clt.a(this.ed().a($$0));
   }

   @Override
   public bzf<cls> ec() {
      return (bzf<cls>)super.ec();
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      jt<clu> $$1 = this.dX().f(mi.aT);
      $$0.a(bP, cur.a(this.dX(), bS));
      $$0.a(bQ, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bQ, OptionalInt.empty());
   }

   public Optional<bxe> t() {
      return this.al.a(bQ).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bxe $$0) {
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

   public jg<clu> x() {
      return this.al.a(bP);
   }

   private void j(jg<clu> $$0) {
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
      cur.a($$0, this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cur.a($$0, this.dX(), mi.aT).ifPresent(this::j);
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      clt.a(this);
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
   public void a(aku<?> $$0) {
      if (aq.equals($$0)) {
         byr $$1 = this.at();
         if ($$1 == byr.g) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == byr.i) {
            this.bM.a(this.af);
         } else {
            this.bM.a();
         }

         if ($$1 == byr.j) {
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
      this.dV().a(null, this, awy.kr, awz.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      cls $$2 = bxn.ac.a($$0, bxm.e);
      if ($$2 != null) {
         clt.a($$2, $$0.G_());
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
   public void a(asb $$0, cjv $$1) {
      this.a($$0, $$1, null);
      this.ec().a(chh.Z, bbh.a);
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      clv.a(this.ae, this.dX(), cuo.a($$0, this.dv())).ifPresent(this::j);
      clt.a(this, $$0.G_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bzk.a gu() {
      return cjv.gz().a(bzl.v, 1.0).a(bzl.s, 10.0).a(bzl.c, 10.0).a(bzl.B, 1.0);
   }

   @Nullable
   @Override
   protected awx u() {
      return awy.kp;
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.ks;
   }

   @Nullable
   @Override
   protected awx l_() {
      return awy.kq;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.kv, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(byf $$0) {
      if ($$0 instanceof cpt $$1 && $$1.gs() != 1) {
         return false;
      }

      return $$0.an().a(axq.n);
   }

   @Override
   protected chp b(dkj $$0) {
      return new cls.c(this, $$0);
   }

   @Nullable
   @Override
   public byf f() {
      return this.Q();
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.aq);
   }

   public static boolean c(bxn<? extends cjv> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.ck) && a($$1, $$3);
   }

   class a extends ced {
      a(final byh $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cls.this.t().isEmpty();
      }
   }

   static class b extends eyj {
      private final iw.a a = new iw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eym a() {
         return !this.c.bi() ? super.a() : this.c(new iw(azz.a(this.c.cR().a), azz.a(this.c.cR().b), azz.a(this.c.cR().c)));
      }

      @Override
      public eyr a(eyt $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         ebq $$4 = $$0.a(this.a);
         return $$4.a(axn.bV) ? eyr.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends chm {
      c(cls $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eyr $$0) {
         return $$0 != eyr.k && super.b($$0);
      }

      @Override
      protected eyq a(int $$0) {
         this.o = new cls.b(true);
         return new eyq(this.o, $$0);
      }
   }
}
