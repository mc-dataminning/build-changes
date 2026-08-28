import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckr extends cis {
   protected static final ImmutableList<chl<? extends chk<? super ckr>>> bF = ImmutableList.of(chl.c, chl.f, chl.v, chl.s, chl.w);
   protected static final ImmutableList<cge<?>> bG = ImmutableList.of(
      cge.o, cge.g, cge.h, cge.n, cge.F, cge.u, cge.s, cge.T, cge.U, cge.p, cge.P, cge.Q, new cge[]{cge.S, cge.y, cge.z, cge.C, cge.Y, cge.Z, cge.aa, cge.ab}
   );
   private static final akj<je<ckt>> bM = akn.a(ckr.class, akl.A);
   private static final akj<OptionalInt> bN = akn.a(ckr.class, akl.v);
   private static final int bO = 5;
   private static final alf<ckt> bP = cku.a;
   public final bvu bH = new bvu();
   public final bvu bJ = new bvu();
   public final bvu bK = new bvu();
   public final bvu bL = new bvu();

   public ckr(bwm<? extends cis> $$0, div $$1) {
      super($$0, $$1);
      this.by = new ckr.a(this);
      this.a(ewx.j, 4.0F);
      this.a(ewx.e, -1.0F);
      this.bz = new cdd(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected byc.b<ckr> ec() {
      return byc.a(bG, bF);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cks.a(this.ec().a($$0));
   }

   @Override
   public byc<ckr> eb() {
      return (byc<ckr>)super.eb();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      jr<ckt> $$1 = this.dX().f(mg.aS);
      $$0.a(bM, ctg.a(this.dX(), bP));
      $$0.a(bN, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bN, OptionalInt.empty());
   }

   public Optional<bwd> t() {
      return this.al.a(bN).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwd $$0) {
      this.al.a(bN, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ag() {
      return 35;
   }

   @Override
   public int ad() {
      return 5;
   }

   public je<ckt> x() {
      return this.al.a(bM);
   }

   private void j(je<ckt> $$0) {
      this.al.a(bM, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aI ? c((ki<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aI) {
         this.j(c(kj.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctg.a($$0, this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctg.a($$0, this.dX(), mg.aS).ifPresent(this::j);
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cks.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().w_()) {
         this.bL.a(this.bj() && !this.aT.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akj<?> $$0) {
      if (aq.equals($$0)) {
         bxo $$1 = this.aw();
         if ($$1 == bxo.g) {
            this.bH.a(this.af);
         } else {
            this.bH.a();
         }

         if ($$1 == bxo.i) {
            this.bJ.a(this.af);
         } else {
            this.bJ.a();
         }

         if ($$1 == bxo.j) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.bH.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aT.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void gw() {
      this.dV().a(null, this, awn.ko, awo.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      ckr $$2 = bwm.ab.a($$0, bwl.e);
      if ($$2 != null) {
         cks.a($$2, $$0.C_());
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
   public void a(arq $$0, cis $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cge.Z, bau.a);
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      cku.a(this.ae, this.dX(), ctd.a($$0, this.dv())).ifPresent(this::j);
      cks.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static byh.a gq() {
      return cis.gv().a(byi.v, 1.0).a(byi.s, 10.0).a(byi.c, 10.0).a(byi.B, 1.0);
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.km;
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return awn.kp;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.kn;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.ks, 0.15F, 1.0F);
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
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bxc $$0) {
      if ($$0 instanceof coi $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axf.n);
   }

   @Override
   protected cgm b(div $$0) {
      return new ckr.c(this, $$0);
   }

   @Nullable
   @Override
   public bxc f() {
      return this.Q();
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.ao);
   }

   public static boolean c(bwm<? extends cis> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cj) && a($$1, $$3);
   }

   class a extends cda {
      a(final bxe $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ckr.this.t().isEmpty();
      }
   }

   static class b extends ewp {
      private final iu.a a = new iu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ews a() {
         return !this.c.bj() ? super.a() : this.c(new iu(azm.a(this.c.cR().a), azm.a(this.c.cR().b), azm.a(this.c.cR().c)));
      }

      @Override
      public ewx a(ewz $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dzz $$4 = $$0.a(this.a);
         return $$4.a(axc.bU) ? ewx.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cgj {
      c(ckr $$0, div $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ewx $$0) {
         return $$0 != ewx.k && super.b($$0);
      }

      @Override
      protected eww a(int $$0) {
         this.o = new ckr.b(true);
         return new eww(this.o, $$0);
      }
   }
}
