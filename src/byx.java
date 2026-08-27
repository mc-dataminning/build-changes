import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byx extends bxi implements bmt<bxt> {
   public static final cpi bT = cpi.a(cmk.qN);
   protected static final ImmutableList<bwd<? extends bwc<? super byx>>> bU = ImmutableList.of(bwd.c, bwd.f, bwd.t, bwd.r, bwd.u);
   protected static final ImmutableList<bux<?>> bW = ImmutableList.of(
      bux.n, bux.g, bux.h, bux.m, bux.E, bux.t, bux.r, bux.R, bux.S, bux.o, bux.N, bux.O, new bux[]{bux.Q, bux.x, bux.y, bux.B, bux.W, bux.X, bux.Y, bux.Z}
   );
   private static final afz<bxt> cc = agc.a(byx.class, agb.x);
   private static final afz<OptionalInt> cd = agc.a(byx.class, agb.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final blb bY = new blb();
   public final blb bZ = new blb();
   public final blb ca = new blb();
   public final blb cb = new blb();

   public byx(blj<? extends bxi> $$0, csy $$1) {
      super($$0, $$1);
      this.bK = new byx.a(this);
      this.a(eek.j, 4.0F);
      this.a(eek.e, -1.0F);
      this.bL = new brw(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bmv.b<byx> dP() {
      return bmv.a(bW, bU);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return byy.a(this.dP().a($$0));
   }

   @Override
   public bmv<byx> dO() {
      return (bmv<byx>)super.dO();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, bxt.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<blf> w() {
      return this.an.b(cd).stream().mapToObj(this.dM()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(blf $$0) {
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

   public bxt A() {
      return this.an.b(cc);
   }

   public void a(bxt $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("variant", kb.al.b(this.A()).toString());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      bxt $$1 = kb.al.a(agt.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Z() {
      this.dM().ae().a("frogBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("frogActivityUpdate");
      byy.a(this);
      this.dM().ae().c();
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
   public void a(afz<?> $$0) {
      if (as.equals($$0)) {
         bmh $$1 = this.ap();
         if ($$1 == bmh.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bmh.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bmh.j) {
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
   public bla a(amp $$0, bla $$1) {
      byx $$2 = blj.P.a((csy)$$0);
      if ($$2 != null) {
         byy.a($$2, $$0.F_());
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
   public void a(amp $$0, bxi $$1) {
      this.a($$0, $$1, null);
      this.dO().a(bux.X, avc.a);
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      ie<ctx> $$5 = $$0.s(this.dm());
      if ($$5.a(arq.ai)) {
         this.a(bxt.c);
      } else if ($$5.a(arq.aj)) {
         this.a(bxt.b);
      } else {
         this.a(bxt.a);
      }

      byy.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bna.a ge() {
      return blx.C().a(bnb.m, 1.0).a(bnb.l, 10.0).a(bnb.c, 10.0);
   }

   @Nullable
   @Override
   protected arb y() {
      return arc.jh;
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.jk;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.ji;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.jn, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(elb $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmb.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(blv $$0) {
      if ($$0 instanceof cci $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ai().a(aru.n);
   }

   @Override
   protected bvf b(csy $$0) {
      return new byx.c(this, $$0);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cmh $$0) {
      return bT.a($$0);
   }

   public static boolean c(blj<? extends bxi> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bY) && a($$1, $$3);
   }

   class a extends brt {
      a(blx $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return byx.this.w().isEmpty();
      }
   }

   static class b extends eei {
      private final hv.a l = new hv.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eem a() {
         return !this.b.aZ() ? super.a() : this.c(new hv(aty.a(this.b.cH().a), aty.a(this.b.cH().b), aty.a(this.b.cH().c)));
      }

      @Override
      public eek a(cse $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dip $$4 = $$0.a_(this.l);
         return $$4.a(arr.bK) ? eek.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bvc {
      c(byx $$0, csy $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eek $$0) {
         return $$0 != eek.k && super.b($$0);
      }

      @Override
      protected eeq a(int $$0) {
         this.o = new byx.b(true);
         this.o.a(true);
         return new eeq(this.o, $$0);
      }
   }
}
