import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cqk extends bva implements bwx {
   @Nullable
   private UUID a;
   @Nullable
   private bva b;
   private boolean c;
   private boolean d;
   @Nullable
   private bva e;

   cqk(bvi<? extends cqk> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bva $$0) {
      if ($$0 != null) {
         this.a = $$0.cF();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bva q() {
      if (this.b != null && !this.b.dP()) {
         return this.b;
      } else if (this.a != null) {
         this.b = this.b(this.a);
         return this.b;
      } else {
         return null;
      }
   }

   @Nullable
   protected bva b(UUID $$0) {
      return this.dU() instanceof ard $$1 ? $$1.b($$0) : null;
   }

   public bva z() {
      return (bva)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tq $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bva $$0) {
      return $$0.cF().equals(this.a);
   }

   @Override
   protected void a(tq $$0) {
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
   public void x(bva $$0) {
      super.x($$0);
      if ($$0 instanceof cqk $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ecp.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bva $$0 = this.q();
      if ($$0 != null) {
         fbs $$1 = this.cQ().b(this.dx()).g(1.0);
         return $$0.de().cZ().filter(bvg.h).noneMatch($$1x -> $$1.c($$1x.cQ()));
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
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(ayz.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(ayz.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dK();
      this.O = this.dM();
   }

   public void a(bva $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayz.a($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayz.b($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fbx $$9 = $$0.ah();
      this.i(this.dx().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cqk> T a(cqk.a<T> $$0, ard $$1, cxh $$2, bvy $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dM(), $$3.dK(), $$4, $$5, $$6));
   }

   public static <T extends cqk> T a(cqk.a<T> $$0, ard $$1, cxh $$2, bvy $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cqk> T a(T $$0, ard $$1, cxh $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cqk> T a(T $$0, ard $$1, cxh $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cqk> T a(T $$0, ard $$1, cxh $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(ard $$0, cxh $$1) {
      ddt.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpy $$2) {
         cxh $$3 = $$2.dY();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            ddt.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cql b(fbv $$0) {
      if ($$0.d() == fbv.a.c) {
         fbu $$1 = (fbu)$$0;
         bva $$2 = $$1.a();
         cql $$3 = $$2.a(this);
         if ($$3 != cql.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fbt $$4 && $$4.f()) {
         cql $$5 = cql.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dx().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cql.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(cql $$0, @Nullable bva $$1, @Nullable bva $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dU().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bva $$0, boolean $$1) {
   }

   protected void b(cxd $$0) {
   }

   protected void a(fbv $$0) {
      fbv.a $$1 = $$0.d();
      if ($$1 == fbv.a.c) {
         fbu $$2 = (fbu)$$0;
         bva $$3 = $$2.a();
         if ($$3.aq().a(awt.H) && $$3 instanceof cqk $$4) {
            $$4.a(cql.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dU().a(ecp.J, $$0.g(), ecp.a.a(this, null));
      } else if ($$1 == fbv.a.b) {
         fbt $$5 = (fbt)$$0;
         this.a($$5);
         ji $$6 = $$5.b();
         this.dU().a(ecp.J, $$6, ecp.a.a(this, this.dU().a_($$6)));
      }
   }

   protected void a(fbu $$0) {
   }

   protected void a(fbt $$0) {
      dxq $$1 = this.dU().a_($$0.b());
      $$1.a(this.dU(), $$1, $$0, this);
   }

   protected boolean b(bva $$0) {
      if (!$$0.bE()) {
         return false;
      } else {
         bva $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      fbx $$0 = this.dx();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(ayz.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(ayz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayz.h(0.2F, $$0, $$1);
   }

   @Override
   public yw<abl> a(arb $$0) {
      bva $$1 = this.q();
      return new abm(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      bva $$1 = this.dU().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(ard $$0, ji $$1) {
      bva $$2 = this.q();
      return $$2 instanceof cpr ? $$2.c($$0, $$1) : $$2 == null || $$0.O().b(dgv.c);
   }

   public boolean a(ard $$0) {
      return this.aq().a(awt.g) && $$0.O().b(dgv.g);
   }

   @Override
   public boolean bF() {
      return this.aq().a(awt.H);
   }

   @Override
   public float bR() {
      return this.bF() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bvy $$0, btp $$1) {
      double $$2 = this.dx().d;
      double $$3 = this.dx().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bW() {
      return 2;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (!this.d($$1)) {
         this.bB();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cqk> {
      T create(ard var1, bvy var2, cxh var3);
   }
}
