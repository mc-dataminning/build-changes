import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzh extends bxs implements bnd<byd> {
   public static final cps bT = cps.a(cmu.qN);
   protected static final ImmutableList<bwn<? extends bwm<? super bzh>>> bU = ImmutableList.of(bwn.c, bwn.f, bwn.t, bwn.r, bwn.u);
   protected static final ImmutableList<bvh<?>> bW = ImmutableList.of(
      bvh.n, bvh.g, bvh.h, bvh.m, bvh.E, bvh.t, bvh.r, bvh.R, bvh.S, bvh.o, bvh.N, bvh.O, new bvh[]{bvh.Q, bvh.x, bvh.y, bvh.B, bvh.W, bvh.X, bvh.Y, bvh.Z}
   );
   private static final agj<byd> cc = agm.a(bzh.class, agl.x);
   private static final agj<OptionalInt> cd = agm.a(bzh.class, agl.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bll bY = new bll();
   public final bll bZ = new bll();
   public final bll ca = new bll();
   public final bll cb = new bll();

   public bzh(blt<? extends bxs> $$0, cti $$1) {
      super($$0, $$1);
      this.bK = new bzh.a(this);
      this.a(eev.j, 4.0F);
      this.a(eev.e, -1.0F);
      this.bL = new bsg(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bnf.b<bzh> dP() {
      return bnf.a(bW, bU);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return bzi.a(this.dP().a($$0));
   }

   @Override
   public bnf<bzh> dO() {
      return (bnf<bzh>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, byd.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<blp> w() {
      return this.an.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(blp $$0) {
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

   public byd A() {
      return this.an.b(cc);
   }

   public void a(byd $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("variant", kd.al.b(this.A()).toString());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      byd $$1 = kd.al.a(ahd.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Z() {
      this.dM().af().a("frogBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("frogActivityUpdate");
      bzi.a(this);
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
   public void a(agj<?> $$0) {
      if (as.equals($$0)) {
         bmr $$1 = this.ap();
         if ($$1 == bmr.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bmr.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bmr.j) {
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
   public blk a(amz $$0, blk $$1) {
      bzh $$2 = blt.P.a((cti)$$0);
      if ($$2 != null) {
         bzi.a($$2, $$0.F_());
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
   public void a(amz $$0, bxs $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bvh.X, avm.a);
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      ih<cuh> $$5 = $$0.t(this.dm());
      if ($$5.a(asa.ai)) {
         this.a(byd.c);
      } else if ($$5.a(asa.aj)) {
         this.a(byd.b);
      } else {
         this.a(byd.a);
      }

      bzi.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bnk.a ge() {
      return bmh.C().a(bnl.m, 1.0).a(bnl.l, 10.0).a(bnl.c, 10.0);
   }

   @Nullable
   @Override
   protected arl y() {
      return arm.jh;
   }

   @Nullable
   @Override
   protected arl d(bkn $$0) {
      return arm.jk;
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.ji;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.jn, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(elm $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bml.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bmf $$0) {
      if ($$0 instanceof ccs $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ai().a(ase.n);
   }

   @Override
   protected bvp b(cti $$0) {
      return new bzh.c(this, $$0);
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cmr $$0) {
      return bT.a($$0);
   }

   public static boolean c(blt<? extends bxs> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bY) && a($$1, $$3);
   }

   class a extends bsd {
      a(bmh $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bzh.this.w().isEmpty();
      }
   }

   static class b extends eet {
      private final hx.a l = new hx.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eex a() {
         return !this.b.aZ() ? super.a() : this.c(new hx(aui.a(this.b.cH().a), aui.a(this.b.cH().b), aui.a(this.b.cH().c)));
      }

      @Override
      public eev a(cso $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dja $$4 = $$0.a_(this.l);
         return $$4.a(asb.bK) ? eev.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bvm {
      c(bzh $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eev $$0) {
         return $$0 != eev.k && super.b($$0);
      }

      @Override
      protected efb a(int $$0) {
         this.o = new bzh.b(true);
         this.o.a(true);
         return new efb(this.o, $$0);
      }
   }
}
