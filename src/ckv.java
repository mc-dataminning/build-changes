import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckv extends ciu {
   protected static final ImmutableList<chn<? extends chm<? super ckv>>> bG = ImmutableList.of(chn.c, chn.f, chn.v, chn.s, chn.w);
   protected static final ImmutableList<cgg<?>> bH = ImmutableList.of(
      cgg.o, cgg.g, cgg.h, cgg.n, cgg.F, cgg.u, cgg.s, cgg.T, cgg.U, cgg.p, cgg.P, cgg.Q, new cgg[]{cgg.S, cgg.y, cgg.z, cgg.C, cgg.Y, cgg.Z, cgg.aa, cgg.ab}
   );
   private static final akj<je<ckx>> bN = akn.a(ckv.class, akl.B);
   private static final akj<OptionalInt> bO = akn.a(ckv.class, akl.v);
   private static final int bP = 5;
   private static final alf<ckx> bQ = cky.a;
   public final bvw bI = new bvw();
   public final bvw bK = new bvw();
   public final bvw bL = new bvw();
   public final bvw bM = new bvw();

   public ckv(bwo<? extends ciu> $$0, dja $$1) {
      super($$0, $$1);
      this.bz = new ckv.a(this);
      this.a(exf.j, 4.0F);
      this.a(exf.e, -1.0F);
      this.bA = new cdf(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bye.b<ckv> ed() {
      return bye.a(bH, bG);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return ckw.a(this.ed().a($$0));
   }

   @Override
   public bye<ckv> ec() {
      return (bye<ckv>)super.ec();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      jr<ckx> $$1 = this.dX().f(mg.aT);
      $$0.a(bN, ctl.a(this.dX(), bQ));
      $$0.a(bO, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bO, OptionalInt.empty());
   }

   public Optional<bwf> t() {
      return this.al.a(bO).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwf $$0) {
      this.al.a(bO, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ag() {
      return 35;
   }

   @Override
   public int ad() {
      return 5;
   }

   public je<ckx> x() {
      return this.al.a(bN);
   }

   private void j(je<ckx> $$0) {
      this.al.a(bN, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aJ ? c((ki<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aJ) {
         this.j(c(kj.aJ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctl.a($$0, this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctl.a($$0, this.dX(), mg.aT).ifPresent(this::j);
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("frogBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      ckw.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().w_()) {
         this.bM.a(this.bj() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         bxq $$1 = this.aw();
         if ($$1 == bxq.g) {
            this.bI.a(this.af);
         } else {
            this.bI.a();
         }

         if ($$1 == bxq.i) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }

         if ($$1 == bxq.j) {
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
   public void gx() {
      this.dV().a(null, this, awn.kr, awo.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      ckv $$2 = bwo.ab.a($$0, bwn.e);
      if ($$2 != null) {
         ckw.a($$2, $$0.C_());
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
   public void a(arq $$0, ciu $$1) {
      this.a($$0, $$1, null);
      this.ec().a(cgg.Z, bau.a);
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cky.a(this.ae, this.dX(), cti.a($$0, this.dv())).ifPresent(this::j);
      ckw.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static byj.a gr() {
      return ciu.gw().a(byk.v, 1.0).a(byk.s, 10.0).a(byk.c, 10.0).a(byk.B, 1.0);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.kp;
   }

   @Nullable
   @Override
   protected awm e(buu $$0) {
      return awn.ks;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.kq;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.kv, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(this.fo(), $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bxe $$0) {
      if ($$0 instanceof com $$1 && $$1.gp() != 1) {
         return false;
      }

      return $$0.aq().a(axf.n);
   }

   @Override
   protected cgo b(dja $$0) {
      return new ckv.c(this, $$0);
   }

   @Nullable
   @Override
   public bxe f() {
      return this.Q();
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ap);
   }

   public static boolean c(bwo<? extends ciu> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ck) && a($$1, $$3);
   }

   class a extends cdc {
      a(final bxg $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ckv.this.t().isEmpty();
      }
   }

   static class b extends ewx {
      private final iu.a a = new iu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public exa a() {
         return !this.c.bj() ? super.a() : this.c(new iu(azm.a(this.c.cR().a), azm.a(this.c.cR().b), azm.a(this.c.cR().c)));
      }

      @Override
      public exf a(exh $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         eah $$4 = $$0.a(this.a);
         return $$4.a(axc.bV) ? exf.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cgl {
      c(ckv $$0, dja $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(exf $$0) {
         return $$0 != exf.k && super.b($$0);
      }

      @Override
      protected exe a(int $$0) {
         this.o = new ckv.b(true);
         return new exe(this.o, $$0);
      }
   }
}
