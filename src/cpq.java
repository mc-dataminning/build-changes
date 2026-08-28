import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpq extends buk implements bwf {
   @Nullable
   private UUID a;
   @Nullable
   private buk b;
   private boolean c;
   private boolean d;
   @Nullable
   private buk e;

   cpq(bur<? extends cpq> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable buk $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public buk p() {
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
   protected buk b(UUID $$0) {
      return this.dW() instanceof arc $$1 ? $$1.a($$0) : null;
   }

   public buk E() {
      return (buk)MoreObjects.firstNonNull(this.p(), this);
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

   protected boolean e(buk $$0) {
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
   public void x(buk $$0) {
      super.x($$0);
      if ($$0 instanceof cpq $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(ebt.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.m();
      }

      super.h();
   }

   private boolean m() {
      buk $$0 = this.p();
      if ($$0 != null) {
         fav $$1 = this.cR().b(this.dz()).g(1.0);
         return $$0.dg().db().filter(bup.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fba d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fba($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fba $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(ayz.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(ayz.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dM();
      this.O = this.dO();
   }

   public void a(buk $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ayz.a($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ayz.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ayz.b($$2 * (float) (Math.PI / 180.0)) * ayz.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fba $$9 = $$0.ah();
      this.h(this.dz().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpq> T a(cpq.a<T> $$0, arc $$1, cwp $$2, bvg $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dO(), $$3.dM(), $$4, $$5, $$6));
   }

   public static <T extends cpq> T a(cpq.a<T> $$0, arc $$1, cwp $$2, bvg $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpq> T a(T $$0, arc $$1, cwp $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpq> T a(T $$0, arc $$1, cwp $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpq> T a(T $$0, arc $$1, cwp $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arc $$0, cwp $$1) {
      ddb.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpe $$2) {
         cwp $$3 = $$2.ea();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            ddb.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cpr b(fay $$0) {
      if ($$0.d() == fay.a.c) {
         fax $$1 = (fax)$$0;
         buk $$2 = $$1.a();
         cpr $$3 = $$2.a(this);
         if ($$3 != cpr.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.C() && $$0 instanceof faw $$4 && $$4.f()) {
         cpr $$5 = cpr.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dz().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cpr.a;
   }

   protected boolean C() {
      return false;
   }

   public boolean a(cpr $$0, @Nullable buk $$1, @Nullable buk $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dW().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable buk $$0, boolean $$1) {
   }

   protected void b(cwl $$0) {
   }

   protected void a(fay $$0) {
      fay.a $$1 = $$0.d();
      if ($$1 == fay.a.c) {
         fax $$2 = (fax)$$0;
         buk $$3 = $$2.a();
         if ($$3.aq().a(awt.H) && $$3 instanceof cpq $$4) {
            $$4.a(cpr.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dW().a(ebt.J, $$0.g(), ebt.a.a(this, null));
      } else if ($$1 == fay.a.b) {
         faw $$5 = (faw)$$0;
         this.a($$5);
         ji $$6 = $$5.b();
         this.dW().a(ebt.J, $$6, ebt.a.a(this, this.dW().a_($$6)));
      }
   }

   protected void a(fax $$0) {
   }

   protected void a(faw $$0) {
      dwx $$1 = this.dW().a_($$0.b());
      $$1.a(this.dW(), $$1, $$0, this);
   }

   protected boolean b(buk $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         buk $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void F() {
      fba $$0 = this.dz();
      double $$1 = $$0.i();
      this.w(f(this.O, (float)(ayz.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(f(this.N, (float)(ayz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
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
   public yv<abk> a(ara $$0) {
      buk $$1 = this.p();
      return new abl(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      fba $$1 = new fba($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
      buk $$2 = this.dW().a($$0.p());
      if ($$2 != null) {
         this.c($$2);
      }
   }

   @Override
   public boolean c(arc $$0, ji $$1) {
      buk $$2 = this.p();
      return $$2 instanceof cox ? $$2.c($$0, $$1) : $$2 == null || $$0.O().b(dge.c);
   }

   public boolean a(arc $$0) {
      return this.aq().a(awt.g) && $$0.O().b(dge.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(awt.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bvg $$0, bta $$1) {
      double $$2 = this.dz().d;
      double $$3 = this.dz().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cpq> {
      T create(arc var1, bvg var2, cwp var3);
   }
}
