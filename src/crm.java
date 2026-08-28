import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class crm extends bwa implements bxx {
   @Nullable
   private UUID a;
   @Nullable
   private bwa b;
   private boolean c;
   private boolean d;
   @Nullable
   private bwa e;

   crm(bwj<? extends crm> $$0, dip $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bwa $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bwa q() {
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
   protected bwa b(UUID $$0) {
      return this.dV() instanceof aro $$1 ? $$1.b($$0) : null;
   }

   public bwa z() {
      return (bwa)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tx $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bwa $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(tx $$0) {
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
   public void x(bwa $$0) {
      super.x($$0);
      if ($$0 instanceof crm $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(eeo.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bwa $$0 = this.q();
      if ($$0 != null) {
         fdr $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bwh.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fdw d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fdw($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fdw $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azk.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azk.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bwa $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azk.a($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azk.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azk.b($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fdw $$9 = $$0.ah();
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

   public static <T extends crm> T a(crm.a<T> $$0, aro $$1, cys $$2, bwz $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends crm> T a(crm.a<T> $$0, aro $$1, cys $$2, bwz $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends crm> T a(T $$0, aro $$1, cys $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends crm> T a(T $$0, aro $$1, cys $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends crm> T a(T $$0, aro $$1, cys $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(aro $$0, cys $$1) {
      dfh.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cqz $$2) {
         cys $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dfh.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected crn b(fdu $$0) {
      if ($$0.d() == fdu.a.c) {
         fdt $$1 = (fdt)$$0;
         bwa $$2 = $$1.a();
         crn $$3 = $$2.a(this);
         if ($$3 != crn.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fds $$4 && $$4.f()) {
         crn $$5 = crn.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return crn.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(crn $$0, @Nullable bwa $$1, @Nullable bwa $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.c($$1, $$3);
      }

      return true;
   }

   protected void c(@Nullable bwa $$0, boolean $$1) {
   }

   protected void b(cyo $$0) {
   }

   protected void a(fdu $$0) {
      fdu.a $$1 = $$0.d();
      if ($$1 == fdu.a.c) {
         fdt $$2 = (fdt)$$0;
         bwa $$3 = $$2.a();
         if ($$3.aq().a(axd.H) && $$3 instanceof crm $$4) {
            $$4.a(crn.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(eeo.J, $$0.g(), eeo.a.a(this, null));
      } else if ($$1 == fdu.a.b) {
         fds $$5 = (fds)$$0;
         this.a($$5);
         iu $$6 = $$5.b();
         this.dV().a(eeo.J, $$6, eeo.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(fdt $$0) {
   }

   protected void a(fds $$0) {
      dzo $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bwa $$0) {
      if (!$$0.bF()) {
         return false;
      } else {
         bwa $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      fdw $$0 = this.dy();
      double $$1 = $$0.i();
      this.x(f(this.O, (float)(azk.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.w(f(this.N, (float)(azk.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azk.h(0.2F, $$0, $$1);
   }

   @Override
   public zd<abs> a(arm $$0) {
      bwa $$1 = this.q();
      return new abt(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      bwa $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(aro $$0, iu $$1) {
      bwa $$2 = this.q();
      return $$2 instanceof cqs ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(dil.c);
   }

   public boolean a(aro $$0) {
      return this.aq().a(axd.g) && $$0.O().c(dil.g);
   }

   @Override
   public boolean bG() {
      return this.aq().a(axd.H);
   }

   @Override
   public float bS() {
      return this.bG() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bwz $$0, bup $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends crm> {
      T create(aro var1, bwz var2, cys var3);
   }
}
