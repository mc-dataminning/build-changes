import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpo extends buj implements bwe {
   @Nullable
   private UUID a;
   @Nullable
   private buj b;
   private boolean c;
   private boolean d;
   @Nullable
   private buj e;

   cpo(buq<? extends cpo> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable buj $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public buj p() {
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
   protected buj b(UUID $$0) {
      return this.dW() instanceof arc $$1 ? $$1.a($$0) : null;
   }

   public buj E() {
      return (buj)MoreObjects.firstNonNull(this.p(), this);
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

   protected boolean e(buj $$0) {
      return $$0.cG().equals(this.a);
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
   public void x(buj $$0) {
      super.x($$0);
      if ($$0 instanceof cpo $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ebr.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.m();
      }

      super.h();
   }

   private boolean m() {
      buj $$0 = this.p();
      if ($$0 != null) {
         fat $$1 = this.cR().b(this.dz()).g(1.0);
         return $$0.dg().db().filter(buo.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fay d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fay($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fay $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(ayy.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(ayy.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dM();
      this.O = this.dO();
   }

   public void a(buj $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayy.a($$2 * (float) (Math.PI / 180.0)) * ayy.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayy.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayy.b($$2 * (float) (Math.PI / 180.0)) * ayy.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fay $$9 = $$0.ah();
      this.h(this.dz().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpo> T a(cpo.a<T> $$0, arc $$1, cwn $$2, bvf $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dO(), $$3.dM(), $$4, $$5, $$6));
   }

   public static <T extends cpo> T a(cpo.a<T> $$0, arc $$1, cwn $$2, bvf $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpo> T a(T $$0, arc $$1, cwn $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpo> T a(T $$0, arc $$1, cwn $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpo> T a(T $$0, arc $$1, cwn $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arc $$0, cwn $$1) {
      dcz.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpc $$2) {
         cwn $$3 = $$2.ea();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dcz.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cpp b(faw $$0) {
      if ($$0.d() == faw.a.c) {
         fav $$1 = (fav)$$0;
         buj $$2 = $$1.a();
         cpp $$3 = $$2.a(this);
         if ($$3 != cpp.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.C() && $$0 instanceof fau $$4 && $$4.f()) {
         cpp $$5 = cpp.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dz().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cpp.a;
   }

   protected boolean C() {
      return false;
   }

   public boolean a(cpp $$0, @Nullable buj $$1, @Nullable buj $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dW().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable buj $$0, boolean $$1) {
   }

   protected void b(cwj $$0) {
   }

   protected void a(faw $$0) {
      faw.a $$1 = $$0.d();
      if ($$1 == faw.a.c) {
         fav $$2 = (fav)$$0;
         buj $$3 = $$2.a();
         if ($$3.aq().a(aws.H) && $$3 instanceof cpo $$4) {
            $$4.a(cpp.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dW().a(ebr.J, $$0.g(), ebr.a.a(this, null));
      } else if ($$1 == faw.a.b) {
         fau $$5 = (fau)$$0;
         this.a($$5);
         ji $$6 = $$5.b();
         this.dW().a(ebr.J, $$6, ebr.a.a(this, this.dW().a_($$6)));
      }
   }

   protected void a(fav $$0) {
   }

   protected void a(fau $$0) {
      dwv $$1 = this.dW().a_($$0.b());
      $$1.a(this.dW(), $$1, $$0, this);
   }

   protected boolean b(buj $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         buj $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void F() {
      fay $$0 = this.dz();
      double $$1 = $$0.i();
      this.w(f(this.O, (float)(ayy.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(f(this.N, (float)(ayy.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ayy.h(0.2F, $$0, $$1);
   }

   @Override
   public yv<abk> a(ara $$0) {
      buj $$1 = this.p();
      return new abl(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      fay $$1 = new fay($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
      buj $$2 = this.dW().a($$0.p());
      if ($$2 != null) {
         this.c($$2);
      }
   }

   @Override
   public boolean c(arc $$0, ji $$1) {
      buj $$2 = this.p();
      return $$2 instanceof cov ? $$2.c($$0, $$1) : $$2 == null || $$0.O().b(dgc.c);
   }

   public boolean a(arc $$0) {
      return this.aq().a(aws.g) && $$0.O().b(dgc.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(aws.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bvf $$0, bsz $$1) {
      double $$2 = this.dz().d;
      double $$3 = this.dz().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cpo> {
      T create(arc var1, bvf var2, cwn var3);
   }
}
