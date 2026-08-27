import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byl extends bww implements bmj<bxh> {
   public static final coq bT = coq.a(clr.qN);
   protected static final ImmutableList<bvr<? extends bvq<? super byl>>> bU = ImmutableList.of(bvr.c, bvr.f, bvr.t, bvr.r, bvr.u);
   protected static final ImmutableList<bum<?>> bW = ImmutableList.of(
      bum.n, bum.g, bum.h, bum.m, bum.E, bum.t, bum.r, bum.R, bum.S, bum.o, bum.N, bum.O, new bum[]{bum.Q, bum.x, bum.y, bum.B, bum.W, bum.X, bum.Y, bum.Z}
   );
   private static final afs<bxh> cc = afv.a(byl.class, afu.x);
   private static final afs<OptionalInt> cd = afv.a(byl.class, afu.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bkr bY = new bkr();
   public final bkr bZ = new bkr();
   public final bkr ca = new bkr();
   public final bkr cb = new bkr();

   public byl(bkz<? extends bww> $$0, csf $$1) {
      super($$0, $$1);
      this.bK = new byl.a(this);
      this.a(edi.j, 4.0F);
      this.a(edi.e, -1.0F);
      this.bL = new brl(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bml.b<byl> dQ() {
      return bml.a(bW, bU);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return bym.a(this.dQ().a($$0));
   }

   @Override
   public bml<byl> dP() {
      return (bml<byl>)super.dP();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cc, bxh.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bkv> w() {
      return this.an.b(cd).stream().mapToObj(this.dN()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bkv $$0) {
      this.an.b(cd, OptionalInt.of($$0.aj()));
   }

   @Override
   public int fI() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public bxh A() {
      return this.an.b(cc);
   }

   public void a(bxh $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("variant", kc.am.b(this.A()).toString());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      bxh $$1 = kc.am.a(agm.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Z() {
      this.dN().ae().a("frogBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("frogActivityUpdate");
      bym.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dN().y_()) {
         this.cb.a(this.bc() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(afs<?> $$0) {
      if (as.equals($$0)) {
         blx $$1 = this.ap();
         if ($$1 == blx.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == blx.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == blx.j) {
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
   public bkq a(ami $$0, bkq $$1) {
      byl $$2 = bkz.O.a((csf)$$0);
      if ($$2 != null) {
         bym.a($$2, $$0.F_());
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
   public void a(ami $$0, bww $$1) {
      this.a($$0, $$1, null);
      this.dP().a(bum.X, aus.a);
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      ig<ctd> $$5 = $$0.s(this.dn());
      if ($$5.a(arj.ah)) {
         this.a(bxh.c);
      } else if ($$5.a(arj.ai)) {
         this.a(bxh.b);
      } else {
         this.a(bxh.a);
      }

      bym.a(this, $$0.F_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bmq.a gf() {
      return bln.C().a(bmr.m, 1.0).a(bmr.l, 10.0).a(bmr.c, 10.0);
   }

   @Nullable
   @Override
   protected aqu y() {
      return aqv.iY;
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.jb;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.iZ;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.je, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(ejz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bll $$0) {
      if ($$0 instanceof cbw $$1 && $$1.gg() != 1) {
         return false;
      }

      return $$0.ai().a(arn.n);
   }

   @Override
   protected buu b(csf $$0) {
      return new byl.c(this, $$0);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(clo $$0) {
      return bT.a($$0);
   }

   public static boolean c(bkz<? extends bww> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bY) && a($$1, $$3);
   }

   class a extends bri {
      a(bln $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return byl.this.w().isEmpty();
      }
   }

   static class b extends edg {
      private final hx.a l = new hx.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public edk a() {
         return !this.b.aZ() ? super.a() : this.c(new hx(atq.a(this.b.cH().a), atq.a(this.b.cH().b), atq.a(this.b.cH().c)));
      }

      @Override
      public edi a(crl $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dhn $$4 = $$0.a_(this.l);
         return $$4.a(ark.bK) ? edi.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bur {
      c(byl $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(edi $$0) {
         return $$0 != edi.k && super.b($$0);
      }

      @Override
      protected edo a(int $$0) {
         this.o = new byl.b(true);
         this.o.a(true);
         return new edo(this.o, $$0);
      }
   }
}
