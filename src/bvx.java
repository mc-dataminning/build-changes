import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvx extends bui implements bjv<but> {
   public static final clw bT = clw.a(ciz.qc);
   protected static final ImmutableList<btd<? extends btc<? super bvx>>> bU = ImmutableList.of(btd.c, btd.f, btd.t, btd.r, btd.u);
   protected static final ImmutableList<bry<?>> bW = ImmutableList.of(
      bry.n, bry.g, bry.h, bry.m, bry.E, bry.t, bry.r, bry.R, bry.S, bry.o, bry.N, bry.O, new bry[]{bry.Q, bry.x, bry.y, bry.B, bry.W, bry.X, bry.Y, bry.Z}
   );
   private static final adx<but> cc = aea.a(bvx.class, adz.x);
   private static final adx<OptionalInt> cd = aea.a(bvx.class, adz.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bic bY = new bic();
   public final bic bZ = new bic();
   public final bic ca = new bic();
   public final bic cb = new bic();

   public bvx(bik<? extends bui> $$0, cpk $$1) {
      super($$0, $$1);
      this.bK = new bvx.a(this);
      this.a(eam.j, 4.0F);
      this.a(eam.e, -1.0F);
      this.bL = new box(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bjx.b<bvx> dN() {
      return bjx.a(bW, bU);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bvy.a(this.dN().a($$0));
   }

   @Override
   public bjx<bvx> dM() {
      return (bjx<bvx>)super.dM();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, but.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void p() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<big> q() {
      return this.an.b(cd).stream().mapToObj(this.dK()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(big $$0) {
      this.an.b(cd, OptionalInt.of($$0.ah()));
   }

   @Override
   public int Y() {
      return 35;
   }

   @Override
   public int X() {
      return 5;
   }

   public but t() {
      return this.an.b(cc);
   }

   public void a(but $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("variant", jc.ak.b(this.t()).toString());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      but $$1 = jc.ak.a(aep.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("frogBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("frogActivityUpdate");
      bvy.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public void l() {
      if (this.dK().r_()) {
         this.cb.a(this.ba() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(adx<?> $$0) {
      if (as.equals($$0)) {
         bji $$1 = this.an();
         if ($$1 == bji.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bji.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bji.j) {
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
   public bib a(aki $$0, bib $$1) {
      bvx $$2 = bik.O.a((cpk)$$0);
      if ($$2 != null) {
         bvy.a($$2, $$0.y_());
      }

      return $$2;
   }

   @Override
   public boolean i_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aki $$0, bui $$1) {
      this.a($$0, $$1, null);
      this.dM().a(bry.X, asn.a);
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      hf<cqi> $$5 = $$0.s(this.dk());
      if ($$5.a(api.ah)) {
         this.a(but.c);
      } else if ($$5.a(api.ai)) {
         this.a(but.b);
      } else {
         this.a(but.a);
      }

      bvy.a(this, $$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkc.a fZ() {
      return biy.x().a(bkd.d, 1.0).a(bkd.a, 10.0).a(bkd.f, 10.0);
   }

   @Nullable
   @Override
   protected aot r() {
      return aou.iE;
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.iH;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.iF;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehf $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean l(biw $$0) {
      if ($$0 instanceof bzi $$1 && $$1.ga() != 1) {
         return false;
      }

      return $$0.ag().a(apm.k);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bvx.c(this, $$0);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(ciw $$0) {
      return bT.a($$0);
   }

   public static boolean c(bik<? extends bui> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bY) && a($$1, $$3);
   }

   class a extends bou {
      a(biy $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bvx.this.q().isEmpty();
      }
   }

   static class b extends eak {
      private final gv.a l = new gv.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eao a() {
         return !this.b.aX() ? super.a() : this.c(new gv(aro.a(this.b.cG().a), aro.a(this.b.cG().b), aro.a(this.b.cG().c)));
      }

      @Override
      public eam a(coq $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dey $$4 = $$0.a_(this.l);
         return $$4.a(apj.bK) ? eam.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bsd {
      c(bvx $$0, cpk $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eam $$0) {
         return $$0 != eam.k && super.b($$0);
      }

      @Override
      protected eas a(int $$0) {
         this.o = new bvx.b(true);
         this.o.a(true);
         return new eas(this.o, $$0);
      }
   }
}
