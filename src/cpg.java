import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class cpg extends bue implements bvz {
   @Nullable
   private UUID b;
   @Nullable
   private bue c;
   private boolean d;
   private boolean e;
   @Nullable
   private bue f;

   cpg(bul<? extends cpg> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public void c(@Nullable bue $$0) {
      if ($$0 != null) {
         this.b = $$0.cH();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bue s() {
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
   protected bue b(UUID $$0) {
      return this.dX() instanceof arn $$1 ? $$1.a($$0) : null;
   }

   public bue E() {
      return (bue)MoreObjects.firstNonNull(this.s(), this);
   }

   @Override
   protected void b(uk $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean e(bue $$0) {
      return $$0.cH().equals(this.b);
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.b("Owner")) {
         this.c($$0.a("Owner"));
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   protected void c(UUID $$0) {
      if (this.b != $$0) {
         this.b = $$0;
         this.c = this.b($$0);
      }
   }

   @Override
   public void x(bue $$0) {
      super.x($$0);
      if ($$0 instanceof cpg $$1) {
         this.b = $$1.b;
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(eag.K, this.s());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.o();
      }

      super.l();
   }

   private boolean o() {
      bue $$0 = this.s();
      if ($$0 != null) {
         ezi $$1 = this.cS().b(this.dA()).g(1.0);
         return $$0.dh().dc().filter(buj.h).noneMatch($$1x -> $$1.c($$1x.cS()));
      } else {
         return true;
      }
   }

   public ezn d(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return new ezn($$0, $$1, $$2)
         .d()
         .b(this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4), this.af.a(0.0, 0.0172275 * (double)$$4))
         .c((double)$$3);
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ezn $$5 = this.d($$0, $$1, $$2, $$3, $$4);
      this.h($$5);
      this.as = true;
      double $$6 = $$5.i();
      this.v((float)(azk.d($$5.d, $$5.f) * 180.0F / (float)Math.PI));
      this.w((float)(azk.d($$5.e, $$6) * 180.0F / (float)Math.PI));
      this.O = this.dN();
      this.P = this.dP();
   }

   public void a(bue $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -azk.a($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -azk.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = azk.b($$2 * (float) (Math.PI / 180.0)) * azk.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ezn $$9 = $$0.ai();
      this.h(this.dA().b($$9.d, $$0.aK() ? 0.0 : $$9.e, $$9.f));
   }

   public static <T extends cpg> T a(cpg.a<T> $$0, arn $$1, cwb $$2, bva $$3, float $$4, float $$5, float $$6) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$4x -> $$4x.a($$3, $$3.dP(), $$3.dN(), $$4, $$5, $$6));
   }

   public static <T extends cpg> T a(cpg.a<T> $$0, arn $$1, cwb $$2, bva $$3, double $$4, double $$5, double $$6, float $$7, float $$8) {
      return a($$0.create($$1, $$3, $$2), $$1, $$2, $$5x -> $$5x.c($$4, $$5, $$6, $$7, $$8));
   }

   public static <T extends cpg> T a(T $$0, arn $$1, cwb $$2, double $$3, double $$4, double $$5, float $$6, float $$7) {
      return a($$0, $$1, $$2, $$6x -> $$0.c($$3, $$4, $$5, $$6, $$7));
   }

   public static <T extends cpg> T a(T $$0, arn $$1, cwb $$2) {
      return a($$0, $$1, $$2, $$0x -> {
      });
   }

   public static <T extends cpg> T a(T $$0, arn $$1, cwb $$2, Consumer<T> $$3) {
      $$3.accept($$0);
      $$1.b($$0);
      $$0.a($$1, $$2);
      return $$0;
   }

   public void a(arn $$0, cwb $$1) {
      dbu.a($$0, $$1, this, $$0x -> {
      });
      if (this instanceof cou $$2) {
         cwb $$3 = $$2.eb();
         if ($$3 != null && !$$3.f() && !$$1.h().equals($$3.h())) {
            dbu.a($$0, $$3, this, $$2::b);
         }
      }
   }

   protected cph b(ezl $$0) {
      if ($$0.d() == ezl.a.c) {
         ezk $$1 = (ezk)$$0;
         bue $$2 = $$1.a();
         cph $$3 = $$2.a(this);
         if ($$3 != cph.a) {
            if ($$2 != this.f && this.a($$3, $$2, this.s(), false)) {
               this.f = $$2;
            }

            return $$3;
         }
      } else if (this.C() && $$0 instanceof ezj $$4 && $$4.f()) {
         cph $$5 = cph.b;
         if (this.a($$5, null, this.s(), false)) {
            this.h(this.dA().c(0.2));
            return $$5;
         }
      }

      this.a($$0);
      return cph.a;
   }

   protected boolean C() {
      return false;
   }

   public boolean a(cph $$0, @Nullable bue $$1, @Nullable bue $$2, boolean $$3) {
      $$0.deflect(this, $$1, this.af);
      if (!this.dX().C) {
         this.c($$2);
         this.b($$1, $$3);
      }

      return true;
   }

   protected void b(@Nullable bue $$0, boolean $$1) {
   }

   protected void b(cvx $$0) {
   }

   protected void a(ezl $$0) {
      ezl.a $$1 = $$0.d();
      if ($$1 == ezl.a.c) {
         ezk $$2 = (ezk)$$0;
         bue $$3 = $$2.a();
         if ($$3.ar().a(axe.H) && $$3 instanceof cpg $$4) {
            $$4.a(cph.c, this.s(), this.s(), true);
         }

         this.a($$2);
         this.dX().a(eag.J, $$0.g(), eag.a.a(this, null));
      } else if ($$1 == ezl.a.b) {
         ezj $$5 = (ezj)$$0;
         this.a($$5);
         jh $$6 = $$5.b();
         this.dX().a(eag.J, $$6, eag.a.a(this, this.dX().a_($$6)));
      }
   }

   protected void a(ezk $$0) {
   }

   protected void a(ezj $$0) {
      dvj $$1 = this.dX().a_($$0.b());
      $$1.a(this.dX(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azk.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.v((float)(azk.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.P = this.dP();
         this.O = this.dN();
         this.b(this.dC(), this.dE(), this.dI(), this.dN(), this.dP());
      }
   }

   protected boolean b(bue $$0) {
      if (!$$0.bH()) {
         return false;
      } else {
         bue $$1 = this.s();
         return $$1 == null || this.d || !$$1.z($$0);
      }
   }

   protected void F() {
      ezn $$0 = this.dA();
      double $$1 = $$0.i();
      this.w(e(this.P, (float)(azk.d($$0.e, $$1) * 180.0F / (float)Math.PI)));
      this.v(e(this.O, (float)(azk.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
   }

   protected static float e(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return azk.h(0.2F, $$0, $$1);
   }

   @Override
   public zp<ace> a(arm $$0) {
      bue $$1 = this.s();
      return new acf(this, $$0, $$1 == null ? 0 : $$1.as());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      bue $$1 = this.dX().a($$0.p());
      if ($$1 != null) {
         this.c($$1);
      }
   }

   @Override
   public boolean a(dfb $$0, jh $$1) {
      bue $$2 = this.s();
      return $$2 instanceof com ? $$2.a($$0, $$1) : $$2 == null || $$0.ac().b(dex.c);
   }

   public boolean b(dfb $$0) {
      return this.ar().a(axe.g) && $$0.ac().b(dex.g);
   }

   @Override
   public boolean bI() {
      return this.ar().a(axe.H);
   }

   @Override
   public float bT() {
      return this.bI() ? 1.0F : 0.0F;
   }

   public DoubleDoubleImmutablePair a_(bva $$0, bsu $$1) {
      double $$2 = this.dA().d;
      double $$3 = this.dA().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }

   @Override
   public int bY() {
      return 2;
   }

   @FunctionalInterface
   public interface a<T extends cpg> {
      T create(arn var1, bva var2, cwb var3);
   }
}
