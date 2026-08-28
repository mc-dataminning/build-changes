import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckl extends cio {
   protected static final ImmutableList<chi<? extends chh<? super ckl>>> bF = ImmutableList.of(chi.c, chi.f, chi.v, chi.s, chi.w);
   protected static final ImmutableList<cgb<?>> bG = ImmutableList.of(
      cgb.o, cgb.g, cgb.h, cgb.n, cgb.F, cgb.u, cgb.s, cgb.T, cgb.U, cgb.p, cgb.P, cgb.Q, new cgb[]{cgb.S, cgb.y, cgb.z, cgb.C, cgb.Y, cgb.Z, cgb.aa, cgb.ab}
   );
   private static final akh<je<ckn>> bM = akl.a(ckl.class, akj.z);
   private static final akh<OptionalInt> bN = akl.a(ckl.class, akj.v);
   private static final int bO = 5;
   private static final ald<ckn> bP = cko.a;
   public final bvr bH = new bvr();
   public final bvr bJ = new bvr();
   public final bvr bK = new bvr();
   public final bvr bL = new bvr();

   public ckl(bwj<? extends cio> $$0, dip $$1) {
      super($$0, $$1);
      this.by = new ckl.a(this);
      this.a(ewm.j, 4.0F);
      this.a(ewm.e, -1.0F);
      this.bz = new cda(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxz.b<ckl> ec() {
      return bxz.a(bG, bF);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return ckm.a(this.ec().a($$0));
   }

   @Override
   public bxz<ckl> eb() {
      return (bxz<ckl>)super.eb();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      jr<ckn> $$1 = this.dX().f(mg.aR);
      $$0.a(bM, cta.a(this.dX(), bP));
      $$0.a(bN, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bN, OptionalInt.empty());
   }

   public Optional<bwa> t() {
      return this.al.a(bN).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bwa $$0) {
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

   public je<ckn> x() {
      return this.al.a(bM);
   }

   private void j(je<ckn> $$0) {
      this.al.a(bM, $$0);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aH ? c((ki<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aH) {
         this.j(c(kj.aH, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cta.a($$0, this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cta.a($$0, this.dX(), mg.aR).ifPresent(this::j);
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      ckm.a(this);
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
   public void a(akh<?> $$0) {
      if (aq.equals($$0)) {
         bxl $$1 = this.aw();
         if ($$1 == bxl.g) {
            this.bH.a(this.af);
         } else {
            this.bH.a();
         }

         if ($$1 == bxl.i) {
            this.bJ.a(this.af);
         } else {
            this.bJ.a();
         }

         if ($$1 == bxl.j) {
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
      this.dV().a(null, this, awl.kn, awm.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      ckl $$2 = bwj.ab.a($$0, bwi.e);
      if ($$2 != null) {
         ckm.a($$2, $$0.C_());
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
   public void a(aro $$0, cio $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cgb.Z, bas.a);
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      cko.a(this.ae, this.dX(), csx.a($$0, this.dv())).ifPresent(this::j);
      ckm.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bye.a gq() {
      return cio.gv().a(byf.v, 1.0).a(byf.s, 10.0).a(byf.c, 10.0).a(byf.B, 1.0);
   }

   @Nullable
   @Override
   protected awk u() {
      return awl.kl;
   }

   @Nullable
   @Override
   protected awk e(bup $$0) {
      return awl.ko;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.km;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean i(bwz $$0) {
      if ($$0 instanceof coc $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axd.n);
   }

   @Override
   protected cgj b(dip $$0) {
      return new ckl.c(this, $$0);
   }

   @Nullable
   @Override
   public bwz f() {
      return this.Q();
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ao);
   }

   public static boolean c(bwj<? extends cio> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.cj) && a($$1, $$3);
   }

   class a extends ccx {
      a(final bxb $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ckl.this.t().isEmpty();
      }
   }

   static class b extends ewe {
      private final iu.a a = new iu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ewh a() {
         return !this.c.bj() ? super.a() : this.c(new iu(azk.a(this.c.cR().a), azk.a(this.c.cR().b), azk.a(this.c.cR().c)));
      }

      @Override
      public ewm a(ewo $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dzo $$4 = $$0.a(this.a);
         return $$4.a(axa.bU) ? ewm.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cgg {
      c(ckl $$0, dip $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ewm $$0) {
         return $$0 != ewm.k && super.b($$0);
      }

      @Override
      protected ewl a(int $$0) {
         this.o = new ckl.b(true);
         return new ewl(this.o, $$0);
      }
   }
}
