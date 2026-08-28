import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class csu extends bwv implements byu {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private UUID c;
   @Nullable
   private bwv d;
   private boolean e = false;
   private boolean f = false;
   @Nullable
   private bwv g;

   csu(bxe<? extends csu> $$0, djz $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwv $$0) {
      if ($$0 != null) {
         this.c = $$0.cG();
         this.d = $$0;
      }
   }

   @Nullable
   @Override
   public bwv q() {
      if (this.d != null && !this.d.dQ()) {
         return this.d;
      } else if (this.c != null) {
         this.d = this.b(this.c);
         return this.d;
      } else {
         return null;
      }
   }

   @Nullable
   protected bwv b(UUID $$0) {
      return this.dV() instanceof aru $$1 ? $$1.b($$0) : null;
   }

   public bwv z() {
      return (bwv)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(ua $$0) {
      $$0.b("Owner", ka.a, this.c);
      if (this.e) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.f);
   }

   protected boolean e(bwv $$0) {
      return $$0.cG().equals(this.c);
   }

   @Override
   protected void a(ua $$0) {
      this.c($$0.<UUID>a("Owner", ka.a).orElse(null));
      this.e = $$0.b("LeftOwner", false);
      this.f = $$0.b("HasBeenShot", false);
   }

   protected void c(@Nullable UUID $$0) {
      if (!Objects.equals(this.c, $$0)) {
         this.c = $$0;
         this.d = $$0 != null ? this.b($$0) : null;
      }
   }

   @Override
   public void x(bwv $$0) {
      super.x($$0);
      if ($$0 instanceof csu $$1) {
         this.c = $$1.c;
         this.d = $$1.d;
      }
   }

   @Override
   public void h() {
      if (!this.f) {
         this.a(egg.K, this.q());
         this.f = true;
      }

      if (!this.e) {
         this.e = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwv $$0 = this.q();
      if ($$0 != null) {
         ffn $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bxc.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public ffs d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ffs($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ffs $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azq.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azq.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bwv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azq.a($$2 * (float) (Math.PI / 180.0)) * azq.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azq.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azq.b($$2 * (float) (Math.PI / 180.0)) * azq.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ffs $$9 = $$0.ae();
      this.i(this.dy().b($$9.d, $$0.aH() ? 0.0 : $$9.e, $$9.f));
   }

   @Override
   public void a(boolean $$0, iw $$1) {
      double $$2 = $$0 ? -0.03 : 0.1;
      this.i(this.dy().b(0.0, $$2, 0.0));
      a(this.dV(), $$1);
   }

   @Override
   public void l(boolean $$0) {
      double $$1 = $$0 ? -0.03 : 0.06;
      this.i(this.dy().b(0.0, $$1, 0.0));
      this.k();
   }

   public static <T extends csu> T a(csu.a<T> $$0, aru $$1, daa $$2, bxw $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends csu> T a(csu.a<T> $$0, aru $$1, daa $$2, bxw $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends csu> T a(T $$0, aru $$1, daa $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends csu> T a(T $$0, aru $$1, daa $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends csu> T a(T $$0, aru $$1, daa $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(aru $$0, daa $$1) {
      dgp.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof csh $$2) {
         daa $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dgp.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected csv b(ffq $$0) {
      if ($$0.d() == ffq.a.c) {
         ffp $$1 = (ffp)$$0;
         bwv $$2 = $$1.a();
         csv $$3 = $$2.a(this);
         if ($$3 != csv.a) {
            if ($$2 != this.g && this.a($$3, $$2, this.q(), false)) {
               this.g = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof ffo $$4 && $$4.f()) {
         csv $$5 = csv.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return csv.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(csv $$0, @Nullable bwv $$1, @Nullable bwv $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwv $$0, boolean $$1) {
   }

   protected void b(czw $$0) {
   }

   protected void a(ffq $$0) {
      ffq.a $$1 = $$0.d();
      if ($$1 == ffq.a.c) {
         ffp $$2 = (ffp)$$0;
         bwv $$3 = $$2.a();
         if ($$3.an().a(axj.H) && $$3 instanceof csu $$4) {
            $$4.a(csv.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(egg.J, $$0.g(), egg.a.a(this, null));
      } else if ($$1 == ffq.a.b) {
         ffo $$5 = (ffo)$$0;
         this.a($$5);
         iw $$6 = $$5.b();
         this.dV().a(egg.J, $$6, egg.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(ffp $$0) {
   }

   protected void a(ffo $$0) {
      ebg $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bwv $$0) {
      if (!$$0.bE()) {
         return false;
      } else {
         bwv $$1 = this.q();
         return $$1 == null || this.e || !$$1.z($$0);
      }
   }

   protected void A() {
      ffs $$0 = this.dy();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(azq.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(azq.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azq.h(0.2F, $$0, $$1);
   }

   @Override
   public zj<aby> a(ars $$0) {
      bwv $$1 = this.q();
      return new abz(this, $$0, $$1 == null ? 0 : $$1.ao());
   }

   @Override
   public void a(abz $$0) {
      super.a($$0);
      bwv $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(aru $$0, iw $$1) {
      bwv $$2 = this.q();
      return $$2 instanceof crz ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(djv.d);
   }

   public boolean a(aru $$0) {
      return this.an().a(axj.g) && $$0.O().c(djv.h);
   }

   @Override
   public boolean bF() {
      return this.an().a(axj.H);
   }

   @Override
   public float bR() {
      return this.bF() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bxw $$0, bvk $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bW() {
      return 2;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends csu> {
      T create(aru var1, bxw var2, daa var3);
   }
}
