import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cql extends bvf implements bxa {
   @Nullable
   private UUID a;
   @Nullable
   private bvf b;
   private boolean c;
   private boolean d;
   @Nullable
   private bvf e;

   cql(bvm<? extends cql> $$0, dha $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bvf $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bvf p() {
      if (this.b != null && !this.b.dQ()) {
         return this.b;
      } else if (this.a != null) {
         this.b = this.b(this.a);
         return this.b;
      } else {
         return null;
      }
   }

   @Nullable
   protected bvf b(UUID $$0) {
      return this.dV() instanceof ash $$1 ? $$1.a($$0) : null;
   }

   public bvf D() {
      return (bvf)MoreObjects.firstNonNull(this.p(), this);
   }

   @Override
   protected void b(ux $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bvf $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(ux $$0) {
      if ($$0.b("Owner")) {
         this.c($$0.a("Owner"));
      }

      this.c = $$0.q("LeftOwner");
      this.d = $$0.q("HasBeenShot");
   }

   protected void c(UUID $$0) {
      if (this.a != $$0) {
         this.a = $$0;
         this.b = this.b($$0);
      }
   }

   @Override
   public void x(bvf $$0) {
      super.x($$0);
      if ($$0 instanceof cql $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ecj.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.m();
      }

      super.h();
   }

   private boolean m() {
      bvf $$0 = this.p();
      if ($$0 != null) {
         fbn $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.dg().db().filter(bvk.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fbs d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fbs($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fbs $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(bae.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(bae.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bvf $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -bae.a($$2 * (float) (Math.PI / 180.0)) * bae.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -bae.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = bae.b($$2 * (float) (Math.PI / 180.0)) * bae.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fbs $$9 = $$0.ah();
      this.h(this.dy().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cql> T a(cql.a<T> $$0, ash $$1, cxk $$2, bwb $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends cql> T a(cql.a<T> $$0, ash $$1, cxk $$2, bwb $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cql> T a(T $$0, ash $$1, cxk $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cql> T a(T $$0, ash $$1, cxk $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cql> T a(T $$0, ash $$1, cxk $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(ash $$0, cxk $$1) {
      ddt.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpz $$2) {
         cxk $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            ddt.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cqm b(fbq $$0) {
      if ($$0.d() == fbq.a.c) {
         fbp $$1 = (fbp)$$0;
         bvf $$2 = $$1.a();
         cqm $$3 = $$2.a(this);
         if ($$3 != cqm.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.B() && $$0 instanceof fbo $$4 && $$4.f()) {
         cqm $$5 = cqm.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cqm.a;
   }

   protected boolean B() {
      return false;
   }

   public boolean a(cqm $$0, @Nullable bvf $$1, @Nullable bvf $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bvf $$0, boolean $$1) {
   }

   protected void b(cxg $$0) {
   }

   protected void a(fbq $$0) {
      fbq.a $$1 = $$0.d();
      if ($$1 == fbq.a.c) {
         fbp $$2 = (fbp)$$0;
         bvf $$3 = $$2.a();
         if ($$3.aq().a(axy.H) && $$3 instanceof cql $$4) {
            $$4.a(cqm.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dV().a(ecj.J, $$0.g(), ecj.a.a(this, null));
      } else if ($$1 == fbq.a.b) {
         fbo $$5 = (fbo)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dV().a(ecj.J, $$6, ecj.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(fbp $$0) {
   }

   protected void a(fbo $$0) {
      dxn $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(bae.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(bae.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.N = this.dL();
         this.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN());
      }
   }

   protected boolean b(bvf $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         bvf $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   @Override
   protected void E() {
      fbs $$0 = this.dy();
      double $$1 = $$0.i();
      this.w(f(this.O, (float)(bae.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(f(this.N, (float)(bae.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return bae.h(0.2F, $$0, $$1);
   }

   @Override
   public aac<acr> a(asf $$0) {
      bvf $$1 = this.p();
      return new acs(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      bvf $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(ash $$0, jh $$1) {
      bvf $$2 = this.p();
      return $$2 instanceof cps ? $$2.c($$0, $$1) : $$2 == null || $$0.N().b(dgw.c);
   }

   public boolean a(ash $$0) {
      return this.aq().a(axy.g) && $$0.N().b(dgw.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(axy.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bwb $$0, btv $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cql> {
      T create(ash var1, bwb var2, cxk var3);
   }
}
