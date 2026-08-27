import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxy extends bwj implements blw<bwu> {
   public static final coc bT = coc.a(cle.qc);
   protected static final ImmutableList<bve<? extends bvd<? super bxy>>> bU = ImmutableList.of(bve.c, bve.f, bve.t, bve.r, bve.u);
   protected static final ImmutableList<btz<?>> bW = ImmutableList.of(
      btz.n, btz.g, btz.h, btz.m, btz.E, btz.t, btz.r, btz.R, btz.S, btz.o, btz.N, btz.O, new btz[]{btz.Q, btz.x, btz.y, btz.B, btz.W, btz.X, btz.Y, btz.Z}
   );
   private static final afm<bwu> cc = afp.a(bxy.class, afo.x);
   private static final afm<OptionalInt> cd = afp.a(bxy.class, afo.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bke bY = new bke();
   public final bke bZ = new bke();
   public final bke ca = new bke();
   public final bke cb = new bke();

   public bxy(bkm<? extends bwj> $$0, crs $$1) {
      super($$0, $$1);
      this.bK = new bxy.a(this);
      this.a(ecr.j, 4.0F);
      this.a(ecr.e, -1.0F);
      this.bL = new bqy(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bly.b<bxy> dO() {
      return bly.a(bW, bU);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return bxz.a(this.dO().a($$0));
   }

   @Override
   public bly<bxy> dN() {
      return (bly<bxy>)super.dN();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cc, bwu.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bki> t() {
      return this.an.b(cd).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bki $$0) {
      this.an.b(cd, OptionalInt.of($$0.ah()));
   }

   @Override
   public int fH() {
      return 35;
   }

   @Override
   public int Z() {
      return 5;
   }

   public bwu y() {
      return this.an.b(cc);
   }

   public void a(bwu $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("variant", jy.am.b(this.y()).toString());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      bwu $$1 = jy.am.a(agg.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void X() {
      this.dL().ad().a("frogBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("frogActivityUpdate");
      bxz.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public void l() {
      if (this.dL().x_()) {
         this.cb.a(this.ba() && !this.aQ.c(), this.ah);
      }

      super.l();
   }

   @Override
   public void a(afm<?> $$0) {
      if (as.equals($$0)) {
         blk $$1 = this.an();
         if ($$1 == blk.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == blk.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == blk.j) {
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
   public bkd a(ama $$0, bkd $$1) {
      bxy $$2 = bkm.O.a((crs)$$0);
      if ($$2 != null) {
         bxz.a($$2, $$0.E_());
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
   public void a(ama $$0, bwj $$1) {
      this.a($$0, $$1, null);
      this.dN().a(btz.X, auj.a);
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ib<csq> $$5 = $$0.s(this.dl());
      if ($$5.a(arb.ah)) {
         this.a(bwu.c);
      } else if ($$5.a(arb.ai)) {
         this.a(bwu.b);
      } else {
         this.a(bwu.a);
      }

      bxz.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bmd.a ge() {
      return bla.A().a(bme.m, 1.0).a(bme.l, 10.0).a(bme.c, 10.0);
   }

   @Nullable
   @Override
   protected aqm w() {
      return aqn.iI;
   }

   @Nullable
   @Override
   protected aqm d(bjg $$0) {
      return aqn.iL;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.iJ;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.iO, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(eji $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(ble.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bky $$0) {
      if ($$0 instanceof cbj $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ag().a(arf.n);
   }

   @Override
   protected buh b(crs $$0) {
      return new bxy.c(this, $$0);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(clb $$0) {
      return bT.a($$0);
   }

   public static boolean c(bkm<? extends bwj> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bY) && a($$1, $$3);
   }

   class a extends bqv {
      a(bla $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bxy.this.t().isEmpty();
      }
   }

   static class b extends ecp {
      private final ht.a l = new ht.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ect a() {
         return !this.b.aX() ? super.a() : this.c(new ht(ati.a(this.b.cG().a), ati.a(this.b.cG().b), ati.a(this.b.cG().c)));
      }

      @Override
      public ecr a(cqy $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dgw $$4 = $$0.a_(this.l);
         return $$4.a(arc.bK) ? ecr.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bue {
      c(bxy $$0, crs $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ecr $$0) {
         return $$0 != ecr.k && super.b($$0);
      }

      @Override
      protected ecx a(int $$0) {
         this.o = new bxy.b(true);
         this.o.a(true);
         return new ecx(this.o, $$0);
      }
   }
}
