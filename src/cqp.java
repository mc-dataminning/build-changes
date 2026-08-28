import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cqp extends bvj implements bxe {
   @Nullable
   private UUID a;
   @Nullable
   private bvj b;
   private boolean c;
   private boolean d;
   @Nullable
   private bvj e;

   cqp(bvq<? extends cqp> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bvj $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bvj p() {
      if (this.b != null && !this.b.dR()) {
         return this.b;
      } else if (this.a != null) {
         this.b = this.b(this.a);
         return this.b;
      } else {
         return null;
      }
   }

   @Nullable
   protected bvj b(UUID $$0) {
      return this.dW() instanceof ash $$1 ? $$1.a($$0) : null;
   }

   public bvj D() {
      return (bvj)MoreObjects.firstNonNull(this.p(), this);
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

   protected boolean e(bvj $$0) {
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
   public void x(bvj $$0) {
      super.x($$0);
      if ($$0 instanceof cqp $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ecq.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.m();
      }

      super.h();
   }

   private boolean m() {
      bvj $$0 = this.p();
      if ($$0 != null) {
         fbs $$1 = this.cR().b(this.dz()).g(1.0);
         return $$0.dg().db().filter(bvo.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fbx d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fbx($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fbx $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(bae.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(bae.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dM();
      this.O = this.dO();
   }

   public void a(bvj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -bae.a($$2 * (float) (Math.PI / 180.0)) * bae.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -bae.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = bae.b($$2 * (float) (Math.PI / 180.0)) * bae.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fbx $$9 = $$0.ah();
      this.h(this.dz().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cqp> T a(cqp.a<T> $$0, ash $$1, cxo $$2, bwf $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dO(), $$3.dM(), $$4, $$5, $$6));
   }

   public static <T extends cqp> T a(cqp.a<T> $$0, ash $$1, cxo $$2, bwf $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cqp> T a(T $$0, ash $$1, cxo $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cqp> T a(T $$0, ash $$1, cxo $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cqp> T a(T $$0, ash $$1, cxo $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(ash $$0, cxo $$1) {
      dea.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cqd $$2) {
         cxo $$3 = $$2.ea();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dea.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cqq b(fbv $$0) {
      if ($$0.d() == fbv.a.c) {
         fbu $$1 = (fbu)$$0;
         bvj $$2 = $$1.a();
         cqq $$3 = $$2.a(this);
         if ($$3 != cqq.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.B() && $$0 instanceof fbt $$4 && $$4.f()) {
         cqq $$5 = cqq.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dz().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cqq.a;
   }

   protected boolean B() {
      return false;
   }

   public boolean a(cqq $$0, @Nullable bvj $$1, @Nullable bvj $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dW().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bvj $$0, boolean $$1) {
   }

   protected void b(cxk $$0) {
   }

   protected void a(fbv $$0) {
      fbv.a $$1 = $$0.d();
      if ($$1 == fbv.a.c) {
         fbu $$2 = (fbu)$$0;
         bvj $$3 = $$2.a();
         if ($$3.aq().a(axy.H) && $$3 instanceof cqp $$4) {
            $$4.a(cqq.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dW().a(ecq.J, $$0.g(), ecq.a.a(this, null));
      } else if ($$1 == fbv.a.b) {
         fbt $$5 = (fbt)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dW().a(ecq.J, $$6, ecq.a.a(this, this.dW().a_($$6)));
      }
   }

   protected void a(fbu $$0) {
   }

   protected void a(fbt $$0) {
      dxu $$1 = this.dW().a_($$0.b());
      $$1.a(this.dW(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(bae.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(bae.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dO();
         this.N = this.dM();
         this.b(this.dB(), this.dD(), this.dH(), this.dM(), this.dO());
      }
   }

   protected boolean b(bvj $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         bvj $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   @Override
   protected void E() {
      fbx $$0 = this.dz();
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
      bvj $$1 = this.p();
      return new acs(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      bvj $$1 = this.dW().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(ash $$0, jh $$1) {
      bvj $$2 = this.p();
      return $$2 instanceof cpw ? $$2.c($$0, $$1) : $$2 == null || $$0.N().b(dhd.c);
   }

   public boolean a(ash $$0) {
      return this.aq().a(axy.g) && $$0.N().b(dhd.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(axy.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bwf $$0, btz $$1) {
      double $$2 = this.dz().d;
      double $$3 = this.dz().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cqp> {
      T create(ash var1, bwf var2, cxo var3);
   }
}
