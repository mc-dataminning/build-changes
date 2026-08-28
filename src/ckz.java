import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckz extends ciz {
   protected static final ImmutableList<chs<? extends chr<? super ckz>>> bG = ImmutableList.of(chs.c, chs.f, chs.v, chs.s, chs.w);
   protected static final ImmutableList<cgl<?>> bH = ImmutableList.of(
      cgl.o, cgl.g, cgl.h, cgl.n, cgl.F, cgl.u, cgl.s, cgl.T, cgl.U, cgl.p, cgl.P, cgl.Q, new cgl[]{cgl.S, cgl.y, cgl.z, cgl.C, cgl.Y, cgl.Z, cgl.aa, cgl.ab}
   );
   private static final akj<jf<clb>> bN = akn.a(ckz.class, akl.B);
   private static final akj<OptionalInt> bO = akn.a(ckz.class, akl.v);
   private static final int bP = 5;
   private static final alf<clb> bQ = clc.a;
   public final bvz bI = new bvz();
   public final bvz bK = new bvz();
   public final bvz bL = new bvz();
   public final bvz bM = new bvz();

   public ckz(bwr<? extends ciz> $$0, djh $$1) {
      super($$0, $$1);
      this.bz = new ckz.a(this);
      this.a(exm.j, 4.0F);
      this.a(exm.e, -1.0F);
      this.bA = new cdk(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected byj.b<ckz> ec() {
      return byj.a(bH, bG);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cla.a(this.ec().a($$0));
   }

   @Override
   public byj<ckz> eb() {
      return (byj<ckz>)super.eb();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      js<clb> $$1 = this.dW().f(mh.aT);
      $$0.a(bN, cts.a(this.dW(), bQ));
      $$0.a(bO, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bO, OptionalInt.empty());
   }

   public Optional<bwi> t() {
      return this.al.a(bO).stream().mapToObj(this.dU()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwi $$0) {
      this.al.a(bO, OptionalInt.of($$0.ao()));
   }

   @Override
   public int ah() {
      return 35;
   }

   @Override
   public int af() {
      return 5;
   }

   public jf<clb> x() {
      return this.al.a(bN);
   }

   private void j(jf<clb> $$0) {
      this.al.a(bN, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aJ ? c((kj<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aJ) {
         this.j(c(kk.aJ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cts.a($$0, this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cts.a($$0, this.dW(), mh.aT).ifPresent(this::j);
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cla.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dU().w_()) {
         this.bM.a(this.bh() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         bxv $$1 = this.at();
         if ($$1 == bxv.g) {
            this.bI.a(this.af);
         } else {
            this.bI.a();
         }

         if ($$1 == bxv.i) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == bxv.j) {
            this.bL.a(this.af);
         } else {
            this.bL.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.bI.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void gz() {
      this.dU().a(null, this, awn.kr, awo.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      ckz $$2 = bwr.ab.a($$0, bwq.e);
      if ($$2 != null) {
         cla.a($$2, $$0.C_());
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
   public void a(arq $$0, ciz $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cgl.Z, bau.a);
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      clc.a(this.ae, this.dW(), ctp.a($$0, this.du())).ifPresent(this::j);
      cla.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static byo.a gt() {
      return ciz.gy().a(byp.v, 1.0).a(byp.s, 10.0).a(byp.c, 10.0).a(byp.B, 1.0);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.kp;
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.ks;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.kq;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.kv, 0.15F, 1.0F);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(this.fn(), $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bxj $$0) {
      if ($$0 instanceof cou $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.an().a(axf.n);
   }

   @Override
   protected cgt b(djh $$0) {
      return new ckz.c(this, $$0);
   }

   @Nullable
   @Override
   public bxj f() {
      return this.Q();
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ap);
   }

   public static boolean c(bwr<? extends ciz> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ck) && a($$1, $$3);
   }

   class a extends cdh {
      a(final bxl $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ckz.this.t().isEmpty();
      }
   }

   static class b extends exe {
      private final iv.a a = new iv.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public exh a() {
         return !this.c.bh() ? super.a() : this.c(new iv(azm.a(this.c.cQ().a), azm.a(this.c.cQ().b), azm.a(this.c.cQ().c)));
      }

      @Override
      public exm a(exo $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         eao $$4 = $$0.a(this.a);
         return $$4.a(axc.bV) ? exm.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cgq {
      c(ckz $$0, djh $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(exm $$0) {
         return $$0 != exm.k && super.b($$0);
      }

      @Override
      protected exl a(int $$0) {
         this.o = new ckz.b(true);
         return new exl(this.o, $$0);
      }
   }
}
