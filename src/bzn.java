import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzn extends bxy implements bnj<byj> {
   public static final cpz bT = cpz.a(cnb.qN);
   protected static final ImmutableList<bwt<? extends bws<? super bzn>>> bU = ImmutableList.of(bwt.c, bwt.f, bwt.t, bwt.r, bwt.u);
   protected static final ImmutableList<bvn<?>> bW = ImmutableList.of(
      bvn.n, bvn.g, bvn.h, bvn.m, bvn.E, bvn.t, bvn.r, bvn.R, bvn.S, bvn.o, bvn.N, bvn.O, new bvn[]{bvn.Q, bvn.x, bvn.y, bvn.B, bvn.W, bvn.X, bvn.Y, bvn.Z}
   );
   private static final agm<byj> cc = agp.a(bzn.class, ago.x);
   private static final agm<OptionalInt> cd = agp.a(bzn.class, ago.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final blr bY = new blr();
   public final blr bZ = new blr();
   public final blr ca = new blr();
   public final blr cb = new blr();

   public bzn(blz<? extends bxy> $$0, ctp $$1) {
      super($$0, $$1);
      this.bK = new bzn.a(this);
      this.a(efc.j, 4.0F);
      this.a(efc.e, -1.0F);
      this.bL = new bsm(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bnl.b<bzn> dP() {
      return bnl.a(bW, bU);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return bzo.a(this.dP().a($$0));
   }

   @Override
   public bnl<bzn> dO() {
      return (bnl<bzn>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, byj.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<blv> w() {
      return this.an.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(blv $$0) {
      this.an.b(cd, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fH() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public byj A() {
      return this.an.b(cc);
   }

   public void a(byj $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("variant", kd.al.b(this.A()).toString());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      byj $$1 = kd.al.a(ahg.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Z() {
      this.dM().af().a("frogBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("frogActivityUpdate");
      bzo.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dM().y_()) {
         this.cb.a(this.bc() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(agm<?> $$0) {
      if (as.equals($$0)) {
         bmx $$1 = this.ap();
         if ($$1 == bmx.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bmx.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bmx.j) {
            this.ca.a(this.ah);
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
   public blq a(and $$0, blq $$1) {
      bzn $$2 = blz.P.a((ctp)$$0);
      if ($$2 != null) {
         bzo.a($$2, $$0.F_());
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
   public void a(and $$0, bxy $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bvn.X, avs.a);
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      ih<cuo> $$5 = $$0.t(this.dm());
      if ($$5.a(asg.ai)) {
         this.a(byj.c);
      } else if ($$5.a(asg.aj)) {
         this.a(byj.b);
      } else {
         this.a(byj.a);
      }

      bzo.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnq.a ge() {
      return bmn.C().a(bnr.m, 1.0).a(bnr.l, 10.0).a(bnr.c, 10.0);
   }

   @Nullable
   @Override
   protected arr y() {
      return ars.jh;
   }

   @Nullable
   @Override
   protected arr d(bkt $$0) {
      return ars.jk;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.ji;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.jn, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(elt $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmr.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bml $$0) {
      if ($$0 instanceof ccy $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ai().a(ask.n);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bzn.c(this, $$0);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cmy $$0) {
      return bT.a($$0);
   }

   public static boolean c(blz<? extends bxy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bY) && a($$1, $$3);
   }

   class a extends bsj {
      a(bmn $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bzn.this.w().isEmpty();
      }
   }

   static class b extends efa {
      private final hx.a l = new hx.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public efe a() {
         return !this.b.aZ() ? super.a() : this.c(new hx(auo.a(this.b.cH().a), auo.a(this.b.cH().b), auo.a(this.b.cH().c)));
      }

      @Override
      public efc a(csv $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         djh $$4 = $$0.a_(this.l);
         return $$4.a(ash.bK) ? efc.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bvs {
      c(bzn $$0, ctp $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(efc $$0) {
         return $$0 != efc.k && super.b($$0);
      }

      @Override
      protected efi a(int $$0) {
         this.o = new bzn.b(true);
         this.o.a(true);
         return new efi(this.o, $$0);
      }
   }
}
