import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cqh extends bvb implements bww {
   @Nullable
   private UUID a;
   @Nullable
   private bvb b;
   private boolean c;
   private boolean d;
   @Nullable
   private bvb e;

   cqh(bvi<? extends cqh> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bvb $$0) {
      if ($$0 != null) {
         this.a = $$0.cG();
         this.b = $$0;
      }
   }

   @Nullable
   @Override
   public bvb p() {
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
   protected bvb b(UUID $$0) {
      return this.dW() instanceof arx $$1 ? $$1.a($$0) : null;
   }

   public bvb E() {
      return (bvb)MoreObjects.firstNonNull(this.p(), this);
   }

   @Override
   protected void b(um $$0) {
      if (this.a != null) {
         $$0.a("Owner", this.a);
      }

      if (this.c) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.d);
   }

   protected boolean e(bvb $$0) {
      return $$0.cG().equals(this.a);
   }

   @Override
   protected void a(um $$0) {
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
   public void x(bvb $$0) {
      super.x($$0);
      if ($$0 instanceof cqh $$1) {
         this.a = $$1.a;
         this.b = $$1.b;
      }
   }

   @Override
   public void h() {
      if (!this.d) {
         this.a(eck.K, this.p());
         this.d = true;
      }

      if (!this.c) {
         this.c = this.m();
      }

      super.h();
   }

   private boolean m() {
      bvb $$0 = this.p();
      if ($$0 != null) {
         fbm $$1 = this.cR().b(this.dz()).g(1.0);
         return $$0.dg().db().filter(bvg.h).noneMatch($$1x -> $$1.c($$1x.cR()));
      } else {
         return true;
      }
   }

   public fbr d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new fbr($$0, $$1, $$2)
         .d()
         .b(this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4), this.ae.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      fbr $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.ar = true;
      double $$6 = $$5.i();
      this.v((float)(azu.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azu.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dM();
      this.O = this.dO();
   }

   public void a(bvb $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azu.a($$2 * (float) (Math.PI / 180.0)) * azu.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azu.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azu.b($$2 * (float) (Math.PI / 180.0)) * azu.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      fbr $$9 = $$0.ah();
      this.h(this.dz().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cqh> T a(cqh.a<T> $$0, arx $$1, cxg $$2, bvx $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dO(), $$3.dM(), $$4, $$5, $$6));
   }

   public static <T extends cqh> T a(cqh.a<T> $$0, arx $$1, cxg $$2, bvx $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cqh> T a(T $$0, arx $$1, cxg $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cqh> T a(T $$0, arx $$1, cxg $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cqh> T a(T $$0, arx $$1, cxg $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.b($$1, $$2);
      return $$0;
   }

   public void b(arx $$0, cxg $$1) {
      dds.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cpv $$2) {
         cxg $$3 = $$2.ea();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dds.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cqi b(fbp $$0) {
      if ($$0.d() == fbp.a.c) {
         fbo $$1 = (fbo)$$0;
         bvb $$2 = $$1.a();
         cqi $$3 = $$2.a(this);
         if ($$3 != cqi.a) {
            if ($$2 != this.e && this.a($$3, $$2, this.p(), false)) {
               this.e = $$2;
            }

            return $$3;
         }
      } else if (this.C() && $$0 instanceof fbn $$4 && $$4.f()) {
         cqi $$5 = cqi.b;
         if (this.a($$5, null, this.p(), false)) {
            this.h(this.dz().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cqi.a;
   }

   protected boolean C() {
      return false;
   }

   public boolean a(cqi $$0, @Nullable bvb $$1, @Nullable bvb $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.ae);
      if (!this.dW().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bvb $$0, boolean $$1) {
   }

   protected void b(cxc $$0) {
   }

   protected void a(fbp $$0) {
      fbp.a $$1 = $$0.d();
      if ($$1 == fbp.a.c) {
         fbo $$2 = (fbo)$$0;
         bvb $$3 = $$2.a();
         if ($$3.aq().a(axo.H) && $$3 instanceof cqh $$4) {
            $$4.a(cqi.c, this.p(), this.p(), true);
         }

         this.a($$2);
         this.dW().a(eck.J, $$0.g(), eck.a.a(this, null));
      } else if ($$1 == fbp.a.b) {
         fbn $$5 = (fbn)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dW().a(eck.J, $$6, eck.a.a(this, this.dW().a_($$6)));
      }
   }

   protected void a(fbo $$0) {
   }

   protected void a(fbn $$0) {
      dxo $$1 = this.dW().a_($$0.b());
      $$1.a(this.dW(), $$1, $$0, this);
   }

   protected boolean b(bvb $$0) {
      if (!$$0.bG()) {
         return false;
      } else {
         bvb $$1 = this.p();
         return $$1 == null || this.c || !$$1.z($$0);
      }
   }

   protected void F() {
      fbr $$0 = this.dz();
      double $$1 = $$0.i();
      this.w(f(this.O, (float)(azu.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(f(this.N, (float)(azu.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float f(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azu.h(0.2F, $$0, $$1);
   }

   @Override
   public zr<acg> a(arv $$0) {
      bvb $$1 = this.p();
      return new ach(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(ach $$0) {
      super.a($$0);
      fbr $$1 = new fbr($$0.j(), $$0.k(), $$0.l());
      this.h($$1);
      bvb $$2 = this.dW().a($$0.p());
      if ($$2 != null) {
         this.c($$2);
      }
   }

   @Override
   public boolean c(arx $$0, jh $$1) {
      bvb $$2 = this.p();
      return $$2 instanceof cpo ? $$2.c($$0, $$1) : $$2 == null || $$0.O().b(dgv.c);
   }

   public boolean a(arx $$0) {
      return this.aq().a(axo.g) && $$0.O().b(dgv.g);
   }

   @Override
   public boolean bH() {
      return this.aq().a(axo.H);
   }

   @Override
   public float bS() {
      return this.bH() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bvx $$0, btr $$1) {
      double $$2 = this.dz().d;
      double $$3 = this.dz().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bX() {
      return 2;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (!this.d($$1)) {
         this.bD();
      }

      return false;
   }

   @FunctionalInterface
   public interface a<T extends cqh> {
      T create(arx var1, bvx var2, cxg var3);
   }
}
