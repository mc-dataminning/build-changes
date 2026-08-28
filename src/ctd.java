import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class ctd extends bxe implements bzd {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private UUID c;
   @Nullable
   private bxe d;
   private boolean e = false;
   private boolean f = false;
   @Nullable
   private bxe g;

   ctd(bxn<? extends ctd> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bxe $$0) {
      if ($$0 != null) {
         this.c = $$0.cG();
         this.d = $$0;
      }
   }

   @Nullable
   @Override
   public bxe p() {
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
   protected bxe b(UUID $$0) {
      return this.dV() instanceof asb $$1 ? $$1.b($$0) : null;
   }

   public bxe y() {
      return (bxe)MoreObjects.firstNonNull(this.p(), this);
   }

   @Override
   protected void b(ua $$0) {
      $$0.b("Owner", ka.a, this.c);
      if (this.e) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.f);
   }

   protected boolean e(bxe $$0) {
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
   public void x(bxe $$0) {
      super.x($$0);
      if ($$0 instanceof ctd $$1) {
         this.c = $$1.c;
         this.d = $$1.d;
      }
   }

   @Override
   public void g() {
      if (!this.f) {
         this.a(egq.K, this.p());
         this.f = true;
      }

      if (!this.e) {
         this.e = this.f();
      }

      super.g();
   }

   private boolean f() {
      bxe $$0 = this.p();
      if ($$0 != null) {
         ffx $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bxl.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fgc d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fgc($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fgc $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azz.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azz.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bxe $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azz.a($$2 * (float) (Math.PI / 180.0)) * azz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azz.b($$2 * (float) (Math.PI / 180.0)) * azz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fgc $$9 = $$0.ad();
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
      this.j();
   }

   public static <T extends ctd> T a(ctd.a<T> $$0, asb $$1, dak $$2, byf $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends ctd> T a(ctd.a<T> $$0, asb $$1, dak $$2, byf $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends ctd> T a(T $$0, asb $$1, dak $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends ctd> T a(T $$0, asb $$1, dak $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends ctd> T a(T $$0, asb $$1, dak $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(asb $$0, dak $$1) {
      dgz.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof csq $$2) {
         dak $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dgz.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cte b(fga $$0) {
      if ($$0.d() == fga.a.c) {
         ffz $$1 = (ffz)$$0;
         bxe $$2 = $$1.a();
         cte $$3 = $$2.a(this);
         if ($$3 != cte.a) {
            if ($$2 != this.g && this.a($$3, $$2, this.p(), false)) {
               this.g = $$2;
            }

            return $$3;
         }
      } else if (this.w() && $$0 instanceof ffy $$4 && $$4.f()) {
         cte $$5 = cte.b;
         if (this.a($$5, null, this.p(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cte.a;
   }

   protected boolean w() {
      return false;
   }

   public boolean a(cte $$0, @Nullable bxe $$1, @Nullable bxe $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bxe $$0, boolean $$1) {
   }

   protected void b(dag $$0) {
   }

   protected void a(fga $$0) {
      fga.a $$1 = $$0.d();
      if ($$1 == fga.a.c) {
         ffz $$2 = (ffz)$$0;
         bxe $$3 = $$2.a();
         if ($$3.an().a(axq.H) && $$3 instanceof ctd $$4) {
            $$4.a(cte.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dV().a(egq.J, $$0.g(), egq.a.a(this, null));
      } else if ($$1 == fga.a.b) {
         ffy $$5 = (ffy)$$0;
         this.a($$5);
         iw $$6 = $$5.b();
         this.dV().a(egq.J, $$6, egq.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(ffz $$0) {
   }

   protected void a(ffy $$0) {
      ebq $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bxe $$0) {
      if (!$$0.bE()) {
         return false;
      } else {
         bxe $$1 = this.p();
         return $$1 == null || this.e || !$$1.z($$0);
      }
   }

   protected void z() {
      fgc $$0 = this.dy();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(azz.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(azz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azz.h(0.2F, $$0, $$1);
   }

   @Override
   public zo<acf> a(arz $$0) {
      bxe $$1 = this.p();
      return new acg(this, $$0, $$1 == null ? 0 : $$1.ao());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      bxe $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(asb $$0, iw $$1) {
      bxe $$2 = this.p();
      return $$2 instanceof csi ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(dkf.d);
   }

   public boolean a(asb $$0) {
      return this.an().a(axq.g) && $$0.O().c(dkf.h);
   }

   @Override
   public boolean bF() {
      return this.an().a(axq.H);
   }

   @Override
   public float bR() {
      return this.bF() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(byf $$0, bvt $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bW() {
      return 2;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends ctd> {
      T create(asb var1, byf var2, dak var3);
   }
}
