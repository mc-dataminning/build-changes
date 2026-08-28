import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckd extends cig {
   protected static final ImmutableList<cha<? extends cgz<? super ckd>>> bE = ImmutableList.of(cha.c, cha.f, cha.v, cha.s, cha.w);
   protected static final ImmutableList<cft<?>> bF = ImmutableList.of(
      cft.o, cft.g, cft.h, cft.n, cft.F, cft.u, cft.s, cft.T, cft.U, cft.p, cft.P, cft.Q, new cft[]{cft.S, cft.y, cft.z, cft.C, cft.Y, cft.Z, cft.aa, cft.ab}
   );
   private static final akg<js<cir>> bM = akk.a(ckd.class, aki.z);
   private static final akg<OptionalInt> bN = akk.a(ckd.class, aki.v);
   private static final int bO = 5;
   public static final String bG = "variant";
   private static final alc<cir> bP = cir.c;
   public final bvj bI = new bvj();
   public final bvj bJ = new bvj();
   public final bvj bK = new bvj();
   public final bvj bL = new bvj();

   public ckd(bwb<? extends cig> $$0, dhp $$1) {
      super($$0, $$1);
      this.bx = new ckd.a(this);
      this.a(evk.j, 4.0F);
      this.a(evk.e, -1.0F);
      this.by = new ccs(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bxr.b<ckd> ec() {
      return bxr.a(bF, bE);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cke.a(this.ec().a($$0));
   }

   @Override
   public bxr<ckd> eb() {
      return (bxr<ckd>)super.eb();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bM, md.aj.b(bP));
      $$0.a(bN, OptionalInt.empty());
   }

   @Override
   public void q() {
      this.al.a(bN, OptionalInt.empty());
   }

   public Optional<bvs> t() {
      return this.al.a(bN).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bvs $$0) {
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

   public js<cir> x() {
      return this.al.a(bM);
   }

   private void j(js<cir> $$0) {
      this.al.a(bM, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aE ? b((kw<T>)$$0, this.x()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aE) {
         this.j(b(kx.aE, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("variant", this.x().e().orElse(bP).a().toString());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      Optional.ofNullable(ald.c($$0.l("variant"))).map($$0x -> alc.a(me.F, $$0x)).flatMap(md.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cke.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().w_()) {
         this.bL.a(this.bj() && !this.aS.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akg<?> $$0) {
      if (aq.equals($$0)) {
         bxd $$1 = this.aw();
         if ($$1 == bxd.g) {
            this.bI.a(this.af);
         } else {
            this.bI.a();
         }

         if ($$1 == bxd.i) {
            this.bJ.a(this.af);
         } else {
            this.bJ.a();
         }

         if ($$1 == bxd.j) {
            this.bK.a(this.af);
         } else {
            this.bK.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.bI.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aS.a($$1, 0.4F, this.n_() ? 3.0F : 1.0F);
   }

   @Override
   public void gw() {
      this.dV().a(null, this, awk.kn, awl.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      ckd $$2 = bwb.ab.a($$0, bwa.e);
      if ($$2 != null) {
         cke.a($$2, $$0.C_());
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
   public void a(arn $$0, cig $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cft.Z, baq.a);
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      js<dis> $$4 = $$0.t(this.dv());
      if ($$4.a(awy.ai)) {
         this.j(md.aj.b(cir.e));
      } else if ($$4.a(awy.aj)) {
         this.j(md.aj.b(cir.d));
      } else {
         this.j(md.aj.b(bP));
      }

      cke.a(this, $$0.C_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bxw.a gq() {
      return cig.gv().a(bxx.v, 1.0).a(bxx.s, 10.0).a(bxx.c, 10.0).a(bxx.B, 1.0);
   }

   @Nullable
   @Override
   protected awj u() {
      return awk.kl;
   }

   @Nullable
   @Override
   protected awj e(buh $$0) {
      return awk.ko;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.km;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.kr, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bwr $$0) {
      if ($$0 instanceof cns $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.aq().a(axd.n);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new ckd.c(this, $$0);
   }

   @Nullable
   @Override
   public bwr f() {
      return this.Q();
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ao);
   }

   public static boolean c(bwb<? extends cig> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.cj) && a($$1, $$3);
   }

   class a extends ccp {
      a(final bwt $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return ckd.this.t().isEmpty();
      }
   }

   static class b extends evc {
      private final jj.a a = new jj.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public evf a() {
         return !this.c.bj() ? super.a() : this.c(new jj(azk.a(this.c.cR().a), azk.a(this.c.cR().b), azk.a(this.c.cR().c)));
      }

      @Override
      public evk a(evm $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         dym $$4 = $$0.a(this.a);
         return $$4.a(awz.bU) ? evk.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cfy {
      c(ckd $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(evk $$0) {
         return $$0 != evk.k && super.b($$0);
      }

      @Override
      protected evj a(int $$0) {
         this.o = new ckd.b(true);
         return new evj(this.o, $$0);
      }
   }
}
