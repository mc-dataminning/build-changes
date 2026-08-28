import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class crx extends bwf implements byc {
   @Nullable
   private UUID a;
   @Nullable
   private bwf b;
   private boolean c;
   private boolean d;
   @Nullable
   private bwf e;

   crx(bwo<? extends crx> $$0, dja $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwf $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bwf q() {
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
   protected bwf b(UUID $$0) {
      return this.dV() instanceof arq $$1 ? $$1.b($$0) : null;
   }

   public bwf z() {
      return (bwf)MoreObjects.firstNonNull(this.q(), this);
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

   protected boolean e(bwf $$0) {
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
   public void x(bwf $$0) {
      super.x($$0);
      if ($$0 instanceof crx $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(efh.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwf $$0 = this.q();
      if ($$0 != null) {
         fel $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bwm.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public feq d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new feq($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      feq $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azm.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azm.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bwf $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azm.a($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azm.b($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      feq $$9 = $$0.ah();
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

   public static <T extends crx> T a(crx.a<T> $$0, arq $$1, czd $$2, bxe $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends crx> T a(crx.a<T> $$0, arq $$1, czd $$2, bxe $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends crx> T a(T $$0, arq $$1, czd $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends crx> T a(T $$0, arq $$1, czd $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends crx> T a(T $$0, arq $$1, czd $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arq $$0, czd $$1) {
      dfs.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof crk $$2) {
         czd $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dfs.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cry b(feo $$0) {
      if ($$0.d() == feo.a.c) {
         fen $$1 = (fen)$$0;
         bwf $$2 = $$1.a();
         cry $$3 = $$2.a(this);
         if ($$3 != cry.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fem $$4 && $$4.f()) {
         cry $$5 = cry.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cry.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(cry $$0, @Nullable bwf $$1, @Nullable bwf $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwf $$0, boolean $$1) {
   }

   protected void b(cyz $$0) {
   }

   protected void a(feo $$0) {
      feo.a $$1 = $$0.d();
      if ($$1 == feo.a.c) {
         fen $$2 = (fen)$$0;
         bwf $$3 = $$2.a();
         if ($$3.aq().a(axf.H) && $$3 instanceof crx $$4) {
            $$4.a(cry.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(efh.J, $$0.g(), efh.a.a(this, null));
      } else if ($$1 == feo.a.b) {
         fem $$5 = (fem)$$0;
         this.a($$5);
         iu $$6 = $$5.b();
         this.dV().a(efh.J, $$6, efh.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(fen $$0) {
   }

   protected void a(fem $$0) {
      eah $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bwf $$0) {
      if (!$$0.bF()) {
         return false;
      } else {
         bwf $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      feq $$0 = this.dy();
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
      bwf $$1 = this.q();
      return new abv(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      bwf $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(arq $$0, iu $$1) {
      bwf $$2 = this.q();
      return $$2 instanceof crc ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(diw.d);
   }

   public boolean a(arq $$0) {
      return this.aq().a(axf.g) && $$0.O().c(diw.h);
   }

   @Override
   public boolean bG() {
      return this.aq().a(axf.H);
   }

   @Override
   public float bS() {
      return this.bG() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bxe $$0, buu $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends crx> {
      T create(arq var1, bxe var2, czd var3);
   }
}
