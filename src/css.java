import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class css extends bwt implements bys {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private UUID c;
   @Nullable
   private bwt d;
   private boolean e = false;
   private boolean f = false;
   @Nullable
   private bwt g;

   css(bxc<? extends css> $$0, djx $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwt $$0) {
      if ($$0 != null) {
         this.c = $$0.cG();
         this.d = $$0;
      }
   }

   @Nullable
   @Override
   public bwt q() {
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
   protected bwt b(UUID $$0) {
      return this.dV() instanceof ars $$1 ? $$1.b($$0) : null;
   }

   public bwt z() {
      return (bwt)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tz $$0) {
      $$0.b("Owner", jz.a, this.c);
      if (this.e) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.f);
   }

   protected boolean e(bwt $$0) {
      return $$0.cG().equals(this.c);
   }

   @Override
   protected void a(tz $$0) {
      this.c($$0.<UUID>a("Owner", jz.a).orElse(null));
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
   public void x(bwt $$0) {
      super.x($$0);
      if ($$0 instanceof css $$1) {
         this.c = $$1.c;
         this.d = $$1.d;
      }
   }

   @Override
   public void h() {
      if (!this.f) {
         this.a(ege.K, this.q());
         this.f = true;
      }

      if (!this.e) {
         this.e = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwt $$0 = this.q();
      if ($$0 != null) {
         ffl $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bxa.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public ffq d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ffq($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ffq $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azo.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azo.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bwt $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azo.a($$2 * (float) (Math.PI / 180.0)) * azo.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azo.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azo.b($$2 * (float) (Math.PI / 180.0)) * azo.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ffq $$9 = $$0.ae();
      this.i(this.dy().b($$9.d, $$0.aH() ? 0.0 : $$9.e, $$9.f));
   }

   @Override
   public void a(boolean $$0, iv $$1) {
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

   public static <T extends css> T a(css.a<T> $$0, ars $$1, czy $$2, bxu $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends css> T a(css.a<T> $$0, ars $$1, czy $$2, bxu $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends css> T a(T $$0, ars $$1, czy $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends css> T a(T $$0, ars $$1, czy $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends css> T a(T $$0, ars $$1, czy $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(ars $$0, czy $$1) {
      dgn.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof csf $$2) {
         czy $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dgn.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cst b(ffo $$0) {
      if ($$0.d() == ffo.a.c) {
         ffn $$1 = (ffn)$$0;
         bwt $$2 = $$1.a();
         cst $$3 = $$2.a(this);
         if ($$3 != cst.a) {
            if ($$2 != this.g && this.a($$3, $$2, this.q(), false)) {
               this.g = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof ffm $$4 && $$4.f()) {
         cst $$5 = cst.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cst.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(cst $$0, @Nullable bwt $$1, @Nullable bwt $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwt $$0, boolean $$1) {
   }

   protected void b(czu $$0) {
   }

   protected void a(ffo $$0) {
      ffo.a $$1 = $$0.d();
      if ($$1 == ffo.a.c) {
         ffn $$2 = (ffn)$$0;
         bwt $$3 = $$2.a();
         if ($$3.an().a(axh.H) && $$3 instanceof css $$4) {
            $$4.a(cst.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(ege.J, $$0.g(), ege.a.a(this, null));
      } else if ($$1 == ffo.a.b) {
         ffm $$5 = (ffm)$$0;
         this.a($$5);
         iv $$6 = $$5.b();
         this.dV().a(ege.J, $$6, ege.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(ffn $$0) {
   }

   protected void a(ffm $$0) {
      ebe $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bwt $$0) {
      if (!$$0.bE()) {
         return false;
      } else {
         bwt $$1 = this.q();
         return $$1 == null || this.e || !$$1.z($$0);
      }
   }

   protected void A() {
      ffq $$0 = this.dy();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(azo.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(azo.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azo.h(0.2F, $$0, $$1);
   }

   @Override
   public zh<abw> a(arq $$0) {
      bwt $$1 = this.q();
      return new abx(this, $$0, $$1 == null ? 0 : $$1.ao());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      bwt $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(ars $$0, iv $$1) {
      bwt $$2 = this.q();
      return $$2 instanceof crx ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(djt.d);
   }

   public boolean a(ars $$0) {
      return this.an().a(axh.g) && $$0.O().c(djt.h);
   }

   @Override
   public boolean bF() {
      return this.an().a(axh.H);
   }

   @Override
   public float bR() {
      return this.bF() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bxu $$0, bvi $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bW() {
      return 2;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends css> {
      T create(ars var1, bxu var2, czy var3);
   }
}
