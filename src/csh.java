import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class csh extends bwi implements byh {
   @Nullable
   private UUID a;
   @Nullable
   private bwi b;
   private boolean c;
   private boolean d;
   @Nullable
   private bwi e;

   csh(bwr<? extends csh> $$0, djm $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwi $$0) {
      if ($$0 != null) {
         this.a = $$0.cF();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bwi q() {
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
   protected bwi b(UUID $$0) {
      return this.dU() instanceof arq $$1 ? $$1.b($$0) : null;
   }

   public bwi z() {
      return (bwi)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tz $$0) {
      $$0.b("Owner", jz.a, this.a);
      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bwi $$0) {
      return $$0.cF().equals(this.a);
   }

   @Override
   protected void a(tz $$0) {
      this.c($$0.<UUID>a("Owner", jz.a).orElse(null));
      this.c = $$0.o("LeftOwner");
      this.d = $$0.o("HasBeenShot");
   }

   protected void c(@Nullable UUID $$0) {
      if (!Objects.equals(this.a, $$0)) {
         this.a = $$0;
         this.b = $$0 != null ? this.b($$0) : null;
      }
   }

   @Override
   public void x(bwi $$0) {
      super.x($$0);
      if ($$0 instanceof csh $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(eft.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwi $$0 = this.q();
      if ($$0 != null) {
         fex $$1 = this.cQ().b(this.dx()).g(1.0);
         return $$0.de().cZ().filter(bwp.h).noneMatch($$1x -> $$1.c($$1x.cQ()));
      } else {
         return true;
      }
   }

   public ffc d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ffc($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ffc $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azm.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azm.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dK();
      this.O = this.dM();
   }

   public void a(bwi $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azm.a($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azm.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azm.b($$2 * (float) (Math.PI / 180.0)) * azm.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ffc $$9 = $$0.ae();
      this.i(this.dx().b($$9.d, $$0.aH() ? 0.0 : $$9.e, $$9.f));
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      double $$2 = $$0 ? -0.03 : 0.1;
      this.i(this.dx().b(0.0, $$2, 0.0));
      a(this.dU(), $$1);
   }

   @Override
   public void l(boolean $$0) {
      double $$1 = $$0 ? -0.03 : 0.06;
      this.i(this.dx().b(0.0, $$1, 0.0));
      this.k();
   }

   public static <T extends csh> T a(csh.a<T> $$0, arq $$1, czn $$2, bxj $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dM(), $$3.dK(), $$4, $$5, $$6));
   }

   public static <T extends csh> T a(csh.a<T> $$0, arq $$1, czn $$2, bxj $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends csh> T a(T $$0, arq $$1, czn $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends csh> T a(T $$0, arq $$1, czn $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends csh> T a(T $$0, arq $$1, czn $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arq $$0, czn $$1) {
      dgc.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cru $$2) {
         czn $$3 = $$2.dY();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dgc.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected csi b(ffa $$0) {
      if ($$0.d() == ffa.a.c) {
         fez $$1 = (fez)$$0;
         bwi $$2 = $$1.a();
         csi $$3 = $$2.a(this);
         if ($$3 != csi.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fey $$4 && $$4.f()) {
         csi $$5 = csi.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dx().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return csi.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(csi $$0, @Nullable bwi $$1, @Nullable bwi $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dU().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwi $$0, boolean $$1) {
   }

   protected void b(czj $$0) {
   }

   protected void a(ffa $$0) {
      ffa.a $$1 = $$0.d();
      if ($$1 == ffa.a.c) {
         fez $$2 = (fez)$$0;
         bwi $$3 = $$2.a();
         if ($$3.an().a(axf.H) && $$3 instanceof csh $$4) {
            $$4.a(csi.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dU().a(eft.J, $$0.g(), eft.a.a(this, null));
      } else if ($$1 == ffa.a.b) {
         fey $$5 = (fey)$$0;
         this.a($$5);
         iv $$6 = $$5.b();
         this.dU().a(eft.J, $$6, eft.a.a(this, this.dU().a_($$6)));
      }
   }

   protected void a(fez $$0) {
   }

   protected void a(fey $$0) {
      eat $$1 = this.dU().a_($$0.b());
      $$1.a(this.dU(), $$1, $$0, this);
   }

   protected boolean b(bwi $$0) {
      if (!$$0.bD()) {
         return false;
      } else {
         bwi $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      ffc $$0 = this.dx();
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
      bwi $$1 = this.q();
      return new abv(this, $$0, $$1 == null ? 0 : $$1.ao());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      bwi $$1 = this.dU().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(arq $$0, iv $$1) {
      bwi $$2 = this.q();
      return $$2 instanceof crm ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(dji.d);
   }

   public boolean a(arq $$0) {
      return this.an().a(axf.g) && $$0.O().c(dji.h);
   }

   @Override
   public boolean bE() {
      return this.an().a(axf.H);
   }

   @Override
   public float bQ() {
      return this.bE() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bxj $$0, bux $$1) {
      double $$2 = this.dx().d;
      double $$3 = this.dx().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bV() {
      return 2;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (!this.d($$1)) {
         this.bA();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends csh> {
      T create(arq var1, bxj var2, czn var3);
   }
}
