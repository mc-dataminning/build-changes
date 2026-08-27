import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxj extends bvu implements blh<bwf> {
   public static final cnk bT = cnk.a(ckm.qc);
   protected static final ImmutableList<bup<? extends buo<? super bxj>>> bU = ImmutableList.of(bup.c, bup.f, bup.t, bup.r, bup.u);
   protected static final ImmutableList<btk<?>> bW = ImmutableList.of(
      btk.n, btk.g, btk.h, btk.m, btk.E, btk.t, btk.r, btk.R, btk.S, btk.o, btk.N, btk.O, new btk[]{btk.Q, btk.x, btk.y, btk.B, btk.W, btk.X, btk.Y, btk.Z}
   );
   private static final afc<bwf> cc = aff.a(bxj.class, afe.x);
   private static final afc<OptionalInt> cd = aff.a(bxj.class, afe.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bjp bY = new bjp();
   public final bjp bZ = new bjp();
   public final bjp ca = new bjp();
   public final bjp cb = new bjp();

   public bxj(bjx<? extends bvu> $$0, cqz $$1) {
      super($$0, $$1);
      this.bK = new bxj.a(this);
      this.a(ebp.j, 4.0F);
      this.a(ebp.e, -1.0F);
      this.bL = new bqj(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected blj.b<bxj> dO() {
      return blj.a(bW, bU);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return bxk.a(this.dO().a($$0));
   }

   @Override
   public blj<bxj> dN() {
      return (blj<bxj>)super.dN();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cc, bwf.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bjt> t() {
      return this.an.b(cd).stream().mapToObj(this.dL()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bjt $$0) {
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

   public bwf y() {
      return this.an.b(cc);
   }

   public void a(bwf $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("variant", jy.al.b(this.y()).toString());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      bwf $$1 = jy.al.a(afw.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }
   }

   @Override
   protected void X() {
      this.dL().ad().a("frogBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("frogActivityUpdate");
      bxk.a(this);
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
   public void a(afc<?> $$0) {
      if (as.equals($$0)) {
         bkv $$1 = this.an();
         if ($$1 == bkv.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bkv.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bkv.j) {
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
   public bjo a(alq $$0, bjo $$1) {
      bxj $$2 = bjx.O.a((cqz)$$0);
      if ($$2 != null) {
         bxk.a($$2, $$0.E_());
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
   public void a(alq $$0, bvu $$1) {
      this.a($$0, $$1, null);
      this.dN().a(btk.X, atz.a);
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ib<crx> $$5 = $$0.s(this.dl());
      if ($$5.a(aqr.ah)) {
         this.a(bwf.c);
      } else if ($$5.a(aqr.ai)) {
         this.a(bwf.b);
      } else {
         this.a(bwf.a);
      }

      bxk.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static blo.a ge() {
      return bkl.A().a(blp.m, 1.0).a(blp.l, 10.0).a(blp.c, 10.0);
   }

   @Nullable
   @Override
   protected aqc w() {
      return aqd.iG;
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.iJ;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.iH;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.iM, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(eif $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bkp.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bkj $$0) {
      if ($$0 instanceof cau $$1 && $$1.gf() != 1) {
         return false;
      }

      return $$0.ag().a(aqv.n);
   }

   @Override
   protected bts b(cqz $$0) {
      return new bxj.c(this, $$0);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(ckj $$0) {
      return bT.a($$0);
   }

   public static boolean c(bjx<? extends bvu> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bY) && a($$1, $$3);
   }

   class a extends bqg {
      a(bkl $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bxj.this.t().isEmpty();
      }
   }

   static class b extends ebn {
      private final ht.a l = new ht.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public ebr a() {
         return !this.b.aX() ? super.a() : this.c(new ht(asy.a(this.b.cG().a), asy.a(this.b.cG().b), asy.a(this.b.cG().c)));
      }

      @Override
      public ebp a(cqf $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dgb $$4 = $$0.a_(this.l);
         return $$4.a(aqs.bK) ? ebp.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends btp {
      c(bxj $$0, cqz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ebp $$0) {
         return $$0 != ebp.k && super.b($$0);
      }

      @Override
      protected ebv a(int $$0) {
         this.o = new bxj.b(true);
         this.o.a(true);
         return new ebv(this.o, $$0);
      }
   }
}
