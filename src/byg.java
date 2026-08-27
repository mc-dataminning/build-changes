import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byg extends bwr implements bme<bxc> {
   public static final cok bT = cok.a(clm.qN);
   protected static final ImmutableList<bvm<? extends bvl<? super byg>>> bU = ImmutableList.of(bvm.c, bvm.f, bvm.t, bvm.r, bvm.u);
   protected static final ImmutableList<buh<?>> bW = ImmutableList.of(
      buh.n, buh.g, buh.h, buh.m, buh.E, buh.t, buh.r, buh.R, buh.S, buh.o, buh.N, buh.O, new buh[]{buh.Q, buh.x, buh.y, buh.B, buh.W, buh.X, buh.Y, buh.Z}
   );
   private static final afo<bxc> cc = afr.a(byg.class, afq.x);
   private static final afo<OptionalInt> cd = afr.a(byg.class, afq.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bkm bY = new bkm();
   public final bkm bZ = new bkm();
   public final bkm ca = new bkm();
   public final bkm cb = new bkm();

   public byg(bku<? extends bwr> $$0, csa $$1) {
      super($$0, $$1);
      this.bK = new byg.a(this);
      this.a(edd.j, 4.0F);
      this.a(edd.e, -1.0F);
      this.bL = new brg(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bmg.b<byg> dQ() {
      return bmg.a(bW, bU);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return byh.a(this.dQ().a($$0));
   }

   @Override
   public bmg<byg> dP() {
      return (bmg<byg>)super.dP();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cc, bxc.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void u() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bkq> w() {
      return this.an.b(cd).stream().mapToObj(this.dN()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bkq $$0) {
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

   public bxc A() {
      return this.an.b(cc);
   }

   public void a(bxc $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("variant", jy.am.b(this.A()).toString());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      bxc $$1 = jy.am.a(agi.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void Z() {
      this.dN().ae().a("frogBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("frogActivityUpdate");
      byh.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dN().x_()) {
         this.cb.a(this.bc() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(afo<?> $$0) {
      if (as.equals($$0)) {
         bls $$1 = this.ap();
         if ($$1 == bls.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bls.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bls.j) {
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
   public bkl a(ame $$0, bkl $$1) {
      byg $$2 = bku.O.a((csa)$$0);
      if ($$2 != null) {
         byh.a($$2, $$0.E_());
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
   public void a(ame $$0, bwr $$1) {
      this.a($$0, $$1, null);
      this.dP().a(buh.X, auo.a);
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ib<csy> $$5 = $$0.s(this.dn());
      if ($$5.a(arf.ah)) {
         this.a(bxc.c);
      } else if ($$5.a(arf.ai)) {
         this.a(bxc.b);
      } else {
         this.a(bxc.a);
      }

      byh.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bml.a gf() {
      return bli.C().a(bmm.m, 1.0).a(bmm.l, 10.0).a(bmm.c, 10.0);
   }

   @Nullable
   @Override
   protected aqq y() {
      return aqr.iY;
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.jb;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.iZ;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.je, 0.15F, 1.0F);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(eju $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(blg $$0) {
      if ($$0 instanceof cbr $$1 && $$1.gg() != 1) {
         return false;
      }

      return $$0.ai().a(arj.n);
   }

   @Override
   protected bup b(csa $$0) {
      return new byg.c(this, $$0);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(clj $$0) {
      return bT.a($$0);
   }

   public static boolean c(bku<? extends bwr> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bY) && a($$1, $$3);
   }

   class a extends brd {
      a(bli $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return byg.this.w().isEmpty();
      }
   }

   static class b extends edb {
      private final ht.a l = new ht.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public edf a() {
         return !this.b.aZ() ? super.a() : this.c(new ht(atm.a(this.b.cH().a), atm.a(this.b.cH().b), atm.a(this.b.cH().c)));
      }

      @Override
      public edd a(crg $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dhi $$4 = $$0.a_(this.l);
         return $$4.a(arg.bK) ? edd.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bum {
      c(byg $$0, csa $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(edd $$0) {
         return $$0 != edd.k && super.b($$0);
      }

      @Override
      protected edj a(int $$0) {
         this.o = new byg.b(true);
         this.o.a(true);
         return new edj(this.o, $$0);
      }
   }
}
