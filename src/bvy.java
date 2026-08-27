import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvy extends buj implements bjw<buu> {
   public static final clx bT = clx.a(cja.qc);
   protected static final ImmutableList<bte<? extends btd<? super bvy>>> bU = ImmutableList.of(bte.c, bte.f, bte.t, bte.r, bte.u);
   protected static final ImmutableList<brz<?>> bW = ImmutableList.of(
      brz.n, brz.g, brz.h, brz.m, brz.E, brz.t, brz.r, brz.R, brz.S, brz.o, brz.N, brz.O, new brz[]{brz.Q, brz.x, brz.y, brz.B, brz.W, brz.X, brz.Y, brz.Z}
   );
   private static final adz<buu> cc = aec.a(bvy.class, aeb.x);
   private static final adz<OptionalInt> cd = aec.a(bvy.class, aeb.u);
   private static final int ce = 5;
   public static final String bX = "variant";
   public final bie bY = new bie();
   public final bie bZ = new bie();
   public final bie ca = new bie();
   public final bie cb = new bie();

   public bvy(bim<? extends buj> $$0, cpl $$1) {
      super($$0, $$1);
      this.bK = new bvy.a(this);
      this.a(ean.j, 4.0F);
      this.a(ean.e, -1.0F);
      this.bL = new boy(this, 85, 10, 0.02F, 0.1F, true);
      this.t(1.0F);
   }

   @Override
   protected bjy.b<bvy> dN() {
      return bjy.a(bW, bU);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bvz.a(this.dN().a($$0));
   }

   @Override
   public bjy<bvy> dM() {
      return (bjy<bvy>)super.dM();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, buu.a);
      this.an.a(cd, OptionalInt.empty());
   }

   @Override
   public void p() {
      this.an.b(cd, OptionalInt.empty());
   }

   public Optional<bii> q() {
      return this.an.b(cd).stream().mapToObj(this.dK()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void a(bii $$0) {
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

   public buu t() {
      return this.an.b(cc);
   }

   public void a(buu $$0) {
      this.an.b(cc, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("variant", jb.ak.b(this.t()).toString());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      buu $$1 = jb.ak.a(aer.a($$0.l("variant")));
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
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("frogActivityUpdate");
      bvz.a(this);
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
   public void a(adz<?> $$0) {
      if (as.equals($$0)) {
         bjk $$1 = this.an();
         if ($$1 == bjk.g) {
            this.bY.a(this.ah);
         } else {
            this.bY.a();
         }

         if ($$1 == bjk.i) {
            this.bZ.a(this.ah);
         } else {
            this.bZ.a();
         }

         if ($$1 == bjk.j) {
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
   public bid a(akk $$0, bid $$1) {
      bvy $$2 = bim.O.a((cpl)$$0);
      if ($$2 != null) {
         bvz.a($$2, $$0.y_());
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
   public void a(akk $$0, buj $$1) {
      this.a($$0, $$1, null);
      this.dM().a(brz.X, asp.a);
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      he<cqj> $$5 = $$0.s(this.dk());
      if ($$5.a(apk.ah)) {
         this.a(buu.c);
      } else if ($$5.a(apk.ai)) {
         this.a(buu.b);
      } else {
         this.a(buu.a);
      }

      bvz.a(this, $$0.y_());
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkd.a ga() {
      return bja.x().a(bke.d, 1.0).a(bke.a, 10.0).a(bke.f, 10.0);
   }

   @Nullable
   @Override
   protected aov r() {
      return aow.iE;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.iH;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.iF;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.iK, 0.15F, 1.0F);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void h(ehd $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   public static boolean j(biy $$0) {
      if ($$0 instanceof bzj $$1 && $$1.gb() != 1) {
         return false;
      }

      return $$0.ag().a(apo.k);
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bvy.c(this, $$0);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.125F * $$2, -0.25F * $$2);
   }

   @Override
   public boolean m(cix $$0) {
      return bT.a($$0);
   }

   public static boolean c(bim<? extends buj> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bY) && a($$1, $$3);
   }

   class a extends bov {
      a(bja $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return bvy.this.q().isEmpty();
      }
   }

   static class b extends eal {
      private final gu.a l = new gu.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eap a() {
         return !this.b.aX() ? super.a() : this.c(new gu(arp.a(this.b.cG().a), arp.a(this.b.cG().b), arp.a(this.b.cG().c)));
      }

      @Override
      public ean a(cor $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dez $$4 = $$0.a_(this.l);
         return $$4.a(apl.bK) ? ean.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends bse {
      c(bvy $$0, cpl $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(ean $$0) {
         return $$0 != ean.k && super.b($$0);
      }

      @Override
      protected eat a(int $$0) {
         this.o = new bvy.b(true);
         this.o.a(true);
         return new eat(this.o, $$0);
      }
   }
}
