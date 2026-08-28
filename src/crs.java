import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class crs extends bwd implements bya {
   @Nullable
   private UUID a;
   @Nullable
   private bwd b;
   private boolean c;
   private boolean d;
   @Nullable
   private bwd e;

   crs(bwm<? extends crs> $$0, div $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwd $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bwd q() {
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
   protected bwd b(UUID $$0) {
      return this.dV() instanceof arq $$1 ? $$1.b($$0) : null;
   }

   public bwd z() {
      return (bwd)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tz $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bwd $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(tz $$0) {
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
   public void x(bwd $$0) {
      super.x($$0);
      if ($$0 instanceof crs $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(eez.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwd $$0 = this.q();
      if ($$0 != null) {
         fed $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bwk.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fei d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fei($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fei $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azm.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azm.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bwd $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azm.a($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azm.b($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fei $$9 = $$0.ah();
      this.i(this.dy().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   @Override
   public void a(boolean $$0, iu $$1) {
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

   public static <T extends crs> T a(crs.a<T> $$0, arq $$1, cyy $$2, bxc $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends crs> T a(crs.a<T> $$0, arq $$1, cyy $$2, bxc $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends crs> T a(T $$0, arq $$1, cyy $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends crs> T a(T $$0, arq $$1, cyy $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends crs> T a(T $$0, arq $$1, cyy $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arq $$0, cyy $$1) {
      dfn.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof crf $$2) {
         cyy $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dfn.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected crt b(feg $$0) {
      if ($$0.d() == feg.a.c) {
         fef $$1 = (fef)$$0;
         bwd $$2 = $$1.a();
         crt $$3 = $$2.a(this);
         if ($$3 != crt.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fee $$4 && $$4.f()) {
         crt $$5 = crt.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return crt.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(crt $$0, @Nullable bwd $$1, @Nullable bwd $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwd $$0, boolean $$1) {
   }

   protected void b(cyu $$0) {
   }

   protected void a(feg $$0) {
      feg.a $$1 = $$0.d();
      if ($$1 == feg.a.c) {
         fef $$2 = (fef)$$0;
         bwd $$3 = $$2.a();
         if ($$3.aq().a(axf.H) && $$3 instanceof crs $$4) {
            $$4.a(crt.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(eez.J, $$0.g(), eez.a.a(this, null));
      } else if ($$1 == feg.a.b) {
         fee $$5 = (fee)$$0;
         this.a($$5);
         iu $$6 = $$5.b();
         this.dV().a(eez.J, $$6, eez.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(fef $$0) {
   }

   protected void a(fee $$0) {
      dzz $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bwd $$0) {
      if (!$$0.bF()) {
         return false;
      } else {
         bwd $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      fei $$0 = this.dy();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(azm.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(azm.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azm.h(0.2F, $$0, $$1);
   }

   @Override
   public zf<abu> a(aro $$0) {
      bwd $$1 = this.q();
      return new abv(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      bwd $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(arq $$0, iu $$1) {
      bwd $$2 = this.q();
      return $$2 instanceof cqy ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(dir.c);
   }

   public boolean a(arq $$0) {
      return this.aq().a(axf.g) && $$0.O().c(dir.g);
   }

   @Override
   public boolean bG() {
      return this.aq().a(axf.H);
   }

   @Override
   public float bS() {
      return this.bG() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bxc $$0, bus $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends crs> {
      T create(arq var1, bxc var2, cyy var3);
   }
}
