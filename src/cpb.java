import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpb extends btz implements bvu {
   @Nullable
   private UUID b;
   @Nullable
   private btz c;
   private boolean d;
   private boolean e;
   @Nullable
   private btz f;

   cpb(bug<? extends cpb> $$0, dev $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable btz $$0) {
      if ($$0 != null) {
         this.b = $$0.cH();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public btz s() {
      if (this.c != null && !this.c.dS()) {
         return this.c;
      } else if (this.b != null) {
         this.c = this.b(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   @Nullable
   protected btz b(UUID $$0) {
      return this.dX() instanceof arm $$1 ? $$1.a($$0) : null;
   }

   public btz F() {
      return (btz)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(uj $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(btz $$0) {
      return $$0.cH().equals(this.b);
   }

   @Override
   protected void a(uj $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void x(btz $$0) {
      super.x($$0);
      if ($$0 instanceof cpb $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(eaa.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.o();
      }

      super.l();
   }

   private boolean o() {
      btz $$0 = this.s();
      if ($$0 != null) {
         ezc $$1 = this.cS().b(this.dA()).g(1.0);
         return $$0.dh().dc().filter(bue.h).noneMatch($$1x -> $$1.c($$1x.cS()));
      } else {
         return true;
      }
   }

   public ezh d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ezh($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ezh $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.as = true;
      double $$6 = $$5.i();
      this.v((float)(azj.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azj.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dN();
      this.P = this.dP();
   }

   public void a(btz $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azj.a($$2 * (float) (Math.PI / 180.0)) * azj.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azj.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azj.b($$2 * (float) (Math.PI / 180.0)) * azj.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ezh $$9 = $$0.ai();
      this.h(this.dA().b($$9.d, $$0.aJ() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpb> T a(cpb.a<T> $$0, arm $$1, cvx $$2, buv $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dP(), $$3.dN(), $$4, $$5, $$6));
   }

   public static <T extends cpb> T a(cpb.a<T> $$0, arm $$1, cvx $$2, buv $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpb> T a(T $$0, arm $$1, cvx $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpb> T a(T $$0, arm $$1, cvx $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpb> T a(T $$0, arm $$1, cvx $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.a($$1, $$2);
      return $$0;
   }

   public void a(arm $$0, cvx $$1) {
      dbo.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cop $$2) {
         cvx $$3 = $$2.eb();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dbo.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cpc b(ezf $$0) {
      if ($$0.d() == ezf.a.c) {
         eze $$1 = (eze)$$0;
         btz $$2 = $$1.a();
         cpc $$3 = $$2.a(this);
         if ($$3 != cpc.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      } else if (this.D() && $$0 instanceof ezd $$4 && $$4.f()) {
         cpc $$5 = cpc.b;
         if (this.a($$5, null, this.s(), false)) {
            this.h(this.dA().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cpc.a;
   }

   protected boolean D() {
      return false;
   }

   public boolean a(cpc $$0, @Nullable btz $$1, @Nullable btz $$2, boolean $$3) {
      if (!this.dX().C) {
         $$0.deflect(this, $$1, this.af);
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable btz $$0, boolean $$1) {
   }

   protected void b(cvt $$0) {
   }

   protected void a(ezf $$0) {
      ezf.a $$1 = $$0.d();
      if ($$1 == ezf.a.c) {
         eze $$2 = (eze)$$0;
         btz $$3 = $$2.a();
         if ($$3.aq().a(axd.H) && $$3 instanceof cpb $$4) {
            $$4.a(cpc.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dX().a(eaa.J, $$0.g(), eaa.a.a(this, null));
      } else if ($$1 == ezf.a.b) {
         ezd $$5 = (ezd)$$0;
         this.a($$5);
         jg $$6 = $$5.b();
         this.dX().a(eaa.J, $$6, eaa.a.a(this, this.dX().a_($$6)));
      }
   }

   protected void a(eze $$0) {
   }

   protected void a(ezd $$0) {
      dvd $$1 = this.dX().a_($$0.b());
      $$1.a(this.dX(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azj.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azj.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dP();
         this.O = this.dN();
         this.b(this.dC(), this.dE(), this.dI(), this.dN(), this.dP());
      }
   }

   protected boolean b(btz $$0) {
      if (!$$0.bH()) {
         return false;
      } else {
         btz $$1 = this.s();
         return $$1 == null || this.d || !$$1.z($$0);
      }
   }

   protected void G() {
      ezh $$0 = this.dA();
      double $$1 = $$0.i();
      this.w(e(this.P, (float)(azj.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.O, (float)(azj.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azj.h(0.2F, $$0, $$1);
   }

   @Override
   public zo<acd> a(arl $$0) {
      btz $$1 = this.s();
      return new ace(this, $$0, $$1 == null ? 0 : $$1.ar());
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      btz $$1 = this.dX().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dev $$0, jg $$1) {
      btz $$2 = this.s();
      return $$2 instanceof coh ? $$2.a($$0, $$1) : $$2 == null || $$0.ac().b(der.c);
   }

   public boolean b(dev $$0) {
      return this.aq().a(axd.g) && $$0.ac().b(der.g);
   }

   @Override
   public boolean bI() {
      return this.aq().a(axd.H);
   }

   @Override
   public float bT() {
      return this.bI() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(buv $$0, bsp $$1) {
      double $$2 = this.dA().d;
      double $$3 = this.dA().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bY() {
      return 2;
   }

   @FunctionalInterface
   public interface a<T extends cpb> {
      T create(arm var1, buv var2, cvx var3);
   }
}
