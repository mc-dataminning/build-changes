import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzm extends bxx implements bni<byi> {
   public static final cpy bT = cpy.a(cna.qN);
   protected static final ImmutableList<bws<? extends bwr<? super bzm>>> bU = ImmutableList.of(bws.c, bws.f, bws.t, bws.r, bws.u);
   protected static final ImmutableList<bvm<?>> bW = ImmutableList.of(
      bvm.n, bvm.g, bvm.h, bvm.m, bvm.E, bvm.t, bvm.r, bvm.R, bvm.S, bvm.o, bvm.N, bvm.O, new bvm[]{bvm.Q, bvm.x, bvm.y, bvm.B, bvm.W, bvm.X, bvm.Y, bvm.Z}
   );
   private static final agm<byi> cc = agp.a(bzm.class, ago.x);
   private static final agm<OptionalInt> cd = agp.a(bzm.class, ago.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final blq bY = new blq();
   public final blq bZ = new blq();
   public final blq ca = new blq();
   public final blq cb = new blq();

   public bzm(bly<? extends bxx> $$0, cto $$1) {
      super($$0, $$1);
      this.bK = new bzm.a(this);
      this.a(efb.j, 4.0F);
      this.a(efb.e, -1.0F);
      this.bL = new bsl(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bnk.b<bzm> dP() {
      return bnk.a(bW, bU);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzn.a(this.dP().a($$0));
   }

   @Override
   public bnk<bzm> dO() {
      return (bnk<bzm>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, byi.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<blu> w() {
      return this.an.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(blu $$0) {
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

   public byi A() {
      return this.an.b(cc);
   }

   public void a(byi $$0) {
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
      byi $$1 = kd.al.a(ahg.a($$0.l("variant")));
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
      bzn.a(this);
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
         bmw $$1 = this.ap();
         if ($$1 == bmw.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bmw.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bmw.j) {
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
   public blp a(and $$0, blp $$1) {
      bzm $$2 = bly.P.a((cto)$$0);
      if ($$2 != null) {
         bzn.a($$2, $$0.F_());
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
   public void a(and $$0, bxx $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bvm.X, avr.a);
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      ih<cun> $$5 = $$0.t(this.dm());
      if ($$5.a(asf.ai)) {
         this.a(byi.c);
      } else if ($$5.a(asf.aj)) {
         this.a(byi.b);
      } else {
         this.a(byi.a);
      }

      bzn.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnp.a ge() {
      return bmm.C().a(bnq.m, 1.0).a(bnq.l, 10.0).a(bnq.c, 10.0);
   }

   @Nullable
   @Override
   protected arq y() {
      return arr.jh;
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return arr.jk;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.ji;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.jn, 0.15F, 1.0F);
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
   public void a(els $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bmk $$0) {
      if ($$0 instanceof ccx $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ai().a(asj.n);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bzm.c(this, $$0);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cmx $$0) {
      return bT.a($$0);
   }

   public static boolean c(bly<? extends bxx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bY) && a($$1, $$3);
   }

   class a extends bsi {
      a(bmm $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bzm.this.w().isEmpty();
      }
   }

   static class b extends eez {
      private final hx.a l = new hx.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public efd a() {
         return !this.b.aZ() ? super.a() : this.c(new hx(aun.a(this.b.cH().a), aun.a(this.b.cH().b), aun.a(this.b.cH().c)));
      }

      @Override
      public efb a(csu $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         djg $$4 = $$0.a_(this.l);
         return $$4.a(asg.bK) ? efb.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bvr {
      c(bzm $$0, cto $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(efb $$0) {
         return $$0 != efb.k && super.b($$0);
      }

      @Override
      protected efh a(int $$0) {
         this.o = new bzm.b(true);
         this.o.a(true);
         return new efh(this.o, $$0);
      }
   }
}
