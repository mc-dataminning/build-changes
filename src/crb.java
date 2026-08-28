import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class crb extends bvs implements bxp {
   @Nullable
   private UUID a;
   @Nullable
   private bvs b;
   private boolean c;
   private boolean d;
   @Nullable
   private bvs e;

   crb(bwb<? extends crb> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bvs $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bvs q() {
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
   protected bvs b(UUID $$0) {
      return this.dV() instanceof arn $$1 ? $$1.b($$0) : null;
   }

   public bvs z() {
      return (bvs)MoreObjects.firstNonNull(this.q(), this);
   }

   @Override
   protected void b(tw $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bvs $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(tw $$0) {
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
   public void x(bvs $$0) {
      super.x($$0);
      if ($$0 instanceof crb $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(edm.K, this.q());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.g();
      }

      super.h();
   }

   private boolean g() {
      bvs $$0 = this.q();
      if ($$0 != null) {
         fcp $$1 = this.cR().b(this.dy()).g(1.0);
         return $$0.df().da().filter(bvz.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fcu d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fcu($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fcu $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.i($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.w((float)(azk.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.x((float)(azk.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dL();
      this.O = this.dN();
   }

   public void a(bvs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azk.a($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azk.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azk.b($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fcu $$9 = $$0.ah();
      this.i(this.dy().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends crb> T a(crb.a<T> $$0, arn $$1, cxy $$2, bwr $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dN(), $$3.dL(), $$4, $$5, $$6));
   }

   public static <T extends crb> T a(crb.a<T> $$0, arn $$1, cxy $$2, bwr $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends crb> T a(T $$0, arn $$1, cxy $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends crb> T a(T $$0, arn $$1, cxy $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends crb> T a(T $$0, arn $$1, cxy $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arn $$0, cxy $$1) {
      dej.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cqp $$2) {
         cxy $$3 = $$2.dZ();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dej.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected crc b(fcs $$0) {
      if ($$0.d() == fcs.a.c) {
         fcr $$1 = (fcr)$$0;
         bvs $$2 = $$1.a();
         crc $$3 = $$2.a(this);
         if ($$3 != crc.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.q(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.x() && $$0 instanceof fcq $$4 && $$4.f()) {
         crc $$5 = crc.b;
         if (this.a($$5, null, this.q(), false)) {
            this.i(this.dy().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return crc.a;
   }

   protected boolean x() {
      return false;
   }

   public boolean a(crc $$0, @Nullable bvs $$1, @Nullable bvs $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dV().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bvs $$0, boolean $$1) {
   }

   protected void b(cxu $$0) {
   }

   protected void a(fcs $$0) {
      fcs.a $$1 = $$0.d();
      if ($$1 == fcs.a.c) {
         fcr $$2 = (fcr)$$0;
         bvs $$3 = $$2.a();
         if ($$3.aq().a(axd.H) && $$3 instanceof crb $$4) {
            $$4.a(crc.c, this.q(), this.q(), true);
         }

         this.a($$2);
         this.dV().a(edm.J, $$0.g(), edm.a.a(this, null));
      } else if ($$1 == fcs.a.b) {
         fcq $$5 = (fcq)$$0;
         this.a($$5);
         jj $$6 = $$5.b();
         this.dV().a(edm.J, $$6, edm.a.a(this, this.dV().a_($$6)));
      }
   }

   protected void a(fcr $$0) {
   }

   protected void a(fcq $$0) {
      dym $$1 = this.dV().a_($$0.b());
      $$1.a(this.dV(), $$1, $$0, this);
   }

   protected boolean b(bvs $$0) {
      if (!$$0.bF()) {
         return false;
      } else {
         bvs $$1 = this.q();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void A() {
      fcu $$0 = this.dy();
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
   public zc<abr> a(arl $$0) {
      bvs $$1 = this.q();
      return new abs(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      bvs $$1 = this.dV().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean c(arn $$0, jj $$1) {
      bvs $$2 = this.q();
      return $$2 instanceof cqi ? $$2.c($$0, $$1) : $$2 == null || $$0.O().c(dhl.c);
   }

   public boolean a(arn $$0) {
      return this.aq().a(axd.g) && $$0.O().c(dhl.g);
   }

   @Override
   public boolean bG() {
      return this.aq().a(axd.H);
   }

   @Override
   public float bS() {
      return this.bG() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bwr $$0, buh $$1) {
      double $$2 = this.dy().d;
      double $$3 = this.dy().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (!this.d($$1)) {
         this.bC();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends crb> {
      T create(arn var1, bwr var2, cxy var3);
   }
}
