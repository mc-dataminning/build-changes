import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwb extends bum implements bjz<bux> {
   public static final cmb bT = cmb.a(cjd.qc);
   protected static final ImmutableList<bth<? extends btg<? super bwb>>> bU = ImmutableList.of(bth.c, bth.f, bth.t, bth.r, bth.u);
   protected static final ImmutableList<bsc<?>> bW = ImmutableList.of(
      bsc.n, bsc.g, bsc.h, bsc.m, bsc.E, bsc.t, bsc.r, bsc.R, bsc.S, bsc.o, bsc.N, bsc.O, new bsc[]{bsc.Q, bsc.x, bsc.y, bsc.B, bsc.W, bsc.X, bsc.Y, bsc.Z}
   );
   private static final aec<bux> cc = aef.a(bwb.class, aee.x);
   private static final aec<OptionalInt> cd = aef.a(bwb.class, aee.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bih bY = new bih();
   public final bih bZ = new bih();
   public final bih ca = new bih();
   public final bih cb = new bih();

   public bwb(bip<? extends bum> $$0, cpq $$1) {
      super($$0, $$1);
      this.bK = new bwb.a(this);
      this.a(eas.j, 4.0F);
      this.a(eas.e, -1.0F);
      this.bL = new bpb(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bkb.b<bwb> dN() {
      return bkb.a(bW, bU);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bwc.a(this.dN().a($$0));
   }

   @Override
   public bkb<bwb> dM() {
      return (bkb<bwb>)super.dM();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, bux.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void p() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bil> q() {
      return this.an.b(cd).stream().mapToObj(this.dK()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bil $$0) {
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

   public bux t() {
      return this.an.b(cc);
   }

   public void a(bux $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("variant", jd.ak.b(this.t()).toString());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      bux $$1 = jd.ak.a(aeu.a($$0.l("variant")));
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
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("frogActivityUpdate");
      bwc.a(this);
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
   public void a(aec<?> $$0) {
      if (as.equals($$0)) {
         bjn $$1 = this.an();
         if ($$1 == bjn.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bjn.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bjn.j) {
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
   public big a(akn $$0, big $$1) {
      bwb $$2 = bip.O.a((cpq)$$0);
      if ($$2 != null) {
         bwc.a($$2, $$0.y_());
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
   public void a(akn $$0, bum $$1) {
      this.a($$0, $$1, null);
      this.dM().a(bsc.X, ass.a);
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      hg<cqo> $$5 = $$0.s(this.dk());
      if ($$5.a(apn.ah)) {
         this.a(bux.c);
      } else if ($$5.a(apn.ai)) {
         this.a(bux.b);
      } else {
         this.a(bux.a);
      }

      bwc.a(this, $$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkg.a ga() {
      return bjd.x().a(bkh.d, 1.0).a(bkh.a, 10.0).a(bkh.f, 10.0);
   }

   @Nullable
   @Override
   protected aoy r() {
      return aoz.iE;
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.iH;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.iF;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehi $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(bjb $$0) {
      if ($$0 instanceof bzm $$1 && $$1.gb() != 1) {
         return false;
      }

      return $$0.ag().a(apr.k);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bwb.c(this, $$0);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cja $$0) {
      return bT.a($$0);
   }

   public static boolean c(bip<? extends bum> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bY) && a($$1, $$3);
   }

   class a extends boy {
      a(bjd $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bwb.this.q().isEmpty();
      }
   }

   static class b extends eaq {
      private final gw.a l = new gw.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eau a() {
         return !this.b.aX() ? super.a() : this.c(new gw(ars.a(this.b.cG().a), ars.a(this.b.cG().b), ars.a(this.b.cG().c)));
      }

      @Override
      public eas a(cow $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dfe $$4 = $$0.a_(this.l);
         return $$4.a(apo.bK) ? eas.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bsh {
      c(bwb $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eas $$0) {
         return $$0 != eas.k && super.b($$0);
      }

      @Override
      protected eay a(int $$0) {
         this.o = new bwb.b(true);
         this.o.a(true);
         return new eay(this.o, $$0);
      }
   }
}
